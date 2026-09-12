// Description: Java 25 JavaFX Element TabPane implementation for SubProject.

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

package server.markhome.mcf.v3_1.cfint.cfintjavafx;

import java.math.*;
import java.time.*;
import java.text.*;
import java.util.*;
import java.util.List;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.inz.Inz;
import server.markhome.mcf.v3_1.cflib.javafx.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfsec.cfsecobj.*;
import server.markhome.mcf.v3_1.cfint.cfintobj.*;

/**
 *	CFIntJavaFXSubProjectEltTabPane JavaFX Element TabPane implementation
 *	for SubProject.
 */
public class CFIntJavaFXSubProjectEltTabPane
extends CFTabPane
implements ICFIntJavaFXSubProjectPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFIntJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsMajorVerList = "Optional Components Major Version";
	protected CFTab tabComponentsMajorVer = null;
	protected CFBorderPane tabViewComponentsMajorVerListPane = null;

	public CFIntJavaFXSubProjectEltTabPane( ICFFormManager formManager, ICFIntJavaFXSchema argSchema, ICFIntSubProjectObj argFocus ) {
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		setJavaFXFocusAsSubProject( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsMajorVer = new CFTab();
		tabComponentsMajorVer.setText( LABEL_TabComponentsMajorVerList );
		tabComponentsMajorVer.setContent( getTabViewComponentsMajorVerListPane() );
		getTabs().add( tabComponentsMajorVer );
		javafxIsInitializing = false;
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public ICFIntJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFIntSubProjectObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFIntSubProjectObj" );
		}
	}

	public void setJavaFXFocusAsSubProject( ICFIntSubProjectObj value ) {
		setJavaFXFocus( value );
	}

	public ICFIntSubProjectObj getJavaFXFocusAsSubProject() {
		return( (ICFIntSubProjectObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsMajorVerList
	implements ICFRefreshCallback
	{
		public RefreshComponentsMajorVerList() {
		}

		public void refreshMe() {
			Collection<ICFIntMajorVersionObj> dataCollection;
			ICFIntSubProjectObj focus = (ICFIntSubProjectObj)getJavaFXFocusAsSubProject();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsMajorVer( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsMajorVerListPane();
			ICFIntJavaFXMajorVersionPaneList jpList = (ICFIntJavaFXMajorVersionPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsMajorVerListPane() {
		if( tabViewComponentsMajorVerListPane == null ) {
			ICFIntSubProjectObj focus = (ICFIntSubProjectObj)getJavaFXFocusAsSubProject();
			Collection<ICFIntMajorVersionObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsMajorVer( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFIntSubProjectObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFIntSubProjectObj ) ) {
				javafxContainer = (ICFIntSubProjectObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsMajorVerListPane = javafxSchema.getMajorVersionFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsMajorVerList(), false );
		}
		return( tabViewComponentsMajorVerListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsMajorVerListPane != null ) {
			((ICFIntJavaFXMajorVersionPaneCommon)tabViewComponentsMajorVerListPane).setPaneMode( value );
		}
	}
}
