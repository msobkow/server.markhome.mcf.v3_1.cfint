// Description: Java 25 Object interface for CFIntProt License.

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

public interface ICFIntProtLicenseObj
	extends ICFLibAnyObj
{
	/**
	 *	Initially, the class code for an object is ICFIntProtLicense.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Realise this instance of a License.
	 *
	 *	@return	CFIntProtLicenseObj instance which should be subsequently referenced.
	 */
	ICFIntProtLicenseObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntProtLicenseObj the reference to the cached or read (realised) instance.
	 */
	ICFIntProtLicenseObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntProtLicenseObj the reference to the cached or read (realised) instance.
	 */
	ICFIntProtLicenseObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this License instance.
	 *
	 *	@return	The newly locked ICFIntProtLicenseEditObj edition of this instance.
	 */
	ICFIntProtLicenseEditObj beginEdit();

	/**
	 *	End this edition of this License instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this License instance.
	 *
	 *	@return	The ICFIntProtLicenseEditObj edition of this instance.
	 */
	ICFIntProtLicenseEditObj getEdit();

	/**
	 *	Get the current edition of this License instance as a ICFIntProtLicenseEditObj.
	 *
	 *	@return	The ICFIntProtLicenseEditObj edition of this instance.
	 */
	ICFIntProtLicenseEditObj getEditAsLicense();

	/**
	 *	Get the ICFIntProtLicenseTableObj table cache which manages this instance.
	 *
	 *	@return	ICFIntProtLicenseTableObj table cache which manages this instance.
	 */
	ICFIntProtLicenseTableObj getLicenseTable();

	/**
	 *	Get the ICFIntProtSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFIntProtSchemaObj schema cache which manages this instance.
	 */
	ICFIntProtSchemaObj getSchema();

	/**
	 *	Set the ICFIntProtSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	ICFIntProtSchemaObj schema cache which manages this instance.
	 */
	void setSchema(ICFIntProtSchemaObj schema);

	/**
	 *	Get the ICFIntProtLicense instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFIntProtLicense instance which currently backs this object.
	 */
	ICFIntProtLicense getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ICFIntProtLicense value );

	/**
	 *	Get the ICFIntProtLicense instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFIntProtLicense instance which currently backs this object.
	 */
	ICFIntProtLicense getLicenseRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFLibDbKeyHash256 primary key for this instance.
	 */
	CFLibDbKeyHash256 getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFLibDbKeyHash256 primary key value for this instance.
	 */
	void setPKey( CFLibDbKeyHash256 value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required ICFIntProtTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFIntProtTenantObj instance referenced by the Tenant key.
	 */
	ICFSecPubTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecProtTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecProtTenantObj instance referenced by the Tenant key.
	 */
	ICFSecPubTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 */
	ICFIntProtTopDomainObj getRequiredContainerTopDomain();

	/**
	 *	Get the required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 */
	ICFIntProtTopDomainObj getRequiredContainerTopDomain( boolean forceRead );

	/**
	 *	Get the required ICFLibKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute Id.
	 */
	ICFLibKeyHash256 getRequiredId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute TenantId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute TenantId.
	 */
	ICFLibKeyHash256 getRequiredTenantId();

	/**
	 *	Get the required ICFLibKeyHash256 attribute TopDomainId.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute TopDomainId.
	 */
	ICFLibKeyHash256 getRequiredTopDomainId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the optional String attribute EmbeddedText.
	 *
	 *	@return	The optional String attribute EmbeddedText.
	 */
	String getOptionalEmbeddedText();

	/**
	 *	Get the optional String attribute FullText.
	 *
	 *	@return	The optional String attribute FullText.
	 */
	String getOptionalFullText();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
