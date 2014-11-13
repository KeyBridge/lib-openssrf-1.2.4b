package us.gov.dod.standard.ssrf._1_2_4.link;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * RxStation
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRxStation", propOrder = {
  "antHeight",
  "pointing",
  "blanking",
  "otherConfigRef"
})
public class RxStation {

  @XmlElement(name = "AntHeight")
  protected AntHeight antHeight;

  @XmlElement(name = "Pointing")
  protected Pointing pointing;

  @XmlElement(name = "Blanking")
  protected Set<Blanking> blanking;

  @XmlElement(name = "OtherConfigRef")
  protected Set<OtherConfigRef> otherConfigRef;
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

  @XmlAttribute(name = "configRef")
  protected String configRef;

  @XmlAttribute(name = "stationRef", required = true)
  protected String stationRef;

  /**
   * Get
   * <p>
   * @return a {@link AntHeight} instance
   * @since 3.1.0
   */
  public AntHeight getAntHeight() {
    return antHeight;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AntHeight} instance
   * @since 3.1.0
   */
  public void setAntHeight(AntHeight value) {
    this.antHeight = value;
  }

  public boolean isSetAntHeight() {
    return (this.antHeight != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Pointing} instance
   * @since 3.1.0
   */
  public Pointing getPointing() {
    return pointing;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Pointing} instance
   * @since 3.1.0
   */
  public void setPointing(Pointing value) {
    this.pointing = value;
  }

  public boolean isSetPointing() {
    return (this.pointing != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Blanking} instance
   * @since 3.1.0
   */
  public Set<Blanking> getBlanking() {
    if (blanking == null) {
      blanking = new HashSet<>();
    }
    return this.blanking;
  }

  public boolean isSetBlanking() {
    return ((this.blanking != null) && (!this.blanking.isEmpty()));
  }

  /**
   * Clear the Blanking field. This sets the field to null.
   */
  public void unsetBlanking() {
    this.blanking = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link OtherConfigRef} instance
   * @since 3.1.0
   */
  public Set<OtherConfigRef> getOtherConfigRef() {
    if (otherConfigRef == null) {
      otherConfigRef = new HashSet<>();
    }
    return this.otherConfigRef;
  }

  public boolean isSetOtherConfigRef() {
    return ((this.otherConfigRef != null) && (!this.otherConfigRef.isEmpty()));
  }

  /**
   * Clear the OtherConfigRef field. This sets the field to null.
   */
  public void unsetOtherConfigRef() {
    this.otherConfigRef = null;
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
  public String getConfigRef() {
    return configRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setConfigRef(String value) {
    this.configRef = value;
  }

  public boolean isSetConfigRef() {
    return (this.configRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getStationRef() {
    return stationRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setStationRef(String value) {
    this.stationRef = value;
  }

  public boolean isSetStationRef() {
    return (this.stationRef != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AntHeight}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withAntHeight(AntHeight value) {
    setAntHeight(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Pointing}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withPointing(Pointing value) {
    setPointing(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Blanking...}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withBlanking(Blanking... values) {
    if (values != null) {
      getBlanking().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Blanking} instances
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withBlanking(Collection<Blanking> values) {
    if (values != null) {
      getBlanking().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link OtherConfigRef...}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withOtherConfigRef(OtherConfigRef... values) {
    if (values != null) {
      getOtherConfigRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link OtherConfigRef} instances
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withOtherConfigRef(Collection<OtherConfigRef> values) {
    if (values != null) {
      getOtherConfigRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withConfigRef(String value) {
    setConfigRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxStation object instance
   * @since 3.1.0
   */
  public RxStation withStationRef(String value) {
    setStationRef(value);
    return this;
  }

  /**
   * Get a string representation of this RxStation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxStation {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxStation} requires {@link null stationRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetStationRef();
  }

}
