package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//button[@id='hamburgerBtn']")
	public WebElement sideBar;
	
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div[h1]/div")
	public WebElement sideBarOptions;
	
	@FindBy(xpath = "//*[@class='sidebar_content-item']")
	public  List<WebElement> sideBarContents;
	

}
