package Core;

import java.util.ArrayList;

/**
 * A payment batch is, as the name implies, a batch of payments. It is a group
 * of payments that were entered into the system together and are are related
 * in some way.
 * @author odin
 */


public class PaymentBatch {
    private Long paymentBatchID;
    private String paymentBatchName;
    private ArrayList<Payment> payments;

    /**
     * Default Constructor. Create an empty PaymentBatch.
     */
    public PaymentBatch(){
        paymentBatchID = new Long(0);
        paymentBatchName="";
        payments = new ArrayList<>();
    }
    public PaymentBatch(String paymentBatchName){
        paymentBatchID = new Long(0);
        this.paymentBatchName=paymentBatchName;
        this.payments = new ArrayList<>();

    }
    public int addPayment(Payment newPayment){
        payments.add(newPayment);
        return 0;
    }
    
    public int deletePayment(Payment newPayment){
        payments.remove(newPayment);
        return 0;
    }
    public int commit(){
        return 0;
    }
    /**
     * @param paymentBatchID the paymentBatchID to set
     */
    protected void setPaymentBatchID(Long paymentBatchID) {
        this.paymentBatchID = paymentBatchID;
    }

    /**
     * @param payments the payments to set
     */
    protected void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    /**
     * @return the paymentBatchID
     */
    public Long getPaymentBatchID() {
        return paymentBatchID;
    }

    /**
     * @return the payments
     */
    public ArrayList<Payment> getPayments() {
        return payments;
    }

    /**
     * @param paymentBatchName the paymentBatchName to set
     */
    protected void setPaymentBatchName(String paymentBatchName) {
        this.paymentBatchName = paymentBatchName;
    }

    /**
     * @return the paymentBatchName
     */
    public String getPaymentBatchName() {
        return paymentBatchName;
    }
    
    
    
}
