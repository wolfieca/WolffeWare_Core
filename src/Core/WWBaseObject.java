/* 
 * Copyright (C) 2017 Robert Serrano <wolfieca.rs@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package Core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * WWBaseObject is the base of the entire hierarchy
 * @author odin
 */


public class WWBaseObject implements Securable, Serializable {
    private Actor caller;
    /**
     * The Global ID for this object. Useful for when all I have is the ID of
     * an object and am trying to retrieve that information from the system.
     */
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
    public boolean CanAccess(Actor requestor, int requestAccess){
        return ACL.requestAccess(requestor, requestAccess) != 0;
    }

    /**
     * Attempt to access the requested object with the specified access mode
     * @param requestor The requesting object
     * @param requestAccess The access requested
     * @return
     */
    @Override
    public boolean RequestAccess(Actor requestor, int requestAccess) 
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

    /**
     * Get the implied caller for this instance. The caller is the Actor that
     * is considered to be the requester for this instance of the object. The
     * default for this varies by context. It will generally be the Actor that
     * caused this object to be instantiated in the first place. For performance
     * reasons, though, we probably will not be just discarding objects as soon
     * as the current Actor is done with them, opening the possibility that the
     * caller will be changed subsequently.
     * @return
     */
    public Actor getCaller() {
        return caller;
    }

    /**
     *
     * @param caller
     */
    public void setCaller(Actor caller) {
        this.caller = caller;
    }

    /**
     *
     * @return
     */
    public long getObjStoreID() {
        return objStoreID;
    }

    /**
     *
     * @param objStoreID
     */
    public void setObjStoreID(long objStoreID) {
        this.objStoreID = objStoreID;
    }

    /**
     *
     * @return
     */
    public AccessControlList getACL() {
        return ACL;
    }

    /**
     *
     * @param ACL
     */
    public void setACL(AccessControlList ACL) {
        this.ACL = ACL;
    }

    /**
     *
     * @return
     */
    public ArrayList<WWBaseObject> getAccessors() {
        return accessors;
    }

    /**
     *
     * @param accessors
     */
    public void setAccessors(ArrayList<WWBaseObject> accessors) {
        this.accessors = accessors;
    }

    /**
     *
     * @return
     */
    public WWBaseObject getWriter() {
        return writer;
    }

    /**
     *
     * @param writer
     */
    public void setWriter(WWBaseObject writer) {
        this.writer = writer;
    }
    
    /**
     *
     * @param field
     * @param startPos
     * @param length
     * @return
     */
    public long getBits ( long field, int startPos, int length){
        return ( field & (2^length-1) << startPos) >> startPos;
    }

    /**
     *
     * @param field
     * @param startPos
     * @param length
     * @param value
     * @return
     */
    public long setBits ( long field, int startPos, int length, int value){
        if ( value > (2^length - 1) ) {
            return -1;
        }
        long iField = field & ~((2^length-1) << startPos);
        return iField | (value) << startPos;
    }
}