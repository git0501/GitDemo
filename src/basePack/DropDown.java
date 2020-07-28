package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.cleartrip.com/");// hitting the url
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("5");
		// s.selectByIndex(5);
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("4");
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("5");
	}

}
