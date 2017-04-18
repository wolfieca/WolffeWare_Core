package Core;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;

/**
 * Debt represents a single debt on the system. Debt data is mostly not PHI data, 
 * so the PHI checks should be avoidable here, for the most part.
 * @author odin
 */


public class Debt extends WWBaseObject implements Reportable {
    private Debtor debtor;
    private int debtID;
    private ArrayList<Debtor> PreviousDebtors;
    private boolean mergeable;
    private boolean matchable;
    private boolean splitable;
    private boolean locked;
    private Client client;
    private String clientReferenceNumber;
    private String forWhat;
    private FeeSchedule feeSchedule;
    private String newBizBatch;
    private int serviceType;
    private int paymentMethod;
    private long principalOwed;
    private long feesOwed;
    private long interestOwed;
    private long courtCostsOwed;
    private long attyFeesOwed;
    private long jiFcCfOwed;
    private long principalPaid;
    private long feesPaid;
    private long interestPaid;
    private long courtCostsPaid;
    private long attyFeesPaid;
    private long jiFcCfPaid;
    private long origBalance;
    private long attyFees;
    private long agencyFees;
    private long totalPaid;
    private long currBalance;
    private long debtStatus;
    private long debtStatus2;
    private Date dateReceived;
    private Date dateToPurge;
    private Date dateLastPaid;
    private Date cliDateLastCharged;
    private Date cliDateLastPaid;
    private Date dateLastInterest;
    private long totalPaidFees;
    private double interestOverflow; //(needed?)
    private Date dateOrigReported;
    private Date dateLastReported;
    //private BitSet debtStatus2; //(Actually unneeded.)
    private long origPrinBalance;
    private Date dateOrigInterest;
    private short interestRate;
    private ArrayList<Payment> payments;
    private ArrayList<History> debtHist;    //History entries specific to this debt.

    
    // Accessors

    /**
     * Get the debtor this debt is attached to
     * @return
     */

    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * Get the client for this debt
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     * Get the Client Reference Number for this debt
     * @return
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * Get the person or service this was for
     * @return
     */
    public String getForWhat() {
        return forWhat;
    }

    /**
     * Get the fee schedule for this debt
     * @return
     */
    public FeeSchedule getFeeSchedule() {
        return feeSchedule;
    }

    /**
     * Get the new business batch number this account came in.
     * @return
     */
    public String getNewBizBatch() {
        return newBizBatch;
    }

    /**
     * Get the type of services this debt was incurred for.
     * @return
     */
    public int getServiceType() {
        return serviceType;
    }

    /**
     * Get the payments method.
     * @return
     */
    public int getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Get the principle owed on this debt.
     * @return
     */
    public long getPrincipalOwed() {
        return principalOwed;
    }

    /**
     * Get the fees owed on this debt.
     * @return
     */
    public long getFeesOwed() {
        return feesOwed;
    }

    /**
     * Get the interest owed on this debt.
     * @return
     */
    public long getInterestOwed() {
        return interestOwed;
    }

    /**
     * Get the court costs owed on this debt.
     * @return
     */
    public long getCourtCostsOwed() {
        return courtCostsOwed;
    }

    /**
     * Get the attorney fees owed on this debt.
     * @return
     */
    public long getAttyFeesOwed() {
        return attyFeesOwed;
    }

    /**
     * Get other legal fees owed on this debt.
     * @return
     */
    public long getJiFcCfOwed() {
        return jiFcCfOwed;
    }

    /**
     * Get amount paid to principal.
     * @return
     */
    public long getPrincipalPaid() {
        return principalPaid;
    }

    /**
     * Get amount paid to fees.
     * @return
     */
    public long getFeesPaid() {
        return feesPaid;
    }

    /**
     * Get amount paid to interest.
     * @return
     */
    public long getInterestPaid() {
        return interestPaid;
    }

    /**
     * Get amount paid to court costs.
     * @return
     */
    public long getCourtCostsPaid() {
        return courtCostsPaid;
    }

    /**
     * Get amount paid to attorney fees.
     * @return
     */
    public long getAttyFeesPaid() {
        return attyFeesPaid;
    }

    /**
     * Get amount paid to other legal fees.
     * @return
     */
    public long getJiFcCfPaid() {
        return jiFcCfPaid;
    }

    /**
     * Get the original balance on the debt.
     * @return
     */
    public long getOrigBalance() {
        return origBalance;
    }

    /**
     * Get attorney fees on this debt.
     * @return
     */
    public long getAttyFees() {
        return attyFees;
    }

    /**
     * Get agency fees on this debt.
     * @return
     */
    public long getAgencyFees() {
        return agencyFees;
    }

