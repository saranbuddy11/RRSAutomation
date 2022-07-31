package com.RRS.StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.ATC_PopupPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ATC_PopUp_StepDefinitions extends baseClass {
	public static Logger log = LogManager.getLogger(ATC_PopUp_StepDefinitions.class);

	public List<String> actualData = null;

	@Steps
	ATC_PopupPage ATC_PopupPage;

	@Then("Assert Add to Cart popup got displayed")
	public void assert_add_to_cart_popup_got_displayed() {
		try {
			ATC_PopupPage.assertA2CPopUPDisplayed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User valdiate Add to Cart Popup displayed correct MSRP VIP price")
	public void user_valdiate_add_to_cart_popup_displayed_correct_msrp_vip_price() {
		try {
			String MSRP_DisplayedInPopup = ATC_PopupPage.getMSRPDisplayed_A2CPP();
			assertEquals(propertyFileModifier.getProperty("MSRP"), MSRP_DisplayedInPopup);
			// assertEquals(PropertiesFileReader.getProperty("MSRP"),
			// MSRP_DisplayedInPopup);

			// String expectedValue=(String) TestParams.getReference(TestReference.MSRP);
			// String expectedValue=TestParams.getReference(TestReference.MSRP);
			// log.info("Expected Value: "+expectedValue);
			// assertThat(MSRP_DisplayedInPopup==expectedValue);
			// assertEquals(TestParams.getReference(TestReference.MSRP),
			// MSRP_DisplayedInPopup);
			// assertThat(MSRP_DisplayedInPopup.equals(TestParams.getReference(TestReference.MSRP)));

			String VIP_DisplayedInPopup = ATC_PopupPage.getVIPDisplayed_A2CPP();
			// assertEquals(PropertiesFileReader.getProperty("VIP"), VIP_DisplayedInPopup);
			assertTrue(VIP_DisplayedInPopup.contains(propertyFileModifier.getProperty("VIP")));
			// log.info("Expected VIP Value: "+expectedVIPValue);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User validate selected Color size dispalyed in the Add to cart pop up")
	public void user_validate_selected_color_size_dispalyed_in_the_add_to_cart_pop_up() {
		String Color = propertyFileModifier.getProperty("Color");
		String Size = propertyFileModifier.getProperty("Size");
		try {
			ATC_PopupPage.assertColorVariantDisplayedIsCorrect(Color);
			ATC_PopupPage.assertSizeVariantDisplayedIsCorrect(Size);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User Click on View Cart button")
	public void user_click_on_view_cart_button() {
		try {
			ATC_PopupPage.clickViewCartBtn_A2CPopUp();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Verify Add to Cart Popup")
	public void verify_add_to_cart_popup(DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		actualData = ATC_PopupPage.verifyAddToCartPopup(expectedData);
	}

	@Then("Validate ATC Popup")
	public void validate_atc_popup() throws InterruptedException {
		ATC_PopupPage.validateATCPopup(actualData);
		actualData = null;
	}

	@Then("Verify Pickup in Store for selected products")
	public void verify_pickup_in_store_for_selected_products(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		ATC_PopupPage.verifyPickupInStore(expectedData);
	}

	@Then("Verify Pickup in Store name for selected products")
	public void verify_pickup_in_store_name_for_selected_products(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		ATC_PopupPage.verifyPickupInStoreName(expectedData);
	}

	@Then("Read Quantity and price of product")
	public void read_quantity_and_price_of_product(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		actualData = ATC_PopupPage.readQuantityAndPrice(expectedData);
	}

	@Then("Read product price and its quantity")
	public void read_product_price_and_its_quantity(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		actualData = ATC_PopupPage.readProductPriceAndItsQuantity(expectedData);
	}

	@Then("Verify product price and Quantity at ATC popup")
	public void verify_product_price_and_quantity_at_atc_popup() throws InterruptedException {
		ATC_PopupPage.verifyPriceAndQuantity(actualData);
		actualData = null;
	}

	@Then("Verify Quantity and its price calculation at ATC popup")
	public void verify_quantity_and_its_price_calculation_at_atc_popup() throws InterruptedException {
		ATC_PopupPage.verifyQuantityAndPriceCalculation(actualData);
		actualData = null;
	}

	@Then("choosing SKU's and Navigate to ATC")
	public void choosing_skus_and_navigate_to_atc(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		ATC_PopupPage.choosingSkuAndNavigateToAtc(expectedData);
	}

	@Then("choosing SKU's and Navigate to ATC for brand")
	public void choosing_skus_and_navigate_to_atc_for_brand(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		actualData = ATC_PopupPage.choosingSkuAndNavigateToAtcForBrand(expectedData);
	}

	@Then("choosing SKU's and Navigate to ATC to verify Checkout Button")
	public void choosing_skus_and_navigate_to_atc_to_verify_checkout_button(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		ATC_PopupPage.choosingSkuAndNavigateToAtcToVerifyCheckOutButton(expectedData);
	}

	@Then("Verify VIP price in Cart Summary Section")
	public void verify_vip_price_in_cart_summary_section(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		ATC_PopupPage.verifyVipPriceInCartSummarySection(expectedData);
	}

	@Then("Verify VIP Total and price in Cart Summary Section {string}")
	public void verify_vip_total_and_price_in_cart_summary_section(String value) throws InterruptedException {
		ATC_PopupPage.verifyVipTotalAndPriceInCartSummarySection(value);
	}

	@Then("Verify VIP Total and price calculation in Cart Summary Section {string}")
	public void verify_vip_total_and_price_calculation_in_cart_summary_section(String value)
			throws InterruptedException {
		ATC_PopupPage.verifyVipTotalAndPriceCalculationInCartSummarySection(value, actualData);
	}

	@Then("Verify View Cart Page {string}")
	public void verify_view_cart_page(String value) throws InterruptedException {
		ATC_PopupPage.verifyViewCartPage(value);
	}

	@Then("Verify Checkout Page {string}")
	public void verify_checkout_page(String value) throws InterruptedException {
		ATC_PopupPage.verifyCheckOutPage(value);
	}

	@Then("Verify VIP rewards cash calculation")
	public void verify_vip_rewards_cash_calculation() throws InterruptedException {
		ATC_PopupPage.verifyVipRewardsCashCalculation(actualData);
		actualData = null;
	}

	@Then("Verify ATC toggle and VIP rewards cash calculation")
	public void verify_atc_toggle_and_vip_rewards_cash_calculation() throws InterruptedException {
		ATC_PopupPage.verifyAtcToggleVipRewardsCashCalculation(actualData);
		actualData = null;
	}

	@Then("Verify View Cart Page with number of Items {string}")
	public void verify_view_cart_page_with_number_of_items(String value) throws InterruptedException {
		ATC_PopupPage.verifyViewCartPageAndItems(value, actualData);
	}

	@Then("Verify View Cart Page and its content {string}")
	public void verify_view_cart_page_and_its_content(String value) throws InterruptedException {
		ATC_PopupPage.verifyViewCartPageAndContent(value, actualData);
	}

	@Then("Verify View Cart Page and product name with its functionality {string}")
	public void verify_view_cart_page_and_product_name_with_its_functionality(String value)
			throws InterruptedException {
		ATC_PopupPage.verifyViewCartPageAndProduct(value, actualData);
	}
}
