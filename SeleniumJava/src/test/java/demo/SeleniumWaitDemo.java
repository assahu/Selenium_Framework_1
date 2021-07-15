package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniumWait();
	}
	
	public static void seleniumWait() {
		
		String myProject = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",myProject+"/drivers/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// polling time of implicit is 250 ms
		
//		WebElement wait = new WebDriverWait(driver, 10).
//				until(ExpectedConditions.elementToBeClickable(By.cssSelector("Ima")));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });

		driver.findElement(By.cssSelector("Ima"));
		
		driver.close();
		driver.quit();
	}

}
