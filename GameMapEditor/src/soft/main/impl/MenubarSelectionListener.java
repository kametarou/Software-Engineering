package soft.main.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MenuItem;
import org.xml.sax.SAXException;

import soft.fileio.FileioFactory;
import soft.fileio.XmlReader;
import soft.fileio.XmlWriter;

public class MenubarSelectionListener implements SelectionListener {

	MapDrawer mapArea;

    public MenubarSelectionListener(MapDrawer map) {
  	  mapArea = map;
  }

	@Override
	public void widgetSelected(SelectionEvent e) {
		MenuItem source = (MenuItem) e.getSource();
        System.out.println(source.getData()+" was selected");

        if (source.getData()!=null && source.getData().equals("OpenFileMenu")) {

            FileDialog openDialog = new FileDialog(mapArea.getShell(),SWT.OPEN);
            String openFile = openDialog.open();
            if (openFile == null) return;
            File open = new File(openFile);

            if (open != null && open.exists() && open.canRead()) {
            	   XmlReader xmlReader = FileioFactory.eINSTANCE.createXmlReader();
            	  try {
					mapArea.myMap = (xmlReader.xml2map(openFile));
					mapArea.redraw();
				} catch (SAXException | IOException e1) {
					// TODO 自動生成された catch ブロック
					e1.printStackTrace();
				}
            }
         }
        else if (source.getData() != null  && source.getData().equals("SaveFileMenu")) {

        		FileDialog saveDialog = new FileDialog(mapArea.getShell(),SWT.SAVE);
        		String saveFile = saveDialog.open();
        		File save = new File (saveFile);

        		if (save != null && save.canWrite()) {
        			XmlWriter xmlWriter = FileioFactory.eINSTANCE.createXmlWriter();
        			xmlWriter.map2xml(saveFile, mapArea.myMap);
        		}
        }
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {

	}
}
