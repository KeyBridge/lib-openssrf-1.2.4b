# OpenSSRF 
## Developer Implementation v1.2.4b-r00 (Release)

OpenSSRF is an open source reference implementation of the Standard Spectrum Resource 
Format (SSRF). The specification is defined in MCEB Pub 8. 

## SSRF v1.2.4 is _Twice_ Superceded by [SSRF v3.0.0](https://github.com/KeyBridge/lib-openssrf-3.0.0) and by [SSRF v3.1.0](https://github.com/KeyBridge/lib-openssrf)
This software library is NOT ACTIVELY DEVELOPED.

This implementation of the legacy SSRF data format is provided to facilitate
system and service migration to SSRF v3.0 and 3.1. 

This library is currenlty developed for the purpose of reading legacy SSRF XML 
documents and converting those documents to a more recent version of the SSRF
specification (3.0 or 3.1). Accordingly, this implementation does not include 
document assembly, validation or write-to-XML utilities.

Visit [OpenSSRF.org](http://openssrf.org) for more information.

Download the latest release at [lib-openssrf](https://github.com/KeyBridge/lib-openssrf).

### Sponsor Opportunity
Contact [Key Bridge Global LLC](https://keybridgeglobal.com) or the
[Wireless Innovation Forum](http://www.wirelessinnovation.org) to join or to sponsor 
active development of this project.

## Background
This software library is a release of the OpenSSRF project, whose goal is to develop and
publish a complete and certifiably compliant reference implementation of the most recent
Standard Spectrum Resource Format (currently version 3.1.0) into Java.

## In this Release
The software contained in this release is, to the best of our knowledge, a complete
and compliant implementation of the SSRF v1.2.4b data format specification (with changes as of 01, May 2009). 

Because this implementation is intended to efficiently (and forgivingly) READ SSRF documents and not to WRITE
them the software classes in this release do NOT include several important standard mechanisms for
the production of valid SSRF documents. The following limitations allow the import and reading of
(possibly) non-compliant SSRF v1.2.4 documents but also preclude the production of valid SSRF v1.2.4 XML.

 * Field validation not implemented
 * Required field configuration not reliable - does not inspect internal classes
 * Use of List instead of Set allows for duplicate list entries
 * equals(), hashcode() are not implemented; toString() not implemented

## About this Project
This project is managed by the Open Standard Spectrum Resource Format (SSRF) group and organized
within the Wireless Innovation Forum's [Spectrum Innovation Committee](http://groups.winnforum.org/spectrum_innovation_committee).

## Availability and Use
The source code and documentation within this project are available under the Apache 2.0 license, copies of which are
included in the source tree and documentation directories.

You are free to download, use and modify this project without restriction, subject to the terms of the Apache 2.0 license.

## Give Back
Your code and contributions are welcome. There are two ways you can give back and help improve and perfect this reference implementation.

 1. Join the Wireless Innovation Forum. By joining the Forum you gain formal and informal access to a large community of like-minded companies, government agencies and individuals working together for a common goal. Forum members may also participate in the architecture committee of this software project and also influence future development and improvement of the SSRF specification.
 2. Contribute software. Anyone can fork the code and submit your updates, fixes, utilities and other contributions directly to Key Bridge. We will review and incorporate anything that is helpful.

## References

 * [OpenSSRF.org](http://openssrf.org)
 * [Key Bridge Global LLC](https://keybridgeglobal.com)
 * [Standard Spectrum Resource Format (SSRF) -- MCEB Pub 8](https://acc.dau.mil/CommunityBrowser.aspx?id=283273&lang=en-US)
 * [Wireless Innovation Forum](http://www.wirelessinnovation.org)



