package Core;

import java.util.ArrayList;

/**
 * The SupplementalData class represents non-primary demographic data. This is
 * for those data that are not always going to be present on a debtor. This is
 * designed to allow individual companies flexibility, to best reflect 
 * individual client needs.
 * @author odin
 */


public class SupplementalData extends WWBaseObject {
    private Debtor owner;
    private String suppDataName;
    private ArrayList<SupplementalDataItem> items;

    /**
     *
     * @param owner
     * @param suppDataName
     * @param items
     */
    public SupplementalData(Debtor owner, String suppDataName, ArrayList<SupplementalDataItem> items) {
        this.owner = owner;
        this.suppDataName = suppDataName;
        this.items = items;
    }

    /**
     *
     */
    public SupplementalData() {
    }
    
    /**
     *
     * @return
     */
    public Debtor getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     */
    public void setOwner(Debtor owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     */
    public String getSuppDataName() {
        return suppDataName;
    }

    /**
     *
     * @param suppDataName
     */
    public void setSuppDataName(String suppDataName) {
        this.suppDataName = suppDataName;
    }

    /**
     *
     * @return
     */
    public ArrayList<SupplementalDataItem> getItems() {
        return items;
    }

    /**
     *
     * @param items
     */
    public void setItems(ArrayList<SupplementalDataItem> items) {
        this.items = items;
    }
    
}
