package ObjectSearch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_page {

	@FindBy(name="q")
	private WebElement google_search;
	@FindBy(name="btnK")
	private WebElement google_search_button;
	@FindBy(xpath="//div[@class='CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf']")
	private WebElement link;
	@FindBy(id="twotabsearchtextbox")
	private WebElement amazon_search;
	@FindBy(id="nav-search-submit-button")
	private WebElement amazon_search_button;
	@FindBy(partialLinkText="Samsung Galaxy S23 Ultra 5G AI")
	private WebElement mobile_click;
	//window Handling
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[7]")
	private WebElement check_box;
	@FindBy(xpath="//input[@name='submit.addToCart']")
	private WebElement addTOCart;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToBuy;
	WebDriver driver;
	public Amazon_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void google_Search(String arg) {
		google_search.sendKeys(arg);
	}
	public void google_search_Button() {
		google_search_button.click();
	}
	public void Link() {
		link.click();
	}
	public void amazon_search(String mobileName) {
		amazon_search.sendKeys(mobileName);
	}
	public void amazon_search_Button() {
		amazon_search_button.click();
	}
	public void mobile_Click() {
		mobile_click.click();
	}
	public void window_Handle(WebDriver driver) {
		Set<String> str = driver.getWindowHandles();
		Iterator<String> i = str.iterator();
		while(i.hasNext()) {
			String rv = i.next();
			driver.switchTo().window(rv);
		}
	}
	public void check_Box() {
		check_box.click();
	}
	public void addTOCart() {
		addTOCart.click();
	}
	public void proceedToBuy() {
		proceedToBuy.click();
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public void driver() {
		driver.close();
	}
	
	
}
