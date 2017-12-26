/**
 */
package soft.mapping;

import java.awt.Color;
import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Cell#getPosition <em>Position</em>}</li>
 *   <li>{@link soft.mapping.Cell#getMyAsset <em>My Asset</em>}</li>
 *   <li>{@link soft.mapping.Cell#getMyAssetArea <em>My Asset Area</em>}</li>
 *   <li>{@link soft.mapping.Cell#getReferenceCell <em>Reference Cell</em>}</li>
 *   <li>{@link soft.mapping.Cell#getCellColor <em>Cell Color</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getCell()
 * @model superTypes="soft.main.Serializable"
 * @generated
 */
public interface Cell extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soft.mapping.Position#getMyCell <em>My Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' container reference.
	 * @see #setPosition(Position)
	 * @see soft.mapping.MappingPackage#getCell_Position()
	 * @see soft.mapping.Position#getMyCell
	 * @model opposite="myCell" required="true" transient="false"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link soft.mapping.Cell#getPosition <em>Position</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' container reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>My Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Asset</em>' reference.
	 * @see #setMyAsset(Asset)
	 * @see soft.mapping.MappingPackage#getCell_MyAsset()
	 * @model
	 * @generated
	 */
	Asset getMyAsset();

	/**
	 * Sets the value of the '{@link soft.mapping.Cell#getMyAsset <em>My Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Asset</em>' reference.
	 * @see #getMyAsset()
	 * @generated
	 */
	void setMyAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>My Asset Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Asset Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Asset Area</em>' reference.
	 * @see #setMyAssetArea(AreaVector)
	 * @see soft.mapping.MappingPackage#getCell_MyAssetArea()
	 * @model
	 * @generated
	 */
	AreaVector getMyAssetArea();

	/**
	 * Sets the value of the '{@link soft.mapping.Cell#getMyAssetArea <em>My Asset Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Asset Area</em>' reference.
	 * @see #getMyAssetArea()
	 * @generated
	 */
	void setMyAssetArea(AreaVector value);

	/**
	 * Returns the value of the '<em><b>Reference Cell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Cell</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Cell</em>' reference.
	 * @see #setReferenceCell(Cell)
	 * @see soft.mapping.MappingPackage#getCell_ReferenceCell()
	 * @model
	 * @generated
	 */
	Cell getReferenceCell();

	/**
	 * Sets the value of the '{@link soft.mapping.Cell#getReferenceCell <em>Reference Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Cell</em>' reference.
	 * @see #getReferenceCell()
	 * @generated
	 */
	void setReferenceCell(Cell value);

	/**
	 * Returns the value of the '<em><b>Cell Color</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Color</em>' attribute.
	 * @see #setCellColor(Color)
	 * @see soft.mapping.MappingPackage#getCell_CellColor()
	 * @model default="" dataType="soft.mapping.Color" required="true"
	 * @generated
	 */
	Color getCellColor();

	/**
	 * Sets the value of the '{@link soft.mapping.Cell#getCellColor <em>Cell Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Color</em>' attribute.
	 * @see #getCellColor()
	 * @generated
	 */
	void setCellColor(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model xRequired="true" yRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Position myPos = new PositionImpl();\n\nmyPos.setX(x);\nmyPos.setY(y);\nmyPos.setMyCell(this);\n\nthis.setPosition(myPos);\n\nmyAsset = null;\nmyAssetArea = null;\nreferenceCell = null;'"
	 * @generated
	 */
	void init(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Position myPos = getPosition();\n\t\treturn \"Cell (\"+myPos.getX()+\",\"+myPos.getY()+\")\";'"
	 * @generated
	 */
	String toString();

} // Cell
