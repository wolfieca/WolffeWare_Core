/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public Verb getAction() {
        return action;
    }

    public void setAction(Verb action) {
        this.action = action;
    }

    public WWBaseObject[] getArgs() {
        return args;
    }

    public void setArgs(WWBaseObject[] args) {
        this.args = args;
    }

    public WWBaseObject getResult() {
        return result;
    }

    public void setResult(WWBaseObject result) {
        this.result = result;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
    protected void ParseCommand(){
        
    }
}
