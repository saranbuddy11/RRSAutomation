package com.RRS.Pages;

import static org.assertj.core.api.Assertions.assertThat;

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

public class loginPage extends PageObject {
	public static Logger log = LogManager.getLogger(loginPage.class);
	CommonPage CommonPage = new CommonPage();

	@FindBy(xpath = "//div[@aria-label='Open in new pop up Log In to See Rewards']//*[name()='svg']")
	WebElement Login_SVG;

	@FindBy(xpath = "//div[contains(@aria-label,'Hi')]//*[name()='svg']")
	WebElementFacade Profile_SVG_Btn;

	@FindBy(xpath = "//input[@id='login_emailAddress']")
	WebElementFacade Enter_EmailAddress;

	@FindBy(xpath = "//input[@id='login_password']")
	WebElementFacade Enter_Password;

	@FindBy(xpath = "//button[normalize-space()='Log In']")
	WebElementFacade Login_Btn;

	@FindBy(xpath = "//span[contains(normalize-space(),'Hi,')]")
	WebElementFacade LoggedInUser_Hi;

	@FindBy(xpath = "//div[contains(@class,'dropdown-item--3Kiul')]//a[contains(@class,'')][normalize-space()='My Account']")
	WebElementFacade MyAccount_Lnk;

	@FindBy(xpath = "//div[normalize-space()='Log Out']")
	WebElementFacade Logout_Lnk;

	@FindBy(xpath = "//h1[normalize-space()='MY ACCOUNT']")
	WebElementFacade MyAccount_Header_Lbl;

	@FindBy(xpath = "//p[contains(@class,'account-user')]")
	WebElementFacade MyAccount_FNAME_Lbl;

	@FindBy(xpath = "//span[contains(text(),'NEW ACCOUNT')]")
	WebElementFacade CreateAccount_Lnk;

	@FindBy(xpath = "//input[@id='account_emailAddress']")
	WebElementFacade Enter_NewAccountEmailAddress;

	@FindBy(xpath = "//input[@id='account_password']")
	WebElementFacade Enter_NewAccountPassword;

	@FindBy(xpath = "//input[@id='account_confirmPassword']")
	WebElementFacade Enter_NewAccountConfirmPassword;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElementFacade CreateAccount_Btn;

	@FindBy(xpath = "//span[contains(normalize-space(),'There')]")
	WebElementFacade HiThere_Lbl;

	@FindBy(xpath = "//p[normalize-space()=\"YOU'RE MISSING OUT!\"]")
	WebElementFacade YoureMissingOut_Lbl;

	@FindBy(xpath = "//a[normalize-space()='Forgot my password']")
	WebElementFacade ForgetMyPassword_Lnk;

	@FindBy(xpath = "//input[@name='emailAddress']")
	WebElementFacade ForgetMyPassword_EnterEmailID_Txt;

	@FindBy(xpath = "//label[contains(text(),'Please enter a valid email address')]")
	WebElementFacade ForgetMyPassword_WarningMsg_ValidEmailAddress_Lbl;

	@FindBy(xpath = "//button[normalize-space()='Send Email']")
	WebElementFacade ForgetMyPassword_SendEmail_Btn;

	@FindBy(xpath = "//h2[normalize-space()='FORGOT YOUR PASSWORD?']")
	WebElementFacade ForgetYourPassword_H2_Lbl;

	@FindBy(xpath = "//span[contains(@class,'modal-content-dark-text--')]")
	WebElementFacade ForgetYourPassword_darkText_Lbl;

	@FindBy(xpath = "//span[contains(@class,'modal-content-bold-text-')]")
	WebElementFacade ForgetYourPassword_boldText_Lbl;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElementFacade ForgetYourPassword_Close_Btn;

	@FindBy(xpath = "//h2[text()='MY ACCOUNT']")
	WebElementFacade myAccountLogin_Lbl;

	@FindBy(xpath = "//h3/span[text()='LOG IN']")
	WebElementFacade loginTab_Lbl;

