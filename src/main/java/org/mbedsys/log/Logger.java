package org.mbedsys.log;

public interface Logger  {
	/**
	 * Log a message, with no arguments.
	 * <p>
	 * If the logger is currently enabled for the given message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   level   One of the message level identifiers, e.g., SEVERE
	 * @param   msg     The string message
	 */
	public abstract void log(Level level, Object msg);

	/**
	 * Log a message, with one object property.
	 * <p>
	 * If the logger is currently enabled for the given message
	 * level then a corresponding LogRecord is created and forwarded
	 * to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param   level   One of the message level identifiers, e.g., SEVERE
	 * @param   msg     The string message (or a key in the message catalog)
	 * @param   param1  property to the message
	 */
	public abstract void log(Level level, Object msg, Object param1);

	/**
	 * Log a message, with an array of object arguments.
	 * <p>
	 * If the logger is currently enabled for the given message
	 * level then a corresponding LogRecord is created and forwarded
	 * to all the registered output Handler objects.
	 * <p>
	 * 
	 * @param   level   One of the message level identifiers, e.g., SEVERE
	 * @param   msg     The string message (or a key in the message catalog)
	 * @param   params  array of propertys to the message
	 */
	public abstract void log(Level level, Object msg, Object[] params);

	/**
	 * Log a message, with associated Throwable information.
	 * <p>
	 * If the logger is currently enabled for the given message
	 * level then the given arguments are stored in a LogRecord
	 * which is forwarded to all registered output handlers.
	 * <p>
	 * Note that the thrown argument is stored in the LogRecord thrown
	 * property, rather than the LogRecord propertys property.  Thus is it
	 * processed specially by output Formatters and is not treated
	 * as a formatting property to the LogRecord message property.
	 * <p>
	 * 
	 * @param   level   One of the message level identifiers, e.g., SEVERE
	 * @param   msg     The string message (or a key in the message catalog)
	 * @param   thrown  Throwable associated with log message.
	 */
	public abstract void log(Level level, Object msg, Throwable thrown);

	/**
	 * Log a SEVERE message.
	 * <p>
	 * If the logger is currently enabled for the SEVERE message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void severe(Object msg);

	/**
	 * Log a WARNING message.
	 * <p>
	 * If the logger is currently enabled for the WARNING message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void warning(Object msg);

	/**
	 * Log an INFO message.
	 * <p>
	 * If the logger is currently enabled for the INFO message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void info(Object msg);

	/**
	 * Log a CONFIG message.
	 * <p>
	 * If the logger is currently enabled for the CONFIG message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void config(Object msg);

	/**
	 * Log a FINE message.
	 * <p>
	 * If the logger is currently enabled for the FINE message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void fine(Object msg);

	/**
	 * Log a FINER message.
	 * <p>
	 * If the logger is currently enabled for the FINER message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void finer(Object msg);

	/**
	 * Log a FINEST message.
	 * <p>
	 * If the logger is currently enabled for the FINEST message
	 * level then the given message is forwarded to all the
	 * registered output Handler objects.
	 * <p>
	 * 
	 * @param   msg     The string message
	 */
	public abstract void finest(Object msg);
}
