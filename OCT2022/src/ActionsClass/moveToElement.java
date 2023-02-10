package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act = new Actions(driver);
		
		//1. moveToElement
		//act.moveToElement(login).perform();
		
		//2. contextClick - used to perform right click
		//act.contextClick(login).perform();
		
		//3. click - used to perform left click
		act.click(login).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
