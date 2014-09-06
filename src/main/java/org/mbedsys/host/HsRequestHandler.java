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
 * This interface describes callback executed on command/read/write request.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a>
 * Copyright 2014 MbedSYS
 */
public interface HsRequestHandler {
	
	/**
	 * This callback must be implemented by the stack to overload read/write/command request
	 * 
	 * @param arguments
	 * @param onResult
	 * @throws HsException on error
	 */
	void onExec(Variant arguments, HsResultHandler onResult) throws HsException;
}