package salesken.ai.utils;

/**
 * 
 */


import java.io.InputStream;
import java.util.Properties;


public class DBProperties {

	public enum PropertyNames {
		MONGO_DB_URL,MONGO_DB_PORT
	};

	public static Properties configProperties;
	static {
		try {
			InputStream inputStream = DBProperties.class.getClassLoader().getResourceAsStream("db.properties");
			// InputStream inputStream = new FileInputStream(new
			// File("/root/vaibhav/appie/appie/db.properties"));
			configProperties = new Properties();
			configProperties.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return (String) configProperties.get(key);
	}
}