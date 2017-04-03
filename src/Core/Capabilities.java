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
