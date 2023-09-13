package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//select[@id='search']")
	public WebElement departmentDropDownn;

	@FindBy(xpath = "//h1[text()='Smart Home']")
	public WebElement catagoryHomeSmart;

	@FindBy(xpath = "//*[@class='search__input']")
	public WebElement searchInput;

	@FindBy(xpath = "//*[@class='search__btn']")
	public WebElement searchBttn;

	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlug;

	@FindBy(xpath = "//*[@class='product__select']")
	public WebElement productQty;

	@FindBy(xpath = "//*[@id='addToCartBtn']")
	public WebElement addToCard;

	@FindBy(xpath = "//*[@id='cartQuantity']")
	public WebElement cartIconQty;

	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement processedToCheckout;

	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeOrderBttn;

	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacementSuccess;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendItem;
	
	@FindBy(xpath = "//a[@id=\"orderLink\"]")
	public WebElement orderSection;
	
	@FindBy(xpath ="//*[contains(text(),'Show')]")
	public List<WebElement> firstOderFromList;
	
	@FindBy(xpath = "//*[@id=\"cancelBtn\"]")
	public WebElement cancleOrderBttn;
	
	@FindBy(xpath = "//*[@name=\"reason\"]")
	public WebElement reasonForCancel;
	
	@FindBy(xpath = "//*[@id=\"orderSubmitBtn\"]")
	public WebElement cancelOrderSubmittBttn;
	
	@FindBy(xpath = "//*[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement orderCancelConfirmation;
	
	@FindBy(xpath = "//*[@id='returnBtn']")
	public List<WebElement> returnBttn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement returnReason;
	
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement returnDropOff;
	
	@FindBy(xpath = "//*[@id='orderSubmitBtn']")
	public WebElement returnOderSubmision;
	
	@FindBy(xpath = "//*[contains(text(),'Return was successfull')]")
	public WebElement returnSuccessMsg;
	
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public List<WebElement> reviewBttn;
	
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement reviewHeadLine;
	
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewTextArea;
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmit;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewSuccessMsg;
	
	
	
	
	

}
