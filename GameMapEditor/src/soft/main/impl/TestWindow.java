package soft.main.impl;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

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

		shlMapBuilder.open();
		shlMapBuilder.layout();
		while (!shlMapBuilder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
