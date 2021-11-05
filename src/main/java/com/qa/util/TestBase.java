package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static Properties prop;
	
	
	public static void init() throws IOException {
		prop = new Properties();
		
		
		try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
		prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		init();
	}
	
	@AfterMethod
	public void tearDown() throws IOException {
		//init();
	}

}
