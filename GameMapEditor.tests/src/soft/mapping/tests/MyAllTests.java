/**
 */
package soft.mapping.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import soft.fileio.tests.FileioTests;
import soft.graphics.tests.GraphicsTests;
import soft.main.tests.MainTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>My</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MyAllTests("My Tests");
		suite.addTest(MappingTests.suite());
		suite.addTest(MainTests.suite());
		suite.addTest(FileioTests.suite());
		suite.addTest(GraphicsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyAllTests(String name) {
		super(name);
	}

} //MyAllTests
