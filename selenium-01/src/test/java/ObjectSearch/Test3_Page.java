package ObjectSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test3_Page {

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement logIn;
	
	public Test3_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void UserName(String name) {
		username.sendKeys(name);
	}
	public void PassWord(String pass) {
		password.sendKeys(pass);
	}
	public void LogIn() {
		logIn.click();
	}
	
}
