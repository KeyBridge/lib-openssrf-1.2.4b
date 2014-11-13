package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTCT data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTCT extends AXmlAdapterString {

  public XmlAdapterLISTCT() {
    super(null, 6, false, "BASE|FILTER|GAIN|IFSEL1|IFSEL2|IFSEL3|IFSEL4|IFSEL5|INTMOD|RFSEL|RFSPCT|RXIMAG|RXRESP|TXHARM|TXSPUR");
  }
}
