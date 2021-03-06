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
 * A Generic Demographic Field. To simplify things, the accessibility of these
 * fields will be tested by the Debtor object as far as PHI goes (doesn't make
 * sense to have to implement an entire WWBaseObject for each individual field).
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 * @param <T> The type of this Demographic field
 */
public class DemographicField<T> extends WWBaseObject{
    private boolean PHI;
    private T field;

    /**
     *
     */
    public enum sources {

        /**
         * Field comes from NewBiz
         */
        NBIZ,

        /**
         * Field came from a TLO lookup
         */
        SKP_TLO,

        /**
         * Field came from Tranunsion/TLO Watch processes.
         */
        SKP_TUW,

        /**
         * 
         */
        SKP_TWN,

        /**
         * Field came from NCOA address correction.
         */
        NCOA,

        /**
         * Field came from information provided by the Debtor.
         */
        DEBTOR,

        /**
         * Field came from the Address Correction Service.
         */
        ACS,

        /**
         * Field came from the client, outside of NewBiz
         */
        CLIENT,
    }
    private sources fieldSource;

    /**
     * Is the field PHI?
     * @return
     */
    protected boolean isPHI() {
        return PHI;
    }

    /**
     * Set the PHI flag
     * @param PHI
     */
    protected void setPHI(boolean PHI) {
        this.PHI = PHI;
    }

    /**
     * Return the value of the field, if permissions permit it.
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
     * Set the value of the field, if permissions allow it.
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

    public void setField(T field, sources sourceName){
        try{
            this.setField(field);
            this.setFieldSource(sourceName);
        } catch (AccessDeniedException e){
            e.toString();
        }
    }
    /**
     * @return the fieldSource
     */
    public sources getFieldSource() {
        return fieldSource;
    }

    /**
     * @param fieldSource the fieldSource to set
     */
    protected void setFieldSource(sources fieldSource) {
        this.fieldSource = fieldSource;
    }
    
}
