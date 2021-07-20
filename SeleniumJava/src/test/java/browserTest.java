import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String project_path = System.getProperty("user.dir");
//		System.setProperty("webdriver.gecko.driver", project_path+"\\drivers\\geckoDriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", project_path+"\\drivers\\chromeDriver\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", project_path+"\\drivers\\ieDriver\\IEDriverServer.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://selenium.dev/");
		
		WebElement downloads = driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[1]"));
		downloads.click();
		driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("CSS");
		
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}

}
