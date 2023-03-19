package tek.capstone.ElePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class Signinpage extends BaseSetup{

	public Signinpage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	

	@FindBy(xpath ="//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy(id ="email")
	public WebElement emailField;
	
	@FindBy(id ="password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginPageButton;
	
	@FindBy(linkText ="Create New Account")
	public WebElement createNewAccountButton;
	
	@FindBy(id ="newCompanyAccount")
	public WebElement  wantToSellSomethingLink;
	
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id="nameInput")
	public WebElement signUpNameInputField;
	
	
	@FindBy(css ="#emailInput")
	public WebElement signUpEmailFieldInput;
	
	
	@FindBy(id = "passwordInput")
	public WebElement signUpPasswordInputField;
	
	

	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement signUpConfirmPassword;
	
	
	
	
	
	
}
