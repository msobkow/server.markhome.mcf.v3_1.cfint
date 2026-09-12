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

public interface ICFIntTopProjectTableObj
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
	 *	Instantiate a new TopProject instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntTopProjectObj newInstance();

	/**
	 *	Instantiate a new TopProject edition of the specified TopProject instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntTopProjectEditObj newEditInstance( ICFIntTopProjectObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntTopProjectObj realiseTopProject( ICFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntTopProjectObj createTopProject( ICFIntTopProjectObj Obj );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntTopProjectObj readTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TopProject-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TopProject-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntTopProjectObj readTopProject( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ICFIntTopProjectObj readCachedTopProject( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTopProject( ICFIntTopProjectObj obj );

	void deepDisposeTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntTopProjectObj lockTopProject( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of ICFIntTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntTopProjectObj> readAllTopProject();

	/**
	 *	Return a sorted map of all the TopProject-derived instances in the database.
	 *
	 *	@return	List of ICFIntTopProjectObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntTopProjectObj> readAllTopProject( boolean forceRead );

	List<ICFIntTopProjectObj> readCachedAllTopProject();

	/**
	 *	Get the CFIntTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopProjectObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopProjectObj readTopProjectByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the CFIntTopProjectObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopProjectObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopProjectObj readTopProjectByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopProjectObj> readTopProjectByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntTopProjectObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopProjectObj> readTopProjectByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopProjectObj> readTopProjectByTopDomainIdx( ICFLibKeyHash256 TopDomainId );

	/**
	 *	Get the map of CFIntTopProjectObj instances sorted by their primary keys for the duplicate TopDomainIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntTopProjectObj cached instances sorted by their primary keys for the duplicate TopDomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntTopProjectObj> readTopProjectByTopDomainIdx( ICFLibKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the CFIntTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopProjectObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopProjectObj readTopProjectByNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the CFIntTopProjectObj instance for the unique NameIdx key.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 *
	 *	@return	CFIntTopProjectObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntTopProjectObj readTopProjectByNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	ICFIntTopProjectObj readCachedTopProjectByIdIdx( ICFLibKeyHash256 Id );

	List<ICFIntTopProjectObj> readCachedTopProjectByTenantIdx( ICFLibKeyHash256 TenantId );

	List<ICFIntTopProjectObj> readCachedTopProjectByTopDomainIdx( ICFLibKeyHash256 TopDomainId );

	ICFIntTopProjectObj readCachedTopProjectByNameIdx( ICFLibKeyHash256 TopDomainId,
		String Name );

	void deepDisposeTopProjectByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTopProjectByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeTopProjectByTopDomainIdx( ICFLibKeyHash256 TopDomainId );

	void deepDisposeTopProjectByNameIdx( ICFLibKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntTopProjectObj updateTopProject( ICFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTopProject( ICFIntTopProjectObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByTopDomainIdx( ICFLibKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The TopProject key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TopProject key attribute of the instance generating the id.
	 */
	void deleteTopProjectByNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name );
}
