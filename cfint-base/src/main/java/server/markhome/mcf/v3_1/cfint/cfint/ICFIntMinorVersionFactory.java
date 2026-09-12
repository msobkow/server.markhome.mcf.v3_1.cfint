
// Description: Java JPA Factory interface for MinorVersion.

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
 *	ICFIntMinorVersionFactory interface for MinorVersion
 */
public interface ICFIntMinorVersionFactory extends ICFIntProtMinorVersionFactory
{

	/**
	 *	Allocate a primary history key for MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntMinorVersionHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for MinorVersion instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtMinorVersionHPKey asProtected(ICFIntMinorVersionHPKey src);

	/**
	 *	Allocate a public primary history key for MinorVersion instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMinorVersionHPKey asPublic(ICFIntMinorVersionHPKey src);

	/**
	 *	Allocate a TenantIdx key over MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMinorVersionByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByTenantIdxKey asProtected(ICFIntMinorVersionByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByTenantIdxKey asPublic(ICFIntMinorVersionByTenantIdxKey src);

	/**
	 *	Allocate a MajorVerIdx key over MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMinorVersionByMajorVerIdxKey newByMajorVerIdxKey();

	/**
	 *	Allocate a protected MajorVerIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByMajorVerIdxKey asProtected(ICFIntMinorVersionByMajorVerIdxKey src);

	/**
	 *	Allocate a public MajorVerIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByMajorVerIdxKey asPublic(ICFIntMinorVersionByMajorVerIdxKey src);

	/**
	 *	Allocate a NameIdx key over MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMinorVersionByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionByNameIdxKey asProtected(ICFIntMinorVersionByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionByNameIdxKey asPublic(ICFIntMinorVersionByNameIdxKey src);

	/**
	 *	Allocate a MinorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMinorVersion newRec();

	/**
	 *	Allocate a protected MinorVersion interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersion asProtected(ICFIntMinorVersion src);

	/**
	 *	Allocate a public MinorVersion interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersion asPublic(ICFIntMinorVersion src);

	/**
	 *	Allocate a MinorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMinorVersionH newHRec();

	/**
	 *	Allocate a protected MinorVersion history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMinorVersionH asProtected(ICFIntMinorVersionH src);

	/**
	 *	Allocate a public MinorVersion history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMinorVersionH asPublic(ICFIntMinorVersionH src);

}
