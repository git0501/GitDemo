package basePack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameConcept {

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
		driver.findElement(By.cssSelector("a[href*='iframe']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing the TinyMCE WYSIWYG Editor')]")).getText());
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.cssSelector("div.mce-container-body.mce-stack-layout")).getText());
		
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).click();
		System.out.println(driver.findElement(By.xpath("//body[@id='tinymce']/p")).getText());
		
		driver.close();
		driver.quit();
	
	
		
		
		
	
		
	}

}
