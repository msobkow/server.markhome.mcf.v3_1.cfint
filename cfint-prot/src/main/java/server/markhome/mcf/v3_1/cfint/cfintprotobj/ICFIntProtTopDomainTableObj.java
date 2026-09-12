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

public interface ICFIntProtTopDomainTableObj
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
	 *	Instantiate a new TopDomain instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntProtTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntProtTopDomainEditObj newEditInstance( ICFIntProtTopDomainObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntProtTopDomainObj realiseTopDomain( ICFIntProtTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntProtTopDomainObj createTopDomain( ICFIntProtTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtTopDomainObj readTopDomain( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtTopDomainObj readTopDomain( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFIntProtTopDomainObj readCachedTopDomain( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeTopDomain( ICFIntProtTopDomainObj obj );

	void deepDisposeTopDomain( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntProtTopDomainObj lockTopDomain( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtTopDomainObj> readAllTopDomain( boolean forceRead );

	List<ICFIntProtTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the ICFIntProtTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtTopDomainObj readTopDomainByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFIntProtTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtTopDomainObj readTopDomainByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFIntProtTopDomainObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtTopDomainObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtTopDomainObj> readTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of List<ICFIntProtTopDomainObj> instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtTopDomainObj> cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtTopDomainObj> readTopDomainByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFIntProtTopDomainObj> instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtTopDomainObj> cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtTopDomainObj> readTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	/**
	 *	Get the map of List<ICFIntProtTopDomainObj> instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtTopDomainObj> cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtTopDomainObj> readTopDomainByTldIdx( ICFLibKeyHash256 TldId,
		boolean forceRead );

	/**
	 *	Get the ICFIntProtTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtTopDomainObj readTopDomainByNameIdx(ICFLibKeyHash256 TldId,
		String Name );

	/**
	 *	Get the ICFIntProtTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtTopDomainObj readTopDomainByNameIdx(ICFLibKeyHash256 TldId,
		String Name,
		boolean forceRead );

	ICFIntProtTopDomainObj readCachedTopDomainByIdIdx( ICFLibKeyHash256 Id );

	List<List<ICFIntProtTopDomainObj>> readCachedTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	List<List<ICFIntProtTopDomainObj>> readCachedTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	ICFIntProtTopDomainObj readCachedTopDomainByNameIdx( ICFLibKeyHash256 TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	void deepDisposeTopDomainByNameIdx( ICFLibKeyHash256 TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntProtTopDomainObj updateTopDomain( ICFIntProtTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( ICFIntProtTopDomainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx(ICFLibKeyHash256 TldId,
		String Name );
}
