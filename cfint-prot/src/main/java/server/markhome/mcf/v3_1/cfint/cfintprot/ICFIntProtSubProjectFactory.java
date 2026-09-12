
// Description: Java Protected Factory interface for SubProject.

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

package server.markhome.mcf.v3_1.cfint.cfintprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;

/*
 *	ICFIntProtSubProjectFactory protected interface for SubProject
 */
public interface ICFIntProtSubProjectFactory extends ICFIntPubSubProjectFactory
{

	/**
	 *	Allocate a protected primary history key for SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtSubProjectHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for SubProject instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubSubProjectHPKey asPublic(ICFIntProtSubProjectHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtSubProjectByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubSubProjectByTenantIdxKey asPublic(ICFIntProtSubProjectByTenantIdxKey src);

	/**
	 *	Allocate a protected TopProjectIdx key over protected SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtSubProjectByTopProjectIdxKey newProtByTopProjectIdxKey();

	/**
	 *	Allocate a public TopProjectIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubSubProjectByTopProjectIdxKey asPublic(ICFIntProtSubProjectByTopProjectIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected SubProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtSubProjectByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubSubProjectByNameIdxKey asPublic(ICFIntProtSubProjectByNameIdxKey src);

	/**
	 *	Allocate a protected SubProject interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtSubProject newProtRec();

	/**
	 *	Allocate a public SubProject interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubSubProject asPublic(ICFIntProtSubProject src);

	/**
	 *	Allocate a protected SubProject history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtSubProjectH newProtHRec();

	/**
	 *	Allocate a public SubProject history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubSubProjectH asPublic(ICFIntProtSubProjectH src);

}
