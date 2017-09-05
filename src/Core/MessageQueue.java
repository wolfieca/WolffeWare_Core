/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * A system message queue
 * @author odin
 */
public class MessageQueue extends WWBaseObject{
    private PriorityBlockingQueue<Message> msgQueue;

    public Message get() throws InterruptedException{
        return msgQueue.take();
    }
    public boolean put(Message newMessage){
        return msgQueue.add(newMessage);
    }
    
    /**
     * @return the msgQueue
     */
    public PriorityBlockingQueue<Message> getMsgQueue() {
        return msgQueue;
    }

    /**
     * @param msgQueue the msgQueue to set
     */
    protected void setMsgQueue(PriorityBlockingQueue<Message> msgQueue) {
        this.msgQueue = msgQueue;
    }
    
}
