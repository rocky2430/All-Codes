package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbExcel {

	public static void main(String[] args) throws Throwable {
		
		Workbook book = WorkbookFactory.create(new FileInputStream("C:\\Users\\admin\\Desktop\\Selenium.property.xlsx"));
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		c.setCellValue("MySQL");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\admin\\Desktop\\Selenium.property.xlsx");
		book.write(out);
	}
}
