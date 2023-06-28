package code15thfeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class RediffRecording {
	
public static WebDriver driver;
	
	@Test
	public void learningrecording() throws Exception {
		
	ScreenRecorderUtil.startRecord("learningrecording");
	driver = new ChromeDriver();    
	driver.manage().window().maximize();
	
	driver.get("https://www.rediff.com/"); 
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com"); 
	driver.findElement(By.id("password")).sendKeys("Selenium@123"); 
	driver.findElement(By.className("signinbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("rd_logout")).click();
	
	
	ScreenRecorderUtil.stopRecord();
}

}
