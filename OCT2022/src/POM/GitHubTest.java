package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\Sept2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		// 6. maximize()
		driver.manage().window().maximize();

		driver.navigate().to("https://github.com/");

		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInButton();
		
		Thread.sleep(4000);
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUserName();
		login.setGitHubLoginPassword();
		login.clickGitHubLoginSignInBtn();
		
		GitHub_Home home = new GitHub_Home(driver);
		home.clickGitHubHomeLogOutBtn();
		
		GitHub_SignOut signOut = new GitHub_SignOut(driver);
		signOut.clickGitHubSignOutBtn();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
