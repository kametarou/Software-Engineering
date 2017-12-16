/**
 */
package soft.mapping;

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
 * @model
 * @generated
 */
public interface Cell extends EObject {
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

} // Cell
