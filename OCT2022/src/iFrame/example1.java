package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();//NoSuchElementException
		Thread.sleep(2000);
		
		//1. defaultContent
		//2. parentFrame
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
