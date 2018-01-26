package soft.main.impl;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
        } else if (source.getData()!=null && source.getData().equals("delete")){

        } else if (source.getData()!=null && source.getData().equals("delete2")) {

      }
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
