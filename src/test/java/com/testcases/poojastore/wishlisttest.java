package com.testcases.poojastore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.BuyFromwhishlist;
import com.pageobjects.store.Loginpage;

public class wishlisttest extends BaseClass {

	static Loginpage login;
	static BuyFromwhishlist wish;

	public wishlisttest() {

		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {
		initialize();

		login = new Loginpage();
		login.Validatelogin();

		wish = new BuyFromwhishlist();

	}

	@Test

	public void wishlisttst() throws Throwable {

		wish.ValidateWishlistbuy();

	}

	@AfterMethod

	public void teardown() {

		 driver.close();

	}
}
