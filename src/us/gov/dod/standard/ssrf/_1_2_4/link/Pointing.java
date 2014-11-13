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
package us.gov.dod.standard.ssrf._1_2_4.link;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Azimuth;
import us.gov.dod.standard.ssrf._1_2_4.shared.Elevation;

/**
 * Pointing
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPointing", propOrder = {
  "azimuth",
  "elevation"
})
public class Pointing {

  @XmlElement(name = "Azimuth")
  protected Azimuth azimuth;

  @XmlElement(name = "Elevation")
  protected Elevation elevation;
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

  @XmlAttribute(name = "coverage")
  protected String coverage;

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
  public String getCoverage() {
    return coverage;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCoverage(String value) {
    this.coverage = value;
  }

  public boolean isSetCoverage() {
    return (this.coverage != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Azimuth}
   * @return The current Pointing object instance
   * @since 3.1.0
   */
  public Pointing withAzimuth(Azimuth value) {
    setAzimuth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Elevation}
   * @return The current Pointing object instance
   * @since 3.1.0
   */
  public Pointing withElevation(Elevation value) {
    setElevation(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pointing object instance
   * @since 3.1.0
   */
  public Pointing withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pointing object instance
   * @since 3.1.0
   */
  public Pointing withCoverage(String value) {
    setCoverage(value);
    return this;
  }

  /**
   * Get a string representation of this Pointing instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Pointing {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Pointing} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
