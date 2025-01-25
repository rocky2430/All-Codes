package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.Test;

public class list {

	
	@Test
	public void test() throws Exception {
		
		Workbook book = WorkbookFactory.create(new FileInputStream("C:\\Users\\admin\\Desktop\\Selenium.property.xlsx"));
		Sheet s = book.createSheet("DDT");
		Row r = s.createRow(4);
		Cell c = r.createCell(3);
		c.setCellValue("Rahul Mansarowar");
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\admin\\Desktop\\Selenium.property.xlsx");
		book.write(output);
		}
}