
// Description: Java JPA Factory interface for MimeType.

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
 *	ICFIntMimeTypeFactory interface for MimeType
 */
public interface ICFIntMimeTypeFactory extends ICFIntProtMimeTypeFactory
{

	/**
	 *	Allocate a primary history key for MimeType instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntMimeTypeHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for MimeType instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntProtMimeTypeHPKey asProtected(ICFIntMimeTypeHPKey src);

	/**
	 *	Allocate a public primary history key for MimeType instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMimeTypeHPKey asPublic(ICFIntMimeTypeHPKey src);

	/**
	 *	Allocate a UNameIdx key over MimeType instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMimeTypeByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMimeTypeByUNameIdxKey asProtected(ICFIntMimeTypeByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeTypeByUNameIdxKey asPublic(ICFIntMimeTypeByUNameIdxKey src);

	/**
	 *	Allocate a MimeType interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMimeType newRec();

	/**
	 *	Allocate a protected MimeType interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMimeType asProtected(ICFIntMimeType src);

	/**
	 *	Allocate a public MimeType interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeType asPublic(ICFIntMimeType src);

	/**
	 *	Allocate a MimeType history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntMimeTypeH newHRec();

	/**
	 *	Allocate a protected MimeType history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntProtMimeTypeH asProtected(ICFIntMimeTypeH src);

	/**
	 *	Allocate a public MimeType history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeTypeH asPublic(ICFIntMimeTypeH src);

}
