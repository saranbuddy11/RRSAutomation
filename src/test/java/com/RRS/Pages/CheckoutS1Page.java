package com.RRS.Pages;

import java.awt.AWTException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("deprecation")
public class CheckoutS1Page extends PageObject {
	public static Logger log = LogManager.getLogger(CheckoutS1Page.class);
	CommonPage CommonPage = new CommonPage();
	ATC_PopupPage atcPopupPage = new ATC_PopupPage();
	PLPPage plpPage = new PLPPage();
	loginPage loginPage = new loginPage();
	CartPage cartPage = new CartPage();
	PDPPage pdpPage = new PDPPage();
	homePage homePage = new homePage();

	@Steps
	SDDLPPage sddlpPage;

	@FindBy(xpath = "//button[normalize-space()='Continue as Guest']")
	WebElementFacade CheckoutS1_ContinueAsGuest_Btn;

	@FindBy(xpath = "//h5[normalize-space()='LOGIN WITH ONLINE ACCOUNT']")
	WebElementFacade CheckoutS1_LoginWithOnlineAcct_Lbl;

	@FindBy(xpath = "//input[@id='login_emailAddress']")
	WebElementFacade CheckoutS1_EmailAddress_Txt;

	@FindBy(xpath = "//input[@id='login_password']")
	WebElementFacade CheckoutS1_Password_Txt;

	@FindBy(xpath = "//button[normalize-space()='Log In']")
	WebElementFacade CheckoutS1_LogIn_Btn;

	@FindBy(xpath = "//a[normalize-space()='Forgot my password']")
	WebElementFacade CheckoutS1_ForgotMyPassword_Lnk;

	@FindBy(xpath = "//h5[normalize-space()='ATTACH MY VIP MEMBERSHIP']")
	WebElementFacade CheckoutS1_AttachMyVIP_Lbl;

	@FindBy(xpath = "//input[contains(@class,'textbox-input-toggle-off-')]")
	WebElementFacade CheckoutS1_AttachMyVIP_Email_Txt;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElementFacade CheckoutS1_AttachMyVIP_Attach_Btn;

	@FindBy(xpath = "//button[normalize-space()='CONTINUE WITHOUT VIP']")
	WebElementFacade CheckoutS2_ContinueWithoutVIP_Btn;

	@FindBy(xpath = "//button[text()='UPGRADE AND CHECKOUT']")
	WebElementFacade Checkout_UpgradetoRewardPlus_Btn;

	@FindBy(xpath = "//button[normalize-space()='CONTINUE AS A VIP']")
	WebElementFacade Checkout_ContinueAsVIP_Btn;

	@FindBy(css = "ul.menu--1X4Yl")
	WebElementFacade navigationHeader;

	@FindBy(css = "h5.tag_h5--15p8m")
	List<WebElementFacade> sectionHeader;

	@FindBy(css = "a[href='/']>svg")
	WebElementFacade rrsLogo;

	@FindBy(css = "a[href*='cart']")
	WebElementFacade editCartBtn;

	@FindBy(css = "button.btn--1PWSW")
	List<WebElementFacade> checkOutButtons;

	@FindBy(css = "p.domath-left-price--2QHLH")
	WebElementFacade domathFullPrice;

	@FindBy(css = "p.domath-left-sub-text--1GR8_")
	WebElementFacade domathSubText;

	@FindBy(css = "p.domath-right-price--2rw4H")
	WebElementFacade domathVIPPrice;

	@FindBy(css = "p.domath-head-subtext--GVDWP")
	WebElementFacade domathSubHeader;

	@FindBy(css = "p.domath-right-price--2rw4H+button.domath-btn--2xTTj")
	WebElementFacade upgradeBtn;

	@FindBy(css = "div>span.domath-vip-text-teal--1OTER")
	WebElementFacade domathVIPPlusText;

	@FindBy(css = "div.text-align-left--1c_kk>a[href='#']")
	WebElementFacade forgetMyPasswordLink;

	@FindBy(css = "div.Snackbar_snackbar__text__1Hx2a")
	WebElementFacade errorMessage;

	@FindBy(css = "span.domath-right-text--1tTOy")
	WebElementFacade vipRewardPlus;

	@FindBy(css = "button.domath-btn--2xTTj")
	List<WebElementFacade> vipButtons;

	@FindBy(css = "h1.tag_h1--hWc2x+p")
	WebElementFacade pageSubTitle;

	@FindBy(css = "span.undefined")
	WebElementFacade rewardCash;

	@FindBy(css = "h2.address-title--1kd8k")
	WebElementFacade addressTitle;

	@FindBy(css = "p.domath-left-text--3shYg")
	WebElementFacade subText;

	@FindBy(css = "a.vip-saving-link--3hP8e>h5")
	WebElementFacade learnMore;

	@FindBy(css = "h1.vip-modal-offer-title--2ZWkn")
	WebElementFacade offerTitle;

	@FindBy(css = "svg.close-icon--23DDL")
	WebElementFacade closeIcon;

	@FindBy(css = "input.textbox-input-toggle--JuT3T")
	List<WebElementFacade> shippingInputFields;

	@FindBy(css = "input.textbox-input--1p_rz")
	List<WebElement> shippingFields;

	@FindBy(css = "svg.selectbox-header-icon--DjJzM")
	List<WebElementFacade> selectBoxHeaderIcon;

	@FindBy(css = "div[aria-expanded='true']>ul")
	WebElementFacade stateDropDown;

	@FindBy(css = "span.selectbox-field-active--3r-9F")
	List<WebElementFacade> activeSelection;

	@FindBy(css = "label[aria-label*='Sign up']>input.checkbox-input--3yXDV")
	WebElementFacade signUpCheckBox;

	@FindBy(css = "input.checkbox-input--3yXDV")
	List<WebElementFacade> signUpCheckBoxes;

