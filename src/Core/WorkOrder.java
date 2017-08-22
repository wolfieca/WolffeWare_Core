/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * A WorkOrder is a message meant to start begin the processing of a job. A job
 * is characterized by having several sequential steps that have to be completed
 * and checked off. This message contains all the required steps, their current
 * statuses, the users assigned to complete them, the date each step should be 
 * completed by and the date that the WorkOrder needs to be completed by. As each
 * step is completed, the WorkOrder is updated and forwarded to the next person
 * in the chain.
 * @author odin
 */
public class WorkOrder extends Message {
    
}