	@FindBy(xpath = "//h3/span[text()='NEW ACCOUNT']")
	WebElementFacade newAccountTab_Lbl;

	@FindBy(xpath = "//div[text()='No account linked with this email.']")
	WebElementFacade invalidLogin_Lbl;

	@FindBy(xpath = "//h1[contains(@class,'section-title') and text()='Contact Us']")
	WebElementFacade contactUs_Lbl;

	@FindBy(xpath = "//div[@class='contact-top']//b[text()='FAQS']")
	WebElementFacade faqs_Lbl;

	@FindBy(xpath = "//a[text()='GO TO YOUR ACCOUNT']")
	WebElementFacade goToYourAccount_Lnk;

	@FindBy(xpath = "//h1[text()='Login']")
	WebElementFacade login_Lbl;

	@FindBy(xpath = "//button[text()='Login & Continue']")
	WebElementFacade loginAndContinur_btn;

	@FindBy(xpath = "//a[text()='Your Account']")
	WebElementFacade yourAccount_Lnk;

	@FindBy(xpath = "//h4[text()='How do I track my order?']")
	WebElementFacade howDoTrackOrder_btn;

	@Step
	public void Click_CloseBtn_ForgetPwd() {
		ForgetYourPassword_Close_Btn.click();
		Login_Btn.shouldBeVisible();
	}

	@Step
	public void Validate_ConfirmationMsg_ForgetPwd(String EmailID) {
		ForgetYourPassword_Close_Btn.shouldBeVisible();
		assertThat(ForgetYourPassword_darkText_Lbl.containsText("If an account exists with the email address"));
		assertThat(ForgetYourPassword_boldText_Lbl.containsText(EmailID));
		assertThat(ForgetYourPassword_darkText_Lbl.containsText(
				", a reset password link has been sent. Please click the link in the email to create a new password"));
	}

	@Step
	public void Click_SendEmail_ForgetPwd() {
		ForgetMyPassword_SendEmail_Btn.click();
	}

	@Step
	public void Enter_EmailID_ForgetPwd(String EmailID) {
		typeInto(ForgetMyPassword_EnterEmailID_Txt, EmailID);
	}

	@Step
	public void Click_EmailID_ForgetPwd() {
		ForgetYourPassword_H2_Lbl.shouldBeVisible();
		// ForgetMyPassword_EnterEmailID_Txt.click();
		ForgetYourPassword_H2_Lbl.click();
		ForgetMyPassword_EnterEmailID_Txt.click();
		ForgetMyPassword_WarningMsg_ValidEmailAddress_Lbl.shouldBeVisible();
	}

	@Step
	public void user_Click_ForgetMyPwd_Link() {
		ForgetMyPassword_Lnk.click();
	}

	@Step
	public void click_Login_SVG_Button() {
		Actions a = new Actions(getDriver());
		a.moveToElement(Login_SVG).click().build().perform();
		myAccountLogin_Lbl.shouldBeVisible();
	}

	@Step
	public void click_Profile_SVG_Button() {
		Actions a = new Actions(getDriver());
		a.moveToElement(Profile_SVG_Btn).click().build().perform();
	}

	@Step
	public void user_Enter_EmailAddress(String Value) {
		typeInto(Enter_EmailAddress, Value);
	}

	@Step
	public void user_Enter_Password(String Value) {
		typeInto(Enter_Password, Value);
	}

	@Step
	public void user_Click_Login_Button() throws InterruptedException {
		Login_Btn.click();
		Thread.sleep(5000);
		// LoggedInUser_Hi.shouldBeVisible();
	}

	@Step
	public void user_CreateNewAccount(String Email, String Password) {
		typeInto(Enter_NewAccountEmailAddress, Email);
		typeInto(Enter_NewAccountPassword, Password);
		typeInto(Enter_NewAccountConfirmPassword, Password);
		CreateAccount_Btn.click();
	}

	@Step
	public void user_EnterNewAccount_Email(String Email) {
		typeInto(Enter_NewAccountEmailAddress, Email);
	}

	@Step
	public void user_EnterNewAccount_Password(String Password) {
		typeInto(Enter_NewAccountPassword, Password);
	}

