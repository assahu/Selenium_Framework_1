package test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPage;

public class Test1GoogleSerch2 {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//call googleSearch test method
		googleSearch();
		
	}
	
	public static void googleSearch() throws InterruptedException {
		
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
		
		System.out.println("Test1 completed");
		
	}

}
