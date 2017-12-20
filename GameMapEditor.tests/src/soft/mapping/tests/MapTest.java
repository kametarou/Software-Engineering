/**
 */
package soft.mapping.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import soft.mapping.Map;
import soft.mapping.MappingFactory;
import soft.mapping.Position;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link soft.mapping.Map#init(int, int) <em>Init</em>}</li>
 *   <li>{@link soft.mapping.Map#setLayer(int) <em>Set Layer</em>}</li>
 * </ul>
 * </p>
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

	/**
	 * Tests the '{@link soft.mapping.Map#init(int, int) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.Map#init(int, int)
	 * @generated NOT
	 */
	public void testInit__int_int() {
		
		
		Map myMap = fixture;
		myMap.init(100, 100);
		//should test the size of map
        Position myPos;
		for(int x = 0; x<100;x++) {
			for(int y=0; y<100; y++) {
                                    myPos = myMap.getCells()[x][y].getPosition();
				assertEquals(myPos.getX(),x);
                assertEquals(myPos.getY(),y);
                assertEquals(myPos.getMyCell(),myMap.getCells()[x][y]);
				//System.out.println(myMap.getCells()[x][y].toString());
			}
		}
	}

	/**
	 * Tests the '{@link soft.mapping.Map#setLayer(int) <em>Set Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.Map#setLayer(int)
	 * @generated
	 */
	public void testSetLayer__int() {
		Map myMap = fixture;
		boolean ret;
		int oldLayer = myMap.getCurrentLayer(); 
		ret = myMap.setLayer(-1);
		assertEquals(ret,false);
		assertEquals(myMap.getCurrentLayer(),oldLayer);
		ret = myMap.setLayer(4);
		assertEquals(ret,false);
		assertEquals(myMap.getCurrentLayer(),oldLayer);
		ret = myMap.setLayer(3);
		assertEquals(ret,false);
		assertEquals(myMap.getCurrentLayer(),oldLayer);

		for(int i = 0; i<3; i++){
		  ret = myMap.setLayer(i);
		assertEquals(ret,true);
		assertEquals(myMap.getCurrentLayer(),i);
		}
	}

} //MapTest
