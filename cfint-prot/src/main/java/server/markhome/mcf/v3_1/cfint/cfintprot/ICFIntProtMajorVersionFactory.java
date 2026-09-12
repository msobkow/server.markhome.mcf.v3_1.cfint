
// Description: Java Protected Factory interface for MajorVersion.

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
 *	ICFIntProtMajorVersionFactory protected interface for MajorVersion
 */
public interface ICFIntProtMajorVersionFactory extends ICFIntPubMajorVersionFactory
{

	/**
	 *	Allocate a protected primary history key for MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtMajorVersionHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for MajorVersion instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMajorVersionHPKey asPublic(ICFIntProtMajorVersionHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionByTenantIdxKey asPublic(ICFIntProtMajorVersionByTenantIdxKey src);

	/**
	 *	Allocate a protected SubProjectIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionBySubProjectIdxKey newProtBySubProjectIdxKey();

	/**
	 *	Allocate a public SubProjectIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionBySubProjectIdxKey asPublic(ICFIntProtMajorVersionBySubProjectIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionByNameIdxKey asPublic(ICFIntProtMajorVersionByNameIdxKey src);

	/**
	 *	Allocate a protected MajorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersion newProtRec();

	/**
	 *	Allocate a public MajorVersion interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersion asPublic(ICFIntProtMajorVersion src);

	/**
	 *	Allocate a protected MajorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionH newProtHRec();

	/**
	 *	Allocate a public MajorVersion history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionH asPublic(ICFIntProtMajorVersionH src);

}
