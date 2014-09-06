package org.mbedsys.host;

import org.mbedsys.jvar.Variant;

public interface HsAttributeInternal {
	/**
	 * Update the attribute value
	 * 
	 * @param value new attribute value
	 */
	public void updateValue(Variant value);
	
	/**
	 * Overload the getValue default method
	 * 
	 * @param hook
	 */
	public void setGetValueHook(HsRequestHandler hook);
	public void setReadHook(HsRequestHandler hook);
	public void setWriteHook(HsRequestHandler hook);
}
