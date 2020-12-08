package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
	if(username.isDisplayed())
	{
		username.sendKeys("admin");
		System.out.println("pass:eleemnt is dispalyed");
	}
	else
	{
		System.out.println("fail:element is not dispalyed");
	}
	driver.close();
	}

}
