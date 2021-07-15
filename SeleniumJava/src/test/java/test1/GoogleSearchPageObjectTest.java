package test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPage;
//import pageObjects.GoogleSearchPageObject;

public class GoogleSearchPageObjectTest {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		searchBoxTest();


	}

	public static void searchBoxTest() throws InterruptedException {

		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"\\drivers\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		//go to google.com
		driver.get("https://www.google.com/");

		//enter text in search text box
		GoogleSearchPage.searchBox(driver).sendKeys("Automation Step by Step");

		//click on search button
		GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);

		//wait for 3 seconds
		Thread.sleep(3000);

		driver.close();
		driver.quit();

		System.out.println("Test1 completed");
	}

}
