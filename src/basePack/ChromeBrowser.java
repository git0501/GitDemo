package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies
		driver.get("https://www.facebook.com/");// Hitting the facebook url

		/*
		 * driver.findElement(By.id("email")).sendKeys("vikrambarh@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("Binatone1#");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		// driver.findElement(By.linkText("Forgotten account?")).click();

		driver.findElement(By.cssSelector("#email")).sendKeys("AAyush");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		// driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		// driver.findElement(By.cssSelector("#login_form > table > tbody >
		// tr:nth-child(3) > td:nth-child(2) > div > a")).click();
		driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
