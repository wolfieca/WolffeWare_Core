package Core;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Client represents clients of the company. 
 * @author odin
 */


public class Client {
    private long uid;
    private long office;
    private long number;
    private String alpha;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private Integer zip;
    private Integer smallBalanceLetterSeries;
    private Integer smallBalanceAmount;
    private Integer largeBalanceLetterSeries;
    private FeeSchedule feeSchedule;
    private Actor salesPerson;
    private ClassOfBusiness businessClass;
    private GregorianCalendar dateOfLastNewbiz;
    private Long collectorCodes;
    private Short daysAfterClose;
    private Short daysAfterReturn;

    /**
     *
     */
    public enum  reportSeparation{

        /**
         *
         */
        NO_SEPARATION,

        /**
         *
         */
        CLIENT_OFFICE,

        /**
         *
         */
        COLLECTOR_OFFICE
    }
    private reportSeparation separateReports;
    private Boolean printFeeTypeOnInvoice;
    private Boolean sendSuitLetter;
    private Long minCheckAmount;
    // Flags2 Fields
    private Boolean allowClientREferenceMatch;
    private Boolean commercialClient;
    private Boolean produceServiceTypeReport;
    private Boolean keepClientStatistics;
    private Boolean useCreditBureauReporting;
    private Boolean chargeSalesTax;
    private Boolean sendAckowledgment;
    private Boolean suppressReturnList;

    /**
     *
     */
    public enum billingTypes{

        /**
         *
         */
        NET,

        /**
         *
         */
        GROSS,

        /**
         *
         */
        OTHER
    }
    private billingTypes billingType;

    /**
     *
     */
    public enum collectionChargeTypes {

        /**
         *
         */
        NONE,

        /**
         *
         */
        PERCENT,

        /**
         *
         */
        FEE,

        /**
         *
         */
        BOTH
    }
    private collectionChargeTypes collectionCharge;
    private Boolean printOriginalBalanceOnInvoice;
    private Boolean printDetailClientSubtotals;
    private Boolean printCOllectorOfficeSubtotals;
    private Boolean printPageBreakForInvoice;
    private Boolean netAccrossInvoiceCycles;
    private Boolean separateInvoiceDebtor;
    private Boolean autoMatch;
    private Boolean matchSelfOnly;

    /**
     *
     */
    public enum returnOrderSequences {

        /**
         *
         */
        BY_NAME,

        /**
         *
         */
        BY_CLI_REF,

        /**
         *
         */
        BY_FOR
    }
    private returnOrderSequences returnOrderSequence;

    /**
     *
     */
    public enum returnPrintFormats {

        /**
         *
         */
        DETAILED,

        /**
         *
         */
        INDIVIDUAL,

        /**
         *
         */
        BORTH
    }
    private returnPrintFormats returnPrintFormat;
    private Long addressCorrectionLimit;
    private Short matchLevel;
    private Short initStrategy;
    private String billingName;
    private String billingAddress1;
    private String billingAddress2;
    private String billingCity;
    private String billingState;
    private Integer billingZip;
    private String attentionName;
    private String clientReferenceNumber;
    private String clientReferenceFormat;
    private String invoiceWindow;
    private Boolean checkDigitVerification;
    private String checkDigitFormula;
    private Boolean clientAccountReport;
    private Boolean printZeroNegBalance;
    private Boolean debtorInventoryReport;
    private Boolean printDebtorBalance;
    private Boolean printForField;
    private Boolean printPaymentBreakdown;
    private Boolean printPayComment;
    private Boolean printDateReceived;

    /**
     *
     */
    public enum invoiceCycles{

        /**
         *
         */
        MONTHLY,

        /**
         *
         */
        ANNUALLY,

        /**
         *
         */
        QUARTERLY,

        /**
         *
         */
        SEMIANNUALLY,

        /**
         *
         */
        ONDEMAND
    }
    private invoiceCycles invoiceCycle;
    private Short bankCode;

    /**
     *
     */
    public enum invoiceSequence {

        /**
         *
         */
        NONE,

        /**
         *
         */
        ALPHABETICAL,

        /**
         *
         */
        NUMERIC,

        /**
         *
         */
        FOR,

        /**
         *
         */
        CLIENT_NUMBER,

        /**
         *
         */
        PAYMENT_TYPE,

        /**
         *
         */
        DATE,

        /**
         *
         */
        COLLECTION_OFFICE
    }
    private invoiceSequence primaryInvoiceSequence;
    private invoiceSequence secondaryInvoiceSequence;
    private invoiceSequence tertiaryInvoiceSequence;
    private invoiceSequence quaternaryInvoiceSequence;
    private invoiceSequence pentenaryInvoiceSequence;
    private Boolean noCommissionIfFeeLT100;
    private Boolean noCommissionIfNoPlacementLast6Months;

    /**
     *
     */
    public enum openItemStatements{

        /**
         *
         */
        OPEN_ITEM_ONLY,

        /**
         *
         */
        ACTIVITY,

        /**
         *
         */
        BOTH,

        /**
         *
         */
        NEITHER
    }
    private openItemStatements openItemStatement;
    private Boolean consolidateReports;
    private Boolean printPaymentDateOnReversals;
    private Boolean putRecordInReturnFile;
    private Boolean preCollect;
    private Boolean feesByState;

    /**
     *
     */
    public enum acknowledgmentSequences{

        /**
         *
         */
        ALPHABETICAL,

        /**
         *
         */
        NUMERIC,

        /**
         *
         */
        FOR
    }
    private Boolean chargeByLetter;
    private Boolean payeeTypeRecord;
    private Boolean changeStrategyIfMailReturn;
    private Integer preCollectOffice;
    private Integer preCollectClient;
    private Long preCollectMinimumBalance;
    private Integer consolidationOffice;
    private Integer consolidationClient;
    private Short sCopies;
    private Short individualAcknowledgmentCode;
    private Integer strategyWaitDays;

    /**
     *
     */
    public enum matchFlags{

        /**
         *
         */
        ONLY_SAME_MATCH_GROUP,

        /**
         *
         */
        ONLY_SAME_CONSOLIDATION_CLIENT,

