package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
		
	}

}
