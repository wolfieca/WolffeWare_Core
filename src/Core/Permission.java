package Core;

/**
 * Permission describes a set of permissions for an object.
 * Exact interpretation of the Permissions is up to the objects protected
 * by them.
 * @author odin
 */


public class Permission  extends WWBaseObject {
    private Permission inheritFrom;
    private boolean deny;
    private int permissions;
    
    static final int NONE = 0x00;
    static final int ALL = 0xff;
    static final int READ = 0x01;
    static final int WRITE = 0x02;
    static final int OWN = 0x04;
    static final int MODIFY = 0x08;
    static final int DELETE = 0x10;
    static final int EXECUTE = 0x20;
    static final int ALTER_PERMISSIONS = 0x40;
    static final int TAKE_OWNERSHIP = 0x80;
    static final int WRITE_ACCESS = WRITE+MODIFY+DELETE;

    /**
     * Constructor, creates a permission set with the specified permissions
     * @param deny
     * @param permissions
     * @throws InvalidPermissionCombinationException
     */
    public Permission(boolean deny, int permissions) throws 
            InvalidPermissionCombinationException {
        //if ( comparePermissions(allowPermissions,denyPermissions) != 0)
        //    throw new InvalidPermissionCombinationException();
        this.permissions = permissions;
        this.deny = deny;
        this.inheritFrom = null;
    }

    /**
     * Default constructor, allow all, deny none
     */
    public Permission() {
        this.permissions = ALL;
        this.deny = false;
        this.inheritFrom = null;
    }
    
    /**
     * Copy constructor, create a Permission object inheriting from the 
     * specified Permission object.
     * @param inherit the Permission object to inherit from
     */
    public Permission(Permission inherit){
        this.permissions = inherit.permissions;
        this.deny = inherit.deny;
        this.inheritFrom = inherit;
    }
    
    /**
     * Check to ensure the allowed and denies permissions don't overlap
     * @param tester
     * @param testee
     * @return 0 if allowed and denied permissions don't overlap
     */
    public final int comparePermissions( int tester, int testee) {
        return tester & testee;
    }

    /**
     * Checks if requestedPermissions are allowed
     * @param requestedPermissions the requested permissions
     * @return
     */
    public int checkAccess(int requestedPermissions){
        if ( this.deny ) 
            return ( ~permissions & requestedPermissions );
        else
            return (permissions) & requestedPermissions;
    }

    /**
     * Set the permissions on a pre-existing permission object
     * @param permissions
     * @return true on success
     * @throws InvalidPermissionCombinationException
     */
    public boolean setPermissions(int permissions)  
        throws InvalidPermissionCombinationException {
        //if ( comparePermissions(allowPermissions, denyPermissions) != 0 )
        //    throw new InvalidPermissionCombinationException();
        //else {
            this.permissions = permissions;
            return true;
        }
    

    /**
     * Modify the permission object to allow the requested permissions. Note 
     * that in deny permissions, allow is effectively reversed to mean deny
     * @param requestedPermissions the requested permissions
     */
    public void allow (int requestedPermissions) {
        this.permissions |= requestedPermissions;
    }

    /**
     * Modify the permission object to disallow the requested permissions.
     * Disallowing removes the permissions from the allowed list, but doesn't
     * deny the permission.
     * @param requestedPermissions
     */
    public void disallow(int requestedPermissions){
        this.permissions &= ~requestedPermissions;
    }

    /**
     * Modify a Permission object to deny the requested permissions.
     * @param requestedPermissions 
     */
    public void deny (int requestedPermissions) {
        
        //this.denyPermissions |= requestedPermissions;
        //this.allowPermissions &= ~requestedPermissions;
    }

    /**
     * Modify the Permission object to clear the requested permissions from both
     * the allowed and the denied lists.
     * @param requestedPermissions
     */
    public void unset (int requestedPermissions) {
        //this.denyPermissions &= ~requestedPermissions;
        //this.allowPermissions &= ~requestedPermissions;
    }
    
    /**
     * Updates this Permission to match the parent Permission object.
     * @throws NullPointerException
     */
    public void update() throws NullPointerException {
        //this.allowPermissions = this.inheritFrom.allowPermissions;
        //this.denyPermissions = this.inheritFrom.denyPermissions;
    }

    /**
     *
     * @return
     */
    public Permission getInheritFrom() {
        return inheritFrom;
    }

    /**
     *
     * @param inheritFrom
     */
    public void setInheritFrom(Permission inheritFrom) {
        this.inheritFrom = inheritFrom;
    }

    /**
     *
     * @return
     */
    public boolean isDeny() {
        return deny;
    }

    /**
     *
     * @param deny
     */
    public void setDeny(boolean deny) {
        this.deny = deny;
    }
    
}
