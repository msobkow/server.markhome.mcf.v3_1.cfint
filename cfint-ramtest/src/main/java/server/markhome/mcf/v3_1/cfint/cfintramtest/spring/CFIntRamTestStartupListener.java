
// Description: Spring StartupListener for the RamTest program

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

package server.markhome.mcf.v3_1.cfint.cfintramtest.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;

import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfsec.cfsec.*;
import server.markhome.mcf.v3_1.cfint.cfint.*;
import server.markhome.mcf.v3_1.cfsec.cfsecram.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintram.*;

@Component
public class CFIntRamTestStartupListener {
    @Autowired
    // @Qualifier("TestCFSec")
    private CFSecRamTestTestSchema testCFSec;

    @Autowired
    // @Qualifier("TestCFInt")
    private CFIntRamTestTestSchema testCFInt;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        System.err.println("CFIntRamTest StartupListener tests beginning...");

		ICFSecSchema.getBackingCFSec().wireTableTableInstances();
		ICFIntSchema.getBackingCFInt().wireTableTableInstances();

		ICFIntSchema.getBackingCFInt().bootstrapSchema(ICFIntSchema.getConsolidatedTableData());

        System.err.println("Executing testCFSec.performTests()");
        try {
            String response = testCFSec.performTests(null);
            if (response != null) {
                System.err.println("CFSecRamTestTestSchema.performTests() responded: " + response);
            }
            else {
                System.err.println("CFSecRamTestTestSchema.performTests() did not return a response");
            }
        }
        catch (Throwable th) {
            System.err.println("testCFSec.performTests() threw " + th.getClass().getCanonicalName() + " - " + th.getMessage());
            th.printStackTrace(System.err);
        }

        System.err.println("Executing testCFInt.performTests()");
        try {
            String response = testCFInt.performTests(null);
            if (response != null) {
                System.err.println("CFIntRamTestTestSchema.performTests() responded: " + response);
            }
            else {
                System.err.println("CFIntRamTestTestSchema.performTests() did not return a response");
            }
        }
        catch (Throwable th) {
            System.err.println("testCFInt.performTests() threw " + th.getClass().getCanonicalName() + " - " + th.getMessage());
            th.printStackTrace(System.err);
        }

        System.err.println("CFIntRamTest StartupListener tests complete.");
    }
}
