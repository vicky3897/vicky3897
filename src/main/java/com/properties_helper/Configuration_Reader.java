package com.properties_helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File("D:\\eclipse\\maven_project\\src\\main\\java\\com\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
	
	}
	
	public String getUrl() {

	String url = p.getProperty("url");
	return url;
		
	}
	
	public String getEmail() {

		String email = p.getProperty("email");
		return email;
	}
	
	public String getPassword() {

	String password = p.getProperty("password");
	return password;
	
	}
	
	public String getScreenshot() {

		String screenshot = p.getProperty("screenshot");
		return screenshot; 
	}
	
}
