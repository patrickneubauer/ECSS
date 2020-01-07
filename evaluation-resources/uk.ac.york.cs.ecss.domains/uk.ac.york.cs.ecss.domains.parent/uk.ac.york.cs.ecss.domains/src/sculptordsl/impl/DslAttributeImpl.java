/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslAttribute;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isIndex <em>Index</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isAssertFalse <em>Assert False</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getAssertFalseMessage <em>Assert False Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isAssertTrue <em>Assert True</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getAssertTrueMessage <em>Assert True Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isCreditCardNumber <em>Credit Card Number</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getCreditCardNumberMessage <em>Credit Card Number Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isEmail <em>Email</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isFuture <em>Future</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getFutureMessage <em>Future Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isPast <em>Past</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getPastMessage <em>Past Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getDecimalMax <em>Decimal Max</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getDecimalMin <em>Decimal Min</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#isNotBlank <em>Not Blank</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getNotBlankMessage <em>Not Blank Message</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getScriptAssert <em>Script Assert</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link sculptordsl.impl.DslAttributeImpl#getDatabaseType <em>Database Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslAttributeImpl extends DslPropertyImpl implements DslAttribute {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndex()
	 * @generated
	 * @ordered
	 */
	protected boolean index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssertFalse() <em>Assert False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssertFalse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSERT_FALSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssertFalse() <em>Assert False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssertFalse()
	 * @generated
	 * @ordered
	 */
	protected boolean assertFalse = ASSERT_FALSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssertFalseMessage() <em>Assert False Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertFalseMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSERT_FALSE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssertFalseMessage() <em>Assert False Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertFalseMessage()
	 * @generated
	 * @ordered
	 */
	protected String assertFalseMessage = ASSERT_FALSE_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssertTrue() <em>Assert True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssertTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSERT_TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssertTrue() <em>Assert True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssertTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean assertTrue = ASSERT_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssertTrueMessage() <em>Assert True Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertTrueMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSERT_TRUE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssertTrueMessage() <em>Assert True Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertTrueMessage()
	 * @generated
	 * @ordered
	 */
	protected String assertTrueMessage = ASSERT_TRUE_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreditCardNumber() <em>Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreditCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREDIT_CARD_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreditCardNumber() <em>Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreditCardNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean creditCardNumber = CREDIT_CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditCardNumberMessage() <em>Credit Card Number Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardNumberMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDIT_CARD_NUMBER_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditCardNumberMessage() <em>Credit Card Number Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardNumberMessage()
	 * @generated
	 * @ordered
	 */
	protected String creditCardNumberMessage = CREDIT_CARD_NUMBER_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected String digits = DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailMessage = EMAIL_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFuture() <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFuture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFuture() <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFuture()
	 * @generated
	 * @ordered
	 */
	protected boolean future = FUTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFutureMessage() <em>Future Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFutureMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FUTURE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFutureMessage() <em>Future Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFutureMessage()
	 * @generated
	 * @ordered
	 */
	protected String futureMessage = FUTURE_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPast() <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPast() <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPast()
	 * @generated
	 * @ordered
	 */
	protected boolean past = PAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPastMessage() <em>Past Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String PAST_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPastMessage() <em>Past Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMessage()
	 * @generated
	 * @ordered
	 */
	protected String pastMessage = PAST_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalMax() <em>Decimal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMax()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalMax() <em>Decimal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMax()
	 * @generated
	 * @ordered
	 */
	protected String decimalMax = DECIMAL_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalMin() <em>Decimal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMin()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIMAL_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalMin() <em>Decimal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMin()
	 * @generated
	 * @ordered
	 */
	protected String decimalMin = DECIMAL_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotBlank() <em>Not Blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotBlank()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_BLANK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotBlank() <em>Not Blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotBlank()
	 * @generated
	 * @ordered
	 */
	protected boolean notBlank = NOT_BLANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotBlankMessage() <em>Not Blank Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotBlankMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_BLANK_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotBlankMessage() <em>Not Blank Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotBlankMessage()
	 * @generated
	 * @ordered
	 */
	protected String notBlankMessage = NOT_BLANK_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptAssert() <em>Script Assert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptAssert()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_ASSERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptAssert() <em>Script Assert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptAssert()
	 * @generated
	 * @ordered
	 */
	protected String scriptAssert = SCRIPT_ASSERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected String databaseType = DATABASE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(boolean newIndex) {
		boolean oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAssertFalse() {
		return assertFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertFalse(boolean newAssertFalse) {
		boolean oldAssertFalse = assertFalse;
		assertFalse = newAssertFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE, oldAssertFalse, assertFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssertFalseMessage() {
		return assertFalseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertFalseMessage(String newAssertFalseMessage) {
		String oldAssertFalseMessage = assertFalseMessage;
		assertFalseMessage = newAssertFalseMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE, oldAssertFalseMessage, assertFalseMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAssertTrue() {
		return assertTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertTrue(boolean newAssertTrue) {
		boolean oldAssertTrue = assertTrue;
		assertTrue = newAssertTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE, oldAssertTrue, assertTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssertTrueMessage() {
		return assertTrueMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssertTrueMessage(String newAssertTrueMessage) {
		String oldAssertTrueMessage = assertTrueMessage;
		assertTrueMessage = newAssertTrueMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE, oldAssertTrueMessage, assertTrueMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditCardNumber(boolean newCreditCardNumber) {
		boolean oldCreditCardNumber = creditCardNumber;
		creditCardNumber = newCreditCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER, oldCreditCardNumber, creditCardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreditCardNumberMessage() {
		return creditCardNumberMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditCardNumberMessage(String newCreditCardNumberMessage) {
		String oldCreditCardNumberMessage = creditCardNumberMessage;
		creditCardNumberMessage = newCreditCardNumberMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE, oldCreditCardNumberMessage, creditCardNumberMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigits() {
		return digits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigits(String newDigits) {
		String oldDigits = digits;
		digits = newDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__DIGITS, oldDigits, digits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(boolean newEmail) {
		boolean oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailMessage() {
		return emailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailMessage(String newEmailMessage) {
		String oldEmailMessage = emailMessage;
		emailMessage = newEmailMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__EMAIL_MESSAGE, oldEmailMessage, emailMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFuture() {
		return future;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuture(boolean newFuture) {
		boolean oldFuture = future;
		future = newFuture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__FUTURE, oldFuture, future));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFutureMessage() {
		return futureMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFutureMessage(String newFutureMessage) {
		String oldFutureMessage = futureMessage;
		futureMessage = newFutureMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__FUTURE_MESSAGE, oldFutureMessage, futureMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPast() {
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPast(boolean newPast) {
		boolean oldPast = past;
		past = newPast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__PAST, oldPast, past));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPastMessage() {
		return pastMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPastMessage(String newPastMessage) {
		String oldPastMessage = pastMessage;
		pastMessage = newPastMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__PAST_MESSAGE, oldPastMessage, pastMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecimalMax() {
		return decimalMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalMax(String newDecimalMax) {
		String oldDecimalMax = decimalMax;
		decimalMax = newDecimalMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MAX, oldDecimalMax, decimalMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecimalMin() {
		return decimalMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalMin(String newDecimalMin) {
		String oldDecimalMin = decimalMin;
		decimalMin = newDecimalMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MIN, oldDecimalMin, decimalMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotBlank() {
		return notBlank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotBlank(boolean newNotBlank) {
		boolean oldNotBlank = notBlank;
		notBlank = newNotBlank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK, oldNotBlank, notBlank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotBlankMessage() {
		return notBlankMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotBlankMessage(String newNotBlankMessage) {
		String oldNotBlankMessage = notBlankMessage;
		notBlankMessage = newNotBlankMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK_MESSAGE, oldNotBlankMessage, notBlankMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptAssert() {
		return scriptAssert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptAssert(String newScriptAssert) {
		String oldScriptAssert = scriptAssert;
		scriptAssert = newScriptAssert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__SCRIPT_ASSERT, oldScriptAssert, scriptAssert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseType() {
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseType(String newDatabaseType) {
		String oldDatabaseType = databaseType;
		databaseType = newDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_ATTRIBUTE__DATABASE_TYPE, oldDatabaseType, databaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_ATTRIBUTE__TYPE:
				return getType();
			case SculptordslPackage.DSL_ATTRIBUTE__INDEX:
				return isIndex();
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE:
				return isAssertFalse();
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE:
				return getAssertFalseMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE:
				return isAssertTrue();
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE:
				return getAssertTrueMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER:
				return isCreditCardNumber();
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE:
				return getCreditCardNumberMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__DIGITS:
				return getDigits();
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL:
				return isEmail();
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL_MESSAGE:
				return getEmailMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE:
				return isFuture();
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE_MESSAGE:
				return getFutureMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__PAST:
				return isPast();
			case SculptordslPackage.DSL_ATTRIBUTE__PAST_MESSAGE:
				return getPastMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__MAX:
				return getMax();
			case SculptordslPackage.DSL_ATTRIBUTE__MIN:
				return getMin();
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MAX:
				return getDecimalMax();
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MIN:
				return getDecimalMin();
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK:
				return isNotBlank();
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK_MESSAGE:
				return getNotBlankMessage();
			case SculptordslPackage.DSL_ATTRIBUTE__PATTERN:
				return getPattern();
			case SculptordslPackage.DSL_ATTRIBUTE__RANGE:
				return getRange();
			case SculptordslPackage.DSL_ATTRIBUTE__LENGTH:
				return getLength();
			case SculptordslPackage.DSL_ATTRIBUTE__SCRIPT_ASSERT:
				return getScriptAssert();
			case SculptordslPackage.DSL_ATTRIBUTE__URL:
				return getUrl();
			case SculptordslPackage.DSL_ATTRIBUTE__DATABASE_TYPE:
				return getDatabaseType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SculptordslPackage.DSL_ATTRIBUTE__TYPE:
				setType((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__INDEX:
				setIndex((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE:
				setAssertFalse((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE:
				setAssertFalseMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE:
				setAssertTrue((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE:
				setAssertTrueMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER:
				setCreditCardNumber((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE:
				setCreditCardNumberMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DIGITS:
				setDigits((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL:
				setEmail((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL_MESSAGE:
				setEmailMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE:
				setFuture((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE_MESSAGE:
				setFutureMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PAST:
				setPast((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PAST_MESSAGE:
				setPastMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__MAX:
				setMax((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__MIN:
				setMin((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MAX:
				setDecimalMax((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MIN:
				setDecimalMin((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK:
				setNotBlank((Boolean)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK_MESSAGE:
				setNotBlankMessage((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PATTERN:
				setPattern((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__RANGE:
				setRange((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__LENGTH:
				setLength((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__SCRIPT_ASSERT:
				setScriptAssert((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__URL:
				setUrl((String)newValue);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DATABASE_TYPE:
				setDatabaseType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SculptordslPackage.DSL_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE:
				setAssertFalse(ASSERT_FALSE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE:
				setAssertFalseMessage(ASSERT_FALSE_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE:
				setAssertTrue(ASSERT_TRUE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE:
				setAssertTrueMessage(ASSERT_TRUE_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER:
				setCreditCardNumber(CREDIT_CARD_NUMBER_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE:
				setCreditCardNumberMessage(CREDIT_CARD_NUMBER_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DIGITS:
				setDigits(DIGITS_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL_MESSAGE:
				setEmailMessage(EMAIL_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE:
				setFuture(FUTURE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE_MESSAGE:
				setFutureMessage(FUTURE_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PAST:
				setPast(PAST_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PAST_MESSAGE:
				setPastMessage(PAST_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MAX:
				setDecimalMax(DECIMAL_MAX_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MIN:
				setDecimalMin(DECIMAL_MIN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK:
				setNotBlank(NOT_BLANK_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK_MESSAGE:
				setNotBlankMessage(NOT_BLANK_MESSAGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__SCRIPT_ASSERT:
				setScriptAssert(SCRIPT_ASSERT_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case SculptordslPackage.DSL_ATTRIBUTE__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SculptordslPackage.DSL_ATTRIBUTE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SculptordslPackage.DSL_ATTRIBUTE__INDEX:
				return index != INDEX_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE:
				return assertFalse != ASSERT_FALSE_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE:
				return ASSERT_FALSE_MESSAGE_EDEFAULT == null ? assertFalseMessage != null : !ASSERT_FALSE_MESSAGE_EDEFAULT.equals(assertFalseMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE:
				return assertTrue != ASSERT_TRUE_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE:
				return ASSERT_TRUE_MESSAGE_EDEFAULT == null ? assertTrueMessage != null : !ASSERT_TRUE_MESSAGE_EDEFAULT.equals(assertTrueMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER:
				return creditCardNumber != CREDIT_CARD_NUMBER_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE:
				return CREDIT_CARD_NUMBER_MESSAGE_EDEFAULT == null ? creditCardNumberMessage != null : !CREDIT_CARD_NUMBER_MESSAGE_EDEFAULT.equals(creditCardNumberMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__DIGITS:
				return DIGITS_EDEFAULT == null ? digits != null : !DIGITS_EDEFAULT.equals(digits);
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL:
				return email != EMAIL_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__EMAIL_MESSAGE:
				return EMAIL_MESSAGE_EDEFAULT == null ? emailMessage != null : !EMAIL_MESSAGE_EDEFAULT.equals(emailMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE:
				return future != FUTURE_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__FUTURE_MESSAGE:
				return FUTURE_MESSAGE_EDEFAULT == null ? futureMessage != null : !FUTURE_MESSAGE_EDEFAULT.equals(futureMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__PAST:
				return past != PAST_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__PAST_MESSAGE:
				return PAST_MESSAGE_EDEFAULT == null ? pastMessage != null : !PAST_MESSAGE_EDEFAULT.equals(pastMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case SculptordslPackage.DSL_ATTRIBUTE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MAX:
				return DECIMAL_MAX_EDEFAULT == null ? decimalMax != null : !DECIMAL_MAX_EDEFAULT.equals(decimalMax);
			case SculptordslPackage.DSL_ATTRIBUTE__DECIMAL_MIN:
				return DECIMAL_MIN_EDEFAULT == null ? decimalMin != null : !DECIMAL_MIN_EDEFAULT.equals(decimalMin);
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK:
				return notBlank != NOT_BLANK_EDEFAULT;
			case SculptordslPackage.DSL_ATTRIBUTE__NOT_BLANK_MESSAGE:
				return NOT_BLANK_MESSAGE_EDEFAULT == null ? notBlankMessage != null : !NOT_BLANK_MESSAGE_EDEFAULT.equals(notBlankMessage);
			case SculptordslPackage.DSL_ATTRIBUTE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case SculptordslPackage.DSL_ATTRIBUTE__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case SculptordslPackage.DSL_ATTRIBUTE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case SculptordslPackage.DSL_ATTRIBUTE__SCRIPT_ASSERT:
				return SCRIPT_ASSERT_EDEFAULT == null ? scriptAssert != null : !SCRIPT_ASSERT_EDEFAULT.equals(scriptAssert);
			case SculptordslPackage.DSL_ATTRIBUTE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case SculptordslPackage.DSL_ATTRIBUTE__DATABASE_TYPE:
				return DATABASE_TYPE_EDEFAULT == null ? databaseType != null : !DATABASE_TYPE_EDEFAULT.equals(databaseType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", index: ");
		result.append(index);
		result.append(", assertFalse: ");
		result.append(assertFalse);
		result.append(", assertFalseMessage: ");
		result.append(assertFalseMessage);
		result.append(", assertTrue: ");
		result.append(assertTrue);
		result.append(", assertTrueMessage: ");
		result.append(assertTrueMessage);
		result.append(", creditCardNumber: ");
		result.append(creditCardNumber);
		result.append(", creditCardNumberMessage: ");
		result.append(creditCardNumberMessage);
		result.append(", digits: ");
		result.append(digits);
		result.append(", email: ");
		result.append(email);
		result.append(", emailMessage: ");
		result.append(emailMessage);
		result.append(", future: ");
		result.append(future);
		result.append(", futureMessage: ");
		result.append(futureMessage);
		result.append(", past: ");
		result.append(past);
		result.append(", pastMessage: ");
		result.append(pastMessage);
		result.append(", max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
		result.append(", decimalMax: ");
		result.append(decimalMax);
		result.append(", decimalMin: ");
		result.append(decimalMin);
		result.append(", notBlank: ");
		result.append(notBlank);
		result.append(", notBlankMessage: ");
		result.append(notBlankMessage);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", range: ");
		result.append(range);
		result.append(", length: ");
		result.append(length);
		result.append(", scriptAssert: ");
		result.append(scriptAssert);
		result.append(", url: ");
		result.append(url);
		result.append(", databaseType: ");
		result.append(databaseType);
		result.append(')');
		return result.toString();
	}

} //DslAttributeImpl
