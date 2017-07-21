package Core;

import java.util.GregorianCalendar;

/**
 * The System class contains a variety of system-wide objects and methods that
 * can be used to manage the system as a whole
 * @author odin
 */


public class System {

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
    private enum QuotaBase{
        GROSS,
        NET
    }
    private QuotaBase collectorQuotaBase;
    private boolean reorderDebts;
    private int keptMinPerc;
    private boolean inhibitMultiRoll;
    private int reminderLetterDays;
    private boolean reminderNSF;
    
    private String[] restrictedStates;
    private enum Forms{
        WIDE,
        NARROW,
        OTHER,
        LASER
    }
    private Forms statements;
    private Forms invoices;
    /**
     * The build version of the system.
     */
    public static final String BUILD = "0.01";
    
}
