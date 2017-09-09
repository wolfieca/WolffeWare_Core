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

/**
 * Securable interface. The core of the security interface for the whole
 * system.
 * @author odin
 */



public interface Securable {

    /**
     * Check if specified access is allowable
     * @param requestor the requesting object
     * @param requestedAccess the access requested
     * @return true if the access is allowed, false otherwise
     */
    public boolean CanAccess(Actor requestor, int requestedAccess);

    /**
     * Grant the specified access to the requesting object
     * @param requestor the object requesting the access
     * @param requestedAccess the type of access being requested
     * @return true if the request has been honored, false, otherwise
     * @throws AccessDeniedException if the access is denied
     */
    public boolean RequestAccess(Actor requestor, int requestedAccess) throws AccessDeniedException;
    
    /**
     * Relinquish access to this object. To simplify resource management, all
     * current access to this object by the requestor are released at the same
     * time.
     * @param requestor the object requesting the released
     * @return true if access was released, false otherwise
     */
    public boolean ReleaseAccess(Actor requestor);
}
