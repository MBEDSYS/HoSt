package org.mbedsys.host;

import java.util.Collection;

public interface HsClusterInternal {

	/**
	 * Get the attribute name list
	 * 
	 * @return a set of String
	 */
	public HsAttribute getAttribute();

	/**
	 * Get all the attributes
	 * 
	 * @return a collection of attributes
	 */
	public Collection<HsAttributeInternal> attributes();

	/**
	 * Get attribute by name
	 * 
	 * @param name
	 *            attribute name
	 * @return the suitable attribute or null if they are no attribute available
	 *         with the given name
	 */
	public HsAttributeInternal getAttribute(String name);
	
}
