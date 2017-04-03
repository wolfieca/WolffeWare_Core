package Core;

import java.util.Date;
import java.util.HashMap;

/**
 * Debtor represents a single debtor/collection account on the system.
 * @author odin
 */


public class Debtor extends WWBaseObject implements Reportable {
    // Security-related data fields are inherited from WWBaseObject
    private int debtor;
    private Client primaryClient;
    private HashMap<Client,Integer> clients;
    private Actor collector;
    private int currBal;
    private int origBal;
    private int payments;
    private Promise paymentPromise;
    private AccountStatus status;
    // Matchable debtors can be processed by the match finding routines.
    private boolean matchable;
    // Mergeable debtors can be merged with other debtors.
    private boolean mergeable;
    // Locked debtors can't be changed outside of those changes needed for
    // payment processing.
    private boolean locked;
    // Begin PHI data fields..
    // Primary Demographic Data
    private String lastName;
    private String firstName;
    private String middleName;
    private String suffix;

    private String title;
    private String phone;
    // Wizard does not put SSN or birthdate in the MASTER data, and we have to
    // put it in the NI window, even though it is always pertinent
    private String ssn;
    private Date birthDate;
    // Wizard system puts most of the address in the Ancil A1 window, keeping
    // only the City, State, and Zip portions here. I don't see a real reason
    // to carry that practice over.
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private String zip;
    // End PHI data fields
    
    // Begin working data fields
    private HashMap<String,SupplementalData> ancil;
    private HashMap<Integer,Debt> debt;
    private HashMap<Integer,History> history;
    //private HashMap<Integer,Payment> payment;
    private HashMap<Integer,Legal> legal;
    private ActivityQueue activity;
    
    
    // Accessor methods

    /**
     * Retrieve the debtor number
     * @return debtor number
     */
    public int getDebtor() {
        return debtor;
    }

    /**
     * Retrieve the last name of the debtor
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the debtor
     * @param lastName
     */
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieve the first name of the debtor
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name of the debtor
     * @param firstName
     */
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the debtor middle name
     * @return
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     */
    protected void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     *
     * @param suffix
     */
    protected void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Get the debtor's title/salutation
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    protected void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the debtor's phone number
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set/Update the debtor's phone number
     * @param phone
     */
    protected void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getSsn() {
        return ssn;
    }

    /**
     *
     * @param ssn
     */
    protected void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     *
     * @return
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @param birthDate
     */
    protected void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     *
     * @return
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     *
     * @param addressLine1
     */
    protected void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     *
     * @return
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     *
     * @param addressLine2
     */
    protected void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     *
     * @return
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     *
     * @param addressLine3
     */
    protected void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    protected void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the primary client
     * @return
     */
    public Client getPrimaryClient() {
        return primaryClient;
    }

    /**
     * Set the primary client (should not be used as primary client should be
     * figured by looking at the debts).
     * @param primaryClient
     */
    protected void setPrimaryClient(Client primaryClient) {
        this.primaryClient = primaryClient;
    }

    /**
     * Get the clients attached to this debtor, and the total dollar amounts
     * owed for each.
     * @return 
     */
    public HashMap<Client,Integer> getClients (){
        return clients;
    }
    
    /**
     * Update the clients list, usually done in response to a merge or a split
     * of debts, or as a result of a payment being made.
     * @return 
     */
    public int updateClients(){
        return 0;
    }
    
    /**
     * Get the collector (the Actor assigned to this debtor)
     * @return
     */
    public Actor getCollector() {
        return collector;
    }

    /**
     * Set/Update the collector
     * @param collector
     */
    protected void setCollector(Actor collector) {
        this.collector = collector;
    }

    /**
     * Get the current balance
     * @return
     */
    public int getCurrBal() {
        return currBal;
    }

    /**
     * Set the current balance (not generally used)
     * @param currBal
     */
    protected void setCurrBal(int currBal) {
        this.currBal = currBal;
    }

    /**
     * Get the original balance
     * @return
     */
    public int getOrigBal() {
        return origBal;
    }

    /**
     * Set the original balance (not generally used)
     * @param origBal
     */
    protected void setOrigBal(int origBal) {
        this.origBal = origBal;
    }

    /**
     * Get the total payments that have been made on this account
     * @return
     */
    public int getPayments() {
        return payments;
    }

