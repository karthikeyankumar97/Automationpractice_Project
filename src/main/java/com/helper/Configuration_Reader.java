package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mini_Project1\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	public  String getemail() {
	String email = p.getProperty("email");
	return email;
	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;

	}

}
