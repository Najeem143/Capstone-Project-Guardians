package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class SignInPage extends BaseSetup {
	public SignInPage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id = "signinLink")
	public WebElement signIn;

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement loginEmailField;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement loginPassWordField;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBttn;
	
	@FindBy(xpath = "//button[@id='logoutBtn']")
	public WebElement logOutBtn;

}
