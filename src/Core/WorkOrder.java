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
 * A WorkOrder is a message meant to start begin the processing of a job. A job
 * is characterized by having several sequential steps that have to be completed
 * and checked off. This message contains all the required steps, their current
 * statuses, the users assigned to complete them, the date each step should be 
 * completed by and the date that the WorkOrder needs to be completed by. As each
 * step is completed, the WorkOrder is updated and forwarded to the next person
 * in the chain.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class WorkOrder extends Message {
    
}
