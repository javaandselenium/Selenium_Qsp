package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
@Parameters({"browsername"})
@Test
public void test(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	driver.get("http://automationpractice.com/index.php?controller=order");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.id("search_query_top")).sendKeys("dress");
driver.findElement(By.name("submit_search")).click();
driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]")).click();
driver.findElement(By.cssSelector("i[class='icon-plus']")).click();
driver.findElement(By.id("color_14")).click();
}
@AfterMethod
public void closeapp() {
	driver.close();
}

}
