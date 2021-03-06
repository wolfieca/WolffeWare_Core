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

/**
 * ClientStats represents a single client statistical record. A single record
 * represents a single month of activity for a client
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class ClientStats {
    private Integer year;
    private Integer month;
    private Long    receivablesThisMonth;
    private GregorianCalendar dateThru;
    private Long    newbizDollars;
    private Long    newbizCount;
    private Long    paidDollars;
    private Long    whollyRetainedDollars;
    private Long    paidCount;
    private Long    paidThisMonthDollars; // Not part of the SU data
    private Long    whollyRetainedThisMonthDollars; // Not in SU data
    private Long    feesThisMonthDollars; // Not in SU data
    private Long    paidThisMonthCount; // Not in SU data
    private Long    paidInFullDollars;
    private Long    paidInFullCount;
    private Long    purgedDollars;
    private Long    purgedCount;
    private Long    returnedDollars;
    private Long    returnedCount;
    private Long    transferredInDollars;
    private Long    transferredInCount;
    private Long    transferredOutDollars;
    private Long    transferredOutCount;
    private Long    courtCostsCharged;
    private Long    courtCostsReturned;
    private Long    internalCourtCostsCharged;
    private Long    internalCourtCostsReturned;
    private Long    fees;
    private Long    adjustments;
    private Long    attorneyFees;
    private Long    forwarderFees;
    private Long    laborCosts;
    private Long    nonLaborCosts;
    private Long    mailingCosts;

    
    // Interface methods.
    protected int addNewbiz(Debt newbiz){
        this.newbizCount ++;
        this.newbizDollars += newbiz.getPrincipalOwed();
        return 0;
    }
    
    protected int addPayment(Payment newPayment){
        this.paidCount++;
        this.paidDollars += 1;
        return 0;
    }
    
    protected int addWhollyRetainedDollars(long retainedAmount){
        return 0;
    }
    protected int addPaidInFull(Debt pifDebt){
        return 0;
    }
    protected int purgeDebt(Debt toPurge){
        return 0;
    }
    protected int returnDebt(Debt toReturn){
        return 0;
    }
    protected int transferDebt(Debt toTransfer, Client toClient){
        return 0;
    }
    protected int addFees(Long fees){
        return 0;
    }
    protected int addAdjustment(Long adjustment){
        return 0;
    }
    protected int addAttyFees(Long attyFees){
        return 0;
    }
    protected int addFwdrFees(Long fwdrFees){
        return 0;
    }
    protected int addLaborCosts(Long laborCosts){
        return 0;
    }
    protected int addNonLaborCosts(Long nonLaborCosts){
        return 0;
    }
    protected int addMailingCosts(Long mailingCosts){
        return 0;
    }
    // Design Note: In the new design, these are calculated on the fly whenever
    // changes are made that would require it. The Client object is also capable
    // forcing it's ClientStats object to re-calculate itself from scratch.
    // The calculation of these statistics needs to be top-down so that any two
    // runs will provide the same results consistently, given that no changes 
    // have occurred in the interim. Regardless, the Statistical calculations
    // need to be accurate at all times.
    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @return the month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * @return the receivablesThisMonth
     */
    public Long getReceivablesThisMonth() {
        return receivablesThisMonth;
    }


    /**
     * @return the dateThru
     */
    public GregorianCalendar getDateThru() {
        return dateThru;
    }

    /**
     * @return the newbizDollars
     */
    public Long getNewbizDollars() {
        return newbizDollars;
    }

    /**
     * @return the newbizCount
     */
    public Long getNewbizCount() {
        return newbizCount;
    }

    /**
     * @return the paidDollars
     */
    public Long getPaidDollars() {
        return paidDollars;
    }

    /**
     * @return the whollyRetainedDollars
     */
    public Long getWhollyRetainedDollars() {
        return whollyRetainedDollars;
    }

    /**
     * @return the paidCount
     */
    public Long getPaidCount() {
        return paidCount;
    }

    /**
     * @return the paidThisMonthDollars
     */
    public Long getPaidThisMonthDollars() {
        return paidThisMonthDollars;
    }

    /**
     * @return the whollyRetainedThisMonthDollars
     */
    public Long getWhollyRetainedThisMonthDollars() {
        return whollyRetainedThisMonthDollars;
    }

    /**
     * @return the feesThisMonthDollars
     */
    public Long getFeesThisMonthDollars() {
        return feesThisMonthDollars;
    }

    /**
     * @return the paidThisMonthCount
     */
    public Long getPaidThisMonthCount() {
        return paidThisMonthCount;
    }

    /**
     * @return the paidInFullDollars
     */
    public Long getPaidInFullDollars() {
        return paidInFullDollars;
    }

    /**
     * @return the paidInFullCount
     */
    public Long getPaidInFullCount() {
        return paidInFullCount;
    }

    /**
     * @return the purgedDollars
     */
    public Long getPurgedDollars() {
        return purgedDollars;
    }

    /**
     * @return the purgedCount
     */
    public Long getPurgedCount() {
        return purgedCount;
    }

    /**
     * @return the returnedDollars
     */
    public Long getReturnedDollars() {
        return returnedDollars;
    }

    /**
     * @return the returnedCount
     */
    public Long getReturnedCount() {
        return returnedCount;
    }

    /**
     * @return the transferredInDollars
     */
    public Long getTransferredInDollars() {
        return transferredInDollars;
    }

    /**
     * @return the transferredInCount
     */
    public Long getTransferredInCount() {
        return transferredInCount;
    }

    /**
     * @return the transferredOutDollars
     */
    public Long getTransferredOutDollars() {
        return transferredOutDollars;
    }

    /**
     * @return the transferredOutCount
     */
    public Long getTransferredOutCount() {
        return transferredOutCount;
    }

    /**
     * @return the courtCostsCharged
     */
    public Long getCourtCostsCharged() {
        return courtCostsCharged;
    }

    /**
     * @return the courtCostsReturned
     */
    public Long getCourtCostsReturned() {
        return courtCostsReturned;
    }

    /**
     * @return the internalCourtCostsCharged
     */
    public Long getInternalCourtCostsCharged() {
        return internalCourtCostsCharged;
    }

    /**
     * @return the internalCourtCostsReturned
     */
    public Long getInternalCourtCostsReturned() {
        return internalCourtCostsReturned;
    }

    /**
     * @return the fees
     */
    public Long getFees() {
        return fees;
    }

    /**
     * @return the adjustments
     */
    public Long getAdjustments() {
        return adjustments;
    }

    /**
     * @return the attorneyFees
     */
    public Long getAttorneyFees() {
        return attorneyFees;
    }

    /**
     * @return the forwarderFees
     */
    public Long getForwarderFees() {
        return forwarderFees;
    }

    /**
     * @return the laborCosts
     */
    public Long getLaborCosts() {
        return laborCosts;
    }

    /**
     * @return the nonLaborCosts
     */
    public Long getNonLaborCosts() {
        return nonLaborCosts;
    }

    /**
     * @return the mailingCosts
     */
    public Long getMailingCosts() {
        return mailingCosts;
    }

    /**
     * @param year the year to set
     */
    protected void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @param month the month to set
     */
    protected void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * @param receivablesThisMonth the receivablesThisMonth to set
     */
    protected void setReceivablesThisMonth(Long receivablesThisMonth) {
        this.receivablesThisMonth = receivablesThisMonth;
    }


    /**
     * @param dateThru the dateThru to set
     */
    protected void setDateThru(GregorianCalendar dateThru) {
        this.dateThru = dateThru;
    }

    /**
     * @param newbizDollars the newbizDollars to set
     */
    protected void setNewbizDollars(Long newbizDollars) {
        this.newbizDollars = newbizDollars;
    }

    /**
     * @param newbizCount the newbizCount to set
     */
    protected void setNewbizCount(Long newbizCount) {
        this.newbizCount = newbizCount;
    }

    /**
     * @param paidDollars the paidDollars to set
     */
    protected void setPaidDollars(Long paidDollars) {
        this.paidDollars = paidDollars;
    }

    /**
     * @param whollyRetainedDollars the whollyRetainedDollars to set
     */
    protected void setWhollyRetainedDollars(Long whollyRetainedDollars) {
        this.whollyRetainedDollars = whollyRetainedDollars;
    }

    /**
     * @param paidCount the paidCount to set
     */
    protected void setPaidCount(Long paidCount) {
        this.paidCount = paidCount;
    }

    /**
     * @param paidThisMonthDollars the paidThisMonthDollars to set
     */
    protected void setPaidThisMonthDollars(Long paidThisMonthDollars) {
        this.paidThisMonthDollars = paidThisMonthDollars;
    }

    /**
     * @param whollyRetainedThisMonthDollars the whollyRetainedThisMonthDollars to set
     */
    protected void setWhollyRetainedThisMonthDollars(Long whollyRetainedThisMonthDollars) {
        this.whollyRetainedThisMonthDollars = whollyRetainedThisMonthDollars;
    }

    /**
     * @param feesThisMonthDollars the feesThisMonthDollars to set
     */
    protected void setFeesThisMonthDollars(Long feesThisMonthDollars) {
        this.feesThisMonthDollars = feesThisMonthDollars;
    }

    /**
     * @param paidThisMonthCount the paidThisMonthCount to set
     */
    protected void setPaidThisMonthCount(Long paidThisMonthCount) {
        this.paidThisMonthCount = paidThisMonthCount;
    }

    /**
     * @param paidInFullDollars the paidInFullDollars to set
     */
    protected void setPaidInFullDollars(Long paidInFullDollars) {
        this.paidInFullDollars = paidInFullDollars;
    }

    /**
     * @param paidInFullCount the paidInFullCount to set
     */
    protected void setPaidInFullCount(Long paidInFullCount) {
        this.paidInFullCount = paidInFullCount;
    }

    /**
     * @param purgedDollars the purgedDollars to set
     */
    protected void setPurgedDollars(Long purgedDollars) {
        this.purgedDollars = purgedDollars;
    }

    /**
     * @param purgedCount the purgedCount to set
     */
    protected void setPurgedCount(Long purgedCount) {
        this.purgedCount = purgedCount;
    }

    /**
     * @param returnedDollars the returnedDollars to set
     */
    protected void setReturnedDollars(Long returnedDollars) {
        this.returnedDollars = returnedDollars;
    }

    /**
     * @param returnedCount the returnedCount to set
     */
    protected void setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
    }

    /**
     * @param transferredInDollars the transferredInDollars to set
     */
    protected void setTransferredInDollars(Long transferredInDollars) {
        this.transferredInDollars = transferredInDollars;
    }

    /**
     * @param transferredInCount the transferredInCount to set
     */
    protected void setTransferredInCount(Long transferredInCount) {
        this.transferredInCount = transferredInCount;
    }

    /**
     * @param transferredOutDollars the transferredOutDollars to set
     */
    protected void setTransferredOutDollars(Long transferredOutDollars) {
        this.transferredOutDollars = transferredOutDollars;
    }

    /**
     * @param transferredOutCount the transferredOutCount to set
     */
    protected void setTransferredOutCount(Long transferredOutCount) {
        this.transferredOutCount = transferredOutCount;
    }

    /**
     * @param courtCostsCharged the courtCostsCharged to set
     */
    protected void setCourtCostsCharged(Long courtCostsCharged) {
        this.courtCostsCharged = courtCostsCharged;
    }

    /**
     * @param courtCostsReturned the courtCostsReturned to set
     */
    protected void setCourtCostsReturned(Long courtCostsReturned) {
        this.courtCostsReturned = courtCostsReturned;
    }

    /**
     * @param internalCourtCostsCharged the internalCourtCostsCharged to set
     */
    protected void setInternalCourtCostsCharged(Long internalCourtCostsCharged) {
        this.internalCourtCostsCharged = internalCourtCostsCharged;
    }

    /**
     * @param internalCourtCostsReturned the internalCourtCostsReturned to set
     */
    protected void setInternalCourtCostsReturned(Long internalCourtCostsReturned) {
        this.internalCourtCostsReturned = internalCourtCostsReturned;
    }

    /**
     * @param fees the fees to set
     */
    protected void setFees(Long fees) {
        this.fees = fees;
    }

    /**
     * @param adjustments the adjustments to set
     */
    protected void setAdjustments(Long adjustments) {
        this.adjustments = adjustments;
    }

    /**
     * @param attorneyFees the attorneyFees to set
     */
    protected void setAttorneyFees(Long attorneyFees) {
        this.attorneyFees = attorneyFees;
    }

    /**
     * @param forwarderFees the forwarderFees to set
     */
    protected void setForwarderFees(Long forwarderFees) {
        this.forwarderFees = forwarderFees;
    }

    /**
     * @param laborCosts the laborCosts to set
     */
    protected void setLaborCosts(Long laborCosts) {
        this.laborCosts = laborCosts;
    }

    /**
     * @param nonLaborCosts the nonLaborCosts to set
     */
    protected void setNonLaborCosts(Long nonLaborCosts) {
        this.nonLaborCosts = nonLaborCosts;
    }

    /**
     * @param mailingCosts the mailingCosts to set
     */
    protected void setMailingCosts(Long mailingCosts) {
        this.mailingCosts = mailingCosts;
    }
    
    //Action methods begin here.

    /**
     *
     * @param newDebt
     * @return
     */
    public int addDebt(Debt newDebt){
        return 0;
    }

    /**
     *
     * @param debt
     * @return
     */
    public int cancelDebt(Debt debt){
        return 0;
    }

    /**
     *
     * @param debt
     * @return
     */
//    public int returnDebt(Debt debt){
//        return 0;
 //   }

    /**
     *
     * @param newPayment
     * @return
     */
    public int applyPayment(Payment newPayment){
        return 0;
    }

    /**
     *
     * @param newPayment
     * @return
     */
    public int reversePayment(Payment newPayment){
        return 0;
    }
}
