package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon {

	private WebElement link;
	private WebElement textBox;
	private WebElement searchButton;
	private WebElement phoneName;
	//Window Handle
	private WebElement cardCheckBox1;
	private WebElement addToCard;
	private WebElement proceedToBuy;
	private WebElement creatAC;
	private WebElement name;
	private WebElement mobileNo;
	private WebElement passWord;
	
	public amazon(WebDriver driver) throws InterruptedException {
		link = driver.findElement(By.partialLinkText("Shop online at Amazon"));
		Thread.sleep(5000);
		textBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchButton = driver.findElement(By.xpath("//input[@id='input[@id='nav-search-submit-button']"));
		phoneName = driver.findElement(By.partialLinkText("realme 12 Pro 5G (Navigator Beige, 8GB RAM, 256GB Storage)"));
		//Handle the Window
		cardCheckBox1 = driver.findElement(By.xpath("//input[@id='fbtCheck-2']"));
		addToCard = driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
		proceedToBuy = driver.findElement(By.xpath("//input[@id='proceed-to-checkout-action']"));
		creatAC = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		mobileNo = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		passWord = driver.findElement(By.xpath("//input[@id='ap_password']"));
	}
	public void linkButton() {
		link.click();
	}
	public void textbox(String text) {
		textBox.sendKeys(text);
	}
	public void Searchbutton() {
		searchButton.click();
	}
	public void PhoneName() {
		phoneName.click();
	}
	public void WindowHandle(WebDriver driver) {
		Set<String> str = driver.getWindowHandles();
		Iterator<String> i = str.iterator();
		while(i.hasNext()) {
			String rv = i.next();
			driver.switchTo().window(rv);
		}
	}
	public void checkbox() {
		cardCheckBox1.click();
	}
	public void AddtoCart() {
		addToCard.click();
	}
	public void proceedtobuy() {
		proceedToBuy.click();
	}
	public void acCreat() {
		creatAC.click();
	}
	public void Name(String nam) {
		name.sendKeys(nam);
	}
	public void MoNo(String mobileNO) {
		mobileNo.sendKeys(mobileNO);
	}
	public void pass(String Pass) {
		passWord.sendKeys(Pass);
	}
}
