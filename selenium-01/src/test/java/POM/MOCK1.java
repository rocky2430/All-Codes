package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//Workbook book = WorkbookFactory.create(new FileInputStream("C:\\Users\\admin\\Desktop\\Selenium.property.xlsx"));
import org.testng.annotations.Test;

public class MOCK1 {

		WebDriver driver;
		ChromeOptions opt;
		@BeforeTest
		public void before() {
			opt = new ChromeOptions();
			opt.addArguments("start-maximized");
			driver = new ChromeDriver(opt);
			driver.get("https://www.google.co.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		@Test
		public void PUMA() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("puma j");
			Thread.sleep(2000);
			List<WebElement> link = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
			for(int i=0;i<link.size();i++) {
				WebElement rv = link.get(i);
				String str = rv.getText();
				if(str.contains("puma jackets")) {
					rv.click();
					break;
				}
			}
		}
		@Test
		public void NAUKRI() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("naukri");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='btnK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Naukri.com - Quick Job Apply")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("Selenium");
			Thread.sleep(2000);
			
		}
		@AfterTest
		public void after() {
			driver.quit();
		}
}
