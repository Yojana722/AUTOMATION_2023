package DDF_POM_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	//1. declaration
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SignIn;
	//initElements- driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	
	//2. initialization
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. Usage
	public void clickGitHubSignInButton() {
		SignIn.click();
	}
}
