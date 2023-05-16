
package pompages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addingproductspage extends Baseclass{

	public Addingproductspage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[contains(@id,'customer_menu_top')]//a[contains(@href,'account/login')]")
			// "//a[normalize-space()='Login or register']")
	WebElement loginclk1btn;
	
	@FindBy(xpath="//input[@id='loginFrm_loginname']")
	WebElement usernamebtn;
	
	@FindBy(xpath="//input[@id='loginFrm_password']")
	WebElement passwordbtn;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='subtext']")
	WebElement accountverifybtn;
	
	@FindBy(xpath=("//input[@id='filter_keyword']"))
	WebElement searchbtn;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement clkbtn;
	
	
	public void loginclk1btn() 
	{
		loginclk1btn.click();
	}
	
	
	public void usernamebtn(String Username) 
	{
		
		usernamebtn.sendKeys(Username);
	}
	
	public void passwordbtn(String password)
	{
		passwordbtn.sendKeys(password);
	}
	
	public void loginbtn() 
	{
		loginbtn.click();
	}
	
	
public String accountverifybtn() {
		
		String accountname= accountverifybtn.getText();
		return accountname;
		
	}
	
	public void addingproductbtn() 
	{
		searchbtn.click();
		searchbtn.sendKeys("men cream");
		clkbtn.click();
		
	
	}

	
	
}
