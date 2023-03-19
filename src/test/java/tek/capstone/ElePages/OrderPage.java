package tek.capstone.ElePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class OrderPage extends BaseSetup{

	
	public OrderPage () {
    PageFactory.initElements(getDriver(), this);	
	}
	
	
	@FindBy(xpath ="//input[@id='cardNumberInput']")
	 public WebElement cardNumber;
	
	

	@FindBy(xpath ="//input[@id='nameOnCardInput']")
	 public WebElement nameOnCard;
	
	
	

	@FindBy(xpath ="//input[@id='securityCodeInput']")
	 public WebElement securityCode;
	
	
	
	@FindBy(xpath ="//select[@id='expirationMonthInput']")
	 public WebElement ExpirationMonth;
	
	
	@FindBy(xpath ="//select[@id='expirationYearInput']")
	 public WebElement ExpirationYear;
	
	
	
	@FindBy(xpath ="//button[@id='paymentSubmitBtn']")
	public WebElement addyourcardButton;
	
	
	
	@FindBy(xpath ="//button[@id='placeOrderBtn']")
	public WebElement placeYourButton;
	
	
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSucessfullyMessege;
	
	
	

	@FindBy(xpath="//div[text()='Order Placed Successfully']")
	public WebElement OrderPlacedSuccessfullyMessege;
	
	
	
	@FindBy(xpath=" //*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/p")
	public WebElement orderPlaceThanksConfirmation;
	
	
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderSectionButton;
	
	
	

	@FindBy(xpath=("(//p[text()='Show Details'])[2]"))
	public WebElement viewOrderToCancel;
	
	
	
	@FindBy(xpath=("//select[@id='reasonInput']"))
	public WebElement selectDropDownForCancelingReason;
	
	@FindBy(xpath=("//button[@id='cancelBtn']"))
	public WebElement cancelOrderButton;
	
	
	@FindBy(xpath=("//p[contains(text(),'Your Order Has Been Cancelled')]"))
	public WebElement orderCanceldSuccseffulyMessege;
	
	

	@FindBy(xpath=("//button[@id='orderSubmitBtn']"))
	public WebElement cancelOrder;
	
	
	
	@FindBy(xpath=("(//p[text()='Show Details'])[4]"))
	public WebElement viewOrderToReturn;
	
	
	@FindBy(xpath=("(//button[@id='returnBtn'])[1]"))
	public WebElement ReturnItems;
	
	
	@FindBy(xpath=("//select[@id='reasonInput']"))
	public  WebElement returnReasonItemDamaged;
	
	
	@FindBy(xpath=("//select[@id='dropOffInput']"))
	public WebElement dropOfFedex;
	
	
	@FindBy(id=("orderSubmitBtn"))
	public WebElement returnOrderButton;
	
	
	@FindBy(xpath=("//p[text()='Return was successfull']"))
	public WebElement returnMessegeDisplayed;
	
	
	@FindBy(xpath=("(//p[text()='Show Details'])[1]"))
	public WebElement viewOrderToReview;
	
	
	@FindBy(xpath=("(//button[@id='reviewBtn'])[1]"))
	public WebElement reviewButton;
	
	
	@FindBy(id=("headlineInput"))
	public WebElement headlineInput;
	

	@FindBy(id=("descriptionInput"))
	public WebElement reviewTextInpute;
	
	
	@FindBy(xpath=("//button[@id='reviewSubmitBtn']"))
	public WebElement addYourReview;
	
	
	@FindBy(xpath=("//div[text()='Your review was added successfully']"))
	public WebElement reviewMessegeDisplayed;
	
	
	
	
	
	
	
	
	
	
	
	
}
