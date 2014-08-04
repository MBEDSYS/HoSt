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

import java.util.Collection;
import java.util.Set;

import org.mbedsys.jvar.Variant;

/**
 * <p>
 * This interface describes a cluster object.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MbedSYS
 */
public interface HsCluster {
	/**
	 * Get cluster id
	 * <p>
	 * This ID is used to distinguish several cluster with the same type into
	 * the same device
	 * </p>
	 * 
	 * @return id number
	 */
	public int getId();

	/**
	 * Get cluster type name
	 * 
	 * @return type name as String
	 */
	public String getTypeName();

	/**
	 * Get the attribute name list
	 * 
	 * @return a set of String
	 */
	public Set<String> attributeNameSet();

	/**
	 * Get all the attributes
	 * 
	 * @return a collection of attributes
	 */
	public Collection<HsAttribute> attributes();

	/**
	 * Get attribute by name
	 * 
	 * @param name
	 *            attribute name
	 * @return the suitable attribute or null if they are no attribute available
	 *         with the given name
	 */
	public HsAttribute getAttribute(String name);

	/**
	 * Send command
	 * 
	 * @param arg
	 *            command argument(s)
	 * @param onResult
	 *            Callback executed on result and/or error
	 * @throws HsException
	 *             on error
	 */
	void exec(String command, Variant arg, HsResultHook onResult)
			throws HsException;
}
