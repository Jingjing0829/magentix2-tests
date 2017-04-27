package communication;


import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.AgentsConnection;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Main {
    public static void main(String[] args) {
        DOMConfigurator.configure("configuration/loggin.xml");
        Logger logger = Logger.getLogger(Main.class);
        
        AgentsConnection.connect("localhost", 5672, "test", "guest", "guest", false);
        
        try {
            Sender senderAgent = new Sender(new AgentID("Sender"));
            Consumer consumerAgent = new Consumer(new AgentID("Consumer"));
            
            consumerAgent.start();
            senderAgent.start();
        } catch (Exception e) {
            
        }
    }
}
