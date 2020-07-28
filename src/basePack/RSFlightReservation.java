package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RSFlightReservation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 */

		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"
		 * )).click(); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']"
		 * )).click();
		 */

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']"))
				.click();

		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();

		/*
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000);
		 * 
		 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click(); }
		 * 
		 * for(int i=1;i<4;i++) { driver.findElement(By.id("hrefIncChd")).click(); }
		 * 
		 * for(int i=1;i<3;i++) { driver.findElement(By.id("hrefIncInf")).click(); }
		 * 
		 *String adulttxt = driver.findElement(By.id("btnclosepaxoption")).click(); 
		 * driver.findElement(By.id("divpaxinfo")).getText();
		 * System.out.println(adulttxt);
		 * 
		 * Select s = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByVisibleText("AED");
		 */
	}

}
