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

package org.mbedsys.ral;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Serial connector
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface SerialConnector {

	/**
	 * Open the connection
	 * 
	 * @throws IOException on I/O error
	 */
	public void openConnection() throws IOException;

	/**
	 * Close the connection
	 */
	public void closeConnection();

	/**
	 * Get the input stream
	 * 
	 * @return an InputStream
	 * @throws IOException on I/O error
	 */
	public InputStream getInputStream() throws IOException;

	/**
	 * Get the output stream
	 * 
	 * @return an OutputStream
	 * @throws IOException on I/O error
	 */
	public OutputStream getOutputStream() throws IOException;

	/**
	 * Get the device name
	 * 
	 * @return device name as string
	 */
	public String getDevName();
}
