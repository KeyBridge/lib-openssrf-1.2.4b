package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;

/**
 * Manufacturer contains the manufacturer name of the equipment listed in the
 * corresponding data entry in data element Nomenclature. Additionally the
 * country in which the equipment is manufactured may be included.
 * <p>
 * Element of {@link Nomenclature}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TManufacturer", propOrder = {
  "fscm"
})
public class Manufacturer {

  @XmlElement(name = "FSCM")
  protected Set<Manufacturer.FSCM> fscm;
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
  /**
   * Country - Country/Area (Optional)
   * <p>
   * The country or area in which the Manufacturer has its Headquarters.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "country")
  protected ListAO country;

  @XmlAttribute(name = "code", required = true)
  protected String code;

  public Set<Manufacturer.FSCM> getFSCM() {
    if (fscm == null) {
      fscm = new HashSet<>();
    }
    return this.fscm;
  }

  public boolean isSetFSCM() {
    return ((this.fscm != null) && (!this.fscm.isEmpty()));
  }

  /**
   * Clear the FSCM field. This sets the field to null.
   */
  public void unsetFSCM() {
    this.fscm = null;
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
   * Get the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getCountry() {
    return country;
  }

  /**
   * Set the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setCountry(ListAO value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCode() {
    return code;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCode(String value) {
    this.code = value;
  }

  public boolean isSetCode() {
    return (this.code != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Manufacturer.FSCM...}
   * @return The current Manufacturer object instance
   * @since 3.1.0
   */
  public Manufacturer withFSCM(Manufacturer.FSCM... values) {
    if (values != null) {
      getFSCM().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FSCM} instances
   * @return The current Manufacturer object instance
   * @since 3.1.0
   */
  public Manufacturer withFSCM(Collection<Manufacturer.FSCM> values) {
    if (values != null) {
      getFSCM().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Manufacturer object instance
   * @since 3.1.0
   */
  public Manufacturer withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current Manufacturer object instance
   * @since 3.1.0
   */
  public Manufacturer withCountry(ListAO value) {
    setCountry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Manufacturer object instance
   * @since 3.1.0
   */
  public Manufacturer withCode(String value) {
    setCode(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class FSCM {

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

    public Manufacturer.FSCM withValue(String value) {
      setValue(value);
      return this;
    }

    public Manufacturer.FSCM withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Manufacturer instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Manufacturer {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Manufacturer} requires {@link null code}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCode();
  }

}
