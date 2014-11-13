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
package us.gov.dod.standard.ssrf._1_2_4.antenna;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Antenna;
import us.gov.dod.standard.ssrf._1_2_4.Mode;
import us.gov.dod.standard.ssrf._1_2_4.shared.Beamwidth;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * AntMode contains the technical characteristics of one antenna mode.
 * <p>
 * Element of {@link Antenna}
 * <p>
 * Sub-Elements are
 * {@link AntEfficiency}, {@link AntFreqs}, {@link AntGain}, {@link AntPattern}, {@link ObservedLobeAnalysis}, {@link ObservedPolarisationAnalysis}, {@link ObservedScanAnalysis}, {@link VSWR}
 * <p>
 * Example:
 * <pre>
 * &lt;AntMode&gt;
 *   &lt;ModeID cls="U"&gt;SURVEILLANCE&lt;/ModeID&gt;
 *   &lt;MotionType cls="U"&gt;Rotating&lt;/MotionType&gt;
 *   &lt;PolarisationType cls="U"&gt;Vertical linear&lt;/PolarisationType&gt;
 *   &lt;RotationRateMin cls="U"&gt;30&lt;/RotationRateMin&gt;
 *   &lt;other_AntMode_elements/&gt;
 *   &lt;/AntMode&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntMode", propOrder = {
  "gain",
  "pol",
  "beamwidth",
  "freqSingle",
  "freqRange",
  "rotation",
  "horzScan",
  "vertScan",
  "antPattern"
})
public class AntMode
  extends Mode {

  @XmlElement(name = "Gain", required = true)
  protected Gain gain;
  /**
   * PolarisationType - Type of Polarisation (Required)
   * <p>
   * The principal orientation of the electric field of the electromagnetic wave
   * for an antenna.
   * <p>
   * Format is L:CPO
   * <p>
   * Attribute group Pol (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Pol", required = true)
  protected Pol pol;

  @XmlElement(name = "Beamwidth")
  protected Beamwidth beamwidth;

  @XmlElement(name = "FreqSingle")
  protected List<FreqSingle> freqSingle;

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;
  /**
   * RotationRateMin - Minimum or Nominal Rotation Rate (Required)
   * <p>
   * The nominal or minimum antenna rotation rate.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Rotation")
  protected Rotation rotation;
  /**
   * HorzScanRate - Horizontal Scan Rate (Optional)
   * <p>
   * The number of complete scans the antenna is capable of making each minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group HorzScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScan")
  protected HorzScan horzScan;
  /**
   * VertScanAngleMax - Vertical Scan Maximum Angle (Optional)
   * <p>
   * The maximum limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertScan")
  protected VertScan vertScan;
  /**
   * AntPattern (Optional)
   * <p>
   * AntPattern contains an antenna pattern diagram on a specific plane. General
   * pattern cuts can be defined by a spherical coordinate system with the
   * electrical boresite of the antenna oriented in the direction of the Z-axis.
   * At different values of phi, pattern cuts can be taken with theta as the
   * dependent variable. These will be great circle cuts through the main-beam
   * peak.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntPattern")
  protected List<AntPattern> antPattern;

  @XmlAttribute(name = "code", required = true)
  protected String code;

  /**
   * Get
   * <p>
   * @return a {@link Gain} instance
   * @since 3.1.0
   */
  public Gain getGain() {
    return gain;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Gain} instance
   * @since 3.1.0
   */
  public void setGain(Gain value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  /**
   * Get the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @return a {@link Pol} instance
   * @since 3.1.0
   */
  public Pol getPol() {
    return pol;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @param value a {@link Pol} instance
   * @since 3.1.0
   */
  public void setPol(Pol value) {
    this.pol = value;
  }

  public boolean isSetPol() {
    return (this.pol != null);
  }

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
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public List<FreqSingle> getFreqSingle() {
    if (freqSingle == null) {
      freqSingle = new ArrayList<>();
    }
    return this.freqSingle;
  }

  public boolean isSetFreqSingle() {
    return ((this.freqSingle != null) && (!this.freqSingle.isEmpty()));
  }

  /**
   * Clear the FreqSingle field. This sets the field to null.
   */
  public void unsetFreqSingle() {
    this.freqSingle = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public FreqRange getFreqRange() {
    return freqRange;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqRange} instance
   * @since 3.1.0
   */
  public void setFreqRange(FreqRange value) {
    this.freqRange = value;
  }

  public boolean isSetFreqRange() {
    return (this.freqRange != null);
  }

  /**
   * Get the nominal or minimum antenna rotation rate.
   * <p>
   * @return a {@link Rotation} instance
   * @since 3.1.0
   */
  public Rotation getRotation() {
    return rotation;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value a {@link Rotation} instance
   * @since 3.1.0
   */
  public void setRotation(Rotation value) {
    this.rotation = value;
  }

  public boolean isSetRotation() {
    return (this.rotation != null);
  }

  /**
   * Get the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @return a {@link HorzScan} instance
   * @since 3.1.0
   */
  public HorzScan getHorzScan() {
    return horzScan;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value a {@link HorzScan} instance
   * @since 3.1.0
   */
  public void setHorzScan(HorzScan value) {
    this.horzScan = value;
  }

  public boolean isSetHorzScan() {
    return (this.horzScan != null);
  }

  /**
   * Get the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @return a {@link VertScan} instance
   * @since 3.1.0
   */
  public VertScan getVertScan() {
    return vertScan;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value a {@link VertScan} instance
   * @since 3.1.0
   */
  public void setVertScan(VertScan value) {
    this.vertScan = value;
  }

  public boolean isSetVertScan() {
    return (this.vertScan != null);
  }

  /**
   * Get the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @return a {@link AntPattern} instance
   * @since 3.1.0
   */
  public List<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new ArrayList<>();
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
   * @param value An instances of type {@link Gain}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withGain(Gain value) {
    setGain(value);
    return this;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @param value An instances of type {@link Pol}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withPol(Pol value) {
    setPol(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Beamwidth}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withBeamwidth(Beamwidth value) {
    setBeamwidth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value An instances of type {@link Rotation}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withRotation(Rotation value) {
    setRotation(value);
    return this;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value An instances of type {@link HorzScan}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withHorzScan(HorzScan value) {
    setHorzScan(value);
    return this;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value An instances of type {@link VertScan}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withVertScan(VertScan value) {
    setVertScan(value);
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values One or more instances of type {@link AntPattern...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values A collection of {@link AntPattern} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  public AntMode withCode(String value) {
    setCode(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  @Override
  public AntMode withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  @Override
  public AntMode withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  @Override
  public AntMode withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   * @since 3.1.0
   */
  @Override
  public AntMode withDescr(String value) {
    setDescr(value);
    return this;
  }

  /**
   * Get a string representation of this AntMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntMode {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntMode} requires
   * {@link null Gain}, {@link null Pol}, {@link null code}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetGain() && isSetPol() && isSetCode();
  }

}
