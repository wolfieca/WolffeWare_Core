package Core;

import java.util.HashMap;

/**
 * The SupplementalData class represents non-primary demographic data. This is
 * for those data that are not always going to be present on a debtor. This is
 * designed to allow individual companies flexibility, to best reflect 
 * individual client needs.
 * @author odin
 */


public class SupplementalData extends WWBaseObject {
    private Debtor owner;
    private HashMap<String,SupplementalDataItem> items;

    /**
     * Constructor
     * @param owner
     * @param items
     */
    public SupplementalData(Debtor owner, HashMap<String,SupplementalDataItem> items) {
        this.owner = owner;
        this.items = items;
    }

    /**
     * Default constructor
     */
    public SupplementalData() {
    }
    
    // SupplementalData methods

    /**
     *
     * @param category
     * @return
     */
    
    public SupplementalDataItem getItem(String category){
        if ( !items.get(category).isPHI() )
            return items.get(category);
        else {
            if ( getCaller().getRights().canViewPHI())
                return items.get(category);
            else
                return null;
        }
    }

    /**
     *
     * @param category
     * @param item
     * @return
     */
    public int setItem(String category, SupplementalDataItem item){
        if(!items.get(category).isPHI()) {
            items.put(category, item);
            return 0;
        } else {
            if (getCaller().getRights().canUpdatePHI()) {
                items.put(category, item);
                return 0;
            } else
                return -1;
        }
    }

    /**
     *
     * @param category
     * @param newItem
     * @return
     */
    public int addItem(String category, SupplementalDataItem newItem){
            this.items.put(category, newItem);
            return 0;
    }
    // Accessors
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
    public HashMap<String,SupplementalDataItem> getItems() {
        return items;
    }

    /**
     *
     * @param items
     */
    public void setItems(HashMap<String,SupplementalDataItem> items) {
        this.items = items;
    }
    
}
