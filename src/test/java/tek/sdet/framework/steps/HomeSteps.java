package tek.sdet.framework.steps;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().sideBar);
		logger.info("SideBar options was clicked successfully");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> departments = dataTable.asLists(String.class);
		for (int i = 0; i < departments.get(0).size(); i++) {
			Assert.assertTrue(factory.homePage().sideBarOptions.isDisplayed());
			logger.info("The sidebar Option " + departments.get(0).get(i) + " is displayed");

		}
	}
	
	//@Departments

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> sideBarContents = factory.homePage().sideBarContents;
		for (int i = 1; i < sideBarContents.size(); i++) {
			if (sideBarContents.get(i).getText().equalsIgnoreCase(department)) {
				sideBarContents.get(i).click();
				break;

			}

		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> SideBarContentOptions = dataTable.asLists(String.class);
		List<WebElement> sideBarContents = factory.homePage().sideBarContents;
		for (int i = 0; i < SideBarContentOptions.get(0).size(); i++) {
			for (WebElement element : sideBarContents) {
				if (element.getText().equalsIgnoreCase(SideBarContentOptions.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info("The options " + element.getText() + "is displayed");

				}

			}

		}

	}

}
