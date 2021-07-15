package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	By searchBox = By.name("q");
	By searchIcon = By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setSearchBox(String text) {
		
		driver.findElement(searchBox).sendKeys(text);
	}
	
	public void clickSearchIcon() {
		
		driver.findElement(searchIcon).sendKeys(Keys.RETURN);
	}

}