	@FindBy(css = "h4.shipping-method-title--2PmDk")
	WebElementFacade shippingMethodTitle;

	@FindBy(id = "Regular Delivery")
	WebElementFacade regularDelivery;

	@FindBy(id = "Upgraded Delivery")
	WebElementFacade upgradedDelivery;

	@FindBy(id = "Express Delivery")
	WebElementFacade expressDelivery;

	@FindBy(id = "sourceCode")
	WebElementFacade sourceCode;

	@FindBy(css = "h5.shipping-method-item-name--1nFoM")
	List<WebElementFacade> deliveryMethod;

	@FindBy(css = "h4.tag_h4--3v2ny")
	List<WebElementFacade> subTitles;

	@FindBy(css = "h5.cart-body-title--1GKVa")
	WebElementFacade cartTitle;

	@FindBy(css = "span.payment-title-text--1eJug")
	WebElementFacade paymentSection;

	@FindBy(css = "label[aria-label='I have a gift card']>input.checkbox-input--3yXDV")
	WebElementFacade giftCardCheckBox;

	@FindBy(css = "input[name='giftCardNumber']")
	WebElementFacade giftCardNumberInput;

	@FindBy(css = "input[name='creditCardNumber']")
	WebElementFacade creditCardNumberInput;

	@FindBy(css = "input[name='creditCardNumber']+label")
	WebElementFacade creditCardNumberLabel;

	@FindBy(id = "name")
	WebElementFacade creditCardName;

	@FindBy(css = "#name+label")
	WebElementFacade creditCardNameLabel;

	@FindBy(css = "p.credit-card-info-tag--1Gnev")
	WebElementFacade creditCardExpirationLabel;

	@FindBy(css = "input[name='expirationMonth']")
	WebElementFacade expirationMonthInput;

	@FindBy(css = "input[name='expirationMonth']+label")
	WebElementFacade expirationMonthLabel;

	@FindBy(css = "input[name='expirationYear']")
	WebElementFacade expirationYearInput;

	@FindBy(css = "input[name='CVN']")
	WebElementFacade cvnInput;

	@FindBy(css = "div.credit-card-info-tag--1Gnev>p.tag_p--3xrVF")
	WebElementFacade cvnLabel;

	@FindBy(css = "p+a.clickable-text--2XYI6")
	WebElementFacade clickableLink;

	@FindBy(css = "input[value='billingSameAsShipping']")
	List<WebElementFacade> billingAddressCheckBox;

	@FindBy(css = "input[value='billingSameAsShipping']+span.checkbox-label-text--1agH2")
	List<WebElementFacade> billingAddressLabel;

	@FindBy(css = "input[name='expirationYear']+label")
	WebElementFacade expirationYearLabel;

	@FindBy(css = "input[name='giftCardCVNNumber']")
	WebElementFacade giftCardCVNNumberInput;

	@FindBy(css = "input[name='giftCardCVNNumber']+label.textbox-label--13ceX")
	WebElementFacade giftCardCVNNumberLabel;

	@FindBy(css = "input[name='giftCardNumber']+label.textbox-label--13ceX")
	WebElementFacade giftCardNumberLabel;

	@FindBy(css = "input[value='giftCard']+span.checkbox-label-text--1agH2")
	WebElementFacade giftCardLabel;

	@FindBy(css = "button.giftCard-btn--1Ard6")
	WebElementFacade giftCardApplyBtn;

	@FindBy(css = "p.gift-payment-link--1cFHh")
	WebElementFacade addGiftCardLink;

	@FindBy(css = "input.radio-button-input--ZSuL-")
	List<WebElementFacade> radioBtn;

	@FindBy(css = "div.radio-button--3nU-U+span")
	List<WebElementFacade> radioBtnLabel;

	@FindBy(css = "div.col-lg-6--1OeXl>button.btn-placeorder--3I1pX")
	WebElementFacade paymentPlaceOrderBtn;

	@FindBy(css = "a.card-btn-add--xg1Mr")
	WebElementFacade addNewCreditCard;

	@FindBy(css = "h4.order-confirm-alert--33yex")
	WebElementFacade orderID;

	@FindBy(css = "h1.order-confirm-title--esJZL")
	WebElementFacade orderTitle;

	@FindBy(css = "button.address-btn-add--3aOAi")
	WebElementFacade addNewAddressBtn;

	@FindBy(css = "div.address-modal-head--Nx-Mo>h3")
	WebElementFacade addNewAddressHeader;

	@FindBy(css = "button.address-form-btn-modal--2RNnb")
	WebElementFacade addAddressBtn;

	@FindBy(css = "div.address-card--13j7A")
	List<WebElementFacade> addressCard;

	@FindBy(css = "div>h5.tag_h5--15p8m")
	List<WebElementFacade> headerDetails;

	@FindBy(css = "a[href*='addresses']")
	WebElementFacade addressesSubTab;

	@FindBy(css = "h3.confirm-modal-title--1GJQ_")
	WebElementFacade confirmModalTitle;

	@FindBy(css = "button.confirm-modal-accept--8cFRH")
	WebElementFacade confirmModalAccept;

	@FindBy(css = "a.address-bar--1f64m")
	List<WebElementFacade> addressesAction;

	@FindBy(css = "p.reward-link--2kcOd")
	List<WebElementFacade> rewardLink;

	@FindBy(css = "button.redeem-button--15she")
	List<WebElementFacade> redeemBtn;

	@FindBy(css = "input.textbox-input-toggle-off--S7FMz")
	List<WebElementFacade> redeemInput;

	@FindBy(css = "p.cart-item-vip-ack-text--n2-c4")
	WebElementFacade vipAcknowledgementText;

