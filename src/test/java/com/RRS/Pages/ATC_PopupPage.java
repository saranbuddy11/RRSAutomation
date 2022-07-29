package com.RRS.Pages;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ATC_PopupPage extends PageObject {
	CommonPage CommonPage = new CommonPage();
	PDPPage pdpPage = new PDPPage();

	@Steps
	SDDLPPage sddlpPage;

	public static Logger log = LogManager.getLogger(ATC_PopupPage.class);

	@FindBy(xpath = "//a[normalize-space()='View cart']")
	WebElementFacade A2CPP_ViewCart_Btn;

	@FindBy(xpath = "//div[contains(@class,'mini-cart-body-item-price')]/span[contains(@class,'price-original')]")
	WebElementFacade A2CPP_OriginalPrice_lbl;

	@FindBy(xpath = "//div[contains(@class,'mini-cart-body-item-price')]/span[contains(@class,'price-vip')]")
	// @FindBy(xpath="/html[1]/body[1]/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
	WebElementFacade A2CPP_VIPPrice_lbl;

	@FindBy(xpath = "//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade Order_Summary_lbl;

	@FindBy(css = "div.product-wrapper-info-price--OObPj")
	WebElementFacade productPrice;

	@FindBy(css = "h4.mini-cart-body-item-title--3deJ1")
	WebElementFacade popUpTitle;

	@FindBy(css = "div.mini-cart-body-item-price--38NjR>span.price-original--1VaFr")
	WebElementFacade atcPrice;

	@FindBy(css = "div.mini-cart-body-item-image---LkK0>div>img")
	WebElementFacade atcImage;

	@FindBy(css = "h4.mini-cart-body-item-count-value--6kJu9")
	WebElementFacade atcQty;

	@FindBy(css = "a.mini-cart-body-summary-btn-check-out--2Zd3y")
	WebElementFacade checkOutBtn;

	@FindBy(css = "p.mini-cart-body-item-name--1-YxY")
	List<WebElementFacade> skus;

	@FindBy(css = "label.shipment-tab--2GJ_Q")
	List<WebElementFacade> shipment;

	@FindBy(css = "p>a[role='button']")
	WebElementFacade storeLink;

	@FindBy(css = "h2.modal-header--25YKh")
	WebElementFacade modalHeader;

	@FindBy(css = "input[placeholder*='Search by Zip Code, City and State']")
	WebElementFacade searchInput;

	@FindBy(css = "div.col-md-8--1ENvw+button.btn--1PWSW")
	WebElementFacade selectStore;

	@FindBy(css = "h5+p.tag_p--3xrVF")
	List<WebElementFacade> pickingPlace;

	@Step
	public void clickViewCartBtn_A2CPopUp() throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Order_Summary_lbl.shouldBeVisible();
	}

	@Step
	public void assertSizeVariantDisplayedIsCorrect(String SizeVariant) throws InterruptedException {
		String DynamicElement = "//p[normalize-space()='Size " + SizeVariant + "']";
		WebElement ele = getDriver().findElement(By.xpath(DynamicElement));
		if (ele.isDisplayed()) {
			log.info("Correct Size variant Displayed in the Pop Up");
		} else {
			log.info("Correct Size variant NOT Displayed in the Pop Up");
		}
	}

	@Step
	public void assertColorVariantDisplayedIsCorrect(String ColorVariant) throws InterruptedException {
		String DynamicElement = "//p[normalize-space()='" + ColorVariant + "']";
		WebElement ele = getDriver().findElement(By.xpath(DynamicElement));
		if (ele.isDisplayed()) {
			log.info("Correct Color variant Displayed in the Pop Up");
		} else {
			log.info("Correct Color variant NOT Displayed in the Pop Up");
		}
	}

	@Step
	public String getVIPDisplayed_A2CPP() throws InterruptedException {
		String VIPDisplayed = A2CPP_VIPPrice_lbl.getText();
		log.info("VIP price Displayed: " + VIPDisplayed);
		String VIPDisplayed_No$ = VIPDisplayed.replace("$", "");
		log.info("VIP price without $: " + VIPDisplayed_No$);
		String VIPDisplayed_OnlyAmount = VIPDisplayed_No$.replace("VIP Price", "");
		log.info("VIP price Only Amount: " + VIPDisplayed_OnlyAmount);
		// float VIPDisplayed_float=CommonPage.convertStrFloat(VIPDisplayed_OnlyAmount);
		return VIPDisplayed_OnlyAmount;
	}

	@Step
	public String getMSRPDisplayed_A2CPP() throws InterruptedException {
		String MSRPDisplayed = A2CPP_OriginalPrice_lbl.getText();
		log.info("MSRP Displayed in Popup: " + MSRPDisplayed);
		String MSRPDisplayed_No$ = MSRPDisplayed.replace("$", "");
		log.info("MSRP without $: " + MSRPDisplayed_No$);
		// float MSRPDisplayed_float=CommonPage.convertStrFloat(MSRPDisplayed_No$);
		return MSRPDisplayed_No$;
	}

	@Step
	public void assertA2CPopUPDisplayed() throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.shouldBeVisible();
	}

	@Step
	public List<String> verifyAddToCartPopup(List<List<String>> expectedData)
			throws AWTException, InterruptedException {
		List<String> actuals = new ArrayList<String>();
		Thread.sleep(5000);
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		actuals.add(s);
		s = productPrice.getText();
		actuals.add(s);
		a.moveToElement(pdpPage.variantColor.get(1)).perform();
		pdpPage.variantColor.get(1).click();
		s = pdpPage.variantTitle.get(0).getText();
		actuals.add(s);
		Assert.assertEquals(s, expectedData.get(0).get(3));
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		s = pdpPage.variantTitle.get(1).getText();
		actuals.add(s);
		Assert.assertEquals(s, expectedData.get(0).get(1));
		s = pdpPage.variantTitle.get(2).getText();
		actuals.add(s);
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		a.moveToElement(pdpPage.increaseQuantity).perform();
		pdpPage.increaseQuantity.click();
		s = pdpPage.quantity.getText();
		Assert.assertEquals(s, expectedData.get(0).get(5));
		a.moveToElement(pdpPage.decreaseQuantity).perform();
		pdpPage.decreaseQuantity.click();
		s = pdpPage.quantity.getText();
		actuals.add(s);
		Assert.assertEquals(s, expectedData.get(0).get(4));
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		a.moveToElement(pdpPage.addToCartBtn).perform();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		return actuals;
	}

	@Step
	public String getTypeOfWidth(String actuals) {
		String width = null;
		switch (actuals) {
		case "Medium (Normal)":
			width = "B";
			break;
		case "Wide":
			width = "D";
			break;
		}
		return width;
	}

	@Step
	public void validateATCPopup(List<String> actuals) throws InterruptedException {
		Thread.sleep(5000);
		popUpTitle.shouldBeCurrentlyVisible();
		String value = popUpTitle.getText();
		Assert.assertEquals(value.toLowerCase(), actuals.get(0).toLowerCase());
		value = atcPrice.getText();
		Assert.assertEquals(value, actuals.get(1));
		value = skus.get(0).getText();
		Assert.assertEquals(value, actuals.get(2));
		value = skus.get(1).getText();
		Assert.assertTrue(value.contains(actuals.get(3)));
		value = skus.get(2).getText();
		String variant = getTypeOfWidth(actuals.get(4));
		Assert.assertTrue(value.contains(variant));
		atcImage.shouldBeCurrentlyVisible();
		variant = atcImage.getAttribute("alt");
		Assert.assertEquals(variant.toLowerCase(), actuals.get(0).toLowerCase());
		value = atcQty.getText();
		Assert.assertTrue(value.contains(actuals.get(5)));
		checkOutBtn.shouldBeCurrentlyVisible().isClickable();
	}

	@Step
	public void verifyPickupInStore(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(3).toLowerCase());
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		s = pdpPage.variantTitle.get(0).getText();
		Assert.assertEquals(s, expectedData.get(0).get(0));
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		s = pdpPage.variantTitle.get(1).getText();
		Assert.assertEquals(s, expectedData.get(0).get(1));
		s = pdpPage.variantTitle.get(2).getText();
		Assert.assertEquals(s, expectedData.get(0).get(2));
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		shipment.get(1).shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyPickupInStoreName(List<List<String>> expectedData) throws InterruptedException {
		shipment.get(1).click();
		storeLink.shouldBeCurrentlyVisible().isClickable();
		storeLink.click();
		Thread.sleep(3000);
		modalHeader.shouldBeCurrentlyVisible();
		searchInput.sendKeys(expectedData.get(0).get(0));
		Thread.sleep(3000);
		selectStore.click();
		Thread.sleep(3000);
		String s = pickingPlace.get(1).getText();
		Assert.assertTrue(s.contains(expectedData.get(0).get(1)));
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
	}
}
