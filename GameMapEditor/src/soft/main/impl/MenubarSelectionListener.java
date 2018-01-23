package soft.main.impl;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.MenuItem;

public class MenubarSelectionListener implements SelectionListener {

	MapDrawer mapArea;

    public MenubarSelectionListener(MapDrawer map) {
  	  mapArea = map;
  }

	@Override
	public void widgetSelected(SelectionEvent e) {
		MenuItem source = (MenuItem) e.getSource();
        System.out.println(source.getData()+" was selected");
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

	}
}
