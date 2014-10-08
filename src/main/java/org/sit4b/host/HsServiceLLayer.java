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

/**
 * A low level service
 * 
 * <p>
 * This is the low layer accessor to the service used by a {@link HsStackLLayer}
 * to perform required operation on a service
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsServiceLLayer {

	/**
	 * (Re)Enable this service
	 */
	public void enable();

	/**
	 * Disable this service
	 */
	public void disable();

	/**
	 * Send a buffer the the high layer service
	 * 
	 * @param buffer
	 *            data to send
	 * @throws Exception
	 *             on error
	 */
	void send(byte[] buffer) throws Exception;

	/**
	 * Set the callback to receive data from the high layer service
	 * 
	 * @param callback
	 *            the given callback
	 */
	void setRecvClbk(HsCallback<byte[], Exception> callback);

	/**
	 * Set the last activity time to current time
	 */
	public void setLastActivityTimeToCurrent();
}
