/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifecycle;

import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.AgentsConnection;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Rafa
 */
public class Main {
    
    public static void main(String args[]) throws Exception {
        DOMConfigurator.configure("configuration/loggin.xml");
        Logger logger = Logger.getLogger(communication.Main.class);
        
        //Hay que crear una conexión con Qpid antes de crear agentes.
        AgentsConnection.connect("localhost", 5672, "test", "guest", "guest", false);
        
        Agent agent = new Agent(new AgentID("Agent 1"));
        
        agent.start();
    }
}