	@Step
	public void user_EnterNewAccount_ConfirmPassword(String Password) {
		typeInto(Enter_NewAccountConfirmPassword, Password);
	}

	@Step
	public void user_ClickNewAccount_Btn() {
		CreateAccount_Btn.click();
	}

	@Step
	public void user_Assert_NewAccountCreation() {
		HiThere_Lbl.shouldBeVisible();
		MyAccount_Lnk.click();
		MyAccount_Header_Lbl.shouldBeVisible();
		assertThat(YoureMissingOut_Lbl.containsText("YOU'RE MISSING OUT!"));
	}

	@Step
	public void user_Assert_Success_Login() throws InterruptedException {
		boolean isHi = LoggedInUser_Hi.isDisplayed();
		System.out.println("Is Hi present: " + isHi);
		// MyAccount_Lnk.click();
		click_Profile_SVG_Button();
		CommonPage.javaScriptExecutor_Click(MyAccount_Lnk);
		Thread.sleep(5000);
		MyAccount_Header_Lbl.shouldBeVisible();
		// assertThat(MyAccount_FNAME_Lbl.containsText("SAI"));
		// assertTrue(MyAccount_FNAME_Lbl.containsElements("SAI"));
	}

	@Step
	public void user_logout_application() {
		click_Profile_SVG_Button();
		Logout_Lnk.click();
		element(Login_SVG).waitUntilVisible();
		LoggedInUser_Hi.shouldNotBeVisible();
	}

	@Step
	public void user_Click_NewAccount() {
		CreateAccount_Lnk.click();
	}

	@Step
	public void user_assert_my_account_modal_popup() {
		waitFor(myAccountLogin_Lbl);
		myAccountLogin_Lbl.shouldBeVisible();
		loginTab_Lbl.shouldBeVisible();
		newAccountTab_Lbl.shouldBeVisible();
		Enter_EmailAddress.shouldBeVisible();
		Enter_Password.shouldBeVisible();
		Login_Btn.shouldBeVisible();
		ForgetMyPassword_Lnk.shouldBeVisible();
	}

	@Step
	public void assert_application_displays_appropriate_error_message_for_invalid_error_message() {
		waitFor(invalidLogin_Lbl);
		invalidLogin_Lbl.shouldBeVisible();
	}

	@Step
	public void user_click_on_link_in_footer(String link) throws InterruptedException {
		String DynamicXPATH = "//div[contains(@class,'footer-menu-links-blocks')]//a[text()='" + link + "']";
		WebElement ele = getDriver().findElement(By.xpath(DynamicXPATH));
		CommonPage.javaScriptExecutor_Scroll(ele);
		CommonPage.javaScriptExecutor_Click(ele);
	}

	@Step
	public void assert_contact_us_is_displayed() {
		contactUs_Lbl.shouldBeVisible();
		Assert.assertTrue(getDriver().getCurrentUrl().contains("/content/contact-us"));
	}

	@Step
	public void assert_fa_qs_is_displayed() {
		faqs_Lbl.shouldBeVisible();
		Assert.assertTrue(getDriver().getCurrentUrl().contains("/faq"));
	}

	@Step
	public void user_click_on_your_account_link() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(howDoTrackOrder_btn);
		waitFor(yourAccount_Lnk);
		CommonPage.javaScriptExecutor_Scroll(yourAccount_Lnk);
		CommonPage.javaScriptExecutor_Click(yourAccount_Lnk);
	}

	@Step
	public void user_click_on_go_to_your_account_button() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(goToYourAccount_Lnk);
	}

	@Step
	public void user_assert_account_login_page() {
		waitFor(login_Lbl);
		login_Lbl.shouldBeVisible();
		Enter_EmailAddress.shouldBeVisible();
		Enter_Password.shouldBeVisible();
		loginAndContinur_btn.shouldBeVisible();
		ForgetMyPassword_Lnk.click();
	}

	@Step
	public void user_swith_to_newly_opened_window() {
		waitABit(6000);
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle);
		}
	}
}
