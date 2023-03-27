package com.testcases.poojastore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.Addaddresspage;
import com.pageobjects.store.Homepage;
import com.pageobjects.store.Loginpage;

public class ProductBuy extends BaseClass {

	static Loginpage login;
	static Homepage homepage;
	static Addaddresspage addaddress;
	String sheetname = "Sheet1";

	public ProductBuy() {

		super();

	}

	@BeforeMethod

	public void Setup() throws Throwable {

		initialize();
		login = new Loginpage();
		login.Validatelogin();
		homepage = new Homepage();
		addaddress = new Addaddresspage();
	}

	@DataProvider

	public Object[][] getpoojastoredata() {
		Object data[][] = com.utils.poojastore.Utils.getExcelData(sheetname);

		return data;
	}

	@Test(priority = 1, dataProvider = "getpoojastoredata")

	public void vaidatebuyfeature(String FullName, String Landmark, String Address1, String Address2, String Street,
			String postcode) throws Throwable {

		homepage.validateProductbuy(FullName, Landmark, Address1, Address2, Street, postcode);

	}

	@BeforeMethod

	public void teardown() {

		driver.close();

	}

}
