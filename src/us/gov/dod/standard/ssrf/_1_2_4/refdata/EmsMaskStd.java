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
 * EmsMaskStd
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEmsMaskStd", propOrder = {
  "emsMaskSpec"
})
public class EmsMaskStd extends Std<EmsMaskStd> {

  @XmlElement(name = "EmsMaskSpec", required = true)
  protected List<EmsMaskStd.EmsMaskSpec> emsMaskSpec;

  @XmlAttribute(name = "curveType")
  protected String curveType;

  public List<EmsMaskStd.EmsMaskSpec> getEmsMaskSpec() {
    if (emsMaskSpec == null) {
      emsMaskSpec = new ArrayList<>();
    }
    return this.emsMaskSpec;
  }

  public boolean isSetEmsMaskSpec() {
    return ((this.emsMaskSpec != null) && (!this.emsMaskSpec.isEmpty()));
  }

  /**
   * Clear the EmsMaskSpec field. This sets the field to null.
   */
  public void unsetEmsMaskSpec() {
    this.emsMaskSpec = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCurveType() {
    return curveType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCurveType(String value) {
    this.curveType = value;
  }

  public boolean isSetCurveType() {
    return (this.curveType != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link EmsMaskStd.EmsMaskSpec...}
   * @return The current EmsMaskStd object instance
   * @since 3.1.0
   */
  public EmsMaskStd withEmsMaskSpec(EmsMaskStd.EmsMaskSpec... values) {
    if (values != null) {
      getEmsMaskSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EmsMaskSpec} instances
   * @return The current EmsMaskStd object instance
   * @since 3.1.0
   */
  public EmsMaskStd withEmsMaskSpec(Collection<EmsMaskStd.EmsMaskSpec> values) {
    if (values != null) {
      getEmsMaskSpec().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsMaskStd object instance
   * @since 3.1.0
   */
  public EmsMaskStd withCurveType(String value) {
    setCurveType(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class EmsMaskSpec {

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

    @XmlAttribute(name = "xLow")
    protected String xLow;

    @XmlAttribute(name = "xLowOp")
    protected String xLowOp;

    @XmlAttribute(name = "xVariable")
    protected String xVariable;

    @XmlAttribute(name = "xHighOp")
    protected String xHighOp;

    @XmlAttribute(name = "xHigh")
    protected String xHigh;

    @XmlAttribute(name = "yVariable")
    protected String yVariable;

    @XmlAttribute(name = "severity")
    protected String severity;

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
    public String getXLow() {
      return xLow;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setXLow(String value) {
      this.xLow = value;
    }

    public boolean isSetXLow() {
      return (this.xLow != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getXLowOp() {
      return xLowOp;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setXLowOp(String value) {
      this.xLowOp = value;
    }

    public boolean isSetXLowOp() {
      return (this.xLowOp != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getXVariable() {
      return xVariable;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setXVariable(String value) {
      this.xVariable = value;
    }

    public boolean isSetXVariable() {
      return (this.xVariable != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getXHighOp() {
      return xHighOp;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setXHighOp(String value) {
      this.xHighOp = value;
    }

    public boolean isSetXHighOp() {
      return (this.xHighOp != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getXHigh() {
      return xHigh;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setXHigh(String value) {
      this.xHigh = value;
    }

    public boolean isSetXHigh() {
      return (this.xHigh != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getYVariable() {
      return yVariable;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setYVariable(String value) {
      this.yVariable = value;
    }

    public boolean isSetYVariable() {
      return (this.yVariable != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getSeverity() {
      return severity;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setSeverity(String value) {
      this.severity = value;
    }

    public boolean isSetSeverity() {
      return (this.severity != null);
    }

    public EmsMaskStd.EmsMaskSpec withCls(String value) {
      setCls(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withXLow(String value) {
      setXLow(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withXLowOp(String value) {
      setXLowOp(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withXVariable(String value) {
      setXVariable(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withXHighOp(String value) {
      setXHighOp(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withXHigh(String value) {
      setXHigh(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withYVariable(String value) {
      setYVariable(value);
      return this;
    }

    public EmsMaskStd.EmsMaskSpec withSeverity(String value) {
      setSeverity(value);
      return this;
    }

  }

  /**
   * Get a string representation of this EmsMaskStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EmsMaskStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsMaskStd} requires {@link null EmsMaskSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetEmsMaskSpec();
  }

}