	@FindBy(css = "div.cart--3krME+button.btn-placeorder--3I1pX")
	WebElementFacade placeOrderBtn;

	@FindBy(css = "label.checkout-vip-ack-error--1Dew3")
	WebElementFacade errorLabel;

	@FindBy(css = "input[value='vipAcknowledgement']")
	WebElementFacade vipAcknowledgementCheckBox;

	@Step
	public void clickContinueAsVIPButton() throws InterruptedException {
		// CommonPage.javaScriptExecutor_Click(Checkout_ContinueAsVIP_Btn);
		waitFor(Checkout_ContinueAsVIP_Btn);
		Checkout_ContinueAsVIP_Btn.click();
		Thread.sleep(8000);
	}

	@Step
	public void assertUpgradeToVIPPlusDisplayed() throws InterruptedException {
		waitFor(Checkout_UpgradetoRewardPlus_Btn);
		Checkout_UpgradetoRewardPlus_Btn.shouldBeVisible();
	}

	@Step
	public void clickContineAsGuestBtn() throws InterruptedException {
		CheckoutS1_ContinueAsGuest_Btn.click();
		waitFor(CheckoutS2_ContinueWithoutVIP_Btn);
		CheckoutS2_ContinueWithoutVIP_Btn.shouldBeVisible();
	}

	@Step
	public void assertAttachMyVIPMembership() throws InterruptedException {
		CheckoutS1_AttachMyVIP_Lbl.shouldBeVisible();
		CheckoutS1_AttachMyVIP_Email_Txt.shouldBeVisible();
		CheckoutS1_AttachMyVIP_Attach_Btn.shouldBeVisible();
	}

	@Step
	public void assertCheckouS1Page() throws InterruptedException {
		CheckoutS1_ContinueAsGuest_Btn.shouldBeVisible();
	}

	@Step
	public void assertContineAsGuestOption() throws InterruptedException {
		CheckoutS1_ContinueAsGuest_Btn.shouldBeVisible();
	}

	@Step
	public void assertLoginWithOnlineAccountLabel() throws InterruptedException {
		CheckoutS1_LoginWithOnlineAcct_Lbl.shouldBeVisible();
	}

	@Step
	public void assertLoginWithOnlineAccount_AllFiedlds() throws InterruptedException {
		CheckoutS1_EmailAddress_Txt.shouldBeVisible();
		CheckoutS1_Password_Txt.shouldBeVisible();
		CheckoutS1_LogIn_Btn.shouldBeVisible();
		CheckoutS1_ForgotMyPassword_Lnk.shouldBeVisible();
	}

	@Step
	public String verifyCheckOutButtonNavigation(List<List<String>> expectedData) throws InterruptedException {
		String actual = atcPopupPage.lineItem.get(1).getText();
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		Assert.assertEquals(expectedData.get(0).get(1), plpPage.pageTitle.getText());
		return actual;
	}

	@Step
	public void verifyHeaderMenus() {
		navigationHeader.shouldNotBeCurrentlyVisible();
		for (int i = 0; i < sectionHeader.size(); i++) {
			sectionHeader.get(i).shouldBeCurrentlyVisible();
		}
	}

	@Step
	public void verifyFunctionalityOfRRSLogo() throws InterruptedException {
		rrsLogo.shouldBeCurrentlyVisible().isClickable();
		rrsLogo.click();
		Thread.sleep(5000);
		navigationHeader.shouldBeCurrentlyVisible();
		loginPage.Login_SVG.isDisplayed();
	}

	@Step
	public void verifyFunctionalityOfEditCartButton(String value) throws InterruptedException {
		editCartBtn.shouldBeCurrentlyVisible().isClickable();
		editCartBtn.click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(value);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.vipSavingLineItem.isPresent();
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyDifferentWayOfCheckOut(List<List<String>> expectedData) throws InterruptedException {
		String text = "";
		for (int i = 0; i < checkOutButtons.size(); i++) {
			checkOutButtons.get(i).shouldBeCurrentlyVisible().isClickable();
			text = checkOutButtons.get(i).getText();
			Assert.assertEquals(expectedData.get(0).get(i).toLowerCase(), text.toLowerCase());
		}
		atcPopupPage.sectionHeader.get(0).shouldBeCurrentlyVisible();
		atcPopupPage.sectionHeader.get(1).shouldBeCurrentlyVisible();
		text = atcPopupPage.sectionHeader.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		text = atcPopupPage.sectionHeader.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
	}

	@Step
	public void verifyContinueAsGuest(List<List<String>> expectedData, String expected) throws InterruptedException {
		DecimalFormat df = new DecimalFormat("###.##");
		checkOutButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = checkOutButtons.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text.toLowerCase());
		checkOutButtons.get(0).click();
		Thread.sleep(5000);
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		text = domathFullPrice.getText().replace("$", "");
		Double actualPrice = Double.parseDouble(text);
		Double expectedPrice = Double.parseDouble(expected.replace("$", ""));
		Assert.assertTrue(Double.parseDouble(df.format(expectedPrice)) == Double.parseDouble(df.format(actualPrice)));
		domathVIPPrice.shouldBeCurrentlyVisible();
		text = domathVIPPrice.getText().replace("$", "");
		actualPrice = Double.parseDouble(text);
		Double vipPrice = expectedPrice * 0.2;
		vipPrice = expectedPrice - vipPrice;
		vipPrice = vipPrice + 1.99;
		df.setRoundingMode(RoundingMode.UP);
		Assert.assertTrue(Double.parseDouble(df.format(vipPrice)) == actualPrice);
	}

