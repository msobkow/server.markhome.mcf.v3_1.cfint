
// Description: Java JPA Factory interface for Tld.

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
 *	ICFIntTldFactory interface for Tld
 */
public interface ICFIntTldFactory extends ICFIntProtTldFactory
{

	/**
	 *	Allocate a primary history key for Tld instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntTldHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for Tld instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTldHPKey asProtected(ICFIntTldHPKey src);

	/**
	 *	Allocate a public primary history key for Tld instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTldHPKey asPublic(ICFIntTldHPKey src);

	/**
	 *	Allocate a TenantIdx key over Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTldByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldByTenantIdxKey asProtected(ICFIntTldByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldByTenantIdxKey asPublic(ICFIntTldByTenantIdxKey src);

	/**
	 *	Allocate a NameIdx key over Tld instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTldByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldByNameIdxKey asProtected(ICFIntTldByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldByNameIdxKey asPublic(ICFIntTldByNameIdxKey src);

	/**
	 *	Allocate a Tld interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTld newRec();

	/**
	 *	Allocate a protected Tld interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTld asProtected(ICFIntTld src);

	/**
	 *	Allocate a public Tld interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTld asPublic(ICFIntTld src);

	/**
	 *	Allocate a Tld history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTldH newHRec();

	/**
	 *	Allocate a protected Tld history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTldH asProtected(ICFIntTldH src);

	/**
	 *	Allocate a public Tld history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTldH asPublic(ICFIntTldH src);

}
