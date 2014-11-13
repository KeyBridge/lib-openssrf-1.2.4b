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

import java.math.BigDecimal;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * CurveStd
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCurveStd", propOrder = {
  "curveSpec",
  "xAxis",
  "yAxis"
})
public class CurveStd extends Std<CurveStd> {

  @XmlElement(name = "CurveSpec", required = true)
  protected List<CurveStd.CurveSpec> curveSpec;

  @XmlElement(name = "XAxis")
  protected Axis xAxis;

  @XmlElement(name = "YAxis")
  protected Axis yAxis;

  @XmlAttribute(name = "EMFieldType")
  protected String emFieldType;

  @XmlAttribute(name = "orientation")
  protected String orientation;

  @XmlAttribute(name = "spec")
  protected String spec;

  public List<CurveStd.CurveSpec> getCurveSpec() {
    if (curveSpec == null) {
      curveSpec = new ArrayList<>();
    }
    return this.curveSpec;
  }

  public boolean isSetCurveSpec() {
    return ((this.curveSpec != null) && (!this.curveSpec.isEmpty()));
  }

  /**
   * Clear the CurveSpec field. This sets the field to null.
   */
  public void unsetCurveSpec() {
    this.curveSpec = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Axis} instance
   * @since 3.1.0
   */
  public Axis getXAxis() {
    return xAxis;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Axis} instance
   * @since 3.1.0
   */
  public void setXAxis(Axis value) {
    this.xAxis = value;
  }

  public boolean isSetXAxis() {
    return (this.xAxis != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Axis} instance
   * @since 3.1.0
   */
  public Axis getYAxis() {
    return yAxis;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Axis} instance
   * @since 3.1.0
   */
  public void setYAxis(Axis value) {
    this.yAxis = value;
  }

  public boolean isSetYAxis() {
    return (this.yAxis != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getEMFieldType() {
    return emFieldType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setEMFieldType(String value) {
    this.emFieldType = value;
  }

  public boolean isSetEMFieldType() {
    return (this.emFieldType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrientation() {
    return orientation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrientation(String value) {
    this.orientation = value;
  }

  public boolean isSetOrientation() {
    return (this.orientation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSpec() {
    return spec;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSpec(String value) {
    this.spec = value;
  }

  public boolean isSetSpec() {
    return (this.spec != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link CurveStd.CurveSpec...}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withCurveSpec(CurveStd.CurveSpec... values) {
    if (values != null) {
      getCurveSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link CurveSpec} instances
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withCurveSpec(Collection<CurveStd.CurveSpec> values) {
    if (values != null) {
      getCurveSpec().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Axis}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withXAxis(Axis value) {
    setXAxis(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Axis}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withYAxis(Axis value) {
    setYAxis(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withEMFieldType(String value) {
    setEMFieldType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withOrientation(String value) {
    setOrientation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CurveStd object instance
   * @since 3.1.0
   */
  public CurveStd withSpec(String value) {
    setSpec(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class CurveSpec {

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

    @XmlAttribute(name = "xValue")
    protected BigDecimal xValue;

    @XmlAttribute(name = "yValue")
    protected BigDecimal yValue;

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
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getXValue() {
      return xValue;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setXValue(BigDecimal value) {
      this.xValue = value;
    }

    public boolean isSetXValue() {
      return (this.xValue != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getYValue() {
      return yValue;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setYValue(BigDecimal value) {
      this.yValue = value;
    }

    public boolean isSetYValue() {
      return (this.yValue != null);
    }

    public CurveStd.CurveSpec withCls(String value) {
      setCls(value);
      return this;
    }

    public CurveStd.CurveSpec withXValue(BigDecimal value) {
      setXValue(value);
      return this;
    }

    public CurveStd.CurveSpec withYValue(BigDecimal value) {
      setYValue(value);
      return this;
    }

  }

  /**
   * Get a string representation of this CurveStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CurveStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CurveStd} requires {@link null CurveSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetCurveSpec();
  }

}
