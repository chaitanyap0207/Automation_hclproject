package stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pompages.Accountcreationpage;
import pompages.Addingproductspage;
import pompages.Registerpage;


public class Registersteps {

	public WebDriver driver;
	public Accountcreationpage accountpage;
	public Registerpage rp;
	public Addingproductspage app;
	
	
	@Given("launching chromebrowser")
	public void launch_chromebrowser() 
	{
	   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		accountpage = new Accountcreationpage(driver);
		rp=new Registerpage(driver)	;	
		app = new Addingproductspage(driver);
	}

	@Given("entering url as {string}")
	public void enter_url_as(String url) {
		driver.get(url);
	}

	@When("user clicking on Login or Register Button")
	public void user_clicking_on_login_or_register_button() {
	   
		app.loginclk1btn();
	}
	
	@Given("click on Register account continue button")
	public void click_on_register_account_continue_button() 
	{
		
		accountpage.continueclickbtn(); 
	}

	@Given("user enters the following details")
	public void user_enters_the_following_details(io.cucumber.datatable.DataTable dataTable) 
	{
	  
	   rp.firstnameclk(dataTable);
	   rp.lastnameclk(dataTable);
	   rp.emailclk(dataTable);
	   rp.address1clk(dataTable);
	   rp.cityclk(dataTable);
	   rp.pincode(dataTable);
	   rp.username(dataTable);
	   rp.password(dataTable);
	   rp.cnfrmpassword(dataTable);
	   
	}

	@Given("select county as India")
	public void select_county_as_india() throws InterruptedException {
		   rp.countrydropdown();
	}

	@Given("select state as Andhra pradesh")
	public void select_state_as_andhra_pradesh() {
	   rp.statedropdown();
	}

	@Given("click on subscribe btn")
	public void click_on_subscribe_btn() {
	    rp.subscribebtn();
	}

	@Given("click on i have read policy")
	public void click_on_i_have_read_policy() {
	    rp.agreebtn();
	}

	@Given("click on continue")
	public void click_on_continue() {
	  rp.continuebtn();
	  

	}


}
