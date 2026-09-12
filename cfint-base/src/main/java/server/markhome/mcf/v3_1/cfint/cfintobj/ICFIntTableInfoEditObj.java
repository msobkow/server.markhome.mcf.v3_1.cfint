// Description: Java 25 Instance Edit Object interface for CFInt TableInfo.

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
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;

public interface ICFIntTableInfoEditObj
	extends ICFIntTableInfoObj, ICFSecTableInfoEditObj
{
	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecTableInfoObj create();

	/*
	 *	Update the instance.
	 */
	CFSecTableInfoEditObj update();

	/**
	 *	Get the ICFSecTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@return	The ICFSecTableInfoObj instance referenced by the SuperRef key.
	 */
	ICFSecTableInfoObj getOptionalParentSuperRef();

	/**
	 *	Get the optional ICFSecTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@return	The optional ICFSecTableInfoObj instance referenced by the SuperRef key.
	 */
	ICFSecTableInfoObj getOptionalParentSuperRef( boolean forceRead );

	/**
	 *	Set the ICFSecTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@param	value	the ICFSecTableInfoObj instance to be referenced by the SuperRef key.
	 */
	void setOptionalParentSuperRef( ICFSecTableInfoObj value );

	/**
	 *	Get a list ICFSecTableInfoObj instances referenced by the SubRefs key.
	 *
	 *	@return	The (potentially empty) list of ICFSecTableInfoObj instances referenced by the SubRefs key.
	 */
	List<ICFSecTableInfoObj> getOptionalChildrenSubRefs();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
