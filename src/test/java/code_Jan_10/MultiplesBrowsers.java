package code_Jan_10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class MultiplesBrowsers {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.quit();
		
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://testautomationpractice.blogspot.com/");
		driver1.quit();
		
		WebDriver driver2= new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver2.get("https://amazon.com/");
		driver2.quit();
		
		WebDriver driver3= new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver3.get("https://costco.com/");
		driver3.quit();
		
		
		WebDriver driver4= new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver4.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver4.get("https://walmart.com/");
		driver4.quit();
		

	}

}
