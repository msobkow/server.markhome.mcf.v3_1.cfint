
// Description: Java 25 Factory service implementation for MajorVersion JPA objects

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
 *	Java 25 Factory service implementation for MajorVersion JPA objects.
 */
public class CFIntJpaMajorVersionFactoryService
    implements ICFIntMajorVersionFactory
{
    public CFIntJpaMajorVersionFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMajorVersionHPKey newHPKey() {
        ICFIntMajorVersionHPKey hpkey = new CFIntJpaMajorVersionHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersionHPKey ensureHPKey(ICFIntMajorVersionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntJpaMajorVersionHPKey) {
			return( (CFIntJpaMajorVersionHPKey)key );
		}
		else {
			CFIntJpaMajorVersionHPKey mapped = new CFIntJpaMajorVersionHPKey();
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
    public ICFIntMajorVersionByTenantIdxKey newByTenantIdxKey() {
		ICFIntMajorVersionByTenantIdxKey key = new CFIntJpaMajorVersionByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersionByTenantIdxKey ensureByTenantIdxKey(ICFIntMajorVersionByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMajorVersionByTenantIdxKey) {
			return( (CFIntJpaMajorVersionByTenantIdxKey)key );
		}
		else {
			CFIntJpaMajorVersionByTenantIdxKey mapped = new CFIntJpaMajorVersionByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMajorVersionBySubProjectIdxKey newBySubProjectIdxKey() {
		ICFIntMajorVersionBySubProjectIdxKey key = new CFIntJpaMajorVersionBySubProjectIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersionBySubProjectIdxKey ensureBySubProjectIdxKey(ICFIntMajorVersionBySubProjectIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMajorVersionBySubProjectIdxKey) {
			return( (CFIntJpaMajorVersionBySubProjectIdxKey)key );
		}
		else {
			CFIntJpaMajorVersionBySubProjectIdxKey mapped = new CFIntJpaMajorVersionBySubProjectIdxKey();
			mapped.setRequiredSubProjectId( key.getRequiredSubProjectId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMajorVersionByNameIdxKey newByNameIdxKey() {
		ICFIntMajorVersionByNameIdxKey key = new CFIntJpaMajorVersionByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersionByNameIdxKey ensureByNameIdxKey(ICFIntMajorVersionByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMajorVersionByNameIdxKey) {
			return( (CFIntJpaMajorVersionByNameIdxKey)key );
		}
		else {
			CFIntJpaMajorVersionByNameIdxKey mapped = new CFIntJpaMajorVersionByNameIdxKey();
			mapped.setRequiredSubProjectId( key.getRequiredSubProjectId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMajorVersion newRec() {
        ICFIntMajorVersion rec = new CFIntJpaMajorVersion();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersion ensureRec(ICFIntMajorVersion rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntJpaMajorVersion) {
			return( (CFIntJpaMajorVersion)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ICFIntMajorVersion.CLASS_CODE: {
					CFIntJpaMajorVersion mapped = new CFIntJpaMajorVersion();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntMajorVersion",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntMajorVersion");
			}
		}
	}

    @Override
    public ICFIntMajorVersionH newHRec() {
        ICFIntMajorVersionH hrec = new CFIntJpaMajorVersionH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMajorVersionH ensureHRec(ICFIntMajorVersionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntJpaMajorVersionH) {
			return( (CFIntJpaMajorVersionH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ICFIntMajorVersion.CLASS_CODE: {
					CFIntJpaMajorVersionH mapped = new CFIntJpaMajorVersionH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntMajorVersion",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntMajorVersion");
			}
		}
	}
}
