package datadriventesting2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis  = new FileInputStream("./data2/data.properties");
		Properties property = new Properties();
		
		//Load all the key-value pairs from fis to the property object
		property.load(fis);
		
		//Write data to properties object
		property.put("Key", "Value");
		
		//Save data to properties object
		FileOutputStream fos = new FileOutputStream("./data2/data.properties");
		property.store(fos, "Updated properties file succesfully");
	}
}
