package com.pageobjects.store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.poojastore.BaseClass;

public class Search extends BaseClass {

	@FindBy(name = "type")
	WebElement search;
	
	@FindBy (xpath="//button[@title='Search']")
    WebElement Enter;
	
	@FindBy(xpath = "//a[@class='btn-icon btn-add-cart']")
	WebElement product;

	@FindBy(xpath = "//div[@class='product-action']//a[@href='/Sales/Cart']")
	WebElement cart;

	@FindBy(xpath = "//div[@class='checkout-methods']//a[@href='/Sales/CheckOut']")
	WebElement proceed;

	@FindBy(name = "Addre")
	WebElement checkbox;

	@FindBy(xpath = "//div[@class='col-md-12']//input[@class='btn btn-dark btn-place-order']")
	WebElement pay;

	public Search() {

		PageFactory.initElements(driver, this);

	}

	public Paymentpage Validatesearch() throws Throwable{
		
		search.click();
		search.sendKeys("coco");
		Enter.click();
		product.click();
		cart.click();
		proceed.click();
		checkbox.click();
		pay.click();
		
		return new Paymentpage();
		
	}
	
	
	
	
	
	
}