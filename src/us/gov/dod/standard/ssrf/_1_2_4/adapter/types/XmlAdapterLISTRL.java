package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTRL data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTRL extends AXmlAdapterString {

  public XmlAdapterLISTRL() {
    super(null, 1, false, "A|B|C|D|E|F|H|J|K|L|N|P|Q|R");
  }
}