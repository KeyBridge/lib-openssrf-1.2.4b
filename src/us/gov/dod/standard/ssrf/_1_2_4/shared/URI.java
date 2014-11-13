package us.gov.dod.standard.ssrf._1_2_4.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * URI
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TURI", propOrder = {
  "value"
})
public class URI {

  @XmlValue
  protected String value;
  /**
   * US:ClsAuthority - Original Classification Authority (Optional)
   * <p>
   * The identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "network", required = true)
  protected String network;

  @XmlAttribute(name = "authRequired", required = true)
  protected String authRequired;

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
   * Get the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
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
  public String getNetwork() {
    return network;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setNetwork(String value) {
    this.network = value;
  }

  public boolean isSetNetwork() {
    return (this.network != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAuthRequired() {
    return authRequired;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAuthRequired(String value) {
    this.authRequired = value;
  }

  public boolean isSetAuthRequired() {
    return (this.authRequired != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current URI object instance
   * @since 3.1.0
   */
  public URI withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current URI object instance
   * @since 3.1.0
   */
  public URI withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current URI object instance
   * @since 3.1.0
   */
  public URI withNetwork(String value) {
    setNetwork(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current URI object instance
   * @since 3.1.0
   */
  public URI withAuthRequired(String value) {
    setAuthRequired(value);
    return this;
  }

  /**
   * Get a string representation of this URI instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "URI {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link URI} requires {@link null authRequired}, {@link null network}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAuthRequired() && isSetNetwork();
  }

}
