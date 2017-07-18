package Core;

import java.util.HashMap;
import java.util.Map;

/**
 * The Rights class enumerates rights that an Actor is granted to the 
 * system and specified subsystems (run-time modules, for example). 
 * Note that Rights are a configuration specification mechanism, there is no
 * enforcement of the rights here. Enforcement is up to individual modules.
 * @author odin
 */


public class Rights extends WWBaseObject {
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
         //Base Right Definitions should be constant
         rightNames.put("Base.LocalLogin", lastPosition++);
         rightNames.put("Base.Backup", lastPosition++);
         rightNames.put("Base.RemoteLogin", lastPosition++);
         rightNames.put("Base.Shutdown", lastPosition++);
         rightNames.put("Base.Monitor", lastPosition++);
         rightNames.put("Base.Grant", lastPosition++);
         rightNames.put("Base.Revoke", lastPosition++);
         rightNames.put("Base.TakeOwnership", lastPosition++);
         rightNames.put("Base.StartServices", lastPosition++);
         rightNames.put("Base.StopServices", lastPosition++);
         rightNames.put("Base.CreateUsers", lastPosition++);
         rightNames.put("Base.DeleteUsers", lastPosition++);
         rightNames.put("Base.RegisterModules", lastPosition++);
         rightNames.put("Base.UnRegisterModules", lastPosition++);
         rightNames.put("Base.Print", lastPosition++);
         rightNames.put("Base.DocumentRequest", lastPosition++);
         rightNames.put("Base.EventListener", lastPosition++);
         rightNames.put("Base.ReassignThreads", lastPosition++);
         rightNames.put("Base.ImpersonateUser", lastPosition++);
         rightNames.put("Base.PHI.View",lastPosition++);
         rightNames.put("Base.PHI.Update", lastPosition++);
         rightNames.put("Base.AddSupplemtalCategory", lastPosition++);
         rightNames.put("Base.DelSupplementalCategpry", lastPosition++);
         //Rights Definitions for built-in objects
         rightNames.put("Debtor.Merge", lastPosition++);
         rightNames.put("Debtor.Split", lastPosition++);
         rightNames.put("Debtor.Delete", lastPosition++);
         rightNames.put("Debtor.PHI.Read", lastPosition++);
         rightNames.put("Debtor.PHI.Write", lastPosition++);
         rightNames.put("Debtor.Supp.Read", lastPosition++);
         rightNames.put("Debtor.Supp.Write", lastPosition++);
         rightNames.put("Debtor.Lookup.ByHistory", lastPosition++);
         rightNames.put("Debtor.Lookup.ByQueue", lastPosition++);
         rightNames.put("Debtor.Lookup.ByGeneral", lastPosition++);
         rightNames.put("Debtor.Lookup.ByUnit", lastPosition++);
         rightNames.put("Debtor.Lookup.Blitz", lastPosition++);
         rightNames.put("Debtor.Lookup.ByTag", lastPosition++);
         rightNames.put("Debtor.Access.LegalActions", lastPosition++);
         rightNames.put("Debtor.Access.Precollect", lastPosition++);
         rightNames.put("Debtor.Update.Telephone", lastPosition++);
         rightNames.put("Debtor.Update.Collector", lastPosition++);
         rightNames.put("Debtor.Update.MailReturn", lastPosition++);
         rightNames.put("Debtor.Update.StrategyStatus", lastPosition++);
         rightNames.put("Debtor.Update.StatusWithinType", lastPosition++);
         rightNames.put("Debtor.Update.LettersLeft", lastPosition++);
         rightNames.put("Debtor.Update.Indicators", lastPosition++);
         rightNames.put("Debtor.Update.LegalScreen", lastPosition++);
         rightNames.put("Debt.Read", lastPosition++);
         rightNames.put("Debt.Write", lastPosition++);
         rightNames.put("Debt.CRStatus.Write", lastPosition++);
         rightNames.put("Debt.CRStatus.Read", lastPosition++);
         rightNames.put("Debt.Update.OrigBalance", lastPosition++);
         rightNames.put("Debt.Update.For", lastPosition++);
         rightNames.put("Debt.Update.CliRef", lastPosition++);
         rightNames.put("Debt.Update.SvcType", lastPosition++);
         rightNames.put("Debt.Update.DLC", lastPosition++);
         rightNames.put("Debt.Update.DLP", lastPosition++);
         rightNames.put("Debt.Update.FeeSched", lastPosition++);
         rightNames.put("Debt.Update.CreditBureauFields", lastPosition++);
         rightNames.put("Debt.Update.ReturnStatus", lastPosition++);
         rightNames.put("Debt.Update.Client", lastPosition++);
         rightNames.put("Debt.Update.Comments", lastPosition++);
         rightNames.put("Debt.Update.Tags", lastPosition++);
         rightNames.put("Bank.Setup.Read", lastPosition++);
         rightNames.put("Bank.Setup.Write", lastPosition++);
         rightNames.put("Client.Setup.Read", lastPosition++);
         rightNames.put("Client.Setup.Write", lastPosition++);
         rightNames.put("Fee.Setup.Read", lastPosition++);
         rightNames.put("Fee.Setup.Write", lastPosition++);
         rightNames.put("Invoice.Setup.Read", lastPosition++);
         rightNames.put("Invoice.Setup.Write", lastPosition++);
         rightNames.put("Attorney.Setup.Read", lastPosition++);
         rightNames.put("Attorney.Setup.Write", lastPosition++);
         rightNames.put("Lead.Add",lastPosition++);
         rightNames.put("Lead.Update", lastPosition++);
         rightNames.put("Lead.Read", lastPosition++);
         rightNames.put("LetterSeries.Read", lastPosition++);
         rightNames.put("LetterSeries.Write", lastPosition++);
         rightNames.put("Match.Setup.Read", lastPosition++);
         rightNames.put("Match.Setup.Write", lastPosition++);
         rightNames.put("Misc.Read", lastPosition++);
         rightNames.put("Misc.Write", lastPosition++);
         rightNames.put("NewBiz.Read", lastPosition++);
         rightNames.put("NewBiz.Add", lastPosition++);
         rightNames.put("NewBiz.Write", lastPosition++);
         rightNames.put("Newbiz.Update.AccountName", lastPosition++);
         rightNames.put("Newbiz.Update.GeneralInformation", lastPosition++);
         rightNames.put("Newbiz.update.SkipTraceInfo", lastPosition++);
         rightNames.put("Newbiz.Update.CrossReference", lastPosition++);
         rightNames.put("Newbiz.Update.Historical", lastPosition++);
         rightNames.put("Newbiz.Update.CollectorNotes", lastPosition++);
         rightNames.put("Office.Setup.Read", lastPosition++);
         rightNames.put("Office.Setup.Write", lastPosition++);
         rightNames.put("Payment.Read", lastPosition++);
         rightNames.put("Payment.Add", lastPosition++);
         rightNames.put("Payment.Write", lastPosition++);
         rightNames.put("Priority.Setup.Read", lastPosition++);
         rightNames.put("Priority.Setup.Write", lastPosition++);
         rightNames.put("Strategy.Planning.Read", lastPosition++);
         rightNames.put("Strategy.Planning.Write", lastPosition++);
         rightNames.put("User.Setup.Read", lastPosition++);
         rightNames.put("User.Setup.Write", lastPosition++);
         rightNames.put("User.ObserveUser", lastPosition++);
         rightNames.put("User.AdviseUser", lastPosition++);
         rightNames.put("User.MonitorUsers", lastPosition++);
         rightNames.put("Supplemental.Category.Read", lastPosition++);
         rightNames.put("Supplemental.Category.Write", lastPosition++);
         rightNames.put("Misc.CollectorPaymentStats.Read", lastPosition++);
         rightNames.put("Misc.ReverseUnmatchedPayments", lastPosition++);
         rightNames.put("Misc.MultipleOfficeAccess", lastPosition++);
         rightNames.put("Misc.ElevatePrivilege", lastPosition++);
         rightNames.put("Misc.SendAnnouncements", lastPosition++);
         rightNames.put("Misc.SuperCollector", lastPosition++);
         rightNames.put("Misc.TriggerEvents", lastPosition++);
         rightNames.put("Misc.CreateNewTags", lastPosition++);
         rightNames.put("Misc.InhibitAuditin", lastPosition++);
         rightNames.put("Report.Run", lastPosition++);
         rightNames.put("Queue.Merge", lastPosition++);
         rightNames.put("Account.Reinstate", lastPosition++);

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

    public Long getRightSet1() {
        return rightSet1;
    }

    protected void setRightSet1(Long rightSet1) {
        this.rightSet1 = rightSet1;
    }

    public Long getRightSet2() {
        return rightSet2;
    }

    protected void setRightSet2(Long rightSet2) {
        this.rightSet2 = rightSet2;
    }

    public Long getRightSet3() {
        return rightSet3;
    }

    protected void setRightSet3(Long rightSet3) {
        this.rightSet3 = rightSet3;
    }

    public Long getRightSet4() {
        return rightSet4;
    }

    protected void setRightSet4(Long rightSet4) {
        this.rightSet4 = rightSet4;
    }

    protected int getLastPosition() {
        return lastPosition;
    }

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
}
