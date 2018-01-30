/**
 */
package soft.mapping.tests;

import junit.textui.TestRunner;

import soft.mapping.ColorAsset;
import soft.mapping.MappingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Color Asset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorAssetTest extends AssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColorAssetTest.class);
	}

	/**
	 * Constructs a new Color Asset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorAssetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Color Asset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColorAsset getFixture() {
		return (ColorAsset)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createColorAsset());
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

} //ColorAssetTest
