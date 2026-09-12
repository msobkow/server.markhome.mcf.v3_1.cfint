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

public interface ICFIntPubMajorVersionTableObj
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
	 *	Instantiate a new MajorVersion instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntPubMajorVersionObj newInstance();

	/**
	 *	Instantiate a new MajorVersion edition of the specified MajorVersion instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntPubMajorVersionEditObj newEditInstance( ICFIntPubMajorVersionObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntPubMajorVersionObj realiseMajorVersion( ICFIntPubMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntPubMajorVersionObj createMajorVersion( ICFIntPubMajorVersionObj Obj );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersion( ICFLibKeyHash256 pkey );

	/**
	 *	Read a MajorVersion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The MajorVersion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersion( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFIntPubMajorVersionObj readCachedMajorVersion( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeMajorVersion( ICFIntPubMajorVersionObj obj );

	void deepDisposeMajorVersion( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntPubMajorVersionObj lockMajorVersion( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readAllMajorVersion();

	/**
	 *	Return a sorted map of all the MajorVersion-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubMajorVersionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readAllMajorVersion( boolean forceRead );

	List<ICFIntPubMajorVersionObj> readCachedAllMajorVersion();

	/**
	 *	Get the CFIntPubMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubMajorVersionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersionByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFIntPubMajorVersionObj instance for the primary key attributes.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubMajorVersionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersionByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readMajorVersionByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntPubMajorVersionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubMajorVersionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readMajorVersionByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readMajorVersionBySubProjectIdx( CFLibDbKeyHash256 SubProjectId );

	/**
	 *	Get the map of CFIntPubMajorVersionObj instances sorted by their primary keys for the duplicate SubProjectIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubMajorVersionObj cached instances sorted by their primary keys for the duplicate SubProjectIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubMajorVersionObj> readMajorVersionBySubProjectIdx( CFLibDbKeyHash256 SubProjectId,
		boolean forceRead );

	/**
	 *	Get the CFIntPubMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubMajorVersionObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersionByNameIdx(CFLibDbKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Get the CFIntPubMajorVersionObj instance for the unique NameIdx key.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubMajorVersionObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubMajorVersionObj readMajorVersionByNameIdx(CFLibDbKeyHash256 SubProjectId,
		String Name,
		boolean forceRead );

	ICFIntPubMajorVersionObj readCachedMajorVersionByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFIntPubMajorVersionObj> readCachedMajorVersionByTenantIdx( CFLibDbKeyHash256 TenantId );

	List<ICFIntPubMajorVersionObj> readCachedMajorVersionBySubProjectIdx( CFLibDbKeyHash256 SubProjectId );

	ICFIntPubMajorVersionObj readCachedMajorVersionByNameIdx( CFLibDbKeyHash256 SubProjectId,
		String Name );

	void deepDisposeMajorVersionByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeMajorVersionByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeMajorVersionBySubProjectIdx( CFLibDbKeyHash256 SubProjectId );

	void deepDisposeMajorVersionByNameIdx( CFLibDbKeyHash256 SubProjectId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntPubMajorVersionObj updateMajorVersion( ICFIntPubMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteMajorVersion( ICFIntPubMajorVersionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionBySubProjectIdx( CFLibDbKeyHash256 SubProjectId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SubProjectId	The MajorVersion key attribute of the instance generating the id.
	 *
	 *	@param	Name	The MajorVersion key attribute of the instance generating the id.
	 */
	void deleteMajorVersionByNameIdx(CFLibDbKeyHash256 SubProjectId,
		String Name );
}
