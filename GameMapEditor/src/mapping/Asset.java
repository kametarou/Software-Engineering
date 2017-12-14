/**
 */
package mapping;

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
 *   <li>{@link mapping.Asset#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(Graphics2D)
	 * @see mapping.MappingPackage#getAsset_Test()
	 * @model default="" dataType="mapping.Graphics2D"
	 * @generated
	 */
	Graphics2D getTest();

	/**
	 * Sets the value of the '{@link mapping.Asset#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Graphics2D value);

} // Asset
