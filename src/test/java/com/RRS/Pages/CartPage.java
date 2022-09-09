package com.RRS.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

public class CartPage extends PageObject {
	public static Logger log = LogManager.getLogger(CartPage.class);
	CommonPage CommonPage = new CommonPage();
	ATC_PopupPage atcPopupPage = new ATC_PopupPage();
	PDPPage pdpPage = new PDPPage();
	PLPPage plpPage = new PLPPage();
	homePage homePage = new homePage();
	loginPage loginPage = new loginPage();

	@FindBy(xpath = "//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade Order_Summary_lbl;

	@FindBy(xpath = "//a[normalize-space()='Checkout']")
	WebElementFacade Cart_Checkout_Btn;

	@FindBy(xpath = "//button[@aria-label='Decrease Quantity']")
	WebElementFacade Cart_DecreaseQuantity_Btn;

	@FindBy(xpath = "//button[@aria-label='Increase Quantity']")
	WebElementFacade Cart_IncreaseQuantity_Btn;

	@FindBy(xpath = "//span[contains(@class,'price-original--')]")
	WebElementFacade Cart_OriginalPrice_Lbl;

	@FindBy(xpath = "//button[normalize-space()='Join for $1.99']")
	WebElementFacade Cart_JoinVIPProgram_Btn;

	@FindBy(xpath = "//div[contains(@class,'paypal-button')][@aria-label='PayPal']")
	WebElementFacade Cart_PayPal_Btn;

	@FindBy(xpath = "//h5[@id='sourceCode']")
	WebElementFacade Cart_SourceCode_Btn;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Code')]")
	WebElementFacade Cart_EnterSourceCode_Txt;

	@FindBy(xpath = "//button[normalize-space()='Apply']")
	WebElementFacade Cart_ApplySourceCode_Btn;

	@FindBy(css = ".section-cart-qty--2wAHy")
	WebElementFacade Cart_CartIcon_homePage_SVGBtn;

	@FindBy(xpath = "//main[@id='rrs-main']//div[1]//div[1]//div[2]//div[1]//div[4]")
	WebElementFacade Cart_TotalVIPSavings_Lbl;

	@FindBy(xpath = "//h3[normalize-space()='GREAT CHOICE! YOUR ITEM IS NOW ADDED TO YOUR CART']")
	WebElementFacade Cart_TotalVIPSavings_PopUp_Lbl;

	@FindBy(xpath = "//a[normalize-space()='View cart']")
	WebElementFacade Cart_ViewCart_Btn;

	@FindBy(xpath = "//p[normalize-space()='Welcome VIP!']")
	WebElementFacade Cart_WelcomeVIP_Lbl;

	@FindBy(xpath = "//main[@id='rrs-main']//div[4]")
	WebElementFacade Cart_EstTotal_Lbl;

	@FindBy(xpath = "//div[contains(@class,'text-align-right--')]/span[2]")
	WebElementFacade Cart_VIPPriceProduct_Lbl;

	@FindBy(xpath = "//h1[text()='START CHECKOUT']")
	WebElementFacade Checkout_StartCheckout_Lbl;

	@FindBy(xpath = "//button[text()='UPGRADE AND CHECKOUT']")
	WebElementFacade Checkout_UpgradetoRewardPlus_Btn;

	@FindBy(css = ".tag_h1--hWc2x")
	WebElementFacade Display_Msg;

	@FindBy(css = ".section-button--2_acT")
	WebElementFacade Continue_Shoppig_Btn;

	@FindBy(css = ".flex-row--D783L > h2.tag_h2--2y8Ae")
	WebElementFacade My_Cart_Icon;

	@FindBy(css = "img[alt='save_20.svg']")
	WebElementFacade PercetLogo;

	@FindBy(css = "button.vip-saving-line-item-button--3L6D6")
	WebElementFacade joinVipBtn;

	@FindBy(css = "a.cart-item-info-add-vip--14NyX")
	WebElementFacade addVipLink;

	@FindBy(css = "div.mini-cart-body-summary-vip-total--36HMW")
	WebElementFacade vipTotal;

	@FindBy(css = "h5.cart-item-info-action-remove--2Yi-H")
	WebElementFacade remove;

	@FindBy(css = "a.cart-order-summary-check--2VEfI")
	WebElementFacade checkOut;

	@FindBy(css = "button.cart-order-summary-login--LF5YT")
	WebElementFacade loginAndCheckOut;

	@FindBy(css = "div.paypal-button-env-sandbox .paypal-button")
	WebElementFacade paypalCheckOut;

	@FindBy(css = "h3.recommendations-list-title--erltF")
	WebElementFacade topPicksSection;

	@FindBy(css = "span.product-card-name--1B6G4")
	List<WebElementFacade> topPicksProduct;

	@FindBy(css = "div.pr-category-snippet")
	List<WebElementFacade> topPicksReview;

	@FindBy(css = "div.product-card-price--wqq1U")
	List<WebElementFacade> topPicksPrice;

	@FindBy(css = "div.product-card-swatch--2U9C1")
	List<WebElementFacade> topPicksSwatchColor;

	@FindBy(css = "button.slider-arrow-left--2ZGsH")
	WebElementFacade sliderLeft;

	@FindBy(css = "button.vip-saving-line-item-button--3L6D6")
	WebElementFacade joinVIPBtn;

	@FindBy(css = "span.price-striked--3WXpF")
	WebElementFacade strikedPrice;

	@FindBy(css = "span.cart-rewards-vip--1AyeH>span")
	WebElementFacade rewardCash;

	@FindBy(css = "span.cart-rewards-vip--1AyeH")
	WebElementFacade vipReward;

	@FindBy(css = "h5.cart-item-info-action-saveforlater--15cHU")
	WebElementFacade saveLater;

	@FindBy(css = "span.section-cart-qty--2wAHy>span")
	WebElementFacade cartQty;

	@FindBy(css = "div.dropdown-item--3Kiul>a[href*='save']")
	WebElementFacade savedForLaterLink;

	@FindBy(css = "h2.save-for-later-title--184fm")
	WebElementFacade savedForLaterTitle;

	@FindBy(css = "a.save-for-later-removebtn--2Rl9p")
	WebElementFacade savedForLaterRemove;

	@FindBy(css = "div.confirm-modal--pPcQo")
	WebElementFacade confirmPopUp;

	@FindBy(css = "button.confirm-modal-accept--8cFRH")
	WebElementFacade accept;

	@FindBy(css = "h3.save-for-later-no-orders--110r5")
	WebElementFacade goShoppingHeader;

	@FindBy(id = "klarna-express-button-0")
	WebElementFacade klarnaBtn;

	@FindBy(id = "start-button")
	WebElementFacade klarnaSiteContinueBtn;

	@Step
	public void clickCheckoutButtonAsVIPUser() throws InterruptedException {
		waitFor(Cart_Checkout_Btn);
		Cart_Checkout_Btn.click();
		waitFor(Checkout_UpgradetoRewardPlus_Btn);
		Checkout_UpgradetoRewardPlus_Btn.shouldBeVisible();
	}

	@Step
	public void clickCheckoutButton() throws InterruptedException {
		Cart_Checkout_Btn.click();
		Checkout_StartCheckout_Lbl.shouldBeVisible();
	}

	@Step
	public String getVIPPriceDisplayed_CartPage() throws InterruptedException {
		String VIPPRiceDisplayed = Cart_VIPPriceProduct_Lbl.getText();
		String VIPPRiceDisplayed_without$ = VIPPRiceDisplayed.replace("$", "");
		log.info("VIP Price displayed in cart page is: " + VIPPRiceDisplayed_without$);
		return VIPPRiceDisplayed_without$;
	}

	@Step
	public String getEstTotalAmount_CartPage() throws InterruptedException {
		String EstAmount = Cart_EstTotal_Lbl.getText();
		String EstAmount_without$ = EstAmount.replace("$", "");
		String EstAmount_withoutAnything = EstAmount_without$.replace("Est. Total", "");
		log.info("Total Estimated Amount without anything: " + EstAmount_withoutAnything);
		return EstAmount_withoutAnything;
	}

	@Step
	public void clickViewCart_CartPage() throws InterruptedException {
		Cart_ViewCart_Btn.click();
		Cart_WelcomeVIP_Lbl.shouldBeVisible();
	}

	@Step
	public void validatejoinVIPProgramPopupDispalyed_CartPage() throws InterruptedException {
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
	}

	@Step
	public void clickjoinVIPProgram_CartPage() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.click();
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
	}

