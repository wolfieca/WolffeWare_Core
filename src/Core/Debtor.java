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

import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Debtor represents a single debtor/collection account on the system.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */


public class Debtor extends WWBaseObject implements Reportable {
    /**
     * @return the unit
     */
    public CollectionUnit getUnit() {
        return unit;
    }

    /**
     * @return the mailReturn
     */
    public boolean isMailReturn() {
        return mailReturn;
    }

    /**
     * @param debtor the debtor to set
     */
    protected void setDebtor(int debtor) {
        this.debtor = debtor;
    }

    /**
     * @param clients the clients to set
     */
    protected void setClients(HashMap<Client,Integer> clients) {
        this.clients = clients;
    }

    /**
     * @param unit the unit to set
     */
    protected void setUnit(CollectionUnit unit) {
        this.unit = unit;
    }

    /**
     * @param mailReturn the mailReturn to set
     */
    protected void setMailReturn(boolean mailReturn) {
        this.mailReturn = mailReturn;
    }
    // Security-related data fields are inherited from WWBaseObject
    private int debtor;
    private Client primaryClient;
    private HashMap<Client,Integer> clients;
    private Actor collector;
    private CollectionUnit unit;
    private int currBal;
    private int origBal;
    private int payments;
    private boolean mailReturn;
    private boolean paidInFull;
    private boolean workedSinceLastNewbiz;
    private boolean hasAssetWindow;
    private boolean hasEmploymentWindow;
    private boolean hasAddressWindow;
    private boolean hasPhone;
    private boolean withAttorney;
    private boolean withForward;
    private boolean hasRestrictionsWindow;
    private boolean doNotCall;
    private boolean doNotCallHome;
    private boolean doNotWriteWork;
    private boolean doNotCallWork;
    private boolean debtReturned;
    private boolean everNSF;
    private boolean everSkipTracedPhone;
    private boolean everSkipTracedAddress;
    private boolean everSkipTracedOther;
    private boolean everMailReturn;
    private boolean preCollect;
    private boolean mergeInProgress;
    private boolean splitInProgress;
    private boolean debtsCanAccrueInterest;
    private AttorneyForwarder attorneyForwarder;
    private GregorianCalendar dateSentOut;
    private GregorianCalendar dateLastPaid;
    private GregorianCalendar dateLastSeen;
    private GregorianCalendar dateLastNewbiz;
    private GregorianCalendar dateOriginallyReceived;
    private GregorianCalendar dateClosed;
    private GregorianCalendar dateLastUpdated;
    private int collectorRetrySendDays;
    private int lettersLeft;
    private Priority priority;
    private CollectionUnit priorCollector;
    private Promise paymentPromise;
    private AccountStatus status;
    private int keptPromises;
    private int brokenPromises;
    
    // Matchable debtors can be processed by the match finding routines.
    private boolean matchable;
    // Mergeable debtors can be merged with other debtors.
    private boolean mergeable;
    // Locked debtors can't be changed outside of those changes needed for
    // payment processing.
    private boolean locked;
    // Begin PHI data fields...
    // The level of access to the PHI fields is controlled by the 
    // Account.PHI.Read and Account.PHI.Write rights. If the requestor doesn't
    // have Read access, only a limited subset of the PHI data will be returned:
    // namely lastName and the last four digits of ssn. 
    // Primary Demographic Data
    private DemographicField<String> lastName;
    private DemographicField<String> firstName;
    private DemographicField<String> middleName;
    private DemographicField<String> suffix;

    private DemographicField<String> title;
    private DemographicField<String> phone;
    // Wizard does not put SSN or birthdate in the MASTER data, and we have to
    // put it in the NI window, even though it is always pertinent
    private DemographicField<String> ssn;
    private DemographicField<GregorianCalendar> birthDate;
    // Wizard system puts most of the address in the Ancil A1 window, keeping
    // only the City, State, and Zip portions here. I don't see a real reason
    // to carry that practice over.
    private DemographicField<String> addressLine1;
    private DemographicField<String> addressLine2;
    private DemographicField<String> addressLine3;
    private DemographicField<String> city;
    private DemographicField<String> state;
    private DemographicField<String> zip;
    // End PHI data fields
    
