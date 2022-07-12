package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class CheckoutS1Page extends PageObject {
	public static Logger log = LogManager.getLogger(CheckoutS1Page.class);
	CommonPage CommonPage = new CommonPage();

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
}
