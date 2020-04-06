package com.tyss.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filelib {
	public String getValue(String key) {
		Properties prop = null;
		FileInputStream fis = null;
		prop = new Properties();
		try {
			fis = new FileInputStream("./testdata/common.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}
}
