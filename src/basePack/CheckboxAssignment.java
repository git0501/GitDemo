package basePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The no. of checkbox present on the webpage is ::==>" + chkbox.size());

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());

		String chkboxvalue = ((WebElement) chkbox.get(0)).getAttribute("value");

		for (int i = 0; i < chkbox.size(); i++) {
			((WebElement) chkbox.get(i)).click();

			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
			System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
			System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		}
	}

}
