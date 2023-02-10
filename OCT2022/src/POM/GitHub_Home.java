package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Home {

	@FindBy(xpath="(//summary[@class='Header-link'])[2]") private WebElement LogOutBtn;
	
	public GitHub_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubHomeLogOutBtn() throws InterruptedException {
		LogOutBtn.click();
		Thread.sleep(4000);
	}
	
}
