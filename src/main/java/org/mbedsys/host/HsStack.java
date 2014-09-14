package org.mbedsys.host;


public interface HsStack {
	public static final String SERVICE_GEN_FAMILY = "family.gen";
	public static final String SERVICE_USE_FAMILY = "family.use";
	void start(HsStackContext stackContext);
	void stop(HsStackContext stackContext);
	boolean serviceRestore(HsServiceInternal service);
	boolean serviceAdd(HsServiceInternal service);
	boolean serviceLeave(HsServiceInternal service);
}
