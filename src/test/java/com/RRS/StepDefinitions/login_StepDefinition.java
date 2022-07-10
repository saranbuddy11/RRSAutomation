package com.RRS.StepDefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import com.RRS.Pages.homePage;
import com.RRS.Pages.loginPage;
import com.RRS.base.*;

public class login_StepDefinition extends baseClass {
	private String GlobalTestuserPwd = "Abcd@1234";

	@Steps
	homePage homePage;

	@Steps
	loginPage loginPage;

	@Given("User Land on the RRS home page")
	public void user_land_on_the_rrs_home_page() {
		try {
			homePage.homePage_Open();
			homePage.homepage_PopUpClose();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User click on Login Image button in Home Page")
	public void user_click_on_login_image_button_in_home_page() {
		loginPage.click_Login_SVG_Button();
		;
	}

	@Given("User enter the VIP user Email address {word}")
	public void user_enter_the_vip_user_email_address(String EmailAddress) {
		loginPage.user_Enter_EmailAddress(EmailAddress);
	}

	@Given("User enter the user Email address {word}")
	public void user_enter_the_user_email_address_(String EmailAddress) {
		loginPage.user_Enter_EmailAddress(EmailAddress);
	}

	@Given("User enter the VIP user Password {word}")
	public void user_enter_the_vip_user_password(String PWD) {
		loginPage.user_Enter_Password(PWD);
	}

	@Given("User enter the user Password {word}")
	public void user_enter_the_vip_user_password_(String PWD) {
		loginPage.user_Enter_Password(PWD);
	}

	@Given("User enter the credentials of the user {word}")
	public void user_enter_the_credentials_of_the_user_vip1(String UserInfo) {
		System.out.println("User info is: " + UserInfo);
		String userCred = DataInputProvider.getUserInfo(UserInfo);
		System.out.println("User cred: " + userCred);
		String[] userDetails = userCred.split("::");
		System.out.println("User email address: " + userDetails[0]);
		System.out.println("User Password: " + userDetails[1]);
		loginPage.user_Enter_EmailAddress(userDetails[0]);
		loginPage.user_Enter_Password(userDetails[1]);
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		loginPage.user_Click_Login_Button();
	}

	@Then("user validate the successful login")
	public void user_validate_the_successful_login() throws InterruptedException {
		loginPage.user_Assert_Success_Login();
	}

	@Given("User logout of the application")
	public void user_logout_of_the_application() {
		loginPage.user_logout_application();
	}

	@Given("user click on New account")
	public void user_click_on_new_account() {
		loginPage.user_Click_NewAccount();
	}

	@Given("User enter new Random Email ID and Password")
	public void user_enter_new_random_email_id_and_password() {
		String RndEmail = RndGenerators.RndEmail();
		loginPage.user_EnterNewAccount_Email(RndEmail);
		loginPage.user_EnterNewAccount_Password(GlobalTestuserPwd);
	}

	@Given("User enter confirm password")
	public void user_enter_confirm_password() {
		loginPage.user_EnterNewAccount_ConfirmPassword(GlobalTestuserPwd);
	}

	@Given("User click on Create Account")
	public void user_click_on_create_account() {
		loginPage.user_ClickNewAccount_Btn();
	}

	@Then("User validate successful account creation")
	public void user_validate_successful_account_creation() {
		loginPage.click_Profile_SVG_Button();
		loginPage.user_Assert_NewAccountCreation();
	}

	@Given("User click on Forgot my password link in the screen")
	public void user_click_on_forgot_my_password_link_in_the_screen() {
		loginPage.user_Click_ForgetMyPwd_Link();
	}

	@Then("User assert warning message of valid email address in the next screen")
	public void user_assert_warning_message_of_valid_email_address_in_the_next_screen() {
		loginPage.Click_EmailID_ForgetPwd();
	}

	@Then("User enter the forget password email ID {string} and click on Send Email button")
	public void user_enter_the_forget_password_email_id_and_click_on_send_email_button(String EmailID) {
		loginPage.Enter_EmailID_ForgetPwd(EmailID);
		loginPage.Click_SendEmail_ForgetPwd();
	}

	@Then("User Assert the confirmation of password reset link sent to mentioned email ID {string}")
	public void user_assert_the_confirmation_of_password_reset_link_sent_to_mentioned_email_id(String EmailID) {
		loginPage.Validate_ConfirmationMsg_ForgetPwd(EmailID);
	}

	@Then("User Click on Close button in the forget password confirmation screen")
	public void user_click_on_close_button_in_the_forget_password_confirmation_screen() {
		loginPage.Click_CloseBtn_ForgetPwd();
	}

	@Given("User Assert My Account modal popup")
	public void user_assert_my_account_modal_popup() {
		loginPage.user_assert_my_account_modal_popup();
	}

	@Then("Assert application displays appropriate error message for invalid Login")
	public void assert_application_displays_appropriate_error_message_for_invalid_error_message() {
		loginPage.assert_application_displays_appropriate_error_message_for_invalid_error_message();
	}

	@Given("User click on {string} link in footer")
	public void user_click_on_link_in_footer(String link) throws InterruptedException {
		loginPage.user_click_on_link_in_footer(link);
	}

	@Given("Assert Contact US is displayed")
	public void assert_contact_us_is_displayed() {
		loginPage.assert_contact_us_is_displayed();
	}

	@Given("User click on GO TO YOUR ACCOUNT button")
	public void user_click_on_go_to_your_account_button() throws InterruptedException {
		loginPage.user_click_on_go_to_your_account_button();
	}

	@Given("User Assert account login page")
	public void user_assert_account_login_page() {
		loginPage.user_assert_account_login_page();
	}

	@Given("Assert FAQs is displayed")
	public void assert_fa_qs_is_displayed() {
		loginPage.assert_fa_qs_is_displayed();
	}

	@Given("User click on YOUR ACCOUNT link")
	public void user_click_on_your_account_link() throws InterruptedException {
		loginPage.user_click_on_your_account_link();
	}

	@Given("User swith to newly opened window")
	public void user_swith_to_newly_opened_window() {
		loginPage.user_swith_to_newly_opened_window();
	}
}
