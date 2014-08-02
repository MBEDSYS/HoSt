package org.mbedsys.log;

public interface LogHandler {
	/**
	 * Method called when a record is published
	 * 
	 * @param record LogRecord object
	 */
	void publish(LogRecord record);
}
