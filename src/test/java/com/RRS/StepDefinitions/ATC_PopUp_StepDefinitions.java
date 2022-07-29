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
}
