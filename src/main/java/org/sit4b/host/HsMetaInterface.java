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

package org.sit4b.host;

import java.util.Collection;

import org.mbedsys.jvar.VariantMap;

/**
 * <p>
 * An interface meta model
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HsMetaInterface {

	/**
	 * Get parent meta clusters
	 * 
	 * @return a reference to the parents
	 */
	public Collection<HsMetaInterface> parents();
	
	/**
	 * Determine if a given meta interface can be assigned to objects of this meta interface
	 * 
	 * @param metaInterface meta interface to be checked
	 * @return true if whether objects of the interface metaInterface can be assigned to objects of this meta interface
	 */
	public boolean isAssignableFrom(HsMetaInterface metaInterface);

	/**
	 * Get cluster type name
	 * 
	 * @return type name as String
	 */
	public String getName();

	/**
	 * Get the attribute list
	 * 
	 * @return a set of String
	 */
	public Collection<HsMetaAttribute> attributes();

	/**
	 * Get the method list
	 * 
	 * @return a set of String
	 */
	public Collection<HsMetaMethod> methods();

	/**
	 * Get constants
	 * 
	 * @return constants as a VariantMap
	 */
	public VariantMap constants();
}
