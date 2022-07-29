package com.RRS.StepDefinitions;

import com.RRS.Pages.search;
import com.RRS.base.baseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import com.RRS.Pages.PLPPage;
import com.RRS.Pages.homePage;

public class search_StepDefinitions extends baseClass {

	@Steps
	search search;

	@Steps
	homePage homePage;
	
	@Steps
	PLPPage PLPpage;

	@And("User clicks on search text box")
	public void user_clicks_on_search_text_box() {
		search.click_search_SVG();
	}

	@And("User Search with a Brand name {string}")
	public void user_search_with_a_brand_name(String brandName) {
		search.user_Enter_BrandName(brandName);
	}
	
	@And("User Search with some keyword {string}")
	public void user_search_with_some_keyword(String searchKeyword) {
		search.user_Enter_SearchKeyword(searchKeyword);   
	}

	@And("User click on Search button")
	public void user_click_on_Search_button() {
		search.user_Click_Search_Button();
	}

	@Then("User lands on Brand {string} page")
	public void user_lands_on_brand_page(String brandPage) {
		search.user_lands_BrandPage(brandPage);
		System.out.println("Working");
	}
	
	@Given("User Search with a Product name {string}")
	public void user_search_with_a_Product_name(String productName) {
		search.user_Enter_ProductName(productName);

	}

	@And("User click on Enter")
	public void user_click_on_Enter() {
		search.user_Click_Enter();
	}

	@Then("User clicks on Womens filter section")
	public void user_clicks_on_womens_filter_section() {
		search.click_womens_SVG();
	}

	@Then("User clicks on Shoes filter section")
	public void user_clicks_on_shoes_filter_section() {
		search.click_category_SVG();

	}

	@Then("User clicks on Hide filter")
	public void user_clicks_on_hide_filter() {
		search.click_hide_filters();
	}

	@Then("User click on Sort by")
	public void user_click_on_sort_by() {
		search.click_sort_by();
	}

	@Then("User selects Top Rated")
	public void user_selects_top_rated() {
		search.click_top_rated();
	}

}