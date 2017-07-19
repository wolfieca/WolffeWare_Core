/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * Supplemental data for a debtor. If the Actor requesting this record is
 * not authorized to view this record for whatever reason, then do not return 
 * the data.
 * @author rserrano
 */
public class SupplementalDataItem extends WWBaseObject{
    private String name;
    private int line;
    private boolean PHI;
    private String theData;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public boolean isPHI() {
        return PHI;
    }

    /**
     *
     * @param isPHI
     */
    public void setPHI(boolean isPHI) {
        this.PHI = isPHI;
    }

    /**
     *
     * @return
     */
    public String getTheData() {
        return theData;
    }

    /**
     *
     * @param theData
     * @return
     */
    public String setTheData(String theData) {
        String origData = this.theData;
        this.theData = theData;
        return origData;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
    
}
