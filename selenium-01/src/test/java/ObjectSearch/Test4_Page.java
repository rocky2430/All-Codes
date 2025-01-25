package ObjectSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test4_Page {

	WebDriver driver;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	private WebElement adminProfile;
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item']")
	private WebElement qualification;
	@FindBy(linkText="Education")
	private WebElement education;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	private WebElement myProfile;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-firstname']']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
	private WebElement MiddleName;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	private WebElement LastName;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	private WebElement EmpId;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement OtherId;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement LicenceId;
	@FindBy(xpath="//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement calender;
	
	public Test4_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void AdminPro() {
		adminProfile.click();
		System.out.println("Admin Profile");
	}
	public void Qualification() {
		qualification.click();
		System.out.println("Qualification");
	}
	public void Education() {
		education.click();
		System.out.println("Education");
	}
	public void MyProfile() throws InterruptedException {
		Thread.sleep(2000);
		myProfile.click();
		System.out.println("My Profile");
	}
	public void FirstName(String name) throws InterruptedException {
		Thread.sleep(2000);
		FirstName.clear();
		FirstName.sendKeys(name);
	}
	public void MiddleName(String Middle) throws InterruptedException {
		Thread.sleep(2000);
		MiddleName.clear();
		MiddleName.sendKeys(Middle);
	}
	public void LastName(String Last) throws InterruptedException {
		Thread.sleep(2000);
		LastName.clear();
		LastName.sendKeys(Last);
	}
	public void EmpID(String id) {
		EmpId.clear();
		EmpId.sendKeys(id);
	}
	public void OtherId(String other) {
		OtherId.clear();
		OtherId.sendKeys(other);
	}
	public void LicenceId(String lice) {
		LicenceId.clear();
		LicenceId.sendKeys(lice);
	}
	
}
