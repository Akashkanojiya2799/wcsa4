package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// use to store only the Generic Reusable Methods

		// To read excel file data

		public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
		}

		// To get a last rowCount

		public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}

		// Write data to excel file

		public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue("link");

			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}

		// To read data from property file

		public String readPropertyData(String propPath, String keyValue) throws IOException 
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			
			String value = prop.getProperty(keyValue);
			return value;
		}
		
		//To write data to property file
		
		public void writePropertyData(String propPath, String key, String value, String stringComment) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			
			prop.put(key, value);
			FileOutputStream fos = new FileOutputStream(propPath);
			prop.store(fos,stringComment );
		}

}
