package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paymentspage extends Baseclass {

	public Paymentspage(WebDriver driver) {
		
		super(driver);
	}

	@FindBy(xpath="//td[@class='align_left valign_top']//a[contains(text(),'Men+Care Active Clean Shower Tool')]")
	WebElement orderitem;
	
	@FindBy(xpath="//a[@class='checkout_heading']")
	WebElement cartitem;
	
	@FindBy(xpath="//b[normalize-space()='$6.00']")
	WebElement orderprice;
	
	@FindBy(xpath="(//td[contains(text(),'$6.00')])[2]")
	WebElement cartprice;
	
	public String orderitem() {
		
		String nameorderitem= orderitem.getText();
		
		return nameorderitem;		
	}
	
	public String cartitem()
	{
		String namecartitem= cartitem.getText();
		return namecartitem;
	}
	
	public String orderprice()
	{
		String ordervalue= orderprice.getText();
		return ordervalue;
	}
	public String cartprice()
	{
		String cartvalue=cartprice.getText();
		return cartvalue;
	}
	
	
}
