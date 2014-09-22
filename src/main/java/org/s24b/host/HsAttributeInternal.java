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

import org.mbedsys.jvar.Variant;

/**
 * An attribute (internal object)
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsAttributeInternal {
	/**
	 * Update the attribute internal value
	 * 
	 * @param value new attribute value
	 */
	public void updateValue(Variant value);
	
	/**
	 * Overload the getValue default method
	 * 
	 * <p>the default action for a get will return the internal value</p>
	 * 
	 * @param handler
	 */
	public void setGetValueHandler(HsGetValueHandler handler);
	
	/**
	 * Overload the default read handler
	 * 
	 * <p>the default action for a read will return the internal value</p>
	 * 
	 * @param handler
	 */
	public void setReadHandler(HsRequestHandler handler);
	
	/**
	 * Setup the write handler
	 * 
	 * <p>the default action for a write will throw a IllegalStateException</p>
	 * 
	 * @param handler
	 */
	public void setWriteHandler(HsRequestHandler handler);
}
