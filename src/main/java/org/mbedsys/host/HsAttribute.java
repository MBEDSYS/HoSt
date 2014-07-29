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

package org.mbedsys.host;

import org.mbedsys.jvar.Variant;

public interface HsAttribute {
	public static byte READ = 0x01;
	public static byte WRITE = 0x02;
	public static byte READWRITE = 0x03;
	String getName();
	Variant getValue();
	byte getCapabilities();
	void read() throws HsException;
	void write() throws HsException;
}
