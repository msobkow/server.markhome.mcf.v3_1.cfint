// Description: Java 25 Object interface for CFInt TopProject.

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

public interface ICFIntTopProjectObj
	extends ICFLibAnyObj
{
	/**
	 *	Initially, the class code for an object is ICFIntTopProject.CLASS_CODE, but the Obj layer relies on class code translation to map those
	 *	backing store entities to a runtime set of front-facing classcodes that the clients download and use when talking to the server implementing this code base.
	 *
	 *	@return The runtime class code used by this object. Only after the system is fully booted are these values stable and reliable.
	 */
	int getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the LocalDateTime this instance was created.
	 *
	 *	@return	The LocalDateTime value for the creation time of the instance.
	 */
	LocalDateTime getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the LocalDateTime date-time this instance was updated.
	 *
	 *	@return	The LocalDateTime value for the create time of the instance.
	 */
	LocalDateTime getUpdatedAt();
	/**
	 *	Realise this instance of a TopProject.
	 *
	 *	@return	CFIntTopProjectObj instance which should be subsequently referenced.
	 */
	ICFIntTopProjectObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntTopProjectObj the reference to the cached or read (realised) instance.
	 */
	ICFIntTopProjectObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntTopProjectObj the reference to the cached or read (realised) instance.
	 */
	ICFIntTopProjectObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TopProject instance.
	 *
	 *	@return	The newly locked ICFIntTopProjectEditObj edition of this instance.
	 */
	ICFIntTopProjectEditObj beginEdit();

	/**
	 *	End this edition of this TopProject instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TopProject instance.
	 *
	 *	@return	The ICFIntTopProjectEditObj edition of this instance.
	 */
	ICFIntTopProjectEditObj getEdit();

	/**
	 *	Get the current edition of this TopProject instance as a ICFIntTopProjectEditObj.
	 *
	 *	@return	The ICFIntTopProjectEditObj edition of this instance.
	 */
	ICFIntTopProjectEditObj getEditAsTopProject();

	/**
	 *	Get the ICFIntTopProjectTableObj table cache which manages this instance.
	 *
	 *	@return	ICFIntTopProjectTableObj table cache which manages this instance.
	 */
	ICFIntTopProjectTableObj getTopProjectTable();

	/**
	 *	Get the ICFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFIntSchemaObj schema cache which manages this instance.
	 */
	ICFIntSchemaObj getSchema();

	/**
	 *	Set the ICFIntSchemaObj schema cache which manages this instance.
	 *	Should only be used to install overloads of the buff implementation wired specifically to a transport implementation
	 *	that eventually hits a server running a JPA backend.
	 *
	 *	@param schema	ICFIntSchemaObj schema cache which manages this instance.
	 */
	void setSchema(ICFIntSchemaObj schema);

	/**
	 *	Get the ICFIntTopProject instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFIntTopProject instance which currently backs this object.
	 */
	ICFIntTopProject getRec();

	/**
	 *	Internal use only.
	 */
	void setRec( ICFIntTopProject value );

	/**
	 *	Get the ICFIntTopProject instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	ICFIntTopProject instance which currently backs this object.
	 */
	ICFIntTopProject getTopProjectRec();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	$implCommaIJavaOptAtomType$ primary key for this instance.
	 */
	$implCommaIJavaOptAtomType$ getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param $implCommaIJavaOptAtomType$ primary key value for this instance.
	 */
	void setPKey( $implCommaIJavaOptAtomType$ value );

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
	 *	Get the required ICFIntTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFIntTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required ICFIntTopDomainObj instance referenced by the ParentSDom key.
	 *
	 *	@return	The required ICFIntTopDomainObj instance referenced by the ParentSDom key.
	 */
	ICFIntTopDomainObj getRequiredContainerParentSDom();

	/**
	 *	Get the required ICFIntTopDomainObj instance referenced by the ParentSDom key.
	 *
	 *	@return	The required ICFIntTopDomainObj instance referenced by the ParentSDom key.
	 */
	ICFIntTopDomainObj getRequiredContainerParentSDom( boolean forceRead );

	/**
	 *	Get the array of optional ICFIntSubProjectObj array of instances referenced by the SubProject key.
	 *
	 *	@return	The optional ICFIntSubProjectObj[] array of instances referenced by the SubProject key.
	 */
	List<ICFIntSubProjectObj> getOptionalComponentsSubProject();

	/**
	 *	Get the array of optional ICFIntSubProjectObj array of instances referenced by the SubProject key.
	 *
	 *	@return	The optional ICFIntSubProjectObj[] array of instances referenced by the SubProject key.
	 */
	List<ICFIntSubProjectObj> getOptionalComponentsSubProject( boolean forceRead );

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
	 *	Internal use only.
	 */
	void copyPKeyToRec();

	/**
	 *	Internal use only.
	 */
	void copyRecToPKey();

}
