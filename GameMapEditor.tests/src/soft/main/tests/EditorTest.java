/**
 */
package soft.main.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import soft.main.Editor;
import soft.main.MainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorTest extends TestCase {

	/**
	 * The fixture for this Editor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Editor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EditorTest.class);
	}

	/**
	 * Constructs a new Editor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Editor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Editor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Editor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Editor getFixture() {
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
		setFixture(MainFactory.eINSTANCE.createEditor());
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

} //EditorTest
