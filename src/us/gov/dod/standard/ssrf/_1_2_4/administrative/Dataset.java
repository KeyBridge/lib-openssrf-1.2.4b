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
package us.gov.dod.standard.ssrf._1_2_4.administrative;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Administrative;
import us.gov.dod.standard.ssrf._1_2_4.Memo;

/**
 * Dataset is used within an Administrative transaction to specify the
 * identifier of the datasets on which the action must apply.
 * <p>
 * Element of {@link Administrative}
 * <p>
 * Sub-Element is {@link MissingRef}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataset", propOrder = {
  "reason"
})
public class Dataset {

  /**
   * Reason - Reason (Optional)
   * <p>
   * The reason linked to the Action performed on this dataset.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Reason")
  protected Memo reason;
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
   * Serial - Serial (Required)
   * <p>
   * The serial of the referenced Dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  /**
   * Get the reason linked to the Action performed on this dataset.
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getReason() {
    return reason;
  }

  /**
   * Set the reason linked to the Action performed on this dataset.
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setReason(Memo value) {
    this.reason = value;
  }

  public boolean isSetReason() {
    return (this.reason != null);
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
   * Get the serial of the referenced Dataset.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Dataset.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSerial(String value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Set the reason linked to the Action performed on this dataset.
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current Dataset object instance
   * @since 3.1.0
   */
  public Dataset withReason(Memo value) {
    setReason(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Dataset object instance
   * @since 3.1.0
   */
  public Dataset withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the serial of the referenced Dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Dataset object instance
   * @since 3.1.0
   */
  public Dataset withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Get a string representation of this Dataset instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Dataset {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Dataset} requires {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial();
  }

}
