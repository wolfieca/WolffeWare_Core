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
