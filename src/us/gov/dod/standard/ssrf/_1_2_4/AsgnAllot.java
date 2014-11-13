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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.allotment.*;
import us.gov.dod.standard.ssrf._1_2_4.link.Config;
import us.gov.dod.standard.ssrf._1_2_4.link.Link;
import us.gov.dod.standard.ssrf._1_2_4.link.Station;
import us.gov.dod.standard.ssrf._1_2_4.refdata.NoteRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * AsgnAllot
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAsgnAllot", propOrder = {
  "title",
  "asgnType",
  "approvalRouting",
  "responseDate",
  "time",
  "contract",
  "requirement",
  "emergency",
  "hostNominate",
  "sysOfStation",
  "fnctID",
  "noteRef",
  "asgnAllotRef",
  "ssRequestRef",
  "config",
  "station",
  "link",
  "net"
})
public class AsgnAllot extends Common<AsgnAllot> {

  @XmlElement(name = "Title")
  protected Title title;

  @XmlElement(name = "AsgnType")
  protected AsgnType asgnType;

  @XmlElement(name = "ApprovalRouting")
  protected ApprovalRouting approvalRouting;

  @XmlElement(name = "ResponseDate")
  protected TDate responseDate;

  @XmlElement(name = "Time")
  protected Time time;

  @XmlElement(name = "Contract")
  protected List<Contract> contract;

  @XmlElement(name = "Requirement")
  protected Memo requirement;

  @XmlElement(name = "Emergency")
  protected Emergency emergency;

  @XmlElement(name = "HostNominate")
  protected HostNominate hostNominate;

  @XmlElement(name = "SysOfStation")
  protected SysOfStation sysOfStation;

  @XmlElement(name = "FnctID", required = true)
  protected List<FnctID> fnctID;

  @XmlElement(name = "NoteRef")
  protected List<NoteRef> noteRef;

  @XmlElement(name = "AsgnAllotRef")
  protected List<AsgnAllotRef> asgnAllotRef;

  @XmlElement(name = "SSRequestRef")
  protected List<SSRequestRef> ssRequestRef;

  @XmlElement(name = "Config", required = true)
  protected List<Config> config;

  @XmlElement(name = "Station", required = true)
  protected List<Station> station;

  @XmlElement(name = "Link", required = true)
  protected List<Link> link;

  @XmlElement(name = "Net")
  protected Net net;

  /**
   * Get
   * <p>
   * @return the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public Title getTitle() {
    return title;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return a {@link AsgnType} instance
   * @since 3.1.0
   */
  public AsgnType getAsgnType() {
    return asgnType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AsgnType} instance
   * @since 3.1.0
   */
  public void setAsgnType(AsgnType value) {
    this.asgnType = value;
  }

  public boolean isSetAsgnType() {
    return (this.asgnType != null);
  }

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
   * Get
   * <p>
   * @return the Time value in a {@link Time} data type
   * @since 3.1.0
   */
  public Time getTime() {
    return time;
  }

  /**
   * Set
   * <p>
   * @param value the Time value in a {@link Time} data type
   * @since 3.1.0
   */
  public void setTime(Time value) {
    this.time = value;
  }

