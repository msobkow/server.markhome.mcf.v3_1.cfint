
// Description: Java 25 Factory service implementation for Tld JPA objects

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
 *	Java 25 Factory service implementation for Tld JPA objects.
 */
public class CFIntJpaTldFactoryService
    implements ICFIntTldFactory
{
    public CFIntJpaTldFactoryService() { }

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntTldHPKey newHPKey() {
        ICFIntTldHPKey hpkey = new CFIntJpaTldHPKey();
        return( hpkey );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaTldHPKey ensureHPKey(ICFIntTldHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFIntJpaTldHPKey) {
			return( (CFIntJpaTldHPKey)key );
		}
		else {
			CFIntJpaTldHPKey mapped = new CFIntJpaTldHPKey();
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
    public ICFIntTldByTenantIdxKey newByTenantIdxKey() {
		ICFIntTldByTenantIdxKey key = new CFIntJpaTldByTenantIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaTldByTenantIdxKey ensureByTenantIdxKey(ICFIntTldByTenantIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaTldByTenantIdxKey) {
			return( (CFIntJpaTldByTenantIdxKey)key );
		}
		else {
			CFIntJpaTldByTenantIdxKey mapped = new CFIntJpaTldByTenantIdxKey();
			mapped.setRequiredTenantId( key.getRequiredTenantId() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntTldByNameIdxKey newByNameIdxKey() {
		ICFIntTldByNameIdxKey key = new CFIntJpaTldByNameIdxKey();
	return( key );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaTldByNameIdxKey ensureByNameIdxKey(ICFIntTldByNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFIntJpaTldByNameIdxKey) {
			return( (CFIntJpaTldByNameIdxKey)key );
		}
		else {
			CFIntJpaTldByNameIdxKey mapped = new CFIntJpaTldByNameIdxKey();
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
    public ICFIntTld newRec() {
        ICFIntTld rec = new CFIntJpaTld();
        return( rec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaTld ensureRec(ICFIntTld rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFIntJpaTld) {
			return( (CFIntJpaTld)rec );
		}
		else {
			switch(rec.getClassCode()) {
				case ICFIntTld.CLASS_CODE: {
					CFIntJpaTld mapped = new CFIntJpaTld();
					mapped.set(rec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureRec",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntTld",
						"Unsupported class code " + rec.getClassCode() + " is not a derivative of CFIntTld");
			}
		}
	}

    @Override
    public ICFIntTldH newHRec() {
        ICFIntTldH hrec = new CFIntJpaTldH();
        return( hrec );
    }

	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "cfint31TransactionManager")
	public CFIntJpaTldH ensureHRec(ICFIntTldH hrec) {
		if( hrec == null ) {
			return( null );
		}
		else if (hrec instanceof CFIntJpaTldH) {
			return( (CFIntJpaTldH)hrec );
		}
		else {
			switch(hrec.getClassCode()) {
				case ICFIntTld.CLASS_CODE: {
					CFIntJpaTldH mapped = new CFIntJpaTldH();
					mapped.set(hrec);
					return( mapped ); }
				default:
					throw new CFLibUnsupportedClassException(getClass(), "ensureHRec",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntTld",
						"Unsupported class code " + hrec.getClassCode() + " is not a derivative of CFIntTld");
			}
		}
	}
}
