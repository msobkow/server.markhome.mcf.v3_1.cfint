
// Description: Java 25 Factory service implementation for License JPA objects

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

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.jpa.*;

/*
 *	Java 25 Factory service implementation for License JPA objects.
 */
public class CFIntJpaLicenseFactoryService
    implements ICFIntLicenseFactory
{
    public CFIntJpaLicenseFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntLicenseHPKey newHPKey() {
        ICFIntLicenseHPKey hpkey = new CFIntJpaLicenseHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicenseHPKey ensureHPKey(ICFIntLicenseHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntJpaLicenseHPKey) {
			return( (CFIntJpaLicenseHPKey)key );
		}
		else {
			CFIntJpaLicenseHPKey mapped = new CFIntJpaLicenseHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntLicenseByLicnTenantIdxKey newByLicnTenantIdxKey() {
		ICFIntLicenseByLicnTenantIdxKey key = new CFIntJpaLicenseByLicnTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicenseByLicnTenantIdxKey ensureByLicnTenantIdxKey(ICFIntLicenseByLicnTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaLicenseByLicnTenantIdxKey) {
			return( (CFIntJpaLicenseByLicnTenantIdxKey)key );
		}
		else {
			CFIntJpaLicenseByLicnTenantIdxKey mapped = new CFIntJpaLicenseByLicnTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntLicenseByDomainIdxKey newByDomainIdxKey() {
		ICFIntLicenseByDomainIdxKey key = new CFIntJpaLicenseByDomainIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicenseByDomainIdxKey ensureByDomainIdxKey(ICFIntLicenseByDomainIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaLicenseByDomainIdxKey) {
			return( (CFIntJpaLicenseByDomainIdxKey)key );
		}
		else {
			CFIntJpaLicenseByDomainIdxKey mapped = new CFIntJpaLicenseByDomainIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntLicenseByUNameIdxKey newByUNameIdxKey() {
		ICFIntLicenseByUNameIdxKey key = new CFIntJpaLicenseByUNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicenseByUNameIdxKey ensureByUNameIdxKey(ICFIntLicenseByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaLicenseByUNameIdxKey) {
			return( (CFIntJpaLicenseByUNameIdxKey)key );
		}
		else {
			CFIntJpaLicenseByUNameIdxKey mapped = new CFIntJpaLicenseByUNameIdxKey();
			mapped.setRequiredTopDomainId( key.getRequiredTopDomainId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntLicense newRec() {
        ICFIntLicense rec = new CFIntJpaLicense();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicense ensureRec(ICFIntLicense rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntJpaLicense) {
			return( (CFIntJpaLicense)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ICFIntLicense.CLASS_CODE: {
					CFIntJpaLicense mapped = new CFIntJpaLicense();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntLicense",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntLicense");
			}
		}
	}

    @Override
    public ICFIntLicenseH newHRec() {
        ICFIntLicenseH hrec = new CFIntJpaLicenseH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaLicenseH ensureHRec(ICFIntLicenseH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntJpaLicenseH) {
			return( (CFIntJpaLicenseH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ICFIntLicense.CLASS_CODE: {
					CFIntJpaLicenseH mapped = new CFIntJpaLicenseH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntLicense",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntLicense");
			}
		}
	}
}
