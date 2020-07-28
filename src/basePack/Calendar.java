package basePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id='travel_date']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

		while(!month.getText().contains("June 2020"))

		{

		     driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		     System.out.println(month.getText());

		}

		int count= driver.findElements(By.cssSelector("td[class*='day']")).size();

		for(int i=0;i<count;i++)

		{

		     String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();

		     if(text.equalsIgnoreCase("26"))

		     {

		   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();

		    System.out.println(text);

		    break;

		     }

		}
	}

}
