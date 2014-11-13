package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTTU data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTTU extends AXmlAdapterString {

  public XmlAdapterLISTTU() {
    super(null, 1, false, "F|C|S|A|B|D");
  }
}
