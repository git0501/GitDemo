package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RSDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");// hitting the url

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText("Option2");

		driver.findElement(By.id("checkBoxOption3")).click();

	}

}
