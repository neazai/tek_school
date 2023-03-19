package tek.capstone.ElePages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.base.BaseSetup;




public class RetailHomePage extends BaseSetup{

	
	
	public RetailHomePage () {
		PageFactory.initElements(getDriver(), this); //Inside the constructor we will call initElements method of PageFacory Class.
	}
	
	// store UI element
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchinput;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(xpath = "//a[@id='signinLink']") 
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	
	@FindBy(xpath="//a[@id='accountLink']") 
	public WebElement accountOption;
	
	
	@FindBy(xpath="//button[@id='hamburgerBtn']")
	public WebElement allSidebarButton;
	
	
	
	@FindBy(xpath="//div[@class='sidebar_content-item']")
	public List<WebElement> sidbarElements ;
	
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	
	@FindBy(xpath="//select[@id='search']")
	public WebElement allDepartmentAtSeachBar;
	
	
	
	@FindBy(xpath = "//*[@id=\"search\"]/option[4]")
	public WebElement smartHomeAtSearchBr;
	
	
	@FindBy(xpath ="//P[text()='Kasa Outdoor Smart Plug']")
	public WebElement Kasa_outdoor_smart_plug;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement QuantityForSelectItem;
	
	
	@FindBy(xpath="//button[@id='addToCartBtn']")
	public WebElement addToCart;
	
	
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement TwoQTYitemAddedToCard;
	
	
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement Cart;
	
	
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement proceedToCheckout;
	
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentMethod;
	
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement electromicsItem;
	
	
	
//	@FindBy(xpath="//span[@id='cartQuantity']")
//	public WebElement carQTYin5;
//	
}
