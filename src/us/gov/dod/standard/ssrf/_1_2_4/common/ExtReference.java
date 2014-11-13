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
package us.gov.dod.standard.ssrf._1_2_4.common;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListMT;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListRE;

/**
 * ExtReference
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TExtReference", propOrder = {
  "attachment",
  "uri"
})
public class ExtReference extends Common<ExtReference> {

  @XmlElement(name = "Attachment")
  protected ExtReference.Attachment attachment;

  @XmlElement(name = "URI")
  protected ExtReference.URI uri;

  @XmlAttribute(name = "refCls")
  protected String refCls;

  @XmlAttribute(name = "type", required = true)
  protected ListRE type;

  @XmlAttribute(name = "date")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar date;

  @XmlAttribute(name = "author")
  protected String author;

  @XmlAttribute(name = "org")
  protected String org;

  @XmlAttribute(name = "num")
  protected String num;

  @XmlAttribute(name = "title")
  protected String title;

  public ExtReference.Attachment getAttachment() {
    return attachment;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ExtReference} instance
   * @since 3.1.0
   */
  public void setAttachment(ExtReference.Attachment value) {
    this.attachment = value;
  }

  public boolean isSetAttachment() {
    return (this.attachment != null);
  }

  public ExtReference.URI getURI() {
    return uri;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ExtReference} instance
   * @since 3.1.0
   */
  public void setURI(ExtReference.URI value) {
    this.uri = value;
  }

  public boolean isSetURI() {
    return (this.uri != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRefCls() {
    return refCls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRefCls(String value) {
    this.refCls = value;
  }

  public boolean isSetRefCls() {
    return (this.refCls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListRE} instance
   * @since 3.1.0
   */
  public ListRE getType() {
    return type;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListRE} instance
   * @since 3.1.0
   */
  public void setType(ListRE value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getDate() {
    return date;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setDate(Calendar value) {
    this.date = value;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    this.date = calendar;
  }

  public boolean isSetDate() {
    return (this.date != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAuthor(String value) {
    this.author = value;
  }

  public boolean isSetAuthor() {
    return (this.author != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrg() {
    return org;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrg(String value) {
    this.org = value;
  }

  public boolean isSetOrg() {
    return (this.org != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getNum() {
    return num;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setNum(String value) {
    this.num = value;
  }

  public boolean isSetNum() {
    return (this.num != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ExtReference.Attachment}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withAttachment(ExtReference.Attachment value) {
    setAttachment(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ExtReference.URI}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withURI(ExtReference.URI value) {
    setURI(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withRefCls(String value) {
    setRefCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListRE}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withType(ListRE value) {
    setType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withDate(Calendar value) {
    setDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withDate(Date value) {
    setDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withAuthor(String value) {
    setAuthor(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withOrg(String value) {
    setOrg(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withNum(String value) {
    setNum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ExtReference object instance
   * @since 3.1.0
   */
  public ExtReference withTitle(String value) {
    setTitle(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class Attachment {

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

    @XmlAttribute(name = "mimeType", required = true)
    protected ListMT mimeType;

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

    /**
     * Get
     * <p>
     * @return a {@link ListMT} instance
     * @since 3.1.0
     */
    public ListMT getMimeType() {
      return mimeType;
    }

    /**
     * Set
     * <p>
     * @param value a {@link ListMT} instance
     * @since 3.1.0
     */
    public void setMimeType(ListMT value) {
      this.mimeType = value;
    }

    public boolean isSetMimeType() {
      return (this.mimeType != null);
    }

    public ExtReference.Attachment withValue(String value) {
      setValue(value);
      return this;
    }

    public ExtReference.Attachment withCls(String value) {
      setCls(value);
      return this;
    }

    public ExtReference.Attachment withMimeType(ListMT value) {
      setMimeType(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class URI {

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

    @XmlAttribute(name = "network", required = true)
    protected String network;

    @XmlAttribute(name = "authRequired", required = true)
    protected String authRequired;

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

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getNetwork() {
      return network;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setNetwork(String value) {
      this.network = value;
    }

    public boolean isSetNetwork() {
      return (this.network != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getAuthRequired() {
      return authRequired;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setAuthRequired(String value) {
      this.authRequired = value;
    }

    public boolean isSetAuthRequired() {
      return (this.authRequired != null);
    }

    public ExtReference.URI withValue(String value) {
      setValue(value);
      return this;
    }

    public ExtReference.URI withCls(String value) {
      setCls(value);
      return this;
    }

    public ExtReference.URI withNetwork(String value) {
      setNetwork(value);
      return this;
    }

    public ExtReference.URI withAuthRequired(String value) {
      setAuthRequired(value);
      return this;
    }

  }

  /**
   * Get a string representation of this ExtReference instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ExtReference {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ExtReference} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null authRequired}, {@link null mimeType}, {@link null network}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetType();
  }

}
