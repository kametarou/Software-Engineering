/**
 */
package soft.main.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soft.main.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MainFactoryImpl extends EFactoryImpl implements MainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MainFactory init() {
		try {
			MainFactory theMainFactory = (MainFactory)EPackage.Registry.INSTANCE.getEFactory(MainPackage.eNS_URI);
			if (theMainFactory != null) {
				return theMainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MainPackage.MY_GAME_MAP_EDITOR: return createMyGameMapEditor();
			case MainPackage.EDITOR: return createEditor();
			case MainPackage.WINDOW: return createWindow();
			case MainPackage.MY_MOUSE_MOTION_LISTENER: return createMyMouseMotionListener();
			case MainPackage.MY_KEYBOARD_LISTENER: return createMyKeyboardListener();
			case MainPackage.FILE: return createFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyGameMapEditor createMyGameMapEditor() {
		MyGameMapEditorImpl myGameMapEditor = new MyGameMapEditorImpl();
		return myGameMapEditor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyMouseMotionListener createMyMouseMotionListener() {
		MyMouseMotionListenerImpl myMouseMotionListener = new MyMouseMotionListenerImpl();
		return myMouseMotionListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyKeyboardListener createMyKeyboardListener() {
		MyKeyboardListenerImpl myKeyboardListener = new MyKeyboardListenerImpl();
		return myKeyboardListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainPackage getMainPackage() {
		return (MainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MainPackage getPackage() {
		return MainPackage.eINSTANCE;
	}

} //MainFactoryImpl
