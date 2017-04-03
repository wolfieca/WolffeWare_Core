/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * Thrown when a change is attempted on a locked object.
 * @author odin
 */
public class LockedItemException extends Exception {

    /**
     * Creates a new instance of <code>LockedItemException</code> without detail
     * message.
     */
    public LockedItemException() {
    }

    /**
     * Constructs an instance of <code>LockedItemException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LockedItemException(String msg) {
        super(msg);
    }
}
