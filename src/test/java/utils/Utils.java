package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* Read data from Setting.properties file */
public class Utils {
	// variable that will include one instance of the class
		private static Utils utiles= null;
		private static Properties prop;

		// private constructor
		private Utils() {
			try (InputStream input = new FileInputStream(".\\src\\test\\resources\\data\\Setting.properties")) {
				prop = new Properties();
				// load a properties file
				prop.load(input);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		// Load a properties file and retrieve the property value.
		public static String readProperty(String key) {
			String value = "";
			if (utiles == null) {
				utiles = new Utils();
			}
			// get the property value
			value = prop.getProperty(key);

			return value;
		}
}
