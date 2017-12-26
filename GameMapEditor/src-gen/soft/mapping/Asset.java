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
 *   <li>{@link soft.mapping.Asset#getX <em>X</em>}</li>
 *   <li>{@link soft.mapping.Asset#getY <em>Y</em>}</li>
 *   <li>{@link soft.mapping.Asset#getAssetId <em>Asset Id</em>}</li>
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
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see soft.mapping.MappingPackage#getAsset_X()
	 * @model required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link soft.mapping.Asset#getX <em>X</em>}' attribute.
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
	 * @see soft.mapping.MappingPackage#getAsset_Y()
	 * @model required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link soft.mapping.Asset#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Id</em>' attribute.
	 * @see #setAssetId(String)
	 * @see soft.mapping.MappingPackage#getAsset_AssetId()
	 * @model required="true"
	 * @generated
	 */
	String getAssetId();

	/**
	 * Sets the value of the '{@link soft.mapping.Asset#getAssetId <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Id</em>' attribute.
	 * @see #getAssetId()
	 * @generated
	 */
	void setAssetId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Asset
