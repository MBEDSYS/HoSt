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

import java.io.IOException;
import java.io.InputStream;

import org.mbedsys.jvar.ParserException;
import org.mbedsys.jvar.VariantMap;
import org.s24b.ral.SerialConnector;

/**
 * A stack context
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsStackContext extends HsAppContext {

	/**
	 * Add a new service
	 * 
	 * @param id
	 *            service id/address
	 * @param properties
	 *            properties
	 */
	void addService(String id, VariantMap properties);

	/**
	 * <p>
	 * Merge a database containing a set of custom interface definition used by
	 * this stack
	 * </p>
	 * <p>WARNING: this method cannot be used outside {@link HsStack#setup(HsStackContext)}</p>
	 * @param input
	 *            Input stream to BCON format database
	 * @throws HsException if the meta database cannot be merged
	 * @throws ParserException if the input is not in the wanted format
	 */
	void mergeMetaDB(InputStream input) throws HsException, ParserException;

	/**
	 * Make a new serial connector
	 * 
	 * @param path
	 *            serial device name
	 * @param options
	 * @return a SerialConnector
	 * @throw IOException on IO error
	 */
	SerialConnector newSerialConnector(String path, String options)
			throws IOException;
}
