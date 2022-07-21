package com.RRS.StepDefinitions;

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
}