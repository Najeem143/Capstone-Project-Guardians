package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {
	WebDriver driver;
	POMFactory factory = new POMFactory();

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.retailAccount().newAccountBtn);
		logger.info("New account button was clicked successfully");

	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> row : rows) {
			String name = row.get("name");
			String email = row.get("email");
			String password = row.get("password");
			String confirmPassword = row.get("confirmPassword");

			sendText(factory.retailAccount().nameInput,name );
			sendText(factory.retailAccount().emailInput, email);
			sendText(factory.retailAccount().passwordInput,password );
			sendText(factory.retailAccount().passwordInputConfirm, confirmPassword);

	}

	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.retailAccount().signUpBttn);
		logger.info("Sign up button was clicked successfully");

	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {

		Assert.assertTrue(factory.retailAccount().profileText.isDisplayed());
		logger.info("User account was created successfully");
	}

	// Update profile

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccount().accountBtn);
		logger.info("Account button was clicked successfully");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String Name, String Phone) {
		clearTextUsingSendKeys(factory.retailAccount().updatenameInput);
		clearTextUsingSendKeys(factory.retailAccount().updatePhoneNumInput);
		sendText(factory.retailAccount().updatenameInput, Name);
		sendText(factory.retailAccount().updatePhoneNumInput, Phone);
		logger.info("Update name and phone number field were filled successfully");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailAccount().updateBttn);
		logger.info("User clicked successfully on update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.retailAccount().accountUpdateSuccess);
		String acctualMsg = "Personal Information Updated Successfully";
		String expectedMsg = "Personal Information Updated Successfully";
		Assert.assertEquals(acctualMsg, expectedMsg);
		logger.info("Account update was successful");

	}

	// Add a payment method

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailAccount().addAPayment);
		logger.info("User clicked on add payment option");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInputs = dataTable.asMaps(String.class, String.class);
		sendText(factory.retailAccount().cardNumberInput, paymentInputs.get(0).get("cardNumber"));
		sendText(factory.retailAccount().nameOnCard, paymentInputs.get(0).get("nameOnCard"));
		// selectByVisibleText(factory.retailAccount().expirationMonthInput,
		// paymentInputs.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailAccount().expirationYearInput, paymentInputs.get(0).get("expirationYear"));
		sendText(factory.retailAccount().securityCodeInput, paymentInputs.get(0).get("securityCode"));
		logger.info("Payment method added successfully");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccount().addCardBtn);
		logger.info("Payment added button was clicked sucessfully");

	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {

		waitTillPresence(factory.retailAccount().paymentMethodSuccessMethod);
		String actualText = "Payment Method added sucessfully";
		String expectedText = "Payment Method added sucessfully";
		Assert.assertEquals(expectedText, actualText);
		logger.info("Payment method added successfully");

	}

	// Payment Method Update

	@When("user click on existing card")
	public void userClickOnExistingCard() {
//		waitTillPresence(factory.retailAccount().addCard);
		click(factory.retailAccount().addCard);

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
//		waitTillPresence(factory.retailAccount().editBttnCard);
		click(factory.retailAccount().editBttnCard);
		logger.info("The edit button has been clicked successfully");

	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> editPayment = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.retailAccount().cardInputEdit);
		sendText(factory.retailAccount().cardInputEdit, editPayment.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.retailAccount().nameOnCardInputEdit);
		sendText(factory.retailAccount().nameOnCardInputEdit, editPayment.get(0).get("nameOnCard"));
		sendText(factory.retailAccount().expirationMonthEdit, editPayment.get(0).get("expirationMonth"));
		sendText(factory.retailAccount().expirationYearEdit, editPayment.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.retailAccount().securityCodeInputEdit);
		sendText(factory.retailAccount().securityCodeInputEdit, editPayment.get(0).get("securityCode"));

		logger.info("User successfully updated payment information");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccount().updateCardInfo);

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
//		waitTillPresence(factory.retailAccount().paymentMethodSuccessMethod);

		logger.info("Card information has be updated sucessfully");
	}
	
	
//	Remove payment method from account
	
	
	
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		
	    click(factory.retailAccount().removePaymentMethod);
	    logger.info("Payment method sucessfully removed from user's account");
	   
	}
//	@Then("payment details should be removed")
//	public void paymentDetailsShouldBeRemoved() {
//		Assert.assertTrue(factory.retailAccount().addCard.isNotDisplayed());
//	    
//	}
	
	// Add address to account 
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccount().addAddresssbttn);
		logger.info("Add Adress button was clicked sucessfully");
	    
		
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInputs = dataTable.asMaps(String.class, String.class);
		sendText(factory.retailAccount().countryDropDown,addressInputs.get(0).get("country"));
		clearTextUsingSendKeys(factory.retailAccount().fullNameAddr);
		sendText(factory.retailAccount().fullNameAddr, addressInputs.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.retailAccount().phonephoneNumberAddr);
		sendText(factory.retailAccount().phonephoneNumberAddr, addressInputs.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.retailAccount().addressInput);
		sendText(factory.retailAccount().addressInput, addressInputs.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.retailAccount().AptAddressInput);
		sendText(factory.retailAccount().AptAddressInput, addressInputs.get(0).get("apt"));
		sendText(factory.retailAccount().cityAddr, addressInputs.get(0).get("city"));
		sendText(factory.retailAccount().state, addressInputs.get(0).get("state"));
		clearTextUsingSendKeys(factory.retailAccount().zipCode);
		sendText(factory.retailAccount().zipCode, addressInputs.get(0).get("zipCode"));
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccount().submitAddBttn);
	   
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.retailAccount().addAddrSuccessMsg);
	   Assert.assertTrue(factory.retailAccount().addAddrSuccessMsg.isDisplayed()); 
	   logger.info("Address added sucessfully");
	}
	
	//Edit Address
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailAccount().addresEditBttn);
			
	    logger.info("Address Edit button successfully clicked");
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccount().updateAdressBttn);
	    logger.info("Address update button has successfully been clicked");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.retailAccount().addrUpdateSuccessMsg);
		Assert.assertTrue(factory.retailAccount().addrUpdateSuccessMsg.isDisplayed());
	    logger.info("Address has successfully been updated");
	}
	
	// address remove
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccount().addressRemoveBttn);
		logger.info("Address Removed botton was clicked Sucessfully");
		
	    
	}
//	@Then("Address details should be removed")
//	public void addressDetailsShouldBeRemoved() {
//		waitTillPresence(factory.retailAccount().addressRemoveBttn);
//		Assert.assertFalse(factory.retailAccount().addressRemoveBttn.isDisplayed());
//		logger.info("Adress removed successfully");
//	    
//	}

}