	@Step
	public void verifyContinueAsGuestForHokaBrand(List<List<String>> expectedData) throws InterruptedException {
		checkOutButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = checkOutButtons.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text.toLowerCase());
		checkOutButtons.get(0).click();
		Thread.sleep(5000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		text = plpPage.pageTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		domathSubText.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyLoginWithOnlineAccountFields(List<List<String>> expectedData) throws InterruptedException {
		sectionHeader.get(1).shouldBeCurrentlyVisible();
		String text = sectionHeader.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		checkOutButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		text = checkOutButtons.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		loginPage.Enter_EmailAddress.shouldBeCurrentlyVisible().isEnabled();
		loginPage.Enter_Password.shouldBeCurrentlyVisible().isEnabled();
		forgetMyPasswordLink.shouldBeCurrentlyVisible().isClickable();
		text = forgetMyPasswordLink.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
	}

	@Step
	public void verifyErrorMessageForWrongPassword(List<List<String>> expectedData) throws InterruptedException {
		sectionHeader.get(1).shouldBeCurrentlyVisible();
		checkOutButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		loginPage.Enter_EmailAddress.shouldBeCurrentlyVisible().isEnabled();
		loginPage.Enter_Password.shouldBeCurrentlyVisible().isEnabled();
		forgetMyPasswordLink.shouldBeCurrentlyVisible().isClickable();
		typeInto(loginPage.Enter_EmailAddress, expectedData.get(0).get(0));
		typeInto(loginPage.Enter_Password, expectedData.get(0).get(1));
		checkOutButtons.get(1).click();
		errorMessage.waitUntilVisible();
		errorMessage.shouldBeCurrentlyVisible();
		String text = errorMessage.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
	}

	@Step
	public void verifyValidCredentialsLogin(List<List<String>> expectedData) throws InterruptedException {
		sectionHeader.get(1).shouldBeCurrentlyVisible();
		checkOutButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		typeInto(loginPage.Enter_EmailAddress, expectedData.get(0).get(0));
		typeInto(loginPage.Enter_Password, expectedData.get(0).get(1));
		checkOutButtons.get(1).click();
		Thread.sleep(10000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		vipRewardPlus.shouldBeCurrentlyVisible();
		vipButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = vipButtons.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		vipButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		text = vipButtons.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		editCartBtn.click();
		Thread.sleep(5000);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.vipSavingLineItem.isPresent();
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyCheckoutMembershipPage(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		String text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
		editCartBtn.click();
		Thread.sleep(5000);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.vipSavingLineItem.isPresent();
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
		cartPage.remove.shouldBeCurrentlyVisible().isClickable();
		cartPage.remove.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyCheckoutPage(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		String text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
	}

	@Step
	public void verify2xCashBanner(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		String text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
		domathSubHeader.shouldBeCurrentlyVisible();
		text = domathSubHeader.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		domathVIPPlusText.shouldBeCurrentlyVisible();
		text = domathVIPPlusText.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		subText.shouldBeCurrentlyVisible();
		text = subText.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
		editCartBtn.click();
		Thread.sleep(5000);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		atcPopupPage.vipSavingLineItem.isPresent();
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
		cartPage.remove.shouldBeCurrentlyVisible().isClickable();
		cartPage.remove.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyUpgradeCTAButton(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		String text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
		domathSubHeader.shouldBeCurrentlyVisible();
		upgradeBtn.shouldBeCurrentlyVisible().isClickable();
		upgradeBtn.click();
		Thread.sleep(5000);
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		atcPopupPage.viewCart.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.viewCart.click();
		Thread.sleep(5000);
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
		cartPage.remove.shouldBeCurrentlyVisible().isClickable();
		cartPage.remove.click();
		Thread.sleep(5000);
		cartPage.remove.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyJoinVIPPlus(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		String text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
		domathSubHeader.shouldBeCurrentlyVisible();
		upgradeBtn.shouldBeCurrentlyVisible().isClickable();
		upgradeBtn.click();
		Thread.sleep(5000);
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		atcPopupPage.checkOut.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyAddToCartPopupForHokaBrand(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		Actions a = new Actions(getDriver());
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		a.moveToElement(pdpPage.variantColor.get(1)).perform();
		pdpPage.variantColor.get(1).click();
		String s = pdpPage.variantTitle.get(0).getText();
		Assert.assertEquals(s, expectedData.get(0).get(2));
		CommonPage.actions_DownArrow();
		Thread.sleep(5000);
		pdpPage.variantSize.get(2).waitUntilVisible();
		a.moveToElement(pdpPage.variantSize.get(2)).perform();
		pdpPage.variantSize.get(2).click();
		s = pdpPage.variantTitle.get(1).getText();
		Assert.assertEquals(s, expectedData.get(0).get(1));
		a.moveToElement(pdpPage.variantSize.get(12)).perform();
		pdpPage.variantSize.get(12).click();
		s = pdpPage.variantTitle.get(2).getText();
		Assert.assertEquals(s, expectedData.get(0).get(0));
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		s = pdpPage.quantity.getText();
		Assert.assertEquals(s, expectedData.get(0).get(3));
		pdpPage.addToCartBtn.shouldBeCurrentlyVisible();
		a.moveToElement(pdpPage.addToCartBtn).perform();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyContinueAsGuestUser(List<List<String>> expectedData) throws InterruptedException {
		checkOutButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = checkOutButtons.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text.toLowerCase());
		checkOutButtons.get(0).click();
		Thread.sleep(5000);
		plpPage.pageTitle.waitUntilVisible();
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		text = plpPage.pageTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		pageSubTitle.shouldBeCurrentlyVisible();
		text = pageSubTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyContinueAsGuestAndRewardCash(List<List<String>> expectedData, String expected)
			throws InterruptedException {
		DecimalFormat df = new DecimalFormat("###.##");
		checkOutButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = checkOutButtons.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text.toLowerCase());
		checkOutButtons.get(0).click();
		Thread.sleep(5000);
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		text = domathFullPrice.getText().replace("$", "");
		Double actualPrice = Double.parseDouble(text);
		Double expectedPrice = Double.parseDouble(expected.replace("$", ""));
		Assert.assertTrue(Double.parseDouble(df.format(expectedPrice)) == Double.parseDouble(df.format(actualPrice)));
		domathVIPPrice.shouldBeCurrentlyVisible();
		text = domathVIPPrice.getText().replace("$", "");
		actualPrice = Double.parseDouble(text);
		Double vipPrice = expectedPrice * 0.2;
		vipPrice = expectedPrice - vipPrice;
		vipPrice = vipPrice + 1.99;
		df.setRoundingMode(RoundingMode.UP);
		Assert.assertTrue(Double.parseDouble(df.format(vipPrice)) == actualPrice);
		vipPrice = (vipPrice - 1.99) * 0.1;
		text = rewardCash.getText().replace("$", "");
		actualPrice = Double.parseDouble(text);
		Assert.assertTrue(Double.parseDouble(df.format(vipPrice)) == actualPrice);
	}

	@Step
	public void verifyJoinVIPNavigation(List<List<String>> expectedData) throws InterruptedException {
		vipButtons.get(1).shouldBeCurrentlyVisible().isClickable();
		String text = vipButtons.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		vipButtons.get(1).click();
		Thread.sleep(5000);
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(5000);
		addressTitle.shouldBeCurrentlyVisible();
		text = addressTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		atcPopupPage.orderSummary.shouldBeCurrentlyVisible();
		text = atcPopupPage.orderSummary.getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
	}

	@Step
	public void verifyRewardCashLink(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		vipButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		vipButtons.get(0).click();
		Thread.sleep(5000);
		addressTitle.shouldBeCurrentlyVisible();
		String text = addressTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		atcPopupPage.orderSummary.shouldBeCurrentlyVisible();
		text = atcPopupPage.orderSummary.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		rewardLink.get(0).shouldBeCurrentlyVisible().isClickable();
		text = rewardLink.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		rewardLink.get(0).click();
		Thread.sleep(5000);
		homePage.Feature_Headers.get(3).shouldBeCurrentlyVisible();
		for (int i = 0; i < redeemBtn.size(); i++) {
			redeemBtn.get(i).shouldBeCurrentlyVisible().isClickable();
			text = redeemBtn.get(i).getText();
			Assert.assertEquals(expectedData.get(0).get(3), text);
		}
		for (int i = 0; i < redeemInput.size(); i++) {
			redeemInput.get(i).shouldBeCurrentlyVisible().isEnabled();
		}
		closeIcon.shouldBeCurrentlyVisible();
		closeIcon.click();
		editCartBtn.click();
		Thread.sleep(10000);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		cartPage.remove.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyWithoutVIPNavigation(List<List<String>> expectedData) throws InterruptedException {
		subText.shouldBeCurrentlyVisible();
		String text = subText.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		vipButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		text = vipButtons.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		vipButtons.get(0).click();
		Thread.sleep(5000);
		addressTitle.shouldBeCurrentlyVisible();
		text = addressTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		atcPopupPage.orderSummary.shouldBeCurrentlyVisible();
		text = atcPopupPage.orderSummary.getText();
		Assert.assertEquals(expectedData.get(0).get(3), text);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyCheckOutNavigation(List<List<String>> expectedData) throws InterruptedException {
		Thread.sleep(5000);
		plpPage.pageTitle.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		Assert.assertEquals(expectedData.get(0).get(1), plpPage.pageTitle.getText());
	}

	@Step
	public void clickContinueAsGuest(List<List<String>> expectedData) throws InterruptedException {
		checkOutButtons.get(0).shouldBeCurrentlyVisible().isClickable();
		String text = checkOutButtons.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text.toLowerCase());
		checkOutButtons.get(0).click();
		Thread.sleep(5000);
		plpPage.pageTitle.shouldBeCurrentlyVisible();
		text = plpPage.pageTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		domathFullPrice.shouldBeCurrentlyVisible();
		domathVIPPrice.shouldBeCurrentlyVisible();
	}

	@Step
	public void navigateBackToCheckoutPageAndVerifyFunctionalityOfRRSLogo() throws InterruptedException {
		cartPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		cartPage.checkOut.click();
		Thread.sleep(10000);
		rrsLogo.shouldBeCurrentlyVisible().isClickable();
		rrsLogo.click();
		Thread.sleep(5000);
		navigationHeader.shouldBeCurrentlyVisible();
		loginPage.Login_SVG.isDisplayed();
	}

	@Step
	public void verifyTheTextDisplayedInBanner() {
		for (int i = 0; i < atcPopupPage.lineItem.size(); i++) {
			atcPopupPage.lineItem.get(i).shouldBeCurrentlyVisible();
		}
		for (int i = 0; i < atcPopupPage.vipTotal.size(); i++) {
			atcPopupPage.vipTotal.get(i).shouldBeCurrentlyVisible();
		}
	}

	@Step
	public void verifyCTAButtonAndLearnMoreLink(List<List<String>> expectedData) throws InterruptedException {
		learnMore.shouldBeCurrentlyVisible().isClickable();
		String text = learnMore.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		learnMore.click();
		Thread.sleep(5000);
		offerTitle.shouldBeCurrentlyVisible();
		text = offerTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		closeIcon.click();
		cartPage.joinVipBtn.shouldBeCurrentlyVisible().isClickable();
		text = cartPage.joinVipBtn.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		cartPage.joinVipBtn.click();
		Thread.sleep(5000);
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(5000);
		addressTitle.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyShippingSectionFields(List<List<String>> expectedData) throws AWTException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		for (int i = 0; i < shippingFields.size() - 11; i++) {
			shippingFields.get(i).isDisplayed();
			shippingFields.get(i).isEnabled();
		}
		typeInto(shippingFields.get(0), expectedData.get(0).get(0));
		String text = shippingInputFields.get(0).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(0), text);
		typeInto(shippingFields.get(1), expectedData.get(0).get(1));
		text = shippingInputFields.get(1).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(1), text);
		typeInto(shippingFields.get(2), expectedData.get(0).get(2));
		text = shippingInputFields.get(2).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(2), text);
		typeInto(shippingFields.get(3), expectedData.get(0).get(3));
		text = shippingInputFields.get(3).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(3), text);
		typeInto(shippingFields.get(4), expectedData.get(0).get(4));
		text = shippingInputFields.get(4).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(4), text);
		typeInto(shippingFields.get(5), expectedData.get(0).get(5));
		text = shippingInputFields.get(5).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(5), text);
		typeInto(shippingFields.get(6), expectedData.get(0).get(6));
		text = shippingInputFields.get(6).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(6), text);
		shippingFields.get(8).click();
		for (int i = 0; i < expectedData.get(0).get(7).length(); i++) {
			char c = expectedData.get(0).get(7).charAt(i);
			CommonPage.number(Integer.parseInt(String.valueOf(c)));
		}
		text = shippingInputFields.get(8).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(7).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"), text);
		selectBoxHeaderIcon.get(0).click();
		String dynamicElement = "//li[contains(text(),'" + expectedData.get(0).get(8) + "')]";
		stateDropDown.findElement(By.xpath(dynamicElement)).click();
		text = activeSelection.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(8), text);
		text = activeSelection.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(9), text);
		signUpCheckBox.shouldBeCurrentlyVisible().isEnabled();
		signUpCheckBox.click();
		signUpCheckBox.isSelected();
	}

	@Step
	public void verifyAddNewShippingSectionFields(List<List<String>> expectedData) throws AWTException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		for (int i = 0; i < shippingFields.size() - 11; i++) {
			System.out.println(i);
			shippingFields.get(i).isDisplayed();
			shippingFields.get(i).isEnabled();
		}
		typeInto(shippingFields.get(0), expectedData.get(0).get(0));
		String text = shippingInputFields.get(0).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(0), text);
		typeInto(shippingFields.get(1), expectedData.get(0).get(1));
		text = shippingInputFields.get(1).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(1), text);
		typeInto(shippingFields.get(2), expectedData.get(0).get(2));
		text = shippingInputFields.get(2).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(2), text);
		typeInto(shippingFields.get(3), expectedData.get(0).get(3));
		text = shippingInputFields.get(3).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(3), text);
		typeInto(shippingFields.get(4), expectedData.get(0).get(4));
		text = shippingInputFields.get(4).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(4), text);
		typeInto(shippingFields.get(5), expectedData.get(0).get(5));
		text = shippingInputFields.get(5).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(5), text);
		typeInto(shippingFields.get(6), expectedData.get(0).get(6));
		text = shippingInputFields.get(6).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(6), text);
		shippingFields.get(8).click();
		for (int i = 0; i < expectedData.get(0).get(7).length(); i++) {
			char c = expectedData.get(0).get(7).charAt(i);
			CommonPage.number(Integer.parseInt(String.valueOf(c)));
		}
		text = shippingInputFields.get(8).getAttribute("value");
		Assert.assertEquals(expectedData.get(0).get(7).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"), text);
		selectBoxHeaderIcon.get(0).click();
		String dynamicElement = "//li[contains(text(),'" + expectedData.get(0).get(8) + "')]";
		stateDropDown.findElement(By.xpath(dynamicElement)).click();
		text = activeSelection.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(8), text);
		text = activeSelection.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(9), text);
		signUpCheckBox.shouldBeCurrentlyVisible().isEnabled();
		signUpCheckBox.click();
		signUpCheckBox.isSelected();
	}

	@Step
	public void verifyShippingMethodFields(List<List<String>> expectedData) throws AWTException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		shippingMethodTitle.shouldBeCurrentlyVisible();
		String text = shippingMethodTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		regularDelivery.shouldBeCurrentlyVisible();
		upgradedDelivery.shouldBeCurrentlyVisible().isClickable();
		upgradedDelivery.click();
		expressDelivery.shouldBeCurrentlyVisible().isClickable();
		expressDelivery.click();
		deliveryMethod.get(0).shouldBeCurrentlyVisible();
		text = deliveryMethod.get(0).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
		deliveryMethod.get(1).shouldBeCurrentlyVisible();
		text = deliveryMethod.get(1).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(2).toLowerCase(), text);
		deliveryMethod.get(2).shouldBeCurrentlyVisible();
		text = deliveryMethod.get(2).getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(3).toLowerCase(), text);
	}

	@Step
	public void verifyOrderSummarySection(List<List<String>> expectedData) {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		homePage.Feature_Headers.get(0).shouldBeCurrentlyVisible();
		String text = homePage.Feature_Headers.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		for (int i = 6; i < atcPopupPage.lineItem.size(); i++) {
			atcPopupPage.lineItem.get(i).shouldBeCurrentlyVisible();
		}
		text = atcPopupPage.lineItem.get(6).getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		text = atcPopupPage.lineItem.get(8).getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		text = atcPopupPage.lineItem.get(10).getText();
		Assert.assertEquals(expectedData.get(0).get(3), text);
		atcPopupPage.estimatedTotal.get(0).shouldBeCurrentlyVisible();
		atcPopupPage.estimatedTotal.get(1).shouldBeCurrentlyVisible();
		text = atcPopupPage.estimatedTotal.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(4), text);
		sourceCode.shouldBeCurrentlyVisible().isClickable();
		text = sourceCode.getText();
		Assert.assertEquals(expectedData.get(0).get(5), text);
	}

	@Step
	public void userClickOnAddToCartButton() {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Actions a = new Actions(getDriver());
		a.moveToElement(pdpPage.addToCartBtn).perform();
		pdpPage.addToCartBtn.click();
		element(pdpPage.cartTitle).waitUntilVisible();
		pdpPage.cartTitle.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyPickupAtStoreSection(List<List<String>> expectedData) {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		subTitles.get(4).shouldBeCurrentlyVisible();
		String text = subTitles.get(4).getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		cartTitle.shouldBeCurrentlyVisible();
		text = cartTitle.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
	}

	@Step
	public void verifyPaymentSection(List<List<String>> expectedData) throws AWTException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		paymentSection.shouldBeCurrentlyVisible();
		String text = paymentSection.getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		giftCardCheckBox.shouldBeCurrentlyVisible().isClickable();
		text = giftCardLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		radioBtn.get(1).shouldBeCurrentlyVisible().isClickable();
		radioBtn.get(2).shouldBeCurrentlyVisible().isClickable();
		radioBtn.get(3).shouldBeCurrentlyVisible().isClickable();
		text = radioBtnLabel.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		text = radioBtnLabel.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(3), text);
		text = radioBtnLabel.get(2).getText();
		Assert.assertEquals(expectedData.get(0).get(4), text);
		paymentPlaceOrderBtn.shouldBeCurrentlyVisible().isClickable();
		text = paymentPlaceOrderBtn.getText();
		Assert.assertEquals(expectedData.get(0).get(5), text);
	}

	@Step
	public void verifyGiftCardField(List<List<String>> expectedData) throws AWTException, InterruptedException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		paymentSection.shouldBeCurrentlyVisible();
		giftCardCheckBox.shouldBeCurrentlyVisible().isClickable();
		giftCardCheckBox.click();
		Thread.sleep(3000);
		giftCardNumberInput.shouldBeCurrentlyVisible().isEnabled();
		giftCardNumberLabel.shouldBeCurrentlyVisible();
		String text = giftCardNumberLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		giftCardCVNNumberInput.shouldBeCurrentlyVisible().isEnabled();
		giftCardCVNNumberLabel.shouldBeCurrentlyVisible();
		text = giftCardCVNNumberLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		giftCardApplyBtn.shouldBeCurrentlyVisible().isClickable();
		text = giftCardApplyBtn.getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		addGiftCardLink.shouldBeCurrentlyVisible().isClickable();
		text = addGiftCardLink.getText();
		Assert.assertEquals(expectedData.get(0).get(3), text);
	}

	@Step
	public void verifyCreditCardField(List<List<String>> expectedData) throws AWTException, InterruptedException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		paymentSection.shouldBeCurrentlyVisible();
		radioBtn.get(1).shouldBeCurrentlyVisible().isClickable();
		String text = addNewCreditCard.getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		creditCardNumberInput.shouldBeCurrentlyVisible().isEnabled();
		text = creditCardNumberLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		creditCardName.shouldBeCurrentlyVisible().isEnabled();
		text = creditCardNameLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(2), text);
		creditCardExpirationLabel.shouldBeCurrentlyVisible();
		text = creditCardExpirationLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(3), text);
		expirationMonthInput.shouldBeCurrentlyVisible().isEnabled();
		text = expirationMonthLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(4), text);
		expirationYearInput.shouldBeCurrentlyVisible().isEnabled();
		text = expirationYearLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(5), text);
		cvnInput.shouldBeCurrentlyVisible().isEnabled();
		text = cvnLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(6), text);
		clickableLink.shouldBeCurrentlyVisible().isClickable();
		text = clickableLink.getText();
		Assert.assertEquals(expectedData.get(0).get(7), text);
		billingAddressCheckBox.get(0).shouldBeCurrentlyVisible().isSelected();
		billingAddressLabel.get(0).shouldBeCurrentlyVisible();
		text = billingAddressLabel.get(0).getText();
		Assert.assertEquals(expectedData.get(0).get(8), text);
	}

	@Step
	public void verifyPaypalPaymentMethod(List<List<String>> expectedData) throws AWTException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		paymentSection.shouldBeCurrentlyVisible();
		radioBtn.get(3).shouldBeCurrentlyVisible().isClickable();
		String text = radioBtnLabel.get(2).getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		radioBtn.get(3).click();
		radioBtn.get(3).isSelected();
	}

	@Step
	public void verifyKlarnaPaymentMethod(List<List<String>> expectedData) throws AWTException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		paymentSection.shouldBeCurrentlyVisible();
		radioBtn.get(2).shouldBeCurrentlyVisible().isClickable();
		String text = radioBtnLabel.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		radioBtn.get(2).click();
		radioBtn.get(2).isSelected();
	}

	@Step
	public void clickPlaceOrderButtonAndValidateErrorMessage(List<List<String>> expectedData)
			throws AWTException, InterruptedException {
		CommonPage.pageScrollDown();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(5000);
		paymentPlaceOrderBtn.shouldBeCurrentlyVisible().isClickable();
		CommonPage.javaScriptExecutor_Click(paymentPlaceOrderBtn);
		errorMessage.waitUntilVisible();
		errorMessage.shouldBeCurrentlyVisible();
		String text = errorMessage.getText().toLowerCase().replace("\n", " ");
		System.out.println(expectedData.get(0).get(0).toLowerCase() + "-" + text);
		Assert.assertEquals(expectedData.get(0).get(0).toLowerCase(), text);
		Thread.sleep(5000);
	}

	@Step
	public void enterCreditCardDetails(List<List<String>> expectedData) throws InterruptedException, AWTException {
		typeInto(creditCardNumberInput, expectedData.get(0).get(0));
		typeInto(creditCardName, expectedData.get(0).get(1));
		typeInto(expirationMonthInput, expectedData.get(0).get(2));
		typeInto(expirationYearInput, expectedData.get(0).get(3));
		typeInto(cvnInput, expectedData.get(0).get(4));
		if (!billingAddressCheckBox.get(0).isSelected())
			billingAddressCheckBox.get(0).click();
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		CommonPage.javaScriptExecutor_Click(paymentPlaceOrderBtn);
		Thread.sleep(10000);
	}

	@Step
	public void verifyOrderConfirmationPage(List<List<String>> expectedData) {
		orderID.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		orderID.shouldBeCurrentlyVisible();
		orderTitle.shouldBeCurrentlyVisible();
		String text = orderTitle.getText().toLowerCase();
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), text);
	}

	@Step
	public void userClickOnCheckoutButton(List<List<String>> expectedData) throws InterruptedException {
		atcPopupPage.checkOut.shouldBeCurrentlyVisible().isClickable();
		atcPopupPage.checkOut.click();
		Thread.sleep(8000);
		plpPage.pageTitle.waitUntilVisible();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
	}

	@Step
	public void verifyAddNewAddressButton(List<List<String>> expectedData)
			throws InterruptedException, NumberFormatException, AWTException {
		Actions a = new Actions(getDriver());
		addNewAddressBtn.shouldBeCurrentlyVisible().isClickable();
		addNewAddressBtn.click();
		Thread.sleep(5000);
		addNewAddressHeader.shouldBeCurrentlyVisible();
		typeInto(shippingFields.get(7), expectedData.get(0).get(0));
		typeInto(shippingFields.get(8), expectedData.get(0).get(1));
		typeInto(shippingFields.get(9), expectedData.get(0).get(2));
		typeInto(shippingFields.get(10), expectedData.get(0).get(3));
		typeInto(shippingFields.get(11), expectedData.get(0).get(4));
		typeInto(shippingFields.get(12), expectedData.get(0).get(5));
		shippingFields.get(14).click();
		for (int i = 0; i < expectedData.get(0).get(6).length(); i++) {
			char c = expectedData.get(0).get(6).charAt(i);
			CommonPage.number(Integer.parseInt(String.valueOf(c)));
		}
		selectBoxHeaderIcon.get(2).click();
		Thread.sleep(5000);
		String dynamicElement = "//li[contains(text(),'" + expectedData.get(0).get(7) + "')]";
		List<WebElement> element = getDriver().findElements(By.xpath(dynamicElement));
		a.moveToElement(element.get(1)).click().build().perform();
		String text = activeSelection.get(1).getText();
		Assert.assertEquals(expectedData.get(0).get(7), text);
		text = activeSelection.get(2).getText();
		Assert.assertEquals(expectedData.get(0).get(8), text);
		signUpCheckBoxes.get(2).shouldBeCurrentlyVisible().isEnabled();
		signUpCheckBoxes.get(2).click();
		signUpCheckBoxes.get(2).isSelected();
		signUpCheckBoxes.get(3).shouldBeCurrentlyVisible().isEnabled();
		signUpCheckBoxes.get(3).click();
		signUpCheckBoxes.get(3).isSelected();
		addAddressBtn.shouldBeCurrentlyVisible().isClickable();
		addAddressBtn.click();
		Thread.sleep(10000);
		addressCard.get(0).shouldBeCurrentlyVisible();
		text = headerDetails.get(3).getText();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0)));
		Assert.assertTrue(text.contains(expectedData.get(0).get(1)));
		editCartBtn.click();
		Thread.sleep(5000);
		atcPopupPage.vipSection.shouldBeCurrentlyVisible();
		cartPage.remove.click();
		Thread.sleep(5000);
		a.moveToElement(loginPage.Profile_SVG_Btn).click().build().perform();
		addressesSubTab.click();
		Thread.sleep(5000);
		addressesAction.get(1).click();
		confirmModalTitle.shouldBeCurrentlyVisible();
		confirmModalAccept.shouldBeCurrentlyVisible().isClickable();
		confirmModalAccept.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyVIPAcknowledgementCheckbox(List<List<String>> expectedData)
			throws AWTException, InterruptedException {
		CommonPage.pageScrollDown();
		vipAcknowledgementText.shouldBeCurrentlyVisible();
		String text = vipAcknowledgementText.getText();
		Assert.assertEquals(expectedData.get(0).get(0), text);
		placeOrderBtn.shouldBeCurrentlyVisible().isClickable();
		text = placeOrderBtn.getText();
		Assert.assertEquals(expectedData.get(0).get(1), text);
		text = placeOrderBtn.getCssValue("background-color");
		String c = Color.fromString(text).asHex();
		Assert.assertEquals(expectedData.get(0).get(2), c);
		placeOrderBtn.click();
		errorLabel.shouldBeCurrentlyVisible();
		text = errorLabel.getText();
		Assert.assertEquals(expectedData.get(0).get(4), text);
		vipAcknowledgementCheckBox.shouldBeCurrentlyVisible().isEnabled();
		vipAcknowledgementCheckBox.click();
		vipAcknowledgementCheckBox.isSelected();
		Thread.sleep(3000);
		text = placeOrderBtn.getCssValue("background-color");
		c = Color.fromString(text).asHex();
		Assert.assertEquals(expectedData.get(0).get(3), c);
	}

	@Step
	public void removeItem() throws AWTException, InterruptedException {
		CommonPage.pageScrollUp();
		Thread.sleep(5000);
		editCartBtn.shouldBeCurrentlyVisible().isClickable();
		editCartBtn.click();
		Thread.sleep(5000);
		atcPopupPage.cartPageHeader.shouldBeCurrentlyVisible();
		cartPage.remove.shouldBeCurrentlyVisible().isClickable();
		cartPage.remove.click();
		Thread.sleep(5000);
		cartPage.remove.click();
		Thread.sleep(5000);
	}
}
