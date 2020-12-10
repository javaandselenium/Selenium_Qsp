package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s = new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("i");
		s.selectByVisibleText("dosa");
		List<WebElement> option = s.getAllSelectedOptions();
		for(WebElement e:option)
		{
			System.out.println(e.getText());
		}
	}

}
