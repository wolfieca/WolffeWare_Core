/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * A Fee schedule. FeeSchedules reflect how fees/interest/etc are accumulated
 * and how payments are applied to individual debts.
 * @author rserrano
 */
public class FeeSchedule extends WWBaseObject{
    private Long    feeSchedID;
    private Long    schedule;
    private String  state;
    private String  title;
    private Short   forwardedPercent;
    private Short   attorneyPercent;
    private Short   mailReturnPercent;
    private Short   oldPercent;
    private Short   oldDays;
    private Short   interestPercent;
    private Boolean feePercentOnDebt;
    private Boolean interestBeforeReceipt;
    private Boolean useAttorney;
    private Boolean commercialAccount;
    private Boolean compoundInterest;
    private Short   collectorFeePercent;
    private Long    collectorChargeFlatFee;
    private Long    percentLimit;
    private Long    noLetterReturnToClientMinimum;
    private Short   salesTaxPercent;
    private PostingPriority[]   priority;
    private Short   daysNoFeesCharged;
    private Long[]  paymentLimits;
    private Short[] agencyPercents;
    private Long[]  minimumAgencyFees;
    private Long[]  maximumAgencyFees;
    public enum type{
        TOTAL_PAID,
        INCREMENTAL,
        ORIGINAL_BALANCE,
        ORIGINAL_PRINCIPAL_BALANCE,
        AGE_AT_PLACEMENT,
        AGE_SINCE_PLACEMENT,
        AGE_SINCE_ORIGINAL_CHARGE,
        COLLECTION_PERFORMANCE,
    }
    private Short[] returnDays;

    /**
     * @return the feeSchedID
     */
    public Long getFeeSchedID() {
        return feeSchedID;
    }

