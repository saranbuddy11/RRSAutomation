package com.RRS.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/features/Regression/CustomQuery/ValidateSKUImage.feature", glue = {
		"com.RRS.StepDefinitions" }, dryRun = false,
		// tags = "@SmokeSuite_Full"
		// tags = "@login_excel_NImp or @PLP_Full or @PDP_Full or @Login_Full or
		// @Myaccount_RRS or @Search_RRS or @test_feb14"
		tags = "@Regression_RK_001")
public class TestRunner {
}