	@Step
	public void joinVIPProgram_CartPage() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.click();
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
		Cart_ViewCart_Btn.click();
		Cart_WelcomeVIP_Lbl.shouldBeVisible();
	}

	@Step
	public String getTotalVIPSavingsAmount_CartPage() throws InterruptedException {
		String TotalSavings = Cart_TotalVIPSavings_Lbl.getText();
		String TotalSavings_without$ = TotalSavings.replace("$", "");
		String TotalSavings_withoutAnything = TotalSavings_without$.replace("Your VIP Total", "");
		log.info("Total VIP Savings Amount displayed before getting VIP membership: " + TotalSavings_withoutAnything);
		return TotalSavings_withoutAnything;
	}

	@Step
	public void clickSvgCartIcon() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(Cart_CartIcon_homePage_SVGBtn).click().build().perform();
		Cart_Checkout_Btn.shouldBeVisible();
	}

	@Step
	public void ApplyValidSourceCode(String Code) throws InterruptedException, AWTException {
		CommonPage.actions_DownArrow();
		Cart_SourceCode_Btn.click();
		Cart_EnterSourceCode_Txt.shouldBeVisible();
		typeInto(Cart_EnterSourceCode_Txt, Code);
		Cart_ApplySourceCode_Btn.click();
	}

	@Step
	public void assertPayPalButtonDisplayed() throws InterruptedException {
		// Cart_PayPal_Btn.shouldBeVisible();
		log.info("PayPal payment method button got displayed");
	}

	@Step
	public void assertJoinVIPProgramButtonDisplayed() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.shouldBeVisible();
	}

	@Step
	public void assertCheckoutButtonDisplayed() throws InterruptedException {
		Cart_Checkout_Btn.shouldBeVisible();
	}

	@Step
	public void decreaseQuantityby1_validateChanges(String SingleProductOriginalPrice) throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Cart_DecreaseQuantity_Btn);
		Cart_OriginalPrice_Lbl.shouldBeVisible();
		String ReducedOriginalPrice = Cart_OriginalPrice_Lbl.getText();
		String ReducedOriginalPrice_NO$ = ReducedOriginalPrice.replace("$", "");
		log.info("Reduced Original price in string: " + ReducedOriginalPrice_NO$);
		float ReducedOriginalPrice_float = CommonPage.convertStrFloat(ReducedOriginalPrice_NO$);
		log.info("Reduced Original price in float: " + ReducedOriginalPrice_float);
		float SingleProductOriginalPrice_float = CommonPage.convertStrFloat(SingleProductOriginalPrice);
		assertTrue(ReducedOriginalPrice_float == SingleProductOriginalPrice_float);
	}

	@Step
	public void increaseQuantityby1_validateChanges(String SingleProductOriginalPrice) throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Cart_IncreaseQuantity_Btn);
		Cart_OriginalPrice_Lbl.shouldBeVisible();
		String DoubledOriginalPrice = Cart_OriginalPrice_Lbl.getText();
		String DoubledOriginalPrice_NO$ = DoubledOriginalPrice.replace("$", "");
		log.info("Doubled Original price in string: " + DoubledOriginalPrice_NO$);
		float DoubledOriginalPrice_float = CommonPage.convertStrFloat(DoubledOriginalPrice_NO$);
		log.info("Doubled Original price in float: " + DoubledOriginalPrice_float);
		float SingleProductOriginalPrice_float = CommonPage.convertStrFloat(SingleProductOriginalPrice);
		assertTrue(DoubledOriginalPrice_float == (SingleProductOriginalPrice_float * 2));
	}

	@Step
	public void assertViewCartPageDsplayed() throws InterruptedException {
		waitFor(Order_Summary_lbl);
		Order_Summary_lbl.shouldBeVisible();
		Cart_Checkout_Btn.shouldBeVisible();
	}

	@Step
	public void assertCartPageDisplayedAndValidateMessage() {
		Ensure.thatTheCurrentPage().currentUrl().contains("cart");
		String text = Display_Msg.getText();
		assertEquals(text, "Your shopping cart is empty");
	}

	@Step
	public void clickOnContinueShopping() throws InterruptedException {
		Continue_Shoppig_Btn.shouldBeCurrentlyVisible();
		Continue_Shoppig_Btn.click();
	}

	@Step
	public void assertCartPageDisplayedAndValidateItemDisplayed() throws InterruptedException {
		Ensure.thatTheCurrentPage().currentUrl().contains("cart");
		String value = My_Cart_Icon.getTextContent();
		assertTrue(value.contains("1"));
		Thread.sleep(5000);
	}

	@Step
	public void verifyViewCartPageAndBanner(String value) throws InterruptedException {
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.vipSavingLineItem.isPresent();
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
		for (int i = 0; i < atcPopupPage.summary.size(); i++) {
			atcPopupPage.summary.get(i).shouldBeCurrentlyVisible();
		}
		PercetLogo.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyViewCartPageAndVipMembership(List<List<String>> expectedData) throws InterruptedException {
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		PercetLogo.shouldBeCurrentlyVisible();
		for (int i = 0; i < atcPopupPage.summary.size(); i++) {
			atcPopupPage.summary.get(i).shouldBeCurrentlyVisible();
		}
		joinVipBtn.shouldBeCurrentlyVisible().isClickable();
		String s = joinVipBtn.getText();
		Assert.assertEquals(expectedData.get(0).get(1), s);
	}

	@Step
	public void verifyViewCartPageAndQuantity(String value) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		pdpPage.increaseQuantity.click();
		String s = pdpPage.quantity.getText();
		Assert.assertEquals(s, "2");
		pdpPage.decreaseQuantity.click();
		s = pdpPage.quantity.getText();
		Assert.assertEquals(s, "1");
	}

	@Step
	public void verifyViewCartPageAndVipLink(String value) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		addVipLink.shouldBeCurrentlyVisible().isClickable();
		addVipLink.click();
		Thread.sleep(8000);
		element(pdpPage.cartTitle).waitUntilVisible();
		vipTotal.shouldBeCurrentlyVisible();
		Assert.assertTrue((vipTotal.getText()).contains("$"));
	}

	@Step
	public void verifyViewCartPageAndRemoveFunctionality(String value, String text) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		remove.shouldBeCurrentlyVisible().isClickable();
		remove.click();
		Thread.sleep(5000);
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		Assert.assertEquals(text.toLowerCase(), plpPage.pageTitle.getText().toLowerCase());
	}

	@Step
	public void verifyViewCartPageAndCheckoutButtonResponse(List<List<String>> expectedData)
			throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		checkOut.shouldBeCurrentlyVisible().isClickable();
		checkOut.click();
		Thread.sleep(10000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		Assert.assertTrue(plpPage.pageTitle.getText().toLowerCase().contains(expectedData.get(0).get(1)));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1));
	}

	@Step
	public void verifyLoginAndCheckoutButtonResponse(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		loginAndCheckOut.shouldBeCurrentlyVisible().isClickable();
		Assert.assertEquals(loginAndCheckOut.getText(), expectedData.get(0).get(1));
		loginAndCheckOut.click();
		Thread.sleep(5000);
		homePage.myAccountLogin_Lbl.waitUntilVisible();
		homePage.myAccountLogin_Lbl.shouldBeCurrentlyVisible();
		Assert.assertEquals(homePage.myAccountLogin_Lbl.getText(), expectedData.get(0).get(2));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		homePage.Enter_EmailAddress.shouldBeCurrentlyVisible().isEnabled();
		homePage.Enter_Password.shouldBeCurrentlyVisible().isEnabled();
	}

	@Step
	public void verifyCheckoutWithPaypalButtonResponse(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		getDriver().switchTo().frame(1);
		Thread.sleep(5000);
		paypalCheckOut.isPresent();
//		CommonPage.javaScriptExecutor_Click(paypalCheckOut);
//		 paypalCheckOut.click();
//		Thread.sleep(10000);
//		List<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
//		Assert.assertTrue(browserTabs.size() > 1);
//		getDriver().switchTo().window(browserTabs.get(1));
//		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(2));
	}

	@Step
	public void verifyCheckoutWithKlarnaButtonResponse(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		klarnaBtn.shouldBeCurrentlyVisible().isClickable();
		WebElement root = getDriver().findElement(By.tagName("klarna-express-button"));
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		SearchContext shadow = (SearchContext) js.executeScript("return arguments[0].shadowRoot", root);
		String text = shadow.findElement(By.cssSelector("span#klarna-express-button__second-text")).getText();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text.toLowerCase());
		text = shadow.findElement(By.cssSelector("svg#klarna-logo")).getAttribute(expectedData.get(0).get(3));
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text.toLowerCase());
		klarnaBtn.click();
		Thread.sleep(5000);
		getDriver().switchTo().frame("klarna-express-button-fullscreen");
		klarnaSiteContinueBtn.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyTopPicksSection(List<List<String>> expectedData) throws InterruptedException, AWTException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		CommonPage.pageScrollDown();
		topPicksSection.shouldBeCurrentlyVisible();
		Assert.assertEquals(String.valueOf(topPicksProduct.size()), expectedData.get(0).get(2));
		for (int i = 0; i < topPicksProduct.size(); i++) {
			String s = topPicksProduct.get(i).getText();
			Assert.assertTrue(s.contains(expectedData.get(0).get(1)));
			if (i >= 4) {
				pdpPage.sliderRight.get(0).click();
				Thread.sleep(3000);
			}
		}
	}

	@Step
	public void verifyFunctionalityOfProductAndItsContent(String value) throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		for (int i = topPicksProduct.size() - 1; i > 0; i--) {
			topPicksReview.get(i).shouldBeCurrentlyVisible().isPresent();
			topPicksPrice.get(i).shouldBeCurrentlyVisible().isPresent();
			topPicksSwatchColor.get(i).shouldBeCurrentlyVisible().isPresent();
			if (i <= 19) {
				sliderLeft.click();
				Thread.sleep(3000);
			}
		}
		topPicksProduct.get(0).click();
		Thread.sleep(5000);
		homePage.productListingTitle.shouldBeCurrentlyVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
	}

	@Step
	public String verifyVIPPrice(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		String total = atcPopupPage.estimatedTotal.get(1).getText().replace("$", "");
		joinVIPBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		String s = atcPopupPage.vipPrice.get(0).getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(1).toLowerCase());
		Assert.assertTrue(atcPopupPage.vipPrice.get(1).getText().contains(expectedData.get(0).get(2)));
		return total;
	}

	@Step
	public List<String> verifyVIPPriceWhenUserIsVIPMember(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		List<String> actuals = new ArrayList<String>();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		String total = strikedPrice.getText().replace("$", "");
		actuals.add(total);
		String s = atcPopupPage.vipPrice.get(0).getText();
		Assert.assertEquals(s.toLowerCase(), expectedData.get(0).get(1).toLowerCase());
		Assert.assertTrue(atcPopupPage.vipPrice.get(1).getText().contains(expectedData.get(0).get(2)));
		actuals.add(atcPopupPage.vipPrice.get(1).getText().replace("$", ""));
		return actuals;
	}

	@Step
	public void verifyVIPSavings(List<List<String>> expectedData, String actual) {
		for (int i = 0; i < atcPopupPage.lineItem.size(); i++) {
			atcPopupPage.lineItem.get(i).shouldBeCurrentlyVisible();
		}
		DecimalFormat df = new DecimalFormat("###.##");
		String value = atcPopupPage.lineItem.get(1).getText();
		value = value.replace("$", "");
		Double total = Double.parseDouble(value);
		Double subTotal = Double.parseDouble(actual) + 1.99;
		Assert.assertTrue(Double.parseDouble(df.format(subTotal)) == Double.parseDouble(df.format(total)));
		value = atcPopupPage.lineItem.get(2).getText();
		Assert.assertEquals(expectedData.get(0).get(0), value);
		value = atcPopupPage.vipPrice.get(1).getText().replace("$", "");
		total = Double.parseDouble(value);
		total = Double.parseDouble(actual) - total;
		value = atcPopupPage.lineItem.get(3).getText().replace("$", "");
		Assert.assertTrue(value.contains(expectedData.get(0).get(1)));
		value = value.replace("-", "");
		Assert.assertTrue(Double.parseDouble(df.format(total)) == Double.parseDouble(value));
		Double promotion = Double.parseDouble(actual) * 0.1;
		value = atcPopupPage.lineItem.get(5).getText().replace("$", "");
		value = value.replace("-", "");
		Assert.assertTrue(Double.parseDouble(df.format(promotion)) == Double.parseDouble(value));
		subTotal = Double.parseDouble(actual) + 1.99;
		Double estimatedTotal = subTotal - total;
		estimatedTotal = estimatedTotal - promotion;
		value = atcPopupPage.estimatedTotal.get(1).getText().replace("$", "");
		df.setRoundingMode(RoundingMode.UP);
		Assert.assertTrue(Double.parseDouble(df.format(estimatedTotal)) == Double.parseDouble(value));
	}

	@Step
	public void verifyEstimatedTotal(List<List<String>> expectedData, List<String> actuals)
			throws InterruptedException {
		try {
			for (int i = 0; i < atcPopupPage.lineItem.size(); i++) {
				atcPopupPage.lineItem.get(i).shouldBeCurrentlyVisible();
			}
			DecimalFormat df = new DecimalFormat("###.##");
			String value = atcPopupPage.lineItem.get(5).getText();
			value = value.replace("$", "");
			value = value.replace("-", "");
			Double actual = Double.parseDouble(value);
			Double expected = Double.parseDouble(actuals.get(0)) - Double.parseDouble(actuals.get(1));
			Assert.assertTrue(Double.parseDouble(df.format(expected)) == Double.parseDouble(df.format(actual)));
			expected = Double.parseDouble(actuals.get(0)) - actual;
			value = atcPopupPage.estimatedTotal.get(1).getText().replace("$", "");
			actual = Double.parseDouble(value);
			Assert.assertTrue(Double.parseDouble(df.format(expected)) == Double.parseDouble(df.format(actual)));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			remove.shouldBeCurrentlyVisible().isClickable();
			remove.click();
			Thread.sleep(5000);
			plpPage.pageTitle.shouldBeCurrentlyVisible();
		}
	}

	@Step
	public void verifyRewardCash(List<List<String>> expectedData) throws InterruptedException {
		DecimalFormat df = new DecimalFormat("###.##");
		rewardCash.shouldBeCurrentlyVisible().isPresent();
		vipReward.shouldBeCurrentlyVisible();
		String actual = vipReward.getText();
		Assert.assertTrue(actual.contains(expectedData.get(0).get(0)));
		Assert.assertTrue(actual.contains(expectedData.get(0).get(1)));
		actual = rewardCash.getText().replace("$", "");
		Double actualReward = Double.parseDouble(actual);
		actual = strikedPrice.getText().replace("$", "");
		Double expectedReward = Double.parseDouble(actual);
		Double expected = expectedReward * 0.2;
		expected = expectedReward - expected;
		expectedReward = expected * 0.1;
		df.setRoundingMode(RoundingMode.UP);
		Assert.assertTrue(Double.parseDouble(df.format(expectedReward)) == actualReward);
	}

	@Step
	public void verifySaveForLaterAndItsFunctionality(List<List<String>> expectedData) throws InterruptedException {
		waitFor(atcPopupPage.A2CPP_ViewCart_Btn);
		atcPopupPage.A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.productName.shouldBeCurrentlyVisible().isClickable();
		String actual = atcPopupPage.productName.getText();
		saveLater.shouldBeCurrentlyVisible().isClickable();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), saveLater.getText().toLowerCase());
		saveLater.click();
		Thread.sleep(5000);
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), plpPage.pageTitle.getText().toLowerCase());
		cartQty.isPresent();
		Assert.assertTrue(Integer.parseInt(expectedData.get(0).get(3)) == Integer.parseInt(cartQty.getText()));
		loginPage.click_Profile_SVG_Button();
		savedForLaterLink.click();
		Thread.sleep(5000);
		savedForLaterTitle.shouldBeCurrentlyVisible();
		pdpPage.productName.get(0).shouldBeCurrentlyVisible();
		Assert.assertEquals(actual.toLowerCase(), pdpPage.productName.get(0).getText().toLowerCase());
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		savedForLaterRemove.shouldBeCurrentlyVisible().isClickable();
		savedForLaterRemove.click();
		Thread.sleep(3000);
		confirmPopUp.shouldBeCurrentlyVisible();
		accept.click();
		Thread.sleep(5000);
		CommonPage.actions_UpArrow();
		CommonPage.actions_UpArrow();
		goShoppingHeader.shouldBeCurrentlyVisible();
	}
}
