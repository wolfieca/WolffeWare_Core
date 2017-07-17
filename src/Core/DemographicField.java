/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * A Generic Demographic Field. To simplify things, the accessibility of these
 * fields will be tested by the Debtor object as far as PHI goes (doesn't make
 * sense to have to implement an entire WWBaseObject for each individual field).
 * @author rserrano
 * @param <T> The type of this Demographic field
 */
public class DemographicField<T> {
    private boolean PHI;
    private T field;

    protected boolean isPHI() {
        return PHI;
    }

    protected void setPHI(boolean PHI) {
        this.PHI = PHI;
    }

    protected T getField() {
        return field;
    }

    protected void setField(T field) {
        this.field = field;
    }
}
