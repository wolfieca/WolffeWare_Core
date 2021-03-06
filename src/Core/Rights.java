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

import java.util.HashMap;
import java.util.Map;

/**
 * The Rights class enumerates rights that an Actor is granted to the 
 * system and specified subsystems (run-time modules, for example). 
 * Note that Rights are a configuration specification mechanism, there is no
 * enforcement of the rights here. Enforcement is up to individual modules.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */


public class Rights extends WWBaseObject {
    private boolean localLogin;
    private boolean backup;
    private boolean remoteLogin;
    private boolean shutdown;
    private boolean monitor;
    private boolean grantAccess;
    private boolean revokeAccess;
    private boolean takeOwnership;
    private boolean startServices;
    private boolean stopServices;
    private boolean createUsers;
    private boolean deleteUsers;
    private boolean registerModules;
    private boolean unregisterModules;
    private boolean print;
    private boolean documentRequest;
    private boolean eventListener;
    private boolean reassignThreads;
    private boolean impersonateUser;
    private boolean viewPHI;
    private boolean updatePHI;
    private boolean addSupplementalCategory;
    private boolean deleteSupplementalCategory;
    private boolean alterSupplementalCategory;
    private Map<String,Boolean> rightSet;
    private Long rightSet1;
    private Long rightSet2;
    private Long rightSet3;
    private Long rightSet4;
    private final Map<String,Integer> loginHours;
    private final Map<String,Integer> rightNames;
    private int lastPosition;
     
