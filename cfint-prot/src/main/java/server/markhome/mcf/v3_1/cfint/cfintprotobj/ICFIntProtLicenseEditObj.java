// Description: Java 25 Protected Instance Edit Object interface for CFInt License.

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

public interface ICFIntProtLicenseEditObj
	extends ICFIntProtLicenseObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFIntProtLicenseObj.
	 */
	ICFIntProtLicenseObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFIntProtLicenseObj.
	 */
	ICFIntProtLicenseObj getOrigAsLicense();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFIntProtLicenseObj create();

	/*
	 *	Update the instance.
	 */
	ICFIntProtLicenseEditObj update();

	/*
	 *	Delete the instance.
	 */
	ICFIntProtLicenseEditObj deleteInstance();

	/**
	 *	Get the ICFSecPubTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFSecPubTenantObj instance referenced by the Tenant key.
	 */
	ICFSecPubTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecPubTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecPubTenantObj instance referenced by the Tenant key.
	 */
	ICFSecPubTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Set the ICFSecPubTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFSecPubTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFSecPubTenantObj value );

	/**
	 *	Get the ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 */
	ICFIntProtTopDomainObj getRequiredContainerTopDomain();

	/**
	 *	Get the required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@return	The required ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 */
	ICFIntProtTopDomainObj getRequiredContainerTopDomain( boolean forceRead );

	/**
	 *	Set the ICFIntProtTopDomainObj instance referenced by the TopDomain key.
	 *
	 *	@param	value	the ICFIntProtTopDomainObj instance to be referenced by the TopDomain key.
	 */
	void setRequiredContainerTopDomain( ICFIntProtTopDomainObj value );

	/**
	 *	Get the required ICFLibKeyHash256 attribute Id.
	 *
	 *	@return	The required ICFLibKeyHash256 attribute Id.
	 */
	ICFLibKeyHash256 getRequiredId();

	/**
	 *	Set the required ICFLibKeyHash256 attribute Id.
	 *
	 *	@param value The required ICFLibKeyHash256 attribute Id value to be applied.
	 */
	void setRequiredId(ICFLibKeyHash256 value);

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
	 *	Set the required String attribute Name.
	 *
	 *	@param value The required String attribute Name value to be applied.
	 */
	void setRequiredName(String value);

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Set the optional String attribute Description.
	 *
	 *	@param value The optional String attribute Description value to be applied.
	 */
	void setOptionalDescription(String value);

	/**
	 *	Get the optional String attribute EmbeddedText.
	 *
	 *	@return	The optional String attribute EmbeddedText.
	 */
	String getOptionalEmbeddedText();

	/**
	 *	Set the optional String attribute EmbeddedText.
	 *
	 *	@param value The optional String attribute EmbeddedText value to be applied.
	 */
	void setOptionalEmbeddedText(String value);

	/**
	 *	Get the optional String attribute FullText.
	 *
	 *	@return	The optional String attribute FullText.
	 */
	String getOptionalFullText();

	/**
	 *	Set the optional String attribute FullText.
	 *
	 *	@param value The optional String attribute FullText value to be applied.
	 */
	void setOptionalFullText(String value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}
