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
 * Actor is the base class for objects that are active in the system. That is,
 * objects that can take or requests actions. The primary Actors currently
 * are User and Group
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */


public class Actor extends WWBaseObject {
    private long id;    
    private Rights rights;

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

    /**
     * @return the rights
     */
    public Rights getRights() {
        return rights;
    }

    /**
     * @param rights the rights to set
     */
    protected void setRights(Rights rights) {
        this.rights = rights;
    }
    
}
