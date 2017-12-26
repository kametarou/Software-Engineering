/**
 */
package soft.mapping;

import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Asset#getMyGraphics2d <em>My Graphics2d</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getAsset()
 * @model abstract="true"
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>My Graphics2d</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Graphics2d</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Graphics2d</em>' attribute.
	 * @see #setMyGraphics2d(Graphics2D)
	 * @see soft.mapping.MappingPackage#getAsset_MyGraphics2d()
	 * @model default="" dataType="soft.mapping.Graphics2D"
	 * @generated
	 */
	Graphics2D getMyGraphics2d();

	/**
	 * Sets the value of the '{@link soft.mapping.Asset#getMyGraphics2d <em>My Graphics2d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Graphics2d</em>' attribute.
	 * @see #getMyGraphics2d()
	 * @generated
	 */
	void setMyGraphics2d(Graphics2D value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Asset