    /**
     * Default constructor
     */
    public Rights (){
         // Initialize the rightNames
         //The default rightNames will not change order after release. 
         rightNames = new HashMap<>();
         
         //System rights
        this.localLogin=false;
        this.backup=false;
        this.remoteLogin=false;
        this.shutdown=false;
        this.monitor=false;
        this.grantAccess=false;
        this.revokeAccess=false;
        this.takeOwnership=false;
        this.startServices=false;
        this.stopServices=false;
        this.createUsers=false;
        this.deleteUsers=false;
        this.registerModules=false;
        this.unregisterModules=false;
        this.print=false;
        this.documentRequest=false;
        this.eventListener=false;
        this.reassignThreads=false;
        this.impersonateUser=false;
        this.viewPHI=false;
        this.updatePHI=false;
        this.addSupplementalCategory=false;
        this.deleteSupplementalCategory=false;
        this.alterSupplementalCategory=false;

         //Base Right Definitions should be constant
         
         //Rights Definitions for built-in objects
         rightSet = new HashMap();
         rightSet.put("Debtor.Merge", false);
         rightSet.put("Debtor.Split", false);
         rightSet.put("Debtor.Delete", false);
         rightSet.put("Debtor.PHI.Read", false);
         rightSet.put("Debtor.PHI.Write", false);
         rightSet.put("Debtor.Supp.Read", false);
         rightSet.put("Debtor.Supp.Write", false);
         rightSet.put("Debtor.Lookup.ByHistory", false);
         rightSet.put("Debtor.Lookup.ByQueue", false);
         rightSet.put("Debtor.Lookup.ByGeneral", false);
         rightSet.put("Debtor.Lookup.ByUnit", false);
         rightSet.put("Debtor.Lookup.Blitz", false);
         rightSet.put("Debtor.Lookup.ByTag", false);
         rightSet.put("Debtor.Access.LegalActions", false);
         rightSet.put("Debtor.Access.Precollect", false);
         rightSet.put("Debtor.Update.Telephone", false);
         rightSet.put("Debtor.Update.Collector",false);
         rightSet.put("Debtor.Update.MailReturn",false);
         rightSet.put("Debtor.Update.StrategyStatus", false);
         rightSet.put("Debtor.Update.StatusWithinType", false);
         rightSet.put("Debtor.Update.LettersLeft", false);
         rightSet.put("Debtor.Update.Indicators", false);
         rightSet.put("Debtor.Update.LegalScreen",false);
         rightSet.put("Debt.Read", false);
         rightSet.put("Debt.Write", false);
         rightSet.put("Debt.CRStatus.Write", false);
         rightSet.put("Debt.CRStatus.Read", false);
         rightSet.put("Debt.Update.OrigBalance", false);
         rightSet.put("Debt.Update.For", false);
         rightSet.put("Debt.Update.CliRef", false);
         rightSet.put("Debt.Update.SvcType", false);
         rightSet.put("Debt.Update.DLC", false);
         rightSet.put("Debt.Update.DLP", false);
         rightSet.put("Debt.Update.FeeSched", false);
         rightSet.put("Debt.Update.CredirBureauFields", false);
         rightSet.put("Debt.Update.ReturnStatus", false);
         rightSet.put("Debt.Update.Client", false);
         rightSet.put("Debt.Update.Comments", false);
         rightSet.put("Debt.Update.Tags", false);
         rightSet.put("Bank.Setup.Read", false);
         rightSet.put("Bank.Setup.Write", false);
         rightSet.put("Fee.Setup.Read", false);
         rightSet.put("Fee.Setup.Write", false);
         rightSet.put("Invoice.Setup.Read", false);
         rightSet.put("Invoice.Setup.Write", false);
         rightSet.put("Attorney.Setup.Read", false);
         rightSet.put("Attorney.Setup.Write", false);
         rightSet.put("Lead.Add", false);
         rightSet.put("Lead.Update", false);
         rightSet.put("Lead.Read", false);
         rightSet.put("LetterSeries.Read", false);
         rightSet.put("LetterSeries.Write", false);
         rightSet.put("Match.Setup.Read", false);
         rightSet.put("Match.Match.Setup.Write", false);
         rightSet.put("Misc.Read", false);
         rightSet.put("Misc.Write", false);
         rightSet.put("Newbiz.Read", false);
         rightSet.put("Newbiz.Write", false);
         rightSet.put("Newbiz.Add", false);
         rightSet.put("Newbiz.Update.AccountName", false);
         rightSet.put("Newbiz.Update.GeneralInformation", false);
         rightSet.put("Newbiz.Update.SkipTraceInfo", false);
         rightSet.put("Newbiz.Update.CrossReference", false);
         rightSet.put("Newbiz.Update.Historical", false);
         rightSet.put("Newbiz.Update.CollectorNotes", false);
         rightSet.put("Office.Setup.Read", false);
         rightSet.put("Office.Setup.Write", false);
         rightSet.put("Payments.Read", false);
         rightSet.put("Payments.Add", false);
         rightSet.put("Payments.Write", false);
         rightSet.put("Priority,Setup.Read", false);
         rightSet.put("Priority.Setup.Write", false);
         rightSet.put("Strategy.Planning.Read", false);
         rightSet.put("Strategy.Planning.Write", false);
         rightSet.put("User.Setup.Read", false);
         rightSet.put("User.Setup.Write", false);
         rightSet.put("User.ObserveUser", false);
         rightSet.put("User.AdviseUser", false);
         rightSet.put("User.MonitorUsers", false);
         rightSet.put("Supplemental.Category.Read", false);
         rightSet.put("Supplemental.Category.Write", false);
         rightSet.put("Misc.CollectorPaymentStats.Read", false);
         rightSet.put("Misc.ReverseUnmatchedPayments", false);
         rightSet.put("Misc.MultipleOfficeAcccess", false);
         rightSet.put("Misc.ElevatePrivilege", false);
         rightSet.put("Misc.SendAnnouncements", false);
         rightSet.put("Misc.SuperCollector", false);
         rightSet.put("Misc.TriggerEvents", false);
         rightSet.put("Misc.CreateNewTags", false);
         rightSet.put("Misc.InhibitAuditing", false);
         rightSet.put("Report.Run", false);
         rightSet.put("Queue.Merge", false);
         rightSet.put("Account.Reinstate", false);
        // rightNames.put("Debtor.Merge", lastPosition++);
        // rightNames.put("Debtor.Split", lastPosition++);
        // rightNames.put("Debtor.Delete", lastPosition++);
        // rightNames.put("Debtor.PHI.Read", lastPosition++);
        // rightNames.put("Debtor.PHI.Write", lastPosition++);
        // rightNames.put("Debtor.Supp.Read", lastPosition++);
        // rightNames.put("Debtor.Supp.Write", lastPosition++);
        // rightNames.put("Debtor.Lookup.ByHistory", lastPosition++);
        // rightNames.put("Debtor.Lookup.ByQueue", lastPosition++);
        // rightNames.put("Debtor.Lookup.ByGeneral", lastPosition++);
        // rightNames.put("Debtor.Lookup.ByUnit", lastPosition++);
        // rightNames.put("Debtor.Lookup.Blitz", lastPosition++);
        // rightNames.put("Debtor.Lookup.ByTag", lastPosition++);
        // rightNames.put("Debtor.Access.LegalActions", lastPosition++);
        // rightNames.put("Debtor.Access.Precollect", lastPosition++);
        // rightNames.put("Debtor.Update.Telephone", lastPosition++);
        // rightNames.put("Debtor.Update.Collector", lastPosition++);
        // rightNames.put("Debtor.Update.MailReturn", lastPosition++);
        // rightNames.put("Debtor.Update.StrategyStatus", lastPosition++);
        // rightNames.put("Debtor.Update.StatusWithinType", lastPosition++);
        // rightNames.put("Debtor.Update.LettersLeft", lastPosition++);
        // rightNames.put("Debtor.Update.Indicators", lastPosition++);
        // rightNames.put("Debtor.Update.LegalScreen", lastPosition++);
        // rightNames.put("Debt.Read", lastPosition++);
        // rightNames.put("Debt.Write", lastPosition++);
        // rightNames.put("Debt.CRStatus.Write", lastPosition++);
        // rightNames.put("Debt.CRStatus.Read", lastPosition++);
        // rightNames.put("Debt.Update.OrigBalance", lastPosition++);
        // rightNames.put("Debt.Update.For", lastPosition++);
        // rightNames.put("Debt.Update.CliRef", lastPosition++);
        // rightNames.put("Debt.Update.SvcType", lastPosition++);
        // rightNames.put("Debt.Update.DLC", lastPosition++);
        // rightNames.put("Debt.Update.DLP", lastPosition++);
        // rightNames.put("Debt.Update.FeeSched", lastPosition++);
        // rightNames.put("Debt.Update.CreditBureauFields", lastPosition++);
        // rightNames.put("Debt.Update.ReturnStatus", lastPosition++);
        // rightNames.put("Debt.Update.Client", lastPosition++);
        // rightNames.put("Debt.Update.Comments", lastPosition++);
        // rightNames.put("Debt.Update.Tags", lastPosition++);
        // rightNames.put("Bank.Setup.Read", lastPosition++);
        // rightNames.put("Bank.Setup.Write", lastPosition++);
        // rightNames.put("Client.Setup.Read", lastPosition++);
        // rightNames.put("Client.Setup.Write", lastPosition++);
        // rightNames.put("Fee.Setup.Read", lastPosition++);
        // rightNames.put("Fee.Setup.Write", lastPosition++);
        // rightNames.put("Invoice.Setup.Read", lastPosition++);
        // rightNames.put("Invoice.Setup.Write", lastPosition++);
        // rightNames.put("Attorney.Setup.Read", lastPosition++);
        // rightNames.put("Attorney.Setup.Write", lastPosition++);
        // rightNames.put("Lead.Add",lastPosition++);
        // rightNames.put("Lead.Update", lastPosition++);
        // rightNames.put("Lead.Read", lastPosition++);
        // rightNames.put("LetterSeries.Read", lastPosition++);
        // rightNames.put("LetterSeries.Write", lastPosition++);
        // rightNames.put("Match.Setup.Read", lastPosition++);
        // rightNames.put("Match.Setup.Write", lastPosition++);
        // rightNames.put("Misc.Read", lastPosition++);
        // rightNames.put("Misc.Write", lastPosition++);
        // rightNames.put("NewBiz.Read", lastPosition++);
        // rightNames.put("NewBiz.Add", lastPosition++);
        // rightNames.put("NewBiz.Write", lastPosition++);
        // rightNames.put("Newbiz.Update.AccountName", lastPosition++);
        // rightNames.put("Newbiz.Update.GeneralInformation", lastPosition++);
        // rightNames.put("Newbiz.update.SkipTraceInfo", lastPosition++);
        // rightNames.put("Newbiz.Update.CrossReference", lastPosition++);
        // rightNames.put("Newbiz.Update.Historical", lastPosition++);
        // rightNames.put("Newbiz.Update.CollectorNotes", lastPosition++);
        // rightNames.put("Office.Setup.Read", lastPosition++);
        // rightNames.put("Office.Setup.Write", lastPosition++);
        // rightNames.put("Payment.Read", lastPosition++);
        // rightNames.put("Payment.Add", lastPosition++);
        // rightNames.put("Payment.Write", lastPosition++);
        // rightNames.put("Priority.Setup.Read", lastPosition++);
        // rightNames.put("Priority.Setup.Write", lastPosition++);
        // rightNames.put("Strategy.Planning.Read", lastPosition++);
        // rightNames.put("Strategy.Planning.Write", lastPosition++);
        // rightNames.put("User.Setup.Read", lastPosition++);
        // rightNames.put("User.Setup.Write", lastPosition++);
        // rightNames.put("User.ObserveUser", lastPosition++);
        // rightNames.put("User.AdviseUser", lastPosition++);
        // rightNames.put("User.MonitorUsers", lastPosition++);
        // rightNames.put("Supplemental.Category.Read", lastPosition++);
        // rightNames.put("Supplemental.Category.Write", lastPosition++);
        // rightNames.put("Misc.CollectorPaymentStats.Read", lastPosition++);
        // rightNames.put("Misc.ReverseUnmatchedPayments", lastPosition++);
        // rightNames.put("Misc.MultipleOfficeAccess", lastPosition++);
        // rightNames.put("Misc.ElevatePrivilege", lastPosition++);
        // rightNames.put("Misc.SendAnnouncements", lastPosition++);
        // rightNames.put("Misc.SuperCollector", lastPosition++);
        // rightNames.put("Misc.TriggerEvents", lastPosition++);
        // rightNames.put("Misc.CreateNewTags", lastPosition++);
        // rightNames.put("Misc.InhibitAuditin", lastPosition++);
        // rightNames.put("Report.Run", lastPosition++);
        // rightNames.put("Queue.Merge", lastPosition++);
        // rightNames.put("Account.Reinstate", lastPosition++);

         lastPosition = rightNames.size();
         // The default is for rights to be denied by default.
         rightSet1 = new Long(0);
         rightSet2 = new Long(0);
         rightSet3 = new Long(0);
         rightSet4 = new Long(0);
         
         // loginHours by default are cleared (no hours allowed
         // loginHours defaults to having 24 members (ie one element for each
         // hour of the day).
         loginHours = new HashMap<>();
         loginHours.put("Sun", 0);
         loginHours.put("Mon", 0);
         loginHours.put("Tue", 0);
         loginHours.put("Wed", 0);
         loginHours.put("Thu", 0);
         loginHours.put("Fri", 0);
         loginHours.put("Sat", 0);
          //loginHours.clear();
     }
    
