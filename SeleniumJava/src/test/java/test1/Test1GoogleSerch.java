package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1GoogleSerch {
	
	public static void main(String[] args) throws InterruptedException {
		
		//call googleSearch test method
		googleSearch();
		
	}
	
	public static void googleSearch() throws InterruptedException {
		
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//wait for 3 seconds
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("Test1 completed");
		
	}

}
