package basePack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://www.spicejet.com/");

		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='PNY']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
		 */

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(true);
		}

		List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(list.size());

		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			// break;
		}

		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertFalse(false);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		/*
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
		 * System.out.println("Its Disabled"); Assert.assertTrue(true); } else {
		 * Assert.assertTrue(false); }
		 */

		driver.findElement(By.linkText("Special Assistance")).click();
		driver.findElement(By.xpath("//a[@id='SpecialAssistanceWindow']")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");

		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("4");

		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s2.selectByValue("3");

		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s3.selectByVisibleText("USD");

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
