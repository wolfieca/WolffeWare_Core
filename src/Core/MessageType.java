/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * The types of messages available to the system.
 * @author rserrano
 */
public enum MessageType {
    MESSAGE,    // Generic message. Usually intra-user.
    ACTION,     // Synchronous request
    REQUEST,    // Asynchronous request
    SCHEDULE,   // Schedule a future message
    RESULT      // A result message
}
