/**
 */
package soft.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Device;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Map#getMyLogs <em>My Logs</em>}</li>
 *   <li>{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link soft.mapping.Map#getCells <em>Cells</em>}</li>
 *   <li>{@link soft.mapping.Map#getMaxLayer <em>Max Layer</em>}</li>
 *   <li>{@link soft.mapping.Map#getAssetsSet <em>Assets Set</em>}</li>
 *   <li>{@link soft.mapping.Map#getMapheight <em>Mapheight</em>}</li>
 *   <li>{@link soft.mapping.Map#getMapwidth <em>Mapwidth</em>}</li>
 *   <li>{@link soft.mapping.Map#getMydevice <em>Mydevice</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>My Logs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Logs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Logs</em>' reference.
	 * @see soft.mapping.MappingPackage#getMap_MyLogs()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	Logs getMyLogs();

	/**
	 * Returns the value of the '<em><b>Current Layer</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Layer</em>' attribute.
	 * @see #setCurrentLayer(int)
	 * @see soft.mapping.MappingPackage#getMap_CurrentLayer()
	 * @model default="0"
	 * @generated
	 */
	int getCurrentLayer();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Layer</em>' attribute.
	 * @see #getCurrentLayer()
	 * @generated
	 */
	void setCurrentLayer(int value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' attribute.
	 * @see #setCells(Cell[][][])
	 * @see soft.mapping.MappingPackage#getMap_Cells()
	 * @model dataType="soft.mapping.CellArray" required="true"
	 * @generated
	 */
	Cell[][][] getCells();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getCells <em>Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cells</em>' attribute.
	 * @see #getCells()
	 * @generated
	 */
	void setCells(Cell[][][] value);

	/**
	 * Returns the value of the '<em><b>Max Layer</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Layer</em>' attribute.
	 * @see #setMaxLayer(int)
	 * @see soft.mapping.MappingPackage#getMap_MaxLayer()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getMaxLayer();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getMaxLayer <em>Max Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Layer</em>' attribute.
	 * @see #getMaxLayer()
	 * @generated
	 */
	void setMaxLayer(int value);

	/**
	 * Returns the value of the '<em><b>Assets Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets Set</em>' attribute.
	 * @see #setAssetsSet(Asset[])
	 * @see soft.mapping.MappingPackage#getMap_AssetsSet()
	 * @model dataType="soft.mapping.AssetArray" required="true"
	 * @generated
	 */
	Asset[] getAssetsSet();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getAssetsSet <em>Assets Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets Set</em>' attribute.
	 * @see #getAssetsSet()
	 * @generated
	 */
	void setAssetsSet(Asset[] value);

	/**
	 * Returns the value of the '<em><b>Mapheight</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapheight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapheight</em>' attribute.
	 * @see #setMapheight(int)
	 * @see soft.mapping.MappingPackage#getMap_Mapheight()
	 * @model default="20" required="true"
	 * @generated
	 */
	int getMapheight();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getMapheight <em>Mapheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapheight</em>' attribute.
	 * @see #getMapheight()
	 * @generated
	 */
	void setMapheight(int value);

	/**
	 * Returns the value of the '<em><b>Mapwidth</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapwidth</em>' attribute.
	 * @see #setMapwidth(int)
	 * @see soft.mapping.MappingPackage#getMap_Mapwidth()
	 * @model default="20" required="true"
	 * @generated
	 */
	int getMapwidth();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getMapwidth <em>Mapwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapwidth</em>' attribute.
	 * @see #getMapwidth()
	 * @generated
	 */
	void setMapwidth(int value);

	/**
	 * Returns the value of the '<em><b>Mydevice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mydevice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mydevice</em>' attribute.
	 * @see #setMydevice(Device)
	 * @see soft.mapping.MappingPackage#getMap_Mydevice()
	 * @model dataType="soft.mapping.Device"
	 * @generated
	 */
	Device getMydevice();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getMydevice <em>Mydevice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mydevice</em>' attribute.
	 * @see #getMydevice()
	 * @generated
	 */
	void setMydevice(Device value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mydevDataType="soft.mapping.Device"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\tcells = new Cell[3][width][height];\n\n\t\tfor (int z = 0; z &lt; 3; z++) {\n\t\t\tfor (int x = 0; x &lt; width; x++) {\n\t\t\t\tfor (int y = 0; y &lt; height; y++) {\n\t\t\t\t\tCellImpl myCell = new CellImpl();\n\t\t\t\t\tmyCell.init(x, y);\n\t\t\t\t\tcells[z][x][y] = myCell;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\n\t\tmyLogs = new LogsImpl();\n\t\tmydevice = mydev;'"
	 * @generated
	 */
	void init(int height, int width, Device mydev);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCellFromCurrentLayer(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Cell getCellFromSpecifiedLayer(int x, int y, int layer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCellFromCurrentLayer(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addLog(Operation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAssetToAssetsSet(Asset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Asset getAssetFromAssetsSet(String name);

} // Map
