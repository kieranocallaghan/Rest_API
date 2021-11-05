package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Helper {

	static Properties prop = new Properties();

	// Start of Performance override vars
	
	public static String GetBuildURL(String key) { // Step 1 Pass parameters for REST URI
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println("Reading the Jenkins Job Name '" + prop.getProperty(key)
					+ "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading Jenkins Jenkins Job Name from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End Get Build URL
	
	
	
	public static String GetJobName(String key) { // Step 1 Pass parameters for REST URI
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println("Reading the Jenkins Job Name '" + prop.getProperty(key)
					+ "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading Jenkins Jenkins Job Name from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetJobName

	public static String GetExpectedTime(String key) { // Step 1 Pass parameters for REST URI
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println("Reading the Jenkins console GetExpectedTime '" + prop.getProperty(key)
					+ "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading Jenkins console GetExpectedTime from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideREST_URI

	public static String GetPercentageAllowed(String key) { // Step 1 Pass parameters for REST URI
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println("Reading the GetPercentageAllowed '" + prop.getProperty(key)
					+ "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading GetPercentageAllowed from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // Performance override vars

	public static String GetOverRideJenkinsBrowser(String key) { // Step 1 Pass parametyers
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the browser '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading browser from Jenkins opveride =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsBrowser

	public static String GetOverRideJenkinsURL(String testUrl) { // Step 1 Pass parametyers

		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(testUrl);

		if (env == null) {
			System.out.println(
					"Reading the URL '" + prop.getProperty("url2") + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading URL from Jenkins opveride =" + env);
			}
		}

		if (env == null) {
			return prop.getProperty(testUrl);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsURL

	public static String GetOverRideJenkinsUserName(String key) { // Step 1 Pass parametyers

		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties");
			String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties";
			System.out.println("Path is ="+path);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the user name '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading user name from Jenkins opveride =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsUserName

	public static String GetOverRideJenkinsPassW(String key) { // Step 1 Pass parametyers

		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the password '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading password from Jenkins opverride =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	}

	public static String GetOverRideJenkinsLocale(String key) { // Step 1 Pass parametyers
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsBrowser

	public static String GetOverRideJenkinsUploadSpeed(String key) { // Step 1 Pass parametyers
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsUploadSpeed

	public static String GetOverRideJenkinsDownloadSpeed(String key) { // Step 1 Pass parametyers
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideJenkinsDownloadSpeed

	public static String GetOverRideREST_URI(String key) { // Step 1 Pass parameters for REST URI
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End GetOverRideREST_URI

	public static String GetRESTCity(String key) { // Step 1 Pass parameters for REST URI
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}

	}

	public static String GetRESTRequest(String key) { // Step 1 Pass parameters for REST URI
		// Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String env = System.getenv(key);

		if (env == null) {
			System.out.println(
					"Reading the locale '" + prop.getProperty(key) + "' from the local properties config file");
		} else {
			if (env != null) {
				System.out.println("Reading locale from Jenkins override =" + env);
			}
		}

		// System.out.println("Properties is " + prop.toString());

		if (env == null) {
			return prop.getProperty(key);
		} else {
			return env;

		}
	} // End

}
