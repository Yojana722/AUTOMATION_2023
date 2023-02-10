package WebDriver_functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
		//setProperty() - Sets the system property indicated by the specified key
		//key - browser name
		//value - chromedriver.exe file path
		//select file - shift+right click -> copy as path
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//upcasting
	    
	    //6. maximize()
	    driver.manage().window().maximize();
	    
	    //7.minimize()
	    driver.manage().window().minimize();
	    
	    //1. get()
	    //driver.get("http://www.flipkart.com/");//WebDriverException
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(2000);//Causes the currently executing thread to sleep (temporarily ceaseexecution) for the specified number of milliseconds
	    
	    //4. getTitle()
	    String actTitle = driver.getTitle();
	    System.out.println(actTitle);//Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
	    
	    //5. getCurrentUrl()
	    String actUrl = driver.getCurrentUrl();
	    System.out.println(actUrl);//https://www.flipkart.com/
	    
	    //2. close()
	    //driver.close();
	    
	    //3. quit()
	    driver.quit();
	}
}
