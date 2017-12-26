/**
 */
package soft.mapping.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>mapping</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingTests extends TestSuite {

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
		TestSuite suite = new MappingTests("mapping Tests");
		suite.addTestSuite(MapTest.class);
		suite.addTestSuite(LogsTest.class);
		suite.addTestSuite(CellTest.class);
		suite.addTestSuite(PositionTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(AreaVectorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTests(String name) {
		super(name);
	}

} //MappingTests
