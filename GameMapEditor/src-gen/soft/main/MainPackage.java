/**
 */
package soft.main;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soft.main.MainFactory
 * @model kind="package"
 * @generated
 */
public interface MainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "main";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/Users/ysakanaka/HomeWork/SEClass/GameMapEditor/src/main";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "main";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MainPackage eINSTANCE = soft.main.impl.MainPackageImpl.init();

	/**
	 * The meta object id for the '{@link soft.main.impl.MyGameMapEditorImpl <em>My Game Map Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.MyGameMapEditorImpl
	 * @see soft.main.impl.MainPackageImpl#getMyGameMapEditor()
	 * @generated
	 */
	int MY_GAME_MAP_EDITOR = 0;

	/**
	 * The number of structural features of the '<em>My Game Map Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_GAME_MAP_EDITOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_GAME_MAP_EDITOR___MAIN = 0;

	/**
	 * The number of operations of the '<em>My Game Map Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_GAME_MAP_EDITOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link soft.main.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.EditorImpl
	 * @see soft.main.impl.MainPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 1;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soft.main.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.WindowImpl
	 * @see soft.main.impl.MainPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 2;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW___INIT = 0;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link java.awt.event.MouseMotionListener <em>Mouse Motion Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.event.MouseMotionListener
	 * @see soft.main.impl.MainPackageImpl#getMouseMotionListener()
	 * @generated
	 */
	int MOUSE_MOTION_LISTENER = 7;

	/**
	 * The number of structural features of the '<em>Mouse Motion Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOTION_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mouse Motion Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_MOTION_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soft.main.impl.MyMouseMotionListenerImpl <em>My Mouse Motion Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.MyMouseMotionListenerImpl
	 * @see soft.main.impl.MainPackageImpl#getMyMouseMotionListener()
	 * @generated
	 */
	int MY_MOUSE_MOTION_LISTENER = 3;

	/**
	 * The number of structural features of the '<em>My Mouse Motion Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MOUSE_MOTION_LISTENER_FEATURE_COUNT = MOUSE_MOTION_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Mouse Motion Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MOUSE_MOTION_LISTENER_OPERATION_COUNT = MOUSE_MOTION_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.awt.event.KeyListener <em>Key Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.event.KeyListener
	 * @see soft.main.impl.MainPackageImpl#getKeyListener()
	 * @generated
	 */
	int KEY_LISTENER = 8;

	/**
	 * The number of structural features of the '<em>Key Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Key Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soft.main.impl.MyKeyboardListenerImpl <em>My Keyboard Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.MyKeyboardListenerImpl
	 * @see soft.main.impl.MainPackageImpl#getMyKeyboardListener()
	 * @generated
	 */
	int MY_KEYBOARD_LISTENER = 4;

	/**
	 * The number of structural features of the '<em>My Keyboard Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_KEYBOARD_LISTENER_FEATURE_COUNT = KEY_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>My Keyboard Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_KEYBOARD_LISTENER_OPERATION_COUNT = KEY_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soft.main.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.main.impl.FileImpl
	 * @see soft.main.impl.MainPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make New File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MAKE_NEW_FILE = 0;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.Serializable
	 * @see soft.main.impl.MainPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 6;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link java.awt.event.MouseListener <em>Mouse Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.event.MouseListener
	 * @see soft.main.impl.MainPackageImpl#getMouseListener()
	 * @generated
	 */
	int MOUSE_LISTENER = 9;

	/**
	 * The number of structural features of the '<em>Mouse Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mouse Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOUSE_LISTENER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link soft.main.MyGameMapEditor <em>My Game Map Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Game Map Editor</em>'.
	 * @see soft.main.MyGameMapEditor
	 * @generated
	 */
	EClass getMyGameMapEditor();

	/**
	 * Returns the meta object for the '{@link soft.main.MyGameMapEditor#main() <em>Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Main</em>' operation.
	 * @see soft.main.MyGameMapEditor#main()
	 * @generated
	 */
	EOperation getMyGameMapEditor__Main();

	/**
	 * Returns the meta object for class '{@link soft.main.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see soft.main.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for class '{@link soft.main.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see soft.main.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the '{@link soft.main.Window#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.main.Window#init()
	 * @generated
	 */
	EOperation getWindow__Init();

	/**
	 * Returns the meta object for class '{@link soft.main.MyMouseMotionListener <em>My Mouse Motion Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Mouse Motion Listener</em>'.
	 * @see soft.main.MyMouseMotionListener
	 * @generated
	 */
	EClass getMyMouseMotionListener();

	/**
	 * Returns the meta object for class '{@link soft.main.MyKeyboardListener <em>My Keyboard Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Keyboard Listener</em>'.
	 * @see soft.main.MyKeyboardListener
	 * @generated
	 */
	EClass getMyKeyboardListener();

	/**
	 * Returns the meta object for class '{@link soft.main.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see soft.main.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the '{@link soft.main.File#makeNewFile() <em>Make New File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make New File</em>' operation.
	 * @see soft.main.File#makeNewFile()
	 * @generated
	 */
	EOperation getFile__MakeNewFile();

	/**
	 * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see java.io.Serializable
	 * @model instanceClass="java.io.Serializable"
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for class '{@link java.awt.event.MouseMotionListener <em>Mouse Motion Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Motion Listener</em>'.
	 * @see java.awt.event.MouseMotionListener
	 * @model instanceClass="java.awt.event.MouseMotionListener"
	 * @generated
	 */
	EClass getMouseMotionListener();

	/**
	 * Returns the meta object for class '{@link java.awt.event.KeyListener <em>Key Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Listener</em>'.
	 * @see java.awt.event.KeyListener
	 * @model instanceClass="java.awt.event.KeyListener"
	 * @generated
	 */
	EClass getKeyListener();

	/**
	 * Returns the meta object for class '{@link java.awt.event.MouseListener <em>Mouse Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mouse Listener</em>'.
	 * @see java.awt.event.MouseListener
	 * @model instanceClass="java.awt.event.MouseListener"
	 * @generated
	 */
	EClass getMouseListener();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MainFactory getMainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soft.main.impl.MyGameMapEditorImpl <em>My Game Map Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.MyGameMapEditorImpl
		 * @see soft.main.impl.MainPackageImpl#getMyGameMapEditor()
		 * @generated
		 */
		EClass MY_GAME_MAP_EDITOR = eINSTANCE.getMyGameMapEditor();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_GAME_MAP_EDITOR___MAIN = eINSTANCE.getMyGameMapEditor__Main();

		/**
		 * The meta object literal for the '{@link soft.main.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.EditorImpl
		 * @see soft.main.impl.MainPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '{@link soft.main.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.WindowImpl
		 * @see soft.main.impl.MainPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WINDOW___INIT = eINSTANCE.getWindow__Init();

		/**
		 * The meta object literal for the '{@link soft.main.impl.MyMouseMotionListenerImpl <em>My Mouse Motion Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.MyMouseMotionListenerImpl
		 * @see soft.main.impl.MainPackageImpl#getMyMouseMotionListener()
		 * @generated
		 */
		EClass MY_MOUSE_MOTION_LISTENER = eINSTANCE.getMyMouseMotionListener();

		/**
		 * The meta object literal for the '{@link soft.main.impl.MyKeyboardListenerImpl <em>My Keyboard Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.MyKeyboardListenerImpl
		 * @see soft.main.impl.MainPackageImpl#getMyKeyboardListener()
		 * @generated
		 */
		EClass MY_KEYBOARD_LISTENER = eINSTANCE.getMyKeyboardListener();

		/**
		 * The meta object literal for the '{@link soft.main.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.main.impl.FileImpl
		 * @see soft.main.impl.MainPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Make New File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___MAKE_NEW_FILE = eINSTANCE.getFile__MakeNewFile();

		/**
		 * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.Serializable
		 * @see soft.main.impl.MainPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '{@link java.awt.event.MouseMotionListener <em>Mouse Motion Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.event.MouseMotionListener
		 * @see soft.main.impl.MainPackageImpl#getMouseMotionListener()
		 * @generated
		 */
		EClass MOUSE_MOTION_LISTENER = eINSTANCE.getMouseMotionListener();

		/**
		 * The meta object literal for the '{@link java.awt.event.KeyListener <em>Key Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.event.KeyListener
		 * @see soft.main.impl.MainPackageImpl#getKeyListener()
		 * @generated
		 */
		EClass KEY_LISTENER = eINSTANCE.getKeyListener();

		/**
		 * The meta object literal for the '{@link java.awt.event.MouseListener <em>Mouse Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.event.MouseListener
		 * @see soft.main.impl.MainPackageImpl#getMouseListener()
		 * @generated
		 */
		EClass MOUSE_LISTENER = eINSTANCE.getMouseListener();

	}

} //MainPackage
