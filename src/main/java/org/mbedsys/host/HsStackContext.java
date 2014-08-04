package org.mbedsys.host;

import org.mbedsys.jvar.Variant;

public interface HsStackContext {
	HsAttribute newAttribute(String name, Variant initVal, int capabilities,
			HsAttributeCustomizer attrCustomizer);

	HsAttribute newComputedAttribute(String name, Variant initVal,
			int capabilities, HsComputedAttributeCustomizer attrCustomizer);
	
	HsAttribute newCommand(String name, HsCommandCustomizer attrCustomizer);
}
