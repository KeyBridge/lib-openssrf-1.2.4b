package us.gov.dod.standard.ssrf._1_2_4.organisation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Email contains the email address of the Contact or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;EMail&gt;
 *   &lt;Preferred cls="U"&gt;Yes&lt;/Preferred&gt;
 *   &lt;Type cls="U"&gt;Internet&lt;/Type&gt;
 *   &lt;MaxCls cls="U"&gt;U&lt;/MaxCls&gt;
 *   &lt;Address&gt;john.doe@abc.com&lt;/Address&gt;
 * &lt;/EMail&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEmail", propOrder = {
  "value"
})
public class Email {

  @XmlValue
  protected String value;
  /**
   * MaxCls - System Maximum Classification (Optional)
   * <p>
   * The highest classification that can be used for the email address.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "system")
  protected String system;

  @XmlAttribute(name = "emailCls")
  protected String emailCls;

  @XmlAttribute(name = "emailType", required = true)
  protected String emailType;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get the highest classification that can be used for the email address.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the highest classification that can be used for the email address.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCls(String value) {
    this.cls = value;
  }

  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSystem() {
    return system;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSystem(String value) {
    this.system = value;
  }

  public boolean isSetSystem() {
    return (this.system != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getEmailCls() {
    return emailCls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setEmailCls(String value) {
    this.emailCls = value;
  }

  public boolean isSetEmailCls() {
    return (this.emailCls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getEmailType() {
    return emailType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setEmailType(String value) {
    this.emailType = value;
  }

  public boolean isSetEmailType() {
    return (this.emailType != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Email object instance
   * @since 3.1.0
   */
  public Email withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the highest classification that can be used for the email address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Email object instance
   * @since 3.1.0
   */
  public Email withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Email object instance
   * @since 3.1.0
   */
  public Email withSystem(String value) {
    setSystem(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Email object instance
   * @since 3.1.0
   */
  public Email withEmailCls(String value) {
    setEmailCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Email object instance
   * @since 3.1.0
   */
  public Email withEmailType(String value) {
    setEmailType(value);
    return this;
  }

  /**
   * Get a string representation of this Email instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Email {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Email} requires {@link null emailType}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEmailType();
  }

}
