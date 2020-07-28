package basePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.google.co.in/");
		System.out.println("Hi Vikram1");
		System.out.println("Hi Vikram1");
		System.out.println("Hi Vikram1");

		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.className("sbl1"));

		for (WebElement vikram : suggestion) {
			// System.out.println(suggest.getText());
			if (vikram.getText().equalsIgnoreCase("india population")) {
				vikram.click();
				break;

			}
		}
		driver.close();
	}

}
