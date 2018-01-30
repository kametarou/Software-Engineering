/**
 */
package soft.graphics;

import java.awt.image.BufferedImage;
import org.eclipse.emf.ecore.EObject;

import soft.mapping.AreaVector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.graphics.ImageProcess#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @see soft.graphics.GraphicsPackage#getImageProcess()
 * @model
 * @generated
 */
public interface ImageProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(Object[][])
	 * @see soft.graphics.GraphicsPackage#getImageProcess_Opacity()
	 * @model dataType="soft.graphics.FloatArray"
	 * @generated
	 */
	Object[][] getOpacity();

	/**
	 * Sets the value of the '{@link soft.graphics.ImageProcess#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(Object[][] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.graphics.BufferedImage" wholeMapDataType="soft.graphics.BufferedImage"
	 * @generated
	 */
	BufferedImage blending(BufferedImage wholeMap, AreaVector renewArea, int currentLayer, int scale);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.graphics.BufferedImage" wholeMapDataType="soft.graphics.BufferedImage"
	 * @generated
	 */
	BufferedImage scaling(BufferedImage wholeMap, int scale);

} // ImageProcess
