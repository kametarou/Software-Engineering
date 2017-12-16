/**
 */
package soft.main.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import soft.main.MainFactory;
import soft.main.MyKeyboardListener;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My Keyboard Listener</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyKeyboardListenerTest extends TestCase {

	/**
	 * The fixture for this My Keyboard Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyKeyboardListener fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MyKeyboardListenerTest.class);
	}

	/**
	 * Constructs a new My Keyboard Listener test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyKeyboardListenerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this My Keyboard Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MyKeyboardListener fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this My Keyboard Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyKeyboardListener getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MainFactory.eINSTANCE.createMyKeyboardListener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MyKeyboardListenerTest
