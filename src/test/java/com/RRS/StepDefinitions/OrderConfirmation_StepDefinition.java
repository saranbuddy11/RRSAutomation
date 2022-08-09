package com.RRS.StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CommonPage;
import com.RRS.Pages.OrderConfirmationPage;
import com.RRS.base.baseClass;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class OrderConfirmation_StepDefinition extends baseClass {
	public static Logger log = LogManager.getLogger(OrderConfirmation_StepDefinition.class);

	@Steps
	CommonPage CommonPage;

	@Steps
	OrderConfirmationPage OCPage;

	@Then("Assert Order Number generated successfully")
	public void assert_order_number_generated_successfully() {
		try {
			String OrderNum = OCPage.getOrderNumber();
			propertyFileModifier.setProperty("OrderNumber", OrderNum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Thank You message displayed with FirstName {word}")
	public void assert_thank_you_message_displayed_with_first_name(String FirstName) {
		try {
			String Msg = OCPage.getThankYouMsg();
			log.info("Msg displayed is: " + Msg);
			assertTrue(Msg.contains(FirstName.toUpperCase()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Join VIP banner is displayed with price calculation")
	public void assert_join_vip_banner_is_displayed_with_price_calculation() {
		try {
			OCPage.JoinVIPbannerDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Order Details sections is displayed in OC Page")
	public void assert_order_details_sections_is_displayed_in_oc_page() {
		try {
			OCPage.assertOrderSummaryDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Order Confirmation page Title")
	public void assert_order_confirmation_page_title() {
		try {
			OCPage.assertOrderConfirmTitle();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert user is directed to Checkout Step {int} page since logged in user is Existing VIP user")
	public void assert_user_is_directed_to_checkout_step_page_since_logged_in_user_is_existing_vip_user(Integer int1) {
		try {
			OCPage.assertCheckoutS3displayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User enter the CVV for the exiting Card")
	public void user_enter_the_cvv_for_the_exiting_card() {
		try {
			OCPage.enterCVNExistingCard();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Wow VIP savings banner details in the OC page")
	public void assert_wow_vip_savings_banner_details_in_the_oc_page() {
		try {
			OCPage.assertWowbannerDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Upgrade to VIP Plus details is displayed")
	public void assert_upgrade_to_vip_plus_details_is_displayed() {

	}

	@Then("Verify Header and Footer")
	public void verify_header_and_footer() throws AWTException, InterruptedException {
		OCPage.verifyHeaderAndFooter();
	}

	@Then("Verify RRS Logo functionality")
	public void verify_rrs_logo_functionality() throws AWTException, InterruptedException {
		OCPage.verifyRRSLogoFunctionality();
	}
}
