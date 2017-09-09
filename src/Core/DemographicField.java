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
