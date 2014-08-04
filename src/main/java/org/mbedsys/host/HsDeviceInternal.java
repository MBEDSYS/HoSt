package org.mbedsys.host;

import org.mbedsys.jvar.VariantMap;

public interface HsDeviceInternal {
	void put(HsCluster cluster);
	VariantMap getProperties();
}