    /**
     * Copy Constructor
     * @param orig 
     */
    public Rights(Rights orig){
        this.rightSet1 = orig.rightSet1;
        this.rightSet2 = orig.rightSet2;
        this.rightSet3 = orig.rightSet3;
        this.rightSet4 = orig.rightSet4;
        this.lastPosition = orig.lastPosition;
        this.loginHours = orig.loginHours;
        this.rightNames = orig.rightNames;
    }

    /**
     *
     * @return
     */
    public Long getRightSet1() {
        return rightSet1;
    }

    /**
     *
     * @param rightSet1
     */
    protected void setRightSet1(Long rightSet1) {
        this.rightSet1 = rightSet1;
    }

    /**
     *
     * @return
     */
    public Long getRightSet2() {
        return rightSet2;
    }

    /**
     *
     * @param rightSet2
     */
    protected void setRightSet2(Long rightSet2) {
        this.rightSet2 = rightSet2;
    }

    /**
     *
     * @return
     */
    public Long getRightSet3() {
        return rightSet3;
    }

    /**
     *
     * @param rightSet3
     */
    protected void setRightSet3(Long rightSet3) {
        this.rightSet3 = rightSet3;
    }

    /**
     *
     * @return
     */
    public Long getRightSet4() {
        return rightSet4;
    }

