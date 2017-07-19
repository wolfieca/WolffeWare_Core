/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * Message priorities. Determines message delivery speed.
 * @author rserrano
 */
public enum MessagePriority {

    /**
     *
     */
    EMERGENCY,  // Must be taken care of without delay. Interrupt if needed.

    /**
     *
     */
    IMMEDIATE,  // Must be taken care of immediately. Don't interrupt.

    /**
     *
     */
    HIGH,       // Should be taken care of ASAP.

    /**
     *
     */
    REGULAR,    // Take care of it when able (normal priority)

    /**
     *
     */
    REDUCED,    // No hurry. Take care of it when you have nothing else to do.

    /**
     *
     */
    LOW,        // Idle time, when nothing else needs attention, take care of it

    /**
     *
     */
    LOWEST      // Lowest priority. No time constraints, no immediacy.
}
