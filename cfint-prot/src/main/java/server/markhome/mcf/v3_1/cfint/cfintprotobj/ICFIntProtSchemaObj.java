// Description: Java 25 Protected Schema Object interface for CFIntProt.

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

package server.markhome.mcf.v3_1.cfint.cfintprotobj;

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
import server.markhome.mcf.v3_1.cfint.cfintprot.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;

public interface ICFIntProtSchemaObj
	extends ICFSecPubSchemaObj
{
	public ICFSecPubSchema getCFSecProtBackingStore();
	public void setCFSecProtBackingStore(ICFSecPubSchema cfsecprotBackingStore);

	public ICFIntProtSchema getCFIntProtBackingStore();
	public void setCFIntProtBackingStore(ICFIntProtSchema cfintprotBackingStore);

	/**
	 *	Get the License interface for the schema.
	 *
	 *	@return	The ICFIntProtLicenseTableObj interface implementation for the schema.
	 */
	ICFIntProtLicenseTableObj getLicenseTableObj();

	/**
	 *	Get the MajorVersion interface for the schema.
	 *
	 *	@return	The ICFIntProtMajorVersionTableObj interface implementation for the schema.
	 */
	ICFIntProtMajorVersionTableObj getMajorVersionTableObj();

	/**
	 *	Get the MimeType interface for the schema.
	 *
	 *	@return	The ICFIntProtMimeTypeTableObj interface implementation for the schema.
	 */
	ICFIntProtMimeTypeTableObj getMimeTypeTableObj();

	/**
	 *	Get the MinorVersion interface for the schema.
	 *
	 *	@return	The ICFIntProtMinorVersionTableObj interface implementation for the schema.
	 */
	ICFIntProtMinorVersionTableObj getMinorVersionTableObj();

	/**
	 *	Get the SubProject interface for the schema.
	 *
	 *	@return	The ICFIntProtSubProjectTableObj interface implementation for the schema.
	 */
	ICFIntProtSubProjectTableObj getSubProjectTableObj();

	/**
	 *	Get the Tld interface for the schema.
	 *
	 *	@return	The ICFIntProtTldTableObj interface implementation for the schema.
	 */
	ICFIntProtTldTableObj getTldTableObj();

	/**
	 *	Get the TopDomain interface for the schema.
	 *
	 *	@return	The ICFIntProtTopDomainTableObj interface implementation for the schema.
	 */
	ICFIntProtTopDomainTableObj getTopDomainTableObj();

	/**
	 *	Get the TopProject interface for the schema.
	 *
	 *	@return	The ICFIntProtTopProjectTableObj interface implementation for the schema.
	 */
	ICFIntProtTopProjectTableObj getTopProjectTableObj();

	/**
	 *	Get the URLProtocol interface for the schema.
	 *
	 *	@return	The ICFIntProtURLProtocolTableObj interface implementation for the schema.
	 */
	ICFIntProtURLProtocolTableObj getURLProtocolTableObj();
}
