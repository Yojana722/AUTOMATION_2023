package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//upcasting
	    
	    //6. maximize()
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	    Thread.sleep(2000);
	    
	    driver.quit();
	}
}
