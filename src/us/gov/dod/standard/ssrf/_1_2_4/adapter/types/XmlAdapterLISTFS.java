package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTFS data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTFS extends AXmlAdapterString {

  public XmlAdapterLISTFS() {
    super(null, 1, false, "0|1|2|3|4");
  }
}
