package communication;


import es.upv.dsic.gti_ia.core.ACLMessage;
import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.SingleAgent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Consumer extends SingleAgent {
    
    public Consumer(AgentID aid) throws Exception {
        super(aid);
    }
    
    @Override
    public void init() {
        
    }
    
    @Override
    public void execute() {
        System.out.println("Hola soy el agente " + this.getName() + " y comienzo"
                + " mi ejecución.");
        
        for (int i = 0; i < 10; i++) {
            ACLMessage msg = null;
            try {
                msg = this.receiveACLMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Soy el agente " + this.getName() + " y he recibido"
                    + " el mensaje: " + msg.getContent());
        }
    }
    
    public void onMessage(ACLMessage msg) {
        System.out.println("Mensaje recibido");
        super.onMessage(msg);
    }
    
    public void finalize() {
        
    }
}
