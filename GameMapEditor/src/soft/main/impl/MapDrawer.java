package soft.main.impl;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import soft.mapping.Cell;
import soft.mapping.Logs;
import soft.mapping.Map;
import soft.mapping.MappingFactory;

//import soft.main.impl.ConvertImage;

public class MapDrawer extends Canvas {

	Map myMap;
	int mode = SELECT;
	Color color = new Color(this.getDisplay(), 255, 255, 255);

	static int ADD_COLOR = 0;
	static int SELECT = 1;
	static int ERASE = 2;
	static int ADD_ASSET = 3;
	static int ADD_FLOWER_ASSET = 4;

	Logs myLogs = MappingFactory.eINSTANCE.createLogs();

	public MapDrawer(Composite parent, int style) {
		super(parent, style);

		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setMap(Map map) {
		myMap = map;
		myLogs.init(map);
	}

	public Map getMap() {
		return myMap;
	}

	public Cell getCellAt (int x, int y) {
		int width = myMap.getCells()[0].length;
        int height = myMap.getCells()[0][0].length;
        int realw = getClientArea().width;
        int realh = getClientArea().height;
        int realx = x*width/realw;
        int realy = y*height/realh;
        int layer = myMap.getCurrentLayer();
        if(realx >= width || realx < 0 || realy >= height || realy<0)
        	   return null;
        return myMap.getCells()[layer][realx][realy];
	}


	public boolean drawMap(GC gc) {

		int width = myMap.getCells()[0].length;
        int height = myMap.getCells()[0][0].length;
        int realw = getClientArea().width;
        int realh = getClientArea().height;
        System.out.println("Redrawing "+width+" "+height);

			Color c = gc.getForeground();
			gc.setForeground(new Color(c.getDevice(),255,255,255));
			int r,g,b;
			int rgb, r2, g2, b2;


            for(int x = 0; x < width; x++) {
            	  for(int y = 0; y < height; y++) {
            		  r = myMap.getCellFromCurrentLayer(x, y).getCellColor().getRed();
            		  g = myMap.getCellFromCurrentLayer(x, y).getCellColor().getGreen();
            		  b = myMap.getCellFromCurrentLayer(x, y).getCellColor().getBlue();
            		  if(x == 0 && y == 0)
            			  System.out.print(r + "," + g + "," + b);
            		  gc.setBackground(new Color(c.getDevice(), r, g, b));
            		  gc.fillRectangle(realw/width*x, realh/height*y, realw/width, realh/height);
            		  
            		  if (myMap.getCellFromCurrentLayer(x, y).getMyAsset() != null) {
            			  // TODO this method generate too many Image instance.
            			  //ImageData imgdate = new ImageData("images/flower.png");
            			  ImageData imgdate = soft.fileio.impl.MyImageReaderImpl.convertToSWT(myMap.getCellFromCurrentLayer(x, y).getMyAsset().getMyBufferedImage());
            			  if(imgdate!=null) {
            			  gc.drawImage(new org.eclipse.swt.graphics.Image(Display.getCurrent(), imgdate), 0, 0, 30, 30, realw/width*x, realh/height*y, realw/width, realh/height);
            			  } 
            			  /*BufferedImage bf = myMap.getCellFromCurrentLayer(x, y).getMyAsset().getMyBufferedImage();
            			   PaletteData paletteData = new PaletteData(colors);
            			   ImageData imgdate = new ImageData("images/flower.ping");
            			   rgb = bf.getRGB(x, y);
            			   r2 = (rgb >> 16) & 0x000000FF;
            			   g2 = (rgb >>8 ) & 0x000000FF;
            			   b2 = (rgb) & 0x000000FF;
            			   
            			   gc.setBackground(new Color(c.getDevice(), r2, g2, b2));
            			   gc.fillRectangle(realw/width*x, realh/height*y, realw/width, realh/height);*/
            			  /*ImageData imgdate = ConvertImage.convertToSWT(myMap.getCellFromCurrentLayer(x, y).getMyAsset().getMyBufferedImage());
            			  if (imgdate != null) {
            				  org.eclipse.swt.graphics.Image myimg = new org.eclipse.swt.graphics.Image(Display.getCurrent(), imgdate); 
      						gc.drawImage(myimg, 0, 0, 5, 5, realw/width*x, realh/height*y, realw/width, realh/height);
      						System.out.println("test");
						}*/
            			  
					}
            	  }
            }

			return true;

	}

}
