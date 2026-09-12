
// Description: Java JPA Factory interface for License.

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

package server.markhome.mcf.v3_1.cfint.cfint;

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

import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;

/*
 *	ICFIntLicenseFactory interface for License
 */
public interface ICFIntLicenseFactory extends ICFIntProtLicenseFactory
{

	/**
	 *	Allocate a primary history key for License instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntLicenseHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for License instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtLicenseHPKey asProtected(ICFIntLicenseHPKey src);

	/**
	 *	Allocate a public primary history key for License instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubLicenseHPKey asPublic(ICFIntLicenseHPKey src);

	/**
	 *	Allocate a LicnTenantIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntLicenseByLicnTenantIdxKey newByLicnTenantIdxKey();

	/**
	 *	Allocate a protected LicnTenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByLicnTenantIdxKey asProtected(ICFIntLicenseByLicnTenantIdxKey src);

	/**
	 *	Allocate a public LicnTenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByLicnTenantIdxKey asPublic(ICFIntLicenseByLicnTenantIdxKey src);

	/**
	 *	Allocate a DomainIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntLicenseByDomainIdxKey newByDomainIdxKey();

	/**
	 *	Allocate a protected DomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByDomainIdxKey asProtected(ICFIntLicenseByDomainIdxKey src);

	/**
	 *	Allocate a public DomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByDomainIdxKey asPublic(ICFIntLicenseByDomainIdxKey src);

	/**
	 *	Allocate a UNameIdx key over License instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntLicenseByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseByUNameIdxKey asProtected(ICFIntLicenseByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseByUNameIdxKey asPublic(ICFIntLicenseByUNameIdxKey src);

	/**
	 *	Allocate a License interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntLicense newRec();

	/**
	 *	Allocate a protected License interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicense asProtected(ICFIntLicense src);

	/**
	 *	Allocate a public License interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicense asPublic(ICFIntLicense src);

	/**
	 *	Allocate a License history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntLicenseH newHRec();

	/**
	 *	Allocate a protected License history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtLicenseH asProtected(ICFIntLicenseH src);

	/**
	 *	Allocate a public License history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubLicenseH asPublic(ICFIntLicenseH src);

}
