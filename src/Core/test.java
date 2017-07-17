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
public enum test {

    /**
     * Always true
     */
    ALWAYS (),

    /**
     * Never true (eff NOP)
     */
    NEVER,

    /**
     * True if account is pre-collect
     */
    PRECOLL,

    /**
     * True if account is not pre-collect
     */
    NOT_PRECOLL,

    /**
     * True if the Primary Client matches 
     */
    PRICLI,

    /**
     * False if the Primary Client matches 
     */
    PRICLI_NOT,

    /**
     * True is status matches 
     */
    STATUS,

    /**
     * False if status matches args[1]
     */
    STATUS_NOT,

    /**
     * True if Collector matches
     */
    COLLECTOR,

    /**
     * False if collector matches
     */
    COLLECTOR_NOT,

    /**
     * true if account has a phone number
     */
    PHONE,

    /**
     * true if account has no phone number
     */
    NO_PHONE,

    /**
     * true if account is marked worked
     */
    WORKED,

    /**
     * true if account has not been worked
     */
    NOT_WORKED,

    /**
     * true if debtor has assets
     */
    ASSETS,

    /**
     * true if the debtor does not have assets
     */
    NO_ASSETS,

    /**
     * true if balance is >= the specified amount
     */
    BAL_GE,

    /**
     * true if balance is < the specified amount
     */
    BAL_LT,

    /**
     * true if the debtor is employed
     */
    EMPLOYMENT,

    /**
     * true if the debtor is not employed
     */
    NO_EMPLOYMENT,

    /**
     * true if the account has a good (not mail returned) address
     */
    GOOD_ADDRESS,

    /**
     * true if the account does not have a good address
     */
    NO_GOOD_ADDRESS,

    /**
     * true if there are restrictions on the account.
     */
    RESTRICTED,

    /**
     * true if there are no restrictions on the account
     */
    NOT_RESTRICTED,

    /**
     * true if the debtor lives in the specified state
     */
    STATE,

    /**
     * true if the debtor does not live in the specified state
     */
    STATE_NOT,

    /**
     * true if the account is >= the specified days old
     */
    DAYS_OLD_GE,

    /**
     * true if the account is < the specified days old
     */
    DAYS_OLD_LT,

    /**
     * true if any portion of the debt has been paid.
     */
    PAID_ANY,

    /**
     * true if no part of the debt has been paid.
     */
    NOT_PAID_ANY,

    /**
     * true if the account has had mail returned
     */
    MAIL_RETURN,

    /**
     * true if the account has never had mail returned
     */
    NOT_MAIL_RETURN,

    /**
     * true if last paid date is after the specified date
     */
    DLP_GE,

    /**
     * true if last paid date is before the specified date
     */
    DLP_LT,

    /**
     * true if the status type for the account matches
     */
    STATUS_TYPE,

    /**
     * true if the status type for the account does not match
     */
    NOT_STATUS_TYPE,

    /**
     * true if the status for the account is in the specified group
     */
    STATUS_GROUP,

    /**
     * true if the status for the account is not in the specified group
     */
    NOT_STATUS_GROUP,

    /**
     * true if there are at least the specified number of contacts on the account
     */
    CONTACTS_GE,

    /**
     * true if there are fewer than the specified number of contacts 
     */
    CONTACTS_LT,

    /**
     * true if the debtor area code matches
     */
    AREA_CODE,

    /**
     * true if the debtor area code does not match
     */
    AREA_CODE_NOT,

    /**
     * true if the debtor area code >= the specified value
     */
    AREA_CODE_GE,

    /**
     * true if the debtor area code < the specified value
     */
    AREA_CODE_LT,

    /**
     *
     */
    OFFICE,

    /**
     *
     */
    OFFICE_NOT,

    /**
     *
     */
    COLL_STRAT_TP,

    /**
     *
     */
    COLL_STRAT_TP_NOT,

    /**
     *
     */
    PROM_BKN,

    /**
     *
     */
    PROM_BKN_NOT,

    /**
     *
     */
    PROM_BKN_GE,

    /**
     *
     */
    PROM_BKN_LT,

    /**
     *
     */
    PROM_KEPT,

    /**
     *
     */
    PROM_KEPT_NOT,

    /**
     *
     */
    PROM_KEPT_GE,

    /**
     *
     */
    PROM_KEPT_LT,

    /**
     *
     */
    BLANKET_PTS,

    /**
     *
     */
    NO_BLANKET_PTS,

    /**
     *
     */
    HAS_WINDOW,     

    /**
     *
     */
    DLN_DAYS_GE,

    /**
     *
     */
    DLN_DAYS_LT,

    /**
     *
     */
    DLS_DAYS_GE,

    /**
     *
     */
    DLS_DAYS_LT,

    /**
     *
     */
    NBR_DEBTS_GE,

    /**
     *
     */
    NBR_DEBTS_LT,

    /**
     *
     */
    FEE_SCHED,

    /**
     *
     */
    FEE_SCHED_NOT,

    /**
     *
     */
    CR_STATUS,

    /**
     *
     */
    DEBTCLI,

    /**
     *
     */
    DEBTCLI_NOT,

    /**
     *
     */
    COLL_TYPE_ANY,  

    /**
     *
     */
    PRICLI_TP_ANY,

    /**
     *
     */
    PRICLI_COB,

    /**
     *
     */
    PRICLI_COB_NOT,

    /**
     *
     */
    DLW_DAYS_GE,

    /**
     *
     */
    DLW_DAYS_LT,

    /**
     *
     */
    DLC_DAYS_GE,

    /**
     *
     */
    DLC_DAYS_LT,

    /**
     *
     */
    PLACE_AGE_GE,

    /**
     *
     */
    PLACE_AGE_LT,

    /**
     *
     */
    SCORE_GE,

    /**
     *
     */
    SCORE_LT,

    /**
     *
     */
    SCORE_DAYS_GE,

    /**
     *
     */
    SCORE_DAYS_LT,

    /**
     *
     */
    RST_STATE,

    /**
     *
     */
    NOT_RST_STATE,

    /**
     *
     */
    ACCT_HAS_RP,

    /**
     *
     */
    ACCT_HAS_RP_NOT,

    /**
     *
     */
    TEST_EQ,

    /**
     *
     */
    TEST_NE,

    /**
     *
     */
    TEST_GE,

    /**
     *
     */
    TEST_LT,

    /**
     *
     */
    TEST_LE,

    /**
     *
     */
    ALW_RD_TOKEN,

    /**
     *
     */
    ALW_WRT_TOKEN,

    /**
     *
     */
    ALW_COMPUTE,

    /**
     *
     */
    PRICLI_OFF,

    /**
     *
     */
    PREV_COLL_WAS,

    /**
     *
     */
    PREV_COLL_WAS_NOT,

    /**
     *
     */
    PREV_OFF_WAS,

    /**
     *
     */
    PREV_OFF_WAS_NOT,

    /**
     *
     */
    AMT_PAID_GE,

    /**
     *
     */
    AMT_PAID_LT,

    /**
     *
     */
    PCT_PAID_GE,

    /**
     *
     */
    PCT_PAID_LT;
    
    test(){
        
    }
    
    test(WWBaseObject arg1){
        
    }
    
    test(WWBaseObject arg1, WWBaseObject arg2){
        
    }
    
    test(WWBaseObject arg1, WWBaseObject arg2, WWBaseObject arg3){
        
    }
}
