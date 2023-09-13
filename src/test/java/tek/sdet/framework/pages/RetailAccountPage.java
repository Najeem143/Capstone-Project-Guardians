package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBtn;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameInput;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailInput;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordInput;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement passwordInputConfirm;

	@FindBy(xpath = "//button[@id='signupBtn']")
	public WebElement signUpBttn;

	@FindBy(xpath = "//h1[contains(text(),'Your Profile')]")
	public WebElement profileText;

	@FindBy(xpath = "//*[@id='accountLink']")
	public WebElement accountBtn;

	@FindBy(xpath = "//*[@id='nameInput']")
	public WebElement updatenameInput;

	@FindBy(xpath = "//*[@name='phoneNumber']")
	public WebElement updatePhoneNumInput;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateBttn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement accountUpdateSuccess;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement addAPayment;

	@FindBy(xpath = "//*[@id='cardNumberInput']")
	public WebElement cardNumberInput;

	@FindBy(xpath = "//*[@id='nameOnCardInput']")
	public WebElement nameOnCard;

	@FindBy(xpath = "//*[@id='expirationMonthInput']")
	public WebElement expirationMonthInput;

	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYearInput;

	@FindBy(xpath = "//*[@id='securityCodeInput']")
	public WebElement securityCodeInput;

	@FindBy(xpath = "//*[@id='paymentSubmitBtn']")
	public WebElement addCardBtn;

	@FindBy(xpath = "//*[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodSuccessMethod;

	@FindBy(xpath = "//div[@class='account__payment-image-wrapper']")
	public WebElement addCard;

	@FindBy(xpath = "///*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[1]")
	public WebElement addedCard;

	@FindBy(xpath = "//*[@class='flex gap-2 py-2']//button[1]")
	public WebElement editBttnCard;

	@FindBy(xpath = "//*[@name='cardNumber']")
	public WebElement cardInputEdit;

	@FindBy(xpath = "//*[@name='nameOnCard']")
	public WebElement nameOnCardInputEdit;

	@FindBy(xpath = "//*[@name='expirationMonth']")
	public WebElement expirationMonthEdit;

	@FindBy(xpath = "//*[@name='expirationYear']")
	public WebElement expirationYearEdit;

	@FindBy(xpath = "//*[@name='securityCode']")
	public WebElement securityCodeInputEdit;

	@FindBy(xpath = "//*[@id='paymentSubmitBtn']")
	public WebElement updateCardInfo;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdateSuccessMsg;

	@FindBy(xpath = "//*[contains(text(),'remove')]")
	public WebElement removePaymentMethod;

	// Add new Addresss
	@FindBy(xpath = "//*[@class='account__address-new']")
	public WebElement addAddresssbttn;

	@FindBy(xpath = "//*[@name='country']")
	public WebElement countryDropDown;

	@FindBy(xpath = "//*[@name='fullName']")
	public WebElement fullNameAddr;

	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phonephoneNumberAddr;

	@FindBy(xpath = "//*[@id='streetInput']")
	public WebElement addressInput;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement AptAddressInput;

	@FindBy(xpath = "//*[@id='cityInput']")
	public WebElement cityAddr;

	@FindBy(xpath = "//*[@name='state']")
	public WebElement state;

	@FindBy(xpath = "//*[@name='zipCode']")
	public WebElement zipCode;

	@FindBy(xpath = "//*[@id='addressBtn']")
	public WebElement submitAddBttn;

	@FindBy(xpath = "//*[text()='Address Added Successfully']")
	public WebElement addAddrSuccessMsg;

	// EditAddress
	
	@FindBy(xpath = "//*[contains(text(), 'Edit')]")
	public WebElement addresEditBttn;
	
	@FindBy(xpath = "//*[contains(text(), 'Update Your Address')]")
	public WebElement updateAdressBttn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addrUpdateSuccessMsg;
	
	@FindBy(xpath = "//*[text()='Remove']")
	public WebElement addressRemoveBttn;
	
	
			

}
