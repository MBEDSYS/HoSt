package org.mbedsys.host;

import org.mbedsys.jvar.Variant;

public interface HsAttributeInternal {
	/**
	 * Update the attribute internal value
	 * 
	 * @param value new attribute value
	 */
	public void updateValue(Variant value);
	
	/**
	 * Overload the getValue default method
	 * 
	 * <p>the default action for a get will return the internal value</p>
	 * 
	 * @param handler
	 */
	public void setGetValueHandler(HsGetValueHandler handler);
	
	/**
	 * Overload the default read handler
	 * 
	 * <p>the default action for a read will return the internal value</p>
	 * 
	 * @param handler
	 */
	public void setReadHandler(HsRequestHandler handler);
	
	/**
	 * Setup the write handler
	 * 
	 * <p>the default action for a write will throw a IllegalStateException</p>
	 * 
	 * @param handler
	 */
	public void setWriteHandler(HsRequestHandler handler);
}
