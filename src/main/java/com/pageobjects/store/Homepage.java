package com.pageobjects.store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.poojastore.BaseClass;

public class Homepage extends BaseClass {

	@FindBy(xpath = "//ul[@class='menu sf-js-enabled sf-arrows']//a[@href='/Home/ProductsList?catDetail=2,0']")
	WebElement mouse;

	@FindBy(xpath = "//ul[@class='menu sf-js-enabled sf-arrows']//a[text()='new service']")
	WebElement services;

	@FindBy(xpath = "(//img[@src='/ProductImages/213202351723SFYF.jpg'])[1]")
	WebElement imageclick;

	@FindBy(id = "view")
	WebElement viewcart;

	@FindBy(xpath = "//a[@class='btn btn-block btn-dark']")
	WebElement proceed;

	@FindBy(id = "fullname")
	WebElement name;

	@FindBy(id = "landmark")
	WebElement landmark;

	@FindBy(id = "address1")
	WebElement address1;

	@FindBy(id = "address2")
	WebElement address2;

	@FindBy(id = "street")
	WebElement street;

	@FindBy(id = "zipcode")
	WebElement pincode;

	@FindBy(xpath = "//input[@value=' Save ']")
	WebElement save;

	// @FindBy (xpath="//input[@value='12']")
	// WebElement check;

	@FindBy(xpath = "//input[@value=' Proceed to Payment']")
	WebElement complete;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public Addaddresspage validateProductbuy(String fullname, String mark, String add1, String add2, String strt,
			String zip) throws Throwable {

		Thread.sleep(5000);

		Actions ac = new Actions(driver);
		ac.moveToElement(mouse).perform();

		services.click();
		imageclick.click();
		viewcart.click();
		proceed.click();

		name.sendKeys(fullname);
		landmark.sendKeys(mark);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		street.sendKeys(strt);
		pincode.sendKeys(zip);
		// driver.navigate().refresh();
		save.click();

		// Thread.sleep(3000);

		// check.click();

		// Thread.sleep(5000);
		// JavascriptExecutor jsp=(JavascriptExecutor)driver;
		// jsp.executeScript("arguments[0].click()", checkbox);

		// WebDriverWait mywait = new WebDriverWait(driver, 15);
		// WebElement element =
		// mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='12']")));
		// element.click();

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click()", complete);

		return new Addaddresspage();

	}

}