    /**
     * Set the total payments that have been made (normally calculated).
     * @param payments
     */
    protected void setPayments(int payments) {
        this.payments = payments;
    }

    /**
     * Get the payment promise on this account (if any)
     * @return
     */
    public Promise getPaymentPromise() {
        return paymentPromise;
    }

    /**
     * Set a payment promise on this account
     * @param paymentPromise
     */
    protected void setPaymentPromise(Promise paymentPromise) {
        this.paymentPromise = paymentPromise;
    }

    /**
     * Get the status on this debtor
     * @return
     */
    public AccountStatus getStatus() {
        return status;
    }

    /**
     * Set the status of this account
     * @param status
     */
    protected void setStatus(AccountStatus status) {
        this.status = status;
    }

    /**
     * Get the supplemental data for this account
     * @return
     */
    public HashMap<String, SupplementalData> getAncil() {
        return ancil;
    }

    /**
     * Set the supplemental data for this account
     * @param ancil
     */
    protected void setAncil(HashMap<String, SupplementalData> ancil) {
        this.ancil = ancil;
    }

    /**
     * Get the debts attached to this account
     * @return
     */
    public HashMap<Integer, Debt> getDebt() {
        return debt;
    }

    /**
     * Set the debts attached to this account (restricted).
     * @param debt
     */
    protected void setDebt(HashMap<Integer, Debt> debt) {
        this.debt = debt;
    }

    /**
     * Get the entire history for this debtor
     * @return
     */
    public HashMap<Integer, History> getHistory() {
        return history;
    }

    /**
     * Set the history for this debtor (restricted)
     * @param history
     */
    protected void setHistory(HashMap<Integer, History> history) {
        this.history = history;
    }

    /**
     * Get all payments made on this account
     * @return
     */
/*    public HashMap<Integer, Payment> getPayment() {
        return payment;
    }
*/
    /**
     * Set payments made on this account (restricted)
     * @param payment
     */
/*    protected void setPayment(HashMap<Integer, Payment> payment) {
        this.payment = payment;
    }
*/
    /**
     * Get legal actions on this account
     * @return
     */
    public HashMap<Integer, Legal> getLegal() {
        return legal;
    }

    /**
     * Set legal actions on this account
     * @param legal
     */
    protected void setLegal(HashMap<Integer, Legal> legal) {
        this.legal = legal;
    }

    /**
     * Get activities scheduled on this account
     * @return
     */
    public ActivityQueue getActivity() {
        return activity;
    }

    /**
     * Set activities scheduled on this account
     * @param activity
     */
    protected void setActivity(ActivityQueue activity) {
        this.activity = activity;
    }

    /**
     * Get the debtor state
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Set the debtor state
     * @param state
     */
    protected void setState(String state) {
        this.state = state;
    }

    /**
     * Get the debtor Zip code
     * @return
     */
    public String getZip() {
        return zip;
    }

    /**
     * Set the debtor Zip code
     * @param zip
     */
    protected void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Matchable debtors are allowed to be processed by the match-finding 
     * services, looking for debtors and debts that can be consilidated into 
     * single debts.
     * @return
     */
    public boolean isMatchable() {
        return matchable;
    }

    /**
     * See description for isMatchable
     * @param matchable
     */
    public void setMatchable(boolean matchable) {
        this.matchable = matchable;
    }

    /**
     * A mergable debtor is capable of having new debtors/debts merged into it.w
     * @return
     */
    public boolean isMergeable() {
        return mergeable;
    }

