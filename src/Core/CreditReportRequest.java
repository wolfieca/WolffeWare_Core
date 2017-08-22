/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * Request a credit report. The system will package the request to be sent
 * out and processed by the appropriate Credit Bureaus, send the request 
 * and then put the returned Credit Report where the user can get it. This 
 * should be used primarily when either there is no current credit report on the
 * system for the debtor, or the requesting user has reason to believe that the
 * credit report data on the system is stale. Each requests costs money, so the
 * system may be configured to require a Supervisor's approval (either for 
 * credit reports in general, or for credit reports requested within x days of 
 * the last credit report request). If using a product like NetConnect, the 
 * server side transmits the request to the credit bureau itself, waits for the 
 * result to be returned, gives the returned report to the Reporting subsystem,
 * and then sends a message to the user notifying them of the return. If the
 * credit report pull fails for some reason, the user is sent a message telling 
 * them what happened so they can try again. If the failure is systemic, either
 * on the part of our system, or on the part of the credit bureau, a ticket is
 * sent to the Administrator. This ticket is low priority unless too many 
 * requests fail, (the failure/success ration of requests goes past a certain
 * threshold)
 * @author odin
 */
public class CreditReportRequest extends ReportRequest{
    
}