    /**
     * @return the schedule
     */
    public Long getSchedule() {
        return schedule;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the forwardedPercent
     */
    public Short getForwardedPercent() {
        return forwardedPercent;
    }

    /**
     * @return the attorneyPercent
     */
    public Short getAttorneyPercent() {
        return attorneyPercent;
    }

    /**
     * @return the mailReturnPercent
     */
    public Short getMailReturnPercent() {
        return mailReturnPercent;
    }

    /**
     * @return the oldPercent
     */
    public Short getOldPercent() {
        return oldPercent;
    }

    /**
     * @return the oldDays
     */
    public Short getOldDays() {
        return oldDays;
    }

    /**
     * @return the interestPercent
     */
    public Short getInterestPercent() {
        return interestPercent;
    }

    /**
     * @return the feePercentOnDebt
     */
    public Boolean getFeePercentOnDebt() {
        return feePercentOnDebt;
    }

    /**
     * @return the interestBeforeReceipt
     */
    public Boolean getInterestBeforeReceipt() {
        return interestBeforeReceipt;
    }

    /**
     * @return the useAttorney
     */
    public Boolean getUseAttorney() {
        return useAttorney;
    }

    /**
     * @return the commercialAccount
     */
    public Boolean getCommercialAccount() {
        return commercialAccount;
    }

    /**
     * @return the compoundInterest
     */
    public Boolean getCompoundInterest() {
        return compoundInterest;
    }

    /**
     * @return the collectorFeePercent
     */
    public Short getCollectorFeePercent() {
        return collectorFeePercent;
    }

    /**
     * @return the collectorChargeFlatFee
     */
    public Long getCollectorChargeFlatFee() {
        return collectorChargeFlatFee;
    }

    /**
     * @return the percentLimit
     */
    public Long getPercentLimit() {
        return percentLimit;
    }

    /**
     * @return the noLetterReturnToClientMinimum
     */
    public Long getNoLetterReturnToClientMinimum() {
        return noLetterReturnToClientMinimum;
    }

    /**
     * @return the salesTaxPercent
     */
    public Short getSalesTaxPercent() {
        return salesTaxPercent;
    }

    /**
     * @return the priority
     */
    public PostingPriority[] getPriority() {
        return priority;
    }

    /**
     * @return the daysNoFeesCharged
     */
    public Short getDaysNoFeesCharged() {
        return daysNoFeesCharged;
    }

    /**
     * @return the paymentLimits
     */
    public Long[] getPaymentLimits() {
        return paymentLimits;
    }

    /**
     * @return the agencyPercents
     */
    public Short[] getAgencyPercents() {
        return agencyPercents;
    }

    /**
     * @return the minimumAgencyFees
     */
    public Long[] getMinimumAgencyFees() {
        return minimumAgencyFees;
    }

    /**
     * @return the maximumAgencyFees
     */
    public Long[] getMaximumAgencyFees() {
        return maximumAgencyFees;
    }

    /**
     * @return the returnDays
     */
    public Short[] getReturnDays() {
        return returnDays;
    }

    //Setters should be used only for initialization of the FeeSchedule object
    /**
     * @param feeSchedID the feeSchedID to set
     */
    protected void setFeeSchedID(Long feeSchedID) {
        this.feeSchedID = feeSchedID;
    }

    /**
     * @param schedule the schedule to set
     */
    protected void setSchedule(Long schedule) {
        this.schedule = schedule;
    }

    /**
     * @param state the state to set
     */
    protected void setState(String state) {
        this.state = state;
    }

    /**
     * @param title the title to set
     */
    protected void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param forwardedPercent the forwardedPercent to set
     */
    protected void setForwardedPercent(Short forwardedPercent) {
        this.forwardedPercent = forwardedPercent;
    }

    /**
     * @param attorneyPercent the attorneyPercent to set
     */
    protected void setAttorneyPercent(Short attorneyPercent) {
        this.attorneyPercent = attorneyPercent;
    }

    /**
     * @param mailReturnPercent the mailReturnPercent to set
     */
    protected void setMailReturnPercent(Short mailReturnPercent) {
        this.mailReturnPercent = mailReturnPercent;
    }

    /**
     * @param oldPercent the oldPercent to set
     */
    protected void setOldPercent(Short oldPercent) {
        this.oldPercent = oldPercent;
    }

    /**
     * @param oldDays the oldDays to set
     */
    protected void setOldDays(Short oldDays) {
        this.oldDays = oldDays;
    }

    /**
     * @param interestPercent the interestPercent to set
     */
    protected void setInterestPercent(Short interestPercent) {
        this.interestPercent = interestPercent;
    }

    /**
     * @param feePercentOnDebt the feePercentOnDebt to set
     */
    protected void setFeePercentOnDebt(Boolean feePercentOnDebt) {
        this.feePercentOnDebt = feePercentOnDebt;
    }

    /**
     * @param interestBeforeReceipt the interestBeforeReceipt to set
     */
    protected void setInterestBeforeReceipt(Boolean interestBeforeReceipt) {
        this.interestBeforeReceipt = interestBeforeReceipt;
    }

    /**
     * @param useAttorney the useAttorney to set
     */
    protected void setUseAttorney(Boolean useAttorney) {
        this.useAttorney = useAttorney;
    }

    /**
     * @param commercialAccount the commercialAccount to set
     */
    protected void setCommercialAccount(Boolean commercialAccount) {
        this.commercialAccount = commercialAccount;
    }

    /**
     * @param compoundInterest the compoundInterest to set
     */
    protected void setCompoundInterest(Boolean compoundInterest) {
        this.compoundInterest = compoundInterest;
    }

    /**
     * @param collectorFeePercent the collectorFeePercent to set
     */
    protected void setCollectorFeePercent(Short collectorFeePercent) {
        this.collectorFeePercent = collectorFeePercent;
    }

    /**
     * @param collectorChargeFlatFee the collectorChargeFlatFee to set
     */
    protected void setCollectorChargeFlatFee(Long collectorChargeFlatFee) {
        this.collectorChargeFlatFee = collectorChargeFlatFee;
    }

    /**
     * @param percentLimit the percentLimit to set
     */
    protected void setPercentLimit(Long percentLimit) {
        this.percentLimit = percentLimit;
    }

    /**
     * @param noLetterReturnToClientMinimum the noLetterReturnToClientMinimum to set
     */
    protected void setNoLetterReturnToClientMinimum(Long noLetterReturnToClientMinimum) {
        this.noLetterReturnToClientMinimum = noLetterReturnToClientMinimum;
    }

    /**
     * @param salesTaxPercent the salesTaxPercent to set
     */
    protected void setSalesTaxPercent(Short salesTaxPercent) {
        this.salesTaxPercent = salesTaxPercent;
    }

    /**
     * @param priority the priority to set
     */
    protected void setPriority(PostingPriority[] priority) {
        this.priority = priority;
    }

    /**
     * @param daysNoFeesCharged the daysNoFeesCharged to set
     */
    protected void setDaysNoFeesCharged(Short daysNoFeesCharged) {
        this.daysNoFeesCharged = daysNoFeesCharged;
    }

    /**
     * @param paymentLimits the paymentLimits to set
     */
    protected void setPaymentLimits(Long[] paymentLimits) {
        this.paymentLimits = paymentLimits;
    }

    /**
     * @param agencyPercents the agencyPercents to set
     */
    protected void setAgencyPercents(Short[] agencyPercents) {
        this.agencyPercents = agencyPercents;
    }

    /**
     * @param minimumAgencyFees the minimumAgencyFees to set
     */
    protected void setMinimumAgencyFees(Long[] minimumAgencyFees) {
        this.minimumAgencyFees = minimumAgencyFees;
    }

    /**
     * @param maximumAgencyFees the maximumAgencyFees to set
     */
    protected void setMaximumAgencyFees(Long[] maximumAgencyFees) {
        this.maximumAgencyFees = maximumAgencyFees;
    }

    /**
     * @param returnDays the returnDays to set
     */
    protected void setReturnDays(Short[] returnDays) {
        this.returnDays = returnDays;
    }
}
