package com.RRS.StepDefinitions;

import java.awt.AWTException;

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

	@Then("Scroll to Outfit your Run Section")
	public void scroll_to_outfit_your_run_section() throws AWTException, InterruptedException {
		validateSKUImage.scrollToOutFitRunSection();
	}

	@Then("Verify whether black color of SKU image is displayed in OutFit your run section")
	public void verify_whether_black_color_of_sku_image_is_displayed_in_outfit_your_run_section()
			throws AWTException, InterruptedException {
		validateSKUImage.verifyBlackColorOfSKUImageInOutFitSection();
	}

	@Then("Verify whether black color of SKU image is displayed in You may also like section")
	public void verify_whether_black_color_of_sku_image_is_displayed_in_you_may_also_like_section()
			throws AWTException, InterruptedException {
		validateSKUImage.verifyBlackColorOfSKUImageInYouMayAlsoLikeSection();
	}

	@Then("Verify whether black color of SKU image is displayed in Top picks for you section")
	public void verify_whether_black_color_of_sku_image_is_displayed_in_top_picks_for_you_section()
			throws AWTException, InterruptedException {
		validateSKUImage.verifyBlackColorOfSKUImageInTopPicksSection();
	}
}
