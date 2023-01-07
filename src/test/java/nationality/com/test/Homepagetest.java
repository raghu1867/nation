package nationality.com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Base;
import pageobjects.Homepage;
import pageobjects.Login;

public class Homepagetest extends Base {

	public static Login loginhrm;
	public static Homepage hp;

	public Homepagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		inslization();
		loginhrm = new Login();
		hp = new Homepage();

	}

	@Test
	public void validate() {
		boolean flag = hp.verifyimg();
		Assert.assertTrue(flag);
	}

	@Test
	public void validleav() {
		hp.clickleav();
	}

}
