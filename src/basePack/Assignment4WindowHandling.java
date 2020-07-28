package basePack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launching the chrome browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // deleting the cookies

		driver.get("http://the-internet.herokuapp.com/");

		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		WebElement hgt = driver.findElement(By.xpath("//div[@id='content']/div/h3"));
		System.out.println(hgt.getText());
		String childId = it.next();

		driver.switchTo().window(childId);
		System.out.println("After switching from Parent to Child");
		System.out.println(driver.getTitle());

		String Grandchild = it.next();
		driver.switchTo().window(Grandchild);
		WebElement cdf = driver.findElement(By.xpath("//div[@class='example']/h3"));
		System.out.println(cdf.getText());
		System.out.println("After switching from Child to Grandchild");
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.switchTo().window(childId);

		System.out.println("After switching from Grandchild to Child");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
		System.out.println("After switching from Child to Parent");
		WebElement abc = driver.findElement(By.xpath("//div[@id='content']/div/h3"));
		System.out.println(abc.getText());
		System.out.println(driver.getTitle());

		driver.close();

	}

}
