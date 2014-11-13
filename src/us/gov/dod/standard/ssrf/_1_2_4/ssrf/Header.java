package us.gov.dod.standard.ssrf._1_2_4.ssrf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;

/**
 * Header
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THeader", propOrder = {
  "digest",
  "msgInfo",
  "msgCls",
  "any"
})
public class Header {

  @XmlElement(name = "Digest")
  protected Header.Digest digest;

  @XmlElement(name = "MsgInfo", required = true)
  protected Header.MsgInfo msgInfo;

  @XmlElement(name = "MsgCls", required = true)
  protected String msgCls;
  @XmlAnyElement(lax = true)
  protected Set<Object> any;

  public Header.Digest getDigest() {
    return digest;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Header} instance
   * @since 3.1.0
   */
  public void setDigest(Header.Digest value) {
    this.digest = value;
  }

  public boolean isSetDigest() {
    return (this.digest != null);
  }

  public Header.MsgInfo getMsgInfo() {
    return msgInfo;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Header} instance
   * @since 3.1.0
   */
  public void setMsgInfo(Header.MsgInfo value) {
    this.msgInfo = value;
  }

  public boolean isSetMsgInfo() {
    return (this.msgInfo != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getMsgCls() {
    return msgCls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setMsgCls(String value) {
    this.msgCls = value;
  }

  public boolean isSetMsgCls() {
    return (this.msgCls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Object} instance
   * @since 3.1.0
   */
  public Set<Object> getAny() {
    if (any == null) {
      any = new HashSet<>();
    }
    return this.any;
  }

  public boolean isSetAny() {
    return ((this.any != null) && (!this.any.isEmpty()));
  }

  /**
   * Clear the Any field. This sets the field to null.
   */
  public void unsetAny() {
    this.any = null;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Header.Digest}
   * @return The current Header object instance
   * @since 3.1.0
   */
  public Header withDigest(Header.Digest value) {
    setDigest(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Header.MsgInfo}
   * @return The current Header object instance
   * @since 3.1.0
   */
  public Header withMsgInfo(Header.MsgInfo value) {
    setMsgInfo(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Header object instance
   * @since 3.1.0
   */
  public Header withMsgCls(String value) {
    setMsgCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Object...}
   * @return The current Header object instance
   * @since 3.1.0
   */
  public Header withAny(Object... values) {
    if (values != null) {
      getAny().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Any} instances
   * @return The current Header object instance
   * @since 3.1.0
   */
  public Header withAny(Collection<Object> values) {
    if (values != null) {
      getAny().addAll(values);
    }
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class Digest {

    @XmlValue
    protected String value;

    @XmlAttribute(name = "algorithm", required = true)
    protected String algorithm;

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
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getAlgorithm() {
      return algorithm;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setAlgorithm(String value) {
      this.algorithm = value;
    }

    public boolean isSetAlgorithm() {
      return (this.algorithm != null);
    }

    public Header.Digest withValue(String value) {
      setValue(value);
      return this;
    }

    public Header.Digest withAlgorithm(String value) {
      setAlgorithm(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class MsgInfo {

    @XmlValue
    protected String value;

    @XmlAttribute(name = "serial", required = true)
    protected String serial;

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
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getSerial() {
      return serial;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setSerial(String value) {
      this.serial = value;
    }

    public boolean isSetSerial() {
      return (this.serial != null);
    }

    public Header.MsgInfo withValue(String value) {
      setValue(value);
      return this;
    }

    public Header.MsgInfo withSerial(String value) {
      setSerial(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Header instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Header {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Header} requires
   * {@link null MsgCls}, {@link null MsgInfo}, {@link null algorithm}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetMsgCls() && isSetMsgInfo();
  }

}
