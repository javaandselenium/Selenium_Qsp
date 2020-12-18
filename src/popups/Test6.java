package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		System.out.println(child.size());
	
		String title="HSBC";
		for(String popup:child) {
			driver.switchTo().window(popup);
			String atilte=driver.getTitle();
			System.out.println(atilte);
			if(atilte.equals(title)) {
				driver.close();
			}
		}

	}

}
