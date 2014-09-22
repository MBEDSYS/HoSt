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
 * Log Level
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public enum Level {

	/**
	 * OFF is a special level that can be used to turn off logging.
	 */
	OFF,
	
	/**
	 * SEVERE is a message level indicating a serious failure.
	 * <p>
	 * In general SEVERE messages should describes events that are
	 * of considerable importance and which will prevent normal
	 * program execution.   They should be reasonably intelligible
	 * to end users and to system administrators.
	 */
	SEVERE,
	
	/**
	 * WARNING is a message level indicating a potential problem.
	 * <p>
	 * In general WARNING messages should describes events that will
	 * be of interest to end users or system managers, or which
	 * indicate potential problems.
	 */
	WARNING,
	
	/**
	 * INFO is a message level for informational messages.
	 * <p>
	 * Typically INFO messages will be written to the console
	 * or its equivalent.  So the INFO level should only be
	 * used for reasonably significant messages that will
	 * make sense to end users and system administrators.
	 */
	INFO,
	
	/**
	 * CONFIG is a message level for static configuration messages.
	 * <p>
	 * CONFIG messages are intended to provide a variety of static
	 * configuration information, to assist in debugging problems
	 * that may be associated with particular configurations.
	 * For example, CONFIG message might include the CPU type,
	 * the graphics depth, the GUI look-and-feel, etc.
	 */
	CONFIG,
	
	/**
	 * FINE is a message level providing tracing information.
	 * <p>
	 * All of FINE, FINER, and FINEST are intended for relatively
	 * detailed tracing.  The exact meaning of the three levels will
	 * vary between subsystems, but in general, FINEST should be used
	 * for the most voluminous detailed output, FINER for somewhat
	 * less detailed output, and FINE for the  lowest volume (and
	 * most important) messages.
	 * <p>
	 * In general the FINE level should be used for information
	 * that will be broadly interesting to developers who do not have
	 * a specialized interest in the specific subsystem.
	 * <p>
	 * FINE messages might include things like minor (recoverable)
	 * failures.  Issues indicating potential performance problems
	 * are also worth logging as FINE.
	 */
	FINE,
	
	/**
	 * FINER indicates a fairly detailed tracing message.
	 * By default logging calls for entering, returning, or throwing
	 * an exception are traced at this level.
	 */
	FINER,
	
	/**
	 * FINEST indicates a highly detailed tracing message.
	 */
	FINEST

}
