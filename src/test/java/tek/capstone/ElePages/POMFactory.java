package tek.capstone.ElePages;

import tek.capstone.base.BaseSetup;

public class POMFactory extends BaseSetup{

	
	

	private RetailHomePage homePage;
	private AccountPage accountPage;
	private Signinpage signinPage ;
	private OrderPage orderPage ;
	
	
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.accountPage = new AccountPage();
		this.signinPage = new Signinpage();
		this.orderPage  = new OrderPage();
	}
	
	
	
	
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	
	public AccountPage accountPage () {
		return this.accountPage;
	}
	
	
	public Signinpage signinPage () {
		return this.signinPage;
	}
	
	
	public OrderPage orderPage() {
		return this.orderPage;
	}
	
	
}
