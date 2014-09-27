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
 * Logger
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsLogger {
	/**
	 * Log a message, with no arguments.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message
	 */
	public abstract void log(HsLogLevel level, String msg);

	/**
	 * Log a message, with one object property.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void log(HsLogLevel level, String msg, Object param1);

	/**
	 * Log a message, with an array of object arguments.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void log(HsLogLevel level, String msg, Object[] params);

	/**
	 * Log a message, with associated Throwable information.
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 */
	public abstract void log(HsLogLevel level, String msg, Throwable thrown);

	/**
	 * Log a SEVERE message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void severe(String msg);

	/**
	 * Log a SEVERE message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void severe(String msg, Object param1);

	/**
	 * Log a SEVERE message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void severe(String msg, Object[] params);

	/**
	 * Log a SEVERE message, with associated Throwable information.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 */
	public abstract void severe(String msg, Throwable thrown);

	/**
	 * Log a WARNING message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void warning(String msg);

	/**
	 * Log a WARNING message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void warning(String msg, Object param1);

	/**
	 * Log a WARNING message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void warning(String msg, Object[] params);

	/**
	 * Log a WARNING message, with associated Throwable information.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 */
	public abstract void warning(String msg, Throwable thrown);

	/**
	 * Log an INFO message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void info(String msg);

	/**
	 * Log a INFO message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void info(String msg, Object param1);

	/**
	 * Log a INFO message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void info(String msg, Object[] params);

	/**
	 * Log a INFO message, with associated Throwable information.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 */
	public abstract void info(String msg, Throwable thrown);

	/**
	 * Log a CONFIG message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void config(String msg);

	/**
	 * Log a CONFIG message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void config(String msg, Object param1);

	/**
	 * Log a CONFIG message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void config(String msg, Object[] params);

	/**
	 * Log a CONFIG message, with associated Throwable information.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param thrown
	 *            Throwable associated with log message.
	 */
	public abstract void config(String msg, Throwable thrown);

	/**
	 * Log a FINE message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void fine(String msg);

	/**
	 * Log a FINE message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void fine(String msg, Object param1);

	/**
	 * Log a FINE message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void fine(String msg, Object[] params);

	/**
	 * Log a FINER message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void finer(String msg);

	/**
	 * Log a FINER message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void finer(String msg, Object param1);

	/**
	 * Log a FINER message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void finer(String msg, Object[] params);

	/**
	 * Log a FINEST message.
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void finest(String msg);

	/**
	 * Log a FINEST message, with one object property.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param param1
	 *            property to the message
	 */
	public abstract void finest(String msg, Object param1);

	/**
	 * Log a FINEST message, with an array of object arguments.
	 * 
	 * @param msg
	 *            The string message (or a key in the message catalog)
	 * @param params
	 *            array of propertys to the message
	 */
	public abstract void finest(String msg, Object[] params);
}
