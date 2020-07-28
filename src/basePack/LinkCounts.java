package basePack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCounts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();


		String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(baseUrl);
		
		//count of all links on the web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of footer links on the web page
		WebElement footerDriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement columndriver = (footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		

		
		//Click on each link in the column and check if the pages are opening
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) 
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		
		//Open all the tabs 	
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}   

	}


