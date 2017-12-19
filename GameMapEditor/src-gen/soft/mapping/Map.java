/**
 */
package soft.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Map#getOpLogs <em>Op Logs</em>}</li>
 *   <li>{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link soft.mapping.Map#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Op Logs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Logs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Logs</em>' reference.
	 * @see soft.mapping.MappingPackage#getMap_OpLogs()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	Logs getOpLogs();

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
	 * @see #setCells(Cell[][])
	 * @see soft.mapping.MappingPackage#getMap_Cells()
	 * @model dataType="soft.mapping.CellArray" required="true"
	 * @generated
	 */
	Cell[][] getCells();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getCells <em>Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cells</em>' attribute.
	 * @see #getCells()
	 * @generated
	 */
	void setCells(Cell[][] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='cells = new Cell[width][height];\n\nfor(int x=0; x &lt; width; x++){\n  for(int y=0; y &lt; height; y++){\n    CellImpl myCell = new CellImpl();\n    myCell.init(x,y);\n    cells[x][y] = myCell;\n  }\n}\n\nopLogs = new LogsImpl();'"
	 * @generated
	 */
	void init(int height, int width);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='currentLayer = layer;\n\nreturn currentLayer == layer;'"
	 * @generated
	 */
	boolean setLayer(int layer);

} // Map
