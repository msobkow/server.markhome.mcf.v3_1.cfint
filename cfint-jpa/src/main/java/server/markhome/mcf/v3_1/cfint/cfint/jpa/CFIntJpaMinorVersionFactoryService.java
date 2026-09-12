
// Description: Java 25 Factory service implementation for MinorVersion JPA objects

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
 *	Java 25 Factory service implementation for MinorVersion JPA objects.
 */
public class CFIntJpaMinorVersionFactoryService
    implements ICFIntMinorVersionFactory
{
    public CFIntJpaMinorVersionFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMinorVersionHPKey newHPKey() {
        ICFIntMinorVersionHPKey hpkey = new CFIntJpaMinorVersionHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersionHPKey ensureHPKey(ICFIntMinorVersionHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntJpaMinorVersionHPKey) {
			return( (CFIntJpaMinorVersionHPKey)key );
		}
		else {
			CFIntJpaMinorVersionHPKey mapped = new CFIntJpaMinorVersionHPKey();
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
    public ICFIntMinorVersionByTenantIdxKey newByTenantIdxKey() {
		ICFIntMinorVersionByTenantIdxKey key = new CFIntJpaMinorVersionByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersionByTenantIdxKey ensureByTenantIdxKey(ICFIntMinorVersionByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMinorVersionByTenantIdxKey) {
			return( (CFIntJpaMinorVersionByTenantIdxKey)key );
		}
		else {
			CFIntJpaMinorVersionByTenantIdxKey mapped = new CFIntJpaMinorVersionByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMinorVersionByMajorVerIdxKey newByMajorVerIdxKey() {
		ICFIntMinorVersionByMajorVerIdxKey key = new CFIntJpaMinorVersionByMajorVerIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersionByMajorVerIdxKey ensureByMajorVerIdxKey(ICFIntMinorVersionByMajorVerIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMinorVersionByMajorVerIdxKey) {
			return( (CFIntJpaMinorVersionByMajorVerIdxKey)key );
		}
		else {
			CFIntJpaMinorVersionByMajorVerIdxKey mapped = new CFIntJpaMinorVersionByMajorVerIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMinorVersionByNameIdxKey newByNameIdxKey() {
		ICFIntMinorVersionByNameIdxKey key = new CFIntJpaMinorVersionByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersionByNameIdxKey ensureByNameIdxKey(ICFIntMinorVersionByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaMinorVersionByNameIdxKey) {
			return( (CFIntJpaMinorVersionByNameIdxKey)key );
		}
		else {
			CFIntJpaMinorVersionByNameIdxKey mapped = new CFIntJpaMinorVersionByNameIdxKey();
			mapped.setRequiredMajorVersionId( key.getRequiredMajorVersionId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntMinorVersion newRec() {
        ICFIntMinorVersion rec = new CFIntJpaMinorVersion();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersion ensureRec(ICFIntMinorVersion rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntJpaMinorVersion) {
			return( (CFIntJpaMinorVersion)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ICFIntMinorVersion.CLASS_CODE: {
					CFIntJpaMinorVersion mapped = new CFIntJpaMinorVersion();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntMinorVersion",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntMinorVersion");
			}
		}
	}

    @Override
    public ICFIntMinorVersionH newHRec() {
        ICFIntMinorVersionH hrec = new CFIntJpaMinorVersionH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaMinorVersionH ensureHRec(ICFIntMinorVersionH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntJpaMinorVersionH) {
			return( (CFIntJpaMinorVersionH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ICFIntMinorVersion.CLASS_CODE: {
					CFIntJpaMinorVersionH mapped = new CFIntJpaMinorVersionH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntMinorVersion",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntMinorVersion");
			}
		}
	}
}
