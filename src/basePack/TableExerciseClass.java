package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExerciseClass {

	public static void main(String[] args) {

		int sum = 0;
		System.setProperty("webdriver.chrome.driver",
				"G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		// for(int i=0;i<count;i++)
		for (int i = 0; i < count - 2; i++) {
			// System.out.println(table.findElements(By.cssSelector("div[class='cb-col
			// cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueInteger = Integer.parseInt(value);
			sum = sum + valueInteger;

		}
		System.out.println("The sum is : " + sum);
		// System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(extras);
		int totalValue = sum + extrasValue;
		System.out.println("The Total Value is : " + totalValue);
		// System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		String actualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue = Integer.parseInt(actualTotal);
		if (actualTotalValue == totalValue) {
			System.out.println("Count matched");
		} else {
			System.out.println("Count not matched");
		}
	}

}
