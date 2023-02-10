package DDF_POM_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	static WebDriver driver;
	public static void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		
		//Handling of Notifications
		ChromeOptions option = new ChromeOptions();//notifications
		option.addArguments("--disable-notifications");
		
	    driver = new ChromeDriver(option);
	    
	    driver.manage().window().maximize();
	    
	    //1. implicitly wait - applicable to browser
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //2. Explicit wait
	   // WebDriverWait wait = new WebDriverWait(driver,30);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	    
	    driver.navigate().to(Utility.getPropertyFileData("url"));
	}
}
