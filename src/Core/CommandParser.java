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
 * CommandParser is the base class for the token parsing classes in the 
 * system. The first argument will be the object this command is being applied
 * to. Basic syntax is Test [args[,...] action
 * @author rserrano
 */
public class CommandParser extends WWBaseObject {
    private Test test;
    private WWBaseObject[] args;
    private WWBaseObject result;
    private Verb action;

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

    /**
     *
     * @return
     */
    public Test getTest() {
        return test;
    }

    /**
     *
     * @param test
     */
    public void setTest(Test test) {
        this.test = test;
    }

    /**
     *
     */
    protected void ParseCommand(){
        
    }
}
