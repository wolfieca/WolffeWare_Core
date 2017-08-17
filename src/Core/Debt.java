package Core;

import java.util.ArrayList;
import java.util.Date;

/**
 * Debt represents a single debt on the system. Debt data is mostly not PHI data, 
 * so the PHI checks should be avoidable here, for the most part.
 * @author odin
 */


public class Debt extends WWBaseObject implements Reportable {
    private Debtor debtor;
    private ArrayList<Debtor> PreviousDebtors;
    private boolean accruesInterest;
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
    private long[] owed;
    private long principalOwed;
    private long feesOwed;
    private long interestOwed;
    private long courtCostsOwed;
    private long attyFeesOwed;
    private long jiFcCfOwed;
    private long[] paid;
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

    
    
    // Active methods

    public int lock(){
        return 0;
    }
    public int unlock(){
        return 0;
    }
    public int prohibitMatching(){
        return 0;
    }
    public int allowMatching(){
        return 0;
    }
    public int prohibitMerge(){
        return 0;
    }
    public int allowMerge(){
        return 0;
    }
    public int prohibitSplit(){
        return 0;
    }
    public int allowSplit(){
        return 0;
    }
    public int anchor(){
        return 0;
    }
    public int freeDebt(){
        return 0;
    }
    public int updateFeeSchedule(FeeSchedule newFeeSchedule){
        return 0;
    }
    public long getPaid(int paidIndex){
        return 0;
    }
    public long getOwed(int owedIndex){
        return 0;
    }
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

    /**
     *
     * @param newEntry
     * @return
     */
    public int addHistory(History newEntry){
        return 0;
    }
    
    /**
     *
     * @param position
     * @return
     */
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

    //Accessor methods
    /**
     * @return the debtor
     */
    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * @return the PreviousDebtors
     */
    public ArrayList<Debtor> getPreviousDebtors() {
        return PreviousDebtors;
    }

    /**
     * @return the mergeable
     */
    public boolean isMergeable() {
        return mergeable;
    }

    /**
     * @return the matchable
     */
    public boolean isMatchable() {
        return matchable;
    }

    /**
     * @return the splitable
     */
    public boolean isSplitable() {
        return splitable;
    }

    /**
     * @return the locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @return the clientReferenceNumber
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * @return the forWhat
     */
    public String getForWhat() {
        return forWhat;
    }

    /**
     * @return the feeSchedule
     */
    public FeeSchedule getFeeSchedule() {
        return feeSchedule;
    }

    /**
     * @return the newBizBatch
     */
    public String getNewBizBatch() {
        return newBizBatch;
    }

    /**
     * @return the serviceType
     */
    public int getServiceType() {
        return serviceType;
    }

    /**
     * @return the paymentMethod
     */
    public int getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @return the principalOwed
     */
    public long getPrincipalOwed() {
        return principalOwed;
    }

    /**
     * @return the feesOwed
     */
    public long getFeesOwed() {
        return feesOwed;
    }

    /**
     * @return the interestOwed
     */
    public long getInterestOwed() {
        return interestOwed;
    }

    /**
     * @return the courtCostsOwed
     */
    public long getCourtCostsOwed() {
        return courtCostsOwed;
    }

    /**
     * @return the attyFeesOwed
     */
    public long getAttyFeesOwed() {
        return attyFeesOwed;
    }

    /**
     * @return the jiFcCfOwed
     */
    public long getJiFcCfOwed() {
        return jiFcCfOwed;
    }

    /**
     * @return the principalPaid
     */
    public long getPrincipalPaid() {
        return principalPaid;
    }

    /**
     * @return the feesPaid
     */
    public long getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the interestPaid
     */
    public long getInterestPaid() {
        return interestPaid;
    }

    /**
     * @return the courtCostsPaid
     */
    public long getCourtCostsPaid() {
        return courtCostsPaid;
    }

    /**
     * @return the attyFeesPaid
     */
    public long getAttyFeesPaid() {
        return attyFeesPaid;
    }

    /**
     * @return the jiFcCfPaid
     */
    public long getJiFcCfPaid() {
        return jiFcCfPaid;
    }

    /**
     * @return the origBalance
     */
    public long getOrigBalance() {
        return origBalance;
    }

    /**
     * @return the attyFees
     */
    public long getAttyFees() {
        return attyFees;
    }

    /**
     * @return the agencyFees
     */
    public long getAgencyFees() {
        return agencyFees;
    }

    /**
     * @return the totalPaid
     */
    public long getTotalPaid() {
        return totalPaid;
    }

    /**
     * @return the currBalance
     */
    public long getCurrBalance() {
        return currBalance;
    }

    /**
     * @return the debtStatus
     */
    public long getDebtStatus() {
        return debtStatus;
    }

    /**
     * @return the debtStatus2
     */
    public long getDebtStatus2() {
        return debtStatus2;
    }

    /**
     * @return the dateReceived
     */
    public Date getDateReceived() {
        return dateReceived;
    }

