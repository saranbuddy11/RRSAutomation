package com.RRS.StepDefinitions;

import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.AWTException;
import java.util.List;

import com.RRS.Pages.*;

public class homePage_StepDefinition extends baseClass {

	@Steps
	homePage homePage;

	@Given("User click on the RRS home page logo")
	public void user_click_on_the_rrs_home_page_logo() {
		homePage.click_RRSHomeLogo_SVG_Button();
	}

	@Given("Assert Top banner is displayed for Guest user")
	public void assert_top_banner_is_displayed_for_guest_user() throws AWTException {
		homePage.assert_top_banner_is_displayed_for_guest_user();
	}

	@Given("Assert Start My Fitting Now button is clickable")
	public void assert_start_my_fitting_now_button_is_clickable() {
		homePage.assert_start_my_fitting_now_button_is_clickable();
	}

	@Given("Assert Categories banner has appropriate categories name")
	public void assert_categories_banner_has_appropriate_categories_name() {
		homePage.assert_categories_banner_has_appropriate_categories_name();
	}

	@Given("Assert {int} categories are displayed")
	public void assert_categories_are_displayed(Integer count) {
		homePage.assert_categories_are_displayed(count);
	}

	@Then("User click on {string} in Running shoes category")
	public void user_click_on_in_running_shoes_category(String text) throws InterruptedException {
		homePage.user_click_on_in_running_shoes_category(text);
	}

	@Then("User Assert {string} page is displayed")
	public void user_assert_page_is_displayed(String string) {
		homePage.user_assert_page_is_displayed(string);
	}

	@Then("User Assert {string} page is displayed for SHOP BY BRAND")
	public void user_assert_page_is_displayedforShopByBrand(String string) {
		homePage.user_assert_page_is_displayedforShopByBrand(string);
	}

	@Given("Assert {int} sub Categories are displayed under SHOP BY CATEGORY")
	public void assert_sub_categories_are_displayed_under_shop_by_category(Integer count) {
		homePage.assert_sub_categories_are_displayed_under_shop_by_category(count);
	}

	@Then("User click on {string} in SHOP BY CATEGORY")
	public void user_click_on_in_shop_by_category(String string) throws InterruptedException {
		homePage.user_click_on_in_shop_by_category(string);
	}

	@Given("Assert {int} sub Categories are displayed under SHOP BY BRAND")
	public void assert_sub_categories_are_displayed_under_shop_by_brand(Integer count) {
		homePage.assert_sub_categories_are_displayed_under_shop_by_brand(count);
	}

	@Given("Assert Shop All Brands button is clickable")
	public void assert_shop_all_brands_button_is_clickable() throws InterruptedException {
		homePage.assert_shop_all_brands_button_is_clickable();

	}

	@Then("User click on {string} in SHOP BY BRAND")
	public void user_click_on_in_shop_by_brand(String string) throws InterruptedException {
		homePage.user_click_on_in_shop_by_brand(string);
	}

	@Given("Assert FIND YOUR PERFECT FITTING SHOES FAST section is displayed")
	public void assert_find_your_perfect_fitting_shoes_fast_section_is_displayed() throws AWTException {
		homePage.assert_find_your_perfect_fitting_shoes_fast_section_is_displayed();
	}

	@Given("Assert Start Your Online Fitting button is clickable")
	public void assert_start_your_online_fitting_button_is_clickable() throws InterruptedException, AWTException {
		homePage.pageScrollDown();
		homePage.pageScrollDown();
		homePage.assert_start_your_online_fitting_button_is_clickable();
	}

	@Given("Assert VIP Program Banner is displayed")
	public void assert_vip_program_banner_is_displayed() throws InterruptedException {
		homePage.assert_vip_program_banner_is_displayed();
	}

	@Given("Assert Become a VIP button is clickable")
	public void assert_become_a_vip_button_is_clickable() throws InterruptedException {
		homePage.assert_become_a_vip_button_is_clickable();

	}

	@Given("Assert Learn More button is clickable")
	public void assert_learn_more_button_is_clickable() throws InterruptedException {
		homePage.assert_learn_more_button_is_clickable();
	}

	@Given("Assert THIS WEEKS MOST-ASKED-FOR SHOES section is displayed")
	public void assert_this_weeks_most_asked_for_shoes_section_is_displayed() {
		homePage.assert_this_weeks_most_asked_for_shoes_section_is_displayed();
	}

	@Given("Assert Shop All button is clickable in THIS WEEKS MOST-ASKED-FOR SHOE section")
	public void assert_shop_all_button_is_clickable_in_this_weeks_most_asked_for_shoe_section()
			throws InterruptedException {
		homePage.assert_shop_all_button_is_clickable_in_this_weeks_most_asked_for_shoe_section();
	}

	@Given("Assert YOUR BESTSELLING PERFORMANCE APPAREL section is displayed")
	public void assert_your_bestselling_performance_apparel_section_is_displayed() {
		homePage.assert_your_bestselling_performance_apparel_section_is_displayed();
	}

