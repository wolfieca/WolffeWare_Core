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
 * AccessControlEntry is a single entry in an AccessControlList. Objects of this
 * class are responsible for maintaining the permissions and testing whether
 * a particular access is possible. AccessControlEntry objects are immutable. 
 * Once they're created, changes can only be made by creating a new 
 * AccessControlEntry object with the desired permissions.
 * @author odin
 */


public class AccessControlEntry {
    private Actor object;
    private Permission permissions;
    
    /**
     * Can this object claim the requested access?
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
