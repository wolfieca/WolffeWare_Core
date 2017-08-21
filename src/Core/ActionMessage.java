/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *  See the documentation for Message.
 * An action message is a message requesting a particular system service. It is
 * specifically intended for synchronous requests, where the caller needs the 
 * requested operation to be finished before it can continue processing. This 
 * means that ActionMessages can potentially drop the efficiency of the calling
 * user if they are used indiscriminately. The use of these messages is best
 * limited to those situations where the user needs to have a result before they
 * can continue.
 * @author odin
 */
public class ActionMessage extends Message{
    
}
