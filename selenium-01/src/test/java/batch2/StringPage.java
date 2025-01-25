package batch2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StringPage {

	WebDriver driver;
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement passWord;
	
	public StringPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void UserName(String name) {
		userName.sendKeys(name);
	}
	public void PassWord(String pass) {
		passWord.sendKeys(pass);
	}
}
