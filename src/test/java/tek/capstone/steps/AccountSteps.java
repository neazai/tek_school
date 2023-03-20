package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.ElePages.POMFactory;
import tek.capstone.utilities.CommonUtility;
import tek.capstone.utilities.DataGeneratorUtility;

public class AccountSteps extends CommonUtility{

	
	POMFactory factory = new POMFactory();
	
	
	
	

	
	@When("User click on account option")
	public void userClickOnAccountOption() {
	   click(factory.homePage().accountOption);
	 logger.info("user clicked on account option");
	}
	
	
	
	
	
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
	    clearTextUsingSendKeys(factory.accountPage().accountNameInput);
	    sendText(factory.accountPage().accountNameInput, nameValue); 
	    clearTextUsingSendKeys(factory.accountPage().poneNumberInput);
	    sendText(factory.accountPage().poneNumberInput,phoneValue) ;
	    logger.info("user update name and phone number");
	}
	
	
	
	
	
	@When("User click on update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("user clicked on Update button");
	}
	
	
	
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	  waitTillPresence(factory.accountPage().updateInfoSuccessMessege); 
	  Assert.assertTrue(isElementDisplayed(factory.accountPage().updateInfoSuccessMessege));
		logger.info("profile information updated");
	
	}

	




     @When("User click on Add address option")
     public void userClickOnAddAddressOption() {
     click(factory.accountPage().addAddressButton);
    logger.info("user clicked on add address option");
     }


     
     @When("User fill new address with below information")
     public void userFillNewAddressWithBelowInformation(DataTable dataTable) {
    List<List<String>> addressInfo = dataTable.asLists(String.class);// Key Type >> we define type of class we using << string type class
    selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
    sendText(factory.accountPage().addAddressFullNameInput,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
    sendText(factory.accountPage().addAddressPhoneNumber,DataGeneratorUtility.data(addressInfo.get(0).get(2)));
    sendText(factory.accountPage().addAddressStreet,DataGeneratorUtility.data(addressInfo.get(0).get(3)));
   sendText(factory.accountPage().addAddressApartment,DataGeneratorUtility.data(addressInfo.get(0).get(4)));
   sendText(factory.accountPage().addAddressCity,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
   selectByVisibleText(factory.accountPage().addAddressStateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
   sendText(factory.accountPage().addAddressZipCode,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
  logger.info("user filled the new address from information were provided in the data table");
//  when a method accepts parameter and says class<T>integer You need to say integer dot class. Those are the wrapper class for the primitive data type
//  But the string is not a primitive data type, so : string.class if it doesn't accept the parameter
     }


    @When("User click Add Your Address button")
    public void userClickAddYourAddressButton() {
    	 click(factory.accountPage().addYourAddressSubmitButton);
    	 logger.info("user clicked on add address button");
    }





    @Then("a messege should be displayed {string}")
    public void aMessegeShouldBeDisplayed(String expectedMessege) {
    	waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessege);
   Assert.assertEquals(expectedMessege, factory.accountPage().addressAddedSuccessfullyMessege.getText());
	
    }
	
	
    @When("User enter below information")
    public void userEnterBelowInformation(DataTable dataTable) throws Exception {
      List<Map<String, String>> passInfo = dataTable.asMaps(String.class, String.class);
      sendText(factory.accountPage().previousPassword,passInfo.get(0).get("previousPassword"));
      sendText(factory.accountPage().newPassword,passInfo.get(0).get("newPassword"));
      sendText(factory.accountPage().confirmNewPassword,passInfo.get(0).get("confirmPassword"));
      Thread.sleep(3000);
      logger.info("user enter the below information");
    
    }
   ///// 
    @When("User enter below information again")
    public void userEnterBelowInformationAgain(DataTable dataTable) {
      List<Map<String, String>> passInfo = dataTable.asMaps(String.class, String.class);
      sendText(factory.accountPage().previousPassword,passInfo.get(0).get("previousPassword"));
      sendText(factory.accountPage().newPassword,passInfo.get(0).get("newPassword"));
      sendText(factory.accountPage().confirmNewPassword,passInfo.get(0).get("confirmPassword"));
      logger.info("user enter the below information");
    
    }
    
   /// 
    
    
    
	@When("User click on Change Password button")
	public void userClickOnChangePaswwordButton() throws Exception{
		click(factory.accountPage().changePasswordButton);
		threadsleep(300);
		logger.info("user clicked in change password button");
	}
    
    
	

	 @Then("a messege should be displayed2 'Password Updated Successfully’")
	 public void aMessegeShouldBeDisplayed2PasswordUpdatedSuccessfully() {
	//	  waitTillPresence(factory.accountPage().passwordChangedSucessfully);
	///	 Assert.assertEquals(factory.accountPage().passwordChangedSucessfully,"Password Updated Successfully");	
		 logger.info("messege password changed successfully displayed");
	 }
    
    
    
	 @When("User click on Add a payment method link")
	 public void userClickOnAddAPaymentMethodLink() {
	   click(factory.accountPage().addPymentOption);
	   logger.info("user clicked on add a payment  link");
	 }
	 

	 

	 @Then("a message should be displayed 'Payment Method added successfully’")
	 public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
	  waitTillPresence(factory.accountPage().pymentMethodAddedSuccessfully);
	  Assert.assertTrue(isElementDisplayed(factory.accountPage().pymentMethodAddedSuccessfully));
		 logger.info("payment method updated successfully");
	 }
    
    
	
	 
	 @When("User click on card that want to edit")
	 public void userClickOnCardTOEdit() {
		click(factory.accountPage().chooseCardForEdit);
		  logger.info("user clicked on card");
	 }
	 
	 
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfTheCard() {
		click(factory.accountPage().DebitEditOption);
		logger.info("user clicked on edit option of credit card");
	}
	
	
	
	
	 
	 @When("user edit information with below data")
	 public void userEditInformationWithBelowData(DataTable dataTable) throws InterruptedException {
	  List<Map<String, String>> updateCardInfo = dataTable.asMaps(String.class, String.class);
	  clearText(factory.orderPage().cardNumber,updateCardInfo.get(0).get("cardNumber"));
	  sendText(factory.orderPage().cardNumber,updateCardInfo.get(0).get("cardNumber"));
	  threadsleep(2000);
	  clearText(factory.orderPage().nameOnCard,updateCardInfo.get(0).get("nameOnCard"));
	  sendText(factory.orderPage().nameOnCard,updateCardInfo.get(0).get("nameOnCard"));
	  threadsleep(2000);
	  sendText(factory.orderPage().ExpirationMonth,updateCardInfo.get(0).get("expirationMonth"));
	  threadsleep(2000);
	  sendText(factory.orderPage().ExpirationYear,updateCardInfo.get(0).get("expirationYear"));
	  clearText(factory.orderPage().securityCode,updateCardInfo.get(0).get("securityCode"));
	  sendText(factory.orderPage().securityCode,updateCardInfo.get(0).get("securityCode"));
	  logger.info("user enetrd the new information");
	  
	 }
	 

	 

	 
	 
	 
	 @When("user click on Update Your Card button")
	 public void userClickOnUpdateYourCardButton() throws InterruptedException {
	  click(factory.accountPage().updateYourCardButton);
	  logger.info("user clicked on update your card button");
	  threadsleep(5000);
	 }
	 
	 
	 @Then("a message should be displayed ‘Payment Method updated Successfully’")
	 public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	    waitTillPresence(factory.accountPage().pymentMethodUpdatedSuccessfully);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().pymentMethodUpdatedSuccessfully));
		  logger.info("the messege dispalyed");
	 }
	 
	 
	
	
	 @When("User choose card for deletion")
	 public void userChooseCardForDeletion() {
	     click(factory.accountPage().chooseCardForDeletion);
	     logger.info("user clicke on card or choosed card for deletion");
	 }
	 
	 
	 @When("User click on remove option of card section")
	 public void userClickOnRemoveOptionOfCardSection() {
		 click(factory.accountPage().RemoveCaredButton);
	  logger.info("user click on remover button");
	 }
	 
	 
	 @Then("payment details should be removed")
	 public void paymentDetailsShouldBeRemoved() {
//	    Assert.assertNull(factory.accountPage().cardForDelete);
		 logger.info("the card has been deleted");
	 }

	
	
	
	
	
}
