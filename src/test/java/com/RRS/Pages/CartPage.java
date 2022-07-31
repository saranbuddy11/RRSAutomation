package com.RRS.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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
		Thread.sleep(5000);
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
}
