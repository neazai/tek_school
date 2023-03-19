package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.ElePages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility{

	
	// create an object of POMFactory class 
	private POMFactory factory = new POMFactory();
	
	
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
	}
	
	
	

	
	

	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchinput, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product "+ productValue );
	}
	
	
	
	
	
	
	
	
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");
		
	}	
	
	
	
	
	
	
	
	

	@When("User click on All section")
		public void userClickOnAllSection(){
		click(factory.homePage().allSidebarButton);
		logger.info("user clicked on All selection");
	}
	
	
	
	
	@Then("Below options are present in shop by department sidebar")
	public void belowOptionArePresentInByDepartmentSidebar(DataTable dataTable) {
	List<List<String>> expectedSidebar = dataTable.asLists(String.class);	
	List <WebElement> actualSidebar = factory.homePage().sidbarElements;
	
	for (int i = 0; i < expectedSidebar.get(0).size(); i++) {
		Assert.assertEquals(actualSidebar.get(i).getText(), expectedSidebar.get(0).get(i));
		logger.info(actualSidebar.get(i).getText() +" is equal to " + expectedSidebar.get(0).get(i));
	}
	// other method without list just doing one by one bit not effecient
//	Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
//	Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
//	Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
//	Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
//	Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
//	logger.info("actual is equal to expected");
	
	}
	
	
	
	@And("User click on {string}")
	public void userClickOnElectronics ( String department) {
		List <WebElement> sidebarOption = factory.homePage().sideBarOptionElements; //, in each index save one of these elements
		for (WebElement option: sidebarOption){// iterate through the list
			if (option.getText().equals(department)) {
				click(option);
				
				try { // coz it was failing with logger so We used try catch exception
				logger.info(option.getText() +" option is present");
				} catch (StaleElementReferenceException e){	
				}
				
				break; // once click then break
			}
		}
		
		
	}
	
	
	
	@Then("Below options are present in department")
	public void belowOptionArePresentInDepartment(DataTable dataTable){
		List<List<String>> expectedDepartmentOption = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOption = factory.homePage().sidbarElements;
		
		for(int i =0; i< expectedDepartmentOption.get(0).size(); i++) { // outer loop
			for(WebElement dept: actualDepartmentOption) { // inner loop
				if(dept.getText().equals(expectedDepartmentOption.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() +" dep is present");
					break;
				}
			}
		}		
	}
		
	
	
	

     @When("User should be logged in into Account")
   public void userShouldBeLoggedInIntoAccount() {
   Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
   logger.info("user is logged in into account");
    } 
     
     
     
     
     @When("User change the category to {string}")
      public void userChangeTheCategoryTo(String starthome) {
    selectByVisibleText(factory.homePage().allDepartmentAtSeachBar, starthome);
    logger.info("user change the catagory to home smart");
    }
     
     
     
    @When("User search for an item {string}")
    public void userSearchForAnItem(String item) {
   click(factory.homePage().searchinput);
   sendText(factory.homePage().searchinput, item);
   logger.info("user searched for item");
    }
    
    
    
    @When("User click on Search icon")
    public void userClickOnSearchIcon() {
     click(factory.homePage().searchButton);
     logger.info("user click on serach icon");
    }
    
    
    
    @When("User click on item")
     public void userClickOnItem() {
   click(factory.homePage().Kasa_outdoor_smart_plug);
   logger.info("user click on item");
    }
    
    
    
     @When("User select quantity ‘{int}’")
    public void userSelectQuantity(Integer int1) { 	 
 selectByVisibleText(factory.homePage().QuantityForSelectItem,"2" );
 logger.info("user select qty to 2");
    }
     
     
     
    @When("User click add to Cart button")
    public void userClickAddToCartButton() {
   click(factory.homePage().addToCart);
   logger.info("user clicked on cart");
    }
    
    
    
    @Then("the cart icon quantity should change to ‘{int}")
    public void theCartIconQuantityShouldChangeTo(Integer int1) {	
    Assert.assertTrue(isElementDisplayed(factory.homePage().TwoQTYitemAddedToCard));
    logger.info("the quantity changed to 2 in the card");
    }

	
	

@When("User click on Cart option")
public void userClickOnCartOption() {
 click(factory.homePage().Cart);  
 logger.info("user clicked on cart option");
}


@When("User click on Proceed to Checkout button")
public void userClickOnProceedToCheckoutButton() {
	click(factory.homePage().proceedToCheckout); 
	 logger.info("user clicked on proceed to checkout  option");
}



@When("User click Add a new address link for shipping address")
public void userClickAddANewAddressLinkForShippingAddress() {
    click(factory.accountPage().addANewAddress);
    logger.info("user clicked on padd new address button");
}





@When("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
    click(factory.homePage().addPaymentMethod);
    logger.info("user clicked on add a cridet card or Debit card button");
}

/////////////////////	
	
	

@When("User Change the category to {string}")
public void userChangeTheCategoryToElectronics(String electronics) {
   selectByVisibleText(factory.homePage().allDepartmentAtSeachBar, electronics);
   logger.info("user change the catagory to electronics");
}
	
	
   @And("User click on the item")
   public void userClickOnTheItem (){
	click(factory.homePage().electromicsItem) ; 
	   logger.info("userserach for an electornics");
   }
	

	

	
	
	
	
	




	
	
	
}
