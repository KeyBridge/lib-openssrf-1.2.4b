/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Receiver;
import us.gov.dod.standard.ssrf._1_2_4.Transmitter;

/**
 * Curve defines the type of curve. It contains an indication as to whether the
 * values were measured or calculated, the numeric factor to be applied to the
 * carrier frequency to find the abscissa of the curve, a frequency to be added
 * to the carrier frequency to obtain the origin of the curve, and the
 * measurement bandwidth.
 * <p>
 * Element of {@link Receiver}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link CurvePoint}
 * <p>
 * Example:
 * <pre>
 * &lt;Curve idx="1"&gt;
 *   &lt;Type cls="U"&gt;Tx RF Spectrum&lt;/Type&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 *   &lt;FreqFactor cls="U"&gt;1&lt;/FreqFactor&gt;
 *   &lt;FreqConst cls="U"&gt;0&lt;/FreqConst&gt;
 *   &lt;Bw cls="U"&gt;0.001&lt;/Bw&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.025&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-3&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.05&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-20&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-40&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-60&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 * &lt;/Curve&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCurve", propOrder = {
  "curvePoint"
})
public class Curve {

  /**
   * CurvePoint (Required)
   * <p>
   * CurvePoint contains the relative frequency to add to the curve origin to
   * obtain the absolute frequency point on the curve, and the value in dB
   * (relative to the carrier for a Tx characteristic, or relative to
   * sensitivity for a Rx characteristic).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CurvePoint", required = true)
  protected List<Curve.CurvePoint> curvePoint;
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
   * Type - Curve Type (Required)
   * <p>
   * A code defining the type of curve.
   * <p>
   * Format is L:CCT
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type", required = true)
  protected String type;

  @XmlAttribute(name = "origin", required = true)
  protected String origin;
  /**
   * FreqFactor - Curve Frequency Factor (Required)
   * <p>
   * A positive numeric multiplier of the carrier frequency. For example, enter
   * 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * Format is UN(3,1)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "freqFactor", required = true)
  protected BigDecimal freqFactor;
  /**
   * FreqConst - Curve Frequency Constant (Required)
   * <p>
   * A frequency offset (positive or negative).
   * <p>
   * Format is SN(16,9) (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "freqConst", required = true)
  protected BigDecimal freqConst;
  /**
   * Bw - Curve Measurement Bandwidth (Optional)
   * <p>
   * The bandwidth measurement of the curve values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "bw")
  protected BigDecimal bw;

  public List<Curve.CurvePoint> getCurvePoint() {
    if (curvePoint == null) {
      curvePoint = new ArrayList<>();
    }
    return this.curvePoint;
  }

  public boolean isSetCurvePoint() {
    return ((this.curvePoint != null) && (!this.curvePoint.isEmpty()));
  }

  /**
   * Clear the CurvePoint field. This sets the field to null.
   */
  public void unsetCurvePoint() {
    this.curvePoint = null;
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
   * Get a code defining the type of curve.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set a code defining the type of curve.
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
   * Get a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getFreqFactor() {
    return freqFactor;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setFreqFactor(BigDecimal value) {
    this.freqFactor = value;
  }

  public boolean isSetFreqFactor() {
    return (this.freqFactor != null);
  }

  /**
   * Get a frequency offset (positive or negative).
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getFreqConst() {
    return freqConst;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setFreqConst(BigDecimal value) {
    this.freqConst = value;
  }

  public boolean isSetFreqConst() {
    return (this.freqConst != null);
  }

  /**
   * Get the bandwidth measurement of the curve values.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getBw() {
    return bw;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setBw(BigDecimal value) {
    this.bw = value;
  }

  public boolean isSetBw() {
    return (this.bw != null);
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values One or more instances of type {@link Curve.CurvePoint...}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withCurvePoint(Curve.CurvePoint... values) {
    if (values != null) {
      getCurvePoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values A collection of {@link CurvePoint} instances
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withCurvePoint(Collection<Curve.CurvePoint> values) {
    if (values != null) {
      getCurvePoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a code defining the type of curve.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withOrigin(String value) {
    setOrigin(value);
    return this;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withFreqFactor(BigDecimal value) {
    setFreqFactor(value);
    return this;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withFreqConst(BigDecimal value) {
    setFreqConst(value);
    return this;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Curve object instance
   * @since 3.1.0
   */
  public Curve withBw(BigDecimal value) {
    setBw(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class CurvePoint {

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
     * Offset - Point Frequency Offset (Required)
     * <p>
     * A frequency difference (refer to data element Curve for use
     * instructions). If the curve being defined is symmetric, then enter only
     * positive offsets. If the curve is not symmetric (such as a SSB or
     * vestigial sideband modulation spectrum) then enter the full curve
     * including negative offsets. When defining the transmitter RF spectrum and
     * the receiver RF and IF selectivity curves, enter as a minimum the points
     * corresponding to the -3, -20, -40 and -60 dB values.
     * <p>
     * Format is SN(16,9) (MHz)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "offset", required = true)
    protected BigDecimal offset;
    /**
     * Level - Level (Required)
     * <p>
     * A dB value (refer to data element Curve for use instructions).
     * <p>
     * Format is SN(4,1) [-150..150] (dB)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "level", required = true)
    protected BigDecimal level;

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
     * Get a frequency difference (refer to data element Curve for use
     * instructions). If the curve being defined is symmetric, then enter only
     * positive offsets. If the curve is not symmetric (such as a SSB or
     * vestigial sideband modulation spectrum) then enter the full curve
     * including negative offsets. When defining the transmitter RF spectrum and
     * the receiver RF and IF selectivity curves, enter as a minimum the points
     * corresponding to the -3, -20, -40 and -60 dB values.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getOffset() {
      return offset;
    }

    /**
     * Set a frequency difference (refer to data element Curve for use
     * instructions). If the curve being defined is symmetric, then enter only
     * positive offsets. If the curve is not symmetric (such as a SSB or
     * vestigial sideband modulation spectrum) then enter the full curve
     * including negative offsets. When defining the transmitter RF spectrum and
     * the receiver RF and IF selectivity curves, enter as a minimum the points
     * corresponding to the -3, -20, -40 and -60 dB values.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setOffset(BigDecimal value) {
      this.offset = value;
    }

    public boolean isSetOffset() {
      return (this.offset != null);
    }

    /**
     * Get a dB value (refer to data element Curve for use instructions).
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getLevel() {
      return level;
    }

    /**
     * Set a dB value (refer to data element Curve for use instructions).
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setLevel(BigDecimal value) {
      this.level = value;
    }

    public boolean isSetLevel() {
      return (this.level != null);
    }

    public Curve.CurvePoint withCls(String value) {
      setCls(value);
      return this;
    }

    public Curve.CurvePoint withOffset(BigDecimal value) {
      setOffset(value);
      return this;
    }

    public Curve.CurvePoint withLevel(BigDecimal value) {
      setLevel(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Curve instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Curve {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Curve} requires
   * {@link null CurvePoint}, {@link null freqConst}, {@link null freqFactor}, {@link null level}, {@link null offset}, {@link null origin}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCurvePoint() && isSetFreqConst() && isSetFreqFactor() && isSetOrigin() && isSetType();
  }

}
