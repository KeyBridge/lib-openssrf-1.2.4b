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

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.shared.ElmRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.Handling;
import us.gov.dod.standard.ssrf._1_2_4.shared.ReleasableTo;
import us.gov.dod.standard.ssrf._1_2_4.shared.Status;

/**
 * Response
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TResponse", propOrder = {
  "handling",
  "releasableTo",
  "status",
  "administrativeRef",
  "reason",
  "dataset"
})
public class Response {

  @XmlElement(name = "Handling")
  protected List<Handling> handling;

  @XmlElement(name = "ReleasableTo")
  protected List<ReleasableTo> releasableTo;

  @XmlElement(name = "Status", required = true)
  protected List<Status> status;

  @XmlElement(name = "AdministrativeRef", required = true)
  protected ElmRef administrativeRef;

  @XmlElement(name = "Reason")
  protected Memo reason;

  @XmlElement(name = "Dataset")
  protected List<Dataset> dataset;
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

  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  /**
   * Get
   * <p>
   * @return a {@link Handling} instance
   * @since 3.1.0
   */
  public List<Handling> getHandling() {
    if (handling == null) {
      handling = new ArrayList<>();
    }
    return this.handling;
  }

  public boolean isSetHandling() {
    return ((this.handling != null) && (!this.handling.isEmpty()));
  }

  /**
   * Clear the Handling field. This sets the field to null.
   */
  public void unsetHandling() {
    this.handling = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ReleasableTo} instance
   * @since 3.1.0
   */
  public List<ReleasableTo> getReleasableTo() {
    if (releasableTo == null) {
      releasableTo = new ArrayList<>();
    }
    return this.releasableTo;
  }

  public boolean isSetReleasableTo() {
    return ((this.releasableTo != null) && (!this.releasableTo.isEmpty()));
  }

  /**
   * Clear the ReleasableTo field. This sets the field to null.
   */
  public void unsetReleasableTo() {
    this.releasableTo = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Status} instance
   * @since 3.1.0
   */
  public List<Status> getStatus() {
    if (status == null) {
      status = new ArrayList<>();
    }
    return this.status;
  }

  public boolean isSetStatus() {
    return ((this.status != null) && (!this.status.isEmpty()));
  }

  /**
   * Clear the Status field. This sets the field to null.
   */
  public void unsetStatus() {
    this.status = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getAdministrativeRef() {
    return administrativeRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setAdministrativeRef(ElmRef value) {
    this.administrativeRef = value;
  }

  public boolean isSetAdministrativeRef() {
    return (this.administrativeRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getReason() {
    return reason;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return a {@link Dataset} instance
   * @since 3.1.0
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
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
  public String getSerial() {
    return serial;
  }

  /**
   * Set
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
   * Set
   * <p>
   * @param values One or more instances of type {@link Handling...}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withHandling(Handling... values) {
    if (values != null) {
      getHandling().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Handling} instances
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withHandling(Collection<Handling> values) {
    if (values != null) {
      getHandling().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ReleasableTo...}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withReleasableTo(ReleasableTo... values) {
    if (values != null) {
      getReleasableTo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ReleasableTo} instances
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withReleasableTo(Collection<ReleasableTo> values) {
    if (values != null) {
      getReleasableTo().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Status...}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withStatus(Status... values) {
    if (values != null) {
      getStatus().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Status} instances
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withStatus(Collection<Status> values) {
    if (values != null) {
      getStatus().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withAdministrativeRef(ElmRef value) {
    setAdministrativeRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withReason(Memo value) {
    setReason(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Dataset...}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Dataset} instances
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Response object instance
   * @since 3.1.0
   */
  public Response withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Get a string representation of this Response instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Response {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Response} requires
   * {@link null AdministrativeRef}, {@link null Status}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAdministrativeRef() && isSetStatus() && isSetSerial();
  }

}
