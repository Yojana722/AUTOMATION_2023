package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {

	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException {
		WebDriver driver = null;
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"firefox.exe");
			driver = new FirefoxDriver();
		} else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"ie.exe");
			driver = new InternetExplorerDriver();
		}else if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"edge.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
