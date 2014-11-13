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

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Azimuth;

/**
 * HorzScan
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THorzScan", propOrder = {
  "azimuth"
})
public class HorzScan {

  @XmlElement(name = "Azimuth", required = true)
  protected Azimuth azimuth;
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

  @XmlAttribute(name = "speed", required = true)
  protected BigDecimal speed;

  @XmlAttribute(name = "rate", required = true)
  protected BigInteger rate;

  @XmlAttribute(name = "scanType", required = true)
  protected String scanType;

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
  public BigDecimal getSpeed() {
    return speed;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setSpeed(BigDecimal value) {
    this.speed = value;
  }

  public boolean isSetSpeed() {
    return (this.speed != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getRate() {
    return rate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setRate(BigInteger value) {
    this.rate = value;
  }

  public boolean isSetRate() {
    return (this.rate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getScanType() {
    return scanType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setScanType(String value) {
    this.scanType = value;
  }

  public boolean isSetScanType() {
    return (this.scanType != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Azimuth}
   * @return The current HorzScan object instance
   * @since 3.1.0
   */
  public HorzScan withAzimuth(Azimuth value) {
    setAzimuth(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current HorzScan object instance
   * @since 3.1.0
   */
  public HorzScan withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current HorzScan object instance
   * @since 3.1.0
   */
  public HorzScan withSpeed(BigDecimal value) {
    setSpeed(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current HorzScan object instance
   * @since 3.1.0
   */
  public HorzScan withRate(BigInteger value) {
    setRate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current HorzScan object instance
   * @since 3.1.0
   */
  public HorzScan withScanType(String value) {
    setScanType(value);
    return this;
  }

  /**
   * Get a string representation of this HorzScan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "HorzScan {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link HorzScan} requires
   * {@link null Azimuth}, {@link null rate}, {@link null scanType}, {@link null speed}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAzimuth() && isSetRate() && isSetScanType() && isSetSpeed();
  }

}
