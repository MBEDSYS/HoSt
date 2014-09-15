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
import java.util.Set;

/**
 * A service (internal object)
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MbedSYS
 */
public interface HsServiceInternal {
	
	/**
	 * Add a cluster
	 * 
	 * @param cluster
	 */
	void addCluster(String typeName, HsCallback<HsClusterInternal, RuntimeException> onInit);
	
	/**
	 * Add a cluster
	 * 
	 * @param cluster
	 */
	void addCluster(String typeName, HsCallback<HsClusterInternal, RuntimeException> onInit, int id);

	/**
	 * Get a cluster by the given relative path the following format:
	 * &lt;cluster type&gt;/&lt;instance id&gt; (Example of a Switch cluster
	 * path: Switch/0)
	 * 
	 * @param path
	 *            relative path from this device with the following format:
	 *            &lt;cluster type&gt;/&lt;instance id&gt;
	 * @return a cluster object of null if there is no cluster with the given path
	 */
	HsClusterInternal getCluster(String path);

	/**
	 * Get the cluster path list
	 * 
	 * @return a set of String
	 */
	public Set<String> clusterPathSet();

	/**
	 * Get all the clusters
	 * 
	 * @return a collection of attributes
	 */
	public Collection<HsClusterInternal> clusters();
	
	/**
	 * (Re)Enable this service
	 */
	public void enable();
	
	/**
	 * Disable this service
	 */
	public void disable();
	
	/**
	 * Leave this service
	 */
	public void leave();
	
	/**
	 * Set the last activity time to current time
	 */
	public void setLastActivityTimeToCurrent();
	
	/**
	 * Get HsService reference
	 * 
	 * @return the reference to the HsService
	 */
	public HsService getService();
}
