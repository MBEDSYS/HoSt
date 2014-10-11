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

import java.util.Collection;

/**
 * An interface (internal object used by a stack)
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HbInterfaceInternal {
	/**
	 * The cluster path is a relative path from the parent device with the following format:
	 *            &lt;cluster type&gt;/&lt;instance id&gt;
	 * 
	 * @return the relative path from the parent device with the following format:
	 *            &lt;cluster type&gt;/&lt;instance id&gt;
	 */
	public String getPath();

	/**
	 * Get all the attributes
	 * 
	 * @return a collection of attributes
	 */
	public Collection<HbAttributeInternal> attributes();

	/**
	 * Get attribute by name
	 * 
	 * @param name
	 *            attribute name
	 * @return the suitable attribute or null if they are no attribute available
	 *         with the given name
	 */
	public HbAttributeInternal getAttribute(String name);
	
}
