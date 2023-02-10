package Poups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		
		Thread.sleep(9000);
		
		driver.switchTo().window(al.get(1));//child page
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));//parent page
		
		driver.findElement(By.xpath("//input[@name='home']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
