package us.gov.dod.standard.ssrf._1_2_4.antenna;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;

/**
 * AntPattern contains an antenna pattern diagram on a specific plane. General
 * pattern cuts can be defined by a spherical coordinate system with the
 * electrical boresite of the antenna oriented in the direction of the Z-axis.
 * At different values of phi, pattern cuts can be taken with theta as the
 * dependent variable. These will be great circle cuts through the main-beam
 * peak.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Sub-Element is {@link AntPatternPoint}
 * <p>
 * Example:
 * <pre>
 * &lt;AntPattern&gt;
 *   &lt;Type cls="U"&gt;Azimuth&lt;/Type&gt;
 *   &lt;Calculated cls="U"&gt;Yes&lt;/Calculated&gt;
 *   &lt;AntPatternPoint&gt;
 *     &lt;Dir cls="U"&gt;180&lt;/Dir&gt;
 *     &lt;Gain cls="U"&gt;40.1&lt;/Gain&gt;
 *   &lt;/AntPatternPoint&gt;
 *   &lt;AntPatternPoint/&gt;
 *   &lt;/AntPattern&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntPattern", propOrder = {
  "antPatternPoint"
})
public class AntPattern {

  /**
   * AntPatternPoint (Required)
   * <p>
   * AntPatternPoint contains a single point of the antenna radiation pattern,
   * defined by a direction and gain.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntPatternPoint", required = true)
  protected Set<AntPattern.AntPatternPoint> antPatternPoint;
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

  @XmlAttribute(name = "code", required = true)
  protected String code;

  @XmlAttribute(name = "origin", required = true)
  protected String origin;

  public Set<AntPattern.AntPatternPoint> getAntPatternPoint() {
    if (antPatternPoint == null) {
      antPatternPoint = new HashSet<>();
    }
    return this.antPatternPoint;
  }

  public boolean isSetAntPatternPoint() {
    return ((this.antPatternPoint != null) && (!this.antPatternPoint.isEmpty()));
  }

  /**
   * Clear the AntPatternPoint field. This sets the field to null.
   */
  public void unsetAntPatternPoint() {
    this.antPatternPoint = null;
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
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrigin(String value) {
    this.origin = value;
  }

  public boolean isSetOrigin() {
    return (this.origin != null);
  }

  /**
   * Set the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @param values One or more instances of type
   *               {@link AntPattern.AntPatternPoint...}
   * @return The current AntPattern object instance
   * @since 3.1.0
   */
  public AntPattern withAntPatternPoint(AntPattern.AntPatternPoint... values) {
    if (values != null) {
      getAntPatternPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @param values A collection of {@link AntPatternPoint} instances
   * @return The current AntPattern object instance
   * @since 3.1.0
   */
  public AntPattern withAntPatternPoint(Collection<AntPattern.AntPatternPoint> values) {
    if (values != null) {
      getAntPatternPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntPattern object instance
   * @since 3.1.0
   */
  public AntPattern withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntPattern object instance
   * @since 3.1.0
   */
  public AntPattern withCode(String value) {
    setCode(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntPattern object instance
   * @since 3.1.0
   */
  public AntPattern withOrigin(String value) {
    setOrigin(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class AntPatternPoint {

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
     * Dir - Antenna Radiation Pattern Direction (Required)
     * <p>
     * The direction in degrees in reference to the pointing angle of the
     * antenna set to zero.
     * <p>
     * Format is UN(5,2) [0..360] (deg)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "dir", required = true)
    protected BigDecimal dir;
    /**
     * Gain - Antenna Radiation Pattern Gain (Required)
     * <p>
     * The amount of gain for the direction relative to the main beam gain.
     * <p>
     * Format is SN(5,2) (dB)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "gain", required = true)
    protected BigDecimal gain;

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
     * Get the direction in degrees in reference to the pointing angle of the
     * antenna set to zero.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getDir() {
      return dir;
    }

    /**
     * Set the direction in degrees in reference to the pointing angle of the
     * antenna set to zero.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setDir(BigDecimal value) {
      this.dir = value;
    }

    public boolean isSetDir() {
      return (this.dir != null);
    }

    /**
     * Get the amount of gain for the direction relative to the main beam gain.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getGain() {
      return gain;
    }

    /**
     * Set the amount of gain for the direction relative to the main beam gain.
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

    public AntPattern.AntPatternPoint withCls(String value) {
      setCls(value);
      return this;
    }

    public AntPattern.AntPatternPoint withDir(BigDecimal value) {
      setDir(value);
      return this;
    }

    public AntPattern.AntPatternPoint withGain(BigDecimal value) {
      setGain(value);
      return this;
    }

  }

  /**
   * Get a string representation of this AntPattern instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntPattern {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPattern} requires
   * {@link null AntPatternPoint}, {@link null code}, {@link null dir}, {@link null gain}, {@link null origin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAntPatternPoint() && isSetCode() && isSetOrigin();
  }

}
