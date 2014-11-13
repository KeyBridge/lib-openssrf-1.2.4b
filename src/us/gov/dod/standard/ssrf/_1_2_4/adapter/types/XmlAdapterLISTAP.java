package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTAP data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTAP extends AXmlAdapterString {

  public XmlAdapterLISTAP() {
    super(null, 4, false, "HH|HV|VV|VH|ELHH|ELHV|ELVV|ELVH|X");
  }
}
