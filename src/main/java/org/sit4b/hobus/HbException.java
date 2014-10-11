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

/**
 * An exception
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public class HbException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7792837476506519485L;

	public HbException() {
		// TODO Auto-generated constructor stub
	}

	public HbException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HbException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public HbException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
