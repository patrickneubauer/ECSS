/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslAttribute#getType <em>Type</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isIndex <em>Index</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isAssertFalse <em>Assert False</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getAssertFalseMessage <em>Assert False Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isAssertTrue <em>Assert True</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getAssertTrueMessage <em>Assert True Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isCreditCardNumber <em>Credit Card Number</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getCreditCardNumberMessage <em>Credit Card Number Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getDigits <em>Digits</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isEmail <em>Email</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isFuture <em>Future</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getFutureMessage <em>Future Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isPast <em>Past</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getPastMessage <em>Past Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getMax <em>Max</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getMin <em>Min</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getDecimalMax <em>Decimal Max</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getDecimalMin <em>Decimal Min</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#isNotBlank <em>Not Blank</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getNotBlankMessage <em>Not Blank Message</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getPattern <em>Pattern</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getRange <em>Range</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getLength <em>Length</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getScriptAssert <em>Script Assert</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getUrl <em>Url</em>}</li>
 *   <li>{@link sculptordsl.DslAttribute#getDatabaseType <em>Database Type</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslAttribute()
 * @model
 * @generated
 */
public interface DslAttribute extends DslProperty {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Index()
	 * @model
	 * @generated
	 */
	boolean isIndex();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #isIndex()
	 * @generated
	 */
	void setIndex(boolean value);

	/**
	 * Returns the value of the '<em><b>Assert False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert False</em>' attribute.
	 * @see #setAssertFalse(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_AssertFalse()
	 * @model
	 * @generated
	 */
	boolean isAssertFalse();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isAssertFalse <em>Assert False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert False</em>' attribute.
	 * @see #isAssertFalse()
	 * @generated
	 */
	void setAssertFalse(boolean value);

	/**
	 * Returns the value of the '<em><b>Assert False Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert False Message</em>' attribute.
	 * @see #setAssertFalseMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_AssertFalseMessage()
	 * @model
	 * @generated
	 */
	String getAssertFalseMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getAssertFalseMessage <em>Assert False Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert False Message</em>' attribute.
	 * @see #getAssertFalseMessage()
	 * @generated
	 */
	void setAssertFalseMessage(String value);

	/**
	 * Returns the value of the '<em><b>Assert True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert True</em>' attribute.
	 * @see #setAssertTrue(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_AssertTrue()
	 * @model
	 * @generated
	 */
	boolean isAssertTrue();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isAssertTrue <em>Assert True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert True</em>' attribute.
	 * @see #isAssertTrue()
	 * @generated
	 */
	void setAssertTrue(boolean value);

	/**
	 * Returns the value of the '<em><b>Assert True Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert True Message</em>' attribute.
	 * @see #setAssertTrueMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_AssertTrueMessage()
	 * @model
	 * @generated
	 */
	String getAssertTrueMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getAssertTrueMessage <em>Assert True Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert True Message</em>' attribute.
	 * @see #getAssertTrueMessage()
	 * @generated
	 */
	void setAssertTrueMessage(String value);

	/**
	 * Returns the value of the '<em><b>Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Number</em>' attribute.
	 * @see #setCreditCardNumber(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_CreditCardNumber()
	 * @model
	 * @generated
	 */
	boolean isCreditCardNumber();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isCreditCardNumber <em>Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Number</em>' attribute.
	 * @see #isCreditCardNumber()
	 * @generated
	 */
	void setCreditCardNumber(boolean value);

	/**
	 * Returns the value of the '<em><b>Credit Card Number Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Number Message</em>' attribute.
	 * @see #setCreditCardNumberMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_CreditCardNumberMessage()
	 * @model
	 * @generated
	 */
	String getCreditCardNumberMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getCreditCardNumberMessage <em>Credit Card Number Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Number Message</em>' attribute.
	 * @see #getCreditCardNumberMessage()
	 * @generated
	 */
	void setCreditCardNumberMessage(String value);

	/**
	 * Returns the value of the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digits</em>' attribute.
	 * @see #setDigits(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Digits()
	 * @model
	 * @generated
	 */
	String getDigits();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getDigits <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digits</em>' attribute.
	 * @see #getDigits()
	 * @generated
	 */
	void setDigits(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Email()
	 * @model
	 * @generated
	 */
	boolean isEmail();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #isEmail()
	 * @generated
	 */
	void setEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Message</em>' attribute.
	 * @see #setEmailMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_EmailMessage()
	 * @model
	 * @generated
	 */
	String getEmailMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getEmailMessage <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Message</em>' attribute.
	 * @see #getEmailMessage()
	 * @generated
	 */
	void setEmailMessage(String value);

	/**
	 * Returns the value of the '<em><b>Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Future</em>' attribute.
	 * @see #setFuture(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Future()
	 * @model
	 * @generated
	 */
	boolean isFuture();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isFuture <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Future</em>' attribute.
	 * @see #isFuture()
	 * @generated
	 */
	void setFuture(boolean value);

	/**
	 * Returns the value of the '<em><b>Future Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Future Message</em>' attribute.
	 * @see #setFutureMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_FutureMessage()
	 * @model
	 * @generated
	 */
	String getFutureMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getFutureMessage <em>Future Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Future Message</em>' attribute.
	 * @see #getFutureMessage()
	 * @generated
	 */
	void setFutureMessage(String value);

	/**
	 * Returns the value of the '<em><b>Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past</em>' attribute.
	 * @see #setPast(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Past()
	 * @model
	 * @generated
	 */
	boolean isPast();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isPast <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past</em>' attribute.
	 * @see #isPast()
	 * @generated
	 */
	void setPast(boolean value);

	/**
	 * Returns the value of the '<em><b>Past Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past Message</em>' attribute.
	 * @see #setPastMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_PastMessage()
	 * @model
	 * @generated
	 */
	String getPastMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getPastMessage <em>Past Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past Message</em>' attribute.
	 * @see #getPastMessage()
	 * @generated
	 */
	void setPastMessage(String value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Max()
	 * @model
	 * @generated
	 */
	String getMax();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Min()
	 * @model
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Max</em>' attribute.
	 * @see #setDecimalMax(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_DecimalMax()
	 * @model
	 * @generated
	 */
	String getDecimalMax();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getDecimalMax <em>Decimal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Max</em>' attribute.
	 * @see #getDecimalMax()
	 * @generated
	 */
	void setDecimalMax(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Min</em>' attribute.
	 * @see #setDecimalMin(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_DecimalMin()
	 * @model
	 * @generated
	 */
	String getDecimalMin();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getDecimalMin <em>Decimal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Min</em>' attribute.
	 * @see #getDecimalMin()
	 * @generated
	 */
	void setDecimalMin(String value);

	/**
	 * Returns the value of the '<em><b>Not Blank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Blank</em>' attribute.
	 * @see #setNotBlank(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_NotBlank()
	 * @model
	 * @generated
	 */
	boolean isNotBlank();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#isNotBlank <em>Not Blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Blank</em>' attribute.
	 * @see #isNotBlank()
	 * @generated
	 */
	void setNotBlank(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Blank Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Blank Message</em>' attribute.
	 * @see #setNotBlankMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_NotBlankMessage()
	 * @model
	 * @generated
	 */
	String getNotBlankMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getNotBlankMessage <em>Not Blank Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Blank Message</em>' attribute.
	 * @see #getNotBlankMessage()
	 * @generated
	 */
	void setNotBlankMessage(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Range()
	 * @model
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Script Assert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Assert</em>' attribute.
	 * @see #setScriptAssert(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_ScriptAssert()
	 * @model
	 * @generated
	 */
	String getScriptAssert();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getScriptAssert <em>Script Assert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Assert</em>' attribute.
	 * @see #getScriptAssert()
	 * @generated
	 */
	void setScriptAssert(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see #setDatabaseType(String)
	 * @see sculptordsl.SculptordslPackage#getDslAttribute_DatabaseType()
	 * @model
	 * @generated
	 */
	String getDatabaseType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAttribute#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(String value);

} // DslAttribute
