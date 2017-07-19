package Core;

/**
 * A WorkQueue holds accounts that have been queued for a particular day
 * @author odin
 */

import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author odin
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
