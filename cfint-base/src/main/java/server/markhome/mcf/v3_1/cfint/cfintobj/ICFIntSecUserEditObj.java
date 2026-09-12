// Description: Java 25 Instance Edit Object interface for CFInt SecUser.

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

public interface ICFIntSecUserEditObj
	extends ICFIntSecUserObj, ICFSecSecUserEditObj
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
	ICFSecSecUserObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecUserEditObj update();

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( LocalDateTime value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( LocalDateTime value );

	/**
	 *	Get a list ICFSecSecSessionObj instances referenced by the SecSess key.
	 *
	 *	@return	The (potentially empty) list of ICFSecSecSessionObj instances referenced by the SecSess key.
	 */
	List<ICFSecSecSessionObj> getOptionalComponentsSecSess();

	/**
	 *	Get a list ICFSecSecSessionObj instances referenced by the SecProxy key.
	 *
	 *	@return	The (potentially empty) list of ICFSecSecSessionObj instances referenced by the SecProxy key.
	 */
	List<ICFSecSecSessionObj> getOptionalChildrenSecProxy();

	/**
	 *	Get the ICFSecSecUserPasswordObj instance referenced by the Password key.
	 *
	 *	@return	The ICFSecSecUserPasswordObj instance referenced by the Password key.
	 */
	ICFSecSecUserPasswordObj getOptionalComponentsPassword();

	/**
	 *	Get the optional ICFSecSecUserPasswordObj instance referenced by the Password key.
	 *
	 *	@return	The optional ICFSecSecUserPasswordObj instance referenced by the Password key.
	 */
	ICFSecSecUserPasswordObj getOptionalComponentsPassword( boolean forceRead );

	/**
	 *	Get the ICFSecSecUserEMConfObj instance referenced by the EMConf key.
	 *
	 *	@return	The ICFSecSecUserEMConfObj instance referenced by the EMConf key.
	 */
	ICFSecSecUserEMConfObj getOptionalComponentsEMConf();

	/**
	 *	Get the optional ICFSecSecUserEMConfObj instance referenced by the EMConf key.
	 *
	 *	@return	The optional ICFSecSecUserEMConfObj instance referenced by the EMConf key.
	 */
	ICFSecSecUserEMConfObj getOptionalComponentsEMConf( boolean forceRead );

	/**
	 *	Get the ICFSecSecUserPWResetObj instance referenced by the PWReset key.
	 *
	 *	@return	The ICFSecSecUserPWResetObj instance referenced by the PWReset key.
	 */
	ICFSecSecUserPWResetObj getOptionalComponentsPWReset();

	/**
	 *	Get the optional ICFSecSecUserPWResetObj instance referenced by the PWReset key.
	 *
	 *	@return	The optional ICFSecSecUserPWResetObj instance referenced by the PWReset key.
	 */
	ICFSecSecUserPWResetObj getOptionalComponentsPWReset( boolean forceRead );

	/**
	 *	Get the ICFSecSecUserPWHistoryObj instance referenced by the PWHistory key.
	 *
	 *	@return	The ICFSecSecUserPWHistoryObj instance referenced by the PWHistory key.
	 */
	ICFSecSecUserPWHistoryObj getOptionalChildrenPWHistory();

	/**
	 *	Get the optional ICFSecSecUserPWHistoryObj instance referenced by the PWHistory key.
	 *
	 *	@return	The optional ICFSecSecUserPWHistoryObj instance referenced by the PWHistory key.
	 */
	ICFSecSecUserPWHistoryObj getOptionalChildrenPWHistory( boolean forceRead );

	/**
	 *	Get a list ICFSecSecSysGrpMembObj instances referenced by the SysSecGrpMemb key.
	 *
	 *	@return	The (potentially empty) list of ICFSecSecSysGrpMembObj instances referenced by the SysSecGrpMemb key.
	 */
	List<ICFSecSecSysGrpMembObj> getOptionalChildrenSysSecGrpMemb();

	/**
	 *	Get a list ICFSecSecClusGrpMembObj instances referenced by the ClusSecGrpMemb key.
	 *
	 *	@return	The (potentially empty) list of ICFSecSecClusGrpMembObj instances referenced by the ClusSecGrpMemb key.
	 */
	List<ICFSecSecClusGrpMembObj> getOptionalChildrenClusSecGrpMemb();

	/**
	 *	Get a list ICFSecSecTentGrpMembObj instances referenced by the TentSecGrpMemb key.
	 *
	 *	@return	The (potentially empty) list of ICFSecSecTentGrpMembObj instances referenced by the TentSecGrpMemb key.
	 */
	List<ICFSecSecTentGrpMembObj> getOptionalChildrenTentSecGrpMemb();

	public void copyRecToOrig();
	public void copyOrigToRec();

}
