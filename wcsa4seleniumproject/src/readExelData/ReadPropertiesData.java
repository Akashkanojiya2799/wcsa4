package readExelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

public class ReadPropertiesData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String username = prop.getProperty("Username");
		String password = prop.getProperty("Password");
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("url");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(browser);
		System.out.println(url);
 	}
}
