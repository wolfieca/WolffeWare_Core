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
