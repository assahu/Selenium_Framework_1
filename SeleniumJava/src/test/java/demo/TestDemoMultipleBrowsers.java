package demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.GoogleSearchPage;

public class TestDemoMultipleBrowsers {

	static WebDriver driver = null;
	static String project_path = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browserName")
	public void setUpTest(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", project_path+"\\drivers\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", project_path+"\\drivers\\geckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", project_path+"\\drivers\\ieDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
	}

	
	@Test
	public static void searchBoxTest() throws InterruptedException {

		//go to google.com
		
		driver.get("https://www.google.com/");

		//enter text in search text box
		GoogleSearchPage.searchBox(driver).sendKeys("Automation Step by Step");

		//click on search button
		GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);

		//wait for 3 seconds
		Thread.sleep(3000);

		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
//		driver.quit();

		System.out.println("Test1 completed");
	}
}
