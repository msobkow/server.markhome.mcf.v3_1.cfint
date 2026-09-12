// Description: Java 25 protlic interface for a License history primary key object

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

package server.markhome.mcf.v3_1.cfint.cfintprot;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
import server.markhome.mcf.v3_1.cfsec.cfsecprot.*;
//import server.markhome.mcf.v3_1.cfint.cfintprot.*;

/**
 *	ICFIntProtLicenseHPKey Protected History Primary Key interface for License has CodeVis Public, meaning that any user interface or referencing schema can access it.
 *		requiredId	Required object attribute Id. */
public interface ICFIntProtLicenseHPKey
{

	public CFLibDbKeyHash256 getAuditClusterId();
	public void setAuditClusterId( CFLibDbKeyHash256 value );

	public LocalDateTime getAuditStamp();
	public void setAuditStamp( LocalDateTime value );

	public short getAuditActionId();
	public void setAuditActionId( short value );

	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public CFLibDbKeyHash256 getAuditSessionId();
	public void setAuditSessionId( CFLibDbKeyHash256 value );

	public ICFLibKeyHash256 getRequiredId();
	public void setRequiredId( ICFLibKeyHash256 value );
	@Override
	public boolean equals( Object obj );

	@Override
	public int hashCode();

	//@Override
	public int compareTo( Object obj );

	public String getXmlAttrFragment();

	@Override
	public String toString();
}
