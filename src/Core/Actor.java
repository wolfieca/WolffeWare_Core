package Core;

/**
 *
 * @author odin
 */


public class Actor extends WWBaseObject {
    private long id;    

    /**
     *
     * @return
     */
    public long ID() {
        return this.id;
    }

    /**
     *
     */
    public Actor() {
    }

    /**
     *
     * @param id
     */
    public Actor(long id) {
        this.id = id;
    }
    
}
