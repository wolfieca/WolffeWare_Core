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
 * A compiled instruction. Used for Strategies, for instance. An initial text
 * program is turned into a series of individual instructions that can be run
 * as the system requires. These will be packed into messages
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class Instruction {
    private Test condition;
    private WWBaseObject[] args;
    private Verb action;
    private WWBaseObject result;

    /**
     *
     */
    public Instruction() {
    }

    /**
     *
     * @param condition
     * @param args
     * @param action
     * @param result
     */
    public Instruction(Test condition, WWBaseObject[] args, Verb action, WWBaseObject result) {
        this.condition = condition;
        this.args = args;
        this.action = action;
        this.result = result;
    }

    /**
     *
     * @return
     */
    public Test getCondition() {
        return condition;
    }

    /**
     *
     * @param condition
     */
    public void setCondition(Test condition) {
        this.condition = condition;
    }

    /**
     *
     * @return
     */
    public WWBaseObject[] getArgs() {
        return args;
    }

    /**
     *
     * @param args
     */
    public void setArgs(WWBaseObject[] args) {
        this.args = args;
    }

    /**
     *
     * @return
     */
    public Verb getAction() {
        return action;
    }

    /**
     *
     * @param action
     */
    public void setAction(Verb action) {
        this.action = action;
    }

    /**
     *
     * @return
     */
    public WWBaseObject getResult() {
        return result;
    }

    /**
     *
     * @param result
     */
    public void setResult(WWBaseObject result) {
        this.result = result;
    }
    
}
