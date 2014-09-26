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
	 * <p>
	 * If the logger is currently enabled for the given message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param level
	 *            One of the message level identifiers, e.g., SEVERE
	 * @param msg
	 *            The string message
	 */
	public abstract void log(HsLogLevel level, String msg);

	/**
	 * Log a message, with one object property.
	 * <p>
	 * If the logger is currently enabled for the given message level then a
	 * corresponding LogRecord is created and forwarded to all the registered
	 * output Handler objects.
	 * <p>
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
	 * <p>
	 * If the logger is currently enabled for the given message level then a
	 * corresponding LogRecord is created and forwarded to all the registered
	 * output Handler objects.
	 * <p>
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
	 * <p>
	 * If the logger is currently enabled for the given message level then the
	 * given arguments are stored in a LogRecord which is forwarded to all
	 * registered output handlers.
	 * <p>
	 * Note that the thrown argument is stored in the LogRecord thrown property,
	 * rather than the LogRecord propertys property. Thus is it processed
	 * specially by output Formatters and is not treated as a formatting
	 * property to the LogRecord message property.
	 * <p>
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
	 * <p>
	 * If the logger is currently enabled for the SEVERE message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void severe(String msg);

	/**
	 * Log a WARNING message.
	 * <p>
	 * If the logger is currently enabled for the WARNING message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void warning(String msg);

	/**
	 * Log an INFO message.
	 * <p>
	 * If the logger is currently enabled for the INFO message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void info(String msg);

	/**
	 * Log a CONFIG message.
	 * <p>
	 * If the logger is currently enabled for the CONFIG message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void config(String msg);

	/**
	 * Log a FINE message.
	 * <p>
	 * If the logger is currently enabled for the FINE message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void fine(String msg);

	/**
	 * Log a FINER message.
	 * <p>
	 * If the logger is currently enabled for the FINER message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void finer(String msg);

	/**
	 * Log a FINEST message.
	 * <p>
	 * If the logger is currently enabled for the FINEST message level then the
	 * given message is forwarded to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param msg
	 *            The string message
	 */
	public abstract void finest(String msg);
}
