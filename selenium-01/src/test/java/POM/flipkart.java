package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart {

	@FindBy(id="APjFqb")
	private WebElement google_Search_box;
	@FindBy(name="btnK")
	private WebElement google_search_Button;
	@FindBy(xpath="//h3[@class='LC20lb MBeuO DKV0Md']")
	private WebElement flipkart_link;
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement flipkat_Search_box;
	@FindBy(xpath="//button[@class='_2iLD__']")
	private WebElement flipkart_Search_button;
	@FindBy(partialLinkText="realme 12 Pro+ 5G (Submarine Blue, 128 GB)")
	private WebElement mobile;
	//Handling Window
	@FindBy(partialLinkText="Add")
	private WebElement addCart;
	@FindBy(xpath="(//div[text()='Remove'])[2]")
	private WebElement checkBox1;
	@FindBy(xpath="(//div[text()='Remove'])[3]")
	private WebElement checkBox2;
	@FindBy(linkText="Place Order")
	private WebElement place_order_button;
	
	public flipkart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void google_Search_Box(String search) {
		 google_Search_box.sendKeys(search);
	}
	public void google_search_button() {
		google_search_Button.click();
	}
	public void flipkart_Link() {
		flipkart_link.click();
	}
	public void flipkat_Search_Box(String mo) {
		flipkat_Search_box.sendKeys(mo);
	}
	public void flipkart_Search_Button() {
		flipkart_Search_button.click();
	}
	public void mobileName() {
		mobile.click();
	}
	public void WindowHandling(WebDriver driver) {
		Set<String> str = driver.getWindowHandles();
		Iterator<String> i = str.iterator();
		while(i.hasNext()) {
			String rv = i.next();
			driver.switchTo().window(rv);
		}
	}
	public void AddCart() {
		addCart.click();
	}
	public void CheckBox1() {
		checkBox1.click();
	}
	public void CheckBox2() {
		checkBox2.click();
	}
	public void placeOrder() {
		place_order_button.click();
	}
		
}
