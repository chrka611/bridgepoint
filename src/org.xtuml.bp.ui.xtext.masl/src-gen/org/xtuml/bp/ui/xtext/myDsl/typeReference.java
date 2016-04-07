/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.typeReference#getC <em>C</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#gettypeReference()
 * @model
 * @generated
 */
public interface typeReference extends typeReferenceWithCA, parameterType, returnType
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(collectionTypeRef)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#gettypeReference_C()
   * @model containment="true"
   * @generated
   */
  collectionTypeRef getC();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.typeReference#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(collectionTypeRef value);

} // typeReference