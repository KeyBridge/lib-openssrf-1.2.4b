package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTIN data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTIN extends AXmlAdapterString {

  public XmlAdapterLISTIN() {
    super(null, 1, false, "1|2|3|A|E|H|I|J|K|L|M|N|O|P|Q|S|T|U|V|W|Y|Z");
  }
}
