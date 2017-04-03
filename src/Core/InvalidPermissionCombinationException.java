package Core;

/**
 *
 * @author odin
 */


public class InvalidPermissionCombinationException extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidPermissionCombinationException</code> without detail
     * message.
     */
    public InvalidPermissionCombinationException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidPermissionCombinationException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidPermissionCombinationException(String msg) {
        super(msg);
    }
}
