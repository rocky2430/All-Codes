package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement passWord;
	@FindBy(linkText="Create new account")
	private WebElement createAc;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(xpath="//option[text()='29']")
	private WebElement daySelect;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="//input[@value='2']")
	private WebElement male;
	@FindBy(name="reg_email__")
	private WebElement mobile;
	@FindBy(name="reg_passwd__")
	private WebElement password;
	@FindBy(linkText="Sign Up")
	private WebElement signButton;
	
	public facebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void username(String name) {
		userName.sendKeys(name);
	}
	public void passWord(String pass) {
		passWord.sendKeys(pass);
	}
	public void CreatAccount() {
		createAc.click();
	}
	public void firstName(String First) {
		firstname.sendKeys(First);
	}
	public void lastName(String last) {
		lastname.sendKeys(last);
	}
	public void select_date() {
		day.click();
	}
	public void selec() {
		daySelect.click();
	}
	public void select_month() {
		month.click();
	}
	public void Month_Select() {
		Select s = new Select(month);
		s.selectByIndex(3);
	}
	public void select_year() {
		year.click();
	}
	public void Year_Select() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void male_Box() {
		male.click();
	}
	public void mobileNo(String mobi) {
		mobile.sendKeys(mobi);
	}
	public void passwod(String PassWord) {
		password.sendKeys(PassWord);
	}
	public void SignButton() {
		signButton.click();
	}
	
	
}
