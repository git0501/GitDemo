package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys(" BOM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromCity']")).getAttribute("value"));

		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));

		destination.sendKeys(" DEL");

		Thread.sleep(2000);

		destination.sendKeys(Keys.DOWN);

		destination.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//input[@id='toCity']")).getAttribute("value"));

		/*
		 * WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		 * driver.manage().window().maximize(); //Maximize the window
		 * driver.manage().deleteAllCookies(); //deleting the cookies
		 * driver.get("https://www.makemytrip.com/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement
		 * source=driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * 
		 * source.sendKeys("Mum");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * source.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * source.sendKeys(Keys.ENTER);
		 * 
		 * System.out.println(driver.findElement(By.xpath("//input[@id='fromCity']")).
		 * getAttribute("value"));
		 * 
		 * WebElement
		 * destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
		 * 
		 * destination.sendKeys("BEN");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * destination.sendKeys(Keys.DOWN);
		 * 
		 * destination.sendKeys(Keys.ENTER);
		 * 
		 * System.out.println(driver.findElement(By.xpath("//input[@id='toCity']")).
		 * getAttribute("value"));
		 */

	}

}
