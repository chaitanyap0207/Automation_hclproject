package pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends Baseclass{

	public Addtocartpage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-cart-plus fa-fw']")
	WebElement addcartbtn;
	@FindBy(xpath="//span[@class='bgnone']")
	WebElement productnamebtn;
	public void addcartbtn() 
	{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addcartbtn);
		addcartbtn.click();
	}
	
	
	

}
