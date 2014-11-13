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
package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.common.ExtReference;

/**
 * Enumerated values for fields using the ListMT type.
 * <p>
 * Used in {@link ExtReference}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListMT")
@XmlEnum
public enum ListMT {

  @XmlEnumValue("application/msword")
  APPLICATION_MSWORD("application/msword"),
  @XmlEnumValue("application/octet-stream")
  APPLICATION_OCTET_STREAM("application/octet-stream"),
  @XmlEnumValue("application/pdf")
  APPLICATION_PDF("application/pdf"),
  @XmlEnumValue("application/postscript")
  APPLICATION_POSTSCRIPT("application/postscript"),
  @XmlEnumValue("application/visio")
  APPLICATION_VISIO("application/visio"),
  @XmlEnumValue("application/vnd.ms-excel")
  APPLICATION_VND_MS_EXCEL("application/vnd.ms-excel"),
  @XmlEnumValue("application/vnd.ms-powerpoint")
  APPLICATION_VND_MS_POWERPOINT("application/vnd.ms-powerpoint"),
  @XmlEnumValue("application/vnd.openxmlformats")
  APPLICATION_VND_OPENXMLFORMATS("application/vnd.openxmlformats"),
  @XmlEnumValue("application/vnd.sun.xml.calc")
  APPLICATION_VND_SUN_XML_CALC("application/vnd.sun.xml.calc"),
  @XmlEnumValue("application/vnd.sun.xml.draw")
  APPLICATION_VND_SUN_XML_DRAW("application/vnd.sun.xml.draw"),
  @XmlEnumValue("application/vnd.sun.xml.impress")
  APPLICATION_VND_SUN_XML_IMPRESS("application/vnd.sun.xml.impress"),
  @XmlEnumValue("application/vnd.sun.xml.writer")
  APPLICATION_VND_SUN_XML_WRITER("application/vnd.sun.xml.writer"),
  @XmlEnumValue("application/wordperfect")
  APPLICATION_WORDPERFECT("application/wordperfect"),
  @XmlEnumValue("application/x-dvi")
  APPLICATION_X_DVI("application/x-dvi"),
  @XmlEnumValue("application/x-latex")
  APPLICATION_X_LATEX("application/x-latex"),
  @XmlEnumValue("application/xhtml+xml")
  APPLICATION_XHTML_XML("application/xhtml+xml"),
  @XmlEnumValue("application/xml")
  APPLICATION_XML("application/xml"),
  @XmlEnumValue("application/xml-dtd")
  APPLICATION_XML_DTD("application/xml-dtd"),
  @XmlEnumValue("application/xslt+xml")
  APPLICATION_XSLT_XML("application/xslt+xml"),
  @XmlEnumValue("application/zip")
  APPLICATION_ZIP("application/zip"),
  @XmlEnumValue("audio/mpeg")
  AUDIO_MPEG("audio/mpeg"),
  @XmlEnumValue("image/bmp")
  IMAGE_BMP("image/bmp"),
  @XmlEnumValue("image/gif")
  IMAGE_GIF("image/gif"),
  @XmlEnumValue("image/jpeg")
  IMAGE_JPEG("image/jpeg"),
  @XmlEnumValue("image/png")
  IMAGE_PNG("image/png"),
  @XmlEnumValue("image/tiff")
  IMAGE_TIFF("image/tiff"),
  @XmlEnumValue("image/svg+xml")
  IMAGE_SVG_XML("image/svg+xml"),
  @XmlEnumValue("text/css")
  TEXT_CSS("text/css"),
  @XmlEnumValue("text/html")
  TEXT_HTML("text/html"),
  @XmlEnumValue("text/plain")
  TEXT_PLAIN("text/plain"),
  @XmlEnumValue("text/rtf")
  TEXT_RTF("text/rtf"),
  @XmlEnumValue("text/sgml")
  TEXT_SGML("text/sgml"),
  @XmlEnumValue("video/mp4")
  VIDEO_MP_4("video/mp4"),
  @XmlEnumValue("video/mpeg")
  VIDEO_MPEG("video/mpeg");
  private final String value;

  ListMT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListMT fromValue(String v) {
    for (ListMT c : ListMT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
