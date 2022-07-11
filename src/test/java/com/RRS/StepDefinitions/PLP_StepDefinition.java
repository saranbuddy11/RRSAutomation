package com.RRS.StepDefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import com.RRS.Pages.PLPPage;
import com.RRS.Pages.homePage;
import com.RRS.base.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PLP_StepDefinition extends baseClass {
	private String SearchResult = null;
	@Steps
	PLPPage PLPpage;

	@Steps
	homePage homePage;

	@Given("User Click on shop now link in any of the home page banner")
	public void user_click_on_shop_now_link_in_any_of_the_home_page_banner() throws InterruptedException {
		PLPpage.Click_ShopNow_Women();
		// PLPpage.Click_ShopNow_HomePage();
		// homePage.HoverOverAnyTopMenu("Women");
		// homePage.ClickWomensRunningSubMenu();
		// homePage.ClickAnyTopMenu("Women");
		Thread.sleep(1000);
	}

	@Then("Assert user is direceted to appropriate PLP page")
	public void assert_user_is_direceted_to_appropriate_plp_page() {
		PLPpage.Assert_PLPpage();
	}

	@Then("User Search for a product with some keywords {string} and click on search button")
	public void user_search_for_a_product_with_some_keywords_and_click_on_search_button(String Keyword) {
		/* homePage.click_RRSHomeLogo_SVG_Button(); */
		PLPpage.Type_SearchKeyword(Keyword);
		PLPpage.Click_SearchIcon();

	}

	@Then("Assert user is direceted to appropriate PLP page for the keyword used")
	public void assert_user_is_direceted_to_appropriate_plp_page_for_the_keyword_used() {
		PLPpage.Assert_PLPpage_SearchKeyword();
	}

	@Given("User click on any of the options under Sort By dropdown")
	public void user_click_on_any_of_the_options_under_sort_by_dropdown() {

	}

	@Given("User store the number of search results to a variable")
	public void user_store_the_number_of_search_results_to_a_variable() {
		SearchResult = PLPpage.getCountofSearchResults();
		PLPpage.getAllProductLinks();
	}

	@Given("User select {string} Sort by value from the dropdown")
	public void user_select_sort_by_value_from_the_dropdown(String SortByValue) throws InterruptedException {
		PLPpage.selectSortBy(SortByValue);
		Thread.sleep(3000);
	}

	@Then("User validate the results count not modified but the sorting is modified")
	public void user_validate_the_results_count_not_modified_but_the_sorting_is_modified() {
		String UpdatedSearchResult = PLPpage.getCountofSearchResults();
		assertThat(SearchResult.contentEquals(UpdatedSearchResult));
		PLPpage.getAllProductLinks();
	}

	@Given("User apply the filter {string} in the PLP page")
	public void user_apply_the_filter_in_the_plp_page(String Filter) {
		try {
			PLPpage.applyFilter(Filter);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User validate the page results based on the filter applied")
	public void user_validate_the_page_results_based_on_the_filter_applied() {
		String UpdatedSearchResult = PLPpage.getCountofSearchResults();
		System.out.println("Filter Applied Search results: " + UpdatedSearchResult);
		assertThat(!SearchResult.contentEquals(UpdatedSearchResult));
	}

	@Then("User validate review stars for the product are displayed if available")
	public void user_validate_review_stars_for_the_product_are_displayed_if_available() {
		PLPpage.ReviewDisplayed_PLP();
	}

	@Then("User validate color variations for the product are displayed if available")
	public void user_validate_color_variations_for_the_product_are_displayed_if_available() {
		PLPpage.ColorVariantDisplayed_PLP();
	}

	@Given("User scroll down to load {int} products to display Load More button")
	public void user_scroll_down_to_load_products_to_display_load_more_button(Integer MaxProducts)
			throws InterruptedException {
		PLPpage.isMaxProductsDisplayed_PLP();
	}

	@Given("User go back to the top of the page")
	public void user_go_back_to_the_top_of_the_page() throws InterruptedException {
		PLPpage.GoToTop_PLP();
	}

	@Given("User clear the applied filters")
	public void user_clear_the_applied_filters() {
		try {
			PLPpage.applyAnyFilter("Tennis & Volleyball");
			Thread.sleep(1000);
			PLPpage.clearAllFilters();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User validate the serach results are modified once the filters are cleared")
	public void user_validate_the_serach_results_are_modified_once_the_filters_are_cleared() {
		String UpdatedSearchResult_AfterClearFilter = PLPpage.getCountofSearchResults();
		assertThat(SearchResult.contentEquals(UpdatedSearchResult_AfterClearFilter));
	}

}
