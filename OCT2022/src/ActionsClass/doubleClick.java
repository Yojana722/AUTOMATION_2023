package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(2000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions act = new Actions(driver);
		
		//doubleClick
		act.doubleClick(doubleClick).perform();		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());//You double clicked me.. Thank You..
		
		alt.accept();//OK
		//alt.dismiss();//cancel
		
		Thread.sleep(2000);
		driver.quit();
	}
}
