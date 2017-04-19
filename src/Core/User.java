package Core;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * A user on the system
 * @author odin
 */


public class User  extends Actor{
    private String userName;
    private String userID;
    private Group primaryGroup;
    private ArrayList<Group> supplementaryGroups;
    private Capabilities userCaps;
    private AccessControlList ACL;
    
    private boolean[] workHours;
    private boolean canWorkOffHours;
    private Dictionary<String, Boolean> moduleAccess;

    /**
     *
     * @param id
     */
    public User(long id) {
        super(id);
    }

    /**
     *
     * @param token
     */
    public User (String token){
        
    }

    /**
     *
     * @param userName
     * @param password
     */
    public User (String userName, String password){
        
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    protected void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    public String getUserID() {
        return userID;
    }

    /**
     *
     * @param userID
     */
    protected void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     *
     * @return
     */
    public Group getPrimaryGroup() {
        return primaryGroup;
    }

    /**
     *
     * @param primaryGroup
     */
    protected void setPrimaryGroup(Group primaryGroup) {
        this.primaryGroup = primaryGroup;
    }

    /**
     *
     * @return
     */
    public ArrayList<Group> getSupplementaryGroups() {
        return supplementaryGroups;
    }

    /**
     *
     * @param supplementaryGroups
     */
    protected void setSupplementaryGroups(ArrayList<Group> supplementaryGroups) {
        this.supplementaryGroups = supplementaryGroups;
    }

    /**
     *
     * @return
     */
    public Capabilities getUserCaps() {
        return userCaps;
    }

    /**
     *
     * @param userCaps
     */
    protected void setUserCaps(Capabilities userCaps) {
        this.userCaps = userCaps;
    }

//    /**
//     *
//     * @return
//     */
//    public AccessControlList getACL() {
//        return ACL;
//    }

//    /**
//     *
//     * @param ACL
//     */
//    protected void setACL(AccessControlList ACL) {
//        this.ACL = ACL;
//    }

    /**
     *
     * @return
     */
    public boolean[] getWorkHours() {
        return workHours;
    }

    /**
     *
     * @param workHours
     */
    protected void setWorkHours(boolean[] workHours) {
        this.workHours = workHours;
    }

    /**
     *
     * @return
     */
    public boolean isCanWorkOffHours() {
        return canWorkOffHours;
    }

    /**
     *
     * @param canWorkOffHours
     */
    protected void setCanWorkOffHours(boolean canWorkOffHours) {
        this.canWorkOffHours = canWorkOffHours;
    }

    /**
     *
     * @return
     */
    public Dictionary<String, Boolean> getModuleAccess() {
        return moduleAccess;
    }

    /**
     *
     * @param moduleAccess
     */
    protected void setModuleAccess(Dictionary<String, Boolean> moduleAccess) {
        this.moduleAccess = moduleAccess;
    }
    
    /**
     *
     * @return
     */
    public String UserName(){
        return this.userName;
    }

    /**
     *
     * @param username
     */
    protected void UserName(String username){
        this.userName = username;
    }

    /**
     *
     * @return
     */
    public String UserID(){
        return this.userID;
    }

    /**
     *
     * @param userid
     */
    protected void UserID(String userid){
        this.userID = userid;
    }

    /**
     *
     * @return
     */
    @Override
    public Group PrimaryGroup() {
        return this.primaryGroup;
    }

    /**
     *
     * @param primarygroup
     */
    protected void PrimaryGroup(Group primarygroup){
        this.primaryGroup = primarygroup;
    }

    /**
     *
     * @return
     */
    public ArrayList SupplementaryGroups(){
        return this.supplementaryGroups;
    }

    /**
     *
     * @param supplementarygroups
     */
    protected void SupplementaryGroups(ArrayList supplementarygroups){
        this.supplementaryGroups = supplementarygroups;
    }

    /**
     *
     * @return
     */
    public Capabilities UserCaps(){
        return this.userCaps;
    }

    /**
     *
     * @param usercaps
     */
    protected void UserCaps(Capabilities usercaps){
        this.userCaps = usercaps;
    }
    
    /**
     *
     * @return
     */
    public int loginUser(){
        return 0;
    }
    
    /**
     *
     * @return
     */
    public String genToken(){
        return "";
    }
    
    /**
     *
     * @param object
     * @param access
     * @return
     */
    public int request(WWBaseObject object, int access){
        return 0;
    }
    
    
}
