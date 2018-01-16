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
		// TODO 自動生成されたメソッド・スタブ
		ToolItem source = (ToolItem) e.getSource();
        System.out.println(source.getData()+" was selected");
        if(source.getData()!=null && source.getData().equals("update")) {
        	  mapArea.redraw();;
        } else if (source.getData()!=null && source.getData().equals("delete")){
        	  // set to delete mode
        }
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
