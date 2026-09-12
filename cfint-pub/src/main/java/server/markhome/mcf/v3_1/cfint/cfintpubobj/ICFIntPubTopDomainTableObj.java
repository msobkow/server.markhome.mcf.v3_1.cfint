// Description: Java 25 Public Table Object interface for CFIntPub.

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

package server.markhome.mcf.v3_1.cfint.cfintpubobj;

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
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;

public interface ICFIntPubTopDomainTableObj
{
	public ICFIntPubSchemaObj getSchema();
	public void setSchema( ICFIntPubSchemaObj value );

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
	ICFIntPubTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntPubTopDomainEditObj newEditInstance( ICFIntPubTopDomainObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTopDomainObj realiseTopDomain( ICFIntPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTopDomainObj createTopDomain( ICFIntPubTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubTopDomainObj readTopDomain( ICFLibKeyHash256 pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubTopDomainObj readTopDomain( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFIntPubTopDomainObj readCachedTopDomain( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeTopDomain( ICFIntPubTopDomainObj obj );

	void deepDisposeTopDomain( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTopDomainObj lockTopDomain( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubTopDomainObj> readAllTopDomain( boolean forceRead );

	List<ICFIntPubTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the CFIntPubTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTopDomainObj readTopDomainByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFIntPubTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTopDomainObj readTopDomainByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTopDomainObj> readTopDomainByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntPubTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTopDomainObj> readTopDomainByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTopDomainObj> readTopDomainByTldIdx( CFLibDbKeyHash256 TldId );

	/**
	 *	Get the map of CFIntPubTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTopDomainObj> readTopDomainByTldIdx( CFLibDbKeyHash256 TldId,
		boolean forceRead );

	/**
	 *	Get the CFIntPubTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTopDomainObj readTopDomainByNameIdx(CFLibDbKeyHash256 TldId,
		String Name );

	/**
	 *	Get the CFIntPubTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTopDomainObj readTopDomainByNameIdx(CFLibDbKeyHash256 TldId,
		String Name,
		boolean forceRead );

	ICFIntPubTopDomainObj readCachedTopDomainByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFIntPubTopDomainObj> readCachedTopDomainByTenantIdx( CFLibDbKeyHash256 TenantId );

	List<ICFIntPubTopDomainObj> readCachedTopDomainByTldIdx( CFLibDbKeyHash256 TldId );

	ICFIntPubTopDomainObj readCachedTopDomainByNameIdx( CFLibDbKeyHash256 TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeTopDomainByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeTopDomainByTldIdx( CFLibDbKeyHash256 TldId );

	void deepDisposeTopDomainByNameIdx( CFLibDbKeyHash256 TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTopDomainObj updateTopDomain( ICFIntPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( ICFIntPubTopDomainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByTldIdx( CFLibDbKeyHash256 TldId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 */
	void deleteTopDomainByNameIdx(CFLibDbKeyHash256 TldId,
		String Name );
}
