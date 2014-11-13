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
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.Descriptor;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.FEAntenna;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.FETxRx;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.Symbol;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListET;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListLC;
import us.gov.dod.standard.ssrf._1_2_4.organisation.RelatedOrg;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * ForceElement is used to describe any Unit or Platform that has the ability to
 * transmit or receive RF signals.
 * <p>
 * Sub-Elements are
 * {@link Assets}, {@link Nomenclature}, {@link POCInformation}, {@link StockNum}
 * <p>
 * Example:
 * <pre>
 * &lt;ForceElement&gt;
 *   &lt;Serial cls="U"&gt;USA:NA:FE:123&lt;/Serial&gt;
 *   &lt;Type cls="U"&gt;PLatform&lt;/Type&gt;
 *   &lt;OwningCountry cls="U"&gt;USA&lt;/OwningCountry&gt;
 *   &lt;Identifier&gt;
 *     &lt;Level cls="U"&gt;Primary&lt;/Level&gt;
 *     &lt;Name cls="U"&gt;USS Nimitz&lt;/Name&gt;
 *   &lt;/Identifier&gt;
 *   &lt;Assets_etc/&gt;
 *   &lt;/ForceElement&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TForceElement", propOrder = {
  "nomenclature",
  "stockNum",
  "descriptor",
  "symbol",
  "feTxRx",
  "feAntenna",
  "relatedOrg"
})
public class ForceElement extends Common<ForceElement> {

