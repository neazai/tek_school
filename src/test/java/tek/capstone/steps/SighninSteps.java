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

public class SighninSteps extends CommonUtility{

	
	POMFactory factory = new POMFactory();
	
	

	 

@When("User click on sign in option")
    public void userClickOnSignInOption() {
	click(factory.homePage().signInButton);
	logger.info("user clicked on the sign in button");
}
	 	
			   
		
		
		@When("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String emailValue , String passwordValue) {
		sendText(factory.signinPage().emailField, emailValue);
		sendText(factory.signinPage().passwordField, passwordValue);
		logger.info("user enter email value" + emailValue + "user enter passward value" + passwordValue);
		

		}
		
		@When("User click on login button")
		public void userClickOnLoginButton() {
	    click(factory.signinPage().loginPageButton);
	    logger.info("user clicked on logg in button");
		  
		}
		
		@Then("User should be signed in")
		public void userShouldBeSignedIn() {
	 Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		   
		}

                   
	
	@When("User click on create new account button")
		public void userClickOnSignInButton() {
		click(factory.signinPage().createNewAccountButton);
		logger.info("user click on create new account button");
	}
		
		
		@When("User fill the signUp information with the bewlow data")
		public void userFillTheSignUpInformationWithTheBewlowData(DataTable dataTable) {
		  List<Map<String, String>> signUpInformation= dataTable.asMaps(String.class, String.class) ; //Date type for key and value <> we getting the information from the
// feature file and storing in the list of map which each list map counts as a row and each each index row has a  map with key and value. 
		// sendText(factory.signInPage().signUpNameInputField,signUpInformation.get(0).get("name"));
		//	 sendText(factory.signInPage().signUpEmailFieldInput,signUpInformation.get(0).get("email"));
		 sendText(factory.signinPage().signUpNameInputField,DataGeneratorUtility.data(signUpInformation.get(0).get("name")));
		 sendText(factory.signinPage().signUpEmailFieldInput,DataGeneratorUtility.data(signUpInformation.get(0).get("email")));
		 sendText(factory.signinPage().signUpPasswordInputField,signUpInformation.get(0).get("password")); 
		 sendText(factory.signinPage().signUpConfirmPassword,signUpInformation.get(0).get("confirm password"));
		 logger.info ("user filled the sign up informathon");
		}
		
		
		
		@When("User click on signUp button")
		public void userClickOnSignUpButton() {
		 click(factory.signinPage().signUpButton) ;
		 logger.info ("user click on sign up bottun");
		}
		
		
		@Then("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
			Assert.assertTrue(isElementDisplayed(factory.accountPage().accountProfileImage));
		   logger.info("user is logged in into account page");
		}


		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
