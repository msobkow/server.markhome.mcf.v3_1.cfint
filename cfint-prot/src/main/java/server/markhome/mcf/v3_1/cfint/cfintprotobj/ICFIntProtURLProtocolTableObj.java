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

public interface ICFIntProtURLProtocolTableObj
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
	 *	Instantiate a new URLProtocol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntProtURLProtocolObj newInstance();

	/**
	 *	Instantiate a new URLProtocol edition of the specified URLProtocol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntProtURLProtocolEditObj newEditInstance( ICFIntProtURLProtocolObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntProtURLProtocolObj realiseURLProtocol( ICFIntProtURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntProtURLProtocolObj createURLProtocol( ICFIntProtURLProtocolObj Obj );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocol( Integer pkey );

	/**
	 *	Read a URLProtocol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The URLProtocol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocol( Integer pkey,
		boolean forceRead );

	ICFIntProtURLProtocolObj readCachedURLProtocol( Integer pkey );

	public void reallyDeepDisposeURLProtocol( ICFIntProtURLProtocolObj obj );

	void deepDisposeURLProtocol( Integer pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntProtURLProtocolObj lockURLProtocol( Integer pkey );

	/**
	 *	Return a sorted list of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtURLProtocolObj> readAllURLProtocol();

	/**
	 *	Return a sorted map of all the URLProtocol-derived instances in the database.
	 *
	 *	@return	List of ICFIntProtURLProtocolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntProtURLProtocolObj> readAllURLProtocol( boolean forceRead );

	List<ICFIntProtURLProtocolObj> readCachedAllURLProtocol();

	/**
	 *	Get the ICFIntProtURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtURLProtocolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Get the ICFIntProtURLProtocolObj instance for the primary key attributes.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtURLProtocolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocolByIdIdx( int URLProtocolId,
		boolean forceRead );

	/**
	 *	Get the ICFIntProtURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtURLProtocolObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocolByUNameIdx(String Name );

	/**
	 *	Get the ICFIntProtURLProtocolObj instance for the unique UNameIdx key.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	ICFIntProtURLProtocolObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntProtURLProtocolObj readURLProtocolByUNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFIntProtURLProtocolObj> instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtURLProtocolObj> cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Get the map of List<ICFIntProtURLProtocolObj> instances sorted by their primary keys for the duplicate IsSecureIdx key.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFIntProtURLProtocolObj> cached instances sorted by their primary keys for the duplicate IsSecureIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntProtURLProtocolObj> readURLProtocolByIsSecureIdx( boolean IsSecure,
		boolean forceRead );

	ICFIntProtURLProtocolObj readCachedURLProtocolByIdIdx( int URLProtocolId );

	ICFIntProtURLProtocolObj readCachedURLProtocolByUNameIdx( String Name );

	List<List<ICFIntProtURLProtocolObj>> readCachedURLProtocolByIsSecureIdx( boolean IsSecure );

	void deepDisposeURLProtocolByIdIdx( int URLProtocolId );

	void deepDisposeURLProtocolByUNameIdx( String Name );

	void deepDisposeURLProtocolByIsSecureIdx( boolean IsSecure );

	/**
	 *	Internal use only.
	 */
	ICFIntProtURLProtocolObj updateURLProtocol( ICFIntProtURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteURLProtocol( ICFIntProtURLProtocolObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	URLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIdIdx( int URLProtocolId );

	/**
	 *	Internal use only.
	 *
	 *	@param	Name	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByUNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	IsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIsSecureIdx( boolean IsSecure );
}
