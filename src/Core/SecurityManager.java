package Core;

/**
 * Provides Security-related functionality to the system. SecurityManager
 * is the system-level security gatekeeper. It keeps all objects from taking
 * inappropriate actions. The Rights class allows individual parts of the 
 * system to allow or disallow access to various pieces of system functionality.
 * @author odin
 */


public class SecurityManager extends WWBaseObject {
    private User secContext;    // Current Security context
    private User effSecContext;

    /**
     *
     * @return
     */
    public User getSecContext() {
        return secContext;
    }

    /**
     *
     * @param secContext
     */
    public void setSecContext(User secContext) {
        this.secContext = secContext;
        this.effSecContext=secContext;
    }

    /**
     *
     * @return
     */
    public User getEffSecContext() {
        return effSecContext;
    }

    /**
     *
     * @param effSecContext
     */
    public void setEffSecContext(User effSecContext) {
        this.effSecContext = effSecContext;
    }
    
    /**
     *
     */
    public SecurityManager(){
        this.secContext=null;
        this.effSecContext=null;
    }

    /**
     *
     * @param securityContext
     */
    public SecurityManager(User securityContext){
        this.secContext = securityContext;
        this.effSecContext = securityContext;
    }
    
    /**
     *
     * @param impersona
     * @return
     */
    public int impersonate(User impersona) {
        if (impersona == null) 
            this.effSecContext = this.secContext;
        this.effSecContext = impersona;
        return 0;
    }
    
    /**
     *
     * @param theObject
     * @return
     */
    public int requestAccess(WWBaseObject theObject){
        return 0;
    }
}
