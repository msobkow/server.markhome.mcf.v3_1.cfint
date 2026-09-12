// Description: Java 25 Schema Object implementation for CFInt.

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

public class CFIntSchemaObj
	implements ICFIntSchemaObj
{
	public static final String SCHEMA_NAME = ICFIntSchema.SCHEMA_NAME;
	public static final String SCHEMA_DBNAME = ICFIntSchema.DBSCHEMA_NAME;
	protected ICFSecAuthorization authorization = null;
	protected String secClusterName = "system";
	protected String secTenantName = "system";
	protected String secUserName = "system";
	protected ICFSecClusterObj secCluster = null;
	protected CFLibDbKeyHash256 secClusterId = null;
	protected ICFSecTenantObj secTenant = null;
	protected CFLibDbKeyHash256 secTenantId = null;
	protected ICFSecSecUserObj secUser = null;
	protected CFLibDbKeyHash256 secSessionUserId = null;
	protected ICFSecSecSessionObj secSession = null;
	protected CFLibDbKeyHash256 secSessionSessionId = null;
	protected String schemaDbName = SCHEMA_DBNAME;
	protected String lowerDbSchemaName = SCHEMA_DBNAME.toLowerCase();

	protected ICFSecSchema cfsecBackingStore;
	protected ICFIntSchema cfintBackingStore;
	protected ICFIntClusterTableObj clusterTableObj;
	protected ICFIntISOCcyTableObj iSOCcyTableObj;
	protected ICFIntISOCtryTableObj iSOCtryTableObj;
	protected ICFIntISOCtryCcyTableObj iSOCtryCcyTableObj;
	protected ICFIntISOCtryLangTableObj iSOCtryLangTableObj;
	protected ICFIntISOLangTableObj iSOLangTableObj;
	protected ICFIntISOTZoneTableObj iSOTZoneTableObj;
	protected ICFIntLicenseTableObj licenseTableObj;
	protected ICFIntMajorVersionTableObj majorVersionTableObj;
	protected ICFIntMimeTypeTableObj mimeTypeTableObj;
	protected ICFIntMinorVersionTableObj minorVersionTableObj;
	protected ICFIntSecClusGrpTableObj secClusGrpTableObj;
	protected ICFIntSecClusGrpMembTableObj secClusGrpMembTableObj;
	protected ICFIntSecClusRoleTableObj secClusRoleTableObj;
	protected ICFIntSecClusRoleMembTableObj secClusRoleMembTableObj;
	protected ICFIntSecSessionTableObj secSessionTableObj;
	protected ICFIntSecSysGrpTableObj secSysGrpTableObj;
	protected ICFIntSecSysGrpIncTableObj secSysGrpIncTableObj;
	protected ICFIntSecSysGrpMembTableObj secSysGrpMembTableObj;
	protected ICFIntSecSysRoleTableObj secSysRoleTableObj;
	protected ICFIntSecSysRoleEnablesTableObj secSysRoleEnablesTableObj;
	protected ICFIntSecSysRoleMembTableObj secSysRoleMembTableObj;
	protected ICFIntSecTentGrpTableObj secTentGrpTableObj;
	protected ICFIntSecTentGrpMembTableObj secTentGrpMembTableObj;
	protected ICFIntSecTentRoleTableObj secTentRoleTableObj;
	protected ICFIntSecTentRoleMembTableObj secTentRoleMembTableObj;
	protected ICFIntSecUserTableObj secUserTableObj;
	protected ICFIntSecUserEMConfTableObj secUserEMConfTableObj;
	protected ICFIntSecUserPWHistoryTableObj secUserPWHistoryTableObj;
	protected ICFIntSecUserPWResetTableObj secUserPWResetTableObj;
	protected ICFIntSecUserPasswordTableObj secUserPasswordTableObj;
	protected ICFIntSubProjectTableObj subProjectTableObj;
	protected ICFIntSysClusterTableObj sysClusterTableObj;
	protected ICFIntTableInfoTableObj tableInfoTableObj;
	protected ICFIntTenantTableObj tenantTableObj;
	protected ICFIntTldTableObj tldTableObj;
	protected ICFIntTopDomainTableObj topDomainTableObj;
	protected ICFIntTopProjectTableObj topProjectTableObj;
	protected ICFIntURLProtocolTableObj uRLProtocolTableObj;

	public CFIntSchemaObj() {

		cfsecBackingStore = null;
		cfintBackingStore = null;
		clusterTableObj = new CFIntClusterTableObj( this );
		iSOCcyTableObj = new CFIntISOCcyTableObj( this );
		iSOCtryTableObj = new CFIntISOCtryTableObj( this );
		iSOCtryCcyTableObj = new CFIntISOCtryCcyTableObj( this );
		iSOCtryLangTableObj = new CFIntISOCtryLangTableObj( this );
		iSOLangTableObj = new CFIntISOLangTableObj( this );
		iSOTZoneTableObj = new CFIntISOTZoneTableObj( this );
		licenseTableObj = new CFIntLicenseTableObj( this );
		majorVersionTableObj = new CFIntMajorVersionTableObj( this );
		mimeTypeTableObj = new CFIntMimeTypeTableObj( this );
		minorVersionTableObj = new CFIntMinorVersionTableObj( this );
		secClusGrpTableObj = new CFIntSecClusGrpTableObj( this );
		secClusGrpMembTableObj = new CFIntSecClusGrpMembTableObj( this );
		secClusRoleTableObj = new CFIntSecClusRoleTableObj( this );
		secClusRoleMembTableObj = new CFIntSecClusRoleMembTableObj( this );
		secSessionTableObj = new CFIntSecSessionTableObj( this );
		secSysGrpTableObj = new CFIntSecSysGrpTableObj( this );
		secSysGrpIncTableObj = new CFIntSecSysGrpIncTableObj( this );
		secSysGrpMembTableObj = new CFIntSecSysGrpMembTableObj( this );
		secSysRoleTableObj = new CFIntSecSysRoleTableObj( this );
		secSysRoleEnablesTableObj = new CFIntSecSysRoleEnablesTableObj( this );
		secSysRoleMembTableObj = new CFIntSecSysRoleMembTableObj( this );
		secTentGrpTableObj = new CFIntSecTentGrpTableObj( this );
		secTentGrpMembTableObj = new CFIntSecTentGrpMembTableObj( this );
		secTentRoleTableObj = new CFIntSecTentRoleTableObj( this );
		secTentRoleMembTableObj = new CFIntSecTentRoleMembTableObj( this );
		secUserTableObj = new CFIntSecUserTableObj( this );
		secUserEMConfTableObj = new CFIntSecUserEMConfTableObj( this );
		secUserPWHistoryTableObj = new CFIntSecUserPWHistoryTableObj( this );
		secUserPWResetTableObj = new CFIntSecUserPWResetTableObj( this );
		secUserPasswordTableObj = new CFIntSecUserPasswordTableObj( this );
		subProjectTableObj = new CFIntSubProjectTableObj( this );
		sysClusterTableObj = new CFIntSysClusterTableObj( this );
		tableInfoTableObj = new CFIntTableInfoTableObj( this );
		tenantTableObj = new CFIntTenantTableObj( this );
		tldTableObj = new CFIntTldTableObj( this );
		topDomainTableObj = new CFIntTopDomainTableObj( this );
		topProjectTableObj = new CFIntTopProjectTableObj( this );
		uRLProtocolTableObj = new CFIntURLProtocolTableObj( this );
		}

	public void setSecClusterName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( getClass(),
				"setClusterName",
				1,
				"value" );
		}
		secClusterName = value;
		secCluster = null;
	}

	public String getSecClusterName() {
		return( secClusterName );
	}

	public ICFSecClusterObj getSecCluster() {
		if( secCluster == null ) {
			if( authorization != null ) {
				secCluster = getClusterTableObj().readClusterByIdIdx( authorization.getSecClusterId() );
			}
			else {
				secCluster = getClusterTableObj().readClusterByUDomNameIdx( secClusterName );
				if( secCluster == null && secClusterId != null && !secClusterId.isNull() ) {
					secCluster = getClusterTableObj().readClusterByIdIdx( secClusterId );
				}
			}
			if( secCluster != null ) {
				secClusterName = secCluster.getRequiredFullDomName();
				secClusterId = secCluster.getRequiredId();
				if( authorization != null ) {
					authorization.setSecCluster( secCluster );
				}
			}
		}
		return( secCluster );
	}

	public void setSecCluster( ICFSecClusterObj value ) {
		secCluster = value;
		if( secCluster == null ) {
			return;
		}
		secClusterId = secCluster.getRequiredId();
		secClusterName = secCluster.getRequiredFullDomName();
		if( authorization != null ) {
			authorization.setSecCluster( secCluster );
		}
	}

	public CFLibDbKeyHash256 getSecClusterId() {
		return( secClusterId );
	}

	public void setSecTenantName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( getClass(),
				"setTenantName",
				1,
				"value" );
		}
		secTenantName = value;
		secTenant = null;
	}

	public String getSecTenantName() {
		return( secTenantName );
	}

	public ICFSecTenantObj getSecTenant() {
		if( secTenant == null ) {
			if( authorization != null ) {
				secTenant = getTenantTableObj().readTenantByIdIdx( authorization.getSecTenantId() );
			}
			else {
				secTenant = getTenantTableObj().readTenantByUNameIdx( getSecCluster().getRequiredId(), secTenantName );
				if( ( secTenant == null && secTenantId != null && !secTenantId.isNull() ) ) {
					secTenant = getTenantTableObj().readTenantByIdIdx( secTenantId );
				}
			}
			if( secTenant != null ) {
				secTenantName = secTenant.getRequiredTenantName();
				secTenantId = secTenant.getRequiredId();
				if( authorization != null ) {
					authorization.setSecTenant( secTenant );
				}
			}
		}
		return( secTenant );
	}

	public void setSecTenant( ICFSecTenantObj value ) {
		secTenant = value;
		if( secTenant == null ) {
			return;
		}
		secTenantId = secTenant.getRequiredId();
		secTenantName = secTenant.getRequiredTenantName();
		if( authorization != null ) {
			authorization.setSecTenant( secTenant );
		}
	}

	public CFLibDbKeyHash256 getSecTenantId() {
		return( secTenantId );
	}

	public void setSecUserName( String value ) {
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new CFLibNullArgumentException( getClass(),
				"setUserName",
				1,
				"value" );
		}
		secUserName = value;
		secUser = null;
	}

	public String getSecUserName() {
		return( secUserName );
	}

	public ICFSecSecUserObj getSecUser() {
		if( secUser == null ) {
			if( authorization != null ) {
				secUser = getSecUserTableObj().readSecUserByIdIdx( authorization.getSecUserId() );
			}
			else {
				secUser = getSecUserTableObj().readSecUserByULoginIdx( secUserName );
				if( ( secUser == null ) && ( secSessionUserId != null ) ) {
					secUser = getSecUserTableObj().readSecUserByIdIdx( secSessionUserId );
				}
			}
			if( secUser != null ) {
				secUserName = secUser.getRequiredLoginId();
				secSessionUserId = secUser.getRequiredSecUserId();
			}
		}
		return( secUser );
	}

	public void setSecUser( ICFSecSecUserObj value ) {
		secUser = value;
		if( secUser != null ) {
			secUserName = secUser.getRequiredLoginId();
			secSessionUserId = secUser.getRequiredSecUserId();
		}
	}
	public ICFSecSecSessionObj getSecSession() {
		if( secSession == null ) {
			if( authorization != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( authorization.getSecSessionId() );
			}
			else if( secSessionSessionId != null ) {
				secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionSessionId );
			}
			if( secSession != null ) {
				secSessionSessionId = secSession.getRequiredSecSessionId();
				secSessionUserId = secSession.getRequiredSecUserId();
			}
		}
		return( secSession );
	}

	public void setSecSession( ICFSecSecSessionObj value ) {
		secSession = value;
		if( secSession == null ) {
			return;
		}
		secSessionSessionId = secSession.getRequiredSecSessionId();
		secSessionUserId = secSession.getRequiredSecUserId();
		if( authorization != null ) {
			authorization.setSecSession( secSession );
		}
	}

	public void setSecSessionId( CFLibDbKeyHash256 value ) {
		secSessionSessionId = value;
	}

	public CFLibDbKeyHash256 getSecSessionSessionId() {
		return( secSessionSessionId );
	}

	public CFLibDbKeyHash256 getSecSessionUserId() {
		return( secSessionUserId );
	}

	public ICFSecAuthorization getAuthorization() {
		return( authorization );
	}

	public void setAuthorization( ICFSecAuthorization value ) {
		authorization = value;
	}

	@Override
	public ICFSecSchema getCFSecBackingStore() {
		return( cfsecBackingStore );
	}

	@Override
	public void setCFSecBackingStore(ICFSecSchema cfsecBackingStore) {
		if (cfsecBackingStore == null) {
			throw new CFLibNullArgumentException(getClass(), "setCFSecBackingStore", 1, "cfsecBackingStore");
		}
		this.cfsecBackingStore = cfsecBackingStore;
	}

	@Override
	public ICFIntSchema getCFIntBackingStore() {
		return( cfintBackingStore );
	}

	@Override
	public void setCFIntBackingStore(ICFIntSchema cfintBackingStore) {
		if (cfintBackingStore == null) {
			throw new CFLibNullArgumentException(getClass(), "setCFIntBackingStore", 1, "cfintBackingStore");
		}
		this.cfintBackingStore = cfintBackingStore;
	}

	public String getSchemaName() {
		return( SCHEMA_NAME );
	}

	public void minimizeMemory() {
		if( clusterTableObj != null ) {
			clusterTableObj.minimizeMemory();
		}
		if( iSOCcyTableObj != null ) {
			iSOCcyTableObj.minimizeMemory();
		}
		if( iSOCtryTableObj != null ) {
			iSOCtryTableObj.minimizeMemory();
		}
		if( iSOCtryCcyTableObj != null ) {
			iSOCtryCcyTableObj.minimizeMemory();
		}
		if( iSOCtryLangTableObj != null ) {
			iSOCtryLangTableObj.minimizeMemory();
		}
		if( iSOLangTableObj != null ) {
			iSOLangTableObj.minimizeMemory();
		}
		if( iSOTZoneTableObj != null ) {
			iSOTZoneTableObj.minimizeMemory();
		}
		if( licenseTableObj != null ) {
			licenseTableObj.minimizeMemory();
		}
		if( majorVersionTableObj != null ) {
			majorVersionTableObj.minimizeMemory();
		}
		if( mimeTypeTableObj != null ) {
			mimeTypeTableObj.minimizeMemory();
		}
		if( minorVersionTableObj != null ) {
			minorVersionTableObj.minimizeMemory();
		}
		if( secClusGrpTableObj != null ) {
			secClusGrpTableObj.minimizeMemory();
		}
		if( secClusGrpMembTableObj != null ) {
			secClusGrpMembTableObj.minimizeMemory();
		}
		if( secClusRoleTableObj != null ) {
			secClusRoleTableObj.minimizeMemory();
		}
		if( secClusRoleMembTableObj != null ) {
			secClusRoleMembTableObj.minimizeMemory();
		}
		if( secSessionTableObj != null ) {
			secSessionTableObj.minimizeMemory();
		}
		if( secSysGrpTableObj != null ) {
			secSysGrpTableObj.minimizeMemory();
		}
		if( secSysGrpIncTableObj != null ) {
			secSysGrpIncTableObj.minimizeMemory();
		}
		if( secSysGrpMembTableObj != null ) {
			secSysGrpMembTableObj.minimizeMemory();
		}
		if( secSysRoleTableObj != null ) {
			secSysRoleTableObj.minimizeMemory();
		}
		if( secSysRoleEnablesTableObj != null ) {
			secSysRoleEnablesTableObj.minimizeMemory();
		}
		if( secSysRoleMembTableObj != null ) {
			secSysRoleMembTableObj.minimizeMemory();
		}
		if( secTentGrpTableObj != null ) {
			secTentGrpTableObj.minimizeMemory();
		}
		if( secTentGrpMembTableObj != null ) {
			secTentGrpMembTableObj.minimizeMemory();
		}
		if( secTentRoleTableObj != null ) {
			secTentRoleTableObj.minimizeMemory();
		}
		if( secTentRoleMembTableObj != null ) {
			secTentRoleMembTableObj.minimizeMemory();
		}
		if( secUserTableObj != null ) {
			secUserTableObj.minimizeMemory();
		}
		if( secUserEMConfTableObj != null ) {
			secUserEMConfTableObj.minimizeMemory();
		}
		if( secUserPWHistoryTableObj != null ) {
			secUserPWHistoryTableObj.minimizeMemory();
		}
		if( secUserPWResetTableObj != null ) {
			secUserPWResetTableObj.minimizeMemory();
		}
		if( secUserPasswordTableObj != null ) {
			secUserPasswordTableObj.minimizeMemory();
		}
		if( subProjectTableObj != null ) {
			subProjectTableObj.minimizeMemory();
		}
		if( sysClusterTableObj != null ) {
			sysClusterTableObj.minimizeMemory();
		}
		if( tableInfoTableObj != null ) {
			tableInfoTableObj.minimizeMemory();
		}
		if( tenantTableObj != null ) {
			tenantTableObj.minimizeMemory();
		}
		if( tldTableObj != null ) {
			tldTableObj.minimizeMemory();
		}
		if( topDomainTableObj != null ) {
			topDomainTableObj.minimizeMemory();
		}
		if( topProjectTableObj != null ) {
			topProjectTableObj.minimizeMemory();
		}
		if( uRLProtocolTableObj != null ) {
			uRLProtocolTableObj.minimizeMemory();
		}
	}

	public void logout() {
		if( authorization == null ) {
			return;
		}
		setAuthorization( null );
		CFLibDbKeyHash256 secSessionId = authorization.getSecSessionId();
		if( secSessionId != null ) {
			ICFSecSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
			if( secSession != null ) {
				if( secSession.getOptionalFinish() == null ) {
					ICFSecSecSessionEditObj editSecSession = secSession.beginEdit();
					editSecSession.setOptionalFinish( LocalDateTime.now() );
					editSecSession.update();
					editSecSession = null;
				}
			}
		}
	}

	public ICFIntClusterTableObj getClusterTableObj() {
		return( clusterTableObj );
	}

	public ICFIntISOCcyTableObj getISOCcyTableObj() {
		return( iSOCcyTableObj );
	}

	public ICFIntISOCtryTableObj getISOCtryTableObj() {
		return( iSOCtryTableObj );
	}

	public ICFIntISOCtryCcyTableObj getISOCtryCcyTableObj() {
		return( iSOCtryCcyTableObj );
	}

	public ICFIntISOCtryLangTableObj getISOCtryLangTableObj() {
		return( iSOCtryLangTableObj );
	}

	public ICFIntISOLangTableObj getISOLangTableObj() {
		return( iSOLangTableObj );
	}

	public ICFIntISOTZoneTableObj getISOTZoneTableObj() {
		return( iSOTZoneTableObj );
	}

	public ICFIntLicenseTableObj getLicenseTableObj() {
		return( licenseTableObj );
	}

	public ICFIntMajorVersionTableObj getMajorVersionTableObj() {
		return( majorVersionTableObj );
	}

	public ICFIntMimeTypeTableObj getMimeTypeTableObj() {
		return( mimeTypeTableObj );
	}

	public ICFIntMinorVersionTableObj getMinorVersionTableObj() {
		return( minorVersionTableObj );
	}

	public ICFIntSecClusGrpTableObj getSecClusGrpTableObj() {
		return( secClusGrpTableObj );
	}

	public ICFIntSecClusGrpMembTableObj getSecClusGrpMembTableObj() {
		return( secClusGrpMembTableObj );
	}

	public ICFIntSecClusRoleTableObj getSecClusRoleTableObj() {
		return( secClusRoleTableObj );
	}

	public ICFIntSecClusRoleMembTableObj getSecClusRoleMembTableObj() {
		return( secClusRoleMembTableObj );
	}

	public ICFIntSecSessionTableObj getSecSessionTableObj() {
		return( secSessionTableObj );
	}

	public ICFIntSecSysGrpTableObj getSecSysGrpTableObj() {
		return( secSysGrpTableObj );
	}

	public ICFIntSecSysGrpIncTableObj getSecSysGrpIncTableObj() {
		return( secSysGrpIncTableObj );
	}

	public ICFIntSecSysGrpMembTableObj getSecSysGrpMembTableObj() {
		return( secSysGrpMembTableObj );
	}

	public ICFIntSecSysRoleTableObj getSecSysRoleTableObj() {
		return( secSysRoleTableObj );
	}

	public ICFIntSecSysRoleEnablesTableObj getSecSysRoleEnablesTableObj() {
		return( secSysRoleEnablesTableObj );
	}

	public ICFIntSecSysRoleMembTableObj getSecSysRoleMembTableObj() {
		return( secSysRoleMembTableObj );
	}

	public ICFIntSecTentGrpTableObj getSecTentGrpTableObj() {
		return( secTentGrpTableObj );
	}

	public ICFIntSecTentGrpMembTableObj getSecTentGrpMembTableObj() {
		return( secTentGrpMembTableObj );
	}

	public ICFIntSecTentRoleTableObj getSecTentRoleTableObj() {
		return( secTentRoleTableObj );
	}

	public ICFIntSecTentRoleMembTableObj getSecTentRoleMembTableObj() {
		return( secTentRoleMembTableObj );
	}

	public ICFIntSecUserTableObj getSecUserTableObj() {
		return( secUserTableObj );
	}

	public ICFIntSecUserEMConfTableObj getSecUserEMConfTableObj() {
		return( secUserEMConfTableObj );
	}

	public ICFIntSecUserPWHistoryTableObj getSecUserPWHistoryTableObj() {
		return( secUserPWHistoryTableObj );
	}

	public ICFIntSecUserPWResetTableObj getSecUserPWResetTableObj() {
		return( secUserPWResetTableObj );
	}

	public ICFIntSecUserPasswordTableObj getSecUserPasswordTableObj() {
		return( secUserPasswordTableObj );
	}

	public ICFIntSubProjectTableObj getSubProjectTableObj() {
		return( subProjectTableObj );
	}

	public ICFIntSysClusterTableObj getSysClusterTableObj() {
		return( sysClusterTableObj );
	}

	public ICFIntTableInfoTableObj getTableInfoTableObj() {
		return( tableInfoTableObj );
	}

	public ICFIntTenantTableObj getTenantTableObj() {
		return( tenantTableObj );
	}

	public ICFIntTldTableObj getTldTableObj() {
		return( tldTableObj );
	}

	public ICFIntTopDomainTableObj getTopDomainTableObj() {
		return( topDomainTableObj );
	}

	public ICFIntTopProjectTableObj getTopProjectTableObj() {
		return( topProjectTableObj );
	}

	public ICFIntURLProtocolTableObj getURLProtocolTableObj() {
		return( uRLProtocolTableObj );
	}
}
