package org.mbedsys.host;

import java.security.Permission;

public abstract class HsServicePermission extends Permission {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3178900972304300592L;

	public HsServicePermission(String name) {
		super(name);
	}

}
