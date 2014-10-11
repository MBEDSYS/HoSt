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

package org.sit4b.hobus;

import java.security.Permission;

import org.osgi.framework.Bundle;

/**
 * A service permission
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public abstract class HbServicePermission extends Permission {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3178900972304300592L;
	private Bundle bundle;

	/**
	 * Service permission constructor
	 * 
	 * @param name Permission name
	 * @param bundle Associated bundle
	 */
	public HbServicePermission(String name, Bundle bundle) {
		super(name);
		this.bundle = bundle;
	}

	/**
	 * Get the associated bundle
	 * 
	 * @return a reference to a bundle
	 */
	public Bundle getBundle() {
		return bundle;
	}
}
