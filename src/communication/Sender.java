package communication;


import es.upv.dsic.gti_ia.core.ACLMessage;
import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.BaseAgent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Sender extends BaseAgent {
    
    public Sender(AgentID aid) throws Exception {
        super(aid);
    }
    
    public void init() {
        
    }
    
    public void execute() {
        System.out.println("Hola. Soy el agente " + this.getName() + " y comienzo"
                + " mi ejecución.");
        
        for (int i = 0; i < 10; i++) {
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.setSender(this.getAid());
            msg.setReceiver(new AgentID("Consumer"));
            msg.setContent("Hola. Soy el emisor.");
            this.send(msg);
        }
        
    }
    
    public void finalize() {
    
    }
    
}
