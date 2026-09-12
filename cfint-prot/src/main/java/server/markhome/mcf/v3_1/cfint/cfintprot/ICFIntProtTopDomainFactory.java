
// Description: Java Protected Factory interface for TopDomain.

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
 *	ICFIntProtTopDomainFactory protected interface for TopDomain
 */
public interface ICFIntProtTopDomainFactory extends ICFIntPubTopDomainFactory
{

	/**
	 *	Allocate a protected primary history key for TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTopDomainHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for TopDomain instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTopDomainHPKey asPublic(ICFIntProtTopDomainHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByTenantIdxKey asPublic(ICFIntProtTopDomainByTenantIdxKey src);

	/**
	 *	Allocate a protected TldIdx key over protected TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByTldIdxKey newProtByTldIdxKey();

	/**
	 *	Allocate a public TldIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByTldIdxKey asPublic(ICFIntProtTopDomainByTldIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected TopDomain instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainByNameIdxKey asPublic(ICFIntProtTopDomainByNameIdxKey src);

	/**
	 *	Allocate a protected TopDomain interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomain newProtRec();

	/**
	 *	Allocate a public TopDomain interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomain asPublic(ICFIntProtTopDomain src);

	/**
	 *	Allocate a protected TopDomain history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopDomainH newProtHRec();

	/**
	 *	Allocate a public TopDomain history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopDomainH asPublic(ICFIntProtTopDomainH src);

}
