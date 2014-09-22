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

package org.s24b.host;

import java.util.Collection;

import org.mbedsys.jvar.VariantMap;

/**
 * <p>
 * A cluster
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsInterface {
	/**
	 * The cluster path is a relative path from the parent device with the following format:
	 *            &lt;cluster type&gt;/&lt;instance id&gt;
	 * 
	 * @return the relative path from the parent device with the following format:
	 *            &lt;cluster type&gt;/&lt;instance id&gt;
	 */
	public String getPath();

	/**
	 * Get cluster meta model
	 * 
	 * @return type name as String
	 */
	public HsMetaInterface metaCluster();
	
	/**
	 * Test if this cluster is an instance of given type
	 * 
	 * @param type given type
	 * @return true if the test succeed
	 */
	public boolean instanceOf(HsMetaInterface type);

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
	 * @param arguments
	 *            command argument(s), can be null if there is no argument
	 * @param onResult
	 *            Callback executed on result and/or error
	 * @throws HsException
	 *             on error
	 * @throws HsServicePermission
	 *             if this operation is not permitted
	 */
	public void exec(String command, VariantMap arguments, HsResultHandler onResult)
			throws HsException;
}