    /**
     *
     * @param mergeable
     */
    public void setMergeable(boolean mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * Is this debtor locked? A locked debtor prohibits any changes
     * @return
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Set locked status of this debtor. A locked debtor cannot be changed in
     * and way, save for being unlocked. The debtor can't be merged to, split
     * from, or deleted; Interest will not accrue (nor can it be rolled back); 
     * demographic data can is also locked and unchangeable as long as this
     * flag is set. Likewise, payments may not be made to this account until 
     * approved by a user with the correct credentials (the debtor must be 
     * unlocked in order for the payment to process and be applied to any debts).
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    
    // Work methods

    /**
     * Merges an debtor with this one. Debts from the debtorToMerge are added
     * to this debtor, and removed from the debtorToMerge. History, payments, etc
     * are also likewise added to this debtor. Supplemental data are not merged,
     * but differences are placed in the history. The debtorToMerge is left in 
     * place, but is just used to allow lookups against its debtor number to 
     * work properly. Both debtors must be mergeable and not locked.
     * @param debtorToMerge
     * @return      0 if successful
     */
    public int merge(Debtor debtorToMerge){
        return 0;
    }

    /**
     * Merges specific debts from another debtor. This works largely as with 
     * merge(Debtor debtorToMerge), but only items that apply to the specified 
     * debts are merged. debtorToMerge is left alone, with the exception of the
     * items that were removed.
     * @param debtorToMerge
     * @param debtsToMerge
     * @return
     */
    public int merge(Debtor debtorToMerge, int[] debtsToMerge){
        return 0;
    }

    // NOTE: All split operations create a copy of this debtor to attach the
    // split debts to.
    /**
     * Split a single debt from this debtor. Must not be the only debt in this
     * debtor (there must always be at least one debt in a debtor). The debt
     * must be splitable and this debtor must not be locked.
     * @param debtToSplit
     * @return
     */
    public int split(int debtToSplit){
        return 0;
    }

    /**
     * Split a list of debts from this debtor. At the end of this operation,
     * there must be at least a single debt left in this debtor. The debts must
     * be splitable and this debtor must not be locked. A new debtor will be 
     * created to attach this debt to. A shadow reference to the old debt
     * will remain so that it can be found.
     * @param debtsToSplit
     * @return
     */
    public int split (int[] debtsToSplit){
        return 0;
    }

    /**
     * Update the interest on the account. Iterate over each debt and have
     * them update their interest. The debtor cannot be locked. Locked debts 
     * will simply ignore this.
     * @return
     */
    public int updateInterest(){
        return 0;
    }
    
    /**
     * Determine which client is the primary client for this debtor. The primary
     * client is the client with the highest total balance for this debtor.
     * @return 
     */
    public Client findPrimaryClient(){
        return null;
    }

    /**
     * Remove interest from the account. As with updateInterest, this causes
     * each debt to recalculate their individual interest, setting it to 0, in 
     * this case. Has no effect on debts that are locked. Debtor cannot be 
     * locked.
     * @return
     */
    public int undoInterest(){
        return 0;
    }

    /**
     * Add a debt to this account. This debtor cannot be locked.
     * @param debtToAdd
     * @return
     */
    public int addDebt(Debt debtToAdd){
        return 0;
    }

    /**
     * Delete the specified debt (restricted)
     * @param debtToDelete
     * @return
     */
    public int deleteDebt(int debtToDelete){
        return 0;
    }

    /**
     * Retrieve a specific debt from this debtor.
     * @param debtToRetrieve
     * @return
     */
    public Debt getDebt(int debtToRetrieve){
        return null;
    }

    /**
     * Retrieve a specific history entry.
     * @param histToRetrieve
     * @return
     */
    public History getHistory(int histToRetrieve){
        return null;
    }

    /**
     * Retrieve a specified payment.
     * @param paymentToRetrieve
     * @return
     */
    public Payment getPayment(int paymentToRetrieve){
        return null;
    }

    /**
     * Retrieve a specified Legal Action.
     * @param legalAction
     * @return
     */
    public Legal getLegal(int legalAction){
        return null;
    }

    /**
     * Add a history entry to this debtor.
     * @param histRecord
     * @return
     */
    public int putHistory(History histRecord){
        return 0;
    }
    
    /**
     * Add a legal action to this debtor
     * @param legalAction
     * @return
     */
    public int addLegalAction(Legal legalAction){
        return 0;
    }
    
    /**
     * Delete a legal action from this debtor.
     * @param legalAction
     * @return
     */
    public int removeLegalAction(Legal legalAction) {
        return 0;
    }
    
    /**
     * Export this debtor as a CSV string.
     * @return
     */
    @Override
    public String exportAsCSV() {
        return "";
    }

    /**
     * Export this debtor as an XML string.
     * @return
     */
    @Override
    public String exportAsXML(){
        return "";
    }
    
    /**
     * Export this debtor as a Metro2 record.
     * @return 
     */
    public String exportAsMetro2(){
        return "";
    }
    
    // Match-related functionality.
    
    public int degreeMatch(Debtor testDebtor){
        return 0;
    }
    public boolean isMatch(Debtor testDebtor){
        return true;
    }
    
}
