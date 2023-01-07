package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class Login extends Base {
	
	
	public Login() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement txt_btn;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[2]/img")
	WebElement txt_log;
	
	//img[@alt='orangehrm-logo']
	//*[@id="app"]/div[1]/div/div[2]/img
	
	
	public  Homepage setuser(String us,String psw) {
		txt_username.sendKeys(us);
		txt_password.sendKeys(psw);
		txt_btn.click();
		return new Homepage();
		}
	public boolean verifylog() {
	return	txt_log.isDisplayed();
	}
	
	
	public String veriftitle() {
	return	driver.getTitle();
	}
	

}