        /**
         *
         */
        REACTIVATE_ACTIVATE_ON_MATCH
    }
    private matchFlags matchFlag;
    private Short matchGroup;
    private Short holdDays;
    private Boolean oversizeCliRefNumber;
    private Boolean collectionChargeOnRollovers;
    private Boolean acceptBalancesLT0;
    private Boolean printCliDLCOnInvoice;
    private Boolean allowNewbiz;
    private Boolean lastInterestDateOnInvoice;
    private Boolean paymentSubtypeOnInvoice;
    private Boolean faxAcknowledgment;
    private Boolean doubleSpaceInvoice;
    private Boolean retainSetupDocuments;
    private Boolean returnSetupDocuments;
    private Boolean advanceCourtCosts;
    private Boolean debtorSetupLabels;
    private Boolean changeFeeScheduleOnMove;
    private Boolean blanketPermissionToSue;
    private Boolean pageSubtotalsOnInvoices;
    private String comments;
    private Long minimumBalance;
    private Short daysToWait;
    private Long preCollectFeePerAccount;
    private Short statementType;
    private String billingAttentionName;
    private String clientDigitWeightFactor;
    private char invoiceCycleName;

    /**
     *
     */
    public enum ReversalMethods{

        /**
         *
         */
        BILL_PAYMENT_MINUS_FEE,

        /**
         *
         */
        EXACT_REVERSAL,

        /**
         *
         */
        REFUND_FEE_BILL_PAYMENT
    }
    private ReversalMethods reversalMethod;
    private Boolean electronicFundsTransfer;

    /**
     *
     */
    public enum ScreenFiveTypes{

        /**
         *
         */
        NONE,

        /**
         *
         */
        RPS_CLIENT,

        /**
         *
         */
        LEAD_TRACKED,

        /**
         *
         */
        CHECK_VALIDATION,

        /**
         *
         */
        SPECIAL_FEES
    }
    private ScreenFiveTypes screenFiveType;
    private Integer fax;
    private Long[]  aging;  // Aging is fixed in size at 5 entries
    private HashMap<String,ClientStats> cliStats;
    private HashMap<String,ClientStats> cliStats2;
    private ArrayList<Debt> clientDebts;
    
    // Begin Methods

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @return the office
     */
    public long getOffice() {
        return office;
    }

    /**
     * @return the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * @return the alpha
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the zip
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * @return the smallBalanceLetterSeries
     */
    public Integer getSmallBalanceLetterSeries() {
        return smallBalanceLetterSeries;
    }

    /**
     * @return the smallBalanceAmount
     */
    public Integer getSmallBalanceAmount() {
        return smallBalanceAmount;
    }

    /**
     * @return the largeBalanceLetterSeries
     */
    public Integer getLargeBalanceLetterSeries() {
        return largeBalanceLetterSeries;
    }

    /**
     * @return the feeSchedule
     */
    public FeeSchedule getFeeSchedule() {
        return feeSchedule;
    }

    /**
     * @return the salesPerson
     */
    public Actor getSalesPerson() {
        return salesPerson;
    }

    /**
     * @return the businessClass
     */
    public ClassOfBusiness getBusinessClass() {
        return businessClass;
    }

    /**
     * @return the dateOfLastNewbiz
     */
    public GregorianCalendar getDateOfLastNewbiz() {
        return dateOfLastNewbiz;
    }

    /**
     * @return the collectorCodes
     */
    public Long getCollectorCodes() {
        return collectorCodes;
    }

    /**
     * @return the daysAfterClose
     */
    public Short getDaysAfterClose() {
        return daysAfterClose;
    }

    /**
     * @return the daysAfterReturn
     */
    public Short getDaysAfterReturn() {
        return daysAfterReturn;
    }

    /**
     * @return the separateReports
     */
    public reportSeparation getSeparateReports() {
        return separateReports;
    }

    /**
     * @return the printFeeTypeOnInvoice
     */
    public Boolean getPrintFeeTypeOnInvoice() {
        return printFeeTypeOnInvoice;
    }

    /**
     * @return the sendSuitLetter
     */
    public Boolean getSendSuitLetter() {
        return sendSuitLetter;
    }

    /**
     * @return the minCheckAmount
     */
    public Long getMinCheckAmount() {
        return minCheckAmount;
    }

    /**
     * @return the allowClientREferenceMatch
     */
    public Boolean getAllowClientREferenceMatch() {
        return allowClientREferenceMatch;
    }

    /**
     * @return the commercialClient
     */
    public Boolean getCommercialClient() {
        return commercialClient;
    }

    /**
     * @return the produceServiceTypeReport
     */
    public Boolean getProduceServiceTypeReport() {
        return produceServiceTypeReport;
    }

    /**
     * @return the keepClientStatistics
     */
    public Boolean getKeepClientStatistics() {
        return keepClientStatistics;
    }

    /**
     * @return the useCreditBureauReporting
     */
    public Boolean getUseCreditBureauReporting() {
        return useCreditBureauReporting;
    }

    /**
     * @return the chargeSalesTax
     */
    public Boolean getChargeSalesTax() {
        return chargeSalesTax;
    }

    /**
     * @return the sendAckowledgment
     */
    public Boolean getSendAckowledgment() {
        return sendAckowledgment;
    }

    /**
     * @return the suppressReturnList
     */
    public Boolean getSuppressReturnList() {
        return suppressReturnList;
    }

    /**
     * @return the billingType
     */
    public billingTypes getBillingType() {
        return billingType;
    }

    /**
     * @return the collectionCharge
     */
    public collectionChargeTypes getCollectionCharge() {
        return collectionCharge;
    }

    /**
     * @return the printOriginalBalanceOnInvoice
     */
    public Boolean getPrintOriginalBalanceOnInvoice() {
        return printOriginalBalanceOnInvoice;
    }

    /**
     * @return the printDetailClientSubtotals
     */
    public Boolean getPrintDetailClientSubtotals() {
        return printDetailClientSubtotals;
    }

    /**
     * @return the printCOllectorOfficeSubtotals
     */
    public Boolean getPrintCOllectorOfficeSubtotals() {
        return printCOllectorOfficeSubtotals;
    }

    /**
     * @return the printPageBreakForInvoice
     */
    public Boolean getPrintPageBreakForInvoice() {
        return printPageBreakForInvoice;
    }

