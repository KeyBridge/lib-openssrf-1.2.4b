package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTOP data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTOP extends AXmlAdapterString {

  public XmlAdapterLISTOP() {
    super(null, 2, false, "EQ|GE|GT|LE|LT");
  }
}
