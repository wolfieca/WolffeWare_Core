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
 * The System class contains a variety of system-wide objects and methods that
 * can be used to manage the system as a whole. There is one, server-wide
 * System object instance that contains all of this information, and it can
 * only by modified by users with the correct permissions.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */


public class System extends WWBaseObject{

    private String[] moneyNames;
    private boolean[] simpleInterest;
    private boolean[] compoundInterest;
    private int collectionCharge;
    private int accumulatedInterest;
    private int billableCourtCosts;
    private int internalCourtCosts;
    private boolean closedAcctInterest;
    private GregorianCalendar fiscalMonth;
    private Long lastDebtorNumber;
    private Long lastInvoiceNumber;
    private Long lastInternalBatchNumber;
    private String validInvoiceCycles;

    /**
     *
     */
    public enum QuotaBase{

        /**
         *
         */
        GROSS,

        /**
         *
         */
        NET
    }
    private QuotaBase collectorQuotaBase;
    private boolean reorderDebts;
    private int keptMinPerc;
    private boolean inhibitMultiRoll;
    private int reminderLetterDays;
    private boolean reminderNSF;
    
    private String[] restrictedStates;

    /**
     *
     */
    public enum Forms{

        /**
         *
         */
        WIDE,

        /**
         *
         */
        NARROW,

        /**
         *
         */
        OTHER,

        /**
         *
         */
        LASER
    }
    private Forms statements;
    private Forms invoices;
    
    /**
     * The build version of the system.
     */
    private static String BUILD = "0.01";

    /**
     * @return the moneyNames
     */
    public String[] getMoneyNames() {
        return moneyNames;
    }

    /**
     * @return the simpleInterest
     */
    public boolean[] getSimpleInterest() {
        return simpleInterest;
    }

    /**
     * @return the compoundInterest
     */
    public boolean[] getCompoundInterest() {
        return compoundInterest;
    }

    /**
     * @return the collectionCharge
     */
    public int getCollectionCharge() {
        return collectionCharge;
    }

    /**
     * @return the accumulatedInterest
     */
    public int getAccumulatedInterest() {
        return accumulatedInterest;
    }

    /**
     * @return the billableCourtCosts
     */
    public int getBillableCourtCosts() {
        return billableCourtCosts;
    }

    /**
     * @return the internalCourtCosts
     */
    public int getInternalCourtCosts() {
        return internalCourtCosts;
    }

    /**
     * @return the closedAcctInterest
     */
    public boolean isClosedAcctInterest() {
        return closedAcctInterest;
    }

    /**
     * @return the fiscalMonth
     */
    public GregorianCalendar getFiscalMonth() {
        return fiscalMonth;
    }

    /**
     * @return the lastDebtorNumber
     */
    public Long getLastDebtorNumber() {
        return lastDebtorNumber;
    }

    /**
     * @return the lastInvoiceNumber
     */
    public Long getLastInvoiceNumber() {
        return lastInvoiceNumber;
    }

    /**
     * @return the lastInternalBatchNumber
     */
    public Long getLastInternalBatchNumber() {
        return lastInternalBatchNumber;
    }

    /**
     * @return the validInvoiceCycles
     */
    public String getValidInvoiceCycles() {
        return validInvoiceCycles;
    }

    /**
     * @return the collectorQuotaBase
     */
    public QuotaBase getCollectorQuotaBase() {
        return collectorQuotaBase;
    }

    /**
     * @return the reorderDebts
     */
    public boolean isReorderDebts() {
        return reorderDebts;
    }

    /**
     * @return the keptMinPerc
     */
    public int getKeptMinPerc() {
        return keptMinPerc;
    }

    /**
     * @return the inhibitMultiRoll
     */
    public boolean isInhibitMultiRoll() {
        return inhibitMultiRoll;
    }

    /**
     * @return the reminderLetterDays
     */
    public int getReminderLetterDays() {
        return reminderLetterDays;
    }

    /**
     * @return the reminderNSF
     */
    public boolean isReminderNSF() {
        return reminderNSF;
    }

    /**
     * @return the restrictedStates
     */
    public String[] getRestrictedStates() {
        return restrictedStates;
    }

    /**
     * @return the statements
     */
    public Forms getStatements() {
        return statements;
    }

    /**
     * @return the invoices
     */
    public Forms getInvoices() {
        return invoices;
    }

    /**
     * @return the BUILD
     */
    public static String getBUILD() {
        return BUILD;
    }