    /**
     * @return the netAccrossInvoiceCycles
     */
    public Boolean getNetAccrossInvoiceCycles() {
        return netAccrossInvoiceCycles;
    }

    /**
     * @return the separateInvoiceDebtor
     */
    public Boolean getSeparateInvoiceDebtor() {
        return separateInvoiceDebtor;
    }

    /**
     * @return the autoMatch
     */
    public Boolean getAutoMatch() {
        return autoMatch;
    }

    /**
     * @return the matchSelfOnly
     */
    public Boolean getMatchSelfOnly() {
        return matchSelfOnly;
    }

    /**
     * @return the returnOrderSequence
     */
    public returnOrderSequences getReturnOrderSequence() {
        return returnOrderSequence;
    }

    /**
     * @return the returnPrintFormat
     */
    public returnPrintFormats getReturnPrintFormat() {
        return returnPrintFormat;
    }

    /**
     * @return the addressCorrectionLimit
     */
    public Long getAddressCorrectionLimit() {
        return addressCorrectionLimit;
    }

    /**
     * @return the matchLevel
     */
    public Short getMatchLevel() {
        return matchLevel;
    }

    /**
     * @return the initStrategy
     */
    public Short getInitStrategy() {
        return initStrategy;
    }

    /**
     * @return the billingName
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * @return the billingAddress1
     */
    public String getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * @return the billingAddress2
     */
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * @return the billingCity
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * @return the billingState
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * @return the billingZip
     */
    public Integer getBillingZip() {
        return billingZip;
    }

    /**
     * @return the attentionName
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * @return the clientReferenceNumber
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * @return the clientReferenceFormat
     */
    public String getClientReferenceFormat() {
        return clientReferenceFormat;
    }

    /**
     * @return the invoiceWindow
     */
    public String getInvoiceWindow() {
        return invoiceWindow;
    }

    /**
     * @return the checkDigitVerification
     */
    public Boolean getCheckDigitVerification() {
        return checkDigitVerification;
    }

    /**
     * @return the checkDigitFormula
     */
    public String getCheckDigitFormula() {
        return checkDigitFormula;
    }

    /**
     * @return the clientAccountReport
     */
    public Boolean getClientAccountReport() {
        return clientAccountReport;
    }

    /**
     * @return the printZeroNegBalance
     */
    public Boolean getPrintZeroNegBalance() {
        return printZeroNegBalance;
    }

    /**
     * @return the debtorInventoryReport
     */
    public Boolean getDebtorInventoryReport() {
        return debtorInventoryReport;
    }

    /**
     * @return the printDebtorBalance
     */
    public Boolean getPrintDebtorBalance() {
        return printDebtorBalance;
    }

    /**
     * @return the printForField
     */
    public Boolean getPrintForField() {
        return printForField;
    }

    /**
     * @return the printPaymentBreakdown
     */
    public Boolean getPrintPaymentBreakdown() {
        return printPaymentBreakdown;
    }

    /**
     * @return the printPayComment
     */
    public Boolean getPrintPayComment() {
        return printPayComment;
    }

    /**
     * @return the printDateReceived
     */
    public Boolean getPrintDateReceived() {
        return printDateReceived;
    }

    /**
     * @return the invoiceCycle
     */
    public invoiceCycles getInvoiceCycle() {
        return invoiceCycle;
    }

    /**
     * @return the bankCode
     */
    public Short getBankCode() {
        return bankCode;
    }

    /**
     * @return the primaryInvoiceSequence
     */
    public invoiceSequence getPrimaryInvoiceSequence() {
        return primaryInvoiceSequence;
    }

    /**
     * @return the secondaryInvoiceSequence
     */
    public invoiceSequence getSecondaryInvoiceSequence() {
        return secondaryInvoiceSequence;
    }

    /**
     * @return the tertiaryInvoiceSequence
     */
    public invoiceSequence getTertiaryInvoiceSequence() {
        return tertiaryInvoiceSequence;
    }

    /**
     * @return the quaternaryInvoiceSequence
     */
    public invoiceSequence getQuaternaryInvoiceSequence() {
        return quaternaryInvoiceSequence;
    }

    /**
     * @return the pentenaryInvoiceSequence
     */
    public invoiceSequence getPentenaryInvoiceSequence() {
        return pentenaryInvoiceSequence;
    }

    /**
     * @return the noCommissionIfFeeLT100
     */
    public Boolean getNoCommissionIfFeeLT100() {
        return noCommissionIfFeeLT100;
    }

    /**
     * @return the noCommissionIfNoPlacementLast6Months
     */
    public Boolean getNoCommissionIfNoPlacementLast6Months() {
        return noCommissionIfNoPlacementLast6Months;
    }

    /**
     * @return the openItemStatement
     */
    public openItemStatements getOpenItemStatement() {
        return openItemStatement;
    }

    /**
     * @return the consolidateReports
     */
    public Boolean getConsolidateReports() {
        return consolidateReports;
    }

    /**
     * @return the printPaymentDateOnReversals
     */
    public Boolean getPrintPaymentDateOnReversals() {
        return printPaymentDateOnReversals;
    }

    /**
     * @return the putRecordInReturnFile
     */
    public Boolean getPutRecordInReturnFile() {
        return putRecordInReturnFile;
    }

    /**
     * @return the preCollect
     */
    public Boolean getPreCollect() {
        return preCollect;
    }

    /**
     * @return the feesByState
     */
    public Boolean getFeesByState() {
        return feesByState;
    }

    /**
     * @return the chargeByLetter
     */
    public Boolean getChargeByLetter() {
        return chargeByLetter;
    }

    /**
     * @return the payeeTypeRecord
     */
    public Boolean getPayeeTypeRecord() {
        return payeeTypeRecord;
    }

    /**
     * @return the changeStrategyIfMailReturn
     */
    public Boolean getChangeStrategyIfMailReturn() {
        return changeStrategyIfMailReturn;
    }

    /**
     * @return the preCollectOffice
     */
    public Integer getPreCollectOffice() {
        return preCollectOffice;
    }

    /**
     * @return the preCollectClient
     */
    public Integer getPreCollectClient() {
        return preCollectClient;
    }

    /**
     * @return the preCollectMinimumBalance
     */
    public Long getPreCollectMinimumBalance() {
        return preCollectMinimumBalance;
    }

