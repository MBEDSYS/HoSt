package org.mbedsys.host;

public interface HsApp {
	void start(HsAppContext stackContext);
	void stop(HsAppContext stackContext);
}
