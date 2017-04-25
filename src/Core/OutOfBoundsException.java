/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * Thrown when a number of out of bounds.
 * @author rserrano
 */
public class OutOfBoundsException extends Exception {

    /**
     * Creates a new instance of <code>OutOfBoundsException</code> without
     * detail message.
     */
    public OutOfBoundsException() {
    }

    /**
     * Constructs an instance of <code>OutOfBoundsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OutOfBoundsException(String msg) {
        super(msg);
    }
}
