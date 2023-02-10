package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		String result = "May";
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(6000);
		
		//step 1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2:
		Actions act = new Actions(driver);//keyboard can interact with browser with the help of ACtions class
		
		//step 3:
		act.click(month).perform();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(allOptions.size());//12
		
		for(int i=0; i<=allOptions.size()-1; i++) {
			if(allOptions.get(i).getText().equals(result)) {
				allOptions.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
