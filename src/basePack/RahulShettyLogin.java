package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");// hitting
																													// the
																													// url

		driver.findElement(By.id("user_email")).sendKeys("vikrambarh@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Fujitsu00#");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.linkText("Project")).click();

		String txt = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div[2]/h2")).getText();
		System.out.println(txt);

		driver.findElement(By.id("name")).sendKeys("Vikram Kumar");
		driver.findElement(By.id("email")).sendKeys("vikrambarh@gmail.com");
		driver.findElement(By.id("agreeTerms")).click();
		driver.findElement(By.cssSelector("#form-submit")).click();

	}

}
