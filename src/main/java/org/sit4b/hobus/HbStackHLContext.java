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

package org.sit4b.hobus;

import java.io.IOException;
import java.io.InputStream;

import org.mbedsys.jvar.ParserException;
import org.mbedsys.jvar.Variant;
import org.mbedsys.jvar.VariantMap;
import org.sit4b.log.HbLogger;

/**
 * A high layer stack context
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HbStackHLContext {

	/**
	 * Get the suitable logger
	 * 
	 * @return a Logger
	 */
	HbLogger getLogger();

	/**
	 * Get the application settings
	 * 
	 * @return a map variant
	 */
	VariantMap getSettings();

	/**
	 * Get the reference to the stack
	 * 
	 * @return {@link HbStackHL} reference
	 */
	HbStackHL getStack();

	/**
	 * Get the stack family name
	 * 
	 * @return family name
	 */
	String getServiceFamilyName();

	/**
	 * <p>
	 * Merge a database containing a set of custom interface definition used by
	 * this stack
	 * </p>
	 * <p>
	 * WARNING: this method cannot be used outside
	 * {@link HbStackHL#setup(HbStackHLContext)}
	 * </p>
	 * 
	 * @param input
	 *            Input stream to the database
	 * @param format
	 *            database format
	 * @throws HbException
	 *             if the meta database cannot be merged
	 * @throws ParserException
	 *             if the input is not in the wanted format
	 */
	public void loadMetaDB(InputStream input, Variant.Format format)
			throws HbException, IOException;
}
