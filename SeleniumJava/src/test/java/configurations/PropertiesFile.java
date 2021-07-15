package configurations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test1.TestNGGoogleSearchPage;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();

	}
	
	public static void getProperties() {
		
		
		try {
			
			InputStream input = new FileInputStream(projectPath+"/src/test/java/configurations/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNGGoogleSearchPage.browserName = browser;
			
			
		} catch (Exception e) {
			
		}
	}
	
	public static void setProperties() {
		
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/configurations/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
			
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
