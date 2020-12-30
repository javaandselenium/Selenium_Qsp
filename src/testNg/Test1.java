package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@Test
	public void login() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String t = driver.getTitle();
	//Assert.assertEquals(t,"tyrygytys ytu");
	SoftAssert s=new SoftAssert();
	s.assertEquals(t,"ggfghrtvghy");
	Reporter.log(t,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	s.assertAll();
	
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