    /**
     * @param moneyNames the moneyNames to set
     */
    protected void setMoneyNames(String[] moneyNames) {
        this.moneyNames = moneyNames;
    }

    /**
     * @param simpleInterest the simpleInterest to set
     */
    protected void setSimpleInterest(boolean[] simpleInterest) {
        this.simpleInterest = simpleInterest;
    }

    /**
     * @param compoundInterest the compoundInterest to set
     */
    protected void setCompoundInterest(boolean[] compoundInterest) {
        this.compoundInterest = compoundInterest;
    }

    /**
     * @param collectionCharge the collectionCharge to set
     */
    protected void setCollectionCharge(int collectionCharge) {
        this.collectionCharge = collectionCharge;
    }

    /**
     * @param accumulatedInterest the accumulatedInterest to set
     */
    protected void setAccumulatedInterest(int accumulatedInterest) {
        this.accumulatedInterest = accumulatedInterest;
    }

    /**
     * @param billableCourtCosts the billableCourtCosts to set
     */
    protected void setBillableCourtCosts(int billableCourtCosts) {
        this.billableCourtCosts = billableCourtCosts;
    }

    /**
     * @param internalCourtCosts the internalCourtCosts to set
     */
    protected void setInternalCourtCosts(int internalCourtCosts) {
        this.internalCourtCosts = internalCourtCosts;
    }

    /**
     * @param closedAcctInterest the closedAcctInterest to set
     */
    protected void setClosedAcctInterest(boolean closedAcctInterest) {
        this.closedAcctInterest = closedAcctInterest;
    }

    /**
     * @param fiscalMonth the fiscalMonth to set
     */
    protected void setFiscalMonth(GregorianCalendar fiscalMonth) {
        this.fiscalMonth = fiscalMonth;
    }

    /**
     * @param lastDebtorNumber the lastDebtorNumber to set
     */
    protected void setLastDebtorNumber(Long lastDebtorNumber) {
        this.lastDebtorNumber = lastDebtorNumber;
    }

    /**
     * @param lastInvoiceNumber the lastInvoiceNumber to set
     */
    protected void setLastInvoiceNumber(Long lastInvoiceNumber) {
        this.lastInvoiceNumber = lastInvoiceNumber;
    }

    /**
     * @param lastInternalBatchNumber the lastInternalBatchNumber to set
     */
    protected void setLastInternalBatchNumber(Long lastInternalBatchNumber) {
        this.lastInternalBatchNumber = lastInternalBatchNumber;
    }

    /**
     * @param validInvoiceCycles the validInvoiceCycles to set
     */
    protected void setValidInvoiceCycles(String validInvoiceCycles) {
        this.validInvoiceCycles = validInvoiceCycles;
    }

    /**
     * @param collectorQuotaBase the collectorQuotaBase to set
     */
    protected void setCollectorQuotaBase(QuotaBase collectorQuotaBase) {
        this.collectorQuotaBase = collectorQuotaBase;
    }

    /**
     * @param reorderDebts the reorderDebts to set
     */
    protected void setReorderDebts(boolean reorderDebts) {
        this.reorderDebts = reorderDebts;
    }

    /**
     * @param keptMinPerc the keptMinPerc to set
     */
    protected void setKeptMinPerc(int keptMinPerc) {
        this.keptMinPerc = keptMinPerc;
    }

    /**
     * @param inhibitMultiRoll the inhibitMultiRoll to set
     */
    protected void setInhibitMultiRoll(boolean inhibitMultiRoll) {
        this.inhibitMultiRoll = inhibitMultiRoll;
    }

    /**
     * @param reminderLetterDays the reminderLetterDays to set
     */
    protected void setReminderLetterDays(int reminderLetterDays) {
        this.reminderLetterDays = reminderLetterDays;
    }

    /**
     * @param reminderNSF the reminderNSF to set
     */
    protected void setReminderNSF(boolean reminderNSF) {
        this.reminderNSF = reminderNSF;
    }

    /**
     * @param restrictedStates the restrictedStates to set
     */
    protected void setRestrictedStates(String[] restrictedStates) {
        this.restrictedStates = restrictedStates;
    }

    /**
     * @param statements the statements to set
     */
    protected void setStatements(Forms statements) {
        this.statements = statements;
    }

    /**
     * @param invoices the invoices to set
     */
    protected void setInvoices(Forms invoices) {
        this.invoices = invoices;
    }

    /**
     * @param aBUILD the BUILD to set
     */
    protected static void setBUILD(String aBUILD) {
        BUILD = aBUILD;
    }
    
}
