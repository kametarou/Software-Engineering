package soft.main.impl;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.ToolItem;

public class ToolbarSelectionListener implements SelectionListener {

    MapDrawer mapArea;

    public ToolbarSelectionListener(MapDrawer map) {
    	  mapArea = map;
    }

	@Override
	public void widgetSelected(SelectionEvent e) {
		ToolItem source = (ToolItem) e.getSource();

        System.out.println(source.getData()+" was selected");
        if(source.getData()!=null && source.getData().equals("redo")) {
        	  mapArea.redraw();
        } else if (source.getData() != null && source.getData().equals("undo")) {

        } else if (source.getData()!=null && source.getData().equals("color")){
        	 ColorDialog dlg = new ColorDialog(mapArea.getShell());
        	 dlg.setRGB(mapArea.color.getRGB());

             // Change the title bar text
             dlg.setText("Choose a Color");

             // Open the dialog and retrieve the selected color
             RGB rgb = dlg.open();
             if (rgb != null) {
               // Dispose the old color, create the
               // new one, and set into the label
               mapArea.color.dispose();
               mapArea.color = new Color(mapArea.getDisplay(), rgb);
               //colorLabel.setBackground(color);
             }
        } else if (source.getData()!=null && source.getData().equals("delete")) {
        		mapArea.mode = MapDrawer.ERASE;
      }else if (source.getData()!=null && source.getData().equals("addasset")) {
         mapArea.mode = MapDrawer.ADD_ASSET;
      }
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
