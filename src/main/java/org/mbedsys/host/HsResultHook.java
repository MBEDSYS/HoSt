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
import org.mbedsys.jvar.VariantMap;

/**
 * <p>
 * This interface describes callback executed on command/read/write result.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a>
 * Copyright 2014 MbedSYS
 */
public interface HsResultHook {
	
	/**
	 * Error code: Command timeout
	 */
	public static final int E_TIMEOUT = 1;
	
	/**
	 * Error code: Internal error
	 */
	public static final int E_INTERNAL = 2;
	
	/**
	 * Callback executed on success
	 * 
	 * @param result optional result. Can be null
	 * @param parameters only applicable for command with out or inout parameters. Can be null
	 */
	void onSuccess(Variant result, VariantMap parameters);
	
	/**
	 * Callback executed on failure
	 * 
	 * @param code error code
	 * @param message error message
	 */
	void onFailure(int code, String message);
}