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
 * Supplemental data for a debtor. If the Actor requesting this record is
 * not authorized to view this record for whatever reason, then do not return 
 * the data.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
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

    /**
     *
     * @return
     */
    public int getLine() {
        return line;
    }

    /**
     *
     * @param line
     */
    public void setLine(int line) {
        this.line = line;
    }
    
}
