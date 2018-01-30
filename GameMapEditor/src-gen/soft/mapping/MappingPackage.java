/**
 */
package soft.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import soft.main.MainPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soft.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/Users/ysakanaka/HomeWork/SEClass/GameMapEditor/src/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = soft.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link soft.mapping.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.MapImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>My Logs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MY_LOGS = 0;

	/**
	 * The feature id for the '<em><b>Current Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CURRENT_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CELLS = 2;

	/**
	 * The feature id for the '<em><b>Max Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAX_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Assets Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ASSETS_SET = 4;

	/**
	 * The feature id for the '<em><b>Mapheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAPHEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Mapwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAPWIDTH = 6;

	/**
	 * The feature id for the '<em><b>Mydevice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MYDEVICE = 7;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___INIT__INT_INT_DEVICE = 0;

	/**
	 * The operation id for the '<em>Get Cell From Current Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___GET_CELL_FROM_CURRENT_LAYER__INT_INT = 1;

	/**
	 * The operation id for the '<em>Get Cell From Specified Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___GET_CELL_FROM_SPECIFIED_LAYER__INT_INT_INT = 2;

	/**
	 * The operation id for the '<em>Delete Cell From Current Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___DELETE_CELL_FROM_CURRENT_LAYER__INT_INT = 3;

	/**
	 * The operation id for the '<em>Add Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___ADD_LOG__OPERATION = 4;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.LogsImpl <em>Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.LogsImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getLogs()
	 * @generated
	 */
	int LOGS = 1;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__MAPS = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__CURRENT = 1;

	/**
	 * The feature id for the '<em><b>Logdata</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS__LOGDATA = 2;

	/**
	 * The number of structural features of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___UNDO = 0;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___REDO = 1;

	/**
	 * The operation id for the '<em>Removelog</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___REMOVELOG = 2;

	/**
	 * The operation id for the '<em>Add Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___ADD_LOG__OPERATION = 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___INIT__MAP = 4;

	/**
	 * The operation id for the '<em>Add Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS___ADD_MAP__MAP = 5;

	/**
	 * The number of operations of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.CellImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__POSITION = MainPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MY_ASSET = MainPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>My Asset Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MY_ASSET_AREA = MainPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__REFERENCE_CELL = MainPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cell Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_COLOR = MainPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = MainPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL___INIT__INT_INT_DEVICE = MainPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL___TO_STRING = MainPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = MainPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.PositionImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = MainPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = MainPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>My Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__MY_CELL = MainPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = MainPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___INIT = MainPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = MainPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.OperationImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LAYER = 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__AREA = 1;

	/**
	 * The feature id for the '<em><b>Before Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BEFORE_MAP = 2;

	/**
	 * The feature id for the '<em><b>After Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__AFTER_MAP = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___INIT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.AreaVectorImpl <em>Area Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.AreaVectorImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getAreaVector()
	 * @generated
	 */
	int AREA_VECTOR = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR__END = 1;

	/**
	 * The number of structural features of the '<em>Area Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR___INIT = 0;

	/**
	 * The number of operations of the '<em>Area Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.AssetImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 6;

	/**
	 * The feature id for the '<em><b>My Graphics2d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MY_GRAPHICS2D = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__Y = 2;

	/**
	 * The feature id for the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_ID = 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___INIT = 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.ImageAssetImpl <em>Image Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.ImageAssetImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getImageAsset()
	 * @generated
	 */
	int IMAGE_ASSET = 7;

	/**
	 * The feature id for the '<em><b>My Graphics2d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET__MY_GRAPHICS2D = ASSET__MY_GRAPHICS2D;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET__X = ASSET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET__Y = ASSET__Y;

	/**
	 * The feature id for the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET__ASSET_ID = ASSET__ASSET_ID;

	/**
	 * The number of structural features of the '<em>Image Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET___INIT = ASSET___INIT;

	/**
	 * The number of operations of the '<em>Image Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link soft.mapping.impl.ColorAssetImpl <em>Color Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.ColorAssetImpl
	 * @see soft.mapping.impl.MappingPackageImpl#getColorAsset()
	 * @generated
	 */
	int COLOR_ASSET = 8;

	/**
	 * The feature id for the '<em><b>My Graphics2d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET__MY_GRAPHICS2D = ASSET__MY_GRAPHICS2D;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET__X = ASSET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET__Y = ASSET__Y;

	/**
	 * The feature id for the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET__ASSET_ID = ASSET__ASSET_ID;

	/**
	 * The number of structural features of the '<em>Color Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET___INIT = ASSET___INIT;

	/**
	 * The number of operations of the '<em>Color Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Asset Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.MappingPackageImpl#getAssetArray()
	 * @generated
	 */
	int ASSET_ARRAY = 9;

	/**
	 * The meta object id for the '<em>Graphics2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Graphics2D
	 * @see soft.mapping.impl.MappingPackageImpl#getGraphics2D()
	 * @generated
	 */
	int GRAPHICS2_D = 10;

	/**
	 * The meta object id for the '<em>Cell Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.mapping.impl.MappingPackageImpl#getCellArray()
	 * @generated
	 */
	int CELL_ARRAY = 11;


	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see soft.mapping.impl.MappingPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 12;


	/**
	 * The meta object id for the '<em>Device</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Device
	 * @see soft.mapping.impl.MappingPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 13;


	/**
	 * Returns the meta object for class '{@link soft.mapping.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see soft.mapping.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Map#getMyLogs <em>My Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Logs</em>'.
	 * @see soft.mapping.Map#getMyLogs()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_MyLogs();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Layer</em>'.
	 * @see soft.mapping.Map#getCurrentLayer()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_CurrentLayer();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cells</em>'.
	 * @see soft.mapping.Map#getCells()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Cells();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getMaxLayer <em>Max Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Layer</em>'.
	 * @see soft.mapping.Map#getMaxLayer()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MaxLayer();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getAssetsSet <em>Assets Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assets Set</em>'.
	 * @see soft.mapping.Map#getAssetsSet()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_AssetsSet();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getMapheight <em>Mapheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapheight</em>'.
	 * @see soft.mapping.Map#getMapheight()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Mapheight();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getMapwidth <em>Mapwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapwidth</em>'.
	 * @see soft.mapping.Map#getMapwidth()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Mapwidth();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Map#getMydevice <em>Mydevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mydevice</em>'.
	 * @see soft.mapping.Map#getMydevice()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Mydevice();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Map#init(int, int, org.eclipse.swt.graphics.Device) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Map#init(int, int, org.eclipse.swt.graphics.Device)
	 * @generated
	 */
	EOperation getMap__Init__int_int_Device();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Map#getCellFromCurrentLayer(int, int) <em>Get Cell From Current Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell From Current Layer</em>' operation.
	 * @see soft.mapping.Map#getCellFromCurrentLayer(int, int)
	 * @generated
	 */
	EOperation getMap__GetCellFromCurrentLayer__int_int();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Map#getCellFromSpecifiedLayer(int, int, int) <em>Get Cell From Specified Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell From Specified Layer</em>' operation.
	 * @see soft.mapping.Map#getCellFromSpecifiedLayer(int, int, int)
	 * @generated
	 */
	EOperation getMap__GetCellFromSpecifiedLayer__int_int_int();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Map#deleteCellFromCurrentLayer(int, int) <em>Delete Cell From Current Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Cell From Current Layer</em>' operation.
	 * @see soft.mapping.Map#deleteCellFromCurrentLayer(int, int)
	 * @generated
	 */
	EOperation getMap__DeleteCellFromCurrentLayer__int_int();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Map#addLog(soft.mapping.Operation) <em>Add Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Log</em>' operation.
	 * @see soft.mapping.Map#addLog(soft.mapping.Operation)
	 * @generated
	 */
	EOperation getMap__AddLog__Operation();

	/**
	 * Returns the meta object for class '{@link soft.mapping.Logs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logs</em>'.
	 * @see soft.mapping.Logs
	 * @generated
	 */
	EClass getLogs();

	/**
	 * Returns the meta object for the containment reference list '{@link soft.mapping.Logs#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maps</em>'.
	 * @see soft.mapping.Logs#getMaps()
	 * @see #getLogs()
	 * @generated
	 */
	EReference getLogs_Maps();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Logs#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see soft.mapping.Logs#getCurrent()
	 * @see #getLogs()
	 * @generated
	 */
	EAttribute getLogs_Current();

	/**
	 * Returns the meta object for the reference list '{@link soft.mapping.Logs#getLogdata <em>Logdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logdata</em>'.
	 * @see soft.mapping.Logs#getLogdata()
	 * @see #getLogs()
	 * @generated
	 */
	EReference getLogs_Logdata();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see soft.mapping.Logs#undo()
	 * @generated
	 */
	EOperation getLogs__Undo();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see soft.mapping.Logs#redo()
	 * @generated
	 */
	EOperation getLogs__Redo();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#removelog() <em>Removelog</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Removelog</em>' operation.
	 * @see soft.mapping.Logs#removelog()
	 * @generated
	 */
	EOperation getLogs__Removelog();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#addLog(soft.mapping.Operation) <em>Add Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Log</em>' operation.
	 * @see soft.mapping.Logs#addLog(soft.mapping.Operation)
	 * @generated
	 */
	EOperation getLogs__AddLog__Operation();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#init(soft.mapping.Map) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Logs#init(soft.mapping.Map)
	 * @generated
	 */
	EOperation getLogs__Init__Map();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Logs#addMap(soft.mapping.Map) <em>Add Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Map</em>' operation.
	 * @see soft.mapping.Logs#addMap(soft.mapping.Map)
	 * @generated
	 */
	EOperation getLogs__AddMap__Map();

	/**
	 * Returns the meta object for class '{@link soft.mapping.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see soft.mapping.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the container reference '{@link soft.mapping.Cell#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Position</em>'.
	 * @see soft.mapping.Cell#getPosition()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Position();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Cell#getMyAsset <em>My Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Asset</em>'.
	 * @see soft.mapping.Cell#getMyAsset()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_MyAsset();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Cell#getMyAssetArea <em>My Asset Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Asset Area</em>'.
	 * @see soft.mapping.Cell#getMyAssetArea()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_MyAssetArea();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Cell#getReferenceCell <em>Reference Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Cell</em>'.
	 * @see soft.mapping.Cell#getReferenceCell()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_ReferenceCell();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Cell#getCellColor <em>Cell Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Color</em>'.
	 * @see soft.mapping.Cell#getCellColor()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellColor();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Cell#init(int, int, org.eclipse.swt.graphics.Device) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Cell#init(int, int, org.eclipse.swt.graphics.Device)
	 * @generated
	 */
	EOperation getCell__Init__int_int_Device();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Cell#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see soft.mapping.Cell#toString()
	 * @generated
	 */
	EOperation getCell__ToString();

	/**
	 * Returns the meta object for class '{@link soft.mapping.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see soft.mapping.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see soft.mapping.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see soft.mapping.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the containment reference '{@link soft.mapping.Position#getMyCell <em>My Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Cell</em>'.
	 * @see soft.mapping.Position#getMyCell()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_MyCell();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Position#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Position#init()
	 * @generated
	 */
	EOperation getPosition__Init();

	/**
	 * Returns the meta object for class '{@link soft.mapping.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see soft.mapping.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Operation#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see soft.mapping.Operation#getLayer()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Layer();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Operation#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see soft.mapping.Operation#getArea()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Area();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Operation#getBeforeMap <em>Before Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Map</em>'.
	 * @see soft.mapping.Operation#getBeforeMap()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_BeforeMap();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.Operation#getAfterMap <em>After Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Map</em>'.
	 * @see soft.mapping.Operation#getAfterMap()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_AfterMap();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Operation#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Operation#init()
	 * @generated
	 */
	EOperation getOperation__Init();

	/**
	 * Returns the meta object for class '{@link soft.mapping.AreaVector <em>Area Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Vector</em>'.
	 * @see soft.mapping.AreaVector
	 * @generated
	 */
	EClass getAreaVector();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.AreaVector#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see soft.mapping.AreaVector#getStart()
	 * @see #getAreaVector()
	 * @generated
	 */
	EReference getAreaVector_Start();

	/**
	 * Returns the meta object for the reference '{@link soft.mapping.AreaVector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see soft.mapping.AreaVector#getEnd()
	 * @see #getAreaVector()
	 * @generated
	 */
	EReference getAreaVector_End();

	/**
	 * Returns the meta object for the '{@link soft.mapping.AreaVector#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.AreaVector#init()
	 * @generated
	 */
	EOperation getAreaVector__Init();

	/**
	 * Returns the meta object for class '{@link soft.mapping.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see soft.mapping.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Asset#getMyGraphics2d <em>My Graphics2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Graphics2d</em>'.
	 * @see soft.mapping.Asset#getMyGraphics2d()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_MyGraphics2d();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Asset#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see soft.mapping.Asset#getX()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_X();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Asset#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see soft.mapping.Asset#getY()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Y();

	/**
	 * Returns the meta object for the attribute '{@link soft.mapping.Asset#getAssetId <em>Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Id</em>'.
	 * @see soft.mapping.Asset#getAssetId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetId();

	/**
	 * Returns the meta object for the '{@link soft.mapping.Asset#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.mapping.Asset#init()
	 * @generated
	 */
	EOperation getAsset__Init();

	/**
	 * Returns the meta object for class '{@link soft.mapping.ImageAsset <em>Image Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Asset</em>'.
	 * @see soft.mapping.ImageAsset
	 * @generated
	 */
	EClass getImageAsset();

	/**
	 * Returns the meta object for class '{@link soft.mapping.ColorAsset <em>Color Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Asset</em>'.
	 * @see soft.mapping.ColorAsset
	 * @generated
	 */
	EClass getColorAsset();

	/**
	 * Returns the meta object for data type '<em>Asset Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Asset Array</em>'.
	 * @model instanceClass="soft.mapping.Asset[]"
	 * @generated
	 */
	EDataType getAssetArray();

	/**
	 * Returns the meta object for data type '{@link java.awt.Graphics2D <em>Graphics2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graphics2 D</em>'.
	 * @see java.awt.Graphics2D
	 * @model instanceClass="java.awt.Graphics2D"
	 * @generated
	 */
	EDataType getGraphics2D();

	/**
	 * Returns the meta object for data type '<em>Cell Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell Array</em>'.
	 * @model instanceClass="soft.mapping.Cell[][][]"
	 * @generated
	 */
	EDataType getCellArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device</em>'.
	 * @see org.eclipse.swt.graphics.Device
	 * @model instanceClass="org.eclipse.swt.graphics.Device"
	 * @generated
	 */
	EDataType getDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soft.mapping.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.MapImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>My Logs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__MY_LOGS = eINSTANCE.getMap_MyLogs();

		/**
		 * The meta object literal for the '<em><b>Current Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__CURRENT_LAYER = eINSTANCE.getMap_CurrentLayer();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__CELLS = eINSTANCE.getMap_Cells();

		/**
		 * The meta object literal for the '<em><b>Max Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAX_LAYER = eINSTANCE.getMap_MaxLayer();

		/**
		 * The meta object literal for the '<em><b>Assets Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__ASSETS_SET = eINSTANCE.getMap_AssetsSet();

		/**
		 * The meta object literal for the '<em><b>Mapheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAPHEIGHT = eINSTANCE.getMap_Mapheight();

		/**
		 * The meta object literal for the '<em><b>Mapwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAPWIDTH = eINSTANCE.getMap_Mapwidth();

		/**
		 * The meta object literal for the '<em><b>Mydevice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MYDEVICE = eINSTANCE.getMap_Mydevice();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___INIT__INT_INT_DEVICE = eINSTANCE.getMap__Init__int_int_Device();

		/**
		 * The meta object literal for the '<em><b>Get Cell From Current Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___GET_CELL_FROM_CURRENT_LAYER__INT_INT = eINSTANCE.getMap__GetCellFromCurrentLayer__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Cell From Specified Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___GET_CELL_FROM_SPECIFIED_LAYER__INT_INT_INT = eINSTANCE.getMap__GetCellFromSpecifiedLayer__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Delete Cell From Current Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___DELETE_CELL_FROM_CURRENT_LAYER__INT_INT = eINSTANCE.getMap__DeleteCellFromCurrentLayer__int_int();

		/**
		 * The meta object literal for the '<em><b>Add Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___ADD_LOG__OPERATION = eINSTANCE.getMap__AddLog__Operation();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.LogsImpl <em>Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.LogsImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getLogs()
		 * @generated
		 */
		EClass LOGS = eINSTANCE.getLogs();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGS__MAPS = eINSTANCE.getLogs_Maps();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGS__CURRENT = eINSTANCE.getLogs_Current();

		/**
		 * The meta object literal for the '<em><b>Logdata</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGS__LOGDATA = eINSTANCE.getLogs_Logdata();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___UNDO = eINSTANCE.getLogs__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___REDO = eINSTANCE.getLogs__Redo();

		/**
		 * The meta object literal for the '<em><b>Removelog</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___REMOVELOG = eINSTANCE.getLogs__Removelog();

		/**
		 * The meta object literal for the '<em><b>Add Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___ADD_LOG__OPERATION = eINSTANCE.getLogs__AddLog__Operation();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___INIT__MAP = eINSTANCE.getLogs__Init__Map();

		/**
		 * The meta object literal for the '<em><b>Add Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGS___ADD_MAP__MAP = eINSTANCE.getLogs__AddMap__Map();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.CellImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__POSITION = eINSTANCE.getCell_Position();

		/**
		 * The meta object literal for the '<em><b>My Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__MY_ASSET = eINSTANCE.getCell_MyAsset();

		/**
		 * The meta object literal for the '<em><b>My Asset Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__MY_ASSET_AREA = eINSTANCE.getCell_MyAssetArea();

		/**
		 * The meta object literal for the '<em><b>Reference Cell</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__REFERENCE_CELL = eINSTANCE.getCell_ReferenceCell();

		/**
		 * The meta object literal for the '<em><b>Cell Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_COLOR = eINSTANCE.getCell_CellColor();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL___INIT__INT_INT_DEVICE = eINSTANCE.getCell__Init__int_int_Device();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL___TO_STRING = eINSTANCE.getCell__ToString();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.PositionImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>My Cell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__MY_CELL = eINSTANCE.getPosition_MyCell();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSITION___INIT = eINSTANCE.getPosition__Init();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.OperationImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LAYER = eINSTANCE.getOperation_Layer();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__AREA = eINSTANCE.getOperation_Area();

		/**
		 * The meta object literal for the '<em><b>Before Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BEFORE_MAP = eINSTANCE.getOperation_BeforeMap();

		/**
		 * The meta object literal for the '<em><b>After Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__AFTER_MAP = eINSTANCE.getOperation_AfterMap();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___INIT = eINSTANCE.getOperation__Init();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.AreaVectorImpl <em>Area Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.AreaVectorImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getAreaVector()
		 * @generated
		 */
		EClass AREA_VECTOR = eINSTANCE.getAreaVector();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_VECTOR__START = eINSTANCE.getAreaVector_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_VECTOR__END = eINSTANCE.getAreaVector_End();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AREA_VECTOR___INIT = eINSTANCE.getAreaVector__Init();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.AssetImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>My Graphics2d</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MY_GRAPHICS2D = eINSTANCE.getAsset_MyGraphics2d();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__X = eINSTANCE.getAsset_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__Y = eINSTANCE.getAsset_Y();

		/**
		 * The meta object literal for the '<em><b>Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_ID = eINSTANCE.getAsset_AssetId();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___INIT = eINSTANCE.getAsset__Init();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.ImageAssetImpl <em>Image Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.ImageAssetImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getImageAsset()
		 * @generated
		 */
		EClass IMAGE_ASSET = eINSTANCE.getImageAsset();

		/**
		 * The meta object literal for the '{@link soft.mapping.impl.ColorAssetImpl <em>Color Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.ColorAssetImpl
		 * @see soft.mapping.impl.MappingPackageImpl#getColorAsset()
		 * @generated
		 */
		EClass COLOR_ASSET = eINSTANCE.getColorAsset();

		/**
		 * The meta object literal for the '<em>Asset Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.MappingPackageImpl#getAssetArray()
		 * @generated
		 */
		EDataType ASSET_ARRAY = eINSTANCE.getAssetArray();

		/**
		 * The meta object literal for the '<em>Graphics2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Graphics2D
		 * @see soft.mapping.impl.MappingPackageImpl#getGraphics2D()
		 * @generated
		 */
		EDataType GRAPHICS2_D = eINSTANCE.getGraphics2D();

		/**
		 * The meta object literal for the '<em>Cell Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.mapping.impl.MappingPackageImpl#getCellArray()
		 * @generated
		 */
		EDataType CELL_ARRAY = eINSTANCE.getCellArray();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see soft.mapping.impl.MappingPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Device</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Device
		 * @see soft.mapping.impl.MappingPackageImpl#getDevice()
		 * @generated
		 */
		EDataType DEVICE = eINSTANCE.getDevice();

	}

} //MappingPackage
