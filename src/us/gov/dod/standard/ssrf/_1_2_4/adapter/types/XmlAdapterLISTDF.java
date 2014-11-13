package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTDF data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTDF extends AXmlAdapterString {

  public XmlAdapterLISTDF() {
    super(null, 1, false, "N|O|R|S|T|U|V|W|X|Y|Z");
  }
}