    /**
     * @return the consolidationOffice
     */
    public Integer getConsolidationOffice() {
        return consolidationOffice;
    }

    /**
     * @return the consolidationClient
     */
    public Integer getConsolidationClient() {
        return consolidationClient;
    }

    /**
     * @return the sCopies
     */
    public Short getsCopies() {
        return sCopies;
    }

    /**
     * @return the individualAcknowledgmentCode
     */
    public Short getIndividualAcknowledgmentCode() {
        return individualAcknowledgmentCode;
    }

    /**
     * @return the strategyWaitDays
     */
    public Integer getStrategyWaitDays() {
        return strategyWaitDays;
    }

    /**
     * @return the matchFlag
     */
    public matchFlags getMatchFlag() {
        return matchFlag;
    }

    /**
     * @return the matchGroup
     */
    public Short getMatchGroup() {
        return matchGroup;
    }

    /**
     * @return the holdDays
     */
    public Short getHoldDays() {
        return holdDays;
    }

    /**
     * @return the oversizeCliRefNumber
     */
    public Boolean getOversizeCliRefNumber() {
        return oversizeCliRefNumber;
    }

    /**
     * @return the collectionChargeOnRollovers
     */
    public Boolean getCollectionChargeOnRollovers() {
        return collectionChargeOnRollovers;
    }

    /**
     * @return the acceptBalancesLT0
     */
    public Boolean getAcceptBalancesLT0() {
        return acceptBalancesLT0;
    }

    /**
     * @return the printCliDLCOnInvoice
     */
    public Boolean getPrintCliDLCOnInvoice() {
        return printCliDLCOnInvoice;
    }

    /**
     * @return the allowNewbiz
     */
    public Boolean getAllowNewbiz() {
        return allowNewbiz;
    }

    /**
     * @return the lastInterestDateOnInvoice
     */
    public Boolean getLastInterestDateOnInvoice() {
        return lastInterestDateOnInvoice;
    }

    /**
     * @return the paymentSubtypeOnInvoice
     */
    public Boolean getPaymentSubtypeOnInvoice() {
        return paymentSubtypeOnInvoice;
    }

    /**
     * @return the faxAcknowledgment
     */
    public Boolean getFaxAcknowledgment() {
        return faxAcknowledgment;
    }

    /**
     * @return the doubleSpaceInvoice
     */
    public Boolean getDoubleSpaceInvoice() {
        return doubleSpaceInvoice;
    }

    /**
     * @return the retainSetupDocuments
     */
    public Boolean getRetainSetupDocuments() {
        return retainSetupDocuments;
    }

    /**
     * @return the returnSetupDocuments
     */
    public Boolean getReturnSetupDocuments() {
        return returnSetupDocuments;
    }

    /**
     * @return the advanceCourtCosts
     */
    public Boolean getAdvanceCourtCosts() {
        return advanceCourtCosts;
    }

    /**
     * @return the debtorSetupLabels
     */
    public Boolean getDebtorSetupLabels() {
        return debtorSetupLabels;
    }

    /**
     * @return the changeFeeScheduleOnMove
     */
    public Boolean getChangeFeeScheduleOnMove() {
        return changeFeeScheduleOnMove;
    }

    /**
     * @return the blanketPermissionToSue
     */
    public Boolean getBlanketPermissionToSue() {
        return blanketPermissionToSue;
    }

