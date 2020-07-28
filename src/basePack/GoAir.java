package basePack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoAir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.goair.in/");

		Alert alert = driver.switchTo().alert();
		String alerttxt = driver.switchTo().alert().getText();
		System.out.println(alerttxt);
		Thread.sleep(5000);

		alert.dismiss();

		/*
		 * driver.findElement(By.xpath("//div[@class='passenger_round']")).click();
		 * 
		 * // Thread.sleep(2000); int i = 1; while(i<5) {
		 * driver.findElement(By.xpath("//input[@type='button']")); i++; }
		 */

	}

}
