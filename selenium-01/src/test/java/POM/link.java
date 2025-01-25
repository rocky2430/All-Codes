package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class link {

	@FindBy(tagName="a")
	private List<WebElement> linkList;

	public link(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void linkList() {
		for(int i=0;i<linkList.size();i++) {
			WebElement rv = linkList.get(i);
			System.out.println(rv.getText());
		}
	}
}
