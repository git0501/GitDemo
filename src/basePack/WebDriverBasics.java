package basePack;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Welcome12: Mercury Tours")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("Incorrect Title");
		}

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.navigate().to("http://www.google.co.in");
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
