/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * The types of messages available to the system.
 * @author rserrano
 */
public enum MessageType {

    /**
     * A generic message. This is most likely intended to be sent from one
     * user to another.
     */
    MESSAGE,    // Generic message. Usually intra-user.

    /**
     * A request made to the system. Activity on referenced objects is held 
     * until the message is processed. 
     */
    ACTION,     // Synchronous request

    /**
     * An request made to the system. Activity on the reference objects can
     * proceed while the message is processed.
     */
    REQUEST,    // Asynchronous request

    /**
     * A request made to schedule future activity. The message will be held
     * until the specified time.
     */
    SCHEDULE,   // A schedule request

    /**
     * The result of a requested operation. A result message will be sent after
     * any operator where it is appropriate, it is up to the receiver if they 
     * should do anything with it.
     */
    RESULT,     // A result message

    /**
     * The message is a work order. A work order typically consists of several
     * steps that must be completed before being considered done. A work order
     * will typically reference one or more other messages that need to be 
     * completed, and specify the order in which they should be done. This 
     * message is basically just a reference for the sub-parts of the entire
     * work order. The work order status, its elements, the order of the elements
     * etc, can be controlled directly from the work order itself, and the work
     * order gives a consistent, current view of the status of all components of
     * the work order.
     */
    WORKORDER,  // A work order

    /**
     * The message is an employee evaluation that has been produced by an Actor
     * with the appropriate permissions. The message will contain the data being
     * evaluated. Evaluations are special with regard to how they are treated by
     * the system. They can only be generated by Supervisor or Manager users, 
     * are not interpreted by the system at all, can not be forwarded by any
     * non-Supervisor or Manager user, and attached to a single employee (the
     * one being evaluated). Once the evaluation is created, it is sent to the 
     * appropriate managers, and the employee being evaluated. From there, they
     * are signed off on by all parties, the evaluation data is placed in the 
     * appropriate place, and the message itself is cleared of the evaluation 
     * data. While the individual evaluations remain available to management
     * the employee record only notes the averages of the evaluations the 
     * employee has received.
     */
    EVALUATION, // An employee evaluation

    /**
     * The message is an employee write-up/disciplinary note. This is largely 
     * like the employee evaluation, and, in fact, works largely like an 
     * evaluation. The difference is that employee writeups are counted against
     * the employee and if they go past a particular threshold, they initiate
     * a disciplinary message to be sent to the managers/supervisors responsible
     * for that employee.
     */
    WRITEUP,    // An employee writeup

    /**
     * An system ticket. System tickets are created to reports bugs, errors
     * or idiosyncracies in the data, basically anything that the system does
     * that does not appear to be correct. They can be produced by normal users,
     * but the system itself can also produce tickets if it's operations are
     * impacted in some way. Tickets work on a straight Submit, 
     * Work, Commit cycle. A ticket is generated with a reference to an 
     * exemplar object that is being discussed and a description of the particular
     * issue. One of the recipients takes the take as a work item, investigating
     * fully until a solution is found. That solution is then presented to the 
     * initiating Actor, which is then allowed to either accept the solution, or
     * request an escalation of the ticket's status. The ticket is considered to
     * have been finished when the initiator accepts the ticket solution, though
     * a follow-up can be specified to make sure the entire problem was dealt 
     * with. 
     */
    TICKET,     // A ticket

    /**
     * A hold is a synchronous message that halts scheduling activity of the 
     * object it is attached to until the specified time in the future. Other
     * than the synchronous aspect of the message, it works largely like a 
     * schedule message.
     */
    HOLD,       // A Hold

    /**
     *  A reminder is an asynchronous schedule event that operates like an 
     * alarm. A reminder time is specified, and the message is sent to the 
     * recipient user.
     */
    REMINDER,   // A Reminder

    /**
     *  A promise to pay set up between a debtor and collector. These are set up
     * for a specific date and a specific dollar amount. There is also a grace 
     * period that can be attached by specifying a late_date for the promise. A
     * promise can be recurring and can be for any of several different payment
     * methods.
     */
    PROMISE,    // A Payment Promise

    /**
     *  Merge request between two or more Debtors/Debts, etc. Caller just needs
     *  to be notified of success or failure of the merge.
     */
    MERGE,

    /**
     * Split request on a Debtor. Caller just need to be notified of the final 
     * status of the operation (including any new account numbers created)
     */
    SPLIT,

    /**
     * Request a report from the system. The system needs to be told what report
     * to produces, what to include in the report and whatever other report
     * parameters might be necessary.
     */
    REPORT,

    /**
     *  Request a credit report. The system will package the request to be sent
     * out and processed by the appropriate Credit Bureaus, send the request 
     * and then put the returned Credit Report where the user can get it,
     */
    CREDITREPORT,

    /**
     * The specified account is bankrupt (the Debtor has declared Bankruptcy,
     * whether is has been discharged or not is a separate matter). These
     * messages will cause the system to make sure that everything is marked 
     * properly on these accounts.
     */
    BANKRUPT,

    /**
     * A request to go legal on an account. The request goes to the Legal Dept, 
     * for further processing after those things that can be done automatically
     * have been done by the system.
     */
    LEGAL,

    /**
     * The account has been cancelled. No further work should be done on the 
     * account.
     */
    CANCEL,

    /**
     * The account has been returned to the client. No further work is to be 
     * done on the account.
     */
    RETURN,

    /**
     * The account has been purged from the system
     */
    PURGE,

    /**
     * Employee has been terminated, includes date of termination, reasons, etc.
     * Automatically locks user's account on the system
     */
    TERMINATE,

    /**
     * Employee has resigned from the company. Automatically locks the user's
     * accounts on the system.
     */
    RESIGN,

    /**
     * User has logged in to the system.
     */
    LOGIN,

    /**
     * User has logged out of the system.
     */
    LOGOUT,

    /**
     * User has gone on break.
     */
    ONBREAK,

    /**
     * User has returned from break.
     */
    OFFBREAK,
    UPDATE,
    RETRIEVE,
}
