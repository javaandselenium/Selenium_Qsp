package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5 {
	@DataProvider
	public Object[][] getdata(){
		Object[][] a=new Object[3][2];	
		a[0][0]="abcdefgh";
		a[0][1]="abcdefgh556456";
		a[1][0]=1243234;
		a[1][1]="tygg656gy9";
		a[2][0]="fdgfg57#$#$@$@#$$%";
		a[2][1]="fgff54654#$%#5";
		return a;
	}
	
	@Test(dataProvider="getdata")
	public void demo(String us,String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(us);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	Thread.sleep(3000);
	driver.close();
	}

}
