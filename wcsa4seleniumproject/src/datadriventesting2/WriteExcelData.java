package datadriventesting2;

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

public class WriteExcelData {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException, FileNotFoundException {
	
	Workbook wb = null;
	
	try
	{
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellValue("Link");
		
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeTestData.xlsx");
		wb.write(fos);
		
		
		//Write a data in new row
		
		FileInputStream fis1 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("invalidcreds");
		Row row1 = sheet1.createRow(8);
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue("####");
		
		FileOutputStream fos1 = new FileOutputStream("./data/ActiTimeTestData.xlsx");
		wb.write(fos1);
	}
	finally {
		
		wb.close();
	}
}
}
