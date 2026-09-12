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

public interface ICFIntLicenseTableObj
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
	 *	Instantiate a new License instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntLicenseObj newInstance();

	/**
	 *	Instantiate a new License edition of the specified License instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntLicenseEditObj newEditInstance( ICFIntLicenseObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntLicenseObj realiseLicense( ICFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntLicenseObj createLicense( ICFIntLicenseObj Obj );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntLicenseObj readLicense( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntLicenseObj readLicense( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ICFIntLicenseObj readCachedLicense( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeLicense( ICFIntLicenseObj obj );

	void deepDisposeLicense( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntLicenseObj lockLicense( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the License-derived instances in the database.
	 *
	 *	@return	List of ICFIntLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntLicenseObj> readAllLicense();

	/**
	 *	Return a sorted map of all the License-derived instances in the database.
	 *
	 *	@return	List of ICFIntLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntLicenseObj> readAllLicense( boolean forceRead );

	List<ICFIntLicenseObj> readCachedAllLicense();

	/**
	 *	Get the CFIntLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntLicenseObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntLicenseObj readLicenseByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the CFIntLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntLicenseObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntLicenseObj readLicenseByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntLicenseObj> readLicenseByLicnTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntLicenseObj> readLicenseByLicnTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntLicenseObj> readLicenseByDomainIdx( ICFLibKeyHash256 TopDomainId );

	/**
	 *	Get the map of CFIntLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntLicenseObj> readLicenseByDomainIdx( ICFLibKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the CFIntLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntLicenseObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntLicenseObj readLicenseByUNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the CFIntLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntLicenseObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntLicenseObj readLicenseByUNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	ICFIntLicenseObj readCachedLicenseByIdIdx( ICFLibKeyHash256 Id );

	List<ICFIntLicenseObj> readCachedLicenseByLicnTenantIdx( ICFLibKeyHash256 TenantId );

	List<ICFIntLicenseObj> readCachedLicenseByDomainIdx( ICFLibKeyHash256 TopDomainId );

	ICFIntLicenseObj readCachedLicenseByUNameIdx( ICFLibKeyHash256 TopDomainId,
		String Name );

	void deepDisposeLicenseByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeLicenseByLicnTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeLicenseByDomainIdx( ICFLibKeyHash256 TopDomainId );

	void deepDisposeLicenseByUNameIdx( ICFLibKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntLicenseObj updateLicense( ICFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteLicense( ICFIntLicenseObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( ICFLibKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx(ICFLibKeyHash256 TopDomainId,
		String Name );
}
