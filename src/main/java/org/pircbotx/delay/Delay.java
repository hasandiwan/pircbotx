/*
 * Copyright (C) 2010-2022 The PircBotX Project Authors
 *
 * This file is part of PircBotX.
 *
 * PircBotX is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * PircBotX is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * PircBotX. If not, see <http://www.gnu.org/licenses/>.
 */
package org.pircbotx.delay;

/**
 * Interface to encapsulate delay. Makes it possible to use dynamic delays
 * 
 * The delay returned is in milliseconds and must always be zero or positive.
 */
public interface Delay {
	
	/**
	 * @return the delay in milliseconds.  
	 */
	long getDelay();
}
