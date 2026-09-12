
// Description: Java Public Factory interface for MimeType.

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

package server.markhome.mcf.v3_1.cfint.cfintpub;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;

/*
 *	ICFIntPubMimeTypeFactory public interface for MimeType
 */
public interface ICFIntPubMimeTypeFactory
{

	/**
	 *	Allocate a public primary history key for MimeType instances.
	 *
	 *	@return	The new instance.
	 */
	ICFIntPubMimeTypeHPKey newPubHPKey();

	/**
	 *	Allocate a public UNameIdx key over public MimeType instances.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeTypeByUNameIdxKey newPubByUNameIdxKey();

	/**
	 *	Allocate a public MimeType interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeType newPubRec();

	/**
	 *	Allocate a public MimeType history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public ICFIntPubMimeTypeH newPubHRec();

}
