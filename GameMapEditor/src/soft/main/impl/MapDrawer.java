package soft.main.impl;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import soft.mapping.Cell;
import soft.mapping.Logs;
import soft.mapping.Map;
import soft.mapping.MappingFactory;

public class MapDrawer extends Canvas {

	Map myMap;
	int mode = SELECT;
	Color color = new Color(this.getDisplay(), 255, 255, 255);
	static int ADD_ASSET = 0;
	static int SELECT = 1;
	static int ERASE = 2;
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


            for(int x = 0; x < width; x++) {
            	  for(int y = 0; y < height; y++) {
            		  r = myMap.getCellFromCurrentLayer(x, y).getCellColor().getRed();
            		  g = myMap.getCellFromCurrentLayer(x, y).getCellColor().getGreen();
            		  b = myMap.getCellFromCurrentLayer(x, y).getCellColor().getBlue();
            		  if(x == 0 && y == 0)
            			  System.out.print(r + "," + g + "," + b);
            		  gc.setBackground(new Color(c.getDevice(), r, g, b));
            		  gc.fillRectangle(realw/width*x, realh/height*y, realw/width, realh/height);
            	  }
            }

			return true;

	}

}
