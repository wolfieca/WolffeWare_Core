/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author rserrano
 */
public class PostingPriority {
    private Short priority;
    private Boolean splitFees;
    private Boolean chargeFees;
    private Boolean returnToClient;

    /**
     * @return the priority
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * @return the splitFees
     */
    public Boolean getSplitFees() {
        return splitFees;
    }

    /**
     * @return the chargeFees
     */
    public Boolean getChargeFees() {
        return chargeFees;
    }

    /**
     * @return the returnToClient
     */
    public Boolean getReturnToClient() {
        return returnToClient;
    }
    
}
