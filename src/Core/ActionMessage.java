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
 *  See the documentation for Message.
 * An action message is a message requesting a particular system service. It is
 * specifically intended for synchronous requests, where the caller needs the 
 * requested operation to be finished before it can continue processing. This 
 * means that ActionMessages can potentially drop the efficiency of the calling
 * user if they are used indiscriminately. The use of these messages is best
 * limited to those situations where the user needs to have a result before they
 * can continue.
 * @author odin
 */
public class ActionMessage extends Message{
    
}
