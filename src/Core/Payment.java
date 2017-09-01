package Core;

import java.util.GregorianCalendar;

/**
 *
 * @author odin
 */


public class Payment {
    private Long paymentSequence;
    private GregorianCalendar paymentDate;
    private Debt paidOn;
    private Long[] paidAmt;
    private Long paymentType;
    private Long paymentSubtype;
    private boolean applied;    // Has this payment been applied to the debt?
    private boolean invoiced;   // Has the client been invoiced?
    // Has this payment been counted in the client statistics?
    private boolean inClientStatistics; 
    // Has this payment been counted in the collector statistics?
    private boolean inCollectorStatistics;
    private GregorianCalendar invoicedDate;

    // Programming Inerface

    /**
     * Apply this payment. This method applies the payment to the relevant Debt,
     * and will update everything else (Client and Collector statistics, etc)
     * at the same time. It will also give the Debtor owning the Debt a chance
     * to update it's status, (for example, to Paid In Full) by sending a 
     * message. On successful completion, the applied and in...Statistics flags
     * are set appropriately, to make sure this payment is not inadvertently 
     * processed again.
     * @return
     */
    public int applyPayment(){
        return 0;
    }

    /**
     * Reverse this payments. This method remove the payment from the relevant
     * debt and will update everything else at the same time. Like applyPayment,
     * this method will give the Debtor owning the debt a chance to update its
     * status. On successful completion, the applied and in...Statistics flags
     * are cleared appropriately
     * @return 
     */
    public int reversePayment(){
        return 0;
    }
    /**
     * Invoice this payment. This is normally done as the typical close of 
     * period processing, when statements and invoices are produced to send to
     * the clients. On successful completion, the invoiced flag is set so that 
     * this payment will not be reported accidentally in the future. Since it is
     * totally appropriate for already invoiced payments to by re-reported if
     * something happens to the original invoice, the invoicedDate field allows
     * for invoiced payments that were invoiced on a specified date to be 
     * re-reported on demand.
     * @return
     */
    public int invoicePayment(){
        return 0;
    }
    
    // Accessors and Mutators
    /**
     * @return the paymentSequence
     */
    public Long getPaymentSequence() {
        return paymentSequence;
    }

    /**
     * @return the paymentDate
     */
    public GregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * @return the paidOn
     */
    public Debt getPaidOn() {
        return paidOn;
    }

    /**
     * @return the paidAmt
     */
    public Long[] getPaidAmt() {
        return paidAmt;
    }

    /**
     * @return the paymentType
     */
    public Long getPaymentType() {
        return paymentType;
    }

    /**
     * @return the paymentSubtype
     */
    public Long getPaymentSubtype() {
        return paymentSubtype;
    }

    /**
     * @return the applied
     */
    public boolean isApplied() {
        return applied;
    }

    /**
     * @return the invoiced
     */
    public boolean isInvoiced() {
        return invoiced;
    }

    /**
     * @return the inClientStatistics
     */
    public boolean isInClientStatistics() {
        return inClientStatistics;
    }

    /**
     * @return the inCollectorStatistics
     */
    public boolean isInCollectorStatistics() {
        return inCollectorStatistics;
    }

    /**
     * @param paymentSequence the paymentSequence to set
     */
    protected void setPaymentSequence(Long paymentSequence) {
        this.paymentSequence = paymentSequence;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    protected void setPaymentDate(GregorianCalendar paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @param paidOn the paidOn to set
     */
    protected void setPaidOn(Debt paidOn) {
        this.paidOn = paidOn;
    }

    /**
     * @param paidAmt the paidAmt to set
     */
    protected void setPaidAmt(Long[] paidAmt) {
        this.paidAmt = paidAmt;
    }

    /**
     * @param paymentType the paymentType to set
     */
    protected void setPaymentType(Long paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @param paymentSubtype the paymentSubtype to set
     */
    protected void setPaymentSubtype(Long paymentSubtype) {
        this.paymentSubtype = paymentSubtype;
    }

    /**
     * @param applied the applied to set
     */
    protected void setApplied(boolean applied) {
        this.applied = applied;
    }

    /**
     * @param invoiced the invoiced to set
     */
    protected void setInvoiced(boolean invoiced) {
        this.invoiced = invoiced;
    }

    /**
     * @param inClientStatistics the inClientStatistics to set
     */
    protected void setInClientStatistics(boolean inClientStatistics) {
        this.inClientStatistics = inClientStatistics;
    }

    /**
     * @param inCollectorStatistics the inCollectorStatistics to set
     */
    protected void setInCollectorStatistics(boolean inCollectorStatistics) {
        this.inCollectorStatistics = inCollectorStatistics;
    }

    /**
     * @return the invoicedDate
     */
    public GregorianCalendar getInvoicedDate() {
        return invoicedDate;
    }

    /**
     * @param invoicedDate the invoicedDate to set
     */
    protected void setInvoicedDate(GregorianCalendar invoicedDate) {
        this.invoicedDate = invoicedDate;
    }
    
    
}
