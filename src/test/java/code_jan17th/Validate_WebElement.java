package code_jan17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_WebElement {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		WebElement videoLink = driver.findElement(By.className("vdicon"));
		
		System.out.println(videoLink.isDisplayed());
		System.out.println(videoLink.isEnabled());
		System.out.println(videoLink.isSelected());
		
		if(videoLink.isDisplayed() && videoLink.isEnabled()&& videoLink.isSelected()) {
			videoLink.click();
		}

	}

}
