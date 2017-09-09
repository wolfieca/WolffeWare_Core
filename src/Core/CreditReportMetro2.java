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
 * A CreitReport in Metro2 format. This is currently the official file format
 * for credit report data to be sent to all the major Credit Bureaus. This class
 * takes all of the debt-related data and produces a file in the correct format.
 * This class basically requests credit report data from all debtors in the system.
 * Each debtor responds to that request either by rejecting it out of hand (the 
 * status on the debt prohibits credit reporting), or by requesting that each of
 * its debts provide the information they have to add to the credit data. The 
 * debts, again, can either reject the request and return nothing (ie if the 
 * debt is specifically marked as non-reportable, the debt's client does not
 * allow reporting of it's debts, etc) or respond with the needed information.
 * This is a fairly simplified version of how this operates (the debts' clients
 * are also consulted prior to return any data, for example). If at any point a 
 * debt is unable to comply with the debtor's request, that entire debt is kept 
 * out of the credit file (since there is nothing to return), but the debtor can 
 * continue on with the requests of the other debts. 
 * @author Robert Serrano <wolfieca.rs@gmail.com>
 */


public class CreditReportMetro2 extends CreditReport{
    
}
