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
package us.gov.dod.standard.ssrf._1_2_4.ceoi;

import java.math.BigDecimal;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListCR;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * BSMPlan
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBSMPlan", propOrder = {
  "distribution",
  "concept",
  "mission",
  "scope",
  "managementStrategy",
  "responsibilities",
  "timeFrame",
  "feRef",
  "locationRef",
  "externalSys"
})
public class BSMPlan extends Common<BSMPlan> {

  @XmlElement(name = "Distribution", required = true)
  protected List<BSMPlan.Distribution> distribution;

  @XmlElement(name = "Concept", required = true)
  protected Memo concept;

  @XmlElement(name = "Mission", required = true)
  protected Memo mission;

  @XmlElement(name = "Scope", required = true)
  protected Memo scope;

  @XmlElement(name = "ManagementStrategy", required = true)
  protected Memo managementStrategy;

  @XmlElement(name = "Responsibilities", required = true)
  protected List<BSMPlan.Responsibilities> responsibilities;

  @XmlElement(name = "TimeFrame", required = true)
  protected TimeFrame timeFrame;

  @XmlElement(name = "FERef", required = true)
  protected ElmRef feRef;

  @XmlElement(name = "LocationRef", required = true)
  protected LocationRef locationRef;

  @XmlElement(name = "ExternalSys")
  protected List<BSMPlan.ExternalSys> externalSys;

  @XmlAttribute(name = "version", required = true)
  protected BigDecimal version;

  public List<BSMPlan.Distribution> getDistribution() {
    if (distribution == null) {
      distribution = new ArrayList<>();
    }
    return this.distribution;
  }

  public boolean isSetDistribution() {
    return ((this.distribution != null) && (!this.distribution.isEmpty()));
  }

