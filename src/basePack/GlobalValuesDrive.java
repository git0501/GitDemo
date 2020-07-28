package basePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream("G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\src\\data.properties");
		prop.load(fip);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\src\\data.properties");
		prop.store(fos, null);

	}

}
