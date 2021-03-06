/*
 * Copyright (C) 2017 Robert Serrano <wolfieca.rs@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Core;

import java.util.Comparator;

/**
 * Compare two debtors. This is mostly for the benefit of the Scheduler, as it
 * is schedule debtor messages for the same (current) day, and release them in
 * the correct order.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class DebtorComparator implements Comparator<Debtor>{
    @Override
    public int compare (Debtor a, Debtor b){
        return a.getPriority().getPriority() - (int)b.getPriority().getPriority();
    }
    
}
