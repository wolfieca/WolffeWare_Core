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

import java.util.Dictionary;

/**
 * A description of an objects capabilities. Primarily useful for User objects,
 * which are the primary active entities in the system.
 * @author odin
 */


public class Capabilities {
    private boolean Impersonate;
    private boolean CreateUsers;
    private boolean ModifyUsers;
    private boolean RegisterModules;
    private boolean Revoke;
    private boolean CreateCapabilities;
    private Dictionary<String,Boolean> CustomCapabilities;
    
    /**
     *
     * @param newVal
     */
    public void canImpersonate(boolean newVal){
        Impersonate = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void canCreateUsers(boolean newVal){
        CreateUsers = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void canModifyUsers(boolean newVal){
        ModifyUsers = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void canRegisterModules(boolean newVal){
        RegisterModules = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void canRevoke(boolean newVal){
        Revoke = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void canCreateCapabilities(boolean newVal){
        CreateCapabilities = newVal;
    }

    /**
     *
     * @param theCapability
     * @param theVal
     */
    public void addCustomCapability(String theCapability, boolean theVal){
        this.CustomCapabilities.put(theCapability, theVal);
    }

    /**
     *
     * @param theCapability
     * @return
     */
    public boolean removeCustomCapability(String theCapability){
        return this.CustomCapabilities.remove(theCapability);
    }

    /**
     *
     * @param theCapability
     * @param theVal
     */
    public void canDo(String theCapability, boolean theVal){
        this.CustomCapabilities.put(theCapability, theVal);
    }

    /**
     *
     * @return
     */
    public boolean canImpersonate(){
        return Impersonate;
    }

    /**
     *
     * @return
     */
    public boolean canCreateUsers(){
        return CreateUsers;
    }

    /**
     *
     * @return
     */
    public boolean canModifyUsers(){
        return ModifyUsers;
    }

    /**
     *
     * @return
     */
    public boolean canRegisterModules(){
        return RegisterModules;
    }

    /**
     *
     * @return
     */
    public boolean canRevoke(){
        return Revoke;
    }

    /**
     *
     * @return
     */
    public boolean canCreateCapabilities(){
        return CreateCapabilities;
    }

    /**
     *
     * @param theCapability
     * @return
     * @throws NullPointerException
     */
    public boolean canDo(String theCapability) throws NullPointerException{
        return this.CustomCapabilities.get(theCapability);
    }

    /**
     *
     * @param theCapability
     * @return
     * @throws NullPointerException
     */
    public boolean hasCustomCapability(String theCapability) throws 
            NullPointerException {
        return this.CustomCapabilities.get(theCapability);
    }
}
