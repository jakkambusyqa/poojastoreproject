package com.pageobjects.store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.poojastore.BaseClass;

public class Cart extends BaseClass {

	@FindBy (xpath="//div[@class='header-menu']//a[text()='Cart']")
	WebElement cart;
	
	@FindBy (xpath="//div[@class='checkout-methods']//a[@href='/Sales/CheckOut']")
	WebElement pay;
	
	@FindBy (xpath="//input[@value='12']")
	WebElement checkbox;
	
	
	@FindBy (xpath="//input[@value=' Proceed to Payment']")
	WebElement proceed;
	
	
	
	
	public Cart(){
		
		PageFactory.initElements(driver, this);
				
	}
	
	public Paymentpage ValidateCart() throws Throwable{
		
		cart.click();
		pay.click();
		checkbox.click();
		
		proceed.click();
		
		return new Paymentpage();
		
	}
	
	
	
}
