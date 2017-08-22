/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * An system ticket. System tickets are created to reports bugs, errors
 * or idiosyncracies in the data, basically anything that the system does
 * that does not appear to be correct. They can be produced by normal users,
 * but the system itself can also produce tickets if it's operations are
 * impacted in some way. Tickets work on a straight Submit, 
 * Work, Commit cycle. A ticket is generated with a reference to an 
 * exemplar object that is being discussed and a description of the particular
 * issue. One of the recipients takes the take as a work item, investigating
 * fully until a solution is found. That solution is then presented to the 
 * initiating Actor, which is then allowed to either accept the solution, or
 * request an escalation of the ticket's status. The ticket is considered to
 * have been finished when the initiator accepts the ticket solution, though
 * a follow-up can be specified to make sure the entire problem was dealt 
 * with. 
 * @author odin
 */
public class Ticket extends Message {
    
}
