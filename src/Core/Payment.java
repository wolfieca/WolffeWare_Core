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
    
    
}
