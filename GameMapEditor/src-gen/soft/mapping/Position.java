/**
 */
package soft.mapping;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Position#getX <em>X</em>}</li>
 *   <li>{@link soft.mapping.Position#getY <em>Y</em>}</li>
 *   <li>{@link soft.mapping.Position#getMyCell <em>My Cell</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getPosition()
 * @model superTypes="soft.main.Serializable"
 * @generated
 */
public interface Position extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see soft.mapping.MappingPackage#getPosition_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link soft.mapping.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see soft.mapping.MappingPackage#getPosition_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link soft.mapping.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>My Cell</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link soft.mapping.Cell#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Cell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Cell</em>' containment reference.
	 * @see #isSetMyCell()
	 * @see #unsetMyCell()
	 * @see #setMyCell(Cell)
	 * @see soft.mapping.MappingPackage#getPosition_MyCell()
	 * @see soft.mapping.Cell#getPosition
	 * @model opposite="position" containment="true" unsettable="true" required="true"
	 * @generated
	 */
	Cell getMyCell();

	/**
	 * Sets the value of the '{@link soft.mapping.Position#getMyCell <em>My Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Cell</em>' containment reference.
	 * @see #isSetMyCell()
	 * @see #unsetMyCell()
	 * @see #getMyCell()
	 * @generated
	 */
	void setMyCell(Cell value);

	/**
	 * Unsets the value of the '{@link soft.mapping.Position#getMyCell <em>My Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyCell()
	 * @see #getMyCell()
	 * @see #setMyCell(Cell)
	 * @generated
	 */
	void unsetMyCell();

	/**
	 * Returns whether the value of the '{@link soft.mapping.Position#getMyCell <em>My Cell</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My Cell</em>' containment reference is set.
	 * @see #unsetMyCell()
	 * @see #getMyCell()
	 * @see #setMyCell(Cell)
	 * @generated
	 */
	boolean isSetMyCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Position
