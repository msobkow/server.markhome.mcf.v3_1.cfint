
// Description: Java JPA Factory interface for TopProject.

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

package server.markhome.mcf.v3_1.cfint.cfint;

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

import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;

/*
 *	ICFIntTopProjectFactory interface for TopProject
 */
public interface ICFIntTopProjectFactory extends ICFIntProtTopProjectFactory
{

	/**
	 *	Allocate a primary history key for TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntTopProjectHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for TopProject instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtTopProjectHPKey asProtected(ICFIntTopProjectHPKey src);

	/**
	 *	Allocate a public primary history key for TopProject instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubTopProjectHPKey asPublic(ICFIntTopProjectHPKey src);

	/**
	 *	Allocate a TenantIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopProjectByTenantIdxKey newByTenantIdxKey();

	/**
	 *	Allocate a protected TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByTenantIdxKey asProtected(ICFIntTopProjectByTenantIdxKey src);

	/**
	 *	Allocate a public TenantIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByTenantIdxKey asPublic(ICFIntTopProjectByTenantIdxKey src);

	/**
	 *	Allocate a TopDomainIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopProjectByTopDomainIdxKey newByTopDomainIdxKey();

	/**
	 *	Allocate a protected TopDomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByTopDomainIdxKey asProtected(ICFIntTopProjectByTopDomainIdxKey src);

	/**
	 *	Allocate a public TopDomainIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByTopDomainIdxKey asPublic(ICFIntTopProjectByTopDomainIdxKey src);

	/**
	 *	Allocate a NameIdx key over TopProject instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopProjectByNameIdxKey newByNameIdxKey();

	/**
	 *	Allocate a protected NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectByNameIdxKey asProtected(ICFIntTopProjectByNameIdxKey src);

	/**
	 *	Allocate a public NameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectByNameIdxKey asPublic(ICFIntTopProjectByNameIdxKey src);

	/**
	 *	Allocate a TopProject interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopProject newRec();

	/**
	 *	Allocate a protected TopProject interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProject asProtected(ICFIntTopProject src);

	/**
	 *	Allocate a public TopProject interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProject asPublic(ICFIntTopProject src);

	/**
	 *	Allocate a TopProject history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntTopProjectH newHRec();

	/**
	 *	Allocate a protected TopProject history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtTopProjectH asProtected(ICFIntTopProjectH src);

	/**
	 *	Allocate a public TopProject history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubTopProjectH asPublic(ICFIntTopProjectH src);

}
