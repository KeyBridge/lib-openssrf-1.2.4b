package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTUT data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTUT extends AXmlAdapterString {

  public XmlAdapterLISTUT() {
    super(null, 1, false, "A|C|O|P|S|T|U|X");
  }
}
