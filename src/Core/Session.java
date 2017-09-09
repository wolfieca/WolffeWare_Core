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

import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * A single user session. Classes use this to get information about the 
 * user requesting service. Instances of this object are created on user login 
 * and destroyed when the user logs off, or when the session is terminated.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class Session extends WWBaseObject {

    /**
     *
     * @return
     */
    public static Session create() {
        return new Session();
    }
    private Long id;
    private User owner;
    private Long ipAddress;
    private HashMap<Long, WWBaseObject> openObjects;
    private boolean active;
    private GregorianCalendar start;
    private GregorianCalendar end;
    private History activity;

    private Session() {
    }

    // Create a Session for the specified user with the specified IP address.

    /**
     *
     * @param owner
     * @param ipAddress
     */
    public Session(User owner, Long ipAddress) {
        this.owner = owner;
        this.ipAddress = ipAddress;
        this.openObjects = new HashMap();
        this.active = true;
        this.start = new GregorianCalendar();
        this.end = null;
        this.activity = new History();
    }
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * @return the ipAddress
     */
    public Long getIpAddress() {
        return ipAddress;
    }

    /**
     * @return the openObjects
     */
    public HashMap<Long, WWBaseObject> getOpenObjects() {
        return openObjects;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @return the startDate
     */
    public GregorianCalendar getStart() {
        return start;
    }

    /**
     * @return the endDate
     */
    public GregorianCalendar getEnd() {
        return end;
    }


    /**
     * @return the activity
     */
    public History getActivity() {
        return activity;
    }

    /**
     * @param id the id to set
     */
    protected void setId(Long id) {
        this.id = id;
    }

    /**
     * @param owner the owner to set
     */
    protected void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    protected void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @param openObjects the openObjects to set
     */
    protected void setOpenObjects(HashMap<Long, WWBaseObject> openObjects) {
        this.openObjects = openObjects;
    }

    /**
     * @param active the active to set
     */
    protected void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @param start the start to set
     */
    protected void setStart(GregorianCalendar start) {
        this.start = start;
    }

    /**
     * @param end the end to set
     */
    protected void setEnd(GregorianCalendar end) {
        this.end = end;
    }

    /**
     * @param activity the activity to set
     */
    protected void setActivity(History activity) {
        this.activity = activity;
    }
}
