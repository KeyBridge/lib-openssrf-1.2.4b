package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Nomenclature identifies either the standard military, government,
 * nomenclature or the commercial model number of an equipment. Each device or
 * group of devices may have several types of nomenclatures, e.g. both a
 * military nomenclature and a commercial model number.
 * <p>
 * Element of
 * {@link Antenna}, {@link ForceElement}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link Satellite}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link Manufacturer}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNomenclature", propOrder = {
  "nomenclatureName",
  "manufacturer"
})
public class Nomenclature {

  @XmlElement(name = "NomenclatureName", required = true)
  protected Nomenclature.NomenclatureName nomenclatureName;
  /**
   * Manufacturer (Optional)
   * <p>
   * Manufacturer contains the manufacturer name of the equipment listed in the
   * corresponding data entry in data element Nomenclature. Additionally the
   * country in which the equipment is manufactured may be included.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Manufacturer")
  protected Set<Manufacturer> manufacturer;
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
   * Type - Type (Optional)
   * <p>
   * The type of nomenclature (commercial, military, etc).
   * <p>
   * Format is L:CTO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type", required = true)
  protected String type;
  /**
   * Level - Level (Optional)
   * <p>
   * The level of nomenclature (primary, nickname, etc).
   * <p>
   * Format is L:CNU
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "level", required = true)
  protected String level;

  public Nomenclature.NomenclatureName getNomenclatureName() {
    return nomenclatureName;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public void setNomenclatureName(Nomenclature.NomenclatureName value) {
    this.nomenclatureName = value;
  }

  public boolean isSetNomenclatureName() {
    return (this.nomenclatureName != null);
  }

  /**
   * Get the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @return a {@link Manufacturer} instance
   * @since 3.1.0
   */
  public Set<Manufacturer> getManufacturer() {
    if (manufacturer == null) {
      manufacturer = new HashSet<>();
    }
    return this.manufacturer;
  }

  public boolean isSetManufacturer() {
    return ((this.manufacturer != null) && (!this.manufacturer.isEmpty()));
  }

  /**
   * Clear the Manufacturer field. This sets the field to null.
   */
  public void unsetManufacturer() {
    this.manufacturer = null;
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
   * Get the type of nomenclature (commercial, military, etc).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Get the level of nomenclature (primary, nickname, etc).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLevel() {
    return level;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLevel(String value) {
    this.level = value;
  }

  public boolean isSetLevel() {
    return (this.level != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Nomenclature.NomenclatureName}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withNomenclatureName(Nomenclature.NomenclatureName value) {
    setNomenclatureName(value);
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values One or more instances of type {@link Manufacturer...}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Manufacturer... values) {
    if (values != null) {
      getManufacturer().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values A collection of {@link Manufacturer} instances
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Collection<Manufacturer> values) {
    if (values != null) {
      getManufacturer().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   * @since 3.1.0
   */
  public Nomenclature withLevel(String value) {
    setLevel(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class NomenclatureName {

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

    public Nomenclature.NomenclatureName withValue(String value) {
      setValue(value);
      return this;
    }

    public Nomenclature.NomenclatureName withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Nomenclature instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Nomenclature {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Nomenclature} requires
   * {@link null NomenclatureName}, {@link null level}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNomenclatureName() && isSetLevel() && isSetType();
  }

}
