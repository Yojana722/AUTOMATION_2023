package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getSizeOfList {

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
		
		//getOptions -> List<WebElement>
		List<WebElement> options = s.getOptions();
		
		//size
		System.out.println(options.size());//31
		
		//print all options in list box using for each loop
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
