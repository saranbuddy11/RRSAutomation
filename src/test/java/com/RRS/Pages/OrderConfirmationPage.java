package com.RRS.Pages;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("deprecation")
public class OrderConfirmationPage extends PageObject {
	public static Logger log = LogManager.getLogger(OrderConfirmationPage.class);
	CommonPage CommonPage = new CommonPage();
	CheckoutS1Page checkOutPage = new CheckoutS1Page();
	loginPage loginPage = new loginPage();
	homePage homePage = new homePage();

	@FindBy(xpath = "//h4[contains(normalize-space(),'Order #')]")
	WebElementFacade OC_OrderNum_Lbl;

	@FindBy(xpath = "//h1[contains(normalize-space(),'Thank YOU ')]")
	WebElementFacade OC_ThankYou_Lbl;

	@FindBy(css = ".vip-saving-title--2zmcw")
	WebElementFacade OC_JoinVIP_Lbl;

	@FindBy(xpath = "//h3[normalize-space()='Order Summary']")
	WebElementFacade OC_OrderSummary_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Order Subtotal']")
	WebElementFacade OC_OrderSubTotal_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Shipping']")
	WebElementFacade OC_OrderShipping_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Tax']")
	WebElementFacade OC_OrderTax_Lbl;

	@FindBy(xpath = "(//div[contains(@class,'line-item--')])[4]")
	WebElementFacade OC_OrderTotal_Lbl;

	@FindBy(css = ".order-confirm-title--esJZL")
	WebElementFacade OC_Title_Lbl;

	@FindBy(xpath = "//input[@name='CVN']")
	WebElementFacade OC_CVN_input;

	@FindBy(xpath = "//h1[normalize-space()='WOW, VIP! YOU SAVED ALL THIS TODAY!']")
	WebElementFacade OC_WowSavings_banner;

	@FindBy(xpath = "//small[contains(text(),'Upgrade to VIP Rewards Plus for FREE and earn 10% ')]")
	WebElementFacade OC_VIPPlusUpgrade_lbl;

	@FindBy(css = "div.header-main--26ROe")
	WebElementFacade header;

	@FindBy(css = "div.footer--1LEZJ")
	WebElementFacade footer;

	@FindBy(css = "h4.order-confirm-alert--33yex")
	WebElementFacade orderID;

	@FindBy(css = "h1.order-confirm-title--esJZL")
	WebElementFacade orderTitle;

	@FindBy(css = "p.hide-print-details")
	WebElementFacade printDetails;

	@FindBy(css = "div.bubble-banner--1ZVle")
	WebElementFacade vipBubbleBanner;

	@FindBy(css = "span.bubble-banner-heading--3uwc_")
	WebElementFacade bubbleBannerHeading;

	@FindBy(css = "button.bubble-banner-upgrade-button--2Abv7")
	WebElementFacade upgradeBtn;

	@FindBy(css = "div.membership-banner--3-mLT")
	WebElementFacade memberShipBanner;

	@FindBy(css = "div.savings--2PkSZ")
	WebElementFacade savings;

	@FindBy(css = "div.savings--3pxjy")
	WebElementFacade vipBannerSavings;

	@FindBy(css = "input[name='CVN']")
	WebElementFacade cvnNumber;

	@FindBy(css = "div.section-content--2vu3L>h3.tag_h3--2baIm")
	List<WebElementFacade> sections;

	@FindBy(css = "div.col-lg-6--1OeXl>button.btn-placeorder--3I1pX")
	WebElementFacade paymentPlaceOrderBtn;

	@FindBy(css = "div.hide-print-details>h2.tag_h2--2y8Ae")
	WebElementFacade checkoutFaster;

	@FindBy(id = "create_account_form")
	WebElementFacade createAccount;

	@FindBy(css = "button.create-btn--1_13c")
	WebElementFacade createAccountBtn;

	@FindBy(id = "account_emailAddress")
	WebElementFacade email;

	@Step
	public void assertVIPUpgradeDetails() throws InterruptedException {
		OC_VIPPlusUpgrade_lbl.shouldBeVisible();
	}

	@Step
	public void assertWowbannerDetails() throws InterruptedException {
		OC_WowSavings_banner.shouldBeVisible();
	}

