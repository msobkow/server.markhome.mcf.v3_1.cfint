
// Description: Java Protected Factory interface for License.

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

package server.markhome.mcf.v3_1.cfint.cfintprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;

/*
 *	ICFIntProtLicenseFactory protected interface for License
 */
public interface ICFIntProtLicenseFactory extends ICFIntPubLicenseFactory
{

	/**
	 *	Allocate a protected primary history key for License instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtLicenseHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for License instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubLicenseHPKey asPublic(ICFIntProtLicenseHPKey src);

	/**
	 *	Allocate a protected LicnTenantIdx key over protected License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByLicnTenantIdxKey newProtByLicnTenantIdxKey();

	/**
	 *	Allocate a public LicnTenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByLicnTenantIdxKey asPublic(ICFIntProtLicenseByLicnTenantIdxKey src);

	/**
	 *	Allocate a protected DomainIdx key over protected License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByDomainIdxKey newProtByDomainIdxKey();

	/**
	 *	Allocate a public DomainIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByDomainIdxKey asPublic(ICFIntProtLicenseByDomainIdxKey src);

	/**
	 *	Allocate a protected UNameIdx key over protected License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByUNameIdxKey asPublic(ICFIntProtLicenseByUNameIdxKey src);

	/**
	 *	Allocate a protected License interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicense newProtRec();

	/**
	 *	Allocate a public License interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicense asPublic(ICFIntProtLicense src);

	/**
	 *	Allocate a protected License history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseH newProtHRec();

	/**
	 *	Allocate a public License history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseH asPublic(ICFIntProtLicenseH src);

}
