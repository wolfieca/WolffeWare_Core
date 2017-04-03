package Core;

/**
 * AccessControlEntry is a single entry in an AccessControlList. Objects of this
 * class are responsible for maintaining the permissions and testing whether
 * a particular access is possible;
 * @author odin
 */


public class AccessControlEntry {
    private Actor object;
    private Permission permissions;
    
    /**
     *
     * @param object
     * @param requested
     * @return
     */
    public boolean canAccess (Actor object, int requested){
        if ( object != this.object)
            return false;
        else
            return (permissions.checkAccess(requested) == requested);
    }
}
