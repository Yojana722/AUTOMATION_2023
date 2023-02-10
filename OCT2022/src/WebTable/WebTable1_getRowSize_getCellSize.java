package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1_getRowSize_getCellSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///E:/Yojana/new/October2022/HTML/WebTable.html");
		Thread.sleep(2000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='12345']//tr"));
		System.out.println(allRows.size());//4
		
		List<WebElement> allCells = driver.findElements(By.xpath("//table[@class='12345']//tr[2]/td"));
		System.out.println(allCells.size());//3
		
		Thread.sleep(2000);
		driver.quit();
	}
}
