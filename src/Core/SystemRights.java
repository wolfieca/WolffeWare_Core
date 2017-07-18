/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author rserrano
 */
public class SystemRights {
    public enum Base {
        LOCALLOGIN,
        REMOTELOGIN,
        BACKUP,
        SHUTDOWN,
        MONITOR,
        GRANT,
        REVOKE,
        TAKEOWNERSHIP,
        STARTSERVICES,
        STOPSERVICES,
        CREATEUSERS,
        DELETEUSERS,
        REGISTERMODULES,
        UNREGISTERMODULES,
        PRINT,
        REQUESTDOCUMENTS,
        EVENTLISTENER,
        REASSIGNTHREADS,
        IMPERSONATEUSER,
    }
    public enum Debtor {
        MERGE,
        SPLIT,
        DELETE
    }
    public enum DebtorLookup {
        HISTORY,
        QUEUE,
        GENERAL,
        UNIT,
        BLITZ,
        TAG
    }
    public enum DebtorAccess {
        LEGALACTIONS,
        PRECOLLECT
    }
    public enum DebtorUpdate {
        TELEPHONE,
        COLLECTOR,
        MAILRETURN,
        STRATEGYSTATUS,
        STATUSBYTYPE,
        LETTERSLEFT,
        INDICATORS,
        LEGALSCREEN
    }
    public enum Debt {
        VIEW,
        UPDATE,
        CRSTATUSREAD,
        CRSTATUSWRITE
    }
    public enum DebtUpdate {
        ORIGBALANCE,
        FORWHAT,
        CLIREF,
        SVCTYPE,
        DLC,
        DLP,
        FEESCHED,
        CREDITBUREAUFIELDS,
        RETURNSTATUS,
        CLIENT,
        COMMENTS,
        TAGS
    }
    public enum BankSetup {
        READ,
        WRITE
    }
    public enum ClientSetup {
        READ,
        WRITE
    }
    public enum FeeSetup {
        READ,
        WRITE
    }
    public enum InvoiceSetup {
        READ,
        WRITE
    }
    public enum AttorneySetup {
        READ,
        WRITE
    }
    public enum Lead {
        ADD,
        READ,
        UPDATE
    }
    public enum LetterSeries {
        READ,
        WRITE
    }
    public enum MatchSetup {
        READ,
        WRITE
    }
    public enum Misc {
        READ,
        WRITE
    }
    public enum Newbiz {
        READ,
        ADD,
        WRITE,
        DELETE
    }
    public enum NewbizUpdate {
        ACCOUNTNAME,
        GENERALINFORMATION,
        SKIPTRACEINFO,
        CROSSREFERENCE,
        HISTORICAL,
        COLLECTORNOTES
    }
    public enum OfficeSetup {
        READ,
        WRITE
    }
    public enum Payment {
        READ,
        ADD,
        WRITE
    }
    public enum PrioritySetup {
        READ,
        WRITE
    }
    public enum StrategyPlanning {
        READ,
        WRITE
    }
    public enum UserSetup {
        READ,
        WRITE
    }
    public enum Supplemental {
        READ,
        WRITE,
        ADDCATEGORY,
        DELETECATEGORY
    }
    public enum Report {
        RUN
    }
    public enum Queue {
        MERGE
    }
    public enum PHI {
        VIEW,
        UPDATE
    }
}
