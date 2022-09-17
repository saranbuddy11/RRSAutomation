package com.RRS.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.ValidateSKUImagePage;
import com.RRS.base.baseClass;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ValidateSKUImage_StepDefinition extends baseClass {
	public static Logger log = LogManager.getLogger(ValidateSKUImage_StepDefinition.class);

	@Steps
	ValidateSKUImagePage validateSKUImage;

	@Then("Verify whether black color of SKU image is displayed in the PLPs or not")
	public void verify_whether_black_color_of_sku_image_is_displayed_in_the_plps_or_not() {
		validateSKUImage.verifyBlackColorOfSKUImage();
	}
}
