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

public interface ICFIntPubLicenseTableObj
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
	 *	Instantiate a new License instance.
	 *
	 *	@return	A new instance.
	 */
	ICFIntPubLicenseObj newInstance();

	/**
	 *	Instantiate a new License edition of the specified License instance.
	 *
	 *	@return	A new edition.
	 */
	ICFIntPubLicenseEditObj newEditInstance( ICFIntPubLicenseObj orig );

	/**
	 *	Internal use only.
	 */
	ICFIntPubLicenseObj realiseLicense( ICFIntPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFIntPubLicenseObj createLicense( ICFIntPubLicenseObj Obj );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubLicenseObj readLicense( ICFLibKeyHash256 pkey );

	/**
	 *	Read a License-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The License-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFIntPubLicenseObj readLicense( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFIntPubLicenseObj readCachedLicense( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeLicense( ICFIntPubLicenseObj obj );

	void deepDisposeLicense( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFIntPubLicenseObj lockLicense( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the License-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubLicenseObj> readAllLicense();

	/**
	 *	Return a sorted map of all the License-derived instances in the database.
	 *
	 *	@return	List of ICFIntPubLicenseObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFIntPubLicenseObj> readAllLicense( boolean forceRead );

	List<ICFIntPubLicenseObj> readCachedAllLicense();

	/**
	 *	Get the CFIntPubLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubLicenseObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubLicenseObj readLicenseByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFIntPubLicenseObj instance for the primary key attributes.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubLicenseObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubLicenseObj readLicenseByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubLicenseObj> readLicenseByLicnTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFIntPubLicenseObj instances sorted by their primary keys for the duplicate LicnTenantIdx key.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubLicenseObj cached instances sorted by their primary keys for the duplicate LicnTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubLicenseObj> readLicenseByLicnTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFIntPubLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubLicenseObj> readLicenseByDomainIdx( CFLibDbKeyHash256 TopDomainId );

	/**
	 *	Get the map of CFIntPubLicenseObj instances sorted by their primary keys for the duplicate DomainIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return	List of CFIntPubLicenseObj cached instances sorted by their primary keys for the duplicate DomainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFIntPubLicenseObj> readLicenseByDomainIdx( CFLibDbKeyHash256 TopDomainId,
		boolean forceRead );

	/**
	 *	Get the CFIntPubLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubLicenseObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubLicenseObj readLicenseByUNameIdx(CFLibDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Get the CFIntPubLicenseObj instance for the unique UNameIdx key.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 *
	 *	@return	CFIntPubLicenseObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFIntPubLicenseObj readLicenseByUNameIdx(CFLibDbKeyHash256 TopDomainId,
		String Name,
		boolean forceRead );

	ICFIntPubLicenseObj readCachedLicenseByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFIntPubLicenseObj> readCachedLicenseByLicnTenantIdx( CFLibDbKeyHash256 TenantId );

	List<ICFIntPubLicenseObj> readCachedLicenseByDomainIdx( CFLibDbKeyHash256 TopDomainId );

	ICFIntPubLicenseObj readCachedLicenseByUNameIdx( CFLibDbKeyHash256 TopDomainId,
		String Name );

	void deepDisposeLicenseByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeLicenseByLicnTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeLicenseByDomainIdx( CFLibDbKeyHash256 TopDomainId );

	void deepDisposeLicenseByUNameIdx( CFLibDbKeyHash256 TopDomainId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFIntPubLicenseObj updateLicense( ICFIntPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteLicense( ICFIntPubLicenseObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( CFLibDbKeyHash256 TopDomainId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	Name	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx(CFLibDbKeyHash256 TopDomainId,
		String Name );
}
