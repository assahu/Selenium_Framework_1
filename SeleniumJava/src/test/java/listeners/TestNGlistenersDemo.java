package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class TestNGlistenersDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
//		click on search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
//		driver.findElement(By.name("saa")).sendKeys(Keys.RETURN);
		
		//wait for 3 seconds
//		Thread.sleep(3000);
		
		driver.close();
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("Skipped!!!!");
	}
}
