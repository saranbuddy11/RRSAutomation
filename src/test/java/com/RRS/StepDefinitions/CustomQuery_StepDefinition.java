package com.RRS.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.CustomQueryPage;
import com.RRS.base.baseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CustomQuery_StepDefinition extends baseClass {
	public static Logger log = LogManager.getLogger(CustomQuery_StepDefinition.class);

	@Steps
	CustomQueryPage customQuery;

	@When("Click on Custom query links {word}")
	public void click_on_custom_query_links(String query) throws InterruptedException {
		customQuery.clickOnQuery(query);
	}

	@Then("Validate the header of the page {word}")
	public void validate_the_header_of_the_page(String query) {
		customQuery.validateHeaderOfPage(query);
	}

	@Then("Validate the query URL {string}")
	public void validate_the_query_url(String keyword) {
		customQuery.validateQueryURL(keyword);
	}
}
