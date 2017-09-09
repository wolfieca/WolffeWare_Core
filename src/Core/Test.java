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
public enum Test {

    /**
     * Always true
     */
    ALWAYS ("If Always"),

    /**
     * Never true (eff NOP)
     */
    NEVER ("If Never"),

    /**
     * True if account is pre-collect
     */
    PRECOLL ("If Precoll"),

    /**
     * True if account is not pre-collect
     */
    NOT_PRECOLL ("If Not Precoll"),

    /**
     * True if the Primary Client matches 
     */
    PRICLI ("If PriCli", 1),

    /**
     * False if the Primary Client matches 
     */
    PRICLI_NOT ("If Not PriCli", 1),

    /**
     * True is status matches 
     */
    STATUS ("If Status", 1),

    /**
     * False if status matches args[1]
     */
    STATUS_NOT ("If Status Not", 1),

    /**
     * True if Collector matches
     */
    COLLECTOR ("If Collector", 1),

    /**
     * False if collector matches
     */
    COLLECTOR_NOT ("If Not Collector", 1),

    /**
     * true if account has a phone number
     */
    PHONE ("If Phone"),

    /**
     * true if account has no phone number
     */
    NO_PHONE ("If Not Phone"),

    /**
     * true if account is marked worked
     */
    WORKED ("If Worked"),

    /**
     * true if account has not been worked
     */
    NOT_WORKED ("If Not Worked"),

    /**
     * true if debtor has assets
     */
    ASSETS ("If Has Assets"),

    /**
     * true if the debtor does not have assets
     */
    NO_ASSETS ("If No Assets"),

    /**
     * true if balance is >= the specified amount
     */
    BAL_GE ("If Curr Bal >=", 1),

    /**
     * true if balance is < the specified amount
     */
    BAL_LT ("If Curr Bal <", 1),

    /**
     * true if the debtor is employed
     */
    EMPLOYMENT ("If Employed"),

    /**
     * true if the debtor is not employed
     */
    NO_EMPLOYMENT ("If Not Employed"),

    /**
     * true if the account has a good (not mail returned) address
     */
    GOOD_ADDRESS("If Good Address"),

    /**
     * true if the account does not have a good address
     */
    NO_GOOD_ADDRESS ("If No Good Address"),

    /**
     * true if there are restrictions on the account.
     */
    RESTRICTED ("If Restricted"),

    /**
     * true if there are no restrictions on the account
     */
    NOT_RESTRICTED ("If Not Restricted"),

    /**
     * true if the debtor lives in the specified state
     */
    STATE ("If State", 1),

    /**
     * true if the debtor does not live in the specified state
     */
    STATE_NOT ("If State Not", 1),

    /**
     * true if the account is >= the specified days old
     */
    DAYS_OLD_GE ("If Days Old >=", 1),

    /**
     * true if the account is < the specified days old
     */
    DAYS_OLD_LT ("If Days Old <", 1),

    /**
     * true if any portion of the debt has been paid.
     */
    PAID_ANY ("If Paid Any"),

    /**
     * true if no part of the debt has been paid.
     */
    NOT_PAID_ANY ("If Paid None"),

    /**
     * true if the account has had mail returned
     */
    MAIL_RETURN ("If Mail Return"),

    /**
     * true if the account has never had mail returned
     */
    NOT_MAIL_RETURN ("If Not Mail Return"),

    /**
     * true if last paid date is after the specified date
     */
    DLP_GE ("If DLP >=", 1),

    /**
     * true if last paid date is before the specified date
     */
    DLP_LT ("If DLP <", 1),

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
     * true if the account is in the specified office
     */
    OFFICE,

    /**
     * true if the account is not in the specified office
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
    
    Test(){
        
    }
    
    Test(String instr){
        
    }
    
    Test(String instr, Integer arg1){
        
    }
    
    Test(String instr, Integer arg1, String arg2){
        
    }
    Test(String instr, Integer arg1, Integer arg2, Integer arg3){
        
    }
    
}
