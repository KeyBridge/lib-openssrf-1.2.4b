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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListPO;

/**
 * Pol
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPol")
public class Pol {

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
   * US:PolarisationType - Polarisation Type (Optional)
   * <p>
   * The polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * Format is L:CPO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type", required = true)
  protected ListPO type;
  /**
   * US:TiltAngleValue - Tilt Angle Value (Optional)
   * <p>
   * The observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "angle")
  protected BigDecimal angle;

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
   * Get the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @return a {@link ListPO} instance
   * @since 3.1.0
   */
  public ListPO getType() {
    return type;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @param value a {@link ListPO} instance
   * @since 3.1.0
   */
  public void setType(ListPO value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Get the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getAngle() {
    return angle;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setAngle(BigDecimal value) {
    this.angle = value;
  }

  public boolean isSetAngle() {
    return (this.angle != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Pol object instance
   * @since 3.1.0
   */
  public Pol withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @param value An instances of type {@link ListPO}
   * @return The current Pol object instance
   * @since 3.1.0
   */
  public Pol withType(ListPO value) {
    setType(value);
    return this;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Pol object instance
   * @since 3.1.0
   */
  public Pol withAngle(BigDecimal value) {
    setAngle(value);
    return this;
  }

  /**
   * Get a string representation of this Pol instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Pol {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Pol} requires {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

}
