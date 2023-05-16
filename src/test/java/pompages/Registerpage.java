package pompages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;


public class Registerpage extends Baseclass{
	
	public Registerpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='AccountFrm_firstname']")
	WebElement firstnameclk;
	
	@FindBy(xpath="//input[@id='AccountFrm_lastname']")
	WebElement lastnameclk;
	
	@FindBy(xpath="//input[@id='AccountFrm_email']")
	WebElement emailclk;
	
	@FindBy(xpath="//input[@id='AccountFrm_address_1']")
	WebElement address1clk;
	
	@FindBy(xpath="//input[@id='AccountFrm_city']")
	WebElement cityclk;
	
	@FindBy(xpath="//input[@id='AccountFrm_postcode']")
	WebElement pincode;
	
	@FindBy(xpath="//input[@id='AccountFrm_loginname']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='AccountFrm_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='AccountFrm_confirm']")
	WebElement cnfrmpassword;
	
	@FindBy(xpath="//select[@id='AccountFrm_country_id']")
	WebElement countrydropdown;
	
	@FindBy(xpath="//div[@class='registerbox form-horizontal ']//div[5]//div[1]//select")
	WebElement statedropdownbtn;
	
	@FindBy(xpath="//input[@id='AccountFrm_newsletter0']")
	WebElement subscribebtn;
	
	@FindBy(xpath="//input[@id='AccountFrm_agree']")
	WebElement agreebtn;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continuebtn;
	
	
	public void firstnameclk(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
	 firstnameclk.sendKeys(data.get(0).get(1));
	}
	public void lastnameclk(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		lastnameclk.sendKeys(data.get(1).get(1));
	}
	public void emailclk(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		emailclk.sendKeys(data.get(2).get(1));
		
	}
	public void address1clk(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		address1clk.sendKeys(data.get(3).get(1));
	}
	public void cityclk(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		cityclk.sendKeys(data.get(4).get(1));
	}
	public void pincode(DataTable datatable)
	{
		List<List<String>>data=datatable.asLists(String.class);
		pincode.sendKeys(data.get(5).get(1));
	}
	public void username(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		username.sendKeys(data.get(6).get(1));
	}
	public void password(DataTable datatable) 
	{
		List<List<String>>data=datatable.asLists(String.class);
		password.sendKeys(data.get(7).get(1));
	}
	public void cnfrmpassword(DataTable datatable)
	{
		List<List<String>>data=datatable.asLists(String.class);
		cnfrmpassword.sendKeys(data.get(8).get(1));
	}
	public void countrydropdown() throws InterruptedException 
	{
		Select s=new Select(countrydropdown);
		s.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void statedropdown()
	{
		/*WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(statedropdownbtn));*/
		Select s=new Select(statedropdownbtn);
		s.selectByVisibleText("Andhra Pradesh");
	}
	
	public void subscribebtn() 
	{
		subscribebtn.click();
	}
	public void agreebtn() 
	{
		agreebtn.click();
    }
	
	public void continuebtn() 
	{
		continuebtn.click();
	}
	public void accountbtnclk() 
	{
		List<WebElement> options1=driver.findElements(By.xpath("//ul[@id='main_menu_top']//span[contains(@class,'menu_text')][normalize-space()='Account']]"));
		System.out.println(options1);
		for(int i=0; i<options1.size();i++)
			if(options1.get(i).getText().equals("LOGOUT"))
			{
				options1.get(i).click();
				break;
			}
	}
}