    /**
     * @return the dateToPurge
     */
    public Date getDateToPurge() {
        return dateToPurge;
    }

    /**
     * @return the dateLastPaid
     */
    public Date getDateLastPaid() {
        return dateLastPaid;
    }

    /**
     * @return the cliDateLastCharged
     */
    public Date getCliDateLastCharged() {
        return cliDateLastCharged;
    }

    /**
     * @return the cliDateLastPaid
     */
    public Date getCliDateLastPaid() {
        return cliDateLastPaid;
    }

    /**
     * @return the dateLastInterest
     */
    public Date getDateLastInterest() {
        return dateLastInterest;
    }

    /**
     * @return the totalPaidFees
     */
    public long getTotalPaidFees() {
        return totalPaidFees;
    }

    /**
     * @return the interestOverflow
     */
    public double getInterestOverflow() {
        return interestOverflow;
    }

    /**
     * @return the dateOrigReported
     */
    public Date getDateOrigReported() {
        return dateOrigReported;
    }

    /**
     * @return the dateLastReported
     */
    public Date getDateLastReported() {
        return dateLastReported;
    }

    /**
     * @return the origPrinBalance
     */
    public long getOrigPrinBalance() {
        return origPrinBalance;
    }

    /**
     * @return the dateOrigInterest
     */
    public Date getDateOrigInterest() {
        return dateOrigInterest;
    }

    /**
     * @return the interestRate
     */
    public short getInterestRate() {
        return interestRate;
    }

    /**
     * @return the payments
     */
    public ArrayList<Payment> getPayments() {
        return payments;
    }

    /**
     * @return the debtHist
     */
    public ArrayList<History> getDebtHist() {
        return debtHist;
    }

    /**
     * @param debtor the debtor to set
     */
    protected void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    /**
     * @param PreviousDebtors the PreviousDebtors to set
     */
    protected void setPreviousDebtors(ArrayList<Debtor> PreviousDebtors) {
        this.PreviousDebtors = PreviousDebtors;
    }

    /**
     * @param mergeable the mergeable to set
     */
    protected void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * @param matchable the matchable to set
     */
    protected void setMatchable(boolean matchable) {
        this.matchable = matchable;
    }

    /**
     * @param splitable the splitable to set
     */
    protected void setSplitable(boolean splitable) {
        this.splitable = splitable;
    }

    /**
     * @param locked the locked to set
     */
    protected void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * @param client the client to set
     */
    protected void setClient(Client client) {
        this.client = client;
    }

    /**
     * @param clientReferenceNumber the clientReferenceNumber to set
     */
    protected void setClientReferenceNumber(String clientReferenceNumber) {
        this.clientReferenceNumber = clientReferenceNumber;
    }

    /**
     * @param forWhat the forWhat to set
     */
    protected void setForWhat(String forWhat) {
        this.forWhat = forWhat;
    }

