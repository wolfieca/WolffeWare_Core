/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * An action statement for the CommandParser.
 * @author rserrano
 */
public enum verb {

    /**
     *
     */
    END,

    /**
     *
     */
    WAIT,

    /**
     *
     */
    LETTER,

    /**
     *
     */
    SERIES,

    /**
     *
     */
    PURGE,

    /**
     *
     */
    COLLECTOR,

    /**
     *
     */
    CLERICAL,

    /**
     *
     */
    STEP,

    /**
     *
     */
    STRATEGY,

    /**
     *
     */
    FORECOL,

    /**
     *
     */
    LOG,

    /**
     *
     */
    REASSIGN,

    /**
     *
     */
    SUPERVISOR,

    /**
     *
     */
    INTERNAL,

    /**
     *
     */
    ASSIGN,

    /**
     *
     */
    GOTO,

    /**
     *
     */
    CLEAR_PAID,

    /**
     *
     */
    STATUS,

    /**
     *
     */
    DUMP,

    /**
     *
     */
    TRACE,

    /**
     *
     */
    DEBUG,

    /**
     *
     */
    HISTORY,

    /**
     *
     */
    RELINQUISH,

    /**
     *
     */
    DEL_LETTERS,

    /**
     *
     */
    NOT_WORKED,

    /**
     *
     */
    INC_BROKEN,

    /**
     *
     */
    INC_KEPT,

    /**
     *
     */
    MARK,

    /**
     *
     */
    REVERT,

    /**
     *
     */
    CLR_CONTACT,

    /**
     *
     */
    COLL_WAIT,

    /**
     *
     */
    RESERIES,

    /**
     *
     */
    CLEAR_BROKEN,

    /**
     *
     */
    CLEAR_KEPT,

    /**
     *
     */
    SET_FEE_TO,

    /**
     *
     */
    SUBMIT,

    /**
     *
     */
    WITHDRAW,

    /**
     *
     */
    SET_INT_TO,

    /**
     *
     */
    MAKE_CLIENT,

    /**
     *
     */
    ACKNOWLEDGE,

    /**
     *
     */
    CLIENT_WAIT,

    /**
     *
     */
    CLER_RMDR,

    /**
     *
     */
    SUPV_RMDR,

    /**
     *
     */
    BLITZ,

    /**
     *
     */
    INCREMENT,

    /**
     *
     */
    DECREMENT,

    /**
     *
     */
    CLEAR_TOKEN,

    /**
     *
     */
    PUT_IN_TOKEN,

    /**
     *
     */
    CLEAR_ALL,

    /**
     *
     */
    WINDOW_INT,

    /**
     *
     */
    WINDOW_REAL,

    /**
     *
     */
    WINDOW_$$$,

    /**
     *
     */
    WINDOW_DATE;
    
    verb(){
        
    }
    
    verb(WWBaseObject arg1){
        
    }
    
    verb(WWBaseObject arg1, WWBaseObject arg2){
        
    }
}
