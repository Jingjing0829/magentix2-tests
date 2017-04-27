/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifecycle;

import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.BaseAgent;

/**
 *
 * @author Rafa
 */
public class Agent extends BaseAgent {
    
    public Agent(AgentID aid) throws Exception {
        super(aid);
    }
    
    @Override
    public void init() {
        System.out.println(this.getName() + ": init");
    }
    
    @Override
    public void execute() {
        System.out.println(this.getName() + ": execute");
    }
    
    @Override
    public void finalize() {
        System.out.println(this.getName() + ": finalize");
    }
    
}
