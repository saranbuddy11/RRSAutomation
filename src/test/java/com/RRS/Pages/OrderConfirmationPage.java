package com.RRS.Pages;

import java.awt.AWTException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
	ATC_PopupPage atcPopupPage = new ATC_PopupPage();
	PLPPage plpPage = new PLPPage();

	@FindBy(xpath = "//h4[contains(normalize-space(),'Order #')]")
	WebElementFacade OC_OrderNum_Lbl;

	@FindBy(xpath = "//h1[contains(normalize-space(),'Thank YOU ')]")
	WebElementFacade OC_ThankYou_Lbl;

	@FindBy(css = ".vip-saving-title--2zmcw")
	WebElementFacade OC_JoinVIP_Lbl;

	@FindBy(xpath = "//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade CH3_OrderSummary_Lbl;
	
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

	@FindBy(xpath = "//span[contains(text(),'NICE VIP! YOU RECEIVED')]")
	WebElementFacade OC_WowSavings_banner;
	
	@FindBy(xpath = "//span[contains(@class,'bubble-banner-heading--3uwc_')]")
	WebElementFacade CH3_Bubble_banner;

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

	@FindBy(id = "account_password")
	WebElementFacade acctPassword;

	@FindBy(id = "account_confirmPassword")
	WebElementFacade acctConfirmPassword;

	@FindBy(id = "created_acount_section")
	WebElementFacade createAccountSection;

	@FindBy(css = "div.order-confirm-details-box--1thDC")
	List<WebElementFacade> orderConfirmationSection;

	@FindBy(css = "div.order-confirm-details-box--1thDC>div>p.tag_p--3xrVF")
	List<WebElementFacade> shippingDetails;

	@FindBy(css = "div.order-confirm-details-box--1thDC>p.tag_p--3xrVF")
	List<WebElementFacade> contactDetails;

	@FindBy(css = "div.cart-head--3iuWm")
	WebElementFacade cartSection;

	@FindBy(css = "div.cart-head--3iuWm>svg.icon--3lrU-")
	WebElementFacade cartIcon;

	@FindBy(id = "rrs_cart_body")
	WebElementFacade cartBody;

	@FindBy(css = "h2.cart-item-inventroy-bold--1O2l1")
	WebElementFacade inventoryDetails;

	@FindBy(css = "h5.cart-item-info-name--2Y01F")
	WebElementFacade itemName;

	@FindBy(css = "small.cart-item-info-details--3ETm5")
	List<WebElementFacade> itemDetails;

	@FindBy(css = "div.cart-item-info-line--2EHSe>small")
	List<WebElementFacade> qtyDetails;

	@FindBy(css = "h3.savings-price-card-red--1UBeS")
	List<WebElementFacade> savingPrices;

	@FindBy(css = "h3.savings-price-card-teal--3WLcS")
	List<WebElementFacade> vipSavingPrices;

	@FindBy(css = "small.savings-price-card-text--3MQ8V")
	List<WebElementFacade> savingPricesText;

	@FindBy(css = "small.savings-price-card-text--3UOMZ")
	List<WebElementFacade> vipSavingPricesText;

	@FindBy(css = "div.text-align-left--1c_kk>h1.tag_h1--hWc2x")
	WebElementFacade confirmedTitle;

	@FindBy(css = "div.bubble-banner-title-vip--2Ka4_")
	WebElementFacade bubbleBanner;

	@FindBy(css = "div.text-align-center--lK8Wc>h1.tag_h1--hWc2x")
	WebElementFacade title;

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
		CH3_OrderSummary_Lbl.shouldBeVisible();
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
	public void assertBubblebannerDetails() {
		CH3_Bubble_banner.shouldBeVisible();
}

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

	@Step
	public void verifyCreateAccountButton(List<List<String>> expectedData, String RndEmail)
			throws AWTException, InterruptedException {
		try {
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
			typeInto(email, RndEmail);
			acctPassword.shouldBeCurrentlyVisible().isEnabled();
			typeInto(acctPassword, expectedData.get(0).get(0));
			acctConfirmPassword.shouldBeCurrentlyVisible().isEnabled();
			typeInto(acctConfirmPassword, expectedData.get(0).get(0));
			createAccountBtn.click();
			Thread.sleep(5000);
			createAccountSection.shouldBeCurrentlyVisible();
			String text = createAccountSection.getText().toLowerCase().replace("\n", " ");
			System.out.println(expectedData.get(0).get(1).toLowerCase() + "-" + text);
			Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Step
	public void verifyShippingAddressFiels(List<List<String>> expectedData) throws AWTException, InterruptedException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(3000);
		orderConfirmationSection.get(0).shouldBeCurrentlyVisible();
		String text = shippingDetails.get(0).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0).toLowerCase()));
		Assert.assertTrue(text.contains(expectedData.get(0).get(1).toLowerCase()));
		text = shippingDetails.get(1).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(2).toLowerCase()));
		text = shippingDetails.get(2).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(3).toLowerCase()));
		text = shippingDetails.get(3).getText().toLowerCase();
		System.out.println(text);
		Assert.assertTrue(text.contains(expectedData.get(0).get(4).toLowerCase()));
		Assert.assertTrue(text.contains(expectedData.get(0).get(5).toLowerCase()));
		Assert.assertTrue(text.contains(expectedData.get(0).get(6).toLowerCase()));
		text = shippingDetails.get(4).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(7).toLowerCase()));
		text = shippingDetails.get(5).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(8).toLowerCase()));
		text = shippingDetails.get(6).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(9).toLowerCase()));
	}

	@Step
	public void verifyContactInfo(List<List<String>> expectedData) {
		orderConfirmationSection.get(1).shouldBeCurrentlyVisible();
		String text = contactDetails.get(0).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0).toLowerCase()));
		text = contactDetails.get(1).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(1).toLowerCase()));
	}

	@Step
	public void verifyPaymentInfo(List<List<String>> expectedData) {
		orderConfirmationSection.get(2).shouldBeCurrentlyVisible();
		String text = shippingDetails.get(7).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0).toLowerCase()));
		text = shippingDetails.get(8).getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(1).toLowerCase()));
	}

	@Step
	public void verifyOrderSummaryField(List<List<String>> expectedData) {
		atcPopupPage.orderSummary.shouldBeCurrentlyVisible();
		String text = atcPopupPage.orderSummary.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		for (int i = 0; i < atcPopupPage.summary.size(); i++) {
			atcPopupPage.summary.get(i).shouldBeCurrentlyVisible();
		}
		atcPopupPage.estimatedTotal.get(0).shouldBeCurrentlyVisible();
		text = atcPopupPage.estimatedTotal.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		atcPopupPage.estimatedTotal.get(1).shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyCartOption(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		cartSection.shouldBeCurrentlyVisible();
		String text = cartSection.getText().toLowerCase();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0).toLowerCase()));
		cartIcon.shouldBeCurrentlyVisible();
		cartBody.shouldBeCurrentlyVisible();
		cartIcon.click();
		Thread.sleep(3000);
		cartBody.shouldNotBeCurrentlyVisible();
		cartIcon.click();
		Thread.sleep(3000);
		cartBody.shouldBeCurrentlyVisible();
		checkOutPage.cartTitle.shouldBeCurrentlyVisible();
		text = checkOutPage.cartTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		inventoryDetails.shouldBeCurrentlyVisible();
		text = inventoryDetails.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
	}

	@Step
	public void verifyItemInShippingSection(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		cartSection.shouldBeCurrentlyVisible();
		cartIcon.shouldBeCurrentlyVisible();
		cartBody.shouldBeCurrentlyVisible();
		itemName.shouldBeCurrentlyVisible();
		String text = itemName.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		for (int i = 0; i < itemDetails.size(); i++) {
			itemDetails.get(i).shouldBeCurrentlyVisible();
			text = itemDetails.get(i).getText().toLowerCase();
			Assert.assertEquals(expectedData.get(0).get(i).toLowerCase(), text);
		}
		qtyDetails.get(3).shouldBeCurrentlyVisible();
		text = qtyDetails.get(3).getText().toLowerCase().replace("\n", " ");
		Assert.assertEquals(expectedData.get(0).get(4).toLowerCase(), text);
	}

	@Step
	public void verifyPickUpStoreNameInShippingSection(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		cartSection.shouldBeCurrentlyVisible();
		cartIcon.shouldBeCurrentlyVisible();
		cartBody.shouldBeCurrentlyVisible();
		checkOutPage.cartTitle.shouldBeCurrentlyVisible();
		String text = checkOutPage.cartTitle.getText().toLowerCase().replace("\n", " ");
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
	}

	@Step
	public void verifyMathCalculationBanner(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		savingPrices.get(0).shouldBeCurrentlyVisible();
		String text = savingPrices.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		savingPrices.get(1).shouldBeCurrentlyVisible();
		text = savingPrices.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(4).toLowerCase(), text);
		savingPrices.get(2).shouldBeCurrentlyVisible();
		text = savingPrices.get(2).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(5).toLowerCase(), text);
		savingPricesText.get(0).shouldBeCurrentlyVisible();
		text = savingPricesText.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		savingPricesText.get(1).shouldBeCurrentlyVisible();
		text = savingPricesText.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		savingPricesText.get(2).shouldBeCurrentlyVisible();
		text = savingPricesText.get(2).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		upgradeBtn.shouldBeCurrentlyVisible().isClickable();
		upgradeBtn.click();
		Thread.sleep(5000);
		confirmedTitle.shouldBeCurrentlyVisible();
	}

	@Step
	public void loginWithVIPUser(List<List<String>> expectedData) throws InterruptedException {
		checkOutPage.sectionHeader.get(1).shouldBeCurrentlyVisible();
		checkOutPage.checkOutButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		typeInto(loginPage.Enter_EmailAddress, expectedData.get(0).get(0));
		typeInto(loginPage.Enter_Password, expectedData.get(0).get(1));
		checkOutPage.checkOutButtons.get(1).click();
		Thread.sleep(10000);
	}

	@Step
	public void clickOnPlaceOrder(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(10000);
		atcPopupPage.orderSummary.shouldBeCurrentlyVisible();
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		Thread.sleep(4000);
		cvnNumber.shouldBeCurrentlyVisible().isEnabled();
		typeInto(cvnNumber, expectedData.get(0).get(0));
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		sections.get(0).click();
		CommonPage.javaScriptExecutor_Click(paymentPlaceOrderBtn);
		Thread.sleep(10000);
	}

	@Step
	public void verifyMathCalculationOnBanner(List<List<String>> expectedData) throws InterruptedException {
		Thread.sleep(5000);
		DecimalFormat df = new DecimalFormat("###.##");
		CommonPage.actions_DownArrow();
		title.shouldBeCurrentlyVisible();
		String text = title.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		orderTitle.shouldBeCurrentlyVisible();
		text = orderTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		homePage.Feature_Headers.get(0).shouldBeCurrentlyVisible();
		text = homePage.Feature_Headers.get(0).getText().replace("$", "");
		Double actualVipSaving = Double.parseDouble(text);
		String price = atcPopupPage.lineItem.get(1).getText().replace("$", "");
		Double expectedPrice = Double.parseDouble(price);
		Double vipSaving = expectedPrice * 0.1;
		df.setRoundingMode(RoundingMode.UP);
		Assert.assertTrue(Double.parseDouble(df.format(vipSaving)) == actualVipSaving);
		Double vipPrice = expectedPrice - vipSaving;
		Double reward = vipPrice * .1;
		homePage.Feature_Headers.get(1).shouldBeCurrentlyVisible();
		text = homePage.Feature_Headers.get(1).getText().replace("$", "");
		actualVipSaving = Double.parseDouble(text);
		Assert.assertTrue(Double.parseDouble(df.format(reward)) == actualVipSaving);
		homePage.Feature_Headers.get(2).shouldBeCurrentlyVisible();
		text = homePage.Feature_Headers.get(2).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		vipSavingPricesText.get(0).shouldBeCurrentlyVisible();
		text = vipSavingPricesText.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		vipSavingPricesText.get(1).shouldBeCurrentlyVisible();
		text = vipSavingPricesText.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(4).toLowerCase(), text);
		vipSavingPricesText.get(2).shouldBeCurrentlyVisible();
		text = vipSavingPricesText.get(2).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(5).toLowerCase(), text);
	}
}
