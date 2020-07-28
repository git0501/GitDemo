package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.amazon.com/");
		System.out.println("This is Amazon site and this line I am writing for learning Git command");
		
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		WebElement move1 = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		action.moveToElement(move1).click().sendKeys(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Moves to specific element
		action.moveToElement(move).contextClick().build().perform();
		
		

	}

}
