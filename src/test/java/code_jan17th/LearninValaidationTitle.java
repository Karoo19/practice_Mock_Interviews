package code_jan17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearninValaidationTitle {

	public static void main(String[] args) throws InterruptedException {
		
		//getTitle();  get the title of the page
		//getCurrentUrl();  get the url of the page
		//getPageSource(); get the whole source of the page
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("get the title of the page: "+ driver.getTitle());
		System.out.println("get the current url of the page: "+ driver.getCurrentUrl());
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		System.out.println("get the title of the page: "+ driver.getTitle());
		System.out.println("get the current url of the page: "+ driver.getCurrentUrl());
		
		driver.findElement(By.id("input-email")).sendKeys("karimaselenium@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Karima@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(3000);
		System.out.println("get the title of the page: "+ driver.getTitle());
		System.out.println("get the current url of the page: "+ driver.getCurrentUrl());
		
		WebElement confirmationMessage=driver.findElement(By.linkText("Edit your account information"));
		System.out.println(confirmationMessage.isDisplayed());
		System.out.println("get the title of the page: "+ driver.getTitle());
		System.out.println("get the current url of the page: "+ driver.getCurrentUrl());
		
		
		
		

	}

}
