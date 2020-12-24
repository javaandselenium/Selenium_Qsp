package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[4]")
    private WebElement dress;
	
	Homepage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void dreeBtn() {
		dress.click();
	}
	
}
