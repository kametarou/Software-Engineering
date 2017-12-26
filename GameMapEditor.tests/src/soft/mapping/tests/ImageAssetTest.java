/**
 */
package soft.mapping.tests;

import junit.textui.TestRunner;

import soft.mapping.ImageAsset;
import soft.mapping.MappingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Asset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageAssetTest extends AssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageAssetTest.class);
	}

	/**
	 * Constructs a new Image Asset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAssetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Asset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageAsset getFixture() {
		return (ImageAsset)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createImageAsset());
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

} //ImageAssetTest
