/**
 */
package soft.fileio.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>fileio</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileioTests extends TestSuite {

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
		TestSuite suite = new FileioTests("fileio Tests");
		suite.addTestSuite(XmlWriterTest.class);
		suite.addTestSuite(XmlReaderTest.class);
		suite.addTestSuite(MyImageReaderTest.class);
		suite.addTestSuite(MyImageWriterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileioTests(String name) {
		super(name);
	}

} //FileioTests
