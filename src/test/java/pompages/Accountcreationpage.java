package pompages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountcreationpage extends Baseclass{

	public Accountcreationpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continueclickbtn;
	
	public void continueclickbtn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueclickbtn);
		continueclickbtn.click();
	}
	
	
	
	
}
