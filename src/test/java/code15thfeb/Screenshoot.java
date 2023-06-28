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

public class Screenshoot {
	
	public static WebDriver driver;
	
	
	@Test
	public void checkingScreenshot() throws IOException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://openweathermap.org/");
	
	WebElement logo=driver.findElement(By.cssSelector("div.section.where-to"));
	
	File destination= new File("C:\\Users\\bouto\\eclipse-workspace\\practice_mock_interviews\\screenshoot\\openscreenshoot.png");
	File source= logo.getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(source,  destination);
	
}
}