	@Given("Assert Shop All button is clickable in YOUR BESTSELLING PERFORMANCE APPAREL section")
	public void assert_shop_all_button_is_clickable_in_your_bestselling_performance_apparel_section()
			throws InterruptedException {
		homePage.assert_shop_all_button_is_clickable_in_your_bestselling_performance_apparel_section();
	}

	@Given("Assert {string} user details display at Account Icon section")
	public void assert_user_details_display_at_account_icon_section(String string) {
		homePage.assert_user_details_display_at_account_icon_section(string);
	}

	@Given("Assert user name details display at Top Banner")
	public void assert_user_name_details_display_at_top_banner() {
		homePage.assert_user_name_details_display_at_top_banner();
	}

	@Given("Assert VIP Cash Rewards details is displayed")
	public void assert_vip_cash_rewards_details_is_displayed() {
		homePage.assert_vip_cash_rewards_details_is_displayed();
	}

	@Given("Assert {string} user History Section is displayed")
	public void assert_user_history_section_is_displayed(String string) {
		homePage.assert_history_section_is_displayed(string);
	}

	@Given("Assert Item details are displayed in History Section")
	public void assert_item_details_are_displayed_in_history_section() {
		homePage.assert_item_details_are_displayed_in_history_section();
	}

	@Given("Assert Recently Ordered Product details are displayed in History Section")
	public void assert_recently_ordered_product_details_are_displayed_in_history_section() {
		homePage.assert_recently_ordered_product_details_are_displayed_in_history_section();
	}

	@Given("Assert Recommended for you Product details are displayed in History Section")
	public void assert_recommended_for_you_product_details_are_displayed_in_history_section()
			throws InterruptedException {
		homePage.assert_recommended_for_you_product_details_are_displayed_in_history_section();
	}

	@Given("Assert wearometer is displayed on Product details in History Section")
	public void assert_wearometer_is_displayed_on_product_details_in_history_section() {
		homePage.assert_wearometer_is_displayed_on_product_details_in_history_section();
	}

	@Given("Assert TODAYs TOP SELLERS IN AMERICA section is displayed")
	public void assert_toda_ys_top_sellers_in_america_section_is_displayed() {
		homePage.assert_toda_ys_top_sellers_in_america_section_is_displayed();
	}

	@Given("Assert Shop All button is clickable in TODAYS TOP SELLERS IN AMERICA section")
	public void assert_shop_all_button_is_clickable_in_todays_top_sellers_in_america_section()
			throws InterruptedException {
		homePage.assert_shop_all_button_is_clickable_in_todays_top_sellers_in_america_section();
	}

	@Given("Assert LOVE BROOKS? HERES THEIR NEWEST! section is displayed")
	public void assert_love_brooks_heres_their_newest_section_is_displayed() {
		homePage.assert_love_brooks_heres_their_newest_section_is_displayed();
	}

	@Given("Assert Shop All button is clickable in LOVE BROOKS? HERES THEIR NEWEST! section")
	public void assert_shop_all_button_is_clickable_in_love_brooks_heres_their_newest_section()
			throws InterruptedException {
		homePage.assert_shop_all_button_is_clickable_in_love_brooks_heres_their_newest_section();
	}

	@Given("Assert YOUR FAVORITE SHOPS section is displayed")
	public void assert_your_favorite_shops_section_is_displayed() {
		homePage.assert_your_favorite_shops_section_is_displayed();
	}

	@Given("Assert VIP FAMILY BESTSELLING PERFORMANCE APPAREL is displayed")
	public void assert_vip_family_bestselling_performance_apparel_is_displayed() {
		homePage.assert_vip_family_bestselling_performance_apparel_is_displayed();
	}

	@Then("User click on {string} in VIP FAMILY BESTSELLING PERFORMANCE APPAREL Category")
	public void user_click_on_in_vip_family_bestselling_performance_apparel_category(String string)
			throws InterruptedException {
		homePage.user_click_on_in_vip_family_bestselling_performance_apparel_category(string);
	}

	@Then("User Assert {string} product details page is displayed")
	public void user_assert_product_details_page_is_displayed(String string) {
		homePage.user_assert_product_details_page_is_displayed(string);
	}

	@Then("User click on {string} in YOUR FAVORITE SHOPS section")
	public void user_click_on_in_your_favorite_shops_section(String string) throws InterruptedException {
		homePage.user_click_on_in_your_favorite_shops_section(string);
	}

	@Given("User Land on the RRS home page after login with VIP user")
	public void user_land_on_the_rrs_home_page_after_login_with_vip_user(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		homePage.loginUser(expectedData);
	}
	
	@Given("User should able to see three featured categories in home page")
	public void user_should_able_to_see_three_featured_categories_in_home_page() {
		homePage.verifyFeaturedCategories();
	}
	@When("Verify navigation of Clicking on feature in home page")
	public void verify_navigation_of_clicking_on_feature_in_home_page() {
	 
	}
}
