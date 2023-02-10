package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2_printTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///E:/Yojana/new/October2022/HTML/WebTable.html");
		Thread.sleep(2000);

		int rowSize = driver.findElements(By.xpath("//table[@class='12345']//tr")).size();// 4

		for (int i = 1; i <= rowSize; i++) {// row
			int colsize = 0;
			if (i == 1) {
				colsize = driver.findElements(By.xpath("//table[@class='12345']//tr[" + i + "]/th")).size();
			} else {
				colsize = driver.findElements(By.xpath("//table[@class='12345']//tr[" + i + "]/td")).size();
			}
			for (int j = 1; j <= colsize; j++) {// cell
				String text = "";
				if(i==1) {
					text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]/th["+j+"]")).getText();
				}else {
					text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]/td["+j+"]")).getText();
				}
				System.out.print(text+"  ");
			}
			System.out.println();
		}
		
		driver.quit();
	}
}
