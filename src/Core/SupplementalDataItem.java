/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author rserrano
 */
public class SupplementalDataItem extends WWBaseObject{
    private String name;
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
    
}
