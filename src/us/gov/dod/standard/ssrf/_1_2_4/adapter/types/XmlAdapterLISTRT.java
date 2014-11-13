package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTRT data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTRT extends AXmlAdapterString {

  public XmlAdapterLISTRT() {
    super(null, 1, false, "B|C|D|G|H|J|K|L|N|O|P|U|V|Z");
  }
}