    /**
     * Get total amount paid on this debt.
     * @return
     */
    public long getTotalPaid() {
        return totalPaid;
    }

    /**
     * Get current balance on this debt.
     * @return
     */
    public long getCurrBalance() {
        return currBalance;
    }

    /**
     * Get the status flags on this debt. This is a low-level routine which 
     * returns the status field as-is.
     * @return
     */
    public long getDebtStatus() {
        return debtStatus;
    }

    /**
     * Get the date this debt was received. This is the date the account first 
     * went through the new business processing, rather than the date it first
     * hist the system as a live account.
     * @return
     */
    public Date getDateReceived() {
        return dateReceived;
    }

    /**
     * Get the date the debt should be purged from the system. This will most
     * likely be a non-operational field in the final system.
     * @return
     */
    public Date getDateToPurge() {
        return dateToPurge;
    }

    /**
     * Get the latest date a payment was made on this debt.
     * @return
     */
    public Date getDateLastPaid() {
        return dateLastPaid;
    }

    /**
     * Get the date of service (the date last charged) for the debt.
     * @return
     */
    public Date getCliDateLastCharged() {
        return cliDateLastCharged;
    }

    /**
     * Get the last date that the client received a payment on the debt.
     * @return
     */
    public Date getCliDateLastPaid() {
        return cliDateLastPaid;
    }

    /**
     * Get the last date that interest was charged on the debt.
     * @return
     */
    public Date getDateLastInterest() {
        return dateLastInterest;
    }

    /**
     * Get the total amount paid in fees.
     * @return
     */
    public long getTotalPaidFees() {
        return totalPaidFees;
    }

    /**
     * Interest overflow, keep track of the extra precision lost on the interest
     * calculations.
     * @return
     */
    public double getInterestOverflow() {
        return interestOverflow;
    }

    /**
     * Get the date the debt originally got reported to the Credit Bureaus.
     * @return
     */
    public Date getDateOrigReported() {
        return dateOrigReported;
    }

    /**
     * Get the last date this debt was reported to the Credit Bureaus.
     * @return
     */
    public Date getDateLastReported() {
        return dateLastReported;
    }

    /**
     * Get the second set of status items (most likely unneeded).
     * @return
     */
    public long getDebtStatus2() {
        return debtStatus2;
    }

    /**
     * Get the original original principal balance
     * @return
     */
    public long getOrigPrinBalance() {
        return origPrinBalance;
    }

    /**
     * Get the date interest was originally applied to this debt.
     * @return
     */
    public Date getDateOrigInterest() {
        return dateOrigInterest;
    }

    /**
     * Get the interest rate on this account.
     * @return
     */
    public short getInterestRate() {
        return interestRate;
    }

    /**
     * Set the debtor number on this debt (effectively moving this debt to 
     * another debtor). Needless to say, this function is restricted.
     * @param debtor
     */
    protected void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    /**
     * Set the client for this debt. Restricted.
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Set the client reference number for the debt. Restricted.
     * @param clientReferenceNumber
     */
    public void setClientReferenceNumber(String clientReferenceNumber) {
        this.clientReferenceNumber = clientReferenceNumber;
    }

    /**
     * Set the for what information for the debt. Restricted.
     * @param forWhat
     */
    public void setForWhat(String forWhat) {
        this.forWhat = forWhat;
    }

