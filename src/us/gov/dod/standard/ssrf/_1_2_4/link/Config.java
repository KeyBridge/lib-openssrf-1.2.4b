package us.gov.dod.standard.ssrf._1_2_4.link;

import java.math.BigDecimal;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListSC;
import us.gov.dod.standard.ssrf._1_2_4.shared.AntModeRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.SignalDescrModeRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.TxRxModeRef;

/**
 * Config
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConfig", propOrder = {
  "txRxModeRef",
  "signalDescrModeRef",
  "antModeRef",
  "eirp"
})
public class Config {

  @XmlElement(name = "TxRxModeRef")
  protected TxRxModeRef txRxModeRef;

  @XmlElement(name = "SignalDescrModeRef")
  protected SignalDescrModeRef signalDescrModeRef;

  @XmlElement(name = "AntModeRef")
  protected AntModeRef antModeRef;
  /**
   * EIRPMax - Maximum EIRP (Optional)
   * <p>
   * The maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EIRP")
  protected Config.EIRP eirp;
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

  @XmlAttribute(name = "name", required = true)
  protected String name;

  @XmlAttribute(name = "stnClass", required = true)
  protected ListSC stnClass;

  @XmlAttribute(name = "srvNature")
  protected String srvNature;
  /**
   * Repeater - Repeater Indicator (Optional)
   * <p>
   * "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "repeater")
  protected String repeater;

  /**
   * Get
   * <p>
   * @return the TxRxModeRef value in a {@link TxRxModeRef} data type
   * @since 3.1.0
   */
  public TxRxModeRef getTxRxModeRef() {
    return txRxModeRef;
  }

  /**
   * Set
   * <p>
   * @param value the TxRxModeRef value in a {@link TxRxModeRef} data type
   * @since 3.1.0
   */
  public void setTxRxModeRef(TxRxModeRef value) {
    this.txRxModeRef = value;
  }

  public boolean isSetTxRxModeRef() {
    return (this.txRxModeRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SignalDescrModeRef} instance
   * @since 3.1.0
   */
  public SignalDescrModeRef getSignalDescrModeRef() {
    return signalDescrModeRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SignalDescrModeRef} instance
   * @since 3.1.0
   */
  public void setSignalDescrModeRef(SignalDescrModeRef value) {
    this.signalDescrModeRef = value;
  }

  public boolean isSetSignalDescrModeRef() {
    return (this.signalDescrModeRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link AntModeRef} instance
   * @since 3.1.0
   */
  public AntModeRef getAntModeRef() {
    return antModeRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AntModeRef} instance
   * @since 3.1.0
   */
  public void setAntModeRef(AntModeRef value) {
    this.antModeRef = value;
  }

  public boolean isSetAntModeRef() {
    return (this.antModeRef != null);
  }

  public Config.EIRP getEIRP() {
    return eirp;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value a {@link Config} instance
   * @since 3.1.0
   */
  public void setEIRP(Config.EIRP value) {
    this.eirp = value;
  }

  public boolean isSetEIRP() {
    return (this.eirp != null);
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
  public String getName() {
    return name;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setName(String value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListSC} instance
   * @since 3.1.0
   */
  public ListSC getStnClass() {
    return stnClass;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListSC} instance
   * @since 3.1.0
   */
  public void setStnClass(ListSC value) {
    this.stnClass = value;
  }

  public boolean isSetStnClass() {
    return (this.stnClass != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSrvNature() {
    return srvNature;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSrvNature(String value) {
    this.srvNature = value;
  }

  public boolean isSetSrvNature() {
    return (this.srvNature != null);
  }

  /**
   * Get "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRepeater() {
    return repeater;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRepeater(String value) {
    this.repeater = value;
  }

  public boolean isSetRepeater() {
    return (this.repeater != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TxRxModeRef}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withTxRxModeRef(TxRxModeRef value) {
    setTxRxModeRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SignalDescrModeRef}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withSignalDescrModeRef(SignalDescrModeRef value) {
    setSignalDescrModeRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AntModeRef}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withAntModeRef(AntModeRef value) {
    setAntModeRef(value);
    return this;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value An instances of type {@link Config.EIRP}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withEIRP(Config.EIRP value) {
    setEIRP(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListSC}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withStnClass(ListSC value) {
    setStnClass(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withSrvNature(String value) {
    setSrvNature(value);
    return this;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Config object instance
   * @since 3.1.0
   */
  public Config withRepeater(String value) {
    setRepeater(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class EIRP {

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

    @XmlAttribute(name = "minEIRP")
    protected BigDecimal minEIRP;

    @XmlAttribute(name = "maxEIRP")
    protected BigDecimal maxEIRP;

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

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getMinEIRP() {
      return minEIRP;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setMinEIRP(BigDecimal value) {
      this.minEIRP = value;
    }

    public boolean isSetMinEIRP() {
      return (this.minEIRP != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getMaxEIRP() {
      return maxEIRP;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setMaxEIRP(BigDecimal value) {
      this.maxEIRP = value;
    }

    public boolean isSetMaxEIRP() {
      return (this.maxEIRP != null);
    }

    public Config.EIRP withCls(String value) {
      setCls(value);
      return this;
    }

    public Config.EIRP withMinEIRP(BigDecimal value) {
      setMinEIRP(value);
      return this;
    }

    public Config.EIRP withMaxEIRP(BigDecimal value) {
      setMaxEIRP(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Config instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Config {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Config} requires {@link null name}, {@link null stnClass}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName() && isSetStnClass();
  }

}
