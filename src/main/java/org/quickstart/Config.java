package org.quickstart;

import java.io.*;
import java.util.*;

public class Config {

	private Properties configFile;

	private static Config instance;

	private Config() {
		configFile = new Properties();
		try {
			configFile.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getValue(String key) {
		return configFile.getProperty(key);
	}

	public static String getProperty(String key) {
		if (instance == null) instance = new Config();
		return instance.getValue(key);
	}
}