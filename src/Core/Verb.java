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
 * An action statement for the CommandParser. 
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public enum Verb {

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
    
    Verb(){
        
    }
    
    Verb(WWBaseObject arg1){
        
    }
    
    Verb(WWBaseObject arg1, WWBaseObject arg2){
        
    }
}
