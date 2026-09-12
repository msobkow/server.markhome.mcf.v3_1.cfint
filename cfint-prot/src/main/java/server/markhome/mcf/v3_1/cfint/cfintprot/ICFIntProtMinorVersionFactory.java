
// Description: Java Protected Factory interface for MinorVersion.

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
 *	ICFIntProtMinorVersionFactory protected interface for MinorVersion
 */
public interface ICFIntProtMinorVersionFactory extends ICFIntPubMinorVersionFactory
{

	/**
	 *	Allocate a protected primary history key for MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtMinorVersionHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for MinorVersion instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMinorVersionHPKey asPublic(ICFIntProtMinorVersionHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByTenantIdxKey asPublic(ICFIntProtMinorVersionByTenantIdxKey src);

	/**
	 *	Allocate a protected MajorVerIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByMajorVerIdxKey newProtByMajorVerIdxKey();

	/**
	 *	Allocate a public MajorVerIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByMajorVerIdxKey asPublic(ICFIntProtMinorVersionByMajorVerIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByNameIdxKey asPublic(ICFIntProtMinorVersionByNameIdxKey src);

	/**
	 *	Allocate a protected MinorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersion newProtRec();

	/**
	 *	Allocate a public MinorVersion interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersion asPublic(ICFIntProtMinorVersion src);

	/**
	 *	Allocate a protected MinorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionH newProtHRec();

	/**
	 *	Allocate a public MinorVersion history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionH asPublic(ICFIntProtMinorVersionH src);

}
