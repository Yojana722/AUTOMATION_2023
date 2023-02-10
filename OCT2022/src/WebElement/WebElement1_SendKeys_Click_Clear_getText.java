package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_SendKeys_Click_Clear_getText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//1. sendKeys()
		email.sendKeys("qa@gmail.com");
		Thread.sleep(2000);
		
		//2. clear()
		email.clear();
		
		email.sendKeys("qa@automation.com");
		Thread.sleep(1000);
		
		//3. click()
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//4. getText()
		WebElement forgottonPWD = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		System.out.println(forgottonPWD.getText());//Forgotten password?
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
