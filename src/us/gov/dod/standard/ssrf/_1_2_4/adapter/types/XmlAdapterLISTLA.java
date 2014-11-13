package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTLA data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTLA extends AXmlAdapterString {

  public XmlAdapterLISTLA() {
    super(null, 2, false, "LA|LG|LT");
  }
}
