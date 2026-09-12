
// Description: Java JPA Factory interface for MajorVersion.

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
 *	ICFIntMajorVersionFactory interface for MajorVersion
 */
public interface ICFIntMajorVersionFactory extends ICFIntProtMajorVersionFactory
{

	/**
	 *	Allocate a primary history key for MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntMajorVersionHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for MajorVersion instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtMajorVersionHPKey asProtected(ICFIntMajorVersionHPKey src);

	/**
	 *	Allocate a public primary history key for MajorVersion instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMajorVersionHPKey asPublic(ICFIntMajorVersionHPKey src);

	/**
	 *	Allocate a TenantIdx key over MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMajorVersionByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionByTenantIdxKey asProtected(ICFIntMajorVersionByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionByTenantIdxKey asPublic(ICFIntMajorVersionByTenantIdxKey src);

	/**
	 *	Allocate a SubProjectIdx key over MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMajorVersionBySubProjectIdxKey newBySubProjectIdxKey();

	/**
	 *	Allocate a protected SubProjectIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionBySubProjectIdxKey asProtected(ICFIntMajorVersionBySubProjectIdxKey src);

	/**
	 *	Allocate a public SubProjectIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionBySubProjectIdxKey asPublic(ICFIntMajorVersionBySubProjectIdxKey src);

	/**
	 *	Allocate a NameIdx key over MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMajorVersionByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionByNameIdxKey asProtected(ICFIntMajorVersionByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionByNameIdxKey asPublic(ICFIntMajorVersionByNameIdxKey src);

	/**
	 *	Allocate a MajorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMajorVersion newRec();

	/**
	 *	Allocate a protected MajorVersion interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersion asProtected(ICFIntMajorVersion src);

	/**
	 *	Allocate a public MajorVersion interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersion asPublic(ICFIntMajorVersion src);

	/**
	 *	Allocate a MajorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMajorVersionH newHRec();

	/**
	 *	Allocate a protected MajorVersion history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMajorVersionH asProtected(ICFIntMajorVersionH src);

	/**
	 *	Allocate a public MajorVersion history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMajorVersionH asPublic(ICFIntMajorVersionH src);

}
