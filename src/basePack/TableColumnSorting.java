package basePack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSorting {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
	//	driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		
		for(int i=0;i<firstColList.size();i++)
		{
		//	System.out.println(firstColList.get(i).getText());
			originalList.add(firstColList.get(i).getText());
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		
		for(int i=0;i<originalList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		System.out.println("**********Copied List**************");
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		
		for(String s :copiedList ) // for(i=0;i<copiedList.size();i++)
		{
			System.out.println(s);
		}
		System.out.println("**********Original List**************");
		for(String s :originalList ) // for(i=0;i<originalList.size();i++)
		{
			System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
	}

}
