package org.mbedsys.host;

import org.mbedsys.jvar.VariantMap;


public interface HsStackContext extends HsAppContext {
	HsServiceInternal newService(String id, VariantMap properties);
}
