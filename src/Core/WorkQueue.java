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
}
