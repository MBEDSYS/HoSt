package org.mbedsys.host;

import org.mbedsys.jvar.VariantMap;


public interface HsStackContext extends HsAppContext {
	HsServiceInternal addService(String id, VariantMap properties);
}
