package Core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * WWBaseObject is the base of the entire hierarchy
 * @author odin
 */


public class WWBaseObject implements Securable, Serializable {

    private long objStoreID;
    /**
     * The Access Control List for this object
     */
    private AccessControlList ACL;
    /**
     * List of objects that are currently accessing this object
     */
    private ArrayList<WWBaseObject> accessors;
    /**
     * Object (if any) that currently has write access to this object.
     */
    private WWBaseObject writer;
    /**
     * Tests whether specified access is allowed, without attempting to gain 
     * access to the object.
     * @param requestor
     * @param requestAccess
     * @return
     */
    @Override
    public boolean CanAccess(Actor requestor, short requestAccess){
        return ACL.requestAccess(requestor, requestAccess) != 0;
    }

    /**
     * Attempt to access the requested object with the specified access mode
     * @param requestor The requesting object
     * @param requestAccess The access requested
     * @return
     */
    @Override
    public boolean RequestAccess(Actor requestor, short requestAccess) 
        throws AccessDeniedException {
        if (ACL.requestAccess(requestor, requestAccess) != 0) {
            //Is write access being requested?
            if ( (requestAccess & Permission.WRITE_ACCESS) != 0x00 ) {
                if ( this.writer == null ) {
                    this.writer = requestor;
                    return true;
                } else 
                    return false;
            } else {
                this.accessors.add(requestor);
                return true;
            } 
        } else {
            throw new AccessDeniedException();
        }
    }

    @Override
    public boolean ReleaseAccess(Actor requestor) {
        // First, search through the accessors, to see if the requestor is present
        if ( accessors.contains(requestor)) {
            if ( (writer != null) && (writer == requestor) ){
                writer = null;
            }
            return accessors.remove(requestor);
        } else
            return false;
    }
    
    /**
     * Object's primary group. This is a placeholder method
     * NOTE: WWBaseObject does not have group memberships, so the group methods
     * (PrimaryGroup() and Groups() reflect that.
     * @return null
     */
    public Group PrimaryGroup(){
        return null;
    }
    /**
     * Groups the object is a member of. See note for PrimaryGroup() method.
     * @return
     */
    public ArrayList<Group> Groups (){
        return null; // WWBaseObject is not a member of any groups.
    }

    public long getObjStoreID() {
        return objStoreID;
    }

    public void setObjStoreID(long objStoreID) {
        this.objStoreID = objStoreID;
    }

    public AccessControlList getACL() {
        return ACL;
    }

    public void setACL(AccessControlList ACL) {
        this.ACL = ACL;
    }

    public ArrayList<WWBaseObject> getAccessors() {
        return accessors;
    }

    public void setAccessors(ArrayList<WWBaseObject> accessors) {
        this.accessors = accessors;
    }

    public WWBaseObject getWriter() {
        return writer;
    }

    public void setWriter(WWBaseObject writer) {
        this.writer = writer;
    }
    
    public long getBits ( long field, int startPos, int length){
        return ( field & (2^length-1) << startPos) >> startPos;
    }
    public long setBits ( long field, int startPos, int length, int value){
        if ( value > (2^length - 1) ) {
            return -1;
        }
        long iField = field & ~((2^length-1) << startPos);
        return iField | (value) << startPos;
    }
}