    /**
     * @return the pageSubtotalsOnInvoices
     */
    public Boolean getPageSubtotalsOnInvoices() {
        return pageSubtotalsOnInvoices;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @return the minimumBalance
     */
    public Long getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * @return the daysToWait
     */
    public Short getDaysToWait() {
        return daysToWait;
    }

    /**
     * @return the preCollectFeePerAccount
     */
    public Long getPreCollectFeePerAccount() {
        return preCollectFeePerAccount;
    }

    /**
     * @return the statementType
     */
    public Short getStatementType() {
        return statementType;
    }

    /**
     * @return the billingAttentionName
     */
    public String getBillingAttentionName() {
        return billingAttentionName;
    }

    /**
     * @return the clientDigitWeightFactor
     */
    public String getClientDigitWeightFactor() {
        return clientDigitWeightFactor;
    }

    /**
     * @return the invoiceCycleName
     */
    public char getInvoiceCycleName() {
        return invoiceCycleName;
    }

    /**
     * @return the reversalMethod
     */
    public ReversalMethods getReversalMethod() {
        return reversalMethod;
    }

    /**
     * @return the electronicFundsTransfer
     */
    public Boolean getElectronicFundsTransfer() {
        return electronicFundsTransfer;
    }

    /**
     * @return the screenFiveType
     */
    public ScreenFiveTypes getScreenFiveType() {
        return screenFiveType;
    }

    /**
     * @return the fax
     */
    public Integer getFax() {
        return fax;
    }

    /**
     * @param uid the uid to set
     */
    protected void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @param office the office to set
     */
    protected void setOffice(long office) {
        this.office = office;
    }

    /**
     * @param number the number to set
     */
    protected void setNumber(long number) {
        this.number = number;
    }

    /**
     * @param alpha the alpha to set
     */
    protected void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @param address1 the address1 to set
     */
    protected void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @param address2 the address2 to set
     */
    protected void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @param city the city to set
     */
    protected void setCity(String city) {
        this.city = city;
    }

    /**
     * @param state the state to set
     */
    protected void setState(String state) {
        this.state = state;
    }

    /**
     * @param zip the zip to set
     */
    protected void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     * @param smallBalanceLetterSeries the smallBalanceLetterSeries to set
     */
    protected void setSmallBalanceLetterSeries(Integer smallBalanceLetterSeries) {
        this.smallBalanceLetterSeries = smallBalanceLetterSeries;
    }

    /**
     * @param smallBalanceAmount the smallBalanceAmount to set
     */
    protected void setSmallBalanceAmount(Integer smallBalanceAmount) {
        this.smallBalanceAmount = smallBalanceAmount;
    }

    /**
     * @param largeBalanceLetterSeries the largeBalanceLetterSeries to set
     */
    protected void setLargeBalanceLetterSeries(Integer largeBalanceLetterSeries) {
        this.largeBalanceLetterSeries = largeBalanceLetterSeries;
    }

    /**
     * @param feeSchedule the feeSchedule to set
     */
    protected void setFeeSchedule(FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    /**
     * @param salesPerson the salesPerson to set
     */
    protected void setSalesPerson(Actor salesPerson) {
        this.salesPerson = salesPerson;
    }

    /**
     * @param businessClass the businessClass to set
     */
    protected void setBusinessClass(ClassOfBusiness businessClass) {
        this.businessClass = businessClass;
    }

    /**
     * @param dateOfLastNewbiz the dateOfLastNewbiz to set
     */
    protected void setDateOfLastNewbiz(GregorianCalendar dateOfLastNewbiz) {
        this.dateOfLastNewbiz = dateOfLastNewbiz;
    }

    /**
     * @param collectorCodes the collectorCodes to set
     */
    protected void setCollectorCodes(Long collectorCodes) {
        this.collectorCodes = collectorCodes;
    }

    /**
     * @param daysAfterClose the daysAfterClose to set
     */
    protected void setDaysAfterClose(Short daysAfterClose) {
        this.daysAfterClose = daysAfterClose;
    }

    /**
     * @param daysAfterReturn the daysAfterReturn to set
     */
    protected void setDaysAfterReturn(Short daysAfterReturn) {
        this.daysAfterReturn = daysAfterReturn;
    }

    /**
     * @param separateReports the separateReports to set
     */
    protected void setSeparateReports(reportSeparation separateReports) {
        this.separateReports = separateReports;
    }

    /**
     * @param printFeeTypeOnInvoice the printFeeTypeOnInvoice to set
     */
    protected void setPrintFeeTypeOnInvoice(Boolean printFeeTypeOnInvoice) {
        this.printFeeTypeOnInvoice = printFeeTypeOnInvoice;
    }

    /**
     * @param sendSuitLetter the sendSuitLetter to set
     */
    protected void setSendSuitLetter(Boolean sendSuitLetter) {
        this.sendSuitLetter = sendSuitLetter;
    }

    /**
     * @param minCheckAmount the minCheckAmount to set
     */
    protected void setMinCheckAmount(Long minCheckAmount) {
        this.minCheckAmount = minCheckAmount;
    }

    /**
     * @param allowClientREferenceMatch the allowClientREferenceMatch to set
     */
    protected void setAllowClientREferenceMatch(Boolean allowClientREferenceMatch) {
        this.allowClientREferenceMatch = allowClientREferenceMatch;
    }

    /**
     * @param commercialClient the commercialClient to set
     */
    protected void setCommercialClient(Boolean commercialClient) {
        this.commercialClient = commercialClient;
    }

    /**
     * @param produceServiceTypeReport the produceServiceTypeReport to set
     */
    protected void setProduceServiceTypeReport(Boolean produceServiceTypeReport) {
        this.produceServiceTypeReport = produceServiceTypeReport;
    }

    /**
     * @param keepClientStatistics the keepClientStatistics to set
     */
    protected void setKeepClientStatistics(Boolean keepClientStatistics) {
        this.keepClientStatistics = keepClientStatistics;
    }

    /**
     * @param useCreditBureauReporting the useCreditBureauReporting to set
     */
    protected void setUseCreditBureauReporting(Boolean useCreditBureauReporting) {
        this.useCreditBureauReporting = useCreditBureauReporting;
    }

    /**
     * @param chargeSalesTax the chargeSalesTax to set
     */
    protected void setChargeSalesTax(Boolean chargeSalesTax) {
        this.chargeSalesTax = chargeSalesTax;
    }

    /**
     * @param sendAckowledgment the sendAckowledgment to set
     */
    protected void setSendAckowledgment(Boolean sendAckowledgment) {
        this.sendAckowledgment = sendAckowledgment;
    }

    /**
     * @param suppressReturnList the suppressReturnList to set
     */
    protected void setSuppressReturnList(Boolean suppressReturnList) {
        this.suppressReturnList = suppressReturnList;
    }

    /**
     * @param billingType the billingType to set
     */
    protected void setBillingType(billingTypes billingType) {
        this.billingType = billingType;
    }

    /**
     * @param collectionCharge the collectionCharge to set
     */
    protected void setCollectionCharge(collectionChargeTypes collectionCharge) {
        this.collectionCharge = collectionCharge;
    }

    /**
     * @param printOriginalBalanceOnInvoice the printOriginalBalanceOnInvoice to set
     */
    protected void setPrintOriginalBalanceOnInvoice(Boolean printOriginalBalanceOnInvoice) {
        this.printOriginalBalanceOnInvoice = printOriginalBalanceOnInvoice;
    }

    /**
     * @param printDetailClientSubtotals the printDetailClientSubtotals to set
     */
    protected void setPrintDetailClientSubtotals(Boolean printDetailClientSubtotals) {
        this.printDetailClientSubtotals = printDetailClientSubtotals;
    }

    /**
     * @param printCOllectorOfficeSubtotals the printCOllectorOfficeSubtotals to set
     */
    protected void setPrintCOllectorOfficeSubtotals(Boolean printCOllectorOfficeSubtotals) {
        this.printCOllectorOfficeSubtotals = printCOllectorOfficeSubtotals;
    }

    /**
     * @param printPageBreakForInvoice the printPageBreakForInvoice to set
     */
    protected void setPrintPageBreakForInvoice(Boolean printPageBreakForInvoice) {
        this.printPageBreakForInvoice = printPageBreakForInvoice;
    }

    /**
     * @param netAccrossInvoiceCycles the netAccrossInvoiceCycles to set
     */
    protected void setNetAccrossInvoiceCycles(Boolean netAccrossInvoiceCycles) {
        this.netAccrossInvoiceCycles = netAccrossInvoiceCycles;
    }

    /**
     * @param separateInvoiceDebtor the separateInvoiceDebtor to set
     */
    protected void setSeparateInvoiceDebtor(Boolean separateInvoiceDebtor) {
        this.separateInvoiceDebtor = separateInvoiceDebtor;
    }

    /**
     * @param autoMatch the autoMatch to set
     */
    protected void setAutoMatch(Boolean autoMatch) {
        this.autoMatch = autoMatch;
    }

    /**
     * @param matchSelfOnly the matchSelfOnly to set
     */
    protected void setMatchSelfOnly(Boolean matchSelfOnly) {
        this.matchSelfOnly = matchSelfOnly;
    }

    /**
     * @param returnOrderSequence the returnOrderSequence to set
     */
    protected void setReturnOrderSequence(returnOrderSequences returnOrderSequence) {
        this.returnOrderSequence = returnOrderSequence;
    }

    /**
     * @param returnPrintFormat the returnPrintFormat to set
     */
    protected void setReturnPrintFormat(returnPrintFormats returnPrintFormat) {
        this.returnPrintFormat = returnPrintFormat;
    }

    /**
     * @param addressCorrectionLimit the addressCorrectionLimit to set
     */
    protected void setAddressCorrectionLimit(Long addressCorrectionLimit) {
        this.addressCorrectionLimit = addressCorrectionLimit;
    }

    /**
     * @param matchLevel the matchLevel to set
     */
    protected void setMatchLevel(Short matchLevel) {
        this.matchLevel = matchLevel;
    }

    /**
     * @param initStrategy the initStrategy to set
     */
    protected void setInitStrategy(Short initStrategy) {
        this.initStrategy = initStrategy;
    }

    /**
     * @param billingName the billingName to set
     */
    protected void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    /**
     * @param billingAddress1 the billingAddress1 to set
     */
    protected void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    /**
     * @param billingAddress2 the billingAddress2 to set
     */
    protected void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    /**
     * @param billingCity the billingCity to set
     */
    protected void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * @param billingState the billingState to set
     */
    protected void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * @param billingZip the billingZip to set
     */
    protected void setBillingZip(Integer billingZip) {
        this.billingZip = billingZip;
    }

    /**
     * @param attentionName the attentionName to set
     */
    protected void setAttentionName(String attentionName) {
        this.attentionName = attentionName;
    }

    /**
     * @param clientReferenceNumber the clientReferenceNumber to set
     */
    protected void setClientReferenceNumber(String clientReferenceNumber) {
        this.clientReferenceNumber = clientReferenceNumber;
    }

    /**
     * @param clientReferenceFormat the clientReferenceFormat to set
     */
    protected void setClientReferenceFormat(String clientReferenceFormat) {
        this.clientReferenceFormat = clientReferenceFormat;
    }

    /**
     * @param invoiceWindow the invoiceWindow to set
     */
    protected void setInvoiceWindow(String invoiceWindow) {
        this.invoiceWindow = invoiceWindow;
    }

    /**
     * @param checkDigitVerification the checkDigitVerification to set
     */
    protected void setCheckDigitVerification(Boolean checkDigitVerification) {
        this.checkDigitVerification = checkDigitVerification;
    }

    /**
     * @param checkDigitFormula the checkDigitFormula to set
     */
    protected void setCheckDigitFormula(String checkDigitFormula) {
        this.checkDigitFormula = checkDigitFormula;
    }

    /**
     * @param clientAccountReport the clientAccountReport to set
     */
    protected void setClientAccountReport(Boolean clientAccountReport) {
        this.clientAccountReport = clientAccountReport;
    }

    /**
     * @param printZeroNegBalance the printZeroNegBalance to set
     */
    protected void setPrintZeroNegBalance(Boolean printZeroNegBalance) {
        this.printZeroNegBalance = printZeroNegBalance;
    }

    /**
     * @param debtorInventoryReport the debtorInventoryReport to set
     */
    protected void setDebtorInventoryReport(Boolean debtorInventoryReport) {
        this.debtorInventoryReport = debtorInventoryReport;
    }

    /**
     * @param printDebtorBalance the printDebtorBalance to set
     */
    protected void setPrintDebtorBalance(Boolean printDebtorBalance) {
        this.printDebtorBalance = printDebtorBalance;
    }

    /**
     * @param printForField the printForField to set
     */
    protected void setPrintForField(Boolean printForField) {
        this.printForField = printForField;
    }

    /**
     * @param printPaymentBreakdown the printPaymentBreakdown to set
     */
    protected void setPrintPaymentBreakdown(Boolean printPaymentBreakdown) {
        this.printPaymentBreakdown = printPaymentBreakdown;
    }

    /**
     * @param printPayComment the printPayComment to set
     */
    protected void setPrintPayComment(Boolean printPayComment) {
        this.printPayComment = printPayComment;
    }

    /**
     * @param printDateReceived the printDateReceived to set
     */
    protected void setPrintDateReceived(Boolean printDateReceived) {
        this.printDateReceived = printDateReceived;
    }

    /**
     * @param invoiceCycle the invoiceCycle to set
     */
    protected void setInvoiceCycle(invoiceCycles invoiceCycle) {
        this.invoiceCycle = invoiceCycle;
    }

    /**
     * @param bankCode the bankCode to set
     */
    protected void setBankCode(Short bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * @param primaryInvoiceSequence the primaryInvoiceSequence to set
     */
    protected void setPrimaryInvoiceSequence(invoiceSequence primaryInvoiceSequence) {
        this.primaryInvoiceSequence = primaryInvoiceSequence;
    }

    /**
     * @param secondaryInvoiceSequence the secondaryInvoiceSequence to set
     */
    protected void setSecondaryInvoiceSequence(invoiceSequence secondaryInvoiceSequence) {
        this.secondaryInvoiceSequence = secondaryInvoiceSequence;
    }

    /**
     * @param tertiaryInvoiceSequence the tertiaryInvoiceSequence to set
     */
    protected void setTertiaryInvoiceSequence(invoiceSequence tertiaryInvoiceSequence) {
        this.tertiaryInvoiceSequence = tertiaryInvoiceSequence;
    }

    /**
     * @param quaternaryInvoiceSequence the quaternaryInvoiceSequence to set
     */
    protected void setQuaternaryInvoiceSequence(invoiceSequence quaternaryInvoiceSequence) {
        this.quaternaryInvoiceSequence = quaternaryInvoiceSequence;
    }

    /**
     * @param pentenaryInvoiceSequence the pentenaryInvoiceSequence to set
     */
    protected void setPentenaryInvoiceSequence(invoiceSequence pentenaryInvoiceSequence) {
        this.pentenaryInvoiceSequence = pentenaryInvoiceSequence;
    }

    /**
     * @param noCommissionIfFeeLT100 the noCommissionIfFeeLT100 to set
     */
    protected void setNoCommissionIfFeeLT100(Boolean noCommissionIfFeeLT100) {
        this.noCommissionIfFeeLT100 = noCommissionIfFeeLT100;
    }

    /**
     * @param noCommissionIfNoPlacementLast6Months the noCommissionIfNoPlacementLast6Months to set
     */
    protected void setNoCommissionIfNoPlacementLast6Months(Boolean noCommissionIfNoPlacementLast6Months) {
        this.noCommissionIfNoPlacementLast6Months = noCommissionIfNoPlacementLast6Months;
    }

    /**
     * @param openItemStatement the openItemStatement to set
     */
    protected void setOpenItemStatement(openItemStatements openItemStatement) {
        this.openItemStatement = openItemStatement;
    }

    /**
     * @param consolidateReports the consolidateReports to set
     */
    protected void setConsolidateReports(Boolean consolidateReports) {
        this.consolidateReports = consolidateReports;
    }

    /**
     * @param printPaymentDateOnReversals the printPaymentDateOnReversals to set
     */
    protected void setPrintPaymentDateOnReversals(Boolean printPaymentDateOnReversals) {
        this.printPaymentDateOnReversals = printPaymentDateOnReversals;
    }

    /**
     * @param putRecordInReturnFile the putRecordInReturnFile to set
     */
    protected void setPutRecordInReturnFile(Boolean putRecordInReturnFile) {
        this.putRecordInReturnFile = putRecordInReturnFile;
    }

    /**
     * @param preCollect the preCollect to set
     */
    protected void setPreCollect(Boolean preCollect) {
        this.preCollect = preCollect;
    }

    /**
     * @param feesByState the feesByState to set
     */
    protected void setFeesByState(Boolean feesByState) {
        this.feesByState = feesByState;
    }

    /**
     * @param chargeByLetter the chargeByLetter to set
     */
    protected void setChargeByLetter(Boolean chargeByLetter) {
        this.chargeByLetter = chargeByLetter;
    }

    /**
     * @param payeeTypeRecord the payeeTypeRecord to set
     */
    protected void setPayeeTypeRecord(Boolean payeeTypeRecord) {
        this.payeeTypeRecord = payeeTypeRecord;
    }

    /**
     * @param changeStrategyIfMailReturn the changeStrategyIfMailReturn to set
     */
    protected void setChangeStrategyIfMailReturn(Boolean changeStrategyIfMailReturn) {
        this.changeStrategyIfMailReturn = changeStrategyIfMailReturn;
    }

    /**
     * @param preCollectOffice the preCollectOffice to set
     */
    protected void setPreCollectOffice(Integer preCollectOffice) {
        this.preCollectOffice = preCollectOffice;
    }

    /**
     * @param preCollectClient the preCollectClient to set
     */
    protected void setPreCollectClient(Integer preCollectClient) {
        this.preCollectClient = preCollectClient;
    }

    /**
     * @param preCollectMinimumBalance the preCollectMinimumBalance to set
     */
    protected void setPreCollectMinimumBalance(Long preCollectMinimumBalance) {
        this.preCollectMinimumBalance = preCollectMinimumBalance;
    }

    /**
     * @param consolidationOffice the consolidationOffice to set
     */
    protected void setConsolidationOffice(Integer consolidationOffice) {
        this.consolidationOffice = consolidationOffice;
    }

    /**
     * @param consolidationClient the consolidationClient to set
     */
    protected void setConsolidationClient(Integer consolidationClient) {
        this.consolidationClient = consolidationClient;
    }

    /**
     * @param sCopies the sCopies to set
     */
    protected void setsCopies(Short sCopies) {
        this.sCopies = sCopies;
    }

    /**
     * @param individualAcknowledgmentCode the individualAcknowledgmentCode to set
     */
    protected void setIndividualAcknowledgmentCode(Short individualAcknowledgmentCode) {
        this.individualAcknowledgmentCode = individualAcknowledgmentCode;
    }

    /**
     * @param strategyWaitDays the strategyWaitDays to set
     */
    protected void setStrategyWaitDays(Integer strategyWaitDays) {
        this.strategyWaitDays = strategyWaitDays;
    }

    /**
     * @param matchFlag the matchFlag to set
     */
    protected void setMatchFlag(matchFlags matchFlag) {
        this.matchFlag = matchFlag;
    }

    /**
     * @param matchGroup the matchGroup to set
     */
    protected void setMatchGroup(Short matchGroup) {
        this.matchGroup = matchGroup;
    }

    /**
     * @param holdDays the holdDays to set
     */
    protected void setHoldDays(Short holdDays) {
        this.holdDays = holdDays;
    }

    /**
     * @param oversizeCliRefNumber the oversizeCliRefNumber to set
     */
    protected void setOversizeCliRefNumber(Boolean oversizeCliRefNumber) {
        this.oversizeCliRefNumber = oversizeCliRefNumber;
    }

    /**
     * @param collectionChargeOnRollovers the collectionChargeOnRollovers to set
     */
    protected void setCollectionChargeOnRollovers(Boolean collectionChargeOnRollovers) {
        this.collectionChargeOnRollovers = collectionChargeOnRollovers;
    }

    /**
     * @param acceptBalancesLT0 the acceptBalancesLT0 to set
     */
    protected void setAcceptBalancesLT0(Boolean acceptBalancesLT0) {
        this.acceptBalancesLT0 = acceptBalancesLT0;
    }

    /**
     * @param printCliDLCOnInvoice the printCliDLCOnInvoice to set
     */
    protected void setPrintCliDLCOnInvoice(Boolean printCliDLCOnInvoice) {
        this.printCliDLCOnInvoice = printCliDLCOnInvoice;
    }

    /**
     * @param allowNewbiz the allowNewbiz to set
     */
    protected void setAllowNewbiz(Boolean allowNewbiz) {
        this.allowNewbiz = allowNewbiz;
    }

    /**
     * @param lastInterestDateOnInvoice the lastInterestDateOnInvoice to set
     */
    protected void setLastInterestDateOnInvoice(Boolean lastInterestDateOnInvoice) {
        this.lastInterestDateOnInvoice = lastInterestDateOnInvoice;
    }

    /**
     * @param paymentSubtypeOnInvoice the paymentSubtypeOnInvoice to set
     */
    protected void setPaymentSubtypeOnInvoice(Boolean paymentSubtypeOnInvoice) {
        this.paymentSubtypeOnInvoice = paymentSubtypeOnInvoice;
    }

    /**
     * @param faxAcknowledgment the faxAcknowledgment to set
     */
    protected void setFaxAcknowledgment(Boolean faxAcknowledgment) {
        this.faxAcknowledgment = faxAcknowledgment;
    }

    /**
     * @param doubleSpaceInvoice the doubleSpaceInvoice to set
     */
    protected void setDoubleSpaceInvoice(Boolean doubleSpaceInvoice) {
        this.doubleSpaceInvoice = doubleSpaceInvoice;
    }

    /**
     * @param retainSetupDocuments the retainSetupDocuments to set
     */
    protected void setRetainSetupDocuments(Boolean retainSetupDocuments) {
        this.retainSetupDocuments = retainSetupDocuments;
    }

    /**
     * @param returnSetupDocuments the returnSetupDocuments to set
     */
    protected void setReturnSetupDocuments(Boolean returnSetupDocuments) {
        this.returnSetupDocuments = returnSetupDocuments;
    }

    /**
     * @param advanceCourtCosts the advanceCourtCosts to set
     */
    protected void setAdvanceCourtCosts(Boolean advanceCourtCosts) {
        this.advanceCourtCosts = advanceCourtCosts;
    }

    /**
     * @param debtorSetupLabels the debtorSetupLabels to set
     */
    protected void setDebtorSetupLabels(Boolean debtorSetupLabels) {
        this.debtorSetupLabels = debtorSetupLabels;
    }

    /**
     * @param changeFeeScheduleOnMove the changeFeeScheduleOnMove to set
     */
    protected void setChangeFeeScheduleOnMove(Boolean changeFeeScheduleOnMove) {
        this.changeFeeScheduleOnMove = changeFeeScheduleOnMove;
    }

    /**
     * @param blanketPermissionToSue the blanketPermissionToSue to set
     */
    protected void setBlanketPermissionToSue(Boolean blanketPermissionToSue) {
        this.blanketPermissionToSue = blanketPermissionToSue;
    }

    /**
     * @param pageSubtotalsOnInvoices the pageSubtotalsOnInvoices to set
     */
    protected void setPageSubtotalsOnInvoices(Boolean pageSubtotalsOnInvoices) {
        this.pageSubtotalsOnInvoices = pageSubtotalsOnInvoices;
    }

    /**
     * @param comments the comments to set
     */
    protected void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @param minimumBalance the minimumBalance to set
     */
    protected void setMinimumBalance(Long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    /**
     * @param daysToWait the daysToWait to set
     */
    protected void setDaysToWait(Short daysToWait) {
        this.daysToWait = daysToWait;
    }

    /**
     * @param preCollectFeePerAccount the preCollectFeePerAccount to set
     */
    protected void setPreCollectFeePerAccount(Long preCollectFeePerAccount) {
        this.preCollectFeePerAccount = preCollectFeePerAccount;
    }

    /**
     * @param statementType the statementType to set
     */
    protected void setStatementType(Short statementType) {
        this.statementType = statementType;
    }

    /**
     * @param billingAttentionName the billingAttentionName to set
     */
    protected void setBillingAttentionName(String billingAttentionName) {
        this.billingAttentionName = billingAttentionName;
    }

    /**
     * @param clientDigitWeightFactor the clientDigitWeightFactor to set
     */
    protected void setClientDigitWeightFactor(String clientDigitWeightFactor) {
        this.clientDigitWeightFactor = clientDigitWeightFactor;
    }

    /**
     * @param invoiceCycleName the invoiceCycleName to set
     */
    protected void setInvoiceCycleName(char invoiceCycleName) {
        this.invoiceCycleName = invoiceCycleName;
    }

    /**
     * @param reversalMethod the reversalMethod to set
     */
    protected void setReversalMethod(ReversalMethods reversalMethod) {
        this.reversalMethod = reversalMethod;
    }

    /**
     * @param electronicFundsTransfer the electronicFundsTransfer to set
     */
    protected void setElectronicFundsTransfer(Boolean electronicFundsTransfer) {
        this.electronicFundsTransfer = electronicFundsTransfer;
    }

    /**
     * @param screenFiveType the screenFiveType to set
     */
    protected void setScreenFiveType(ScreenFiveTypes screenFiveType) {
        this.screenFiveType = screenFiveType;
    }

    /**
     * @param fax the fax to set
     */
    protected void setFax(Integer fax) {
        this.fax = fax;
    }

    /**
     * @return the aging
     */
    public Long[] getAging() {
        return aging;
    }

    /**
     * @return the cliStats
     */
    public HashMap<String,ClientStats> getCliStats() {
        return cliStats;
    }

    /**
     * @param aging the aging to set
     */
    protected void setAging(Long[] aging) {
        this.aging = aging;
    }

    /**
     * @param cliStats the cliStats to set
     */
    protected void setCliStats(HashMap<String,ClientStats>cliStats) {
        this.cliStats = cliStats;
    }

    /**
     * @param cliStats2 the cliStats2 to set
     */
    protected void setCliStats2(HashMap<String,ClientStats> cliStats2) {
        this.cliStats2 = cliStats2;
    }

    /**
     * @param clientDebts the clientDebts to set
     */
    protected void setClientDebts(ArrayList<Debt> clientDebts) {
        this.clientDebts = clientDebts;
    }

    /**
     * @return the cliStats2
     */
    public HashMap<String,ClientStats> getCliStats2() {
        return cliStats2;
    }

    /**
     * @return the clientDebts
     */
    public ArrayList<Debt> getClientDebts() {
        return clientDebts;
    }
    
    // General interface begins here

    /**
     *
     * @param month
     * @return
     */
    public Long newbizDollars(String month){
        return cliStats.get(month).getNewbizDollars();
    }
    
    /**
     *
     * @param newDebt
     * @return
     */
    public int add(Debt newDebt){
        clientDebts.add(newDebt);
        return 0;
    }

    /**
     *
     * @param newDebt
     * @return
     */
    public int remove(Debt newDebt){
        clientDebts.remove(newDebt);
        return 0;
    }
    
}
