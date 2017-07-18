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
 * mechanism specified
 * @author rserrano
 */
public class Message extends WWBaseObject {
    private Actor sender;
    private Actor receiver;
    private WWBaseObject reference;
    private boolean callerWaiting;
    private boolean asynch;
    private WWBaseObject[] waiters;     
    private CommandParser instruction;
    private String msgText;
    private Date msgDate;
    private Time msgTime;
    private boolean done;
    private boolean disposable;

    public Message() {
    }

    public Message(Actor receiver, WWBaseObject reference, boolean callerWaiting) {
        this.receiver = receiver;
        this.reference = reference;
        this.callerWaiting = callerWaiting;
    }
    
    

    public Message(Message origMessage){
    }
    
    public Actor getSender() {
        return sender;
    }

    protected void setSender(Actor sender) {
        this.sender = sender;
    }

    public Actor getReceiver() {
        return receiver;
    }

    protected void setReceiver(Actor receiver) {
        this.receiver = receiver;
    }

    public WWBaseObject getReference() {
        return reference;
    }

    protected void setReference(WWBaseObject reference) {
        this.reference = reference;
    }

    public boolean isCallerWaiting() {
        return callerWaiting;
    }

    protected void setWaiting(boolean waiting) {
        this.callerWaiting = waiting;
    }

    public WWBaseObject[] getWaiters() {
        return waiters;
    }

    protected void setWaiters(WWBaseObject[] waiters) {
        this.waiters = waiters;
    }

    public CommandParser getInstruction() {
        return instruction;
    }

    protected void setInstruction(CommandParser instruction) {
        this.instruction = instruction;
    }

    public String getMsgText() {
        return msgText;
    }

    protected void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    protected void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    public Time getMsgTime() {
        return msgTime;
    }

    protected void setMsgTime(Time msgTime) {
        this.msgTime = msgTime;
    }

    public boolean isDone() {
        return done;
    }

    protected void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDisposable() {
        return disposable;
    }

    protected void setDisposable(boolean disposable) {
        this.disposable = disposable;
    }
    
    public boolean isAsynch() {
        return asynch;
    }

    protected void setAsynch(boolean asynch) {
        this.asynch = asynch;
    }
    
    public void dispose(){
    }

    public void resend(){
    }
    
    public void resend(Actor sendTo){
    }
}
