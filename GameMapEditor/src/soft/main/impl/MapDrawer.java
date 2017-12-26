package soft.main.impl;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import soft.mapping.Cell;
import soft.mapping.Map;

public class MapDrawer extends Canvas {

	Map myMap;

	public MapDrawer(Composite parent, int style) {
		super(parent, style);

		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setMap(Map map) {
		myMap = map;
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

            for(int x = 0; x < width; x++) {
            	  for(int y = 0; y < height; y++) {
            		  gc.drawRectangle(realw/width*x, realh/height*y, realw/width, realh/height);
            	  }
            }
            gc.setForeground(c);
			return true;

	}
}
