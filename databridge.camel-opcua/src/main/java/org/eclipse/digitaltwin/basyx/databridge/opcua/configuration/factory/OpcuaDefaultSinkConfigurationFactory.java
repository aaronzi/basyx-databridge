/*******************************************************************************
 * Copyright (C) 2024 the Eclipse BaSyx Authors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * SPDX-License-Identifier: MIT
 ******************************************************************************/
package org.eclipse.digitaltwin.basyx.databridge.opcua.configuration.factory;

import org.eclipse.digitaltwin.basyx.databridge.core.configuration.factory.DataSinkConfigurationFactory;
import org.eclipse.digitaltwin.basyx.databridge.opcua.configuration.OpcuaProducerConfiguration;

/**
 * A default configuration factory for OpcUa from a default file location
 * 
 * @author Aaron Zielstorff
 *
 */
public class OpcuaDefaultSinkConfigurationFactory extends DataSinkConfigurationFactory {
	public static final String DEFAULT_FILE_PATH = "opcuadatasink.json";
	
	public OpcuaDefaultSinkConfigurationFactory(ClassLoader loader) {
		super(DEFAULT_FILE_PATH, loader, OpcuaProducerConfiguration.class);
	}

	public OpcuaDefaultSinkConfigurationFactory(String filePath, ClassLoader loader) {
		super(filePath, loader, OpcuaProducerConfiguration.class);
	}
}
