package soft.main.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.SWTResourceManager;

import soft.mapping.Map;
import soft.mapping.MappingFactory;

public class TestWindow {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {

		Display display = Display.getDefault();
		Shell shlMapBuilder = new Shell();
		shlMapBuilder.setBackground(SWTResourceManager.getColor(232, 232, 232));
		shlMapBuilder.setSize(450, 300);
		shlMapBuilder.setText("Map Builder");


		Menu menu = new Menu(shlMapBuilder, SWT.BAR);
		shlMapBuilder.setMenuBar(menu);

		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");

		Menu filecascade = new Menu(mntmFile);
		mntmFile.setMenu(filecascade);

		MenuItem newfile = new MenuItem(filecascade, SWT.NONE);
		newfile.setText("New File");


		MapDrawer mapArea = new MapDrawer(shlMapBuilder, SWT.NONE);
		mapArea.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		mapArea.setBounds(10, 10, 326, 258);
		Map map = MappingFactory.eINSTANCE.createMap();
		map.init(5, 6);
		mapArea.setMap(map);

		mapArea.addPaintListener(new PaintListener() {
	        public void paintControl(PaintEvent e) {
	            mapArea.drawMap(e.gc);
	        }
	    });

		mapArea.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ

			}

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO 自動生成されたメソッド・スタブ

				MapDrawer area = (MapDrawer) e.getSource();

				System.out.println(e.x+" "+e.y);
				System.out.println(area.getCellAt(e.x, e.y));
			}

		});

		ToolbarSelectionListener myListener = new ToolbarSelectionListener(mapArea);


		Composite tools = new Composite(shlMapBuilder, SWT.NONE);
		tools.setBounds(342, 10, 98, 129);

		ToolBar toolBar = new ToolBar(tools, SWT.WRAP | SWT.RIGHT);
		toolBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		toolBar.setBounds(0, 0, 98, 129);



		ToolItem tltmNewItem = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem.setWidth(2);
		tltmNewItem.setImage(SWTResourceManager.getImage("images/erase.jpeg"));
		tltmNewItem.addSelectionListener(myListener);

		ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_1.setWidth(2);
		tltmNewItem_1.setImage(SWTResourceManager.getImage("images/redo.jpeg"));
		tltmNewItem_1.addSelectionListener(myListener);

		ToolItem tltmNewItem_2 = new ToolItem(toolBar, SWT.NONE);
		tltmNewItem_2.setWidth(2);
		tltmNewItem_2.setImage(SWTResourceManager.getImage("images/undo.jpeg"));
		tltmNewItem_2.addSelectionListener(myListener);

		tltmNewItem_2.setData("update");

		ToolItem toolItem = new ToolItem(toolBar, SWT.NONE);
		toolItem.setWidth(2);
		toolItem.setImage(SWTResourceManager.getImage("images/erase.jpeg"));

		ToolItem toolItem_1 = new ToolItem(toolBar, SWT.NONE);
		toolItem_1.setWidth(2);
		toolItem_1.setImage(SWTResourceManager.getImage("images/erase.jpeg"));

		ToolItem toolItem_2 = new ToolItem(toolBar, SWT.NONE);
		toolItem_2.setWidth(2);
		toolItem_2.setImage(SWTResourceManager.getImage("images/erase.jpeg"));

		ToolItem toolItem_3 = new ToolItem(toolBar, SWT.NONE);
		toolItem_3.setWidth(2);
		toolItem_3.setImage(SWTResourceManager.getImage("images/erase.jpeg"));
		Composite assets = new Composite(shlMapBuilder, SWT.NONE);
		assets.setBounds(342, 145, 98, 123);

		shlMapBuilder.open();
		shlMapBuilder.layout();
		while (!shlMapBuilder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
