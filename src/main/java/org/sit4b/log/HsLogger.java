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

package org.sit4b.log;

/**
 * Logger
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsLogger {

	/**
	 * Log a message, with additional arguments.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void log(HsLogLevel level, String msg, Object... params);

	/**
	 * Log a message, with associated Throwable information and optional arguments.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void log(HsLogLevel level, String msg, Throwable thrown, Object... params);
	
	/**
	 * Log a SEVERE message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void severe(String msg, Object... params);

	/**
	 * Log a SEVERE message, with associated Throwable information and optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void severe(String msg, Throwable thrown, Object... params);

	/**
	 * Log a WARNING message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void warning(String msg, Object... params);

	/**
	 * Log a WARNING message, with associated Throwable information and optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void warning(String msg, Throwable thrown, Object... params);

	/**
	 * Log an INFO message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void info(String msg, Object... params);

	/**
	 * Log a INFO message, with associated Throwable information and optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void info(String msg, Throwable thrown, Object... params);

	/**
	 * Log a CONFIG message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void config(String msg, Object... params);

	/**
	 * Log a CONFIG message, with associated Throwable information and optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 * @param params
	 *            array of properties to the message
	 */
	public abstract void config(String msg, Throwable thrown, Object... params);

	/**
	 * Log a FINE message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void fine(String msg, Object... params);

	/**
	 * Log a FINER message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void finer(String msg, Object... params);

	/**
	 * Log a FINEST message, with optional arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void finest(String msg, Object... params);
}
