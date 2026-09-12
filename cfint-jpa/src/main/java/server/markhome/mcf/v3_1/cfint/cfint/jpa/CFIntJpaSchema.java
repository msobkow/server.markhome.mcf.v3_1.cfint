// Description: Java 25 JPA implementation of a CFInt schema.

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

package server.markhome.mcf.v3_1.cfint.cfint.jpa;
//package server.markhome.mcf.v3_1.cfint.cfint.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.net.InetAddress;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.atomic.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cflib.inz.Inz;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;

import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.jpa.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfint.jpa.CFIntJpaHooksSchema;

import server.markhome.mcf.v3_1.cfsec.cfsec.buff.CFSecBuffSchema;
import server.markhome.mcf.v3_1.cfsec.cfsec.buff.CFSecBuffFactoryService;
import server.markhome.mcf.v3_1.cfint.cfint.buff.CFIntBuffSchema;
import server.markhome.mcf.v3_1.cfint.cfint.buff.CFIntBuffFactoryService;

public class CFIntJpaSchema
	implements ICFIntSchema,
		ICFSecSchema
{
	private static CFIntJpaHooksSchema cfintJpaHooksSchema = null;

	protected ICFSecClusterTable tableCluster;
	protected ICFSecISOCcyTable tableISOCcy;
	protected ICFSecISOCtryTable tableISOCtry;
	protected ICFSecISOCtryCcyTable tableISOCtryCcy;
	protected ICFSecISOCtryLangTable tableISOCtryLang;
	protected ICFSecISOLangTable tableISOLang;
	protected ICFSecISOTZoneTable tableISOTZone;
	protected ICFIntLicenseTable tableLicense;
	protected ICFIntMajorVersionTable tableMajorVersion;
	protected ICFIntMimeTypeTable tableMimeType;
	protected ICFIntMinorVersionTable tableMinorVersion;
	protected ICFSecSecClusGrpTable tableSecClusGrp;
	protected ICFSecSecClusGrpMembTable tableSecClusGrpMemb;
	protected ICFSecSecClusRoleTable tableSecClusRole;
	protected ICFSecSecClusRoleMembTable tableSecClusRoleMemb;
	protected ICFSecSecSessionTable tableSecSession;
	protected ICFSecSecSysGrpTable tableSecSysGrp;
	protected ICFSecSecSysGrpIncTable tableSecSysGrpInc;
	protected ICFSecSecSysGrpMembTable tableSecSysGrpMemb;
	protected ICFSecSecSysRoleTable tableSecSysRole;
	protected ICFSecSecSysRoleEnablesTable tableSecSysRoleEnables;
	protected ICFSecSecSysRoleMembTable tableSecSysRoleMemb;
	protected ICFSecSecTentGrpTable tableSecTentGrp;
	protected ICFSecSecTentGrpMembTable tableSecTentGrpMemb;
	protected ICFSecSecTentRoleTable tableSecTentRole;
	protected ICFSecSecTentRoleMembTable tableSecTentRoleMemb;
	protected ICFSecSecUserTable tableSecUser;
	protected ICFSecSecUserEMConfTable tableSecUserEMConf;
	protected ICFSecSecUserPWHistoryTable tableSecUserPWHistory;
	protected ICFSecSecUserPWResetTable tableSecUserPWReset;
	protected ICFSecSecUserPasswordTable tableSecUserPassword;
	protected ICFIntSubProjectTable tableSubProject;
	protected ICFSecSysClusterTable tableSysCluster;
	protected ICFSecTableInfoTable tableTableInfo;
	protected ICFSecTenantTable tableTenant;
	protected ICFIntTldTable tableTld;
	protected ICFIntTopDomainTable tableTopDomain;
	protected ICFIntTopProjectTable tableTopProject;
	protected ICFIntURLProtocolTable tableURLProtocol;


	@Override
	public int initClassMapEntries(int value) {
		return( ICFIntSchema.doInitClassMapEntries(value) );
	}

	@Override
	public void wireRecConstructors() {
		ICFSecSchema.ClassMapEntry entry;
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntLicense.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntLicense ret = new CFIntJpaLicense();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntLicense.CLASS_CODE)[" + ICFIntLicense.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntMajorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntMajorVersion ret = new CFIntJpaMajorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntMajorVersion.CLASS_CODE)[" + ICFIntMajorVersion.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntMimeType.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntMimeType ret = new CFIntJpaMimeType();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntMimeType.CLASS_CODE)[" + ICFIntMimeType.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntMinorVersion.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntMinorVersion ret = new CFIntJpaMinorVersion();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntMinorVersion.CLASS_CODE)[" + ICFIntMinorVersion.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntSubProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntSubProject ret = new CFIntJpaSubProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntSubProject.CLASS_CODE)[" + ICFIntSubProject.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntTld.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntTld ret = new CFIntJpaTld();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntTld.CLASS_CODE)[" + ICFIntTld.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntTopDomain.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntTopDomain ret = new CFIntJpaTopDomain();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntTopDomain.CLASS_CODE)[" + ICFIntTopDomain.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntTopProject.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntTopProject ret = new CFIntJpaTopProject();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntTopProject.CLASS_CODE)[" + ICFIntTopProject.CLASS_CODE + "]");
		}
	
		entry = ICFIntSchema.getClassMapByBackingClassCode(ICFIntURLProtocol.CLASS_CODE);
		if (entry != null) {
			entry.setBackingRecConstructor( new BackingRecConstructor() {
				@Override
				public Object instantiate() {
					ICFIntURLProtocol ret = new CFIntJpaURLProtocol();
					return(ret);
				}
			});
		}
		else {
			throw new CFLibNullArgumentException(CFIntJpaSchema.class, "wireRecConstructors", 0, "ICFIntSchema.getClassMapByBackingClassCode(ICFIntURLProtocol.CLASS_CODE)[" + ICFIntURLProtocol.CLASS_CODE + "]");
		}
	
	}

	@Override
	public void wireTableTableInstances() {
		if (tableLicense == null || !(tableLicense instanceof CFIntJpaLicenseTable)) {
			tableLicense = new CFIntJpaLicenseTable(this);
		}
		if (tableMajorVersion == null || !(tableMajorVersion instanceof CFIntJpaMajorVersionTable)) {
			tableMajorVersion = new CFIntJpaMajorVersionTable(this);
		}
		if (tableMimeType == null || !(tableMimeType instanceof CFIntJpaMimeTypeTable)) {
			tableMimeType = new CFIntJpaMimeTypeTable(this);
		}
		if (tableMinorVersion == null || !(tableMinorVersion instanceof CFIntJpaMinorVersionTable)) {
			tableMinorVersion = new CFIntJpaMinorVersionTable(this);
		}
		if (tableSubProject == null || !(tableSubProject instanceof CFIntJpaSubProjectTable)) {
			tableSubProject = new CFIntJpaSubProjectTable(this);
		}
		if (tableTld == null || !(tableTld instanceof CFIntJpaTldTable)) {
			tableTld = new CFIntJpaTldTable(this);
		}
		if (tableTopDomain == null || !(tableTopDomain instanceof CFIntJpaTopDomainTable)) {
			tableTopDomain = new CFIntJpaTopDomainTable(this);
		}
		if (tableTopProject == null || !(tableTopProject instanceof CFIntJpaTopProjectTable)) {
			tableTopProject = new CFIntJpaTopProjectTable(this);
		}
		if (tableURLProtocol == null || !(tableURLProtocol instanceof CFIntJpaURLProtocolTable)) {
			tableURLProtocol = new CFIntJpaURLProtocolTable(this);
		}
	}

	@Override		
	public ICFSecSchema getCFSecSchema() {
		return( ICFSecSchema.getBackingCFSec() );
	}

	@Override
	public void setCFSecSchema(ICFSecSchema schema) {
		ICFSecSchema.setBackingCFSec(schema);
		schema.wireRecConstructors();
	}

	@Override		
	public ICFIntSchema getCFIntSchema() {
		return( ICFIntSchema.getBackingCFInt() );
	}

	@Override
	public void setCFIntSchema(ICFIntSchema schema) {
		ICFIntSchema.setBackingCFInt(schema);
		schema.wireRecConstructors();
	}

	public static CFIntJpaHooksSchema getJpaHooksSchema() {
		return( cfintJpaHooksSchema );
	}

	public static void setJpaHooksSchema(CFIntJpaHooksSchema jpaHooksSchema) {
		cfintJpaHooksSchema = jpaHooksSchema;
	}

	@Override
	public ICFSecFactory getCFSecFactory() {
		ICFSecSchema sch = ICFSecSchema.getBackingCFSec();
		if (sch == null) {
			return null;
		}
		else {
			return(sch.getCFSecFactory());
		}
	}
	
	@Override
	public CFSecBuffFactoryService getCFSecBuffFactory() {
		return(CFSecBuffSchema.getBuffHooksSchema().getFactoryService());
	}

	@Override
	public ICFIntFactory getCFIntFactory() {
		return(CFIntJpaSchema.getJpaHooksSchema().getFactoryService());
	}

	@Override
	public CFIntBuffFactoryService getCFIntBuffFactory() {
		return((CFIntBuffFactoryService)(CFIntBuffSchema.getBuffHooksSchema().getFactoryService()));
	}

	public CFIntJpaSchemaService getSchemaService() {
		return( CFIntJpaSchema.getJpaHooksSchema().getSchemaService() );
	}

	public CFIntJpaSchema() {

		tableCluster = null;
		tableISOCcy = null;
		tableISOCtry = null;
		tableISOCtryCcy = null;
		tableISOCtryLang = null;
		tableISOLang = null;
		tableISOTZone = null;
		tableLicense = null;
		tableMajorVersion = null;
		tableMimeType = null;
		tableMinorVersion = null;
		tableSecClusGrp = null;
		tableSecClusGrpMemb = null;
		tableSecClusRole = null;
		tableSecClusRoleMemb = null;
		tableSecSession = null;
		tableSecSysGrp = null;
		tableSecSysGrpInc = null;
		tableSecSysGrpMemb = null;
		tableSecSysRole = null;
		tableSecSysRoleEnables = null;
		tableSecSysRoleMemb = null;
		tableSecTentGrp = null;
		tableSecTentGrpMemb = null;
		tableSecTentRole = null;
		tableSecTentRoleMemb = null;
		tableSecUser = null;
		tableSecUserEMConf = null;
		tableSecUserPWHistory = null;
		tableSecUserPWReset = null;
		tableSecUserPassword = null;
		tableSubProject = null;
		tableSysCluster = null;
		tableTableInfo = null;
		tableTenant = null;
		tableTld = null;
		tableTopDomain = null;
		tableTopProject = null;
		tableURLProtocol = null;
	}

	@Override
	public ICFIntSchema newSchema() {
		throw new CFLibMustOverrideException( getClass(), "newSchema" );
	}

	@Override
	public short nextISOCcyIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextISOCcyIdGen" );
	}

	@Override
	public short nextISOCtryIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextISOCtryIdGen" );
	}

	@Override
	public short nextISOLangIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextISOLangIdGen" );
	}

	@Override
	public short nextISOTZoneIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextISOTZoneIdGen" );
	}

	@Override
	public int nextTableInfoIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextTableInfoIdGen" );
	}

	@Override
	public int nextMimeTypeIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextMimeTypeIdGen" );
	}

	@Override
	public int nextURLProtocolIdGen() {
		throw new CFLibNotImplementedYetException( getClass(), "nextURLProtocolIdGen" );
	}

	@Override
	public CFLibDbKeyHash256 nextClusterIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecSessionIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecUserIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextTenantIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecSysGrpIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecClusGrpIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecClusRoleIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecTentGrpIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSecTentRoleIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextMajorVersionIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextMinorVersionIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextSubProjectIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextTldIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextTopDomainIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextTopProjectIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	@Override
	public CFLibDbKeyHash256 nextLicenseIdGen() {
		CFLibDbKeyHash256 retval = new CFLibDbKeyHash256(0);
		return( retval );
	}

	public ICFSecClusterTable getTableCluster() {
		return( tableCluster );
	}

	public void setTableCluster( ICFSecClusterTable value ) {
		tableCluster = value;
	}

	public ICFSecISOCcyTable getTableISOCcy() {
		return( tableISOCcy );
	}

	public void setTableISOCcy( ICFSecISOCcyTable value ) {
		tableISOCcy = value;
	}

	public ICFSecISOCtryTable getTableISOCtry() {
		return( tableISOCtry );
	}

	public void setTableISOCtry( ICFSecISOCtryTable value ) {
		tableISOCtry = value;
	}

	public ICFSecISOCtryCcyTable getTableISOCtryCcy() {
		return( tableISOCtryCcy );
	}

	public void setTableISOCtryCcy( ICFSecISOCtryCcyTable value ) {
		tableISOCtryCcy = value;
	}

	public ICFSecISOCtryLangTable getTableISOCtryLang() {
		return( tableISOCtryLang );
	}

	public void setTableISOCtryLang( ICFSecISOCtryLangTable value ) {
		tableISOCtryLang = value;
	}

	public ICFSecISOLangTable getTableISOLang() {
		return( tableISOLang );
	}

	public void setTableISOLang( ICFSecISOLangTable value ) {
		tableISOLang = value;
	}

	public ICFSecISOTZoneTable getTableISOTZone() {
		return( tableISOTZone );
	}

	public void setTableISOTZone( ICFSecISOTZoneTable value ) {
		tableISOTZone = value;
	}

	public ICFIntLicenseTable getTableLicense() {
		return( tableLicense );
	}

	public void setTableLicense( ICFIntLicenseTable value ) {
		tableLicense = value;
	}

	public ICFIntMajorVersionTable getTableMajorVersion() {
		return( tableMajorVersion );
	}

	public void setTableMajorVersion( ICFIntMajorVersionTable value ) {
		tableMajorVersion = value;
	}

	public ICFIntMimeTypeTable getTableMimeType() {
		return( tableMimeType );
	}

	public void setTableMimeType( ICFIntMimeTypeTable value ) {
		tableMimeType = value;
	}

	public ICFIntMinorVersionTable getTableMinorVersion() {
		return( tableMinorVersion );
	}

	public void setTableMinorVersion( ICFIntMinorVersionTable value ) {
		tableMinorVersion = value;
	}

	public ICFSecSecClusGrpTable getTableSecClusGrp() {
		return( tableSecClusGrp );
	}

	public void setTableSecClusGrp( ICFSecSecClusGrpTable value ) {
		tableSecClusGrp = value;
	}

	public ICFSecSecClusGrpMembTable getTableSecClusGrpMemb() {
		return( tableSecClusGrpMemb );
	}

	public void setTableSecClusGrpMemb( ICFSecSecClusGrpMembTable value ) {
		tableSecClusGrpMemb = value;
	}

	public ICFSecSecClusRoleTable getTableSecClusRole() {
		return( tableSecClusRole );
	}

	public void setTableSecClusRole( ICFSecSecClusRoleTable value ) {
		tableSecClusRole = value;
	}

	public ICFSecSecClusRoleMembTable getTableSecClusRoleMemb() {
		return( tableSecClusRoleMemb );
	}

	public void setTableSecClusRoleMemb( ICFSecSecClusRoleMembTable value ) {
		tableSecClusRoleMemb = value;
	}

	public ICFSecSecSessionTable getTableSecSession() {
		return( tableSecSession );
	}

	public void setTableSecSession( ICFSecSecSessionTable value ) {
		tableSecSession = value;
	}

	public ICFSecSecSysGrpTable getTableSecSysGrp() {
		return( tableSecSysGrp );
	}

	public void setTableSecSysGrp( ICFSecSecSysGrpTable value ) {
		tableSecSysGrp = value;
	}

	public ICFSecSecSysGrpIncTable getTableSecSysGrpInc() {
		return( tableSecSysGrpInc );
	}

	public void setTableSecSysGrpInc( ICFSecSecSysGrpIncTable value ) {
		tableSecSysGrpInc = value;
	}

	public ICFSecSecSysGrpMembTable getTableSecSysGrpMemb() {
		return( tableSecSysGrpMemb );
	}

	public void setTableSecSysGrpMemb( ICFSecSecSysGrpMembTable value ) {
		tableSecSysGrpMemb = value;
	}

	public ICFSecSecSysRoleTable getTableSecSysRole() {
		return( tableSecSysRole );
	}

	public void setTableSecSysRole( ICFSecSecSysRoleTable value ) {
		tableSecSysRole = value;
	}

	public ICFSecSecSysRoleEnablesTable getTableSecSysRoleEnables() {
		return( tableSecSysRoleEnables );
	}

	public void setTableSecSysRoleEnables( ICFSecSecSysRoleEnablesTable value ) {
		tableSecSysRoleEnables = value;
	}

	public ICFSecSecSysRoleMembTable getTableSecSysRoleMemb() {
		return( tableSecSysRoleMemb );
	}

	public void setTableSecSysRoleMemb( ICFSecSecSysRoleMembTable value ) {
		tableSecSysRoleMemb = value;
	}

	public ICFSecSecTentGrpTable getTableSecTentGrp() {
		return( tableSecTentGrp );
	}

	public void setTableSecTentGrp( ICFSecSecTentGrpTable value ) {
		tableSecTentGrp = value;
	}

	public ICFSecSecTentGrpMembTable getTableSecTentGrpMemb() {
		return( tableSecTentGrpMemb );
	}

	public void setTableSecTentGrpMemb( ICFSecSecTentGrpMembTable value ) {
		tableSecTentGrpMemb = value;
	}

	public ICFSecSecTentRoleTable getTableSecTentRole() {
		return( tableSecTentRole );
	}

	public void setTableSecTentRole( ICFSecSecTentRoleTable value ) {
		tableSecTentRole = value;
	}

	public ICFSecSecTentRoleMembTable getTableSecTentRoleMemb() {
		return( tableSecTentRoleMemb );
	}

	public void setTableSecTentRoleMemb( ICFSecSecTentRoleMembTable value ) {
		tableSecTentRoleMemb = value;
	}

	public ICFSecSecUserTable getTableSecUser() {
		return( tableSecUser );
	}

	public void setTableSecUser( ICFSecSecUserTable value ) {
		tableSecUser = value;
	}

	public ICFSecSecUserEMConfTable getTableSecUserEMConf() {
		return( tableSecUserEMConf );
	}

	public void setTableSecUserEMConf( ICFSecSecUserEMConfTable value ) {
		tableSecUserEMConf = value;
	}

	public ICFSecSecUserPWHistoryTable getTableSecUserPWHistory() {
		return( tableSecUserPWHistory );
	}

	public void setTableSecUserPWHistory( ICFSecSecUserPWHistoryTable value ) {
		tableSecUserPWHistory = value;
	}

	public ICFSecSecUserPWResetTable getTableSecUserPWReset() {
		return( tableSecUserPWReset );
	}

	public void setTableSecUserPWReset( ICFSecSecUserPWResetTable value ) {
		tableSecUserPWReset = value;
	}

	public ICFSecSecUserPasswordTable getTableSecUserPassword() {
		return( tableSecUserPassword );
	}

	public void setTableSecUserPassword( ICFSecSecUserPasswordTable value ) {
		tableSecUserPassword = value;
	}

	public ICFIntSubProjectTable getTableSubProject() {
		return( tableSubProject );
	}

	public void setTableSubProject( ICFIntSubProjectTable value ) {
		tableSubProject = value;
	}

	public ICFSecSysClusterTable getTableSysCluster() {
		return( tableSysCluster );
	}

	public void setTableSysCluster( ICFSecSysClusterTable value ) {
		tableSysCluster = value;
	}

	public ICFSecTableInfoTable getTableTableInfo() {
		return( tableTableInfo );
	}

	public void setTableTableInfo( ICFSecTableInfoTable value ) {
		tableTableInfo = value;
	}

	public ICFSecTenantTable getTableTenant() {
		return( tableTenant );
	}

	public void setTableTenant( ICFSecTenantTable value ) {
		tableTenant = value;
	}

	public ICFIntTldTable getTableTld() {
		return( tableTld );
	}

	public void setTableTld( ICFIntTldTable value ) {
		tableTld = value;
	}

	public ICFIntTopDomainTable getTableTopDomain() {
		return( tableTopDomain );
	}

	public void setTableTopDomain( ICFIntTopDomainTable value ) {
		tableTopDomain = value;
	}

	public ICFIntTopProjectTable getTableTopProject() {
		return( tableTopProject );
	}

	public void setTableTopProject( ICFIntTopProjectTable value ) {
		tableTopProject = value;
	}

	public ICFIntURLProtocolTable getTableURLProtocol() {
		return( tableURLProtocol );
	}

	public void setTableURLProtocol( ICFIntURLProtocolTable value ) {
		tableURLProtocol = value;
	}

	public void bootstrapSchema(CFSecPubTableData tableData[]) {
		ICFSecSchema.getBackingCFSec().bootstrapSchema(tableData);
	}

	public void bootstrapAllTablesSecurity(CFLibDbKeyHash256 clusterId, CFLibDbKeyHash256 tenantId, CFSecPubTableData tableData[]) {
		ICFSecSchema.getBackingCFSec().bootstrapAllTablesSecurity(clusterId, tenantId, tableData);
	}
}