	@Step
	public void enterCVNExistingCard() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(OC_CVN_input);
		CommonPage.javaScriptExecutor_Click(OC_CVN_input);
		typeInto(OC_CVN_input, "123");
	}

	@Step
	public void assertCheckoutS3displayed() throws InterruptedException {
		Thread.sleep(5000);
		OC_OrderSummary_Lbl.shouldBeVisible();
	}

	@Step
	public void assertOrderConfirmTitle() throws InterruptedException {
		OC_Title_Lbl.shouldBeVisible();
	}

	@Step
	public void assertOrderSummaryDetails() throws InterruptedException {
		OC_OrderSummary_Lbl.shouldBeVisible();
		OC_OrderSubTotal_Lbl.shouldBeVisible();
		OC_OrderShipping_Lbl.shouldBeVisible();
		OC_OrderTax_Lbl.shouldBeVisible();
		OC_OrderTotal_Lbl.shouldBeVisible();
	}

	@Step
	public void JoinVIPbannerDisplayed() throws InterruptedException {
		OC_JoinVIP_Lbl.shouldBeVisible();
	}

	@Step
	public String getThankYouMsg() throws InterruptedException {
		String ThankYouMsg = OC_ThankYou_Lbl.getText();
		return ThankYouMsg;
	}

	@Step
	public String getOrderNumber() throws InterruptedException {
		String OrderNum = OC_OrderNum_Lbl.getText();
		return OrderNum;
	}

	@Step
	public void verifyHeaderAndFooter() throws AWTException, InterruptedException {
		header.shouldBeCurrentlyVisible();
		CommonPage.pageScrollDown();
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		footer.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyRRSLogoFunctionality() throws AWTException, InterruptedException {
		CommonPage.pageScrollUp();
		CommonPage.pageScrollUp();
		Thread.sleep(5000);
		checkOutPage.rrsLogo.shouldBeCurrentlyVisible().isClickable();
		checkOutPage.rrsLogo.click();
		Thread.sleep(5000);
		checkOutPage.navigationHeader.shouldBeCurrentlyVisible();
		loginPage.Login_SVG.isDisplayed();
	}

	@Step
	public void verifyOrderConfirmationPageContent(List<List<String>> expectedData) {
		orderID.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		orderID.shouldBeCurrentlyVisible();
		orderTitle.shouldBeCurrentlyVisible();
		String text = orderTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		text = orderID.getText().toLowerCase().replace("\n", " ");
		Assert.assertTrue(text.contains(expectedData.get(0).get(2).toLowerCase()));
		printDetails.shouldBeCurrentlyVisible();
		text = printDetails.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
	}

	@Step
	public void verifyVIPBubbleBlueBanner(List<List<String>> expectedData) {
		vipBubbleBanner.shouldBeCurrentlyVisible();
		bubbleBannerHeading.shouldBeCurrentlyVisible();
		String text = bubbleBannerHeading.getText().toLowerCase().replace("\n", " ");
		Assert.assertTrue(text.contains(expectedData.get(0).get(0).toLowerCase()));
		Assert.assertTrue(text.contains(expectedData.get(0).get(1).toLowerCase()));
		upgradeBtn.shouldBeCurrentlyVisible().isClickable();
		savings.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyUpgradeMyOrder(List<List<String>> expectedData) throws InterruptedException {
		upgradeBtn.click();
		Thread.sleep(5000);
		memberShipBanner.shouldBeCurrentlyVisible();
		String text = homePage.contentTitle.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		text = homePage.contentTitle.get(2).getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		vipBannerSavings.shouldBeCurrentlyVisible();
	}

	@Step
	public void enterCVNNumber(List<List<String>> expectedData) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		cvnNumber.shouldBeCurrentlyVisible().isEnabled();
		typeInto(cvnNumber, expectedData.get(0).get(0));
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		sections.get(0).click();
		CommonPage.javaScriptExecutor_Click(paymentPlaceOrderBtn);
		Thread.sleep(10000);
	}

	@Step
	public void verifyCheckoutFasterSection(List<List<String>> expectedData) throws AWTException, InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		checkoutFaster.shouldBeCurrentlyVisible();
		String text = checkoutFaster.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		createAccount.shouldBeCurrentlyVisible();
		createAccountBtn.shouldBeCurrentlyVisible().isClickable();
		text = createAccountBtn.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
	}

	@Step
	public void verifyEmailAddressInCheckoutFasterSection(List<List<String>> expectedData)
			throws AWTException, InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		checkoutFaster.shouldBeCurrentlyVisible();
		createAccount.shouldBeCurrentlyVisible();
		createAccountBtn.shouldBeCurrentlyVisible().isClickable();
		email.shouldBeCurrentlyVisible().isEnabled();
		String text = email.getAttribute(expectedData.get(0).get(1)).toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		email.clear();
		typeInto(email, expectedData.get(0).get(2));
	}
}
