package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Baseclass {


	public Checkoutpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@id='cart_checkout1']")
	WebElement checkoutbtn;
	
	public void checkoutbtn() 
	{
		checkoutbtn.click();
	}
	
	
}
