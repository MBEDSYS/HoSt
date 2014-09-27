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

package org.s24b.log;

/**
 * Log record
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsLogRecord {
	/**
	 * Get log record date in milliseconds since 1970-01-01 at 00:00:00
	 * 
	 * @return date as a long
	 */
	long getMillis();

	/**
	 * Get the origin bundle name of this record
	 * 
	 * @return the bundle symbolic name
	 */
	String getBundleName();

	/**
	 * Get the log level of this record
	 * 
	 * @return the LogLevel
	 */
	HsLogLevel getLevel();

	/**
	 * Get the message
	 * 
	 * @return a String value
	 */
	String getMessage();

	/**
	 * Get the related thrown object
	 * 
	 * @return the related Throwable (can be null)
	 */
	Throwable getThrown();

	/**
	 * Get the parameters
	 * 
	 * @return array of parameters (can be null)
	 */
	Object[] getParameters();
}
