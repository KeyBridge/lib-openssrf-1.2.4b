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
package us.gov.dod.standard.ssrf._1_2_4.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import sun.org.mozilla.javascript.ast.Assignment;

/**
 * SysOfStation defines the name of the system that this assignment belongs and
 * whether or not the assignment provides assets to or uses another assignment
 * resources. It also describes linkages to or from other datasets.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Example:
 * <pre>
 * &lt;SysOfStation&gt;
 *   &lt;SysName cls="U"&gt;BALTIMORE LMR SYSTEM&lt;/SysName&gt;
 * &lt;/SysOfStation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSysOfStation")
public class SysOfStation {

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
   * SysName - System Name (Optional)
   * <p>
   * The name of the system to which the frequency assignment belongs. A system
   * is considered two or more equipment having a common property, usually
   * geographic, administrative, functional, or operational in nature.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "sysName")
  protected String sysName;

  @XmlAttribute(name = "higherLevelSys", required = true)
  protected String higherLevelSys;

  @XmlAttribute(name = "lowerLevelSys")
  protected String lowerLevelSys;

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
   * Get the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSysName() {
    return sysName;
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSysName(String value) {
    this.sysName = value;
  }

  public boolean isSetSysName() {
    return (this.sysName != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getHigherLevelSys() {
    return higherLevelSys;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setHigherLevelSys(String value) {
    this.higherLevelSys = value;
  }

  public boolean isSetHigherLevelSys() {
    return (this.higherLevelSys != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLowerLevelSys() {
    return lowerLevelSys;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLowerLevelSys(String value) {
    this.lowerLevelSys = value;
  }

  public boolean isSetLowerLevelSys() {
    return (this.lowerLevelSys != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SysOfStation object instance
   * @since 3.1.0
   */
  public SysOfStation withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the name of the system to which the frequency assignment belongs. A
   * system is considered two or more equipment having a common property,
   * usually geographic, administrative, functional, or operational in nature.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SysOfStation object instance
   * @since 3.1.0
   */
  public SysOfStation withSysName(String value) {
    setSysName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SysOfStation object instance
   * @since 3.1.0
   */
  public SysOfStation withHigherLevelSys(String value) {
    setHigherLevelSys(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SysOfStation object instance
   * @since 3.1.0
   */
  public SysOfStation withLowerLevelSys(String value) {
    setLowerLevelSys(value);
    return this;
  }

  /**
   * Get a string representation of this SysOfStation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SysOfStation {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SysOfStation} requires {@link null higherLevelSys}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetHigherLevelSys();
  }

}