    // Begin working data fields
    private HashMap<String,SupplementalData> ancil;
    private HashMap<Integer,Debt> debt;
    private HashMap<Integer,History> history;
    //private HashMap<Integer,Payment> payment;
    private HashMap<Integer,Legal> legal;
    private ActivityQueue activity;

    /**
     * Copy Constructor
     * @param theDebtor 
     */   
    public Debtor(Debtor theDebtor){
        activity = theDebtor.getActivity();
        try{
            addressLine1.setField(theDebtor.getAddressLine1());
        } catch(AccessDeniedException e){
        }
        
        try{
            addressLine2.setField(theDebtor.getAddressLine2());
        } catch (AccessDeniedException e){
        }
            
        try{
            addressLine3.setField(theDebtor.getAddressLine3());
        } catch (AccessDeniedException e){
            
        }
        
        try{
            city.setField(theDebtor.getCity());
        } catch (AccessDeniedException e){
            
        }
        
        try{
            state.setField(theDebtor.getState().getField());
        } catch (AccessDeniedException e){
            
        }
        
        try{
            zip.setField(theDebtor.getZip().getField());
        } catch(AccessDeniedException e) {
            
        }
        
        try{
            birthDate.setField(theDebtor.getBirthDate());
        } catch(AccessDeniedException e){
            
        }
        
        try{
            lastName.setField(theDebtor.getLastName());
        } catch(AccessDeniedException e){
            
        }
        
        try{
            firstName.setField(theDebtor.getFirstName());
        } catch (AccessDeniedException e){
            
        }
        
        try{
            middleName.setField(theDebtor.getMiddleName());
        } catch (AccessDeniedException e){
            
        }
        
        try{
            title.setField(theDebtor.getTitle());
        } catch(AccessDeniedException e){
            
        }
        
        try{
            suffix.setField(theDebtor.getSuffix());
        } catch (AccessDeniedException e){
            
        }
        
        try {
            phone.setField(theDebtor.getPhone());
        } catch (AccessDeniedException e){
            
        }
        
        try {
            ssn.setField(theDebtor.getSsn());
        } catch (AccessDeniedException e){
            
        }
    }
    
    
    // Utility methods. The public API should not have any direct access to the
    // internal implementations of the demographic fields.

    /**
     *
     * @return
     */
    public String getName(){
        return lastName.getField() + ", " + firstName.getField() + " " + middleName.getField();
        /*if ( lastName.isPHI() || firstName.isPHI() || middleName.isPHI() ){
            if ( getCaller().getRights().canViewPHI() )
                return lastName.getField()+", " + firstName.getField()
                    +" "+ middleName.getField();
            else
                return lastName.getField();
        } else 
            return lastName.getField() + ", " + firstName.getField() +
                    " " + middleName.getField();*/
    }

