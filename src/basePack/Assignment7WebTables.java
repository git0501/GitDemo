package basePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='product']/tbody"));
/*		List<WebElement> rowcount = table.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		System.out.println(rowcount.size());  */
		
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println(rowCount.size());
		
		List<WebElement> colCount = rowCount.get(0).findElements(By.tagName("th"));
		System.out.println(colCount.size());
		
		WebElement txt = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
		System.out.println(txt.getText());   
		
		
	}

}
