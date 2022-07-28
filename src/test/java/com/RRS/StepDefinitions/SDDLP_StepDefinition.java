package com.RRS.StepDefinitions;

import java.awt.AWTException;
import java.util.List;

import com.RRS.Pages.SDDLPPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SDDLP_StepDefinition extends baseClass {

	@Steps
	SDDLPPage sddlpPage;

	@Then("Verify Search Bar and its Icon")
	public void verify_search_bar_and_its_icon(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchBar(expectedData);
	}

	@Then("Verify Searching Functionality")
	public void verify_searching_functionality(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchFunctionality(expectedData);
	}

	@Then("Verify Remove Icon and Clear Link")
	public void verify_remove_icon_and_clear_link(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifyClearFunctionality(expectedData);
	}

	@When("Verify auto Suggested Keyword Click response")
	public void verify_auto_suggested_keyword_click_response(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySuggestedKeywordResponse(expectedData);
	}

	@Then("Verify Navigation of Page to PDP Page")
	public void verify_navigation_of_page_to_pdp_page(DataTable table) {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchKeywordNavigation(expectedData);
	}

	@Then("Verify No Search Results page")
	public void verify_no_search_results_page(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifyNoSearchResultsPage(expectedData);
	}

	@Then("Verify Search Results page")
	public void verify_search_results_page(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchResultsPage(expectedData);
	}

	@Then("Verify Search Results for brand page")
	public void verify_search_results_for_brand_page(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchResultsPageForBrand(expectedData);
	}

	@Then("Verify Navigation Back to Home Page")
	public void verify_navigation_back_to_home_page(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifyNavigationBackToHome(expectedData);
	}

	@Then("Verify Search Results page and its results")
	public void verify_search_results_page_and_its_results(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifySearchResultsPageResults(expectedData);
	}

	@Then("Verify applied filters result")
	public void verify_applied_filters_result(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifyAppliedFilterResults(expectedData);
	}

	@Then("Verify navigation of brand page")
	public void verify_navigation_of_brad_page(DataTable table) throws AWTException {
		List<List<String>> expectedData = table.asLists(String.class);
		sddlpPage.verifyNavigationOfBrandPage(expectedData);
	}
}