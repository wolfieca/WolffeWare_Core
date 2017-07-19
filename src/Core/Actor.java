package Core;

/**
 * Actor is the base class for objects that are active in the system. That is,
 * objects that can take or requests actions. The primary Actors currently
 * are User and Group
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
