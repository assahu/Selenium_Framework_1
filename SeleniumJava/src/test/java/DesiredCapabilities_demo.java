import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_demo {

	public static void main(String[] args) {
		
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", project_path+"\\drivers\\ieDriver\\IEDriverServer.exe");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new InternetExplorerDriver(desiredCapabilities);
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Bahubali");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}
}
