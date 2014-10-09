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
 * A high level service
 * 
 * <p>
 * This is the high layer accessor to the service used by a {@link HsStackHL}
 * to perform required operation on a service
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsServiceInternalHL {

	/**
	 * Add an interface to this service
	 * 
	 * @param typeName
	 *            Interface name
	 * @return the internal reference to the created interface
	 * @throws HsException
	 *             if the interface cannot be created with the given name or an
	 *             other interface exists with the same name and id
	 */
	HsInterfaceInternal addInterface(String typeName) throws HsException;

	/**
	 * Add an interface to this service with a specific id (other than default:
	 * 0)
	 * 
	 * @param typeName
	 *            Interface name
	 * @param id
	 *            Interface id
	 * @return the internal reference to the created interface
	 * @throws HsException
	 *             if the interface cannot be created with the given name or an
	 *             other interface exists with the same name and id
	 */
	HsInterfaceInternal addInterface(String typeName, int id)
			throws HsException;

	/**
	 * Get a interface by the given relative path the following format:
	 * &lt;interface type&gt;/&lt;instance id&gt; (Example of a Switch interface
	 * path: Switch/0)
	 * 
	 * @param path
	 *            relative path from this device with the following format:
	 *            &lt;interface type&gt;/&lt;instance id&gt;
	 * @return a interface object of null if there is no interface with the
	 *         given path
	 */
	HsInterfaceInternal getInterface(String path);

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
	public Collection<HsInterfaceInternal> interfaces();

	/**
	 * Send a buffer the the low layer service
	 * 
	 * @param buffer
	 *            data to send
	 * @throws Exception
	 *             on error
	 */
	void send(byte[] buffer) throws Exception;

	/**
	 * Set the callback to receive data from the low layer service
	 * 
	 * @param callback
	 *            the given callback
	 */
	void setRecvClbk(HsCallback<byte[], Exception> callback);

	/**
	 * Leave this service
	 */
	public void leave();
}
