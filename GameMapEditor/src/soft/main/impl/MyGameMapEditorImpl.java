/**
 */
package soft.main.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.main.MainPackage;
import soft.main.MyGameMapEditor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Game Map Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MyGameMapEditorImpl extends MinimalEObjectImpl.Container implements MyGameMapEditor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyGameMapEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainPackage.Literals.MY_GAME_MAP_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MainPackage.MY_GAME_MAP_EDITOR___MAIN:
				main();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MyGameMapEditorImpl
