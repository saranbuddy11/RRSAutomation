package com.RRS.StepDefinitions;

import java.awt.AWTException;
import java.util.List;

import com.RRS.Pages.BLPPage;
import com.RRS.base.baseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BLP_StepDefinitions extends baseClass {

	@Steps
	BLPPage blpPage;

	@Then("Verify whether the Sub categories of brand are displayed")
	public void verify_whether_the_sub_categories_of_brand_are_displayed(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		blpPage.validateBrandsSubCategories(expectedSubCat);
	}

	@Then("Verify navigation of Brands in Top Navigation Menu")
	public void verify_navigation_of_brands_in_top_navigation_menu(DataTable table)
			throws InterruptedException, AWTException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		blpPage.validateBrandsNavigation(expectedSubCat);
	}

	@Then("Verify on clicking of Alphabet {string}")
	public void verify_on_clicking_of_alphabet(String alphabet) throws AWTException {
		blpPage.verifyClickOnAlphabet(alphabet);
	}

	@Then("Validate Navigation of Particular Brand Page {string}")
	public void validate_navigation_of_particular_brand_page(String brand) throws InterruptedException, AWTException {
		blpPage.verifyNavigationOfParticularBrand(brand);
	}

	@Then("Verify navigation of Brands")
	public void verify_navigation_of_brands(DataTable table) throws InterruptedException, AWTException {
		List<List<String>> expectedSubCat = table.asLists(String.class);
		blpPage.validateBrandsNavigationPage(expectedSubCat);
	}

	@Then("Verify clicking on Large Brand")
	public void verify_clicking_on_large_brand(DataTable table) throws InterruptedException {
		List<List<String>> expectedData = table.asLists(String.class);
		blpPage.verifyNavigationOfLargeBrand(expectedData);
	}

	@Then("Verify clicking on Medium Brand")
	public void verify_clicking_on_medium_brand(DataTable table) {
		List<List<String>> brand = table.asLists(String.class);
		blpPage.verifyNavigationOfMediumBrand(brand);
	}

	@Then("Verify clicking on Small Brand")
	public void verify_clicking_on_small_brand(DataTable table) {
		List<List<String>> brand = table.asLists(String.class);
		blpPage.verifyNavigationOfSmallBrand(brand);
	}
}