    /**
     * Set the fee schedule. Restricted.
     * @param feeSchedule
     */
    public void setFeeSchedule(FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    /**
     * Set the new business batch number. Restricted.
     * @param newBizBatch
     */
    public void setNewBizBatch(String newBizBatch) {
        this.newBizBatch = newBizBatch;
    }

    /**
     * Set the service type for this debt. Restricted.
     * @param serviceType
     */
    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Set the payment method for this debt. Restricted.
     * @param paymentMethod
     */
    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Set the principal owed on this debt. Restricted.
     * @param principalOwed
     */
    public void setPrincipalOwed(long principalOwed) {
        this.principalOwed = principalOwed;
    }

    /**
     * Set the fees owed on this debt. Restricted.
     * @param feesOwed
     */
    public void setFeesOwed(long feesOwed) {
        this.feesOwed = feesOwed;
    }

    /**
     * Set the interest owed on this debt. Restricted.
     * @param interestOwed
     */
    public void setInterestOwed(long interestOwed) {
        this.interestOwed = interestOwed;
    }

    /**
     * Set the court costs owed on this debt. Restricted.
     * @param courtCostsOwed
     */
    public void setCourtCostsOwed(long courtCostsOwed) {
        this.courtCostsOwed = courtCostsOwed;
    }

    /**
     * Set the attorney fees owed on this debt. Restricted.
     * @param attyFeesOwed
     */
    public void setAttyFeesOwed(long attyFeesOwed) {
        this.attyFeesOwed = attyFeesOwed;
    }

    /**
     * Set the legal costs owed on this debt. Restricted.
     * @param jiFcCfOwed
     */
    public void setJiFcCfOwed(long jiFcCfOwed) {
        this.jiFcCfOwed = jiFcCfOwed;
    }

    /**
     * Set the principal paid on this debt. Restricted.
     * @param principalPaid
     */
    public void setPrincipalPaid(long principalPaid) {
        this.principalPaid = principalPaid;
    }

    /**
     * Set the fees paid on this debt. Restricted.
     * @param feesPaid
     */
    public void setFeesPaid(long feesPaid) {
        this.feesPaid = feesPaid;
    }

    /**
     * Set the interest paid on this debt. Restricted.
     * @param interestPaid
     */
    public void setInterestPaid(long interestPaid) {
        this.interestPaid = interestPaid;
    }

    /**
     * Set the court costs paid on this debt. Restricted.
     * @param courtCostsPaid
     */
    public void setCourtCostsPaid(long courtCostsPaid) {
        this.courtCostsPaid = courtCostsPaid;
    }

    /**
     * Set the attorney fees paid on this debt. Restricted.
     * @param attyFeesPaid
     */
    public void setAttyFeesPaid(long attyFeesPaid) {
        this.attyFeesPaid = attyFeesPaid;
    }

    /**
     * Set legal fees paid on this debt. Restricted.
     * @param jiFcCfPaid
     */
    public void setJiFcCfPaid(long jiFcCfPaid) {
        this.jiFcCfPaid = jiFcCfPaid;
    }

    /**
     * Set the original balance on this debt. Restricted.
     * @param origBalance
     */
    public void setOrigBalance(long origBalance) {
        this.origBalance = origBalance;
    }

    /**
     * Set the attorney fees on this debt. Restricted.
     * @param attyFees
     */
    public void setAttyFees(long attyFees) {
        this.attyFees = attyFees;
    }

    /**
     * Set the agency fees on this debt. Restricted.
     * @param agencyFees
     */
    public void setAgencyFees(long agencyFees) {
        this.agencyFees = agencyFees;
    }

    /**
     * Set the total amount paid on this debt. Restricted.
     * @param totalPaid
     */
    public void setTotalPaid(long totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * Set the current balance owing on this debt. Restricted.
     * @param currBalance
     */
    public void setCurrBalance(long currBalance) {
        this.currBalance = currBalance;
    }

    /**
     * Set the debt status flags. Restricted.
     * @param debtStatus
     */
    public void setDebtStatus(long debtStatus) {
        this.debtStatus = debtStatus;
    }

    /**
     * Set the date received on this debt. Restricted,
     * @param dateReceived
     */
    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    /**
     * Set the purge date on this debt. Restricted.
     * @param dateToPurge
     */
    public void setDateToPurge(Date dateToPurge) {
        this.dateToPurge = dateToPurge;
    }

    /**
     * Set the date the last payment was made on this debt. Restricted.
     * @param dateLastPaid
     */
    public void setDateLastPaid(Date dateLastPaid) {
        this.dateLastPaid = dateLastPaid;
    }

    /**
     * Set the client's date of last charge. Restricted.
     * @param cliDateLastCharged
     */
    public void setCliDateLastCharged(Date cliDateLastCharged) {
        this.cliDateLastCharged = cliDateLastCharged;
    }

    /**
     * Set the client's date of last payment. Restricted.
     * @param cliDateLastPaid
     */
    public void setCliDateLastPaid(Date cliDateLastPaid) {
        this.cliDateLastPaid = cliDateLastPaid;
    }

    /**
     * Set the date interest was last calculated on this debt.
     * @param dateLastInterest
     */
    public void setDateLastInterest(Date dateLastInterest) {
        this.dateLastInterest = dateLastInterest;
    }

    /**
     * Set the total amount paid in fees. Restricted.
     * @param totalPaidFees
     */
    public void setTotalPaidFees(long totalPaidFees) {
        this.totalPaidFees = totalPaidFees;
    }

    /**
     * Set the interest overflow amount. Restricted.
     * @param interestOverflow
     */
    public void setInterestOverflow(double interestOverflow) {
        this.interestOverflow = interestOverflow;
    }

    /**
     * Set the date the debt was originally reported to credit reporting
     * agencies. If this date is in the future, this is the date the debt
     * will first be reported to the Credit Reporting Agencies. Restricted
     * @param dateOrigReported
     */
    public void setDateOrigReported(Date dateOrigReported) {
        this.dateOrigReported = dateOrigReported;
    }

    /**
     * Set the date the debt was last reported to the Credit Reporting Agencies.
     * Restricted.
     * @param dateLastReported
     */
    public void setDateLastReported(Date dateLastReported) {
        this.dateLastReported = dateLastReported;
    }

    /**
     * Set the second set of Debt Flags. Restricted. May be redundant.
     * @param debtStatus2
     */
    public void setDebtStatus2(int debtStatus2) {
        this.debtStatus2 = debtStatus2;
    }

    /**
     * Set the original Principal Balance on the debt. Restricted.
     * @param origPrinBalance
     */
    public void setOrigPrinBalance(long origPrinBalance) {
        this.origPrinBalance = origPrinBalance;
    }

    /**
     * Set the date interest was originally applied to this debt. Restricted.
     * @param dateOrigInterest
     */
    public void setDateOrigInterest(Date dateOrigInterest) {
        this.dateOrigInterest = dateOrigInterest;
    }

    /**
     * Set the interest rate applied to this debt.
     * @param interestRate
     */
    public void setInterestRate(short interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Get the previous debtors this debt has been attached to.
     * @return
     */
    public ArrayList<Debtor> getPreviousDebtors() {
        return PreviousDebtors;
    }

    /**
     * Set the previous debtors this debt has been attached to. Restricted.
     * @param PreviousDebtors
     */
    public void setPreviousDebtors(ArrayList<Debtor> PreviousDebtors) {
        this.PreviousDebtors = PreviousDebtors;
    }

    /**
     * Get the payments that have been applied to this debt.
     * @return
     */
    public ArrayList<Payment> getPayments() {
        return payments;
    }

    /**
     * Set payments that have been applied to this debt.
     * @param payments
     */
    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    /**
     * Is this debt mergeable? Mergeable debts can be merged to another
     * debtor.
     * @return
     */
    public boolean isMergeable() {
        return mergeable;
    }

    /**
     * Enable or disable merging of this debt from its current debtor.
     * Restricted.
     * @param mergeable
     */
    public void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * Is this debt matchable? Matchable debts are subject for the match-find
     * subsystem.
     * @return
     */
    public boolean isMatchable() {
        return matchable;
    }

    /**
     * Enable or disable matching of this debt. Restricted.
     * @param matchable
     */
    public void setMatchable(boolean matchable) {
        this.matchable = matchable;
    }

    /**
     * Is this debt splitable? Splitable debts can be split from their current
     * debtor.
     * @return
     */
    public boolean isSplitable() {
        return splitable;
    }

    /**
     * Enable/disable splitting of this debt from its current debtor. Restricted.
     * @param splitable
     */
    public void setSplitable(boolean splitable) {
        this.splitable = splitable;
    }

    /**
     * Is this debt locked. Locked debts prohibit changes to those debts.
     * @return
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Lock or unlock this debt. Restricted.
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * Get the history for this debt. Each debt has its own history.
     * @return
     */
    public ArrayList<History> getDebtHist() {
        return debtHist;
    }

    /**
     * Set the history for this debt. Restricted.
     * @param debtHist
     */
    public void setDebtHist(ArrayList<History> debtHist) {
        this.debtHist = debtHist;
    }
    
    
    // Active methods

    /**
     * Update the interest on this debt, subject to restrictions such as being
     * locked.
     * @return
     */
    public int updateInterest(){
        return 0;
    }
    
    /**
     * Apply a payment to this debt, adjusting the related fields, and 
     * @param thePayment
     * @return
     */
    public int applyPayment(Payment thePayment){
        return 0;
    }

    /**
     * Reverse a payment on this debt.
     * @param thePayment
     * @return
     */
    public int reversePayment(Payment thePayment){
        return 0;
    }

    // Utility Methods
    /**
     * Get the current value of the specified status flags.
     * @param startPosition
     * @param width
     * @return
     */
    public int statusFlag(int startPosition, int width){
        return 0;
    }

    /**
     * Change the Debtor this debt is attached to.
     * @param newDebtor
     * @return
     */
    public int changeDebtor(Debtor newDebtor){
        return 0;
    }
    /**
     * Set the value of the specified status flags.
     * @param startPosition
     * @param width
     * @param value
     * @return
     */
    public int statusFlag(int startPosition, int width, int value){
        return 0;
    }

    public int addHistory(History newEntry){
        return 0;
    }
    
    public int delHistory(int position) {
        return 0;
    }
    /**
     * Export this debt in Metro2 format (may be left to 
     * @return
     */
    public String exportAsMetro2(){
        return "";
    }

    @Override
    public String exportAsCSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exportAsXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "";
    }
 }
