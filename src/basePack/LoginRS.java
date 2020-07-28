package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://courses.rahulshettyacademy.com/");// hitting the url
		// driver.findElement(By.cssSelector("a[class*='theme-btn']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'theme-btn')]")).click();

	}

}
