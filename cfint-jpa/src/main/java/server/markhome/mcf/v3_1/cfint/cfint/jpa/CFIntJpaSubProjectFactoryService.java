
// Description: Java 25 Factory service implementation for SubProject JPA objects

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
 *	Java 25 Factory service implementation for SubProject JPA objects.
 */
public class CFIntJpaSubProjectFactoryService
    implements ICFIntSubProjectFactory
{
    public CFIntJpaSubProjectFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntSubProjectHPKey newHPKey() {
        ICFIntSubProjectHPKey hpkey = new CFIntJpaSubProjectHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProjectHPKey ensureHPKey(ICFIntSubProjectHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntJpaSubProjectHPKey) {
			return( (CFIntJpaSubProjectHPKey)key );
		}
		else {
			CFIntJpaSubProjectHPKey mapped = new CFIntJpaSubProjectHPKey();
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
    public ICFIntSubProjectByTenantIdxKey newByTenantIdxKey() {
		ICFIntSubProjectByTenantIdxKey key = new CFIntJpaSubProjectByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProjectByTenantIdxKey ensureByTenantIdxKey(ICFIntSubProjectByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaSubProjectByTenantIdxKey) {
			return( (CFIntJpaSubProjectByTenantIdxKey)key );
		}
		else {
			CFIntJpaSubProjectByTenantIdxKey mapped = new CFIntJpaSubProjectByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntSubProjectByTopProjectIdxKey newByTopProjectIdxKey() {
		ICFIntSubProjectByTopProjectIdxKey key = new CFIntJpaSubProjectByTopProjectIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProjectByTopProjectIdxKey ensureByTopProjectIdxKey(ICFIntSubProjectByTopProjectIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaSubProjectByTopProjectIdxKey) {
			return( (CFIntJpaSubProjectByTopProjectIdxKey)key );
		}
		else {
			CFIntJpaSubProjectByTopProjectIdxKey mapped = new CFIntJpaSubProjectByTopProjectIdxKey();
			mapped.setRequiredTopProjectId( key.getRequiredTopProjectId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntSubProjectByNameIdxKey newByNameIdxKey() {
		ICFIntSubProjectByNameIdxKey key = new CFIntJpaSubProjectByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProjectByNameIdxKey ensureByNameIdxKey(ICFIntSubProjectByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaSubProjectByNameIdxKey) {
			return( (CFIntJpaSubProjectByNameIdxKey)key );
		}
		else {
			CFIntJpaSubProjectByNameIdxKey mapped = new CFIntJpaSubProjectByNameIdxKey();
			mapped.setRequiredTopProjectId( key.getRequiredTopProjectId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntSubProject newRec() {
        ICFIntSubProject rec = new CFIntJpaSubProject();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProject ensureRec(ICFIntSubProject rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntJpaSubProject) {
			return( (CFIntJpaSubProject)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ICFIntSubProject.CLASS_CODE: {
					CFIntJpaSubProject mapped = new CFIntJpaSubProject();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntSubProject",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntSubProject");
			}
		}
	}

    @Override
    public ICFIntSubProjectH newHRec() {
        ICFIntSubProjectH hrec = new CFIntJpaSubProjectH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaSubProjectH ensureHRec(ICFIntSubProjectH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntJpaSubProjectH) {
			return( (CFIntJpaSubProjectH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ICFIntSubProject.CLASS_CODE: {
					CFIntJpaSubProjectH mapped = new CFIntJpaSubProjectH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntSubProject",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntSubProject");
			}
		}
	}
}
