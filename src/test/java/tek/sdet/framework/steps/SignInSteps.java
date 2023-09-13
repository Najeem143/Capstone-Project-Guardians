package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory pomFactory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		Assert.assertTrue(pomFactory.signInPage().tekSchoolLogo.isDisplayed());
		logger.info("TekSchool logo is displyed");

	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(pomFactory.signInPage().signIn);
		logger.info("signIn button was clicked successfully");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(pomFactory.signInPage().loginEmailField, email);
		sendText(pomFactory.signInPage().loginPassWordField, password);
		logger.info("user enters email and password successfully");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(pomFactory.signInPage().loginBttn);
		logger.info("signIn button was clicked successfully");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(pomFactory.signInPage().logOutBtn.isDisplayed());
		logger.info("Log out button is diplayed and user signed in successfully");
	}

}
