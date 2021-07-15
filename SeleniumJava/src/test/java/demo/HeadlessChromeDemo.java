package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		String myProject = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",myProject+"/drivers/chromeDriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
//		options.addArguments(null);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}

}
