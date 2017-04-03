/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author odin
 */
public class ActionProhibitedException extends Exception {

    /**
     * Creates a new instance of <code>ActionProhibitedException</code> without
     * detail message.
     */
    public ActionProhibitedException() {
    }

    /**
     * Constructs an instance of <code>ActionProhibitedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ActionProhibitedException(String msg) {
        super(msg);
    }
}
