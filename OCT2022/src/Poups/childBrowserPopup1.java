package Poups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);//CDwindow-00D74A7632EE28752E8820912AB3F0F2
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		System.out.println(al.get(0));//idOfMainPage - CDwindow-00D74A7632EE28752E8820912AB3F0F2
		System.out.println(al.get(1));//idOfChildPage -CDwindow-7286B83A44F5AECB5DC149E0F07E9EF1
		
		Thread.sleep(2000);
		driver.quit();
	}
}
