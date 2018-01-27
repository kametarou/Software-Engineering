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

import soft.mapping.Cell;
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
		shlMapBuilder.setSize(600, 450);

		shlMapBuilder.setText("Map Builder");

		int mapW = 10;
		int mapH = 10;
		int cellL = 30;
		MapDrawer mapArea = new MapDrawer(shlMapBuilder, SWT.NONE);
		mapArea.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		mapArea.setBounds(10, 10, mapW*cellL, mapH*cellL);
		
		org.eclipse.swt.graphics.Color c = mapArea.getBackground();

		Map map = MappingFactory.eINSTANCE.createMap();
		map.init(mapW, mapH, c.getDevice());

		Cell myCell = map.getCellFromCurrentLayer(0, 0);
		myCell.setCellColor(new org.eclipse.swt.graphics.Color(map.getMydevice(),255,0,0));

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

		MenubarSelectionListener myMenuListener = new MenubarSelectionListener(mapArea);

		Menu menu = new Menu(shlMapBuilder, SWT.BAR);
		shlMapBuilder.setMenuBar(menu);

		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");

		Menu filecascade = new Menu(mntmFile);
		mntmFile.setMenu(filecascade);

		MenuItem newfile = new MenuItem(filecascade, SWT.NONE);
		newfile.setText("New File");
		newfile.addSelectionListener(myMenuListener);

		newfile.setData("NewFileMenu");

		MenuItem openfile = new MenuItem(filecascade, SWT.NONE);
		openfile.setText("Open File");
		openfile.addSelectionListener(myMenuListener);

		openfile.setData("OpenFileMenu");

		MenuItem savefile = new MenuItem(filecascade, SWT.NONE);
		savefile.setText("Save File");
		savefile.addSelectionListener(myMenuListener);

		savefile.setData("SaveFileMenu");

		MenuItem deletefile = new MenuItem(filecascade, SWT.NONE);
		deletefile.setText("Delete File");
		deletefile.addSelectionListener(myMenuListener);

		deletefile.setData("DeleteFileMenu");


		MenuItem importfile = new MenuItem(filecascade, SWT.NONE);
		importfile.setText("Import File");
		importfile.addSelectionListener(myMenuListener);

		importfile.setData("import")
		;
		MenuItem exportfile = new MenuItem(filecascade, SWT.NONE);
		exportfile.setText("Export File");
		exportfile.addSelectionListener(myMenuListener);

		exportfile.setData("export");
		ToolbarSelectionListener myListener = new ToolbarSelectionListener(mapArea);


		Composite tools = new Composite(shlMapBuilder, SWT.NONE);
		tools.setBounds(342, 10, 98, 129);

		ToolBar toolBar = new ToolBar(tools, SWT.WRAP | SWT.RIGHT);
		toolBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		toolBar.setBounds(0, 0, 98, 129);

				ToolItem deleteButton = new ToolItem(toolBar, SWT.NONE);
				deleteButton.setWidth(2);
				deleteButton.setImage(SWTResourceManager.getImage("images/erase.jpeg"));
				deleteButton.addSelectionListener(myListener);

				deleteButton.setData("delete");

		ToolItem undoButton = new ToolItem(toolBar, SWT.NONE);
		undoButton.setWidth(2);
		undoButton.setImage(SWTResourceManager.getImage("images/undo.jpeg"));
		undoButton.addSelectionListener(myListener);

		undoButton.setData("undo");

						ToolItem redoButton = new ToolItem(toolBar, SWT.NONE);
						redoButton.setWidth(2);
						redoButton.setImage(SWTResourceManager.getImage("images/redo.jpeg"));
						redoButton.addSelectionListener(myListener);

						redoButton.setData("redo");

		ToolItem delete2Button = new ToolItem(toolBar, SWT.NONE);
		delete2Button.setWidth(2);
		delete2Button.setImage(SWTResourceManager.getImage("images/erase.jpeg"));
		delete2Button.addSelectionListener(myListener);

		delete2Button.setData("delete2");

		ToolItem newFileButton = new ToolItem(toolBar, SWT.NONE);
		newFileButton.setWidth(2);
		newFileButton.setImage(SWTResourceManager.getImage("images/new_file.jpeg"));
		newFileButton.addSelectionListener(myListener);

		newFileButton.setData("newFile");

		ToolItem moveMoodButton = new ToolItem(toolBar, SWT.NONE);
		moveMoodButton.setWidth(2);
		moveMoodButton.setImage(SWTResourceManager.getImage("images/move.jpeg"));
		moveMoodButton.addSelectionListener(myListener);

		moveMoodButton.setData("moveMood");

		Composite assets = new Composite(shlMapBuilder, SWT.NONE);
		assets.setBounds(342, 145, 98, 123);

		ToolBar asset1 = new ToolBar(assets, SWT.WRAP | SWT.RIGHT);
		asset1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		asset1.setBounds(0, 0, 98, 123);

		shlMapBuilder.open();
		shlMapBuilder.layout();
		while (!shlMapBuilder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
