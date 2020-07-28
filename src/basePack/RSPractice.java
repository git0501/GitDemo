package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSPractice {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe"); 
		

	    WebDriver driver =  new ChromeDriver(); // Launching the chrome browser
	    driver.manage().window().maximize(); //Maximize the window
	    driver.manage().deleteAllCookies(); //deleting the cookies
	    
	    driver.get("https://www.rahulshettyacademy.com/#/practice-project"); // opens the url in the browser.

	    System.out.println(driver.getTitle());

	    driver.findElement(By.xpath("//a[text()='Register']")).click();

	    System.out.println(driver.findElement(By.xpath("//div[@class='content-box content-box-school-signup']/h1")).getText());

	    }

	    }