package basePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandeling {

	
	public static void main(String[] args) throws InterruptedException {
		
//     String txt = "Vikram Kumar";
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_New\\Naveen_Guru99SeleniumSession\\chromedriver.exe"); 
		

	    WebDriver driver =  new ChromeDriver(); // Launching the chrome browser
	    driver.manage().window().maximize(); //Maximize the window
	    driver.manage().deleteAllCookies(); //deleting the cookies
	    
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    //Handling Radio button with validation
	    
        Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
	    driver.findElement(By.xpath("//input[@value='radio2']")).click(); 
	    System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());  
	    
	    // Handling Suggestion box 
	  WebElement suggestionbox =  driver.findElement(By.id("autocomplete"));
//	   suggestionbox.sendKeys("INDIA");
	  
	  if(suggestionbox.equals("India"))
	  {
		  suggestionbox.sendKeys(Keys.ENTER); 
	  }
	  Thread.sleep(3000);
/*	  suggestionbox.sendKeys(Keys.ARROW_DOWN);
	  suggestionbox.sendKeys(Keys.ARROW_DOWN);
	  suggestionbox.sendKeys(Keys.ENTER);   */
	  
	  //Handling DropDown button
	  Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
	  s.selectByVisibleText("Option2");  
	  
	  //Handling Check Boxes
	 List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("The number of Check Box present on Web Page :::===> " + chkbox.size());
	 
	 System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		
		Thread.sleep(3000);
		 String chkboxvalue = ((WebElement) chkbox.get(0)).getAttribute("value");
		 
		 for(int i=0;i<=2;i++) {
			((WebElement) chkbox.get(2)).click(); 
			
			
			System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
			Thread.sleep(3000);
			driver.findElement(By.id("checkBoxOption3")).click();
			System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		 }
	  
	 // Handling Alert with validation   
	    WebElement fullname =    driver.findElement(By.cssSelector("[id='name']"));
	String txt = "Vikram Kumar";
	    fullname.sendKeys(txt); //Entering the Person Name
	   //Verify the name is displayed
	    if(fullname.isDisplayed()) {
	    	System.out.println("Full name is displayed");
	    }
	    else {
	    	System.out.println("Full name is not displayed");
	    }
	    
	    driver.findElement(By.id("alertbtn")).click(); //Clicking on "Alert" button
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());  //Getting the text present on the Alert pop-up
	    driver.switchTo().alert().accept(); //Clicking on "Ok" button
	    
	    //Verify that Full name is enabled
	    WebElement fullname1 =    driver.findElement(By.cssSelector("[id='name']"));
	    String text = "Aayush Kumar";
	    if(fullname1.isEnabled()) {
	    	fullname1.sendKeys(text);
	    	System.out.println("Full name is Enabled");
	    }
	    else {
	    	System.out.println("Full name is not Enabled");
	    }
	    
	    driver.findElement(By.id("alertbtn")).click(); //Clicking on "Alert" button
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());  //Getting the text present on the Alert pop-up
	    driver.switchTo().alert().accept(); //Clicking on "Ok" button

    driver.findElement(By.cssSelector("[id='confirmbtn']")).click();  //Clicking on "Confirm" button
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());  //Getting the text present on the Alert pop-up
	    driver.switchTo().alert().dismiss();  //clicking on "Cancel" button
	    
	    driver.findElement(By.cssSelector("[id='confirmbtn']")).click();  //clicking on "Confirm" button
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());  //Getting the text present on the Alert pop-up
	    driver.switchTo().alert().accept();       //clicking on "Ok" button
	    
	    WebElement  a = driver.findElement(By.cssSelector(".blinkingText"));
	  //  a.getText();
	   a.click();     
	}

}
