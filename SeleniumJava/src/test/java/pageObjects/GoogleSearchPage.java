package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element;
	
	public static WebElement searchBox(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
	}

	public static WebElement searchButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		return element;
	}
	

}
