/**
 */
package mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see mapping.MappingFactory
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
	String eNS_URI = "/Users/ysakanaka/HomeWork/SEClass/GameMapEditor/src";

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
	MappingPackage eINSTANCE = mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link mapping.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.MapImpl
	 * @see mapping.impl.MappingPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>Get Logs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__GET_LOGS = 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.LogsImpl <em>Logs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.LogsImpl
	 * @see mapping.impl.MappingPackageImpl#getLogs()
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
	 * The number of structural features of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_FEATURE_COUNT = 1;

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
	 * The number of operations of the '<em>Logs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '{@link mapping.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.CellImpl
	 * @see mapping.impl.MappingPackageImpl#getCell()
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
	int CELL__POSITION = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.PositionImpl
	 * @see mapping.impl.MappingPackageImpl#getPosition()
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
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>My Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__MY_CELL = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mapping.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.OperationImpl
	 * @see mapping.impl.MappingPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__Y = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.AreaVectorImpl <em>Area Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.AreaVectorImpl
	 * @see mapping.impl.MappingPackageImpl#getAreaVector()
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
	 * The number of operations of the '<em>Area Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mapping.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mapping.impl.AssetImpl
	 * @see mapping.impl.MappingPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 6;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TEST = 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Graphics2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Graphics2D
	 * @see mapping.impl.MappingPackageImpl#getGraphics2D()
	 * @generated
	 */
	int GRAPHICS2_D = 7;


	/**
	 * Returns the meta object for class '{@link mapping.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see mapping.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link mapping.Map#getGetLogs <em>Get Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Logs</em>'.
	 * @see mapping.Map#getGetLogs()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_GetLogs();

	/**
	 * Returns the meta object for class '{@link mapping.Logs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logs</em>'.
	 * @see mapping.Logs
	 * @generated
	 */
	EClass getLogs();

	/**
	 * Returns the meta object for the containment reference list '{@link mapping.Logs#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maps</em>'.
	 * @see mapping.Logs#getMaps()
	 * @see #getLogs()
	 * @generated
	 */
	EReference getLogs_Maps();

	/**
	 * Returns the meta object for the '{@link mapping.Logs#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see mapping.Logs#undo()
	 * @generated
	 */
	EOperation getLogs__Undo();

	/**
	 * Returns the meta object for the '{@link mapping.Logs#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see mapping.Logs#redo()
	 * @generated
	 */
	EOperation getLogs__Redo();

	/**
	 * Returns the meta object for class '{@link mapping.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see mapping.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the container reference '{@link mapping.Cell#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Position</em>'.
	 * @see mapping.Cell#getPosition()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Position();

	/**
	 * Returns the meta object for class '{@link mapping.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see mapping.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link mapping.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see mapping.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link mapping.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see mapping.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the containment reference '{@link mapping.Position#getMyCell <em>My Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Cell</em>'.
	 * @see mapping.Position#getMyCell()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_MyCell();

	/**
	 * Returns the meta object for class '{@link mapping.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see mapping.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link mapping.Operation#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see mapping.Operation#getX()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_X();

	/**
	 * Returns the meta object for the attribute '{@link mapping.Operation#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see mapping.Operation#getY()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Y();

	/**
	 * Returns the meta object for class '{@link mapping.AreaVector <em>Area Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Vector</em>'.
	 * @see mapping.AreaVector
	 * @generated
	 */
	EClass getAreaVector();

	/**
	 * Returns the meta object for the reference '{@link mapping.AreaVector#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see mapping.AreaVector#getStart()
	 * @see #getAreaVector()
	 * @generated
	 */
	EReference getAreaVector_Start();

	/**
	 * Returns the meta object for the reference '{@link mapping.AreaVector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see mapping.AreaVector#getEnd()
	 * @see #getAreaVector()
	 * @generated
	 */
	EReference getAreaVector_End();

	/**
	 * Returns the meta object for class '{@link mapping.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see mapping.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link mapping.Asset#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see mapping.Asset#getTest()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Test();

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
		 * The meta object literal for the '{@link mapping.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.MapImpl
		 * @see mapping.impl.MappingPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Get Logs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__GET_LOGS = eINSTANCE.getMap_GetLogs();

		/**
		 * The meta object literal for the '{@link mapping.impl.LogsImpl <em>Logs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.LogsImpl
		 * @see mapping.impl.MappingPackageImpl#getLogs()
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
		 * The meta object literal for the '{@link mapping.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.CellImpl
		 * @see mapping.impl.MappingPackageImpl#getCell()
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
		 * The meta object literal for the '{@link mapping.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.PositionImpl
		 * @see mapping.impl.MappingPackageImpl#getPosition()
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
		 * The meta object literal for the '{@link mapping.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.OperationImpl
		 * @see mapping.impl.MappingPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__X = eINSTANCE.getOperation_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__Y = eINSTANCE.getOperation_Y();

		/**
		 * The meta object literal for the '{@link mapping.impl.AreaVectorImpl <em>Area Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.AreaVectorImpl
		 * @see mapping.impl.MappingPackageImpl#getAreaVector()
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
		 * The meta object literal for the '{@link mapping.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mapping.impl.AssetImpl
		 * @see mapping.impl.MappingPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__TEST = eINSTANCE.getAsset_Test();

		/**
		 * The meta object literal for the '<em>Graphics2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Graphics2D
		 * @see mapping.impl.MappingPackageImpl#getGraphics2D()
		 * @generated
		 */
		EDataType GRAPHICS2_D = eINSTANCE.getGraphics2D();

	}

} //MappingPackage
