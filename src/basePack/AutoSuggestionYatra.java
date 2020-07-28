package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionYatra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.yatra.com/");

		   
        
        
	    WebElement source = driver.findElement(By.id("BE_flight_origin_city"));

	   source.clear();

	    source.sendKeys("BLR");

	    Thread.sleep(2000);
	//    source.sendKeys(Keys.ARROW_DOWN);

	    source.sendKeys(Keys.ENTER);

	   Thread.sleep(2000);

	    WebElement destination = driver.findElement(By.id("BE_flight_arrival_city"));

	   source.clear();

	    destination.sendKeys("DEL");

	    Thread.sleep(2000);

	//destination.sendKeys(Keys.ARROW_DOWN);

	    destination.sendKeys(Keys.ENTER);
		
		

	}

}
