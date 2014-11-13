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
package us.gov.dod.standard.ssrf._1_2_4;

import java.math.BigInteger;
import java.util.*;
import javax.security.auth.login.Configuration;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.link.Config;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;
import us.gov.dod.standard.ssrf._1_2_4.sspt.Stage;
import us.gov.dod.standard.ssrf._1_2_4.sspt.Stage4Srv;
import us.gov.dod.standard.ssrf._1_2_4.sspt.SystemCost;

/**
 * SSRequest contains all parameters describing the system and its usage, for
 * which Spectrum Supportability is being requested.
 * <p>
 * Sub-Elements are
 * {@link Configuration}, {@link DiagramEndpoint}, {@link DiagramLine}, {@link HostNation}, {@link Nomenclature}, {@link POCInformation}, {@link Project}, {@link RelatedSupportability}, {@link Stage}, {@link StatusLog}, {@link Time}, {@link Trunking}
 * <p>
 * Example:
 * <pre>
 * &lt;SSRequest cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::SR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Title cls="U"&gt;MIDS LVT&lt;/Title&gt;
 *   &lt;Configuration&gt;
 *     &lt;ConfigID cls="U"&gt;LOW VOLUME&lt;/ConfigID&gt;
 *     &lt;TxRef&gt;
 *       &lt;Serial cls="U"&gt;USA::TX:555&lt;/Serial&gt;
 *     &lt;/TxRef&gt;
 *   &lt;/Configuration&gt;
 * &lt;/SSRequest&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSSRequest", propOrder = {
  "approvalRouting",
  "responseDate",
  "title",
  "stage",
  "stage4Srv",
  "systemCost",
  "numUnits",
  "description",
  "contract",
  "requirement",
  "willReplace",
  "ssRequestRef",
  "hostNation",
  "config",
  "locationRef"
})
public class SSRequest extends Common<SSRequest> {

  @XmlElement(name = "ApprovalRouting")
  protected ApprovalRouting approvalRouting;

  @XmlElement(name = "ResponseDate")
  protected TDate responseDate;
  /**
   * Title - Application Title (Required)
   * <p>
   * The title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = true)
  protected Title title;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Stage")
  protected List<Stage> stage;

  @XmlElement(name = "Stage4Srv")
  protected Stage4Srv stage4Srv;

  @XmlElement(name = "SystemCost")
  protected SystemCost systemCost;

  @XmlElement(name = "NumUnits", required = true)
  protected NumUnits numUnits;

  @XmlElement(name = "Description", required = true)
  protected Memo description;

  @XmlElement(name = "Contract")
  protected List<Contract> contract;
  /**
   * Requirement - Requirement Description (Optional)
   * <p>
   * A description of the types and forms of information to be transmitted or
   * received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Requirement", required = true)
  protected Memo requirement;

  @XmlElement(name = "WillReplace")
  protected List<WillReplace> willReplace;

  @XmlElement(name = "SSRequestRef")
  protected List<SSRequestRef> ssRequestRef;
  /**
   * HostNation (Optional)
   * <p>
   * HostNation indicates the host nations from which supportability is
   * requested. If a SSRequest received by NATO has no HostNation entry, it will
   * be assumed that this SSRequest is for all NATO Nations plus AUS and NZL (in
   * accordance with the FMSC agreement).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HostNation")
  protected List<SSRequest.HostNation> hostNation;

  @XmlElement(name = "Config", required = true)
  protected List<Config> config;

  @XmlElement(name = "LocationRef", required = true)
  protected List<LocationRef> locationRef;
  /**
   * CurrentStage - Current Stage (Optional)
   * <p>
   * The current stage of the system.
   * <p>
   * Format is L:CSG
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "stage", required = true)
  protected BigInteger attributeStage;

  /**
   * Get
   * <p>
   * @return a {@link ApprovalRouting} instance
   * @since 3.1.0
   */
  public ApprovalRouting getApprovalRouting() {
    return approvalRouting;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ApprovalRouting} instance
   * @since 3.1.0
   */
  public void setApprovalRouting(ApprovalRouting value) {
    this.approvalRouting = value;
  }

  public boolean isSetApprovalRouting() {
    return (this.approvalRouting != null);
  }

  /**
   * Get
   * <p>
   * @return the ResponseDate value in a {@link TDate} data type
   * @since 3.1.0
   */
  public TDate getResponseDate() {
    return responseDate;
  }

  /**
   * Set
   * <p>
   * @param value the ResponseDate value in a {@link TDate} data type
   * @since 3.1.0
   */
  public void setResponseDate(TDate value) {
    this.responseDate = value;
  }

  public boolean isSetResponseDate() {
    return (this.responseDate != null);
  }

  /**
   * Get the title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * @return the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public Title getTitle() {
    return title;
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * @param value the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public void setTitle(Title value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Get the current stage of the system.
   * <p>
   * @return a {@link Stage} instance
   * @since 3.1.0
   */
  public List<Stage> getStage() {
    if (stage == null) {
      stage = new ArrayList<>();
    }
    return this.stage;
  }

  public boolean isSetStage() {
    return ((this.stage != null) && (!this.stage.isEmpty()));
  }

  /**
   * Clear the Stage field. This sets the field to null.
   */
  public void unsetStage() {
    this.stage = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Stage4Srv} instance
   * @since 3.1.0
   */
  public Stage4Srv getStage4Srv() {
    return stage4Srv;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Stage4Srv} instance
   * @since 3.1.0
   */
  public void setStage4Srv(Stage4Srv value) {
    this.stage4Srv = value;
  }

  public boolean isSetStage4Srv() {
    return (this.stage4Srv != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SystemCost} instance
   * @since 3.1.0
   */
  public SystemCost getSystemCost() {
    return systemCost;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SystemCost} instance
   * @since 3.1.0
   */
  public void setSystemCost(SystemCost value) {
    this.systemCost = value;
  }

  public boolean isSetSystemCost() {
    return (this.systemCost != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NumUnits} instance
   * @since 3.1.0
   */
  public NumUnits getNumUnits() {
    return numUnits;
  }

  /**
   * Set
   * <p>
   * @param value a {@link NumUnits} instance
   * @since 3.1.0
   */
  public void setNumUnits(NumUnits value) {
    this.numUnits = value;
  }

  public boolean isSetNumUnits() {
    return (this.numUnits != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getDescription() {
    return description;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setDescription(Memo value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Contract} instance
   * @since 3.1.0
   */
  public List<Contract> getContract() {
    if (contract == null) {
      contract = new ArrayList<>();
    }
    return this.contract;
  }

  public boolean isSetContract() {
    return ((this.contract != null) && (!this.contract.isEmpty()));
  }

  /**
   * Clear the Contract field. This sets the field to null.
   */
  public void unsetContract() {
    this.contract = null;
  }

  /**
   * Get a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getRequirement() {
    return requirement;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setRequirement(Memo value) {
    this.requirement = value;
  }

  public boolean isSetRequirement() {
    return (this.requirement != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link WillReplace} instance
   * @since 3.1.0
   */
  public List<WillReplace> getWillReplace() {
    if (willReplace == null) {
      willReplace = new ArrayList<>();
    }
    return this.willReplace;
  }

  public boolean isSetWillReplace() {
    return ((this.willReplace != null) && (!this.willReplace.isEmpty()));
  }

  /**
   * Clear the WillReplace field. This sets the field to null.
   */
  public void unsetWillReplace() {
    this.willReplace = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SSRequestRef} instance
   * @since 3.1.0
   */
  public List<SSRequestRef> getSSRequestRef() {
    if (ssRequestRef == null) {
      ssRequestRef = new ArrayList<>();
    }
    return this.ssRequestRef;
  }

  public boolean isSetSSRequestRef() {
    return ((this.ssRequestRef != null) && (!this.ssRequestRef.isEmpty()));
  }

  /**
   * Clear the SSRequestRef field. This sets the field to null.
   */
  public void unsetSSRequestRef() {
    this.ssRequestRef = null;
  }

  public List<SSRequest.HostNation> getHostNation() {
    if (hostNation == null) {
      hostNation = new ArrayList<>();
    }
    return this.hostNation;
  }

  public boolean isSetHostNation() {
    return ((this.hostNation != null) && (!this.hostNation.isEmpty()));
  }

  /**
   * Clear the HostNation field. This sets the field to null.
   */
  public void unsetHostNation() {
    this.hostNation = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Config} instance
   * @since 3.1.0
   */
  public List<Config> getConfig() {
    if (config == null) {
      config = new ArrayList<>();
    }
    return this.config;
  }

  public boolean isSetConfig() {
    return ((this.config != null) && (!this.config.isEmpty()));
  }

  /**
   * Clear the Config field. This sets the field to null.
   */
  public void unsetConfig() {
    this.config = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  /**
   * Clear the LocationRef field. This sets the field to null.
   */
  public void unsetLocationRef() {
    this.locationRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getAttributeStage() {
    return attributeStage;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setAttributeStage(BigInteger value) {
    this.attributeStage = value;
  }

  public boolean isSetAttributeStage() {
    return (this.attributeStage != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ApprovalRouting}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withApprovalRouting(ApprovalRouting value) {
    setApprovalRouting(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDate}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withResponseDate(TDate value) {
    setResponseDate(value);
    return this;
  }

  /**
   * Set the title of the Spectrum Supportability application. Each application
   * title should be unique.
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param values One or more instances of type {@link Stage...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withStage(Stage... values) {
    if (values != null) {
      getStage().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the current stage of the system.
   * <p>
   * @param values A collection of {@link Stage} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withStage(Collection<Stage> values) {
    if (values != null) {
      getStage().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Stage4Srv}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withStage4Srv(Stage4Srv value) {
    setStage4Srv(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SystemCost}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withSystemCost(SystemCost value) {
    setSystemCost(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link NumUnits}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withNumUnits(NumUnits value) {
    setNumUnits(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withDescription(Memo value) {
    setDescription(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Contract...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withContract(Contract... values) {
    if (values != null) {
      getContract().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Contract} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withContract(Collection<Contract> values) {
    if (values != null) {
      getContract().addAll(values);
    }
    return this;
  }

  /**
   * Set a description of the types and forms of information to be transmitted
   * or received. The requirement should describe: - The general purpose of the
   * system (e.g., in the PATRIOT system: this is an anti-missile, anti-aircraft
   * system to protect fixed facilities); - Each significant capability of the
   * system (e.g., in the PATRIOT system: search, acquisition and tracking
   * radar, TT&C, C2 links, etc); - Any related supportability documents should
   * be listed in the ExtReferenceRef element.
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withRequirement(Memo value) {
    setRequirement(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link WillReplace...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withWillReplace(WillReplace... values) {
    if (values != null) {
      getWillReplace().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link WillReplace} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withWillReplace(Collection<WillReplace> values) {
    if (values != null) {
      getWillReplace().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SSRequestRef...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withSSRequestRef(SSRequestRef... values) {
    if (values != null) {
      getSSRequestRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSRequestRef} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withSSRequestRef(Collection<SSRequestRef> values) {
    if (values != null) {
      getSSRequestRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   * <p>
   * @param values One or more instances of type {@link SSRequest.HostNation...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withHostNation(SSRequest.HostNation... values) {
    if (values != null) {
      getHostNation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the HostNation
   * <p>
   * Complex element HostNation indicates the host nations from which
   * supportability is requested. If a SSRequest received by NATO has no
   * HostNation entry, it will be assumed that this SSRequest is for all NATO
   * Nations plus AUS and NZL (in accordance with the FMSC agreement).
   * <p>
   * @param values A collection of {@link HostNation} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withHostNation(Collection<SSRequest.HostNation> values) {
    if (values != null) {
      getHostNation().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Config...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withConfig(Config... values) {
    if (values != null) {
      getConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Config} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withConfig(Collection<Config> values) {
    if (values != null) {
      getConfig().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current SSRequest object instance
   * @since 3.1.0
   */
  public SSRequest withAttributeStage(BigInteger value) {
    setAttributeStage(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class HostNation {

    @XmlValue
    protected ListAO value;
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
     * @return a {@link ListAO} instance
     * @since 3.1.0
     */
    public ListAO getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link ListAO} instance
     * @since 3.1.0
     */
    public void setValue(ListAO value) {
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

    public SSRequest.HostNation withValue(ListAO value) {
      setValue(value);
      return this;
    }

    public SSRequest.HostNation withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this SSRequest instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SSRequest {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SSRequest} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null Config}, {@link null Description}, {@link null LocationRef}, {@link null NumUnits}, {@link null Requirement}, {@link null Title}, {@link null stage}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetConfig() && isSetDescription() && isSetLocationRef() && isSetNumUnits() && isSetRequirement() && isSetTitle() && isSetStage();
  }

}
