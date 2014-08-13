package org.mbedsys.host;

import java.security.Permission;

public abstract class HsClusterPermission extends Permission {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3178900972304300592L;

	public HsClusterPermission(String name) {
		super(name);
	}

}
