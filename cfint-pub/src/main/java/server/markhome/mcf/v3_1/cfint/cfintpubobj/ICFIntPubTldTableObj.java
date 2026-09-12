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

public interface ICFIntPubTldTableObj
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
	 *	Instantiate a new Tld instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntPubTldObj newInstance();

	/**
	 *	Instantiate a new Tld edition of the specified Tld instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntPubTldEditObj newEditInstance( ICFIntPubTldObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTldObj realiseTld( ICFIntPubTldObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTldObj createTld( ICFIntPubTldObj Obj );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubTldObj readTld( ICFLibKeyHash256 pkey );

	/**
	 *	Read a Tld-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tld-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubTldObj readTld( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFIntPubTldObj readCachedTld( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeTld( ICFIntPubTldObj obj );

	void deepDisposeTld( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTldObj lockTld( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Tld-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubTldObj> readAllTld();

	/**
	 *	Return a sorted map of all the Tld-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubTldObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubTldObj> readAllTld( boolean forceRead );

	List<ICFIntPubTldObj> readCachedAllTld();

	/**
	 *	Get the CFIntPubTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTldObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTldObj readTldByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFIntPubTldObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTldObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTldObj readTldByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTldObj> readTldByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntPubTldObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubTldObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubTldObj> readTldByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the CFIntPubTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTldObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTldObj readTldByNameIdx(String Name );

	/**
	 *	Get the CFIntPubTldObj instance for the unique NameIdx key.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubTldObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubTldObj readTldByNameIdx(String Name,
		boolean forceRead );

	ICFIntPubTldObj readCachedTldByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFIntPubTldObj> readCachedTldByTenantIdx( CFLibDbKeyHash256 TenantId );

	ICFIntPubTldObj readCachedTldByNameIdx( String Name );

	void deepDisposeTldByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeTldByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeTldByNameIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntPubTldObj updateTld( ICFIntPubTldObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTld( ICFIntPubTldObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The Tld key attribute of the instance generating the id.
	 */
	void deleteTldByNameIdx(String Name );
}
