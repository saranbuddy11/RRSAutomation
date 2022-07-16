package com.RRS.StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.util.List;

import com.RRS.Pages.CartPage;
import com.RRS.Pages.GenericFeatures;
import com.RRS.Pages.PDPPage;
import com.RRS.Pages.homePage;
import com.RRS.Pages.loginPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
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
	public void user_select_the_color_variant_and_size(String color, String size)
			throws InterruptedException, AWTException {
		pdpPage.clickkAnyColorvariant_PDP(color);
		Thread.sleep(5000);
		pdpPage.clickkAnySizeVariant_PDP(size);
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

	@When("User verifies Top navigation Menu should be displayed in the given order as follows")
	public void user_verifies_top_navigation_menu_should_be_displayed_in_the_given_order_as_follows(DataTable table)
			throws Throwable {
		List<List<String>> expectedMeus = table.asLists(String.class);
		homePage.verifyNavigationMenus(expectedMeus);
	}

	@When("User should be able to hover on the top nav menu and should able to see listed Categories displayed under the top navigation menu.")
	public void user_should_be_able_to_hover_on_the_top_nav_menu_and_should_able_to_see_listed_categories_displayed_under_the_top_navigation_menu()
			throws InterruptedException {
		homePage.verifyNavigationMenuCategoriesByHoverOnTopOfMenus();
	}

	@When("User should able to click Categories and directed to respective PLP Page {string} and {string}")
	public void user_should_able_to_click_categories_and_directed_to_respective_plp_page(String menu, String category)
			throws InterruptedException, AWTException {
		homePage.verifyNavigationToPLPPageFromCategory(menu, category);
	}

	@When("User should be able to hover on top nav menu of women")
	public void user_should_be_able_to_hover_on_top_nav_menu_of_women() throws InterruptedException, AWTException {
		homePage.verifyHoverOnTopNavOfWomen();
	}

	@Then("Verify SHOE, APPAREL and Top performing picks categories should be displayed in the Women top navigation menu")
	public void verify_shoe_apparel_and_top_performing_picks_categories_should_be_displayed_in_the_women_top_navigation_menu(
			DataTable table) {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		homePage.validateWomenSubCategories(expectedSubCat);
	}

	@When("Verify whether the Sub categories of SHOES are displayed")
	public void verify_whether_the_sub_categories_of_shoes_are_displayed(DataTable table) {
		List<List<String>> expectedType = table.asLists(String.class);
		homePage.verifyWomenShoeCategories(expectedType);
	}

	@When("User should be able to hover on top nav menu of kids")
	public void user_should_be_able_to_hover_on_top_nav_menu_of_kids() throws InterruptedException, AWTException {
		homePage.verifyHoverOnTopNavOfkids();
	}

	@When("Verify whether the Sub categories of kids are displayed with banner and validate the navigation")
	public void verify_whether_the_sub_categories_of_kids_are_displayed_with_banner_and_validate_the_navigation(
			DataTable table) throws InterruptedException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		homePage.validatekidsSubCategoriesAndItsNavigation(expectedSubCat);
	}

	@When("User should be able to hover on top nav menu of gear")
	public void user_should_be_able_to_hover_on_top_nav_menu_of_gear() throws InterruptedException, AWTException {
		homePage.verifyHoverOnTopNavOfGear();
	}

	@When("Verify whether the Sub categories of gear are displayed and validate the navigation")
	public void verify_whether_the_sub_categories_of_gear_are_displayed_and_validate_the_navigation(DataTable table)
			throws InterruptedException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		homePage.validateGearSubCategoriesAndItsNavigation(expectedSubCat);
	}

	@When("User should be able to hover on top nav menu of brand")
	public void user_should_be_able_to_hover_on_top_nav_menu_of_brand() throws InterruptedException, AWTException {
		homePage.verifyHoverOnTopNavOfBrands();
	}

	@When("Verify whether the Sub categories of brand are displayed and validate the navigation")
	public void verify_whether_the_sub_categories_of_brand_are_displayed_and_validate_the_navigation(DataTable table)
			throws InterruptedException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		homePage.validateBrandsSubCategoriesAndItsNavigation(expectedSubCat);
	}

	@When("User should be able to hover on top nav menu of fit finder")
	public void user_should_be_able_to_hover_on_top_nav_menu_of_fit_finder() throws InterruptedException, AWTException {
		homePage.verifyHoverOnTopNavOfFitFinder();
	}

	@When("Verify the banner and its navigation")
	public void verify_the_banner_and_its_navigation(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		homePage.verifyFitFinderBannerAndNavigation(expectedData);
	}

	@When("Verify whether the back to top upward arrow icon is displayed")
	public void verify_whether_the_back_to_top_upward_arrow_icon_is_displayed() throws AWTException {
		homePage.verifyBackToTopUpwardIcon();
	}

	@When("Verify whether the application response when the users click on back to top upward arrow icon")
	public void verify_whether_the_application_response_when_the_users_click_on_back_to_top_upward_arrow_icon() {
		homePage.verifyApplicationResponseOnBackToTopIcon();
	}

	@When("Verify Email Sign up CTA button is displayed in Footer section and validates its navigation with valid email address")
	public void verify_email_sign_up_cta_button_is_displayed_in_footer_section_and_validates_its_navigation_with_valid_email_address(
			DataTable table) throws AWTException, InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		String RndEmail = RndGenerators.RndEmail();
		homePage.verifyEmailSignUpButtonAndItsNavigation(expectedData, RndEmail);
	}

	@When("Verify Shop Now on Saucony banner and validates its navigation")
	public void verify_shop_now_on_saucony_banner_and_validates_its_navigation(DataTable table)
			throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		homePage.verifyShopNowBannerAndNavigation(expectedData);
	}

	@Given("User Lauch RRS application and navigate to home page")
	public void user_lauch_rrs_application_and_navigate_to_home_page() throws InterruptedException {
		homePage.homePage_Open();
	}

	@When("Verify the Pop up")
	public void verify_the_pop_up(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		homePage.verifyFTvPopUp(expectedData);
	}
}