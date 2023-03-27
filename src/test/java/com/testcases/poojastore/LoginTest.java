package com.testcases.poojastore;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.CutomerLOginpage;
import com.pageobjects.store.Homepage;
import com.pageobjects.store.Loginpage;

public class LoginTest extends BaseClass {

	static Loginpage login;
	static Homepage homepage;
    static CutomerLOginpage loginpage;
	
	public LoginTest() {
		super();

	}

	@BeforeMethod

	public void setup() throws Throwable {

		initialize();
		login = new Loginpage();
		homepage = new Homepage();
		loginpage=new CutomerLOginpage();
	}

	@Test(priority = 1)

	public void VerifyLoginFunctionality() {
		homepage = login.Validatelogin();

	}

	@Test(priority = 2)

	public void verifyTitle() {

		String title = login.Titletest();

		Assert.assertEquals(title, "Divine Precincts");

	}
	
	@Test(priority=3)
	
	public void Logoutfuntionality(){
		
		 login.Validatelogout();
		
	}

	@AfterMethod

	public void teardown() {
		driver.close();

	}

}
