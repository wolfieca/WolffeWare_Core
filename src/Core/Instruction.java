/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * A compiled instruction. Used for Strategies, for instance. An initial text
 * program is turned into a series of individual instructions that can be run
 * as the system requires. These will be packed into messages
 * @author rserrano
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
