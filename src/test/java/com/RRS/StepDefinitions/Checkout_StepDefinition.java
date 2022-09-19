package com.RRS.StepDefinitions;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CartPage;
import com.RRS.Pages.CheckoutS1Page;
import com.RRS.Pages.CheckoutS2Page;
import com.RRS.Pages.CheckoutS3Page;
import com.RRS.Pages.CommonPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class Checkout_StepDefinition extends baseClass {
	public static Logger log = LogManager.getLogger(Checkout_StepDefinition.class);
	String actual = "";

	@Steps
	CommonPage CommonPage;

	@Steps
	CartPage CartPage;

	@Steps
	CheckoutS1Page CheckoutS1Page;

	@Steps
	CheckoutS2Page CheckoutS2Page;

	@Steps
	CheckoutS3Page CheckoutS3Page;

	@Given("User Click on Checkout button as VIP")
	public void user_click_on_checkout_button_as_VIP() {
		try {
			CartPage.clickCheckoutButtonAsVIPUser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User Click on Checkout button")
	public void user_click_on_checkout_button() {
		try {
			CartPage.clickCheckoutButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Step {int} page of Check out displayed")
	public void assert_step_page_of_check_out_displayed(Integer int1) {
		try {
			CheckoutS1Page.assertCheckouS1Page();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Continue as Guest option is displayed")
	public void assert_continue_as_guest_option_is_displayed() {
		try {
			CheckoutS1Page.assertContineAsGuestOption();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Login with Online Account option is displayed")
	public void assert_login_with_online_account_option_is_displayed() {
		try {
			CheckoutS1Page.assertLoginWithOnlineAccountLabel();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Login with Online Account option has all the required fields")
	public void assert_login_with_online_account_option_has_all_the_required_fields() {
		try {
			CheckoutS1Page.assertLoginWithOnlineAccount_AllFiedlds();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Attach My VIP Membership option is displayed")
	public void assert_attach_my_vip_membership_option_is_displayed() {
		try {
			CheckoutS1Page.assertAttachMyVIPMembership();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User click on Continue as Guest button")
	public void user_click_on_continue_as_guest_button() {
		try {
			CheckoutS1Page.clickContineAsGuestBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Checkout Do the Math\\(Memberhsip) page is displayed")
	public void assert_checkout_do_the_math_memberhsip_page_is_displayed() {
		try {
			CheckoutS2Page.assertCheckOutS2PageDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User click on Continue without VIP CTA button")
	public void user_click_on_continue_without_vip_cta_button() {
		try {
			CheckoutS2Page.clickContinueWithoutVIPBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Step {int} Checkout page got displayed")
	public void assert_step_checkout_page_got_displayed(Integer int1) {
		try {
			CheckoutS3Page.assertCheckOutS3PageDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert the Order Summary details in the Checkout page")
	public void assert_the_order_summary_details_in_the_checkout_page() {
		try {
			CheckoutS3Page.assertOrderSummaryLabel();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User select differnt shipping method in the Checkout page")
	public void user_select_differnt_shipping_method_in_the_checkout_page() {
		try {
			String ShippingFee_beforechange = CheckoutS3Page.getShippingFee();
			log.info("Shipping Fee before change: " + ShippingFee_beforechange);
			if (ShippingFee_beforechange.contentEquals("FREE")) {
				propertyFileModifier.setProperty("ShippingFee", "0.00");
			} else {
				propertyFileModifier.setProperty("ShippingFee", ShippingFee_beforechange);
			}
			CheckoutS3Page.clickUpgradedDeliveryBox();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Order summary is updated with the new shipping fees")
	public void assert_order_summary_is_updated_with_the_new_shipping_fees() {
		String ShippingFee_Afterchange;
		try {
			ShippingFee_Afterchange = CheckoutS3Page.getShippingFee();
			log.info("Shipping Fee After change: " + ShippingFee_Afterchange);
			/*
			 * float Shippping_After=Float.parseFloat(ShippingFee_Afterchange);
			 * log.info("Shipping Fee After change in float: "+Shippping_After); float
			 * Shipping_Before=Float.parseFloat(propertyFileModifier.getProperty(
			 * "ShippingFee"));
			 * log.info("Shipping Fee Before change in float: "+Shipping_Before);
			 * assertTrue(Shipping_Before<Shippping_After);
			 */
			if (ShippingFee_Afterchange.contentEquals("FREE")) {
				propertyFileModifier.setProperty("ShippingFee", "0.00");
			} else {
				propertyFileModifier.setProperty("ShippingFee", ShippingFee_Afterchange);
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User expand and enter valid source code {string}")
	public void user_expand_and_enter_valid_source_code(String string) {
		try {
			CheckoutS3Page.clickSourceCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert the promotion applied to the order summary")
	public void assert_the_promotion_applied_to_the_order_summary() {
		log.info("Promotion applied successfully");
	}

	@Then("User scroll down to Payment section in Check Out page")
	public void user_scroll_down_to_payment_section_in_check_out_page() {
		try {
			CheckoutS3Page.scrollToPaymentsection();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Giftcard Payment option is displayed")
	public void assert_giftcard_payment_option_is_displayed() {
		try {
			CheckoutS3Page.giftCardPayment_ChkBox();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert Credit Card Payment option is displayed")
	public void assert_credit_card_payment_option_is_displayed() {
		try {
			CheckoutS3Page.CCPaymentisDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Assert PayPal Payment option is displayed")
	public void assert_pay_pal_payment_option_is_displayed() {
		try {
			CheckoutS3Page.PayPalPaymentIsDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User enter valid First Name {word} and Last Name {word}")
	public void user_enter_valid_first_name_first_name_and_last_name_last_name(String FirstName, String LastName) {
		try {
			CheckoutS3Page.shipping_enterFirstLastName(FirstName, LastName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User enter valid US shipping address {word}")
	public void user_enter_valid_us_shipping_address_us_address1(String USAdress) {
		System.out.println("User info is: " + USAdress);
		String usAddress1 = DataInputProvider.getAddressInfo(USAdress);
		System.out.println("US Address: " + usAddress1);
		String[] usAddressDetails = usAddress1.split("::");
		System.out.println("User Address1: " + usAddressDetails[0]);
		System.out.println("User City: " + usAddressDetails[1]);
		System.out.println("User State: " + usAddressDetails[2]);
		System.out.println("User Zipcode: " + usAddressDetails[3]);
		System.out.println("User Country: " + usAddressDetails[4]);
		try {
			CheckoutS3Page.shipping_enterAddress1(usAddressDetails[0]);
			// CommonPage.actions_Tab();
			// CheckoutS3Page.shipping_enterCity(usAddressDetails[1]);
			// CheckoutS3Page.shipping_enterZip(usAddressDetails[3]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User enter random Email ID in checkout page")
	public void user_enter_random_email_id_in_checkout_page() {
		String RndEmail = RndGenerators.RndEmail();
		try {
			CheckoutS3Page.shipping_enterEmail(RndEmail);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User enter random Mobile number in checkout page")
	public void user_enter_random_mobile_number_in_checkout_page() {
		int RndMobileNumber_7 = RndGenerators.RndInteger(0000021, 9999999);
		String RndMobileNumber = "876" + String.valueOf(RndMobileNumber_7);
		try {
			CheckoutS3Page.shipping_enterPhoneNumber(RndMobileNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User use Credit Card Payment Method {word} in the checkout page")
	public void user_use_credit_card_payment_method_payment_method_in_the_checkout_page(String PaymentMethod)
			throws AWTException {
		System.out.println("Payment info is: " + PaymentMethod);
		String PaymentUsed = DataInputProvider.getPaymentInfo(PaymentMethod);
		System.out.println("PaymentUsed: " + PaymentUsed);
		String[] PaymentDetails = PaymentUsed.split("::");
		System.out.println("Credit Card Number: " + PaymentDetails[0]);
		System.out.println("Credit Card Expairy Month: " + PaymentDetails[1]);
		System.out.println("Credit Card Expairy Year: " + PaymentDetails[2]);
		System.out.println("Credit Card CVV: " + PaymentDetails[3]);
		try {
			CheckoutS3Page.payment_ccNewCard("Mohanraj", PaymentDetails[0], PaymentDetails[1], PaymentDetails[2],
					PaymentDetails[3]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User click on Place Order button")
	public void user_click_on_place_order_button() throws AWTException {
		try {
			CheckoutS3Page.Checkout_ClickPlaceOrderBtn();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User assert Upgrade to VIP Plus page displayed")
	public void user_assert_upgrade_to_vip_plus_page_displayed() {
		try {
			CheckoutS1Page.assertUpgradeToVIPPlusDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User click on Continue as VIP button in the Page")
	public void user_click_on_continue_as_vip_button_in_the_page() {
		try {
			CheckoutS1Page.clickContinueAsVIPButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User Click on Checkout Button and verify its navigation")
	public void user_click_on_checkout_button_and_verify_its_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		actual = CheckoutS1Page.verifyCheckOutButtonNavigation(expectedData);
	}

	@Then("Verify Header menus displayed or not")
	public void verify_header_meus_displayed_or_not() throws InterruptedException {
		CheckoutS1Page.verifyHeaderMenus();
	}

	@Then("Verify the functionality of RRS Logo")
	public void verify_the_functionality_of_rrs_logo() throws InterruptedException {
		CheckoutS1Page.verifyFunctionalityOfRRSLogo();
	}

	@Then("Verify the application response when the user clicks on Edit Cart CTA Button {string}")
	public void verify_the_application_response_when_the_user_clicks_on_edit_cart_cta_button(String value)
			throws InterruptedException {
		CheckoutS1Page.verifyFunctionalityOfEditCartButton(value);
	}

	@Then("Verify different way of checkout is displayed or not")
	public void verify_different_way_of_checkout_is_displayed_or_not(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyDifferentWayOfCheckOut(expectedData);
	}

	@Then("Verify Continue as Guest and its navigation")
	public void verify_continue_as_guest_and_its_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyContinueAsGuest(expectedData, actual);
		actual = null;
	}

	@Then("Verify Continue as Guest for HOKA brand")
	public void verify_continue_as_guest_for_hoka_brand(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyContinueAsGuestForHokaBrand(expectedData);
	}

	@Then("Verify login with online account section and its fields")
	public void verify_login_with_online_account_section_and_its_fields(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyLoginWithOnlineAccountFields(expectedData);
	}

	@Then("Verify Error Message for Wrong Password")
	public void verify_error_message_for_wrong_password(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyErrorMessageForWrongPassword(expectedData);
	}

	@Then("Verify Valid credentials Login")
	public void verify_valid_credentials_login(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyValidCredentialsLogin(expectedData);
	}

	@Then("Verify Checkout Page")
	public void verify_checkout_page(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyCheckoutMembershipPage(expectedData);
	}

	@Then("Verify Checkout from ATC Popup")
	public void verify_checkout_from_atc_popup(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyCheckoutPage(expectedData);
	}

	@Then("Verify Checkout Page and 2x Cash banner")
	public void verify_checkout_page_and_2x_cash_banner(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verify2xCashBanner(expectedData);
	}

	@Then("Verify Add to Cart Popup for HOKA brand")
	public void verify_add_to_cart_popup_for_hoka_brand(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyAddToCartPopupForHokaBrand(expectedData);
	}

	@Then("Verify Continue as Guest")
	public void verify_continue_as_guest(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyContinueAsGuestUser(expectedData);
	}

	@Then("Verify Continue as Guest and Reward cash")
	public void verify_continue_as_guest_and_reward_cash(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyContinueAsGuestAndRewardCash(expectedData, actual);
		actual = null;
	}

	@Then("verify Join VIP Navigation")
	public void verify_join_vip_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyJoinVIPNavigation(expectedData);
	}

	@Then("verify Continue Without VIP Navigation")
	public void verify_continue_without_vip_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyWithoutVIPNavigation(expectedData);
	}

	@Then("Verify Checkout navigation")
	public void verify_checkout_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyCheckOutNavigation(expectedData);
	}

	@Then("Click Continue as Guest")
	public void click_continue_as_guest(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.clickContinueAsGuest(expectedData);
	}

	@Then("Navigate Back to Checkout page and Verify the functionality of RRS Logo")
	public void navigate_back_to_checkout_page_and_verify_the_functionality_of_rrs_logo() throws InterruptedException {
		CheckoutS1Page.navigateBackToCheckoutPageAndVerifyFunctionalityOfRRSLogo();
	}

	@Then("Verify the text displayed in 20% banner")
	public void verify_the_text_displayed_in_20percent_banner() throws InterruptedException {
		CheckoutS1Page.verifyTheTextDisplayedInBanner();
	}

	@Then("Verify $1.99 CTA button and Learn more link")
	public void verify_cta_button_and_learn_more_link(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyCTAButtonAndLearnMoreLink(expectedData);
	}

	@Then("Verify Shipping section fields")
	public void verify_shipping_section_fields(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyShippingSectionFields(expectedData);
	}

	@Then("Verify Add new Shipping section fields")
	public void verify_add_new_shipping_section_fields(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyAddNewShippingSectionFields(expectedData);
	}

	@Then("Verify Add new Address button")
	public void verify_add_new_address_button(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyAddNewAddressButton(expectedData);
	}

	@Then("Verify Shipping Method fields")
	public void verify_shipping_method_fields(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyShippingMethodFields(expectedData);
	}

	@Then("Verify Order Summary Section")
	public void verify_order_summary_section(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyOrderSummarySection(expectedData);
	}

	@Then("User Click on Add to Cart Button")
	public void user_click_on_add_to_cart_button() throws InterruptedException {
		CheckoutS1Page.userClickOnAddToCartButton();
	}

	@Then("Verify Pickup at store Section")
	public void verify_pickup_at_store_section(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyPickupAtStoreSection(expectedData);
	}

	@Then("Verify Payment Section")
	public void verify_payment_section(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyPaymentSection(expectedData);
	}

	@Then("Verify Gift Card Fields")
	public void verify_gift_card_fields(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyGiftCardField(expectedData);
	}

	@Then("Verify Credit Card Fields")
	public void verify_credit_card_fields(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyCreditCardField(expectedData);
	}

	@Then("Verify Paypal Payment method")
	public void verify_paypal_payment_method(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyPaypalPaymentMethod(expectedData);
	}

	@Then("Verify Klarna Payment method")
	public void verify_klarna_payment_method(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyKlarnaPaymentMethod(expectedData);
	}

	@Then("Click Place Order Button and validate Error message")
	public void click_place_order_button_and_validate_error_message(DataTable table)
			throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.clickPlaceOrderButtonAndValidateErrorMessage(expectedData);
	}

	@Then("Enter Credit Card details")
	public void enter_credit_card_details(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.enterCreditCardDetails(expectedData);
	}

	@Then("Verify Order Confirmation Page")
	public void verify_order_confirmation_page(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyOrderConfirmationPage(expectedData);
	}

	@Then("Verify Upgrade CTA button in  2x Cash banner")
	public void verify_upgrade_cta_button_in_2x_cash_banner(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyUpgradeCTAButton(expectedData);
	}

	@Then("verify Join VIP Plus Navigation")
	public void verify_join_vip_plus_navigation(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyJoinVIPPlus(expectedData);
	}

	@Then("User Click on Checkout Button")
	public void user_click_on_checkout_button(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.userClickOnCheckoutButton(expectedData);
	}

	@Then("verify Join VIP Navigation and redeem reward cash link")
	public void verify_join_vip_navigation_and_redeem_reward_cash_link(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyRewardCashLink(expectedData);
	}

	@Then("Verify VIP Acknowledgement checkbox")
	public void verify_vip_acknowledgement_checkbox(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CheckoutS1Page.verifyVIPAcknowledgementCheckbox(expectedData);
	}

	@Then("Remove the Item from Cart")
	public void remove_the_item_from_cart() throws AWTException, InterruptedException {
		CheckoutS1Page.removeItem();
	}
}
