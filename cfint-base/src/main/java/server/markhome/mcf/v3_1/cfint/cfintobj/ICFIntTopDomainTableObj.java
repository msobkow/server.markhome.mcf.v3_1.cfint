// Description: Java 25 Table Object interface for CFInt.

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

package server.markhome.mcf.v3_1.cfint.cfintobj;

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
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;

public interface ICFIntTopDomainTableObj
{
	public ICFIntSchemaObj getSchema();
	public void setSchema( ICFIntSchemaObj value );

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
	ICFIntTopDomainObj newInstance();

	/**
	 *	Instantiate a new TopDomain edition of the specified TopDomain instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntTopDomainEditObj newEditInstance( ICFIntTopDomainObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntTopDomainObj realiseTopDomain( ICFIntTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntTopDomainObj createTopDomain( ICFIntTopDomainObj Obj );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntTopDomainObj readTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TopDomain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopDomain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntTopDomainObj readTopDomain( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ICFIntTopDomainObj readCachedTopDomain( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTopDomain( ICFIntTopDomainObj obj );

	void deepDisposeTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntTopDomainObj lockTopDomain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntTopDomainObj> readAllTopDomain();

	/**
	 *	Return a sorted map of all the TopDomain-derived instances in the database.
	 *
	 *	@return	List of ICFIntTopDomainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntTopDomainObj> readAllTopDomain( boolean forceRead );

	List<ICFIntTopDomainObj> readCachedAllTopDomain();

	/**
	 *	Get the CFIntTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopDomainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopDomainObj readTopDomainByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the CFIntTopDomainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopDomainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopDomainObj readTopDomainByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopDomainObj> readTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntTopDomainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopDomainObj> readTopDomainByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopDomainObj> readTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	/**
	 *	Get the map of CFIntTopDomainObj instances sorted by their primary keys for the duplicate TldIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopDomainObj cached instances sorted by their primary keys for the duplicate TldIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopDomainObj> readTopDomainByTldIdx( ICFLibKeyHash256 TldId,
		boolean forceRead );

	/**
	 *	Get the CFIntTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopDomainObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopDomainObj readTopDomainByNameIdx(ICFLibKeyHash256 TldId,
		String Name );

	/**
	 *	Get the CFIntTopDomainObj instance for the unique NameIdx key.
	 *
	 *	@param	TldId	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopDomain key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopDomainObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopDomainObj readTopDomainByNameIdx(ICFLibKeyHash256 TldId,
		String Name,
		boolean forceRead );

	ICFIntTopDomainObj readCachedTopDomainByIdIdx( ICFLibKeyHash256 Id );

	List<ICFIntTopDomainObj> readCachedTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	List<ICFIntTopDomainObj> readCachedTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	ICFIntTopDomainObj readCachedTopDomainByNameIdx( ICFLibKeyHash256 TldId,
		String Name );

	void deepDisposeTopDomainByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTopDomainByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeTopDomainByTldIdx( ICFLibKeyHash256 TldId );

	void deepDisposeTopDomainByNameIdx( ICFLibKeyHash256 TldId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntTopDomainObj updateTopDomain( ICFIntTopDomainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopDomain( ICFIntTopDomainObj Obj );

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
