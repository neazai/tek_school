package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.ElePages.POMFactory;
import tek.capstone.utilities.CommonUtility;
import tek.capstone.utilities.DataGeneratorUtility;

public class OrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	
	
	
	



@When("User fill Debit or credit card information")
public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	List<Map<String, String>> debitinfo = dataTable.asMaps(String.class, String.class);
	 sendText(factory.orderPage().cardNumber,debitinfo.get(0).get("cardNumber"));
	 sendText(factory.orderPage().nameOnCard,debitinfo.get(0).get("nameOnCard"));
	 sendText(factory.orderPage().ExpirationMonth,debitinfo.get(0).get("expirationMonth")); 
	 sendText(factory.orderPage().ExpirationYear,debitinfo.get(0).get("expirationYear"));
	 sendText(factory.orderPage().securityCode,debitinfo.get(0).get("securityCode"));
	 logger.info ("user filled the cridet card  informathon");
	}
	




@When("User click on Add your card button")
public void userClickOnAddYourCardButton() {
	 click(factory.orderPage().addyourcardButton);
	 logger.info("user click on add your card option");
   
}



@When("User click on Place Your Order")
public void userClickOnPlaceYourOrder() {
   click(factory.orderPage().placeYourButton);
   logger.info("user click on place your order button");
}



@Then("a message should be displayed ‘Order Placed, Thanks’")
public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlaceThanksConfirmation));
	logger.info("messege is desplayes");
}




    @Given("User click on Orders section")
     public void userClickOnOrdersSection() throws InterruptedException {
     click(factory.orderPage().orderSectionButton);
     Thread.sleep(300);
     logger.info("user clicked on order section");
    }
    
    
     @And("User click on first order in list")
     public void userClickOnFirstOrderInList() {
    	 click(factory.orderPage().viewOrderToCancel);
    	 logger.info("user clicked on first item in the list");
    }
     
     
    @And("User click on Cancel The Order button")
     public void userClickOnCancelTheOrderButton() {
    	 click(factory.orderPage().cancelOrderButton);
    	 logger.info("user clickes on cancel order");
    }
    
    
    
    
    @And("User select the cancelation Reason 'Bought wrong item’")
     public void userSelectTheCancelationReasonBoughtWrongItem() {
    selectByVisibleText(factory.orderPage().selectDropDownForCancelingReason,"Bought wrong item");
    logger.info("user clicked on select menue and chose the item damageges option");
    }
    
    
    
    @And("User click on Cancel Order button")
    public void userClickOnCancelOrderButton() {
    	click(factory.orderPage().cancelOrder);
    	logger.info("user clicked on cancel order button");
    
    }
    
    
    @Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
    public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCanceldSuccseffulyMessege));
    	logger.info("messege deslapyed");
     }

////////////////////////////////////
	
    @When("User click on  order in the list for return")
    public void userClickOnOrderInTheListForReturn() {
        click(factory.orderPage().viewOrderToReturn);
        logger.info("user clickes on item to return");
    }
    
    
    @When("User click on Return Items button")
    public void userClickOnReturnItemsButton() {
      click(factory.orderPage().ReturnItems);
    	logger.info("user clickes on return button");
    }
    
    
    @When("User select the Return Reason {string}")
    public void userSelectTheReturnReasonItemDamaged(String reason) {
    	selectByVisibleText(factory.orderPage().returnReasonItemDamaged,reason);
    	logger.info("user clickes select reson for return");
    }
    
    
    @When("User select the drop off service {string}")
    public void userSelectTheDropOffServiceFedEx(String service) {
    	selectByVisibleText(factory.orderPage().dropOfFedex,service);
    	logger.info("user select the drop of location");
    }
    
    
    @When("User click on Return Order button")
    public void userClickOnReturnOrderButton() {
    	click(factory.orderPage().returnOrderButton);
    	logger.info("user clickes on return order button");
    }
    
    
    @Then("a cancelation message should be displayed {string}")
    public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String messege) {
    	waitTillPresence(factory.orderPage().returnMessegeDisplayed);
    	Assert.assertEquals(factory.orderPage().returnMessegeDisplayed, messege);
    	logger.info("return messege displayed");
    }
    
    
    
    /////
    @When("User click on order in list for review")
    public void userClickedOnOrederToReview() throws InterruptedException {
    	waitTillClickable(factory.orderPage().viewOrderToReview).click();
    	logger.info("user clicked on order for review");
    
    }
    
    
    @When("User click on Review button")
    public void userClickedOnReviewButton() {
    	click(factory.orderPage().reviewButton);
    	logger.info("user clicked on review button");
    }
    
    
    
    @When("User write Review headline {string} and 'review text’")
    public void userWritReviewHeadlineAndText(String headline) {
    	sendText(factory.orderPage().headlineInput, headline);
    	sendText(factory.orderPage().reviewTextInpute, "I bought one but never recieve it and that is why i don't know about quality");
    	logger.info("user add outline and review text");
    }
    
    @When("User click Add your Review button")
    public void userClickedOnAddYourReviewButton() {
    	click(factory.orderPage().addYourReview);
    	logger.info("user clicked on add your review button");
    }
    
    @Then("a review message should be displayed 'Your review was added successfully'")
    public void ReviewMessegeShouldBeDisplayed() {
    	waitTillPresence(factory.orderPage().reviewMessegeDisplayed);
    	Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMessegeDisplayed));
    	logger.info("review messege is displayed");
    }
    
    
    
}
