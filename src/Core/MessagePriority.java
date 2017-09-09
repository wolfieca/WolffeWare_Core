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
 * Message priorities. Determines message delivery speed.
 * @author rserrano
 */
public enum MessagePriority {

    /**
     *
     */
    EMERGENCY,  // Must be taken care of without delay. Interrupt if needed.

    /**
     *
     */
    IMMEDIATE,  // Must be taken care of immediately. Don't interrupt.

    /**
     *
     */
    HIGH,       // Should be taken care of ASAP.

    /**
     *
     */
    REGULAR,    // Take care of it when able (normal priority)

    /**
     *
     */
    REDUCED,    // No hurry. Take care of it when you have nothing else to do.

    /**
     *
     */
    LOW,        // Idle time, when nothing else needs attention, take care of it

    /**
     *
     */
    LOWEST      // Lowest priority. No time constraints, no immediacy.
}
