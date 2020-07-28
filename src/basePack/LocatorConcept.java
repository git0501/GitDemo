package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/* String baseUrl = "https://www.facebook.com/"; */
		String baseUrl = "http://newtours.demoaut.com/";

		driver.get(baseUrl);

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("VikramKumar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aayush");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8880583530");
		driver.findElement(By.id("userName")).sendKeys("vikrambarh@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Kankarbagh");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Patna Bihar");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Patna");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Bihar");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("800020");

		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("vikrambarh@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Binatone1#");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Binatone1#");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		// driver.quit();

		// input[@name='userName']

		/*
		 * driver.findElement(By.id("email")).sendKeys("vikrambarh@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("vikrambarh@gmail.com");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 */

	}

}
