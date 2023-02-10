package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement4_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);

		// WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh
		// img']"));
		// System.out.println(logo.isDisplayed());//true

		// WebElement logo = driver.findElement(By.xpath("//img[@class='ssfb_logo _8ilh
		// img']"));
		// System.out.println(logo.isDisplayed());//NoSuchElementException

		//exception handling
		boolean result;
		try {
			WebElement logo = driver.findElement(By.xpath("//img[@class='ssfb_logo _8ilh img']"));
			result = logo.isDisplayed();
		} catch (Exception e) {
			result = false;
		}
		
		System.out.println(result);//false
		
		Thread.sleep(2000);
		driver.quit();
	}
}
