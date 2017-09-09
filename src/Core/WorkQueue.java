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
 * A WorkQueue holds accounts that have been queued for a particular day
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */

import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class WorkQueue extends WWBaseObject {
    private int maxQueueSize;
    private PriorityBlockingQueue<Debtor> workQueue;
    private PriorityBlockingQueue<Debtor> reserveQueue;

    /**
     *
     * @return
     */
    public Debtor[] getItems() {
        return (Debtor[])workQueue.toArray();
    }

    /**
     *
     * @param newDebtor
     */
    protected void putItem(Debtor newDebtor){
        workQueue.add(newDebtor);
    }

    /**
     *
     * @return
     */
    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    /**
     *
     * @param maxQueueSize
     */
    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    /**
     *
     * @return
     */
    public PriorityBlockingQueue<Debtor> getWorkQueue() {
        return workQueue;
    }

    /**
     *
     * @param workQueue
     */
    public void setWorkQueue(PriorityBlockingQueue<Debtor> workQueue) {
        this.workQueue = workQueue;
    }
    
}
