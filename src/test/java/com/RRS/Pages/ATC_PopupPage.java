package com.RRS.Pages;

import java.awt.AWTException;
import java.text.DecimalFormat;
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
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ATC_PopupPage extends PageObject {
	CommonPage CommonPage = new CommonPage();
	PDPPage pdpPage = new PDPPage();
	PLPPage plpPage = new PLPPage();
	loginPage loginPage = new loginPage();

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
	List<WebElementFacade> selectStore;

	@FindBy(css = "div.price-striked--3WXpF")
	WebElementFacade strikedPrice;

	@FindBy(css = "div.pdp-sale--ImILa")
	WebElementFacade salePrice;

	@FindBy(css = "div.pdp--2QsMa>div")
	WebElementFacade price;

	@FindBy(css = "a.mini-cart-body-summary-btn-cart--1rEBK")
	WebElementFacade viewCart;

	@FindBy(css = "a.mini-cart-body-summary-btn-check-out--2Zd3y")
	WebElementFacade checkOut;

	@FindBy(css = "div.vip-saving--2Iz-W")
	WebElementFacade vipSection;

	@FindBy(css = "h5+p.tag_p--3xrVF")
	List<WebElementFacade> pickingPlace;

	@FindBy(css = "p.line-item--1TTzZp")
	List<WebElementFacade> lineItem;

	@FindBy(css = "h5.line-item--1TTzZh5")
	List<WebElementFacade> vipTotal;

	@FindBy(css = "div.vip-saving-line-item-savings--3_SWg")
	WebElementFacade vipSavingLineItem;

	@FindBy(css = "div.flex-row--D783L>h2.tag_h2--2y8Ae")
	WebElementFacade cartPageHeader;

	@FindBy(css = "button.size-nosize--1XIJ7")
	WebElementFacade guestButton;

	@FindBy(css = "button.size-small--1zlxo")
	WebElementFacade loginButton;

	@FindBy(css = "button.size-medium--g_ADd")
	WebElementFacade vipMembershipBtn;

	@FindBy(css = "h5.section-header--5qMwu")
	List<WebElementFacade> sectionHeader;

	@FindBy(css = "div.mini-cart-body-toggle--2VTtF>p.tag_p--3xrVF>strong")
	WebElementFacade rewardsSection;

	@FindBy(css = "div.mini-cart-body-toggle--2VTtF>div>label.toggle-switch--d50wQ")
	WebElementFacade atcToggleSwitch;

	@FindBy(css = "p.mini-cart-body-summary-vip-reward--30drd>span")
	WebElementFacade rewardsCash;

	@FindBy(css = "h4.mini-cart-body-item-title--3deJ1")
	List<WebElementFacade> title;

	@FindBy(css = "p.line-item--1TTzZp")
	List<WebElementFacade> summary;

	@FindBy(css = "p+small.tag_small--3bmao")
	WebElementFacade skuId;

	@FindBy(css = "div.col-sm-7--1jA8A>h2.tag_h2--2y8Ae")
	WebElementFacade inventoryMessage;

	@FindBy(css = "div.cart-item-info-price--3CpSA>span.price-original--1VaFr")
	WebElementFacade msrPrice;

	@FindBy(css = "h4.cart-item-info-name--2Y01F")
	WebElementFacade productName;

	@FindBy(css = "p.cart-item-info-details--3ETm5")
	List<WebElementFacade> itemDetails;

	@FindBy(css = "span.price-vip-red--3PRtb")
	List<WebElementFacade> vipPrice;

	@FindBy(css = "div.order-summary--CpaK4>h3.tag_h3--2baIm")
	WebElementFacade orderSummary;

	@FindBy(css = "div.order-summary--CpaK4>div.line-item--1TTzZ>p")
	List<WebElementFacade> orderSubtotal;

	@FindBy(css = "h4.line-item--1TTzZh4")
	List<WebElementFacade> estimatedTotal;

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
		Thread.sleep(5000);
		pdpPage.variantSize.get(2).waitUntilVisible();
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
		Thread.sleep(5000);
		selectStore.get(0).click();
		Thread.sleep(3000);
		String s = pickingPlace.get(1).getText();
		Assert.assertTrue(s.contains(expectedData.get(0).get(1)));
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
	}

	@Step
	public List<String> readQuantityAndPrice(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		List<String> data = new ArrayList<String>();
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(3).toLowerCase());
		strikedPrice.shouldBeCurrentlyVisible();
		s = strikedPrice.getText();
		data.add(s);
		salePrice.shouldBeCurrentlyVisible();
		s = salePrice.getText();
		data.add(s);
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		CommonPage.pageScrollDown();
		s = pdpPage.quantity.getText();
		data.add(s);
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		return data;
	}

	@Step
	public List<String> readProductPriceAndItsQuantity(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		List<String> data = new ArrayList<String>();
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(3).toLowerCase());
		strikedPrice.shouldBeCurrentlyVisible();
		s = strikedPrice.getText();
		data.add(s);
		salePrice.shouldBeCurrentlyVisible();
		s = salePrice.getText();
		data.add(s);
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		a.moveToElement(pdpPage.increaseQuantity).perform();
		pdpPage.increaseQuantity.click();
		s = pdpPage.quantity.getText();
		data.add(s);
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		return data;
	}

	@Step
	public void choosingSkuAndNavigateToAtc(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(3).toLowerCase());
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		viewCart.shouldBeCurrentlyVisible().isClickable();
		viewCart.click();
	}

	@Step
	public List<String> choosingSkuAndNavigateToAtcForBrand(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		List<String> data = new ArrayList<String>();
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(2).toLowerCase());
		s = price.getText();
		data.add(s);
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		s = pdpPage.quantity.getText();
		data.add(s);
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		return data;
	}

	@Step
	public void choosingSkuAndNavigateToAtcToVerifyCheckOutButton(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		String s = sddlpPage.productTitle.getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(3).toLowerCase());
		a.moveToElement(pdpPage.variantColor.get(0)).perform();
		pdpPage.variantColor.get(0).click();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		checkOut.shouldBeCurrentlyVisible().isClickable();
		checkOut.click();
	}

	@Step
	public void verifyViewCartPage(String value) throws InterruptedException {
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		vipSection.shouldBeCurrentlyVisible();
		vipSavingLineItem.isPresent();
		cartPageHeader.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyCheckOutPage(String value) throws InterruptedException {
		Thread.sleep(10000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		Thread.sleep(5000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		guestButton.shouldBeCurrentlyVisible().isClickable();
		for (int i = 0; i < sectionHeader.size(); i++) {
			sectionHeader.get(i).shouldBeCurrentlyVisible();
		}
		loginPage.Enter_EmailAddress.isDisplayed();
		loginPage.Enter_Password.isDisplayed();
		loginButton.shouldBeCurrentlyVisible().isClickable();
		plpPage.emailCapturePopUp.isDisplayed();
		vipMembershipBtn.shouldBeCurrentlyVisible().isClickable();
	}

	@Step
	public void verifyPriceAndQuantity(List<String> data) throws InterruptedException {
		Thread.sleep(5000);
		popUpTitle.shouldBeCurrentlyVisible();
		String s = lineItem.get(0).getText();
		Assert.assertTrue(s.contains(data.get(2)));
		s = lineItem.get(1).getText();
		Assert.assertTrue(data.get(1).contains(s));
	}

	@Step
	public void verifyQuantityAndPriceCalculation(List<String> data) throws InterruptedException {
		Thread.sleep(5000);
		popUpTitle.shouldBeCurrentlyVisible();
		String s = lineItem.get(0).getText();
		Assert.assertTrue(s.contains(data.get(2)));
		s = lineItem.get(1).getText();
		s = s.replace("$", "");
		String price = data.get(1).substring(7);
		Double salePrice = Double.parseDouble(price) * Double.parseDouble(data.get(2));
		Assert.assertTrue(Double.parseDouble(s) == salePrice);
	}

	@Step
	public void verifyVipPriceInCartSummarySection(List<List<String>> expectedData) throws InterruptedException {
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		vipSection.shouldBeCurrentlyVisible();
		vipSavingLineItem.isPresent();
		List<WebElement> element = vipSavingLineItem.findElements(By.cssSelector("p.line-item--1TTzZp"));
		String s = element.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), s.toLowerCase());
		s = element.get(1).getText();
		Assert.assertTrue(s.charAt(0) == expectedData.get(0).get(2).charAt(0));
	}

	@Step
	public void verifyVipTotalAndPriceInCartSummarySection(String expectedData) throws InterruptedException {
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData);
		vipSection.shouldBeCurrentlyVisible();
		vipSavingLineItem.isPresent();
		for (int i = 0; i < lineItem.size(); i++) {
			lineItem.get(i).shouldBeCurrentlyVisible();
		}
		vipTotal.get(0).shouldBeCurrentlyVisible();
		vipTotal.get(1).shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyVipTotalAndPriceCalculationInCartSummarySection(String expectedData, List<String> data)
			throws InterruptedException {
		String s = "";
		List<Double> prices = new ArrayList<Double>();
		viewCart.shouldBeCurrentlyVisible();
		viewCart.click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData);
		vipSection.shouldBeCurrentlyVisible();
		vipSavingLineItem.isPresent();
		s = lineItem.get(1).getText();
		Assert.assertEquals(s, lineItem.get(7).getText());
		s = s.replace("$", "");
		String price = data.get(1).substring(7);
		prices.add(Double.parseDouble(price) * Double.parseDouble(data.get(2)));
		Assert.assertTrue(Double.parseDouble(s) == prices.get(0));
		s = lineItem.get(3).getText();
		s = s.replace("$", "");
		prices.add(Double.parseDouble(s));
		s = lineItem.get(5).getText();
		s = s.replace("$", "");
		s = s.replace("-", "");
		prices.add(Double.parseDouble(s));
		Double total = (prices.get(0) + prices.get(1)) - prices.get(2);
		double d = total.doubleValue();
		DecimalFormat df = new DecimalFormat("###.##");
		df.format(d);
		price = vipTotal.get(1).getText();
		price = price.replace("$", "");
		Assert.assertTrue(Double.parseDouble(price) == Double.parseDouble(df.format(d)));
	}

	@Step
	public void verifyVipRewardsCashCalculation(List<String> actuals) throws InterruptedException {
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
		value = rewardsSection.getText();
		value = value.replaceAll("[^0-9.]", "");
		Double actualReward = Double.parseDouble(value);
		String price = actuals.get(1).replace("$", "");
		DecimalFormat df = new DecimalFormat("###.##");
		Double d = Double.parseDouble(price);
		Double vipPrice = (d * 0.2);
		vipPrice = d - vipPrice;
		vipPrice = (vipPrice * 0.1);
		Assert.assertTrue(Double.parseDouble(df.format(actualReward)) == Double.parseDouble(df.format(vipPrice)));
	}

	@Step
	public void verifyAtcToggleVipRewardsCashCalculation(List<String> actuals) throws InterruptedException {
		Thread.sleep(5000);
		popUpTitle.shouldBeCurrentlyVisible();
		String value = atcPrice.getText();
		Assert.assertEquals(value, actuals.get(0));
		atcImage.shouldBeCurrentlyVisible();
		value = atcQty.getText();
		Assert.assertTrue(value.contains(actuals.get(1)));
		checkOutBtn.shouldBeCurrentlyVisible().isClickable();
		atcToggleSwitch.shouldBeCurrentlyVisible().isClickable();
		List<WebElement> toggle = atcToggleSwitch.findElements(By.tagName("span"));
		toggle.get(0).click();
		Thread.sleep(5000);
		title.get(1).shouldBeCurrentlyVisible();
		value = rewardsCash.getText();
		value = value.replace("$", "");
		Double actualReward = Double.parseDouble(value);
		String price = actuals.get(0).replace("$", "");
		DecimalFormat df = new DecimalFormat("###.##");
		Double d = Double.parseDouble(price);
		Double vipPrice = (d * 0.2);
		vipPrice = d - vipPrice;
		vipPrice = (vipPrice * 0.1);
		Assert.assertTrue(Double.parseDouble(df.format(actualReward)) == Double.parseDouble(df.format(vipPrice)));
		d = d - (d * .2);
		Double vip = d + 1.99;
		price = summary.get(3).getText().replace("$", "");
		Double vipTotal = Double.parseDouble(price);
		Assert.assertTrue(Double.parseDouble(df.format(vip)) == Double.parseDouble(df.format(vipTotal)));
	}

	@Step
	public void verifyViewCartPageAndItems(String value, List<String> expectedData) throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Order_Summary_lbl.shouldBeVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		vipSection.shouldBeCurrentlyVisible();
		cartPageHeader.shouldBeCurrentlyVisible();
		String s = cartPageHeader.getText();
		Assert.assertTrue(s.contains("("));
		Assert.assertTrue(s.contains(")"));
		s = s.replaceAll("[^0-9.]", "");
		Assert.assertEquals(s, expectedData.get(5));
	}

	@Step
	public void verifyViewCartPageAndContent(String value, List<String> expectedData) throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		String s = expectedData.get(0).substring(18);
		s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		String locator = "img[alt*='" + s + "']";
		WebElement element = getDriver().findElement(By.cssSelector(locator));
		element.isDisplayed();
		Actions a = new Actions(getDriver());
		a.moveToElement(skuId).perform();
		skuId.shouldBeCurrentlyVisible();
		for (int i = 0; i < itemDetails.size(); i++) {
			itemDetails.get(i).shouldBeCurrentlyVisible();
		}
		inventoryMessage.shouldBeCurrentlyVisible();
		msrPrice.shouldBeCurrentlyVisible();
		vipPrice.get(1).shouldBeCurrentlyVisible();
		Assert.assertTrue(msrPrice.getText().contains("$"));
		Assert.assertTrue(vipPrice.get(1).getText().contains("$"));
	}

	@Step
	public void verifyViewCartPageAndProduct(String value, List<String> expectedData) throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		productName.shouldBeCurrentlyVisible().isClickable();
		String s = productName.getText().toLowerCase();
		Assert.assertEquals(s, expectedData.get(0).toLowerCase());
		productName.click();
		Thread.sleep(5000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		s = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertEquals(s, expectedData.get(0).toLowerCase());
	}

	@Step
	public void verifyViewCartPageAndOrderSubtotal(String value, List<String> expectedData)
			throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		productName.shouldBeCurrentlyVisible().isClickable();
		String s = productName.getText().toLowerCase();
		Assert.assertEquals(s, expectedData.get(0).toLowerCase());
		orderSummary.shouldBeCurrentlyVisible();
		for (int i = 0; i < orderSubtotal.size(); i++) {
			orderSubtotal.get(i).shouldBeCurrentlyVisible();
			estimatedTotal.get(i).shouldBeCurrentlyVisible();
		}
		String total = orderSubtotal.get(1).getText();
		Assert.assertEquals(total, expectedData.get(1));
		total = estimatedTotal.get(1).getText();
		Assert.assertEquals(total, expectedData.get(1));
	}
}
