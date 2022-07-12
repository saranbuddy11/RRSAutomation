package com.RRS.StepDefinitions;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CartPage;
import com.RRS.Pages.CheckoutS1Page;
import com.RRS.Pages.CheckoutS2Page;
import com.RRS.Pages.CheckoutS3Page;
import com.RRS.Pages.CommonPage;
import com.RRS.base.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class Checkout_StepDefinition extends baseClass {
	public static Logger log = LogManager.getLogger(Checkout_StepDefinition.class);

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
}
