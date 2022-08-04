package com.RRS.Pages;

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
public class CheckoutS1Page extends PageObject {
	public static Logger log = LogManager.getLogger(CheckoutS1Page.class);
	CommonPage CommonPage = new CommonPage();
	ATC_PopupPage atcPopupPage = new ATC_PopupPage();
	PLPPage plpPage = new PLPPage();
	loginPage loginPage = new loginPage();

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

	@FindBy(css = "p.domath-right-price--2rw4H")
	WebElementFacade domathVIPPrice;

	@FindBy(css = "div.text-align-left--1c_kk>a[href='#']")
	WebElementFacade forgetMyPasswordLink;

	@FindBy(css = "div.Snackbar_snackbar__text__1Hx2a")
	WebElementFacade errorMessage;

	@FindBy(css = "span.domath-right-text--1tTOy")
	WebElementFacade vipRewardPlus;

	@FindBy(css = "button.domath-btn--2xTTj")
	List<WebElementFacade> vipButtons;

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
		Assert.assertEquals(expectedData.get(0).get(1).toLowerCase(), plpPage.pageTitle.getText().toLowerCase());
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
}
