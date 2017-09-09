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
 * An system ticket. System tickets are created to reports bugs, errors
 * or idiosyncracies in the data, basically anything that the system does
 * that does not appear to be correct. They can be produced by normal users,
 * but the system itself can also produce tickets if it's operations are
 * impacted in some way. Tickets work on a straight Submit, 
 * Work, Commit cycle. A ticket is generated with a reference to an 
 * exemplar object that is being discussed and a description of the particular
 * issue. One of the recipients takes the take as a work item, investigating
 * fully until a solution is found. That solution is then presented to the 
 * initiating Actor, which is then allowed to either accept the solution, or
 * request an escalation of the ticket's status. The ticket is considered to
 * have been finished when the initiator accepts the ticket solution, though
 * a follow-up can be specified to make sure the entire problem was dealt 
 * with. 
 * @author odin
 */
public class Ticket extends Message {
    
}
