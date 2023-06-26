package code_jan17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToValidate {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//how to validate   with getTitle and getCurrentUrl
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle=driver.getTitle();
		
		String actualCurrentUrl="https://www.rediff.com/";
		String expectedCurrentUrl=driver.getCurrentUrl();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("title or url is wrong");
		}
		
		System.out.println("**************************************************************");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualTitle1="Rediffmail";
		String expectedTitle1=driver.getTitle();
		
		String actualCurrentUrl1="https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl1=driver.getCurrentUrl();
		
		if(actualTitle1.equals(expectedTitle1) && actualCurrentUrl1.equals(expectedCurrentUrl1)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("title or url is wrong");
		}

	}

}
