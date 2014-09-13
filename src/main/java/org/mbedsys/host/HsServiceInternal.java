package org.mbedsys.host;

import java.util.Collection;
import java.util.Set;

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
	 * Get HsDevice reference
	 * 
	 * @return the reference to the HsDevice
	 */
	public HsService getDevice();
}
