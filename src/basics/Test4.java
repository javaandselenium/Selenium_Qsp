package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.ebay.com/");
	driver.navigate().to("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=phone&_sacat=0");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.close();
	}

}
