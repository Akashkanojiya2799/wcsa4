package datadriventesting2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		// Convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./data2/data.properties");
		
		// Create an instance of Properties class
		Properties property = new Properties();
		
		// Load all the key-value pairs from fis to property object
		property.load(fis);
		
		// read data from properties file
		String url = property.getProperty("url");
		String browser = property.getProperty("browser");
		String time = property.getProperty("time");
		String username = property.getProperty("username");
		
		System.out.println(url +"\n"+ browser +"\n"+ time +"\n"+ username);
	}
}
