/**
 */
package soft.main.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import soft.main.MainFactory;
import soft.main.MyMouseMotionListener;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My Mouse Motion Listener</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyMouseMotionListenerTest extends TestCase {

	/**
	 * The fixture for this My Mouse Motion Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyMouseMotionListener fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MyMouseMotionListenerTest.class);
	}

	/**
	 * Constructs a new My Mouse Motion Listener test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyMouseMotionListenerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this My Mouse Motion Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MyMouseMotionListener fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this My Mouse Motion Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyMouseMotionListener getFixture() {
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
		setFixture(MainFactory.eINSTANCE.createMyMouseMotionListener());
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

} //MyMouseMotionListenerTest
