package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s = new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("i");
		s.selectByVisibleText("dosa");
		List<WebElement> options = s.getOptions();
		ArrayList a = new ArrayList();
		System.out.println("Before sorting");
		for (WebElement b : options) {
			String text = b.getText();
			System.out.println(text);
			a.add(text);
		}
		if (a.contains("dosa")) {
			System.out.println("Pass:option is present");
		} else {
			System.out.println("Fail:option is not present");
		}

	}

}