  /**
   * Nomenclature (Required)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature", required = true)
  protected List<Nomenclature> nomenclature;
  /**
   * US:StockNum (Optional)
   * <p>
   * StockNum (US) provides the equipment stock number and indicates the type of
   * stock number.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StockNum")
  protected List<StockNum> stockNum;

  @XmlElement(name = "Descriptor")
  protected Descriptor descriptor;

  @XmlElement(name = "Symbol")
  protected Symbol symbol;

  @XmlElement(name = "FETxRx")
  protected List<FETxRx> feTxRx;

  @XmlElement(name = "FEAntenna")
  protected List<FEAntenna> feAntenna;

  @XmlElement(name = "RelatedOrg")
  protected List<RelatedOrg> relatedOrg;
  /**
   * Type - Type (Required)
   * <p>
   * If the Force Element is a Unit or a Platform.
   * <p>
   * Format is L:CFE
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type")
  protected String type;
  /**
   * OwningCountry - Owning Country/Body (Optional)
   * <p>
   * The owning country or body of the ForceElement.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "country", required = true)
  protected ListAO country;

  @XmlAttribute(name = "name")
  protected String name;

  @XmlAttribute(name = "FEType", required = true)
  protected String feType;

  @XmlAttribute(name = "cat", required = true)
  protected String cat;

  @XmlAttribute(name = "comp")
  protected String comp;
  /**
   * MissionCode - Mission Code (Optional)
   * <p>
   * The mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * Format is L:CMC
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "missionCode")
  protected Integer missionCode;
  /**
   * CmdLevel - Command Level (Optional)
   * <p>
   * The organisational level of the force element according to stratum, echelon
   * or point at which authority or control is maintained.
   * <p>
   * Format is L:CLC
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cmdLevel")
  protected ListLC cmdLevel;

  @XmlAttribute(name = "opsCountry")
  protected ListAO opsCountry;
  /**
   * Role - Role (Optional)
   * <p>
   * The code used to document the main role of the Force Element. This role may
   * be used to derive what equipment (i.e., weapons systems, signal, platforms,
   * etc.) the Force Element is authorised. Also referred to as the Table of
   * Organisation and Equipment (TOE).
   * <p>
   * Format is L:CSR
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "role")
  protected BigInteger role;
  /**
   * Platform - Platform Type (Optional)
   * <p>
   * The type of platform.
   * <p>
   * Format is L:CET
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "platform")
  protected ListET platform;

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @return a {@link StockNum} instance
   * @since 3.1.0
   */
  public List<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new ArrayList<>();
    }
    return this.stockNum;
  }

  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  /**
   * Clear the StockNum field. This sets the field to null.
   */
  public void unsetStockNum() {
    this.stockNum = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Descriptor} instance
   * @since 3.1.0
   */
  public Descriptor getDescriptor() {
    return descriptor;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Descriptor} instance
   * @since 3.1.0
   */
  public void setDescriptor(Descriptor value) {
    this.descriptor = value;
  }

  public boolean isSetDescriptor() {
    return (this.descriptor != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Symbol} instance
   * @since 3.1.0
   */
  public Symbol getSymbol() {
    return symbol;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Symbol} instance
   * @since 3.1.0
   */
  public void setSymbol(Symbol value) {
    this.symbol = value;
  }

  public boolean isSetSymbol() {
    return (this.symbol != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FETxRx} instance
   * @since 3.1.0
   */
  public List<FETxRx> getFETxRx() {
    if (feTxRx == null) {
      feTxRx = new ArrayList<>();
    }
    return this.feTxRx;
  }

  public boolean isSetFETxRx() {
    return ((this.feTxRx != null) && (!this.feTxRx.isEmpty()));
  }

  /**
   * Clear the FETxRx field. This sets the field to null.
   */
  public void unsetFETxRx() {
    this.feTxRx = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FEAntenna} instance
   * @since 3.1.0
   */
  public List<FEAntenna> getFEAntenna() {
    if (feAntenna == null) {
      feAntenna = new ArrayList<>();
    }
    return this.feAntenna;
  }

  public boolean isSetFEAntenna() {
    return ((this.feAntenna != null) && (!this.feAntenna.isEmpty()));
  }

  /**
   * Clear the FEAntenna field. This sets the field to null.
   */
  public void unsetFEAntenna() {
    this.feAntenna = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link RelatedOrg} instance
   * @since 3.1.0
   */
  public List<RelatedOrg> getRelatedOrg() {
    if (relatedOrg == null) {
      relatedOrg = new ArrayList<>();
    }
    return this.relatedOrg;
  }

  public boolean isSetRelatedOrg() {
    return ((this.relatedOrg != null) && (!this.relatedOrg.isEmpty()));
  }

  /**
   * Clear the RelatedOrg field. This sets the field to null.
   */
  public void unsetRelatedOrg() {
    this.relatedOrg = null;
  }

  /**
   * Get if the Force Element is a Unit or a Platform.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set if the Force Element is a Unit or a Platform.
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
   * Get the owning country or body of the ForceElement.
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getCountry() {
    return country;
  }

  /**
   * Set the owning country or body of the ForceElement.
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setCountry(ListAO value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

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

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFEType() {
    return feType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFEType(String value) {
    this.feType = value;
  }

  public boolean isSetFEType() {
    return (this.feType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCat() {
    return cat;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCat(String value) {
    this.cat = value;
  }

  public boolean isSetCat() {
    return (this.cat != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getComp() {
    return comp;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setComp(String value) {
    this.comp = value;
  }

  public boolean isSetComp() {
    return (this.comp != null);
  }

  /**
   * Get the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * @return a {@link int} instance
   * @since 3.1.0
   */
  public int getMissionCode() {
    return missionCode;
  }

  /**
   * Set the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * @param value a {@link int} instance
   * @since 3.1.0
   */
  public void setMissionCode(int value) {
    this.missionCode = value;
  }

  public boolean isSetMissionCode() {
    return (this.missionCode != null);
  }

  /**
   * Clear the MissionCode field. This sets the field to null.
   */
  public void unsetMissionCode() {
    this.missionCode = null;
  }

  /**
   * Get the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained.
   * <p>
   * @return a {@link ListLC} instance
   * @since 3.1.0
   */
  public ListLC getCmdLevel() {
    return cmdLevel;
  }

  /**
   * Set the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained.
   * <p>
   * @param value a {@link ListLC} instance
   * @since 3.1.0
   */
  public void setCmdLevel(ListLC value) {
    this.cmdLevel = value;
  }

  public boolean isSetCmdLevel() {
    return (this.cmdLevel != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getOpsCountry() {
    return opsCountry;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setOpsCountry(ListAO value) {
    this.opsCountry = value;
  }

  public boolean isSetOpsCountry() {
    return (this.opsCountry != null);
  }

  /**
   * Get the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE).
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getRole() {
    return role;
  }

  /**
   * Set the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE).
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setRole(BigInteger value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Get the type of platform.
   * <p>
   * @return a {@link ListET} instance
   * @since 3.1.0
   */
  public ListET getPlatform() {
    return platform;
  }

  /**
   * Set the type of platform.
   * <p>
   * @param value a {@link ListET} instance
   * @since 3.1.0
   */
  public void setPlatform(ListET value) {
    this.platform = value;
  }

  public boolean isSetPlatform() {
    return (this.platform != null);
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values One or more instances of type {@link StockNum...}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Descriptor}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withDescriptor(Descriptor value) {
    setDescriptor(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Symbol}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withSymbol(Symbol value) {
    setSymbol(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FETxRx...}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withFETxRx(FETxRx... values) {
    if (values != null) {
      getFETxRx().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FETxRx} instances
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withFETxRx(Collection<FETxRx> values) {
    if (values != null) {
      getFETxRx().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FEAntenna...}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withFEAntenna(FEAntenna... values) {
    if (values != null) {
      getFEAntenna().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FEAntenna} instances
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withFEAntenna(Collection<FEAntenna> values) {
    if (values != null) {
      getFEAntenna().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RelatedOrg...}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withRelatedOrg(RelatedOrg... values) {
    if (values != null) {
      getRelatedOrg().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RelatedOrg} instances
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withRelatedOrg(Collection<RelatedOrg> values) {
    if (values != null) {
      getRelatedOrg().addAll(values);
    }
    return this;
  }

  /**
   * Set if the Force Element is a Unit or a Platform.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set the owning country or body of the ForceElement.
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withCountry(ListAO value) {
    setCountry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withFEType(String value) {
    setFEType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withCat(String value) {
    setCat(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withComp(String value) {
    setComp(value);
    return this;
  }

  /**
   * Set the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * @param value An instances of type {@link int}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withMissionCode(int value) {
    setMissionCode(value);
    return this;
  }

  /**
   * Set the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained.
   * <p>
   * @param value An instances of type {@link ListLC}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withCmdLevel(ListLC value) {
    setCmdLevel(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withOpsCountry(ListAO value) {
    setOpsCountry(value);
    return this;
  }

  /**
   * Set the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE).
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withRole(BigInteger value) {
    setRole(value);
    return this;
  }

  /**
   * Set the type of platform.
   * <p>
   * @param value An instances of type {@link ListET}
   * @return The current ForceElement object instance
   * @since 3.1.0
   */
  public ForceElement withPlatform(ListET value) {
    setPlatform(value);
    return this;
  }

  /**
   * Get a string representation of this ForceElement instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ForceElement {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ForceElement} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null FEType}, {@link null Nomenclature}, {@link null cat}, {@link null country}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFEType() && isSetNomenclature() && isSetCat() && isSetCountry();
  }

}
