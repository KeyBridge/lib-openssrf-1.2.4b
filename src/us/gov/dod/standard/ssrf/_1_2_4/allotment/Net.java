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

import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.TimeFrame;

/**
 * Net
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNet", propOrder = {
  "callInfo",
  "colour",
  "comsecKeymat",
  "guardRequirements",
  "missionPriority"
})
public class Net {

  @XmlElement(name = "CallInfo")
  protected List<Net.CallInfo> callInfo;

  @XmlElement(name = "Colour")
  protected Net.Colour colour;

  @XmlElement(name = "COMSECKeymat")
  protected Net.COMSECKeymat comsecKeymat;

  @XmlElement(name = "GuardRequirements")
  protected List<Net.GuardRequirements> guardRequirements;

  @XmlElement(name = "MissionPriority")
  protected Net.MissionPriority missionPriority;
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

  @XmlAttribute(name = "lineNum")
  protected BigInteger lineNum;

  @XmlAttribute(name = "name", required = true)
  protected String name;

  @XmlAttribute(name = "protCode")
  protected String protCode;

  @XmlAttribute(name = "restoral")
  protected String restoral;

  @XmlAttribute(name = "pushNum")
  protected String pushNum;

  public List<Net.CallInfo> getCallInfo() {
    if (callInfo == null) {
      callInfo = new ArrayList<>();
    }
    return this.callInfo;
  }

  public boolean isSetCallInfo() {
    return ((this.callInfo != null) && (!this.callInfo.isEmpty()));
  }

  /**
   * Clear the CallInfo field. This sets the field to null.
   */
  public void unsetCallInfo() {
    this.callInfo = null;
  }

  public Net.Colour getColour() {
    return colour;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Net} instance
   * @since 3.1.0
   */
  public void setColour(Net.Colour value) {
    this.colour = value;
  }

  public boolean isSetColour() {
    return (this.colour != null);
  }

  public Net.COMSECKeymat getCOMSECKeymat() {
    return comsecKeymat;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Net} instance
   * @since 3.1.0
   */
  public void setCOMSECKeymat(Net.COMSECKeymat value) {
    this.comsecKeymat = value;
  }

  public boolean isSetCOMSECKeymat() {
    return (this.comsecKeymat != null);
  }

  public List<Net.GuardRequirements> getGuardRequirements() {
    if (guardRequirements == null) {
      guardRequirements = new ArrayList<>();
    }
    return this.guardRequirements;
  }

  public boolean isSetGuardRequirements() {
    return ((this.guardRequirements != null) && (!this.guardRequirements.isEmpty()));
  }

  /**
   * Clear the GuardRequirements field. This sets the field to null.
   */
  public void unsetGuardRequirements() {
    this.guardRequirements = null;
  }

  public Net.MissionPriority getMissionPriority() {
    return missionPriority;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Net} instance
   * @since 3.1.0
   */
  public void setMissionPriority(Net.MissionPriority value) {
    this.missionPriority = value;
  }

  public boolean isSetMissionPriority() {
    return (this.missionPriority != null);
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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getLineNum() {
    return lineNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setLineNum(BigInteger value) {
    this.lineNum = value;
  }

  public boolean isSetLineNum() {
    return (this.lineNum != null);
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
  public String getProtCode() {
    return protCode;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setProtCode(String value) {
    this.protCode = value;
  }

  public boolean isSetProtCode() {
    return (this.protCode != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRestoral() {
    return restoral;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRestoral(String value) {
    this.restoral = value;
  }

  public boolean isSetRestoral() {
    return (this.restoral != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPushNum() {
    return pushNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPushNum(String value) {
    this.pushNum = value;
  }

  public boolean isSetPushNum() {
    return (this.pushNum != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Net.CallInfo...}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withCallInfo(Net.CallInfo... values) {
    if (values != null) {
      getCallInfo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link CallInfo} instances
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withCallInfo(Collection<Net.CallInfo> values) {
    if (values != null) {
      getCallInfo().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Net.Colour}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withColour(Net.Colour value) {
    setColour(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Net.COMSECKeymat}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withCOMSECKeymat(Net.COMSECKeymat value) {
    setCOMSECKeymat(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link Net.GuardRequirements...}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withGuardRequirements(Net.GuardRequirements... values) {
    if (values != null) {
      getGuardRequirements().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link GuardRequirements} instances
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withGuardRequirements(Collection<Net.GuardRequirements> values) {
    if (values != null) {
      getGuardRequirements().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Net.MissionPriority}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withMissionPriority(Net.MissionPriority value) {
    setMissionPriority(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withLineNum(BigInteger value) {
    setLineNum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withProtCode(String value) {
    setProtCode(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withRestoral(String value) {
    setRestoral(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Net object instance
   * @since 3.1.0
   */
  public Net withPushNum(String value) {
    setPushNum(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class CallInfo {

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

    @XmlAttribute(name = "timePeriod")
    protected BigInteger timePeriod;

    @XmlAttribute(name = "callSign", required = true)
    protected String callSign;

    @XmlAttribute(name = "callWord")
    protected String callWord;

    @XmlAttribute(name = "TAD")
    protected String tad;

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
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getTimePeriod() {
      return timePeriod;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setTimePeriod(BigInteger value) {
      this.timePeriod = value;
    }

    public boolean isSetTimePeriod() {
      return (this.timePeriod != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCallSign() {
      return callSign;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCallSign(String value) {
      this.callSign = value;
    }

    public boolean isSetCallSign() {
      return (this.callSign != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCallWord() {
      return callWord;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCallWord(String value) {
      this.callWord = value;
    }

    public boolean isSetCallWord() {
      return (this.callWord != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getTAD() {
      return tad;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setTAD(String value) {
      this.tad = value;
    }

    public boolean isSetTAD() {
      return (this.tad != null);
    }

    public Net.CallInfo withCls(String value) {
      setCls(value);
      return this;
    }

    public Net.CallInfo withTimePeriod(BigInteger value) {
      setTimePeriod(value);
      return this;
    }

    public Net.CallInfo withCallSign(String value) {
      setCallSign(value);
      return this;
    }

    public Net.CallInfo withCallWord(String value) {
      setCallWord(value);
      return this;
    }

    public Net.CallInfo withTAD(String value) {
      setTAD(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Colour {

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

    @XmlAttribute(name = "word", required = true)
    protected String word;

    @XmlAttribute(name = "num", required = true)
    protected BigInteger num;

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
    public String getWord() {
      return word;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setWord(String value) {
      this.word = value;
    }

    public boolean isSetWord() {
      return (this.word != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getNum() {
      return num;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setNum(BigInteger value) {
      this.num = value;
    }

    public boolean isSetNum() {
      return (this.num != null);
    }

    public Net.Colour withCls(String value) {
      setCls(value);
      return this;
    }

    public Net.Colour withWord(String value) {
      setWord(value);
      return this;
    }

    public Net.Colour withNum(BigInteger value) {
      setNum(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class COMSECKeymat {

    @XmlValue
    protected String value;
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
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setValue(String value) {
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

    public Net.COMSECKeymat withValue(String value) {
      setValue(value);
      return this;
    }

    public Net.COMSECKeymat withCls(String value) {
      setCls(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "timeFrame"
  })
  public static class GuardRequirements {

    @XmlElement(name = "TimeFrame")
    protected TimeFrame timeFrame;
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

    @XmlAttribute(name = "serial", required = true)
    protected String serial;

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

    public Net.GuardRequirements withTimeFrame(TimeFrame value) {
      setTimeFrame(value);
      return this;
    }

    public Net.GuardRequirements withCls(String value) {
      setCls(value);
      return this;
    }

    public Net.GuardRequirements withSerial(String value) {
      setSerial(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class MissionPriority {

    @XmlValue
    protected String value;
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
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setValue(String value) {
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

    public Net.MissionPriority withValue(String value) {
      setValue(value);
      return this;
    }

    public Net.MissionPriority withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Net instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Net {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Net} requires
   * {@link null callSign}, {@link null name}, {@link null num}, {@link null serial}, {@link null word}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName();
  }

}
