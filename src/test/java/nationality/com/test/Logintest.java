package nationality.com.test;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Base;
import pageobjects.Homepage;
import pageobjects.Login;

public class Logintest extends Base {
	public static Login loginhrm;
	public static Homepage hp;

	public Logintest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		inslization();
		loginhrm = new Login();

	}

	@Test(priority = 3)
	public void validatetitle() {
		String title = loginhrm.veriftitle();
		Assert.assertEquals(title, "OrangeHRM");

	}

	@Test(priority = 2)
	public void validalog() {
		boolean flag = loginhrm.verifylog();
		Assert.assertTrue(flag);

	}

	@Test(priority = 1)
	public void validate() {
		hp = loginhrm.setuser(prop.getProperty("Username"), prop.getProperty("Password"));

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
