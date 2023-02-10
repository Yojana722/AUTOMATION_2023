package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {

	//1. declaration
	@FindBy(xpath="//input[@name='login']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(css = "input[type='submit']") private WebElement SignInBtn;
	
	//2. Initialization
	public GitHub_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void setGitHubLoginUserName() {
		UN.sendKeys("yojanagaikwad101@gmail.com");
	}
	
	public void setGitHubLoginPassword() {
		PWD.sendKeys("Anubhav@2004");
	}
	
	public void clickGitHubLoginSignInBtn() {
		SignInBtn.click(); 
	}
}
