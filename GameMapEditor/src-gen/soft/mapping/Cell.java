/**
 */
package soft.mapping;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model xRequired="true" yRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Position myPos = new PositionImpl();\n\nmyPos.setX(x);\nmyPos.setY(y);\nmyPos.setMyCell(this);\n\nthis.setPosition(myPos);'"
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
