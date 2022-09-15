package com.utility.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigOrange {
	
	
	public static String getConfigOrange(String value) {
		
		
		File orange=new File("./Config.propertiesOrange");
		FileInputStream fs=null;
		try {
			fs=new FileInputStream(orange);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		
		Properties p=new Properties();
		try {
			p.load(fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return p.getProperty(value);
		
	
	}

}
