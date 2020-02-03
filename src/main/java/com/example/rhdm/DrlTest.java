package com.example.rhdm;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DrlTest {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // ファクト生成
        	過去利用状況 fact1 = new 過去利用状況();
        	fact1.setユーザID("A001");
        	fact1.set過去利用回数(4);
        	fact1.set過去利用額計(5000);
        	今回利用 fact2 = new 今回利用();
        	fact2.setユーザID("A001");

        	kSession.insert(fact1);
        	kSession.insert(fact2);
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
