/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.sql.Time;
import java.util.Date;

/**
 * A message is the Core scheduling and synchronization primitive. It is the 
 * basis of the strategy system, and controls many parts of the daily running
 * and quality of life  for users of the system. A message can be sent synchronously
 * (have an object waiting for it to be processed) or asynchronously (the message
 * is basically standalone and nothing is waiting for it to get done with). 
 * This replaces the schedule/activity conglomerate from the original Wizard 
 * system, and should provide extra stability, flexibility, and accountability, 
 * than they do.
 * Note that Message itself is simply the message. There is no transport
 * mechanism specified.
 * Also note that messages are relatively transient. Once they are finished
 * processing, they can be disposed of and eventually deleted from the database
 * itself. No part of the system should assume the permanence of any message. 
 * In the hierarchy of system objects, messages are near the bottom in terms of
 * how long they typically stick around. There is a configurable option to turn
 * disposal on or off and another to determine retention time if disposal is on.
 * @author rserrano
 */
public class Message extends WWBaseObject {
    private Actor sender;
    private Actor receiver;
    private WWBaseObject reference;
    private MessageType messageType;
    // callerWaiting only matters if asynch is true, in which case a result
    // message is expected
    private boolean callerWaiting;      
    private boolean asynch;
    private WWBaseObject[] waiters;     
    private Instruction instruction;
    private String msgText;
    private Date msgCDate;  // The date the message was created
    private Time msgCTime;  // The time the message was created
    private Date msgDate;   
    private Time msgTime;
    private boolean done;
    private boolean disposable;
    private MessagePriority priority;

    /**
     *
     */
    public Message() {
    }

    /**
     *
     * @param sender
     * @param receiver
     * @param reference
     */
    public Message(Actor sender, Actor receiver, WWBaseObject reference) {
        this.sender = sender;
        this.receiver = receiver;
        this.reference = reference;
    }
    
    /**
     *
     * @param origMessage
     */
    public Message(Message origMessage){
    }
    
    /**
     *
     * @return
     */
    public Actor getSender() {
        return sender;
    }

    /**
     *
     * @param sender
     */
    protected void setSender(Actor sender) {
        this.sender = sender;
    }

    /**
     *
     * @return
     */
    public Actor getReceiver() {
        return receiver;
    }

    /**
     *
     * @param receiver
     */
    protected void setReceiver(Actor receiver) {
        this.receiver = receiver;
    }

    /**
     *
     * @return
     */
    public WWBaseObject getReference() {
        return reference;
    }

    /**
     *
     * @param reference
     */
    protected void setReference(WWBaseObject reference) {
        this.reference = reference;
    }

    /**
     *
     * @return
     */
    public boolean isCallerWaiting() {
        return callerWaiting;
    }

    /**
     *
     * @param waiting
     */
    protected void setWaiting(boolean waiting) {
        this.callerWaiting = waiting;
    }

    /**
     *
     * @return
     */
    public WWBaseObject[] getWaiters() {
        return waiters;
    }

    /**
     *
     * @param waiters
     */
    protected void setWaiters(WWBaseObject[] waiters) {
        this.waiters = waiters;
    }

    /**
     *
     * @return
     */
    public Instruction getInstruction() {
        return instruction;
    }

    /**
     *
     * @param instruction
     */
    protected void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    /**
     *
     * @return
     */
    public String getMsgText() {
        return msgText;
    }

    /**
     *
     * @param msgText
     */
    protected void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    /**
     *
     * @return
     */
    public Date getMsgDate() {
        return msgDate;
    }

    /**
     *
     * @param msgDate
     */
    protected void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    /**
     *
     * @return
     */
    public Time getMsgTime() {
        return msgTime;
    }

    /**
     *
     * @param msgTime
     */
    protected void setMsgTime(Time msgTime) {
        this.msgTime = msgTime;
    }

    /**
     *
     * @return
     */
    public boolean isDone() {
        return done;
    }

    /**
     *
     * @param done
     */
    protected void setDone(boolean done) {
        this.done = done;
    }

    /**
     *
     * @return
     */
    public boolean isDisposable() {
        return disposable;
    }

    /**
     *
     * @param disposable
     */
    protected void setDisposable(boolean disposable) {
        this.disposable = disposable;
    }
    
    /**
     *
     * @return
     */
    public boolean isAsynch() {
        return asynch;
    }

    /**
     *
     * @param asynch
     */
    protected void setAsynch(boolean asynch) {
        this.asynch = asynch;
    }
    
    /**
     *
     */
    public void dispose(){
    }

    /**
     *
     */
    public void resend(){
    }
    
    /**
     *
     * @param sendTo
     */
    public void resend(Actor sendTo){
    }
    
    @Override
    public String toString(){
        return "";
    }
}
