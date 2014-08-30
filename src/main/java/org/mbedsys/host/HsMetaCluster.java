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

package org.mbedsys.host;

import java.util.Collection;

import org.mbedsys.jvar.VariantMap;

/**
 * <p>
 * This interface describes a cluster meta model
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MbedSYS
 */
public interface HsMetaCluster {

	/**
	 * Get parent meta clusters
	 * 
	 * @return a reference to the parents
	 */
	public Collection<HsMetaCluster> parents();
	
	public boolean isAssignableFrom(HsMetaCluster type);

	/**
	 * Get cluster type name
	 * 
	 * @return type name as String
	 */
	public String name();

	/**
	 * Get the attribute list
	 * 
	 * @return a set of String
	 */
	public Collection<HsMetaAttribute> attributes();

	/**
	 * Get the command list
	 * 
	 * @return a set of String
	 */
	public Collection<HsMetaCommand> commands();

	/**
	 * Get constants
	 * 
	 * @return constants as a VariantMap
	 */
	public VariantMap constants();
}
