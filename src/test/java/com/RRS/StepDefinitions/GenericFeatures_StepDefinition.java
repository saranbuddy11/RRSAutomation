package com.RRS.StepDefinitions;

import java.awt.AWTException;
import java.io.IOException;

import com.RRS.Pages.CartPage;
import com.RRS.Pages.GenericFeatures;
import com.RRS.Pages.PDPPage;
import com.RRS.Pages.homePage;
import com.RRS.Pages.loginPage;
import com.RRS.base.baseClass;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

public class GenericFeatures_StepDefinition extends baseClass {

	@Steps
	homePage homePage;

	@Steps
	loginPage loginPage;

	@Steps
	GenericFeatures GenericFeatures;

	@Steps
	CartPage cartPage;

	@Steps
	PDPPage pdpPage;

	@Given("User Clicks on Expert Advice link at top right corner of the header")
	public void user_clicks_on_expert_advice_link_at_top_right_corner_of_the_header() throws InterruptedException {
		GenericFeatures.click_expert_advice();
	}

	@Given("User Lands on Blog Site")
	public void user_lands_on_blog_site() throws InterruptedException {
	}

	@Given("User Clicks on Help link at top right corner of the header")
	public void user_clicks_on_help_link_at_top_right_corner_of_the_header() throws InterruptedException {
		GenericFeatures.click_help();
	}

	@Given("User Lands on Contact Us Page")
	public void user_lands_on_contact_us_page() throws InterruptedException {
		GenericFeatures.contact_page();
	}

	@Given("User hovers on VIP Program Menu link at top right corner of the header")
	public void user_hovers_on_vip_program_menu_link_at_top_right_corner_of_the_header() throws InterruptedException {
		GenericFeatures.hover_vip_program();
	}

	@Given("User Validates VIP Dropdown list {string}")
	public void user_validates_vip_dropdown_list(String string) throws InterruptedException {
		GenericFeatures.VIP_Dropdown_list();
	}

	@Given("User click on {string} link in VIP Drop down")
	public void user_click_on_link_in_vip_drop_down(String string) throws InterruptedException {
		GenericFeatures.user_click_on_link_in_vip_drop_down(string);
	}

	@Given("User Clicks on {string} in the Drop down")
	public void user_clicks_on_in_the_drop_down(String string) {
	}

	@Given("User Sees blank cart if no items are added to cart")
	public void user_sees_blank_cart_if_no_items_are_added_to_cart() throws InterruptedException {
		GenericFeatures.blank_cart_icon();
	}

	@Given("User Clicks on Cart icon and navigates to Empty Cart page")
	public void user_clicks_on_cart_icon_and_navigates_to_empty_cart_page() throws InterruptedException {
		GenericFeatures.click_cart_icon();
	}

	@Given("User Hovers on Top Navigation Menu")
	public void user_hovers_on_top_navigation_menu() {
	}

	@Given("User Clicks on any of the Category link in the Top navigation Drop down")
	public void user_clicks_on_any_of_the_category_link_in_the_top_navigation_drop_down() {
	}

	@Given("User navigates to Respective Category Landing Page")
	public void user_navigates_to_respective_category_landing_page() {
	}

	@Given("User Clicks on any of the Sub Category link in the Top navigation Drop down")
	public void user_clicks_on_any_of_the_sub_category_link_in_the_top_navigation_drop_down() {
	}

	@Given("User navigates to Respective Product Listing Page")
	public void user_navigates_to_respective_product_listing_page() {
	}

	@Given("User Clicks on Brands in the Top Navigation")
	public void user_clicks_on_brands_in_the_top_navigation() throws InterruptedException {
		GenericFeatures.click_brand();
	}

	@Given("User Lands on Brand Landing Page")
	public void user_lands_on_brand_landing_page() throws InterruptedException {
		GenericFeatures.brand_page();
	}

	@Given("User Clicks on Fit Finder in the Top Navigation")
	public void user_clicks_on_fit_finder_in_the_top_navigation() throws InterruptedException {
		GenericFeatures.click_fit_finder();
	}

	@Given("User Lands on Perfect Fit Finder Page")
	public void user_lands_on_perfect_fit_finder_page() throws InterruptedException {
		GenericFeatures.fit_finder_page();
	}

	@Given("User Scrolls down till the bottom to see Back to Top Icon")
	public void user_scrolls_down_till_the_bottom_to_see_back_to_top_icon() throws AWTException {
		GenericFeatures.pageScrollDown();
		GenericFeatures.pageScrollDown();
	}

	@Given("User Clicking on the Back to Top Icon navigates to top of the page")
	public void user_clicking_on_the_back_to_top_icon_navigates_to_top_of_the_page() throws InterruptedException {
		GenericFeatures.click_back_to_top();
	}

	@When("User Verify on Blank cart Icon is Displayed")
	public void user_verify_on_blank_cart_icon_is_displayed() throws InterruptedException {
		String count = GenericFeatures.check_blank_cart();
		assertEquals(Integer.parseInt(count), 0);
	}

	@When("User Clicks on Cart Icon")
	public void user_clicks_on_cart_icon() throws InterruptedException {
		GenericFeatures.click_blank_cart();
	}

	@Then("User navigate to Cart Page and validates the message")
	public void user_navigate_to_cart_page_and_validates_the_message() {
		cartPage.assertCartPageDisplayedAndValidateMessage();
	}

	@Then("User Clicks on continue shopping button")
	public void user_clicks_on_continue_shopping_button() throws InterruptedException {
		cartPage.clickOnContinueShopping();
	}

	@Then("User navigate back to Home page")
	public void user_navigate_back_to_home_page() throws InterruptedException {
		pdpPage.navigate_BackTo_HomePage();
		GenericFeatures.assertHomePageDisplayed();
	}

	@When("User Select the color variant {string} and size {string}")
	public void user_select_the_color_variant_and_size(String colorVariant, String size)
			throws IOException, AWTException {
		try {
			pdpPage.clickkAnyColorvariant_PDP(colorVariant);
			propertyFileModifier.setProperty("Color", colorVariant);
			Thread.sleep(5000);
			pdpPage.clickkAnySizeVariant_PDP(size);
			propertyFileModifier.setProperty("Size", size);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User click on Add to Cart button and Click Continue Shopping")
	public void user_click_on_add_to_cart_button_and_click_continue_shopping() throws AWTException {
		try {
			pdpPage.click_Add2Cart_PDP();
			Thread.sleep(5000);
			pdpPage.clickOnContinueShopping();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User Verify on Item count on Cart and Clicks on Cart Icon")
	public void user_verify_on_item_count_on_cart_and_clicks_on_cart_icon() throws InterruptedException {
		String count = GenericFeatures.check_blank_cart();
		assertEquals(Integer.parseInt(count), 1);
		GenericFeatures.click_blank_cart();
		Thread.sleep(5000);
	}

	@Then("User navigate to Cart Page and validates the Items displayed")
	public void user_navigate_to_cart_page_and_validates_the_items_displayed() throws InterruptedException {
		cartPage.assertCartPageDisplayedAndValidateItemDisplayed();
	}
}