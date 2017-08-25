package Core;

/**
 * A security group. A group is like a user in many ways. A user can be a member
 * of one or more groups.
 * @author odin
 */


public class Group extends Actor {
    private String groupName;
    private String groupID;

    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @return the groupID
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * @param groupName the groupName to set
     */
    protected void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @param groupID the groupID to set
     */
    protected void setGroupID(String groupID) {
        this.groupID = groupID;
    }
    
    
}
