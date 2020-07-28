package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFrames {

	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		String baseUrl = "http://the-internet.herokuapp.com/";
		driver.get(baseUrl);
		
		driver.findElement(By.cssSelector("a[href*='frames']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Frames')]")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[href*='nested_frames']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());



	}

}
