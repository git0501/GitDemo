package basePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShetty {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("https://sso.teachable.com/secure/9521/users/sign_up?reset_purchase_session=1");// hitting the url

		driver.findElement(By.id("user_name")).sendKeys("Vikram Kumar");
		driver.findElement(By.id("user_email")).sendKeys("vikrambarh@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Fujitsu00#");
		driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("Fujitsu00#");

		WebElement chbox = driver.findElement(By.id("user_unsubscribe_from_marketing_emails"));
		// chbox.isSelected();
		chbox.click();

		if (chbox.isSelected()) {
			System.out.println("Checkbox is toggled ON");
		} else {
			System.out.println("Checkbox is toggled OFF");
		}
		chbox.click();

		if (!chbox.isSelected()) {
			System.out.println("Checkbox is now toggled OFF");
		}
		chbox.click();

		WebElement chbox1 = driver.findElement(By.xpath("//input[@id='user_agreed_to_terms']"));
		chbox1.click();

	}

}
