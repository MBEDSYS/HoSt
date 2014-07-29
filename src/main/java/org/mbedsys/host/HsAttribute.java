/*
 *   Copyright 2014 Emeric Verschuur <emericv@mbedsys.org>
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *		   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.mbedsys.host;

import org.mbedsys.jvar.Variant;

/**
 * <p>
 * This interface describes a cluster attribute object.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a>
 * Copyright 2014 MbedSYS
 */
public interface HsAttribute {
	
	/**
	 * Flag indicating the attribute is readable
	 */
	public static final byte F_READ = 0x01;
	
	/**
	 * Flag indicating the attribute is readable
	 */
	public static final byte F_WRITE = 0x02;
	
	/**
	 * Combination of F_READ and F_WRITE flags
	 */
	public static final byte F_READWRITE = 0x03;
	
	/**
	 * Get the attribute name
	 * 
	 * @return a String value
	 */
	String getName();
	
	/**
	 * Get the current attribute value in cache
	 * 
	 * @return a Variant value
	 */
	Variant getValue();
	
	/**
	 * Get the attribute capabilities
	 * 
	 * @return a byte value
	 */
	byte getCapabilities();
	
	/**
	 * Send read command on this attribute
	 * 
	 * @param onResult Callback executed on result and/or error
	 * @throws HsException on error
	 */
	void read(HsResultHook onResult) throws HsException;
	
	/**
	 * Send write command on this attribute
	 * 
	 * @param onResult Callback executed on result and/or error
	 * @throws HsException on error
	 */
	void write(HsResultHook onResult) throws HsException;
}
