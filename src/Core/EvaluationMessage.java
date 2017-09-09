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
 * An EmployeeEvaluation. 
 * The message is an employee evaluation that has been produced by an Actor
 * with the appropriate permissions. The message will contain the data being
 * evaluated. Evaluations are special with regard to how they are treated by
 * the system. They can only be generated by Supervisor or Manager users, 
 * are not interpreted by the system at all, can not be forwarded by any
 * non-Supervisor or Manager user, and attached to a single employee (the
 * one being evaluated). Once the evaluation is created, it is sent to the 
 * appropriate managers, and the employee being evaluated. From there, they
 * are signed off on by all parties, the evaluation data is placed in the 
 * appropriate place, and the message itself is cleared of the evaluation 
 * data. While the individual evaluations remain available to management
 * the employee record only notes the averages of the evaluations the 
 * employee has received.
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */
public class EvaluationMessage extends Message {
    
}
