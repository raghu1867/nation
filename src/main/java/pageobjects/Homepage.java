package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class Homepage extends Base {
	
	public Homepage() {
	
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath = "//*[@alt='client brand banner']")
	WebElement txt_imag;
	@FindBy(xpath = "//*[@class='oxd-main-menu-item active']")
	WebElement txt_leave;
	
	
	public boolean verifyimg() {
		return txt_imag.isDisplayed();
	}
	public void clickleav() {
		txt_leave.click();
	}
	
	
	
	
	

}
