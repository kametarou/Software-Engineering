/**
 */
package soft.fileio.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import soft.fileio.FileioFactory;
import soft.fileio.MyImageWriter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My Image Writer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyImageWriterTest extends TestCase {

	/**
	 * The fixture for this My Image Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyImageWriter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MyImageWriterTest.class);
	}

	/**
	 * Constructs a new My Image Writer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyImageWriterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this My Image Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MyImageWriter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this My Image Writer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyImageWriter getFixture() {
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
		setFixture(FileioFactory.eINSTANCE.createMyImageWriter());
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

} //MyImageWriterTest
