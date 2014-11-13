package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.antenna.AntPattern;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListPO;
import us.gov.dod.standard.ssrf._1_2_4.shared.Azimuth;
import us.gov.dod.standard.ssrf._1_2_4.shared.Beamwidth;
import us.gov.dod.standard.ssrf._1_2_4.shared.Elevation;

/**
 * AntSpec
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntSpec", propOrder = {
  "beamwidth",
  "azimuth",
  "elevation",
  "antPattern"
})
public class AntSpec {

  @XmlElement(name = "Beamwidth")
  protected Beamwidth beamwidth;

  @XmlElement(name = "Azimuth")
  protected Azimuth azimuth;

  @XmlElement(name = "Elevation")
  protected Elevation elevation;

  @XmlElement(name = "AntPattern")
  protected Set<AntPattern> antPattern;
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

  @XmlAttribute(name = "gain")
  protected BigDecimal gain;

  @XmlAttribute(name = "diameter")
  protected BigDecimal diameter;

  @XmlAttribute(name = "directionality")
  protected BigDecimal directionality;

  @XmlAttribute(name = "polarisation")
  protected ListPO polarisation;

  @XmlAttribute(name = "sidelobeAttenuation")
  protected BigInteger sidelobeAttenuation;

  /**
   * Get
   * <p>
   * @return a {@link Beamwidth} instance
   * @since 3.1.0
   */
  public Beamwidth getBeamwidth() {
    return beamwidth;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Beamwidth} instance
   * @since 3.1.0
   */
  public void setBeamwidth(Beamwidth value) {
    this.beamwidth = value;
  }

  public boolean isSetBeamwidth() {
    return (this.beamwidth != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Azimuth} instance
   * @since 3.1.0
   */
  public Azimuth getAzimuth() {
    return azimuth;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Azimuth} instance
   * @since 3.1.0
   */
  public void setAzimuth(Azimuth value) {
    this.azimuth = value;
  }

  public boolean isSetAzimuth() {
    return (this.azimuth != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Elevation} instance
   * @since 3.1.0
   */
  public Elevation getElevation() {
    return elevation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Elevation} instance
   * @since 3.1.0
   */
  public void setElevation(Elevation value) {
    this.elevation = value;
  }

  public boolean isSetElevation() {
    return (this.elevation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link AntPattern} instance
   * @since 3.1.0
   */
  public Set<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new HashSet<>();
    }
    return this.antPattern;
  }

  public boolean isSetAntPattern() {
    return ((this.antPattern != null) && (!this.antPattern.isEmpty()));
  }

  /**
   * Clear the AntPattern field. This sets the field to null.
   */
  public void unsetAntPattern() {
    this.antPattern = null;
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
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getGain() {
    return gain;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setGain(BigDecimal value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDiameter() {
    return diameter;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDiameter(BigDecimal value) {
    this.diameter = value;
  }

  public boolean isSetDiameter() {
    return (this.diameter != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDirectionality() {
    return directionality;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDirectionality(BigDecimal value) {
    this.directionality = value;
  }

  public boolean isSetDirectionality() {
    return (this.directionality != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListPO} instance
   * @since 3.1.0
   */
  public ListPO getPolarisation() {
    return polarisation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListPO} instance
   * @since 3.1.0
   */
  public void setPolarisation(ListPO value) {
    this.polarisation = value;
  }

  public boolean isSetPolarisation() {
    return (this.polarisation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getSidelobeAttenuation() {
    return sidelobeAttenuation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setSidelobeAttenuation(BigInteger value) {
    this.sidelobeAttenuation = value;
  }

  public boolean isSetSidelobeAttenuation() {
    return (this.sidelobeAttenuation != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Beamwidth}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withBeamwidth(Beamwidth value) {
    setBeamwidth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Azimuth}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withAzimuth(Azimuth value) {
    setAzimuth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Elevation}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withElevation(Elevation value) {
    setElevation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AntPattern...}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AntPattern} instances
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withGain(BigDecimal value) {
    setGain(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withDiameter(BigDecimal value) {
    setDiameter(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withDirectionality(BigDecimal value) {
    setDirectionality(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListPO}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withPolarisation(ListPO value) {
    setPolarisation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current AntSpec object instance
   * @since 3.1.0
   */
  public AntSpec withSidelobeAttenuation(BigInteger value) {
    setSidelobeAttenuation(value);
    return this;
  }

  /**
   * Get a string representation of this AntSpec instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntSpec {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntSpec} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
