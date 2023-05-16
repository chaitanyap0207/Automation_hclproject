package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productselectionpage extends Baseclass {

	public Productselectionpage(WebDriver driver) {
		super(driver);
		
	}
		@FindBy(xpath="//div[contains(@class,'fixed_wrapper')]//a[contains(@title,'Men+Care Active Clean Shower Tool')]")
		WebElement creambtn;
		
		
		public void creambtn() 
		{
			
			creambtn.click();
			
		}
	
		public String title() {
			String title= creambtn.getText();
			return title;
		}
		
		
	}
	

