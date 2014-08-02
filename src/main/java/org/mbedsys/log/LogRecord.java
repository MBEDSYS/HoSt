package org.mbedsys.log;

public interface LogRecord {
	/**
	 * Get log record date in milliseconds since 1970-01-01 at 00:00:00
	 * 
	 * @return date as a long
	 */
	long getMillis();
	
	/**
	 * Get the log level of this record
	 * 
	 * @return the LogLevel
	 */
	Level getLevel();
	
	/**
	 * Get the message
	 * 
	 * @return a String value
	 */
	String getMessage();
}