  public boolean isSetTime() {
    return (this.time != null);
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
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getRequirement() {
    return requirement;
  }

  /**
   * Set
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
   * @return a {@link Emergency} instance
   * @since 3.1.0
   */
  public Emergency getEmergency() {
    return emergency;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Emergency} instance
   * @since 3.1.0
   */
  public void setEmergency(Emergency value) {
    this.emergency = value;
  }

  public boolean isSetEmergency() {
    return (this.emergency != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link HostNominate} instance
   * @since 3.1.0
   */
  public HostNominate getHostNominate() {
    return hostNominate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link HostNominate} instance
   * @since 3.1.0
   */
  public void setHostNominate(HostNominate value) {
    this.hostNominate = value;
  }

  public boolean isSetHostNominate() {
    return (this.hostNominate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SysOfStation} instance
   * @since 3.1.0
   */
  public SysOfStation getSysOfStation() {
    return sysOfStation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SysOfStation} instance
   * @since 3.1.0
   */
  public void setSysOfStation(SysOfStation value) {
    this.sysOfStation = value;
  }

  public boolean isSetSysOfStation() {
    return (this.sysOfStation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FnctID} instance
   * @since 3.1.0
   */
  public List<FnctID> getFnctID() {
    if (fnctID == null) {
      fnctID = new ArrayList<>();
    }
    return this.fnctID;
  }

  public boolean isSetFnctID() {
    return ((this.fnctID != null) && (!this.fnctID.isEmpty()));
  }

  /**
   * Clear the FnctID field. This sets the field to null.
   */
  public void unsetFnctID() {
    this.fnctID = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NoteRef} instance
   * @since 3.1.0
   */
  public List<NoteRef> getNoteRef() {
    if (noteRef == null) {
      noteRef = new ArrayList<>();
    }
    return this.noteRef;
  }

  public boolean isSetNoteRef() {
    return ((this.noteRef != null) && (!this.noteRef.isEmpty()));
  }

  /**
   * Clear the NoteRef field. This sets the field to null.
   */
  public void unsetNoteRef() {
    this.noteRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link AsgnAllotRef} instance
   * @since 3.1.0
   */
  public List<AsgnAllotRef> getAsgnAllotRef() {
    if (asgnAllotRef == null) {
      asgnAllotRef = new ArrayList<>();
    }
    return this.asgnAllotRef;
  }

  public boolean isSetAsgnAllotRef() {
    return ((this.asgnAllotRef != null) && (!this.asgnAllotRef.isEmpty()));
  }

  /**
   * Clear the AsgnAllotRef field. This sets the field to null.
   */
  public void unsetAsgnAllotRef() {
    this.asgnAllotRef = null;
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
   * @return a {@link Station} instance
   * @since 3.1.0
   */
  public List<Station> getStation() {
    if (station == null) {
      station = new ArrayList<>();
    }
    return this.station;
  }

  public boolean isSetStation() {
    return ((this.station != null) && (!this.station.isEmpty()));
  }

  /**
   * Clear the Station field. This sets the field to null.
   */
  public void unsetStation() {
    this.station = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Link} instance
   * @since 3.1.0
   */
  public List<Link> getLink() {
    if (link == null) {
      link = new ArrayList<>();
    }
    return this.link;
  }

  public boolean isSetLink() {
    return ((this.link != null) && (!this.link.isEmpty()));
  }

  /**
   * Clear the Link field. This sets the field to null.
   */
  public void unsetLink() {
    this.link = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Net} instance
   * @since 3.1.0
   */
  public Net getNet() {
    return net;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Net} instance
   * @since 3.1.0
   */
  public void setNet(Net value) {
    this.net = value;
  }

  public boolean isSetNet() {
    return (this.net != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AsgnType}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withAsgnType(AsgnType value) {
    setAsgnType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ApprovalRouting}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withApprovalRouting(ApprovalRouting value) {
    setApprovalRouting(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDate}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withResponseDate(TDate value) {
    setResponseDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Time}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withTime(Time value) {
    setTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Contract...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withContract(Contract... values) {
    if (values != null) {
      getContract().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Contract} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withContract(Collection<Contract> values) {
    if (values != null) {
      getContract().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withRequirement(Memo value) {
    setRequirement(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Emergency}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withEmergency(Emergency value) {
    setEmergency(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link HostNominate}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withHostNominate(HostNominate value) {
    setHostNominate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SysOfStation}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withSysOfStation(SysOfStation value) {
    setSysOfStation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FnctID...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withFnctID(FnctID... values) {
    if (values != null) {
      getFnctID().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FnctID} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withFnctID(Collection<FnctID> values) {
    if (values != null) {
      getFnctID().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NoteRef...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withNoteRef(NoteRef... values) {
    if (values != null) {
      getNoteRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NoteRef} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withNoteRef(Collection<NoteRef> values) {
    if (values != null) {
      getNoteRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AsgnAllotRef...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withAsgnAllotRef(AsgnAllotRef... values) {
    if (values != null) {
      getAsgnAllotRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AsgnAllotRef} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withAsgnAllotRef(Collection<AsgnAllotRef> values) {
    if (values != null) {
      getAsgnAllotRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SSRequestRef...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withSSRequestRef(SSRequestRef... values) {
    if (values != null) {
      getSSRequestRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SSRequestRef} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withSSRequestRef(Collection<SSRequestRef> values) {
    if (values != null) {
      getSSRequestRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Config...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withConfig(Config... values) {
    if (values != null) {
      getConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Config} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withConfig(Collection<Config> values) {
    if (values != null) {
      getConfig().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Station...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withStation(Station... values) {
    if (values != null) {
      getStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Station} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withStation(Collection<Station> values) {
    if (values != null) {
      getStation().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Link...}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withLink(Link... values) {
    if (values != null) {
      getLink().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Link} instances
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withLink(Collection<Link> values) {
    if (values != null) {
      getLink().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Net}
   * @return The current AsgnAllot object instance
   * @since 3.1.0
   */
  public AsgnAllot withNet(Net value) {
    setNet(value);
    return this;
  }

  /**
   * Get a string representation of this AsgnAllot instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AsgnAllot {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnAllot} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null Config}, {@link null FnctID}, {@link null Link}, {@link null Station}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetConfig() && isSetFnctID() && isSetLink() && isSetStation();
  }

}
