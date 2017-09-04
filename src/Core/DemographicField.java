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
public class DemographicField<T> extends WWBaseObject{
    private boolean PHI;
    private T field;

    /**
     *
     */
    public enum source {

        /**
         *
         */
        NBIZ,

        /**
         *
         */
        SKP_TLO,

        /**
         *
         */
        SKP_TUW,

        /**
         *
         */
        SKP_TWN,

        /**
         *
         */
        NCOA,

        /**
         *
         */
        DEBTOR,

        /**
         *
         */
        ACS,

        /**
         *
         */
        CLIENT,
    }
    private source fieldSource;

    /**
     *
     * @return
     */
    protected boolean isPHI() {
        return PHI;
    }

    /**
     *
     * @param PHI
     */
    protected void setPHI(boolean PHI) {
        this.PHI = PHI;
    }

    /**
     *
     * @return
     */
    protected T getField() {
        if (isPHI()){
            if ( getCaller().getRights().canViewPHI()){
                return field;
            } else 
                return null;
        } else {
            return field;
        }
    }

    /**
     *
     * @param field
     * @throws Core.AccessDeniedException
     */
    protected void setField(T field) throws AccessDeniedException{
        if (isPHI()){
            if(getCaller().getRights().canUpdatePHI()){
                this.field = field;
            } else
                throw new AccessDeniedException();
        } else
            this.field = field;
    }

    /**
     * @return the fieldSource
     */
    public source getFieldSource() {
        return fieldSource;
    }

    /**
     * @param fieldSource the fieldSource to set
     */
    protected void setFieldSource(source fieldSource) {
        this.fieldSource = fieldSource;
    }
    
}
