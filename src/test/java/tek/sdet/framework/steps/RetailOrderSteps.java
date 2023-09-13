package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Then("User changes the category to {string}")
	public void userChangesTheCategoryTo(String category) {
		selectByVisibleText(factory.orderPage().departmentDropDownn, category);
		logger.info("Smart Home catagory was selected successfully");

	}

	@Then("User searches for an item {string}")
	public void userSearchesForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.orderPage().searchInput, kasaOutdoorSmartPlug);
		logger.info("search for the item was sucessfull");

	}

	@Then("User clicks on the Search icon")
	public void userClicksOnTheSearchIcon() {
		click(factory.orderPage().searchBttn);
		logger.info("Search button was sucessfully clicked");

	}

	@Then("User clicks on the item")
	public void userClicksOnTheItem() {
		click(factory.orderPage().kasaOutdoorSmartPlug);
		logger.info("User sucessfully clicked on the item");

	}

	@Then("User selects quantity {string}")
	public void userSelectsQuantity(String itmQty) {
		selectByVisibleText(factory.orderPage().productQty, itmQty);
		logger.info("User select the quantity of the product ");

	}

	@Then("User clicks the add to Cart button")
	public void userClicksTheAddToCartButton() {
		click(factory.orderPage().addToCard);
		logger.info("User sucessfully added item to the cart");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQty) {
		Assert.assertEquals(itemQty, factory.orderPage().cartIconQty.getText());
		logger.info("item quantity was validated sucessfully");

	}

	// User can place an order with Shipping address and payment Method on file

	@Then("User changes the category on tek retail web site to {string}")
	public void userChangesTheCategoryOnTekRetailWebSiteTo(String electronics) {
		selectByVisibleText(factory.orderPage().departmentDropDownn, electronics);
		logger.info("User successfully selected electornics from dropDown menu");

	}

	@Then("User searches on tek retail web site for an item {string}")
	public void userSearchesOnTekRetailWebSiteForAnItem(String apexLegends) {
		sendText(factory.orderPage().searchInput, apexLegends);
		logger.info("search for the item was sucessfull");

	}

	@Then("User clicks on the item search for on Tek Web")
	public void userClicksOnTheItemSearchForOnTekWeb() {
		click(factory.orderPage().apexLegendItem);
		logger.info("user clicks on the item sucessfully");

	}

	@Then("User clicks on the Cart option")
	public void userClicksOnTheCartOption() {
		click(factory.orderPage().cartIconQty);
		logger.info("User clicks on cart options sucessufully");

	}

	@Then("User clicks on the Proceed to Checkout button")
	public void userClicksOnTheProceedToCheckoutButton() {
		click(factory.orderPage().processedToCheckout);
		logger.info("User sucessfully click on checkout button");

	}

	@Then("User clicks on the Place Your Order button")
	public void userClicksOnThePlaceYourOrderButton() {
		click(factory.orderPage().placeOrderBttn);
		logger.info("User sucessfully click on order placement button");

	}

	// Order Cancellation

	@Then("User clicks on the Orders section")
	public void userClicksOnTheOrdersSection() {
		click(factory.orderPage().orderSection);
		logger.info("User clicks on order section");

	}

	@Then("User clicks on the first order in the list")
	public void userClicksOnTheFirstOrderInTheList() {
		List<WebElement> listOfOrders = factory.orderPage().firstOderFromList;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {

			} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
				click(factory.orderPage().firstOderFromList.get(i));

			}
			logger.info("First Order was clicked sucessfully");
		}

	}

	@Then("User clicks on the Cancel The Order button")
	public void userClicksOnTheCancelTheOrderButton() {
		click(factory.orderPage().cancleOrderBttn);
		logger.info("User clicked on cancel order buttion sucessfully");

	}

	@Then("User selects the cancellation reason {string}")
	public void userSelectsTheCancellationReason(String reason) {
		selectByVisibleText(factory.orderPage().reasonForCancel, reason);
		logger.info("User selects the reason for cancellation of order");

	}

	@Then("User clicks on the Cancel Order button")
	public void userClicksOnTheCancelOrderButton() {
		click(factory.orderPage().cancelOrderSubmittBttn);
		logger.info("User clicks on cancellation button");

	}

	@Then("a cancellation message should be displayed {string}")
	public void aCancellationMessageShouldBeDisplayed(String message) {
		Assert.assertEquals(message, factory.orderPage().orderCancelConfirmation.getText());
		logger.info("Order canellation was sucessfull");

	}

	// Return Order

	@Then("User clicks on Return Items button")
	public void userClicksOnReturnItemsButton() {
		List<WebElement> returnBttn = factory.orderPage().returnBttn;
		for (int i = 0; i < returnBttn.size(); i++) {
			click(returnBttn.get(i));

		}

	}

	@Then("User selects the Return Reason {string}")
	public void userSelectsTheReturnReason(String reason1) {
		selectByVisibleText(factory.orderPage().returnReason, reason1);

	}

	@Then("User selects the drop-off service {string}")
	public void userSelectsTheDropOffService(String curior) {
		selectByVisibleText(factory.orderPage().returnDropOff, curior);

	}

	@Then("User clicks on the Return Order button")
	public void userClicksOnTheReturnOrderButton() {
		click(factory.orderPage().returnOderSubmision);
		logger.info("User submites the order return sucessfully");

	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String message1) {
		Assert.assertEquals(message1 , factory.orderPage().returnSuccessMsg.getText());
		logger.info("Order return success massege"); 

	}
	
	//Order review
	
	
	    
	@Then("User clicks on the Review button")
	public void userClicksOnTheReviewButton() {
		
		List<WebElement> reviews = (List<WebElement>) factory.orderPage().reviewBttn;
		for (int i = 0; i < reviews.size(); i ++) {
			click(reviews.get(i));
		}
		logger.info("Why is this not working");
	    
	}
	@Then("User writes a Review headline {string} and {string}")
	public void userWritesAReviewHeadlineAnd(String header, String review) {
		sendText(factory.orderPage().reviewHeadLine,header);
		sendText(factory.orderPage().reviewTextArea, review);
	    
	}
	@Then("User clicks the Add your Review button")
	public void userClicksTheAddYourReviewButton() {
		click(factory.orderPage().reviewSubmit);
		logger.info("User clicks on review button");
	    
	}
//	@Then("a review message should be displayed {string}")
//	public void aReviewMessageShouldBeDisplayed(String sucessMsg) {
//		Assert.assertEquals(factory.orderPage().returnSuccessMsg.getText(), sucessMsg);
//		logger.info("Return was sucessfull");
//		
//	    
//	}

}
