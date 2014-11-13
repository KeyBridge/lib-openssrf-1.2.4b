package us.gov.dod.standard.ssrf._1_2_4.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * ClsOrigin
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TClsOrigin", propOrder = {
  "clsReason"
})
public class ClsOrigin {

  @XmlElement(name = "ClsReason")
  protected ClsOrigin.ClsReason clsReason;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "authority", required = true)
  protected String authority;

  @XmlAttribute(name = "org", required = true)
  protected String org;

  public ClsOrigin.ClsReason getClsReason() {
    return clsReason;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ClsOrigin} instance
   * @since 3.1.0
   */
  public void setClsReason(ClsOrigin.ClsReason value) {
    this.clsReason = value;
  }

  public boolean isSetClsReason() {
    return (this.clsReason != null);
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
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
  public String getAuthority() {
    return authority;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAuthority(String value) {
    this.authority = value;
  }

  public boolean isSetAuthority() {
    return (this.authority != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrg() {
    return org;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrg(String value) {
    this.org = value;
  }

  public boolean isSetOrg() {
    return (this.org != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClsOrigin.ClsReason}
   * @return The current ClsOrigin object instance
   * @since 3.1.0
   */
  public ClsOrigin withClsReason(ClsOrigin.ClsReason value) {
    setClsReason(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsOrigin object instance
   * @since 3.1.0
   */
  public ClsOrigin withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsOrigin object instance
   * @since 3.1.0
   */
  public ClsOrigin withAuthority(String value) {
    setAuthority(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsOrigin object instance
   * @since 3.1.0
   */
  public ClsOrigin withOrg(String value) {
    setOrg(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class ClsReason {

    @XmlValue
    protected String value;
    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;

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
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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

    public ClsOrigin.ClsReason withValue(String value) {
      setValue(value);
      return this;
    }

    public ClsOrigin.ClsReason withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this ClsOrigin instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ClsOrigin {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ClsOrigin} requires {@link null authority}, {@link null org}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAuthority() && isSetOrg();
  }

}
