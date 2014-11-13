package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTDC data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTDC extends AXmlAdapterString {

  public XmlAdapterLISTDC() {
    super(null, 5, false, "CAW5|CAW15|CAWUD|COW5|COW15|COWUD|CLSGN|CLSGP|CMSKY|CWDGP|EXTGP|FQSGP|FRQGP|NEDEF|NETXP|NTSFX|NSDEF|PYRO|PYDEF|SHRGP|SMDEF|SMOKE");
  }
}
