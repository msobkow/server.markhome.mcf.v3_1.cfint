
// Description: Java 25 Factory service implementation for License buffers

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

package server.markhome.mcf.v3_1.cfint.cfint.buff;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintprot.*;
import server.markhome.mcf.v3_1.cfint.cfintprotobj.*;
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfint.cfintobj.*;

/*
 *	Java 25 Factory service implementation for License buffers.
 */
@Service("cfint31BuffLicenseFactoryService")
public class CFIntBuffLicenseFactoryService
	implements ICFIntLicenseFactory
{
	public CFIntBuffLicenseFactoryService() {
	}

	@Override
	public ICFIntLicenseHPKey newHPKey() {
		ICFIntLicenseHPKey hpkey =
			new CFIntBuffLicenseHPKey();
		return( hpkey );
	}

	public CFIntBuffLicenseHPKey ensureHPKey(ICFIntLicenseHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntBuffLicenseHPKey) {
			return( (CFIntBuffLicenseHPKey)key );
		}
		else {
			CFIntBuffLicenseHPKey mapped = new CFIntBuffLicenseHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public ICFIntLicenseByLicnTenantIdxKey newByLicnTenantIdxKey() {
		ICFIntLicenseByLicnTenantIdxKey key =
			new CFIntBuffLicenseByLicnTenantIdxKey();
		return( key );
	}

	public CFIntBuffLicenseByLicnTenantIdxKey ensureByLicnTenantIdxKey(ICFIntLicenseByLicnTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntBuffLicenseByLicnTenantIdxKey) {
			return( (CFIntBuffLicenseByLicnTenantIdxKey)key );
		}
		else {
			CFIntBuffLicenseByLicnTenantIdxKey mapped = new CFIntBuffLicenseByLicnTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

	@Override
	public ICFIntLicenseByDomainIdxKey newByDomainIdxKey() {
		ICFIntLicenseByDomainIdxKey key =
			new CFIntBuffLicenseByDomainIdxKey();
		return( key );
	}

	public CFIntBuffLicenseByDomainIdxKey ensureByDomainIdxKey(ICFIntLicenseByDomainIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntBuffLicenseByDomainIdxKey) {
			return( (CFIntBuffLicenseByDomainIdxKey)key );
		}
		else {
			CFIntBuffLicenseByDomainIdxKey mapped = new CFIntBuffLicenseByDomainIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			return( mapped );
		}
	}

	@Override
	public ICFIntLicenseByUNameIdxKey newByUNameIdxKey() {
		ICFIntLicenseByUNameIdxKey key =
			new CFIntBuffLicenseByUNameIdxKey();
		return( key );
	}

	public CFIntBuffLicenseByUNameIdxKey ensureByUNameIdxKey(ICFIntLicenseByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntBuffLicenseByUNameIdxKey) {
			return( (CFIntBuffLicenseByUNameIdxKey)key );
		}
		else {
			CFIntBuffLicenseByUNameIdxKey mapped = new CFIntBuffLicenseByUNameIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ICFIntLicense newRec() {
		ICFIntLicense rec =
			new CFIntBuffLicense();
		return( rec );
	}

	public CFIntBuffLicense ensureRec(ICFIntLicense rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntBuffLicense) {
			return ((CFIntBuffLicense)rec);
		}
		else {	
			switch (rec.getClassCode()) {
				case ICFIntLicense.CLASS_CODE: {
					CFIntBuffLicense mapped = new CFIntBuffLicense();
					mapped.set(rec);
					return(mapped); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntLicense",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntLicense");
			}
		}
	}

	@Override
	public ICFIntLicenseH newHRec() {
		ICFIntLicenseH hrec =
			new CFIntBuffLicenseH();
		return( hrec );
	}

	public CFIntBuffLicenseH ensureHRec(ICFIntLicenseH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntBuffLicenseH) {
			return ((CFIntBuffLicenseH)hrec);
		}
		else {	
			switch (hrec.getClassCode()) {
				case ICFIntLicense.CLASS_CODE: {
					CFIntBuffLicenseH mapped = new CFIntBuffLicenseH();
					mapped.set(hrec);
					return(mapped); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntLicense",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntLicense");
			}
		}
	}
}
