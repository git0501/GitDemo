package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.cssSelector("input._2zrpKA._1dBPDZ")).sendKeys("8880583530");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8880583530");
		driver.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c")).click();
		Thread.sleep(3000);

		WebElement searchbox = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbox.click();
		searchbox.sendKeys("Mobile");
		Thread.sleep(2000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		searchbox.sendKeys(Keys.ENTER);

		String title = driver.getTitle();
		System.out.println(title);

	}

}
