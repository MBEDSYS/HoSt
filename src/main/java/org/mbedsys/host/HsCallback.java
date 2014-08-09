package org.mbedsys.host;

public interface HsCallback<T, E extends Exception> {
	void exec(T arg) throws E;
}