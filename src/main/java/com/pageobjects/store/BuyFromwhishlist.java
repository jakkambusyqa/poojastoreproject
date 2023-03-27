package com.pageobjects.store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.poojastore.BaseClass;

public class BuyFromwhishlist extends BaseClass {

	@FindBy(name = "type")
	WebElement search;

	@FindBy(xpath = "//button[@title='Search']")
	WebElement Enter;

	@FindBy(xpath = "//div[@class='product-action']//a[@href='/Home/ProductDetails?id=117']")
	WebElement Pro;

	@FindBy(xpath = "//a[@title='Add to Wishlist']//i[@class='icon-wishlist-2']")
	WebElement add;

	@FindBy(xpath = "//div[@class='d-xl-heart']")
	WebElement browse;

	@FindBy(xpath = "//button[@class='btn btn-dark btn-shop']")
	WebElement cart;

	// @FindBy (xpath="//div[@class='header-menu']//a[text()='Cart']")
	// WebElement buy;
	//
	@FindBy(xpath = "//a[@href='/Sales/Cart?id=25']")
	WebElement buy2;

	@FindBy(xpath = "//div[@class='checkout-methods']//a[@href='/Sales/CheckOut']")
	WebElement fin;

	@FindBy(xpath = "//input[@type='radio']")
	WebElement check;

	@FindBy(xpath = "//div[@class='col-md-12']//input[@class='btn btn-dark btn-place-order']")
	WebElement last;

	public BuyFromwhishlist() {

		PageFactory.initElements(driver, this);

	}

	public void ValidateWishlistbuy() throws InterruptedException {

		search.click();
		search.sendKeys("coco");
		Enter.click();
		Pro.click();
		add.click();
		browse.click();
		cart.click();
		// buy.click();
		driver.navigate().refresh();

		WebDriverWait mywait = new WebDriverWait(driver, 10);

		WebElement element = mywait.until(ExpectedConditions.elementToBeClickable(buy2));
		element.click();

		fin.click();
		check.click();
		last.click();
	}

}
