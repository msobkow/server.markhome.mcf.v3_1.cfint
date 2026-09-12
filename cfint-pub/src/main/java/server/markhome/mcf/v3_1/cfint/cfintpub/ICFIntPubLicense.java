// Description: Java 25 public interface for a License record implementation

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

package server.markhome.mcf.v3_1.cfint.cfintpub;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
//import server.markhome.mcf.v3_1.cfint.cfintpub.*;

/**
 *	ICFIntPubLicense persistence instances have CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFIntPubLicense
{
	public static final String S_ID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 ID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_ID_INIT_VALUE );
	public static final String S_TENANTID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 TENANTID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_TENANTID_INIT_VALUE );
	public static final String S_TOPDOMAINID_INIT_VALUE = "0000000000000000000000000000000000000000000000000000000000000000";
	public static final CFLibDbKeyHash256 TOPDOMAINID_INIT_VALUE = CFLibDbKeyHash256.fromHex( S_TOPDOMAINID_INIT_VALUE );
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final String DESCRIPTION_INIT_VALUE = new String( "" );
	public static final String EMBEDDEDTEXT_INIT_VALUE = new String( "" );
	public static final String FULLTEXT_INIT_VALUE = new String( "" );
	public final static int CLASS_CODE = 0xa110;
	public final static String S_CLASS_CODE = "a110";

	public int getClassCode();

	public ICFLibKeyHash256 getPKey();
	public void setPKey(ICFLibKeyHash256 requiredId);
	public CFLibDbKeyHash256 getRequiredId();
	public void setRequiredId( CFLibDbKeyHash256 value );
	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public ICFSecPubTenant getRequiredOwnerTenant();

	public void setRequiredOwnerTenant(ICFLibKeyHash256 argTenantId);

	public ICFIntPubTopDomain getRequiredContainerTopDomain();

	public void setRequiredContainerTopDomain(ICFIntPubTopDomain argObj);
	public void setRequiredContainerTopDomain(ICFLibKeyHash256 argTopDomainId);

	public CFLibDbKeyHash256 getRequiredTenantId();
	public void setRequiredTenantId( CFLibDbKeyHash256 value );
	public CFLibDbKeyHash256 getRequiredTopDomainId();
	public void setRequiredTopDomainId( CFLibDbKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public String getOptionalEmbeddedText();
	public void setOptionalEmbeddedText( String value );
	public String getOptionalFullText();
	public void setOptionalFullText( String value );
	public boolean equals( Object obj );

	public int hashCode();

	public int compareTo( Object obj );

	public void set( ICFIntPubLicense src );

	public void setLicense( ICFIntPubLicense src );

	public void set( ICFIntPubLicenseH src );

	public void setLicense( ICFIntPubLicenseH src );

	public String getXmlAttrFragment();

	public String toString();
}
