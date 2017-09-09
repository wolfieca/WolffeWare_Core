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

import java.util.GregorianCalendar;

/**
 * A message is the Core communication, scheduling and synchronization primitive. 
 * It is the basis of the strategy system, and controls many parts of the daily running
 * and quality of life  for users of the system. A message can be sent synchronously
 * (have an object waiting for it to be processed) or asynchronously (the message
 * is basically standalone and nothing is waiting for it to get done with). 
 * This replaces the schedule/activity conglomerate from the original Wizard 
 * system, and should provide extra stability, flexibility, and accountability, 
 * than they do.
 * Note that Message itself is simply the message. There is no transport
 * mechanism specified.
 * A message of this class is a passive message. It contains no instructions and
 * is basically just a means of communication between users on the system. Other
 * message classes further down the hierarchy have greater functionality.
 * Message is the base of a hierarchy of classes implementing various pieces
 * of system functionality as messages. Messages are also for company management
 * functionality, such as employee evaluations, hiring/firing, etc.
 * Also note that messages are relatively transient. Once they are finished
 * processing, they can be disposed of and eventually deleted from the database
 * itself. No part of the system should assume the permanence of any message. 
 * In the hierarchy of system objects, messages are near the bottom in terms of
 * how long they typically stick around. There is a configurable option to turn
 * disposal on or off and another to determine retention time if disposal is on.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class Message extends WWBaseObject {
    private Actor sender;
    private Actor receiver; 
    private CollectionUnit targetCollector; 
    private WWBaseObject[] reference;
    private MessageType messageType;
    // callerWaiting only matters if asynch is true, in which case a result
    // message is expected
    private boolean callerWaiting;      
    private boolean asynch;
    private WWBaseObject[] waiters;     
    private WWBaseObject evaluation;
    private String comment;
    private GregorianCalendar created;  // Message creation time
    private GregorianCalendar release;  // Message release (schedule) time
    private GregorianCalendar released; // Message released time
    private GregorianCalendar expire;   // Message expiration time
    private boolean seen;       // Has the message been seen by the recipient?
    private boolean done;
    private boolean disposable;
    private MessagePriority priority;

    /**
     * Create an empty message
     */
    public Message() {
    }

    /**
     * Create a message for immediate delivery, with normal message priority
     * @param sender    The sender of this message
     * @param receiver  The intended receiver
     * @param reference Any objects this message is in reference to.
     */
    public Message(Actor sender, Actor receiver, WWBaseObject[] reference) {
        this.sender = sender;
        this.receiver = receiver;
        this.reference = reference;
        this.created = new GregorianCalendar();
        this.seen = false;
        this.done = false;
        this.messageType = MessageType.MESSAGE;
    }
    
    /**
     *
     * @param origMessage
     */
    public Message(Message origMessage){
    }
    
    /**
     * Get the sender of this message
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
    public WWBaseObject[] getReference() {
        return reference;
    }

    /**
     *
     * @param index
     * @return
     */
    public WWBaseObject getReference(int index){
        return reference[index];
    }
    /**
     *
     * @param reference
     */
    protected void setReference(WWBaseObject[] reference) {
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
        this.setCallerWaiting(waiting);
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
     * Get the comment (or text) for this message.
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set the comment for this message
     * @param msgText
     */
    protected void setComment(String msgText) {
        this.comment = msgText;
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
     */
    public void reply(){
        
    }

    /**
     *
     */
    public void forward() {
        
    }
    
    /**
     *
     * @param sendTo
     */
    public void resend(Actor sendTo){
    }

    /**
     *
     * @return
     */
    public CollectionUnit getTargetCollector() {
        return targetCollector;
    }

    /**
     *
     * @param targetCollector
     */
    public void setTargetCollector(CollectionUnit targetCollector) {
        this.targetCollector = targetCollector;
    }

    /**
     *
     * @return
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     *
     * @param messageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    /**
     *
     * @param seen
     */
    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    /**
     *
     * @return
     */
    public MessagePriority getPriority() {
        return priority;
    }

    /**
     *
     * @param priority
     */
    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }
    
    
    @Override
    public String toString(){
        return "";
    }

    /**
     * @return the created
     */
    public GregorianCalendar getCreated() {
        return created;
    }

    /**
     * @return the release
     */
    public GregorianCalendar getRelease() {
        return release;
    }

    /**
     * @return the released
     */
    public GregorianCalendar getReleased() {
        return released;
    }

    /**
     * @return the expire
     */
    public GregorianCalendar getExpire() {
        return expire;
    }

    /**
     * @param created the created to set
     */
    protected void setCreated(GregorianCalendar created) {
        this.created = created;
    }

    /**
     * @param release the release to set
     */
    protected void setRelease(GregorianCalendar release) {
        this.release = release;
    }

    /**
     * @param released the released to set
     */
    protected void setReleased(GregorianCalendar released) {
        this.released = released;
    }

    /**
     * @param expire the expire to set
     */
    protected void setExpire(GregorianCalendar expire) {
        this.expire = expire;
    }

    /**
     * @return the seen
     */
    public boolean isSeen() {
        return seen;
    }

    /**
     * @return the evaluation
     */
    public WWBaseObject getEvaluation() {
        return evaluation;
    }

    /**
     * @param callerWaiting the callerWaiting to set
     */
    protected void setCallerWaiting(boolean callerWaiting) {
        this.callerWaiting = callerWaiting;
    }

    /**
     * @param evaluation the evaluation to set
     */
    protected void setEvaluation(WWBaseObject evaluation) {
        this.evaluation = evaluation;
    }
    
}
