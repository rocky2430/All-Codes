package ObjectSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookPage {

	WebDriver driver;
	
	
	@FindBy(name="q")
	private WebElement google_search;
	@FindBy(name="btnK")
	private WebElement google_search_button;
	@FindBy(xpath="//h3[@class='LC20lb MBeuO DKV0Md']")
	private WebElement link;
	By createNewAccount = By.linkText("Create new account");
	By firstName = By.name("firstname");
	By surName = By.name("lastname");
	By gendre = By.xpath("//input[@value='2']");
	By email = By.xpath("//input[@name='reg_email__']");
	By newPassword = By.xpath("//input[@name='reg_passwd__']");
	By logIn = By.xpath("button[@name='websubmit']");
	
	public facebookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void createNewAccount() {
		driver.findElement(createNewAccount).click(); 
	}
	public void google_Search(String face) {
		google_search.sendKeys(face);
	}
	public void google_Search_button() {
		google_search_button.click();
	}
	public void Link() {
		link.click();
	}
	public void firstName(String name) {
		driver.findElement(firstName).sendKeys(name);
	}
	public void surName(String surname) {
		driver.findElement(surName).sendKeys(surname);
	}
	public void gendre() {
		driver.findElement(gendre).click();
	}
	public void email(String Email) {
		driver.findElement(email).sendKeys(Email);
	}
	public void password(String Password) {
		driver.findElement(newPassword).sendKeys(Password);
	}
	public void logInButton() {
		driver.findElement(logIn).click();
	}
	public void driver() {
		driver.close();
	}
	
}

	