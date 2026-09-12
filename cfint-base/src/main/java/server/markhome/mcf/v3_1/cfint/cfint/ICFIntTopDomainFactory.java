
// Description: Java JPA Factory interface for TopDomain.

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
 *	ICFIntTopDomainFactory interface for TopDomain
 */
public interface ICFIntTopDomainFactory extends ICFIntProtTopDomainFactory
{

	/**
	 *	Allocate a primary history key for TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntTopDomainHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for TopDomain instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTopDomainHPKey asProtected(ICFIntTopDomainHPKey src);

	/**
	 *	Allocate a public primary history key for TopDomain instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTopDomainHPKey asPublic(ICFIntTopDomainHPKey src);

	/**
	 *	Allocate a TenantIdx key over TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopDomainByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByTenantIdxKey asProtected(ICFIntTopDomainByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByTenantIdxKey asPublic(ICFIntTopDomainByTenantIdxKey src);

	/**
	 *	Allocate a TldIdx key over TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopDomainByTldIdxKey newByTldIdxKey();

	/**
	 *	Allocate a protected TldIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByTldIdxKey asProtected(ICFIntTopDomainByTldIdxKey src);

	/**
	 *	Allocate a public TldIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByTldIdxKey asPublic(ICFIntTopDomainByTldIdxKey src);

	/**
	 *	Allocate a NameIdx key over TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopDomainByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByNameIdxKey asProtected(ICFIntTopDomainByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByNameIdxKey asPublic(ICFIntTopDomainByNameIdxKey src);

	/**
	 *	Allocate a TopDomain interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopDomain newRec();

	/**
	 *	Allocate a protected TopDomain interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomain asProtected(ICFIntTopDomain src);

	/**
	 *	Allocate a public TopDomain interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomain asPublic(ICFIntTopDomain src);

	/**
	 *	Allocate a TopDomain history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopDomainH newHRec();

	/**
	 *	Allocate a protected TopDomain history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainH asProtected(ICFIntTopDomainH src);

	/**
	 *	Allocate a public TopDomain history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainH asPublic(ICFIntTopDomainH src);

}
