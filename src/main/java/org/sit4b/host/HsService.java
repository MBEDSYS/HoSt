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

package org.sit4b.host;

import java.util.Collection;
import java.util.Set;

/**
 * <p>
 * A service object.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsService {
	/**
	 * The service path is compound from the service family following by the
	 * service identifier like device MAC address or equivalent
	 * (&lt;family&gt;/&lt;ID&gt;) and used to distinguish a service. (Example
	 * of a ZigBee device path: ZigBee/0123456789ABCDEF)
	 * 
	 * @return the service path using the following format:
	 *         &lt;family&gt;/&lt;ID&gt;
	 */
	String getPath();

	/**
	 * Get a interface by the given relative path the following format:
	 * &lt;interface type&gt;/&lt;instance id in hexadecimal&gt; (Example of a Switch interface
	 * path: Switch/0)
	 * 
	 * @param path
	 *            relative path from this service with the following format:
	 *            &lt;interface type&gt;/&lt;instance id&gt;
	 * @return a interface object of null if there is no interface with the given
	 *         path
	 */
	HsInterface getInterface(String path);

	/**
	 * Get the interface path list
	 * 
	 * @return a set of String
	 */
	public Set<String> interfacePathSet();

	/**
	 * Get all the interfaces
	 * 
	 * @return a collection of attributes
	 */
	public Collection<HsInterface> interfaces();
}
