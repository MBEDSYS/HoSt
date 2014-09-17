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

import org.mbedsys.jvar.Variant;

/**
 * <p>
 * A cluster attribute
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsAttribute {

	/**
	 * Get the attribute meta model
	 * 
	 * @return a HsMetaAttribute
	 */
	public HsMetaAttribute metaAttribute();

	/**
	 * Get the current attribute value in cache
	 * 
	 * @return a Variant value
	 */
	public Variant getValue();

	/**
	 * Send read command on this attribute
	 * 
	 * @param onResult
	 *            Callback executed on result and/or error
	 * @throws HsException
	 *             on error
	 * @throws HsServicePermission
	 *             if this operation is not permitted
	 */
	public void read(HsResultHandler onResult) throws HsException;

	/**
	 * Send write command on this attribute
	 * 
	 * @param onResult
	 *            Callback executed on result and/or error
	 * @throws HsException
	 *             on error
	 * @throws HsServicePermission
	 *             if this operation is not permitted
	 */
	public void write(HsResultHandler onResult) throws HsException;
}
