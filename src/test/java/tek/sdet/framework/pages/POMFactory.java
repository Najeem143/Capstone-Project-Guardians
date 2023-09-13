package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailAccountPage retailAccount;
	private RetailOrderPage orderPage;
	private SignInPage signInPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.retailAccount = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();
		this.signInPage = new SignInPage();
	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailAccountPage retailAccount() {
		return this.retailAccount;

	}

	public RetailOrderPage orderPage() {
		return this.orderPage;
	}

	public SignInPage signInPage() {
		return this.signInPage;
	}

}
