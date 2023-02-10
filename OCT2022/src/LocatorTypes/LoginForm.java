package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("file:///E:/Yojana/new/October2022/HTML/LoginForm.html");

		Thread.sleep(2000);

		// 1. tagName
		driver.findElement(By.tagName("input")).sendKeys("qa@gmail.com");

		// 2. id
		driver.findElement(By.id("pass123")).sendKeys("qa@123");

		// 3. name
		driver.findElement(By.name("email123")).sendKeys("quantum@gmail.com");
		Thread.sleep(2000);

		// 4. className
		driver.findElement(By.className("contact123")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		//5. linkText
		//driver.findElement(By.linkText("Link")).click();
		
		//6. partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();

		driver.quit();
	}
}
