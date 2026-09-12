
// Description: Java Protected Factory interface for TopProject.

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
 *	ICFIntProtTopProjectFactory protected interface for TopProject
 */
public interface ICFIntProtTopProjectFactory extends ICFIntPubTopProjectFactory
{

	/**
	 *	Allocate a protected primary history key for TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTopProjectHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for TopProject instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTopProjectHPKey asPublic(ICFIntProtTopProjectHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByTenantIdxKey asPublic(ICFIntProtTopProjectByTenantIdxKey src);

	/**
	 *	Allocate a protected TopDomainIdx key over protected TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByTopDomainIdxKey newProtByTopDomainIdxKey();

	/**
	 *	Allocate a public TopDomainIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByTopDomainIdxKey asPublic(ICFIntProtTopProjectByTopDomainIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByNameIdxKey asPublic(ICFIntProtTopProjectByNameIdxKey src);

	/**
	 *	Allocate a protected TopProject interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProject newProtRec();

	/**
	 *	Allocate a public TopProject interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProject asPublic(ICFIntProtTopProject src);

	/**
	 *	Allocate a protected TopProject history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectH newProtHRec();

	/**
	 *	Allocate a public TopProject history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectH asPublic(ICFIntProtTopProjectH src);

}
