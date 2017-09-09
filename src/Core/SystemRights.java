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

/**
 *
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class SystemRights {

    /**
     *
     */
    public enum Base {

        /**
         *
         */
        LOCALLOGIN,

        /**
         *
         */
        REMOTELOGIN,

        /**
         *
         */
        BACKUP,

        /**
         *
         */
        SHUTDOWN,

        /**
         *
         */
        MONITOR,

        /**
         *
         */
        GRANT,

        /**
         *
         */
        REVOKE,

        /**
         *
         */
        TAKEOWNERSHIP,

        /**
         *
         */
        STARTSERVICES,

        /**
         *
         */
        STOPSERVICES,

        /**
         *
         */
        CREATEUSERS,

        /**
         *
         */
        DELETEUSERS,

        /**
         *
         */
        REGISTERMODULES,

        /**
         *
         */
        UNREGISTERMODULES,

        /**
         *
         */
        PRINT,

        /**
         *
         */
        REQUESTDOCUMENTS,

        /**
         *
         */
        EVENTLISTENER,

        /**
         *
         */
        REASSIGNTHREADS,

        /**
         *
         */
        IMPERSONATEUSER,
    }

    /**
     *
     */
    public enum Debtor {

        /**
         *
         */
        MERGE,

        /**
         *
         */
        SPLIT,

        /**
         *
         */
        DELETE
    }

    /**
     *
     */
    public enum DebtorLookup {

        /**
         *
         */
        HISTORY,

        /**
         *
         */
        QUEUE,

        /**
         *
         */
        GENERAL,

        /**
         *
         */
        UNIT,

        /**
         *
         */
        BLITZ,

        /**
         *
         */
        TAG
    }

    /**
     *
     */
    public enum DebtorAccess {

        /**
         *
         */
        LEGALACTIONS,

        /**
         *
         */
        PRECOLLECT
    }

    /**
     *
     */
    public enum DebtorUpdate {

        /**
         *
         */
        TELEPHONE,

        /**
         *
         */
        COLLECTOR,

        /**
         *
         */
        MAILRETURN,

        /**
         *
         */
        STRATEGYSTATUS,

        /**
         *
         */
        STATUSBYTYPE,

        /**
         *
         */
        LETTERSLEFT,

        /**
         *
         */
        INDICATORS,

        /**
         *
         */
        LEGALSCREEN
    }

    /**
     *
     */
    public enum Debt {

        /**
         *
         */
        VIEW,

        /**
         *
         */
        UPDATE,

        /**
         *
         */
        CRSTATUSREAD,

        /**
         *
         */
        CRSTATUSWRITE
    }

    /**
     *
     */
    public enum DebtUpdate {

        /**
         *
         */
        ORIGBALANCE,

        /**
         *
         */
        FORWHAT,

        /**
         *
         */
        CLIREF,

        /**
         *
         */
        SVCTYPE,

        /**
         *
         */
        DLC,

        /**
         *
         */
        DLP,

        /**
         *
         */
        FEESCHED,

        /**
         *
         */
        CREDITBUREAUFIELDS,

        /**
         *
         */
        RETURNSTATUS,

        /**
         *
         */
        CLIENT,

        /**
         *
         */
        COMMENTS,

        /**
         *
         */
        TAGS
    }

    /**
     *
     */
    public enum BankSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum ClientSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum FeeSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum InvoiceSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum AttorneySetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum Lead {

        /**
         *
         */
        ADD,

        /**
         *
         */
        READ,

        /**
         *
         */
        UPDATE
    }

    /**
     *
     */
    public enum LetterSeries {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum MatchSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum Misc {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum Newbiz {

        /**
         *
         */
        READ,

        /**
         *
         */
        ADD,

        /**
         *
         */
        WRITE,

        /**
         *
         */
        DELETE
    }

    /**
     *
     */
    public enum NewbizUpdate {

        /**
         *
         */
        ACCOUNTNAME,

        /**
         *
         */
        GENERALINFORMATION,

        /**
         *
         */
        SKIPTRACEINFO,

        /**
         *
         */
        CROSSREFERENCE,

        /**
         *
         */
        HISTORICAL,

        /**
         *
         */
        COLLECTORNOTES
    }

    /**
     *
     */
    public enum OfficeSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum Payment {

        /**
         *
         */
        READ,

        /**
         *
         */
        ADD,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum PrioritySetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum StrategyPlanning {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum UserSetup {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE
    }

    /**
     *
     */
    public enum Supplemental {

        /**
         *
         */
        READ,

        /**
         *
         */
        WRITE,

        /**
         *
         */
        ADDCATEGORY,

        /**
         *
         */
        DELETECATEGORY
    }

    /**
     *
     */
    public enum Report {

        /**
         *
         */
        RUN
    }

    /**
     *
     */
    public enum Queue {

        /**
         *
         */
        MERGE
    }

    /**
     *
     */
    public enum PHI {

        /**
         *
         */
        VIEW,

        /**
         *
         */
        UPDATE
    }
}
