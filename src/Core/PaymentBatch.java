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

import java.util.ArrayList;

/**
 * A payment batch is, as the name implies, a batch of payments. It is a group
 * of payments that were entered into the system together and are are related
 * in some way.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
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

    /**
     *
     * @param paymentBatchName
     */
    public PaymentBatch(String paymentBatchName){
        paymentBatchID = new Long(0);
        this.paymentBatchName=paymentBatchName;
        this.payments = new ArrayList<>();

    }

    /**
     *
     * @param newPayment
     * @return
     */
    public int addPayment(Payment newPayment){
        payments.add(newPayment);
        return 0;
    }
    
    /**
     *
     * @param newPayment
     * @return
     */
    public int deletePayment(Payment newPayment){
        payments.remove(newPayment);
        return 0;
    }

    /**
     *
     * @return
     */
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
