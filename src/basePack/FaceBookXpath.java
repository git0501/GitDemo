package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("AAyush");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
