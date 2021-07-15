package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		uploadFile();
	}

	public static void uploadFile() throws Exception {

		String myProject = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",myProject+"/drivers/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/div/div[1]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span")).click();

		Runtime.getRuntime().exec("\"E:\\\\Auto IT Scripts\\\\First_Demo_Script.exe\"");
		Thread.sleep(3000);

		driver.close();

	}

}
