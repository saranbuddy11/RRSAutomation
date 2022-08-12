package com.RRS.StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CommonPage;
import com.RRS.Pages.OrderConfirmationPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
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

	@Then("Verify Order Confirmation Page content")
	public void verify_order_confirmation_page_content(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyOrderConfirmationPageContent(expectedData);
	}

	@Then("Verify VIP bubble blue banner")
	public void verify_vip_bubble_blue_banner(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyVIPBubbleBlueBanner(expectedData);
	}

	@Then("Verify upgrade my order")
	public void verify_upgrade_my_order(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyUpgradeMyOrder(expectedData);
	}

	@Then("Verify Checkout Faster section")
	public void verify_checkout_faster_section(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyCheckoutFasterSection(expectedData);
	}

	@Then("Enter CVN number")
	public void enter_cvn_number(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.enterCVNNumber(expectedData);
	}

	@Then("Verify Email Address in Checkout Faster section")
	public void verify_email_address_in_checkout_faster_section(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyEmailAddressInCheckoutFasterSection(expectedData);
	}

	@Then("Verify Create Account Button")
	public void verify_create_account_button(DataTable table) throws InterruptedException, AWTException {
		String RndEmail = RndGenerators.RndEmail();
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyCreateAccountButton(expectedData, RndEmail);
	}

	@Then("Verify Shipping address field")
	public void verify_shipping_address_field(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyShippingAddressFiels(expectedData);
	}

	@Then("Verify Contact Info")
	public void verify_contact_info(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyContactInfo(expectedData);
	}

	@Then("Verify Payment Info")
	public void verify_payment_info(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyPaymentInfo(expectedData);
	}

	@Then("Verify Order Summary field")
	public void verify_order_summary_field(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyOrderSummaryField(expectedData);
	}

	@Then("Verify Cart Option")
	public void verify_cart_option(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyCartOption(expectedData);
	}

	@Then("Verify Item in Shipping Section")
	public void verify_item_in_shipping_section(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyItemInShippingSection(expectedData);
	}

	@Then("Verify Pickup at Store_Name in Shipping Section")
	public void verify_pickup_at_store_name_in_shipping_section(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyPickUpStoreNameInShippingSection(expectedData);
	}

	@Then("Verify Math Calculation banner")
	public void verify_math_calculation_banner(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyMathCalculationBanner(expectedData);
	}

	@Then("Login with VIP user credentials")
	public void login_with_vip_user_credentials(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.loginWithVIPUser(expectedData);
	}

	@Then("Click on place order CTA button")
	public void click_on_place_order_cta_button(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.clickOnPlaceOrder(expectedData);
	}

	@Then("Verify Math Calculation on Banner")
	public void verify_math_calculation_on_banner(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		OCPage.verifyMathCalculationOnBanner(expectedData);
	}
}
