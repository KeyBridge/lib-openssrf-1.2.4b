package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTPY data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTPY extends AXmlAdapterString {

  public XmlAdapterLISTPY() {
    super(null, 3, false, "AC|AP|GC|GP|GSS|RC|RP|RSS|VSS|WC|WP|YSS");
  }
}