    /**
     * @param feeSchedule the feeSchedule to set
     */
    protected void setFeeSchedule(FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    /**
     * @param newBizBatch the newBizBatch to set
     */
    protected void setNewBizBatch(String newBizBatch) {
        this.newBizBatch = newBizBatch;
    }

    /**
     * @param serviceType the serviceType to set
     */
    protected void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    protected void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @param principalOwed the principalOwed to set
     */
    protected void setPrincipalOwed(long principalOwed) {
        this.principalOwed = principalOwed;
    }

    /**
     * @param feesOwed the feesOwed to set
     */
    protected void setFeesOwed(long feesOwed) {
        this.feesOwed = feesOwed;
    }

    /**
     * @param interestOwed the interestOwed to set
     */
    protected void setInterestOwed(long interestOwed) {
        this.interestOwed = interestOwed;
    }

    /**
     * @param courtCostsOwed the courtCostsOwed to set
     */
    protected void setCourtCostsOwed(long courtCostsOwed) {
        this.courtCostsOwed = courtCostsOwed;
    }

    /**
     * @param attyFeesOwed the attyFeesOwed to set
     */
    protected void setAttyFeesOwed(long attyFeesOwed) {
        this.attyFeesOwed = attyFeesOwed;
    }

    /**
     * @param jiFcCfOwed the jiFcCfOwed to set
     */
    protected void setJiFcCfOwed(long jiFcCfOwed) {
        this.jiFcCfOwed = jiFcCfOwed;
    }

    /**
     * @param principalPaid the principalPaid to set
     */
    protected void setPrincipalPaid(long principalPaid) {
        this.principalPaid = principalPaid;
    }

    /**
     * @param feesPaid the feesPaid to set
     */
    protected void setFeesPaid(long feesPaid) {
        this.feesPaid = feesPaid;
    }

    /**
     * @param interestPaid the interestPaid to set
     */
    protected void setInterestPaid(long interestPaid) {
        this.interestPaid = interestPaid;
    }

    /**
     * @param courtCostsPaid the courtCostsPaid to set
     */
    protected void setCourtCostsPaid(long courtCostsPaid) {
        this.courtCostsPaid = courtCostsPaid;
    }

    /**
     * @param attyFeesPaid the attyFeesPaid to set
     */
    protected void setAttyFeesPaid(long attyFeesPaid) {
        this.attyFeesPaid = attyFeesPaid;
    }

    /**
     * @param jiFcCfPaid the jiFcCfPaid to set
     */
    protected void setJiFcCfPaid(long jiFcCfPaid) {
        this.jiFcCfPaid = jiFcCfPaid;
    }

    /**
     * @param origBalance the origBalance to set
     */
    protected void setOrigBalance(long origBalance) {
        this.origBalance = origBalance;
    }

    /**
     * @param attyFees the attyFees to set
     */
    protected void setAttyFees(long attyFees) {
        this.attyFees = attyFees;
    }

    /**
     * @param agencyFees the agencyFees to set
     */
    protected void setAgencyFees(long agencyFees) {
        this.agencyFees = agencyFees;
    }

    /**
     * @param totalPaid the totalPaid to set
     */
    protected void setTotalPaid(long totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * @param currBalance the currBalance to set
     */
    protected void setCurrBalance(long currBalance) {
        this.currBalance = currBalance;
    }

    /**
     * @param debtStatus the debtStatus to set
     */
    protected void setDebtStatus(long debtStatus) {
        this.debtStatus = debtStatus;
    }

    /**
     * @param debtStatus2 the debtStatus2 to set
     */
    protected void setDebtStatus2(long debtStatus2) {
        this.debtStatus2 = debtStatus2;
    }

    /**
     * @param dateReceived the dateReceived to set
     */
    protected void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    /**
     * @param dateToPurge the dateToPurge to set
     */
    protected void setDateToPurge(Date dateToPurge) {
        this.dateToPurge = dateToPurge;
    }

    /**
     * @param dateLastPaid the dateLastPaid to set
     */
    protected void setDateLastPaid(Date dateLastPaid) {
        this.dateLastPaid = dateLastPaid;
    }

    /**
     * @param cliDateLastCharged the cliDateLastCharged to set
     */
    protected void setCliDateLastCharged(Date cliDateLastCharged) {
        this.cliDateLastCharged = cliDateLastCharged;
    }

    /**
     * @param cliDateLastPaid the cliDateLastPaid to set
     */
    protected void setCliDateLastPaid(Date cliDateLastPaid) {
        this.cliDateLastPaid = cliDateLastPaid;
    }

    /**
     * @param dateLastInterest the dateLastInterest to set
     */
    protected void setDateLastInterest(Date dateLastInterest) {
        this.dateLastInterest = dateLastInterest;
    }

    /**
     * @param totalPaidFees the totalPaidFees to set
     */
    protected void setTotalPaidFees(long totalPaidFees) {
        this.totalPaidFees = totalPaidFees;
    }

    /**
     * @param interestOverflow the interestOverflow to set
     */
    protected void setInterestOverflow(double interestOverflow) {
        this.interestOverflow = interestOverflow;
    }

    /**
     * @param dateOrigReported the dateOrigReported to set
     */
    protected void setDateOrigReported(Date dateOrigReported) {
        this.dateOrigReported = dateOrigReported;
    }

    /**
     * @param dateLastReported the dateLastReported to set
     */
    protected void setDateLastReported(Date dateLastReported) {
        this.dateLastReported = dateLastReported;
    }

    /**
     * @param origPrinBalance the origPrinBalance to set
     */
    protected void setOrigPrinBalance(long origPrinBalance) {
        this.origPrinBalance = origPrinBalance;
    }

    /**
     * @param dateOrigInterest the dateOrigInterest to set
     */
    protected void setDateOrigInterest(Date dateOrigInterest) {
        this.dateOrigInterest = dateOrigInterest;
    }

    /**
     * @param interestRate the interestRate to set
     */
    protected void setInterestRate(short interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @param payments the payments to set
     */
    protected void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    /**
     * @param debtHist the debtHist to set
     */
    protected void setDebtHist(ArrayList<History> debtHist) {
        this.debtHist = debtHist;
    }

    /**
     * @return the owed
     */
    public long[] getOwed() {
        return owed;
    }

    /**
     * @return the paid
     */
    public long[] getPaid() {
        return paid;
    }

    /**
     * @param owed the owed to set
     */
    protected void setOwed(long[] owed) {
        this.setOwed(owed);
    }

    /**
     * @param paid the paid to set
     */
    protected void setPaid(long[] paid) {
        this.setPaid(paid);
    }

    /**
     * @param accruesInterest the accruesInterest to set
     */
    protected void setAccruesInterest(boolean accruesInterest) {
        this.accruesInterest = accruesInterest;
    }

    /**
     * @param owed the owed to set
     */
    protected void setOwed(long[] owed) {
        this.owed = owed;
    }

    /**
     * @param paid the paid to set
     */
    protected void setPaid(long[] paid) {
        this.paid = paid;
    }

    /**
     * @return the accruesInterest
     */
    public boolean isAccruesInterest() {
        return accruesInterest;
    }
 }
