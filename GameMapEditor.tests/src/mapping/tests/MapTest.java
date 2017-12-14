/**
 */
package mapping.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mapping.Map;
import mapping.MappingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapTest extends TestCase {

	/**
	 * The fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapTest.class);
	}

	/**
	 * Constructs a new Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getFixture() {
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
		setFixture(MappingFactory.eINSTANCE.createMap());
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

} //MapTest
