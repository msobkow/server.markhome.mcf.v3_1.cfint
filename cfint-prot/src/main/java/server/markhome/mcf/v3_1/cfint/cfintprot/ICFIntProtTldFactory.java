
// Description: Java Protected Factory interface for Tld.

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
 *	ICFIntProtTldFactory protected interface for Tld
 */
public interface ICFIntProtTldFactory extends ICFIntPubTldFactory
{

	/**
	 *	Allocate a protected primary history key for Tld instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTldHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for Tld instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTldHPKey asPublic(ICFIntProtTldHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldByTenantIdxKey asPublic(ICFIntProtTldByTenantIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldByNameIdxKey asPublic(ICFIntProtTldByNameIdxKey src);

	/**
	 *	Allocate a protected Tld interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTld newProtRec();

	/**
	 *	Allocate a public Tld interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTld asPublic(ICFIntProtTld src);

	/**
	 *	Allocate a protected Tld history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldH newProtHRec();

	/**
	 *	Allocate a public Tld history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldH asPublic(ICFIntProtTldH src);

}
