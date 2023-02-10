package WebDriver_functions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\October2022\\chromedriver_win32 (10)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//upcasting
	    
	    //6. maximize()
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.amazon.in/");
	   
	    
	    driver.navigate().back();//facebook
	    driver.navigate().forward();//amazon
	    driver.navigate().back();//facebook
	    
	    driver.navigate().refresh();
	    
	    Dimension d = new Dimension(500, 200);//width, height
	    driver.manage().window().setSize(d);
	    
	    Thread.sleep(5000);
	    
	    Point p = new Point(200, 300);//x,y coordinates
	    driver.manage().window().setPosition(p);
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	 
	}
}
