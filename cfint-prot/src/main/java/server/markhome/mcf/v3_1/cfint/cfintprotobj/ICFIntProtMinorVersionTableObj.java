// Description: Java 25 Protected Table Object interface for CFIntProt.

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

package server.markhome.mcf.v3_1.cfint.cfintprotobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfint.cfintprot.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;

public interface ICFIntProtMinorVersionTableObj
{
	public ICFIntProtSchemaObj getSchema();
	public void setSchema( ICFIntProtSchemaObj value );

	public void minimizeMemory();

	public String getTableName();
	public String getTableDbName();

	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	public int getClassCode();

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	// public static int getBackingClassCode();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new MinorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntProtMinorVersionObj newInstance();

	/**
	 *	Instantiate a new MinorVersion edition of the specified MinorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntProtMinorVersionEditObj newEditInstance( ICFIntProtMinorVersionObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntProtMinorVersionObj realiseMinorVersion( ICFIntProtMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntProtMinorVersionObj createMinorVersion( ICFIntProtMinorVersionObj Obj );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersion( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a MinorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MinorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersion( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFIntProtMinorVersionObj readCachedMinorVersion( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeMinorVersion( ICFIntProtMinorVersionObj obj );

	void deepDisposeMinorVersion( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntProtMinorVersionObj lockMinorVersion( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readAllMinorVersion();

	/**
	 *	Return a sorted map of all the MinorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtMinorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readAllMinorVersion( boolean forceRead );

	List<ICFIntProtMinorVersionObj> readCachedAllMinorVersion();

	/**
	 *	Get the ICFIntProtMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtMinorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersionByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFIntProtMinorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtMinorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersionByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFIntProtMinorVersionObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtMinorVersionObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readMinorVersionByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of List<ICFIntProtMinorVersionObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtMinorVersionObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readMinorVersionByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFIntProtMinorVersionObj> instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtMinorVersionObj> cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readMinorVersionByMajorVerIdx( ICFLibKeyHash256 MajorVersionId );

	/**
	 *	Get the map of List<ICFIntProtMinorVersionObj> instances sorted by their primary keys for the duplicate MajorVerIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtMinorVersionObj> cached instances sorted by their primary keys for the duplicate MajorVerIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtMinorVersionObj> readMinorVersionByMajorVerIdx( ICFLibKeyHash256 MajorVersionId,
		boolean forceRead );

	/**
	 *	Get the ICFIntProtMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtMinorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersionByNameIdx(ICFLibKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Get the ICFIntProtMinorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtMinorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtMinorVersionObj readMinorVersionByNameIdx(ICFLibKeyHash256 MajorVersionId,
		String Name,
		boolean forceRead );

	ICFIntProtMinorVersionObj readCachedMinorVersionByIdIdx( ICFLibKeyHash256 Id );

	List<List<ICFIntProtMinorVersionObj>> readCachedMinorVersionByTenantIdx( ICFLibKeyHash256 TenantId );

	List<List<ICFIntProtMinorVersionObj>> readCachedMinorVersionByMajorVerIdx( ICFLibKeyHash256 MajorVersionId );

	ICFIntProtMinorVersionObj readCachedMinorVersionByNameIdx( ICFLibKeyHash256 MajorVersionId,
		String Name );

	void deepDisposeMinorVersionByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeMinorVersionByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeMinorVersionByMajorVerIdx( ICFLibKeyHash256 MajorVersionId );

	void deepDisposeMinorVersionByNameIdx( ICFLibKeyHash256 MajorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntProtMinorVersionObj updateMinorVersion( ICFIntProtMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMinorVersion( ICFIntProtMinorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( ICFLibKeyHash256 MajorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx(ICFLibKeyHash256 MajorVersionId,
		String Name );
}
