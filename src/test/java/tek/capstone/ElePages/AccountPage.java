package tek.capstone.ElePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class AccountPage extends BaseSetup{

	
	public AccountPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	

	@FindBy(xpath="//img[@id='profileImage']" )
	public WebElement accountProfileImage;
	
	
	@FindBy(id="nameInput")
	public WebElement accountNameInput;
	
	
	@FindBy(xpath ="//input[@id='personalPhoneInput']")
	public WebElement poneNumberInput;
	
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateButton;
	
	
	@FindBy(xpath="//input[@id='emailInput']")
	public WebElement emailInput;
	
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement updateInfoSuccessMessege;
	
	
	@FindBy(xpath= "//p[text()='Add Address']")
	public WebElement addAddressButton;
	
	
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;
	
	
	
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement addAddressFullNameInput;
	
	
	
	@FindBy(xpath ="//input[@id='phoneNumberInput']")
	public WebElement addAddressPhoneNumber;
	
	
	
	@FindBy(xpath= "//input[@id='streetInput']")
	public WebElement addAddressStreet;
	
	
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement addAddressApartment;
	
	
	@FindBy(xpath= "//input[@id='cityInput']")
	public WebElement addAddressCity;
	
	
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement addAddressStateDropDown;
	
	
	@FindBy(xpath="//input[@id='zipCodeInput']")
	public WebElement addAddressZipCode;
	
	
	@FindBy(xpath= "//button[@id='addressBtn']")
	public WebElement addYourAddressSubmitButton;
	
	

	@FindBy(xpath= "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessege;
	
	@FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement addANewAddress;
	
	
	@FindBy(xpath=("//input[@id='previousPasswordInput']"))
	public WebElement previousPassword;
	
	
	@FindBy(xpath=("//input[@id='newPasswordInput']"))
	public WebElement newPassword;
	
	
	@FindBy(xpath=("//input[@id='confirmPasswordInput']"))
	public WebElement confirmNewPassword;
	
	
	@FindBy(xpath=("//button[@id='credentialsSubmitBtn']"))
	public WebElement changePasswordButton;
	

	@FindBy(xpath=("//div[text()='Password Updated Successfully']"))
	public WebElement passwordChangedSucessfully;
	
	
	@FindBy(xpath=("//p[text()='Add a payment method']"))
	public WebElement addPymentOption;
	
	
	@FindBy(xpath=("//div[text()='Payment Method added sucessfully']"))
	public WebElement pymentMethodAddedSuccessfully;
	
	
	@FindBy(xpath=("//button[text()='Edit']"))
	public WebElement DebitEditOption;
	
	
	@FindBy(xpath=("//button[@id='paymentSubmitBtn']"))
	public WebElement updateYourCardButton;
	
	
	
	@FindBy(xpath =("//div[text()='Payment Method updated Successfully']"))
	public WebElement pymentMethodUpdatedSuccessfully;
	
	
	
	@FindBy(xpath =("//div[@class='false account__payment-item']"))
	public WebElement chooseCardForEdit;
	
	
	
	@FindBy(xpath =("//div[@data-id='5132']"))
	public WebElement chooseCardForDeletion;
	
	
	@FindBy(xpath=("//button[text()='remove']"))
	public WebElement RemoveCaredButton;
	
	
	
}
