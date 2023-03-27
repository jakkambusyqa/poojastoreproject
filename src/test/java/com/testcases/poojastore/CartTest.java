package com.testcases.poojastore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.Cart;
import com.pageobjects.store.Loginpage;

public class CartTest extends BaseClass {

	static Loginpage login;
	static Cart crt;
	
	public CartTest(){
		
		super();
	}
	
	@BeforeMethod
	
	public void setup() throws Throwable{
		
		initialize();
		login = new Loginpage();
		login.Validatelogin();
		
		crt=new Cart();
		
		
	}
	
	@Test 
	
	public void cartfuntionality() throws Throwable{
		
		crt.ValidateCart();
		
	}
	
	@AfterMethod
	
	public void teardown(){
		driver.close();
						
	}
				
}
