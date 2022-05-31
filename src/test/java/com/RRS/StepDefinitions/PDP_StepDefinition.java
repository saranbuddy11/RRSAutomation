package com.RRS.StepDefinitions;

import com.RRS.Pages.PLPPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RRS.Pages.PDPPage;
import com.RRS.base.baseClass;


import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

public class PDP_StepDefinition extends baseClass{
	public static Logger log = LogManager.getLogger(PDP_StepDefinition.class);
	
	public String MSRP_Str=null;
	public float MSRP_Float;
	
	public String VIP_Str=null;
	public float VIP_Float;
	
	
	@Steps
	PLPPage PLPpage;
	
	@Steps
	PDPPage PDPPage;
	
	@Then("User Click on any one of the product from PLP Page")
	public void user_click_on_any_one_of_the_product_from_plp_page() throws InterruptedException {
		String FirstProductLink=PLPpage.getFirstProductLink();
		PLPpage.clickFirstProduct(FirstProductLink);
		PDPPage.waitForAdd2Cart();
	}

	@Then("Assert user is direceted to appropriate PDP page based on the selection")
	public void assert_user_is_direceted_to_appropriate_pdp_page_based_on_the_selection() {
		try {
			PDPPage.assertPDPPage();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User Search for a particular product {string} and click on search button")
	public void user_search_for_a_particular_product_and_click_on_search_button(String ProductNumber) throws InterruptedException {
		PLPpage.Type_SearchKeyword(ProductNumber);
		PLPpage.Click_SearchIcon_PDP();
		PDPPage.waitForAdd2Cart();
	}

	@Then("Assert user is direceted to appropriate PDP page")
	public void assert_user_is_direceted_to_appropriate_pdp_page() {
		try {
			PDPPage.assertPDPPage();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	
	@Then("User Verify MSRP and VIP price of the product is displayed in PDP")
	public void user_verify_msrp_and_vip_price_of_the_product_is_displayed_in_pdp() {
		try {
			MSRP_Str=PDPPage.getMSRP_Str_PDP();
			log.info("MSRP Price without $: "+MSRP_Str);
			MSRP_Float=PDPPage.getMSRP_Float_PDP(MSRP_Str);
			log.info("MSRP Price in Float without $: "+MSRP_Float);
			
			VIP_Str=PDPPage.getVIP_Str_PDP();
			log.info("VIP Price without $: "+VIP_Str);
			VIP_Float=PDPPage.getVIP_Float_PDP(VIP_Str);
			log.info("VIP Price in Float without $: "+VIP_Float);
			
			assertThat(VIP_Float<MSRP_Float);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Then("User Verify item id of the product is displayed in PDP")
	public void user_verify_item_id_of_the_product_is_displayed_in_pdp() {
		
		try {
			boolean isDisplayed=PDPPage.isItemNumberDisplayed();
			if(isDisplayed==true) {
				log.info("Item Numner is displayed");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Then("User Verify the step {int} your color in PDP - allows user to select one color at one time and image altered")
	public void user_verify_the_step_your_color_in_pdp_allows_user_to_select_one_color_at_one_time_and_image_altered(Integer int1) {
		try {
			PDPPage.clickkAnyColorvariant_PDP("Pale Grey");
			PDPPage.clickkAnyColorvariant_PDP("Black");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("User Verify the step {int}  what's your size in PDP - allows user to select one size at one time and image altered")
	public void user_verify_the_step_what_s_your_size_in_pdp_allows_user_to_select_one_size_at_one_time_and_image_altered(Integer int1) {
		try {
			PDPPage.clickkAnySizeVariant_PDP("S");
			PDPPage.clickkAnySizeVariant_PDP("M");
			PDPPage.clickkAnySizeVariant_PDP("L");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	    
	}

	@Then("User Verify size chart link is displayed for the user to view the size chart then close the size chart")
	public void user_verify_size_chart_link_is_displayed_for_the_user_to_view_the_size_chart_then_close_the_size_chart() {
		try {
			PDPPage.clickkSizeChart_PDP();
			PDPPage.click_CloseSizeChart_SVG_Button();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}

	@Then("User Verify application allow to add or decrease the quantity of the product to the max of {int}")
	public void user_verify_application_allow_to_add_or_decrease_the_quantity_of_the_product_to_the_max_of(Integer int1) {
		try {
			PDPPage.increaseProductQuantity_PDP();
			PDPPage.decreaseProductQuantity_PDP();
			PDPPage.increaseProductQuantity_Max10_PDP();
			PDPPage.decreaseProductQuantity_1_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


	@Then("User Verify product is added to cart only after user selects all the steps")
	public void user_verify_product_is_added_to_cart_only_after_user_selects_all_the_steps() {
		try {
			PDPPage.isAdd2CartClickable_PDP();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}


	@Then("User Verify the description of the product is displayed respective to the product")
	public void user_verify_the_description_of_the_product_is_displayed_respective_to_the_product() {
		try {
			PDPPage.isProductDescriptionDisplayed_PDP();
			PDPPage.storeProductDescription_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User Verify the reviews of the product is displayed respective to the product along with options to write a review")
	public void user_verify_the_reviews_of_the_product_is_displayed_respective_to_the_product_along_with_options_to_write_a_review() {
		try {
			PDPPage.reviewDetails_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("User Verify Outfit Your Run section displayed")
	public void user_verify_outfit_your_run_section_displayed() {
		try {
			PDPPage.isOutfitYourRunSectionDisplayed_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@Then("User Verify You May Also Like section displayed")
	public void user_verify_you_may_also_like_section_displayed() {
		try {
			PDPPage.isYouMayAlsoLikeSectionDisplayed_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	@Then("User Verify Free in-Store pick up option")
	public void user_verify_free_in_store_pick_up_option() {
	    log.info("In Store Pick up got displayed correctly");
	}

	@Given("User Select the color variant {string}")
	public void user_select_the_color_variant(String ColorVariant) throws IOException {
		try {
			PDPPage.clickkAnyColorvariant_PDP(ColorVariant);
			//PropertiesFileReader.setProperty("Color", ColorVariant);
			propertyFileModifier.setProperty("Color", ColorVariant);
			//log.info("Color value from property file: "+PropertiesFileReader.getProperty("Color"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Given("User Slect the size as {string}")
	public void user_slect_the_size_as(String Size) throws IOException {
		try {
			PDPPage.clickkAnySizeVariant_PDP(Size);;
			//PropertiesFileReader.setProperty("Size", Size);
			propertyFileModifier.setProperty("Size", Size);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User note down MSPR and VIP price of the product displayed")
	public void user_note_down_mspr_and_vip_price_of_the_product_displayed() throws IOException {
	    try {
			String MSRP_PDP=PDPPage.getMSRP_PricefromPDP();
			//PropertiesFileReader.setProperty("MSRP", MSRP_PDP);
			propertyFileModifier.setProperty("MSRP", MSRP_PDP);
			String VIP_PDP=PDPPage.getVIP_PricefromPDP();
			//PropertiesFileReader.setProperty("VIP", VIP_PDP);
			propertyFileModifier.setProperty("VIP", VIP_PDP);
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("User click on Add to Cart button")
	public void user_click_on_add_to_cart_button() {
		try {
			PDPPage.click_Add2Cart_PDP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
