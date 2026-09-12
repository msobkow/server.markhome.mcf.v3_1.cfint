// Description: Java 25 Public Schema Object interface for CFIntPub.

/*
 *	server.markhome.mcf.CFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal 3.1 CFInt - Internet Essentials
 *	
 *	This file is part of Mark's Code Fractal CFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *	
 */

package server.markhome.mcf.v3_1.cfint.cfintpubobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;

import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;

public interface ICFIntPubSchemaObj
	extends ICFSecPubSchemaObj
{
	public ICFSecPubSchema getCFSecPubBackingStore();
	public void setCFSecPubBackingStore(ICFSecPubSchema cfsecpubBackingStore);

	public ICFIntPubSchema getCFIntPubBackingStore();
	public void setCFIntPubBackingStore(ICFIntPubSchema cfintpubBackingStore);

	/**
	 *	Get the License interface for the schema.
	 *
	 *	@return	The ICFIntPubLicenseTableObj interface implementation for the schema.
	 */
	ICFIntPubLicenseTableObj getLicenseTableObj();

	/**
	 *	Get the MajorVersion interface for the schema.
	 *
	 *	@return	The ICFIntPubMajorVersionTableObj interface implementation for the schema.
	 */
	ICFIntPubMajorVersionTableObj getMajorVersionTableObj();

	/**
	 *	Get the MimeType interface for the schema.
	 *
	 *	@return	The ICFIntPubMimeTypeTableObj interface implementation for the schema.
	 */
	ICFIntPubMimeTypeTableObj getMimeTypeTableObj();

	/**
	 *	Get the MinorVersion interface for the schema.
	 *
	 *	@return	The ICFIntPubMinorVersionTableObj interface implementation for the schema.
	 */
	ICFIntPubMinorVersionTableObj getMinorVersionTableObj();

	/**
	 *	Get the SubProject interface for the schema.
	 *
	 *	@return	The ICFIntPubSubProjectTableObj interface implementation for the schema.
	 */
	ICFIntPubSubProjectTableObj getSubProjectTableObj();

	/**
	 *	Get the Tld interface for the schema.
	 *
	 *	@return	The ICFIntPubTldTableObj interface implementation for the schema.
	 */
	ICFIntPubTldTableObj getTldTableObj();

	/**
	 *	Get the TopDomain interface for the schema.
	 *
	 *	@return	The ICFIntPubTopDomainTableObj interface implementation for the schema.
	 */
	ICFIntPubTopDomainTableObj getTopDomainTableObj();

	/**
	 *	Get the TopProject interface for the schema.
	 *
	 *	@return	The ICFIntPubTopProjectTableObj interface implementation for the schema.
	 */
	ICFIntPubTopProjectTableObj getTopProjectTableObj();

	/**
	 *	Get the URLProtocol interface for the schema.
	 *
	 *	@return	The ICFIntPubURLProtocolTableObj interface implementation for the schema.
	 */
	ICFIntPubURLProtocolTableObj getURLProtocolTableObj();
}
