package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3_isMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(6000);

		// step 1:
		// findElement-> WebElement
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		// step 2:
		Select s = new Select(day);

		//isMultiple
		boolean result = s.isMultiple();
		System.out.println(result);// false

		Thread.sleep(2000);
		driver.quit();
	}
}
