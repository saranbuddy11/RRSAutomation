package com.RRS.StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CartPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class Cart_StepDefinitions extends baseClass {
	public static Logger log = LogManager.getLogger(Cart_StepDefinitions.class);

	@Steps
	CartPage CartPage;

	@Steps
	ATC_PopUp_StepDefinitions atcPopup;

	String actual = "";
	List<String> actuals = null;

	@Then("User Assert Cart Page is displayed")
	public void user_assert_cart_page_is_displayed() {
		try {
			CartPage.assertViewCartPageDsplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate Order Summary section has option to increase or decrease the quantity of the product")
	public void user_validate_order_summary_section_has_option_to_increase_or_decrease_the_quantity_of_the_product() {
		String OriginalPrice1Product = propertyFileModifier.getProperty("MSRP");
		log.info("Original MSRP price for 1 Product is: " + OriginalPrice1Product);
		try {
			CartPage.increaseQuantityby1_validateChanges(OriginalPrice1Product);
			CartPage.decreaseQuantityby1_validateChanges(OriginalPrice1Product);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User valdiate Checkout option is displayed in the Cart page")
	public void user_valdiate_checkout_option_is_displayed_in_the_cart_page() {
		try {
			CartPage.assertCheckoutButtonDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate option to become VIP is displayed in the Cart page")
	public void user_validate_option_to_become_vip_is_displayed_in_the_cart_page() {
		try {
			CartPage.assertJoinVIPProgramButtonDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate Paypal payment option is displayed in the Cart page")
	public void user_validate_paypal_payment_option_is_displayed_in_the_cart_page() {
		try {
			CartPage.assertPayPalButtonDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User Click on I have source code link and enter valid source code {string}")
	public void user_click_on_i_have_source_code_link_and_enter_valid_source_code(String SourceCode)
			throws AWTException {
		try {
			CartPage.ApplyValidSourceCode(SourceCode);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate the offer applied to the Cart")
	public void user_validate_the_offer_applied_to_his_cart() {
		log.info("Valid source code is accepted and offers are appllied");
	}

	@Then("User validate Top Picks For You section with recommanded or Personalized products is diaplayed in the Cart page")
	public void user_validate_top_picks_for_you_section_with_recommanded_or_personalized_products_is_diaplayed_in_the_cart_page() {
		log.info("Top Picks section dispalyed successfully");
	}

	@Given("User click on Cart icon in the home page")
	public void user_click_on_cart_icon_in_the_home_page() {
		try {
			CartPage.clickSvgCartIcon();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User note down the total VIP savings amount for the cart")
	public void user_note_down_the_total_vip_savings_amount_for_the_cart() {
		try {
			String TotalVIPSavings_Str = CartPage.getTotalVIPSavingsAmount_CartPage();
			propertyFileModifier.setProperty("TotalVIPSavings", TotalVIPSavings_Str);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User click on Join for {double} button")
	public void user_click_on_join_for_button(Double double1) {
		try {
			CartPage.clickjoinVIPProgram_CartPage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate VIP Family popup displayed with VIP savings")
	public void user_validate_vip_family_popup_displayed_with_vip_savings() {
		try {
			CartPage.validatejoinVIPProgramPopupDispalyed_CartPage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User Click on View Cart button in the VIP family popup")
	public void user_click_on_view_cart_button_in_the_vip_family_popup() {
		try {
			CartPage.clickViewCart_CartPage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User valdiate Total amount to be paid is modified with promotion applied")
	public void user_valdiate_total_amount_to_be_paid_is_modified_with_promotion_applied() {
		try {
			String TotalEstAmountAlone = CartPage.getEstTotalAmount_CartPage();
			log.info("Modified Estimated total amount is: " + TotalEstAmountAlone);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate the Estimated total amount dispalyed is same as the VIP benefits listed previously")
	public void user_validate_the_estimated_total_amount_dispalyed_is_same_as_the_vip_benefits_listed_previously() {
		try {
			String TotalEstAmountAlone = CartPage.getEstTotalAmount_CartPage();
			// log.info("Modified Estimated total amount is: "+TotalEstAmountAlone);
			String TotalVIPSavings = propertyFileModifier.getProperty("TotalVIPSavings");
			assertTrue(TotalEstAmountAlone.contentEquals(TotalVIPSavings));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate the product is displayed with VIP Price")
	public void user_validate_the_product_is_displayed_with_vip_price() {
		try {
			String VIPPriceDisplayed = CartPage.getVIPPriceDisplayed_CartPage();
			String VIPPriceDispalyedinPDPPage = propertyFileModifier.getProperty("VIP");
			assertTrue(VIPPriceDispalyedinPDPPage.contentEquals(VIPPriceDisplayed));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Verify View Cart Page {string} and banner")
	public void verify_view_cart_page_and_banner(String value) throws InterruptedException {
		CartPage.verifyViewCartPageAndBanner(value);
	}

	@Then("Verify View Cart Page and CTA button for VIP Membership")
	public void verify_view_cart_page_and_cta_button_for_vip_membership(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyViewCartPageAndVipMembership(expectedData);
	}

	@Then("Verify View Cart Page and Quantity option {string}")
	public void verify_view_cart_page_and_quantity_option(String value) throws InterruptedException {
		CartPage.verifyViewCartPageAndQuantity(value);
	}

	@Then("Verify View Cart Page and Join VIP Link {string}")
	public void verify_view_cart_page_and_join_vip_link(String value) throws InterruptedException {
		CartPage.verifyViewCartPageAndVipLink(value);
	}

	@Then("Verify View Cart Page and Remove Functionality {string} {string}")
	public void verify_view_cart_page_and_remove_functionality(String value, String text) throws InterruptedException {
		CartPage.verifyViewCartPageAndRemoveFunctionality(value, text);
	}

	@Then("Verify View Cart Page and Checkout button response")
	public void verify_view_cart_page_and_checkout_button_response(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyViewCartPageAndCheckoutButtonResponse(expectedData);
	}

	@Then("Verify Login and Checkout button response")
	public void verify_login_and_checkout_button_response(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyLoginAndCheckoutButtonResponse(expectedData);
	}

	@Then("Verify Checkout with Paypal button response")
	public void verify_checkout_with_paypal_button_response(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyCheckoutWithPaypalButtonResponse(expectedData);
	}

	@Then("Verify Top Picks for you section")
	public void verify_top_picks_for_you_section(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyTopPicksSection(expectedData);
	}

	@Then("Verify Functionality of Product and its content {string}")
	public void verify_functionality_of_product_and_its_content(String value) throws InterruptedException {
		CartPage.verifyFunctionalityOfProductAndItsContent(value);
	}

	@Then("Verify VIP Price")
	public void verify_vip_price(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		actual = CartPage.verifyVIPPrice(expectedData);
	}

	@Then("Verify VIP Price when user is VIP member")
	public void verify_vip_price_when_user_is_vip_member(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		actuals = CartPage.verifyVIPPriceWhenUserIsVIPMember(expectedData);
	}

	@Then("Verify VIP savings")
	public void verify_vip_savings(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyVIPSavings(expectedData, actual);
	}

	@Then("Verify Estimated Total")
	public void verify_estimated_total(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyEstimatedTotal(expectedData, actuals);
	}

	@Then("Verify rewards cash")
	public void verify_rewards_cash(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyRewardCash(expectedData);
	}

	@Then("Verify Save for later and its functionality")
	public void verify_save_for_later_and_its_functionality(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifySaveForLaterAndItsFunctionality(expectedData);
	}

	@Then("Verify Checkout with Klarna button response")
	public void verify_checkout_with_klarna_button_response(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		CartPage.verifyCheckoutWithKlarnaButtonResponse(expectedData);
	}
}