    /**
     *
     * @param rightSet4
     */
    protected void setRightSet4(Long rightSet4) {
        this.rightSet4 = rightSet4;
    }

    /**
     *
     * @return
     */
    protected int getLastPosition() {
        return lastPosition;
    }

    /**
     *
     * @param lastPosition
     */
    protected void setLastPosition(int lastPosition) {
        this.lastPosition = lastPosition;
    }
    
    /**
     * Creates a new Right in the system
     * @param module
     * @param right
     * @return
     */
    public boolean addRight(String module, String right) {
         String rightName = module+"."+right;
         if ( rightNames.containsKey(rightName))
             return false;
         else {
             if ( rightNames.put(rightName, lastPosition) != null) {
                 lastPosition++;
                 return true;
             } else
                 return false;
         }
         //rightNames.put(rightName, rightNames.size()+1);
         //return true;
     }

    /**
     *
     * @param module
     * @param right
     * @param position
     * @return
     */
    public boolean addRight(String module, String right, int position){
         if ( rightNames.putIfAbsent(module+"."+right, position) == null){
             if ( lastPosition < position ) 
                lastPosition = position+1;
             return true;
         } else {
             return false;
         }
         //return rightNames.putIfAbsent(module+"."+right, position) != null;
     }

    /**
     *
     * @param module
     * @param right
     */
    public void allow(String module, String right){
         if ( rightNames.get(module+"."+right) != null ){
             if(rightNames.get(module+"."+right) <= 63)
                rightSet1 |= 1 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 127)
                 rightSet2 |= 1 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 191)
                 rightSet3 |= 1 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 255)
                 rightSet4 |= 1 << (rightNames.get(module+"."+right));
         }
     }

    /**
     *
     * @param module
     * @param right
     */
    public void deny(String module, String right){
         if ( rightNames.get(module+"."+right) != null ){
             if(rightNames.get(module+"."+right) <= 63)
                rightSet1 &= 0 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 127)
                 rightSet2 &= 0 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 191)
                 rightSet3 &= 0 << (rightNames.get(module+"."+right));
             else if (rightNames.get(module+"."+right) <= 255)
                 rightSet4 &= 0 << (rightNames.get(module+"."+right));
         }
     }

    /**
     *
     * @param module
     * @param right
     * @return
     * @throws OutOfBoundsException
     */
    public long getRights(String module, String right) throws OutOfBoundsException{
        if ( rightNames.get(module+"."+right) != null ) {
            if(rightNames.get(module+"."+right)<=63)
                return rightSet1 & (1<<rightNames.get(module+"."+right));
            else if (rightNames.get(module+"."+right)<=127)
                return rightSet2 & (1<<rightNames.get(module+"."+right));
            else if ( rightNames.get(module+"."+right) <= 191)
                return rightSet3 & (1<<rightNames.get(module+"."+right));
            else if ( rightNames.get(module+"."+right) <= 255)
                return rightSet4 & (1<<rightNames.get(module+"."+right));
            else throw ( new OutOfBoundsException());
        } else throw (new OutOfBoundsException());
    }

    
    /**
     *
     * @param day
     * @return
     */
    public Integer getHours(String day){
         return loginHours.get(day);
     }

    /**
     *
     * @param day
     * @param hours
     */
    public void setHours(String day, Integer hours){
         loginHours.put(day, hours);
     }

    /**
     *
     * @param day
     */
    public void clearHours(String day){
         loginHours.put(day,0);
     }

    /**
     *
     * @param day
     * @param hour
     */
    public void setHour(String day, int hour){
         loginHours.get(day);
     }

    /**
     *
     * @param day
     * @param hour
     * @return
     */
    public boolean getHour(String day, int hour){
         return true;
     }

    /**
     * @return the localLogin
     */
    public boolean allowLocalLogin() {
        return localLogin;
    }

    /**
     * @return the backup
     */
    public boolean canBackup() {
        return backup;
    }

    /**
     * @return the remoteLogin
     */
    public boolean canRemoteLogin() {
        return remoteLogin;
    }

    /**
     * @return the shutdown
     */
    public boolean canShutdown() {
        return shutdown;
    }

    /**
     * @return the monitor
     */
    public boolean canMonitor() {
        return monitor;
    }

    /**
     * @return the grantAccess
     */
    public boolean canGrantAccess() {
        return grantAccess;
    }

    /**
     * @return the revokeAccess
     */
    public boolean canRevokeAccess() {
        return revokeAccess;
    }

    /**
     * @return the takeOwnership
     */
    public boolean canTakeOwnership() {
        return takeOwnership;
    }

    /**
     * @return the startServices
     */
    public boolean canStartServices() {
        return startServices;
    }

    /**
     * @return the stopServices
     */
    public boolean canStopServices() {
        return stopServices;
    }

    /**
     * @return the createUsers
     */
    public boolean canCreateUsers() {
        return createUsers;
    }

    /**
     * @return the deleteUsers
     */
    public boolean canDeleteUsers() {
        return deleteUsers;
    }

    /**
     * @return the registerModules
     */
    public boolean canRegisterModules() {
        return registerModules;
    }

    /**
     * @return the unregisterModules
     */
    public boolean canUnregisterModules() {
        return unregisterModules;
    }

    /**
     * @return the print
     */
    public boolean canPrint() {
        return print;
    }

    /**
     * @return the documentRequest
     */
    public boolean canDocumentRequest() {
        return documentRequest;
    }

    /**
     * @return the eventListener
     */
    public boolean canEventListener() {
        return eventListener;
    }

    /**
     * @return the reassignThreads
     */
    public boolean canReassignThreads() {
        return reassignThreads;
    }

    /**
     * @return the impersonateUser
     */
    public boolean canImpersonateUser() {
        return impersonateUser;
    }

    /**
     * @return the viewPHI
     */
    public boolean canViewPHI() {
        return viewPHI;
    }

    /**
     * @return the updatePHI
     */
    public boolean canUpdatePHI() {
        return updatePHI;
    }

    /**
     * @return the addSupplementalCategory
     */
    public boolean canAddSupplementalCategory() {
        return addSupplementalCategory;
    }

    /**
     * @return the deleteSupplementalCategory
     */
    public boolean canDeleteSupplementalCategory() {
        return deleteSupplementalCategory;
    }

    /**
     * @return the alterSupplementalCategory
     */
    public boolean canAlterSupplementalCategory() {
        return alterSupplementalCategory;
    }

    /**
     * @param localLogin the localLogin to set
     */
    protected void allowLocalLogin(boolean localLogin) {
        this.localLogin = localLogin;
    }

    /**
     * @param backup the backup to set
     */
    protected void allowBackup(boolean backup) {
        this.backup = backup;
    }

    /**
     * @param remoteLogin the remoteLogin to set
     */
    protected void allowRemoteLogin(boolean remoteLogin) {
        this.remoteLogin = remoteLogin;
    }

    /**
     * @param shutdown the shutdown to set
     */
    protected void allowShutdown(boolean shutdown) {
        this.shutdown = shutdown;
    }

    /**
     * @param monitor the monitor to set
     */
    protected void allowMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    /**
     * @param grantAccess the grantAccess to set
     */
    protected void allowGrantAccess(boolean grantAccess) {
        this.grantAccess = grantAccess;
    }

    /**
     * @param revokeAccess the revokeAccess to set
     */
    protected void allowRevokeAccess(boolean revokeAccess) {
        this.revokeAccess = revokeAccess;
    }

    /**
     * @param takeOwnership the takeOwnership to set
     */
    protected void allowTakeOwnership(boolean takeOwnership) {
        this.takeOwnership = takeOwnership;
    }

    /**
     * @param startServices the startServices to set
     */
    protected void allowStartServices(boolean startServices) {
        this.startServices = startServices;
    }

    /**
     * @param stopServices the stopServices to set
     */
    protected void allowStopServices(boolean stopServices) {
        this.stopServices = stopServices;
    }

    /**
     * @param createUsers the createUsers to set
     */
    protected void allowCreateUsers(boolean createUsers) {
        this.createUsers = createUsers;
    }

    /**
     * @param deleteUsers the deleteUsers to set
     */
    protected void allowDeleteUsers(boolean deleteUsers) {
        this.deleteUsers = deleteUsers;
    }

    /**
     * @param registerModules the registerModules to set
     */
    protected void allowRegisterModules(boolean registerModules) {
        this.registerModules = registerModules;
    }

    /**
     * @param unregisterModules the unregisterModules to set
     */
    protected void allowUnregisterModules(boolean unregisterModules) {
        this.unregisterModules = unregisterModules;
    }

    /**
     * @param print the print to set
     */
    protected void allowPrint(boolean print) {
        this.print = print;
    }

    /**
     * @param documentRequest the documentRequest to set
     */
    protected void allowDocumentRequest(boolean documentRequest) {
        this.documentRequest = documentRequest;
    }

    /**
     * @param eventListener the eventListener to set
     */
    protected void allowEventListener(boolean eventListener) {
        this.eventListener = eventListener;
    }

    /**
     * @param reassignThreads the reassignThreads to set
     */
    protected void allowReassignThreads(boolean reassignThreads) {
        this.reassignThreads = reassignThreads;
    }

    /**
     * @param impersonateUser the impersonateUser to set
     */
    protected void allowImpersonateUser(boolean impersonateUser) {
        this.impersonateUser = impersonateUser;
    }

    /**
     * @param viewPHI the viewPHI to set
     */
    protected void allowViewPHI(boolean viewPHI) {
        this.viewPHI = viewPHI;
    }

    /**
     * @param updatePHI the updatePHI to set
     */
    protected void allowUpdatePHI(boolean updatePHI) {
        this.updatePHI = updatePHI;
    }

    /**
     * @param addSupplementalCategory the addSupplementalCategory to set
     */
    protected void allowAddSupplementalCategory(boolean addSupplementalCategory) {
        this.addSupplementalCategory = addSupplementalCategory;
    }

    /**
     * @param deleteSupplementalCategory the deleteSupplementalCategory to set
     */
    protected void allowDeleteSupplementalCategory(boolean deleteSupplementalCategory) {
        this.deleteSupplementalCategory = deleteSupplementalCategory;
    }

    /**
     * @param alterSupplementalCategory the alterSupplementalCategory to set
     */
    protected void allowAlterSupplementalCategory(boolean alterSupplementalCategory) {
        this.alterSupplementalCategory = alterSupplementalCategory;
    }
    
}
