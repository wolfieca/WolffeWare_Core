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

    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public PriorityBlockingQueue<Debtor> getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(PriorityBlockingQueue<Debtor> workQueue) {
        this.workQueue = workQueue;
    }
    
}