  /**
   * Clear the Distribution field. This sets the field to null.
   */
  public void unsetDistribution() {
    this.distribution = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getConcept() {
    return concept;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setConcept(Memo value) {
    this.concept = value;
  }

  public boolean isSetConcept() {
    return (this.concept != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getMission() {
    return mission;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setMission(Memo value) {
    this.mission = value;
  }

  public boolean isSetMission() {
    return (this.mission != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getScope() {
    return scope;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setScope(Memo value) {
    this.scope = value;
  }

  public boolean isSetScope() {
    return (this.scope != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getManagementStrategy() {
    return managementStrategy;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setManagementStrategy(Memo value) {
    this.managementStrategy = value;
  }

  public boolean isSetManagementStrategy() {
    return (this.managementStrategy != null);
  }

  public List<BSMPlan.Responsibilities> getResponsibilities() {
    if (responsibilities == null) {
      responsibilities = new ArrayList<>();
    }
    return this.responsibilities;
  }

  public boolean isSetResponsibilities() {
    return ((this.responsibilities != null) && (!this.responsibilities.isEmpty()));
  }

  /**
   * Clear the Responsibilities field. This sets the field to null.
   */
  public void unsetResponsibilities() {
    this.responsibilities = null;
  }

  /**
   * Get
   * <p>
   * @return the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public TimeFrame getTimeFrame() {
    return timeFrame;
  }

  /**
   * Set
   * <p>
   * @param value the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public void setTimeFrame(TimeFrame value) {
    this.timeFrame = value;
  }

  public boolean isSetTimeFrame() {
    return (this.timeFrame != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getFERef() {
    return feRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setFERef(ElmRef value) {
    this.feRef = value;
  }

  public boolean isSetFERef() {
    return (this.feRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public LocationRef getLocationRef() {
    return locationRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link LocationRef} instance
   * @since 3.1.0
   */
  public void setLocationRef(LocationRef value) {
    this.locationRef = value;
  }

  public boolean isSetLocationRef() {
    return (this.locationRef != null);
  }

  public List<BSMPlan.ExternalSys> getExternalSys() {
    if (externalSys == null) {
      externalSys = new ArrayList<>();
    }
    return this.externalSys;
  }

  public boolean isSetExternalSys() {
    return ((this.externalSys != null) && (!this.externalSys.isEmpty()));
  }

  /**
   * Clear the ExternalSys field. This sets the field to null.
   */
  public void unsetExternalSys() {
    this.externalSys = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getVersion() {
    return version;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setVersion(BigDecimal value) {
    this.version = value;
  }

  public boolean isSetVersion() {
    return (this.version != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BSMPlan.Distribution...}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withDistribution(BSMPlan.Distribution... values) {
    if (values != null) {
      getDistribution().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Distribution} instances
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withDistribution(Collection<BSMPlan.Distribution> values) {
    if (values != null) {
      getDistribution().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withConcept(Memo value) {
    setConcept(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withMission(Memo value) {
    setMission(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withScope(Memo value) {
    setScope(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withManagementStrategy(Memo value) {
    setManagementStrategy(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link BSMPlan.Responsibilities...}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withResponsibilities(BSMPlan.Responsibilities... values) {
    if (values != null) {
      getResponsibilities().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Responsibilities} instances
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withResponsibilities(Collection<BSMPlan.Responsibilities> values) {
    if (values != null) {
      getResponsibilities().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withFERef(ElmRef value) {
    setFERef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link LocationRef}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withLocationRef(LocationRef value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BSMPlan.ExternalSys...}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withExternalSys(BSMPlan.ExternalSys... values) {
    if (values != null) {
      getExternalSys().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ExternalSys} instances
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withExternalSys(Collection<BSMPlan.ExternalSys> values) {
    if (values != null) {
      getExternalSys().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current BSMPlan object instance
   * @since 3.1.0
   */
  public BSMPlan withVersion(BigDecimal value) {
    setVersion(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Distribution {

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

    @XmlAttribute(name = "action", required = true)
    protected String action;

    @XmlAttribute(name = "serial", required = true)
    protected String serial;

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
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getAction() {
      return action;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setAction(String value) {
      this.action = value;
    }

    public boolean isSetAction() {
      return (this.action != null);
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

    public BSMPlan.Distribution withCls(String value) {
      setCls(value);
      return this;
    }

    public BSMPlan.Distribution withAction(String value) {
      setAction(value);
      return this;
    }

    public BSMPlan.Distribution withSerial(String value) {
      setSerial(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class ExternalSys
    extends ContactOrgRef {

    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getName() {
      return name;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setName(String value) {
      this.name = value;
    }

    public boolean isSetName() {
      return (this.name != null);
    }

    public BSMPlan.ExternalSys withName(String value) {
      setName(value);
      return this;
    }

    @Override
    public BSMPlan.ExternalSys withContactRef(ElmRef value) {
      setContactRef(value);
      return this;
    }

    @Override
    public BSMPlan.ExternalSys withOrganisationRef(ElmRef value) {
      setOrganisationRef(value);
      return this;
    }

    @Override
    public BSMPlan.ExternalSys withFERef(ElmRef value) {
      setFERef(value);
      return this;
    }

    @Override
    public BSMPlan.ExternalSys withCls(String value) {
      setCls(value);
      return this;
    }

    @Override
    public BSMPlan.ExternalSys withType(ListCR value) {
      setType(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Responsibilities
    extends Memo {

    @XmlAttribute(name = "level", required = true)
    protected String level;

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getLevel() {
      return level;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setLevel(String value) {
      this.level = value;
    }

    public boolean isSetLevel() {
      return (this.level != null);
    }

    public BSMPlan.Responsibilities withLevel(String value) {
      setLevel(value);
      return this;
    }

    @Override
    public BSMPlan.Responsibilities withValue(String value) {
      setValue(value);
      return this;
    }

    @Override
    public BSMPlan.Responsibilities withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this BSMPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "BSMPlan {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link BSMPlan} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null Concept}, {@link null Distribution}, {@link null FERef}, {@link null LocationRef}, {@link null ManagementStrategy}, {@link null Mission}, {@link null Responsibilities}, {@link null Scope}, {@link null TimeFrame}, {@link null action}, {@link null level}, {@link null name}, {@link null serial}, {@link null version}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetConcept() && isSetDistribution() && isSetFERef() && isSetLocationRef() && isSetManagementStrategy() && isSetMission() && isSetResponsibilities() && isSetScope() && isSetTimeFrame() && isSetAction() && isSetSerial() && isSetVersion();
  }

}
