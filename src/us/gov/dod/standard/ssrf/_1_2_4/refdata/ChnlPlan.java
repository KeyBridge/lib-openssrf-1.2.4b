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
package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * ChnlPlan
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TChnlPlan", propOrder = {
  "chnl",
  "chnlFreq"
})
public class ChnlPlan extends Std<ChnlPlan> {

  @XmlElement(name = "Chnl")
  protected List<ChnlPlan.Chnl> chnl;

  @XmlElement(name = "ChnlFreq")
  protected List<ChnlFreq> chnlFreq;

  @XmlAttribute(name = "relatedPlan")
  protected String relatedPlan;

  public List<ChnlPlan.Chnl> getChnl() {
    if (chnl == null) {
      chnl = new ArrayList<>();
    }
    return this.chnl;
  }

  public boolean isSetChnl() {
    return ((this.chnl != null) && (!this.chnl.isEmpty()));
  }

  /**
   * Clear the Chnl field. This sets the field to null.
   */
  public void unsetChnl() {
    this.chnl = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ChnlFreq} instance
   * @since 3.1.0
   */
  public List<ChnlFreq> getChnlFreq() {
    if (chnlFreq == null) {
      chnlFreq = new ArrayList<>();
    }
    return this.chnlFreq;
  }

  public boolean isSetChnlFreq() {
    return ((this.chnlFreq != null) && (!this.chnlFreq.isEmpty()));
  }

  /**
   * Clear the ChnlFreq field. This sets the field to null.
   */
  public void unsetChnlFreq() {
    this.chnlFreq = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRelatedPlan() {
    return relatedPlan;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRelatedPlan(String value) {
    this.relatedPlan = value;
  }

  public boolean isSetRelatedPlan() {
    return (this.relatedPlan != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ChnlPlan.Chnl...}
   * @return The current ChnlPlan object instance
   * @since 3.1.0
   */
  public ChnlPlan withChnl(ChnlPlan.Chnl... values) {
    if (values != null) {
      getChnl().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Chnl} instances
   * @return The current ChnlPlan object instance
   * @since 3.1.0
   */
  public ChnlPlan withChnl(Collection<ChnlPlan.Chnl> values) {
    if (values != null) {
      getChnl().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ChnlFreq...}
   * @return The current ChnlPlan object instance
   * @since 3.1.0
   */
  public ChnlPlan withChnlFreq(ChnlFreq... values) {
    if (values != null) {
      getChnlFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ChnlFreq} instances
   * @return The current ChnlPlan object instance
   * @since 3.1.0
   */
  public ChnlPlan withChnlFreq(Collection<ChnlFreq> values) {
    if (values != null) {
      getChnlFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ChnlPlan object instance
   * @since 3.1.0
   */
  public ChnlPlan withRelatedPlan(String value) {
    setRelatedPlan(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "chnlFreq"
  })
  public static class Chnl {

    @XmlElement(name = "ChnlFreq", required = true)
    protected List<ChnlFreq> chnlFreq;
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

    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Get
     * <p>
     * @return a {@link ChnlFreq} instance
     * @since 3.1.0
     */
    public List<ChnlFreq> getChnlFreq() {
      if (chnlFreq == null) {
        chnlFreq = new ArrayList<>();
      }
      return this.chnlFreq;
    }

    public boolean isSetChnlFreq() {
      return ((this.chnlFreq != null) && (!this.chnlFreq.isEmpty()));
    }

    /**
     * Clear the ChnlFreq field. This sets the field to null.
     */
    public void unsetChnlFreq() {
      this.chnlFreq = null;
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

    public ChnlPlan.Chnl withChnlFreq(ChnlFreq... values) {
      if (values != null) {
        getChnlFreq().addAll(Arrays.asList(values));
      }
      return this;
    }

    public ChnlPlan.Chnl withChnlFreq(Collection<ChnlFreq> values) {
      if (values != null) {
        getChnlFreq().addAll(values);
      }
      return this;
    }

    public ChnlPlan.Chnl withCls(String value) {
      setCls(value);
      return this;
    }

    public ChnlPlan.Chnl withName(String value) {
      setName(value);
      return this;
    }

  }

  /**
   * Get a string representation of this ChnlPlan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ChnlPlan {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChnlPlan} requires {@link null ChnlFreq}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetChnlFreq();
  }

}
