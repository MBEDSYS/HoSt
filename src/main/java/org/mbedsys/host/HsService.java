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
 * <p>
 * This interface describes a device object.
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MbedSYS
 */
public interface HsService {
	/**
	 * The device path is compound from the device family following by the MAC
	 * address or equivalent (&lt;family&gt;/&lt;MAC&gt;) and used to
	 * distinguish a device. (Example of a ZigBee device path:
	 * ZigBee/0123456789ABCDEF)
	 * 
	 * @return the device path using the following format:
	 *         &lt;family&gt;/&lt;MAC&gt;
	 */
	String getPath();

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
	HsCluster getCluster(String path);

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
	public Collection<HsCluster> clusters();
}
