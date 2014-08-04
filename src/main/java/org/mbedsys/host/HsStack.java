package org.mbedsys.host;

public interface HsStack {
	void start(HsStackContext stackContext);
	void stop(HsStackContext stackContext);
}
