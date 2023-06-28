package code15thfeb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot2 {
	
	
	
	
	public static WebDriver driver;

	@Test
	public void CheckingScreenshot() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeevansathi.com/");
		
		WebElement logo= driver.findElement(By.cssSelector("div.middle_div.mtn606"));
		
		File destination = new File("C:\\Users\\bouto\\eclipse-workspace\\practice_mock_interviews\\screenshoot\\screenshot02.png");
	    File source = logo.getScreenshotAs(OutputType.FILE);
	    
	    FileHandler.copy(source,  destination);
	
	}

}
