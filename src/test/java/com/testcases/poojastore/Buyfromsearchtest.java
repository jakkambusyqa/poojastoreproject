package com.testcases.poojastore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.Loginpage;
import com.pageobjects.store.Search;

public class Buyfromsearchtest extends BaseClass {

	static Loginpage login;
	static Search srch;

	public Buyfromsearchtest() {

		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {

		initialize();
		login = new Loginpage();
		login.Validatelogin();

		srch = new Search();
	}

	@Test
	public void validatebuyfromsearch() throws Throwable {

		srch.Validatesearch();

	}

	@AfterMethod

	public void teardown() {
    driver.close();
	}
}