    /**
     *
     * @return
     */
    public String getNormalName(){
        return title.getField() + " " + firstName.getField() + " " +
                middleName.getField() + " " + lastName.getField() +
                (suffix.getField().equals("")?"":", ") + suffix.getField();
        /*if ( lastName.isPHI() || firstName.isPHI() || middleName.isPHI() ||
                title.isPHI() || suffix.isPHI()){
            if ( getCaller().getRights().canViewPHI() )
                return title.getField()+" "+firstName.getField()+" "+
                        middleName.getField()+" "+lastName.getField()+
                        (suffix.getField().equals("")?"":", "+suffix.getField());
            else
                return title.getField()+" "+lastName.getField();
        } else
            return title.getField()+" "+firstName.getField()+" "+
                middleName.getField()+" "+lastName.getField()+
                (suffix.getField().equals("")?"":", "+suffix.getField()); */
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber(){
        return phone.getField();
        /*if (phone.isPHI()){
            if(getCaller().getRights().canViewPHI()){
                return phone.getField();
            } else
                return null;
        } else
            return phone.getField(); */
    }
    // Accessor methods

    /**
     * Retrieve the debtor number
     * @return debtor number
     */
    public int getDebtor() {
        return debtor;
    }

    /**
     * Retrieve the last name of the debtor. Allow last name to be sent, 
     * regardless of the PHI settings.
     * @return
     */
    public String getLastName() {
        return lastName.getField();
    }

    /**
     * Set the last name of the debtor
     * @param lastName
     */
    protected void setLastName(String lastName) {
        try {
            this.lastName.setField(lastName);
        }catch(Exception e){
            
        }
        /*if ( this.lastName.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI() )
                try {
                    this.lastName.setField(lastName);
                }catch(AccessDeniedException e){
                    
                }
        } else
            try {
                this.lastName.setField(lastName);
            }catch (AccessDeniedException e){
            }*/
    }

    /**
     * Retrieve the first name of the debtor
     * @return
     */
    public String getFirstName() {

        return firstName.getField();
        /*if ( firstName.isPHI()){
            if ( getCaller().getRights().canViewPHI() )
                return firstName.getField();
            else return null;
        }
        return firstName.getField();*/
    }

    /**
     * Set the first name of the debtor
     * @param firstName
     */
    protected void setFirstName(String firstName) {
        try{
            this.firstName.setField(firstName);
        } catch (Exception e){
            
        }
        /*if ( this.firstName.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI() )
                try {
                    this.firstName.setField(firstName);
                }catch(AccessDeniedException e){
                    
                }
        } else
            try {
                this.firstName.setField(firstName);
            }catch (AccessDeniedException e){
            }*/
    }

    /**
     * Get the debtor middle name
     * @return
     */
    public String getMiddleName() {
        return middleName.getField();
        /*if (middleName.isPHI()){
            if ( getCaller().getRights().canViewPHI())
                return middleName.getField();
            else 
                return null;
        } else
            return middleName.getField();*/
    }

    /**
     *
     * @param middleName
     */
    protected void setMiddleName(String middleName) {
        try {
            this.middleName.setField(middleName);
        }catch (Exception e){
        
        }
        /*        if ( this.middleName.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI() )
                try {
                    this.middleName.setField(middleName);
                }catch(AccessDeniedException e){
                    
                }
        } else
            try {
                this.middleName.setField(middleName);
            }catch (AccessDeniedException e){
            }

        //this.middleName = middleName;*/
    }

    /**
     *
     * @return
     */
    public String getSuffix() {
        return suffix.getField();
        /*
        if ( this.suffix.isPHI()) {
            if(getCaller().getRights().canUpdatePHI()){
                return suffix.getField();
            } else
                return null;
        } else
            return suffix.getField(); */
    }

    /**
     *
     * @param suffix
     */
    protected void setSuffix(String suffix) {
        try {
            this.suffix.setField(suffix);
        } catch (Exception e){
            
        }
        /*    if ( this.suffix.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI() )
                try {
                    this.suffix.setField(suffix);
                }catch(AccessDeniedException e){
                    
                }
        } else
            try {
                this.suffix.setField(suffix);
            }catch (AccessDeniedException e){
            
            }
        */
    }

    /**
     * Get the debtor title/salutation
     * @return
     */
    public String getTitle() {
        return title.getField();
        /*if(this.title.isPHI()){
            if (getCaller().getRights().canViewPHI())
                return title.getField();
            else
                return null;
        } else {
            return title.getField();
        }*/
    }

    /**
     *
     * @param title
     */
    protected void setTitle(String title) {
        try{
            this.title.setField(title);
        } catch (Exception e) {
            
        }
        /* if ( this.title.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI() )
                try {
                    this.title.setField(title);
                }catch(AccessDeniedException e){
                    
                }
        } else
            try {
                this.title.setField(title);
            }catch (AccessDeniedException e){
            }*/
    }

    /**
     * Get the debtor phone number
     * @return
     */
    public String getPhone() {
        return phone.getField();
        /*if ( phone.isPHI() ){
            if ( getCaller().getRights().canViewPHI())
                return phone.getField();
            else
                return null;
        } else
            return phone.getField();*/
    }

    /**
     * Set/Update the debtor phone number
     * @param phone
     */
    protected void setPhone(String phone) {
        try {
            this.phone.setField(phone);
        } catch ( Exception e){
            
        }
        /*if (this.phone.isPHI()){
            if(getCaller().getRights().canUpdatePHI()){
                try{
                    this.phone.setField(phone);
                } catch (AccessDeniedException e){
                    
                }
            }
        } else
            try{
                this.phone.setField(phone);
            } catch (AccessDeniedException e){
                
            }*/
    }

    /**
     *
     * @return
     */
    public String getSsn() {
        return ssn.getField();
        /*if (this.ssn.isPHI()) {
            if ( getCaller().getRights().canViewPHI())
                return this.ssn.getField();
            else
                return null;
        }else
            return this.ssn.getField(); */
    }

    /**
     *
     * @param ssn
     */
    protected void setSsn(String ssn) {
        try {
            this.ssn.setField(ssn);
        } catch (Exception e){
            
        }
        /*if ( this.ssn.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI())
                try{
                    this.ssn.setField(ssn);
                } catch (AccessDeniedException e){
                    
                }
        } else
            try{
                this.ssn.setField(ssn);
            } catch (AccessDeniedException e) {
                
            }*/
    }

    /**
     *
     * @return
     */
    public GregorianCalendar getBirthDate() {
        return birthDate.getField();
        /*if ( this.birthDate.isPHI() ) {
            if ( getCaller().getRights().canViewPHI())
                return this.birthDate.getField();
            else
                return null;
        } else
            return this.birthDate.getField();*/
    }

    /**
     *
     * @param birthDate
     */
    protected void setBirthDate(GregorianCalendar birthDate) {
        try {
            this.birthDate.setField(birthDate);
        }catch (Exception e){
            
        }
        /*if ( this.birthDate.isPHI() ) {
            if ( getCaller().getRights().canUpdatePHI())
                try {
                    this.birthDate.setField(birthDate);
                } catch (AccessDeniedException e){
                    
                }
        } else
            try{
                this.birthDate.setField(birthDate);
            } catch (AccessDeniedException e) {
                
            } */
    }

    /**
     *
     * @return
     */
    public String getAddressLine1() {
        return addressLine1.getField();
        /*if ( this.addressLine1.isPHI() )
            if ( getCaller().getRights().canViewPHI())
                return addressLine1.getField();
            else
                return null;
        else
            return this.addressLine1.getField(); */
    }

    /**
     *
     * @param addressLine1
     */
    protected void setAddressLine1(String addressLine1) {
        try{
            this.addressLine1.setField(addressLine1);
        } catch (Exception e){
            
        }
        /*if ( this.addressLine1.isPHI() )
            if(getCaller().getRights().canUpdatePHI())
                try{
                    this.addressLine1.setField(addressLine1);
                }catch (AccessDeniedException e){
                    
                }
        else
            try{
                this.addressLine1.setField(addressLine1);
            } catch (AccessDeniedException e){
            }*/
    }

    /**
     *
     * @return
     */
    public String getAddressLine2() {
        return addressLine2.getField();
/*        if ( this.addressLine2.isPHI())
            if(getCaller().getRights().canViewPHI())
                return this.addressLine2.getField();
            else
                return null;
        else
            return this.addressLine2.getField(); */
    }

    /**
     *
     * @param addressLine2
     */
    protected void setAddressLine2(String addressLine2) {
        try {
            this.addressLine2.setField(addressLine2);
        } catch (Exception e) {
            
        }
/*        if ( this.addressLine2.isPHI())
            if ( getCaller().getRights().canUpdatePHI())
                try{
                    this.addressLine2.setField(addressLine2);
                } catch(AccessDeniedException e){
                }

        else
            try{
                this.addressLine2.setField(addressLine2);
            } catch (AccessDeniedException e){
                
            } */
    }

    /**
     *
     * @return
     */
    public String getAddressLine3() {
        return addressLine3.getField();
/*        if ( this.addressLine3.isPHI())
            if(getCaller().getRights().canViewPHI())
                return this.addressLine3.getField();
            else
                return null;
        else
            return this.addressLine3.getField(); */
    }

    /**
     *
     * @param addressLine3
     */
    protected void setAddressLine3(String addressLine3) {
        try {
            this.addressLine3.setField(addressLine3);
        } catch (Exception e){
            
        }
/*        if ( this.addressLine3.isPHI())
            if ( getCaller().getRights().canUpdatePHI())
                try{
                    this.addressLine3.setField(addressLine3);
                } catch(AccessDeniedException e){
                }

        else
            try{
                this.addressLine3.setField(addressLine3);
            } catch (AccessDeniedException e){
                
            } */
    }

    /**
     *
     * @return
     */
    public String getCity() {
       return city.getField();
/*        if ( this.city.isPHI())
            if(getCaller().getRights().canViewPHI())
                return this.city.getField();
            else
                return null;
        else
            return this.city.getField(); */
    }

    /**
     *
     * @param city
     */
    protected void setCity(String city) {
        try {
            this.city.setField(city);
        } catch (Exception e){
            
        }
/*        if ( this.city.isPHI())
            if ( getCaller().getRights().canUpdatePHI())
                try{
                    this.addressLine3.setField(city);
                } catch(AccessDeniedException e){
                }

        else
            try{
                this.addressLine3.setField(city);
            } catch (AccessDeniedException e){
                
            } */
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
    public DemographicField<String> getState() {
        return state;
    }

    /**
     * Set the debtor state
     * @param state
     */
    protected void setState(DemographicField<String> state) {
        this.state = state;
    }

    /**
     * Get the debtor Zip code
     * @return
     */
    public DemographicField<String> getZip() {
        return zip;
    }

    /**
     * Set the debtor Zip code
     * @param zip
     */
    protected void setZip(DemographicField<String> zip) {
        this.zip = zip;
    }

    /**
     * Matchable debtors are allowed to be processed by the match-finding 
     * services, looking for debtors and debts that can be consolidated into 
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
     * A mergeable debtor is capable of having new debtors/debts merged into it.
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
    // Merge and Split treat Debtors as immutable.
    /**
     * Merges a debtor with this one. Debts from the debtorToMerge are added
     * to this debtor, and removed from the debtorToMerge. History, payments, etc
     * are also likewise added to this debtor. Supplemental data are not merged,
     * but differences are placed in the history. The debtorToMerge is left in 
     * place, but is just used to allow lookups against its debtor number to 
     * work properly. Both debtors must be mergeable and not locked.
     * @param debtorToMerge
     * @return      the resulting debtors
     */
    public Debtor[] merge(Debtor debtorToMerge){
        return null;
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
    public Debtor[] merge(Debtor debtorToMerge, int[] debtsToMerge){
        return null;
    }

    /**
     * Merge a single debt into this debtor. This will detach the target debt
     * from its owning debtor, and attach it to this debtor, at the same time
     * adjusting the statistics for both debtors to reflect this change.
     * @param debtToMerge
     * @return
     */
    public Debtor[] merge(Debt debtToMerge){
        return null;
    }

    /**
     * Merge a set of debts into this debtor. See comment for merge(debt).
     * @param debtsToMerge
     * @return
     */
    public Debtor[] merge(Debt[] debtsToMerge){
        return null;
    }

    /**
     * Merge two debtors together, and returns the resulting debtors.
     * @param primary
     * @param secondary
     * @return
     */
    public static Debtor[] merge(Debtor primary, Debtor secondary){
        return null;
    }

    /**
     * Merge two Debtors together, combining selected debts to the new debtor.
     * Returns the combined debtor
     * @param primary
     * @param secondary
     * @param debtsToMerge
     * @return
     */
    public static Debtor[] merge(Debtor primary, Debtor secondary, int[] debtsToMerge){
        return null;
    }

    /**
     * Merge the specified debts into the specified debtor.
     * @param primary
     * @param debtsToMerge
     * @return
     */
    public static Debtor[] merge(Debtor primary, Debt[] debtsToMerge){
        return null;
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
    public Debtor[] split(int debtToSplit){
        return null;
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
    public Debtor[] split (int[] debtsToSplit){
        return null;
    }

    /**
     * 
     * @param debtor
     * @param debtsToSplit
     * @return
     */
    public static Debtor[] split(Debtor debtor, int[] debtsToSplit){
        return null;
    }

    /**
     *
     * @param debtsToSplit
     * @return
     */
    public static Debtor[] split(Debt[] debtsToSplit){
        return null;
    }
    /**
     *
     * @param debtsToSplit
     * @return
     */
    public Debt detachDebt(int[] debtsToSplit){
        return null;
    }

    /**
     *
     * @param debtsToSplit
     * @return
     */
    public Debt[] attachDebt(int[] debtsToSplit){
        return null;
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

    /**
     *
     * @param testDebtor
     * @return
     */
    
    public int degreeMatch(Debtor testDebtor){
        return 0;
    }

    /**
     *
     * @param testDebtor
     * @return
     */
    public boolean isMatch(Debtor testDebtor){
        return true;
    }

    /**
     * @return the paidInFull
     */
    public boolean isPaidInFull() {
        return paidInFull;
    }

    /**
     * @return the workedSinceLastNewbiz
     */
    public boolean isWorkedSinceLastNewbiz() {
        return workedSinceLastNewbiz;
    }

    /**
     * @return the hasAssetWindow
     */
    public boolean isHasAssetWindow() {
        return hasAssetWindow;
    }

    /**
     * @return the hasEmploymentWindow
     */
    public boolean isHasEmploymentWindow() {
        return hasEmploymentWindow;
    }

    /**
     * @return the hasAddressWindow
     */
    public boolean isHasAddressWindow() {
        return hasAddressWindow;
    }

    /**
     * @return the hasPhone
     */
    public boolean isHasPhone() {
        return hasPhone;
    }

    /**
     * @return the withAttorney
     */
    public boolean isWithAttorney() {
        return withAttorney;
    }

    /**
     * @return the withForward
     */
    public boolean isWithForward() {
        return withForward;
    }

    /**
     * @return the hasRestrictionsWindow
     */
    public boolean isHasRestrictionsWindow() {
        return hasRestrictionsWindow;
    }

    /**
     * @return the doNotCall
     */
    public boolean isDoNotCall() {
        return doNotCall;
    }

    /**
     * @return the doNotCallHome
     */
    public boolean isDoNotCallHome() {
        return doNotCallHome;
    }

    /**
     * @return the doNotWriteWork
     */
    public boolean isDoNotWriteWork() {
        return doNotWriteWork;
    }

    /**
     * @return the doNotCallWork
     */
    public boolean isDoNotCallWork() {
        return doNotCallWork;
    }

    /**
     * @return the debtReturned
     */
    public boolean isDebtReturned() {
        return debtReturned;
    }

    /**
     * @return the everNSF
     */
    public boolean isEverNSF() {
        return everNSF;
    }

    /**
     * @return the everSkipTracedPhone
     */
    public boolean isEverSkipTracedPhone() {
        return everSkipTracedPhone;
    }

    /**
     * @return the everSkipTracedAddress
     */
    public boolean isEverSkipTracedAddress() {
        return everSkipTracedAddress;
    }

    /**
     * @return the everSkipTracedOther
     */
    public boolean isEverSkipTracedOther() {
        return everSkipTracedOther;
    }

    /**
     * @return the preCollect
     */
    public boolean isPreCollect() {
        return preCollect;
    }

    /**
     * @return the mergeInProgress
     */
    public boolean isMergeInProgress() {
        return mergeInProgress;
    }

    /**
     * @return the splitInProgress
     */
    public boolean isSplitInProgress() {
        return splitInProgress;
    }

    /**
     * @return the attorneyForwarder
     */
    public AttorneyForwarder getAttorneyForwarder() {
        return attorneyForwarder;
    }

    /**
     * @return the dateSentOut
     */
    public GregorianCalendar getDateSentOut() {
        return dateSentOut;
    }

    /**
     * @return the dateLastPaid
     */
    public GregorianCalendar getDateLastPaid() {
        return dateLastPaid;
    }

    /**
     * @return the dateLastSeen
     */
    public GregorianCalendar getDateLastSeen() {
        return dateLastSeen;
    }

    /**
     * @return the dateLastNewbiz
     */
    public GregorianCalendar getDateLastNewbiz() {
        return dateLastNewbiz;
    }

    /**
     * @return the dateOriginallyReceived
     */
    public GregorianCalendar getDateOriginallyReceived() {
        return dateOriginallyReceived;
    }

    /**
     * @return the dateClosed
     */
    public GregorianCalendar getDateClosed() {
        return dateClosed;
    }

    /**
     * @return the dateLastUpdated
     */
    public GregorianCalendar getDateLastUpdated() {
        return dateLastUpdated;
    }

    /**
     * @return the collectorRetrySendDays
     */
    public int getCollectorRetrySendDays() {
        return collectorRetrySendDays;
    }

    /**
     * @return the lettersLeft
     */
    public int getLettersLeft() {
        return lettersLeft;
    }

    /**
     * @return the priority
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * @return the priorCollector
     */
    public CollectionUnit getPriorCollector() {
        return priorCollector;
    }

    /**
     * @return the keptPromises
     */
    public int getKeptPromises() {
        return keptPromises;
    }

    /**
     * @return the brokenPromises
     */
    public int getBrokenPromises() {
        return brokenPromises;
    }

    /**
     * @param paidInFull the paidInFull to set
     */
    protected void setPaidInFull(boolean paidInFull) {
        this.paidInFull = paidInFull;
    }

    /**
     * @param workedSinceLastNewbiz the workedSinceLastNewbiz to set
     */
    protected void setWorkedSinceLastNewbiz(boolean workedSinceLastNewbiz) {
        this.workedSinceLastNewbiz = workedSinceLastNewbiz;
    }

    /**
     * @param hasAssetWindow the hasAssetWindow to set
     */
    protected void setHasAssetWindow(boolean hasAssetWindow) {
        this.hasAssetWindow = hasAssetWindow;
    }

    /**
     * @param hasEmploymentWindow the hasEmploymentWindow to set
     */
    protected void setHasEmploymentWindow(boolean hasEmploymentWindow) {
        this.hasEmploymentWindow = hasEmploymentWindow;
    }

    /**
     * @param hasAddressWindow the hasAddressWindow to set
     */
    protected void setHasAddressWindow(boolean hasAddressWindow) {
        this.hasAddressWindow = hasAddressWindow;
    }

    /**
     * @param hasPhone the hasPhone to set
     */
    protected void setHasPhone(boolean hasPhone) {
        this.hasPhone = hasPhone;
    }

    /**
     * @param withAttorney the withAttorney to set
     */
    protected void setWithAttorney(boolean withAttorney) {
        this.withAttorney = withAttorney;
    }

    /**
     * @param withForward the withForward to set
     */
    protected void setWithForward(boolean withForward) {
        this.withForward = withForward;
    }

    /**
     * @param hasRestrictionsWindow the hasRestrictionsWindow to set
     */
    protected void setHasRestrictionsWindow(boolean hasRestrictionsWindow) {
        this.hasRestrictionsWindow = hasRestrictionsWindow;
    }

    /**
     * @param doNotCall the doNotCall to set
     */
    protected void setDoNotCall(boolean doNotCall) {
        this.doNotCall = doNotCall;
    }

    /**
     * @param doNotCallHome the doNotCallHome to set
     */
    protected void setDoNotCallHome(boolean doNotCallHome) {
        this.doNotCallHome = doNotCallHome;
    }

    /**
     * @param doNotWriteWork the doNotWriteWork to set
     */
    protected void setDoNotWriteWork(boolean doNotWriteWork) {
        this.doNotWriteWork = doNotWriteWork;
    }

    /**
     * @param doNotCallWork the doNotCallWork to set
     */
    protected void setDoNotCallWork(boolean doNotCallWork) {
        this.doNotCallWork = doNotCallWork;
    }

    /**
     * @param debtReturned the debtReturned to set
     */
    protected void setDebtReturned(boolean debtReturned) {
        this.debtReturned = debtReturned;
    }

    /**
     * @param everNSF the everNSF to set
     */
    protected void setEverNSF(boolean everNSF) {
        this.everNSF = everNSF;
    }

    /**
     * @param everSkipTracedPhone the everSkipTracedPhone to set
     */
    protected void setEverSkipTracedPhone(boolean everSkipTracedPhone) {
        this.everSkipTracedPhone = everSkipTracedPhone;
    }

    /**
     * @param everSkipTracedAddress the everSkipTracedAddress to set
     */
    protected void setEverSkipTracedAddress(boolean everSkipTracedAddress) {
        this.everSkipTracedAddress = everSkipTracedAddress;
    }

    /**
     * @param everSkipTracedOther the everSkipTracedOther to set
     */
    protected void setEverSkipTracedOther(boolean everSkipTracedOther) {
        this.everSkipTracedOther = everSkipTracedOther;
    }

    /**
     * @param preCollect the preCollect to set
     */
    protected void setPreCollect(boolean preCollect) {
        this.preCollect = preCollect;
    }

    /**
     * @param mergeInProgress the mergeInProgress to set
     */
    protected void setMergeInProgress(boolean mergeInProgress) {
        this.mergeInProgress = mergeInProgress;
    }

    /**
     * @param splitInProgress the splitInProgress to set
     */
    protected void setSplitInProgress(boolean splitInProgress) {
        this.splitInProgress = splitInProgress;
    }

    /**
     * @param attorneyForwarder the attorneyForwarder to set
     */
    protected void setAttorneyForwarder(AttorneyForwarder attorneyForwarder) {
        this.attorneyForwarder = attorneyForwarder;
    }

    /**
     * @param dateSentOut the dateSentOut to set
     */
    protected void setDateSentOut(GregorianCalendar dateSentOut) {
        this.dateSentOut = dateSentOut;
    }

    /**
     * @param dateLastPaid the dateLastPaid to set
     */
    protected void setDateLastPaid(GregorianCalendar dateLastPaid) {
        this.dateLastPaid = dateLastPaid;
    }

    /**
     * @param dateLastSeen the dateLastSeen to set
     */
    protected void setDateLastSeen(GregorianCalendar dateLastSeen) {
        this.dateLastSeen = dateLastSeen;
    }

    /**
     * @param dateLastNewbiz the dateLastNewbiz to set
     */
    protected void setDateLastNewbiz(GregorianCalendar dateLastNewbiz) {
        this.dateLastNewbiz = dateLastNewbiz;
    }

    /**
     * @param dateOriginallyReceived the dateOriginallyReceived to set
     */
    protected void setDateOriginallyReceived(GregorianCalendar dateOriginallyReceived) {
        this.dateOriginallyReceived = dateOriginallyReceived;
    }

    /**
     * @param dateClosed the dateClosed to set
     */
    protected void setDateClosed(GregorianCalendar dateClosed) {
        this.dateClosed = dateClosed;
    }

    /**
     * @param dateLastUpdated the dateLastUpdated to set
     */
    protected void setDateLastUpdated(GregorianCalendar dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    /**
     * @param collectorRetrySendDays the collectorRetrySendDays to set
     */
    protected void setCollectorRetrySendDays(int collectorRetrySendDays) {
        this.collectorRetrySendDays = collectorRetrySendDays;
    }

    /**
     * @param lettersLeft the lettersLeft to set
     */
    protected void setLettersLeft(int lettersLeft) {
        this.lettersLeft = lettersLeft;
    }

    /**
     * @param priority the priority to set
     */
    protected void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * @param priorCollector the priorCollector to set
     */
    protected void setPriorCollector(CollectionUnit priorCollector) {
        this.priorCollector = priorCollector;
    }

    /**
     * @param keptPromises the keptPromises to set
     */
    protected void setKeptPromises(int keptPromises) {
        this.keptPromises = keptPromises;
    }

    /**
     * @param brokenPromises the brokenPromises to set
     */
    protected void setBrokenPromises(int brokenPromises) {
        this.brokenPromises = brokenPromises;
    }

    /**
     * @param lastName the lastName to set
     */
    protected void setLastName(DemographicField<String> lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName the firstName to set
     */
    protected void setFirstName(DemographicField<String> firstName) {
        this.firstName = firstName;
    }

    /**
     * @param middleName the middleName to set
     */
    protected void setMiddleName(DemographicField<String> middleName) {
        this.middleName = middleName;
    }

    /**
     * @param suffix the suffix to set
     */
    protected void setSuffix(DemographicField<String> suffix) {
        this.suffix = suffix;
    }

    /**
     * @param title the title to set
     */
    protected void setTitle(DemographicField<String> title) {
        this.title = title;
    }

    /**
     * @param phone the phone to set
     */
    protected void setPhone(DemographicField<String> phone) {
        this.phone = phone;
    }

    /**
     * @param ssn the ssn to set
     */
    protected void setSsn(DemographicField<String> ssn) {
        this.ssn = ssn;
    }

    /**
     * @param birthDate the birthDate to set
     */
    protected void setBirthDate(DemographicField<GregorianCalendar> birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    protected void setAddressLine1(DemographicField<String> addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    protected void setAddressLine2(DemographicField<String> addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @param addressLine3 the addressLine3 to set
     */
    protected void setAddressLine3(DemographicField<String> addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * @param city the city to set
     */
    protected void setCity(DemographicField<String> city) {
        this.city = city;
    }
    
}
