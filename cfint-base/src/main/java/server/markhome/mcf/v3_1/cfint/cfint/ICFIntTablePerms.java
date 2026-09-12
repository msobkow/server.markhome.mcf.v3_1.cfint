// Description: Java 25 CFInt Table Permissions Interface.

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
import server.markhome.mcf.v3_1.cflib.keyhash.*;

import server.markhome.mcf.v3_1.cfsec.cfsec.*;

public interface ICFIntTablePerms
extends ICFSecTablePerms
{
	/**
	 *	Is the session allowed to create License instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateLicense( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read License instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadLicense( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update License instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateLicense( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete License instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteLicense( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create MajorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateMajorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read MajorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadMajorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update MajorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateMajorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete MajorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteMajorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create MimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateMimeType( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read MimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadMimeType( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update MimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateMimeType( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete MimeType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteMimeType( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create MinorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateMinorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read MinorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadMinorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update MinorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateMinorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete MinorVersion instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteMinorVersion( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SubProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSubProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SubProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSubProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SubProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSubProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SubProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSubProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Tld instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTld( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Tld instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTld( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Tld instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTld( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Tld instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTld( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TopDomain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTopDomain( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TopDomain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTopDomain( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TopDomain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTopDomain( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TopDomain instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTopDomain( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TopProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTopProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TopProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTopProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TopProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTopProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TopProject instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTopProject( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create URLProtocol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateURLProtocol( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read URLProtocol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadURLProtocol( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update URLProtocol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateURLProtocol( CFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete URLProtocol instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteURLProtocol( CFSecAuthorization Authorization );
}
