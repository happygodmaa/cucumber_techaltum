package org.techAltum.dataReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	
	String propertyFile = System.getProperty("user.dir") + "/data";
	
	public Properties getProperty() throws Exception {
		
		Properties properties = new Properties();
		
		File file = new File(propertyFile + "/data.properties");
		FileInputStream fIP = new FileInputStream(file);
		
		properties.load(fIP);
		
		return properties;
	}
}
