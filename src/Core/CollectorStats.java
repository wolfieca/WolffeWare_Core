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

/**
 *
 * @author rserrano
 */
public class CollectorStats {
    //Unlike Wizard, since collector stats is managed and maintained by the
    //Collector class, I don't need to have the collector office or number in 
    //the stats object.
    private Integer year;
    private Integer month;
    private Long    newbizDollars;
    private Long    newbizCount;
    private Long    paidDollars;
    private Long    paidCount;
    private Long    paidThisMonthDollars; // Not part of the SU data
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

    // Action Methods. Though there is overlap between the functionality of the
    // accessor/mutator methods and these methods, these are the preferred
    // way of acting on the WW objects
    
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

}
