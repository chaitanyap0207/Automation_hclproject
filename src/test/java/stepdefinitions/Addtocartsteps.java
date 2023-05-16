package stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pompages.Accountcreationpage;
import pompages.Addingproductspage;
import pompages.Addtocartpage;
import pompages.Checkoutpage;
import pompages.Paymentspage;
import pompages.Productselectionpage;
import pompages.Registerpage;



public class Addtocartsteps {
	public WebDriver driver;
	public Accountcreationpage acp;
	public Addingproductspage app;
	public Addtocartpage atcp;
	public Checkoutpage cop;
	public Paymentspage pp;
	public Productselectionpage psp;
	public Registerpage rp;
	
	
	@Given("launch chromebrowser")
	public void launch_chromebrowser() 
	{
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		app = new Addingproductspage(driver);
		atcp =new  Addtocartpage(driver);
		cop = new Checkoutpage(driver);
		pp =new Paymentspage(driver);
		psp=new Productselectionpage(driver);
			
	}

	@Given("enter url as {string}")
	public void enter_url_as(String url) {
		driver.get(url);
	}

	@When("user click on Login or Register Button")
	public void user_click_on_login_or_register_button() {
	   app.loginclk1btn();
	}

	@When("enter Username as {string}")
	public void enter_username_as(String Username) 
	{
			app.usernamebtn(Username);
	
	}
	

	@When("enter password as {string}")
	public void enter_password_as(String password) 
	{
	
		app.passwordbtn(password);
	}

	@When("click on login")
	public void click_on_login() 
	{
	    app.loginbtn();
	    String expectedname="theja";
		Assert.assertEquals(app.accountverifybtn(),expectedname);
		System.out.println("VALIDATION : The account name is valid");
	}
	@When("click on search")
	public void click_on_search() 
	{
		app.addingproductbtn();
		
	   
	}

	@When("add Men+Care Active Clean Shower Tool")
	public void add_men_care_active_clean_shower_tool()
	{
	    psp.creambtn();
	    
	}

	@When("add item to cart")
	public void add_item_to_cart() 
	{
	    atcp.addcartbtn();
	    
	}

	@When("proceed to checkout page")
	public void proceed_to_checkout_page() 
	{
	    cop.checkoutbtn();
	}

	@Then("checkout confirmation page will be displayed")
	public void checkout_confirmation_page_will_be_displayed() 
	{
	    Assert.assertEquals(pp.cartitem(),pp.orderitem());
	    System.out.println("VALIDATION : The order and cart product names are equal");
	    Assert.assertEquals(pp.orderprice(), pp.cartprice());
	    System.out.println("VALIDATION :The orderprice and cart price are equal");
	    
	}
	
}
