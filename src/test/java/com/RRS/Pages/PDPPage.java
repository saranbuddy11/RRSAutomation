package com.RRS.Pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.*;


public class PDPPage extends PageObject{
	CommonPage CommonPage = new CommonPage();

	public String ProductDescription=null;

	public static Logger log = LogManager.getLogger(PDPPage.class);

	
	@FindBy(xpath="//button[normalize-space()='Add to Cart']")
	WebElementFacade PDP_Add2Cart_Btn;
	
	@FindBy(xpath="//h2[contains(normalize-space(),'Item #')]")
	WebElementFacade PDP_Item_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'product-wrapper-info-price')]/div[1]")
	WebElementFacade PDP_MSRP_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'price-vip--')]")
	WebElementFacade PDP_VIPPrice_Lbl;
	
	@FindBy(xpath="//p[contains(normalize-space(),'Color')]")
	WebElementFacade PDP_Color_Lbl;
	
	@FindBy(xpath="//p[contains(normalize-space(),'Size')]")
	WebElementFacade PDP_Size_Lbl;
	
	@FindBy(xpath="//h2[normalize-space()='IN STOCK! Ready to ship to you.']")
	WebElementFacade PDP_InStock_Lbl;
	
	@FindBy(xpath="//a[normalize-space()='Size Chart']")
	WebElementFacade PDP_SizeChart_Lnk;
	
	@FindBy(xpath="//div[contains(@class,'cms-size-chart')]")
	WebElementFacade PDP_SizeChart_Table;
	
	@FindBy(xpath="//body/div[@id='rrs-modal']/div//*[name()='svg']")
	WebElementFacade PDP_SizeChart_CloseSVG_Btn;
	
	@FindBy(xpath="//button[@aria-label='Decrease Quantity']")
	WebElementFacade PDP_DecreaseQuantity_Btn;
	
	@FindBy(xpath="//button[@aria-label='Increase Quantity']")
	WebElementFacade PDP_IncreaseQuantity_Btn;
	
	@FindBy(xpath="//span[contains(@class,'quantity-val')]")
	WebElementFacade PDP_CurrentQuantity_Lbl;
	
	@FindBy(xpath="//h1[contains(@class,'product-wrapper-title')]")
	WebElementFacade PDP_ProductDescription_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'product-wrapper-review-snippet-')]//div[contains(@class,'rating-star-')]")
	WebElementFacade PDP_ReviewStar_img;
	
	@FindBy(xpath="//a[normalize-space()='Write a Review']")
	WebElementFacade PDP_WriteReview_Lnk; 
	
	@FindBy(xpath="//h3[normalize-space()='OUTFIT YOUR RUN']")
	WebElementFacade PDP_OutfitYourRunSection_Lnk; 
	
	@FindBy(xpath="//h3[normalize-space()='YOU MAY ALSO LIKE']")
	WebElementFacade PDP_YouMayAlsoLikeSection_Lnk; 
	
	@FindBy(xpath="//h3[normalize-space()='GREAT CHOICE! YOUR ITEM IS NOW ADDED TO YOUR CART']")
	WebElementFacade PDP_A2C_Title_Lbl;
	
	
	@Step
	public void click_Add2Cart_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(PDP_Add2Cart_Btn);
		CommonPage.javaScriptExecutor_Click(PDP_Add2Cart_Btn);
		PDP_A2C_Title_Lbl.shouldBeVisible();
	}
	
	@Step
	public void isYouMayAlsoLikeSectionDisplayed_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(PDP_YouMayAlsoLikeSection_Lnk);
		PDP_YouMayAlsoLikeSection_Lnk.shouldBeVisible();
		log.info("You May Also Like section is displayed");		
	}
	
	@Step
	public void isOutfitYourRunSectionDisplayed_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(PDP_OutfitYourRunSection_Lnk);
		PDP_OutfitYourRunSection_Lnk.shouldBeVisible();
		log.info("Outfit your run is displayed");		
	}
	
	
	@Step
	public void reviewDetails_PDP() throws InterruptedException {
		PDP_ReviewStar_img.shouldBeVisible();
		log.info("Product review star is displayed");
		PDP_WriteReview_Lnk.shouldBeVisible();
		log.info("Write Review link is displayed");
		
	}
	
	@Step
	public void storeProductDescription_PDP() throws InterruptedException {
		ProductDescription=PDP_ProductDescription_Lbl.getText();
//		TestParams.setReference(TestReference.ProductDescription, ProductDescription);
		log.info("Stored Product descriotion: "+ProductDescription);
	}
	
	@Step
	public void isProductDescriptionDisplayed_PDP() throws InterruptedException {
		if(PDP_ProductDescription_Lbl.isDisplayed()) {
			log.info("Product Description displayed correctly");
		}
		else {
			log.debug("Product Description NOT displayed correctly");
		}
	}
	
	@Step
	public void isAdd2CartClickable_PDP() throws InterruptedException {
		if(PDP_Add2Cart_Btn.isClickable()) {
			log.info("Add to cart button is enabled since all steps are completed");
		}
		else {
			log.debug("Add to cart button is NOT enabled since all steps are NOT completed");
		}
	}
	
	
	@Step
	public void decreaseProductQuantity_1_PDP() throws InterruptedException {
		for(int i=1;i<=9;i++) {
			CommonPage.javaScriptExecutor_Click(PDP_DecreaseQuantity_Btn);
		}
		String CurrrentValue=PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue)==1);
	}
	
	@Step
	public void increaseProductQuantity_Max10_PDP() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			CommonPage.javaScriptExecutor_Click(PDP_IncreaseQuantity_Btn);
		}
		String CurrrentValue=PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue)==10);
	}
	
	@Step
	public void decreaseProductQuantity_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(PDP_DecreaseQuantity_Btn);
		//PDP_DecreaseQuantity_Btn.click();
		String CurrrentValue=PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue)==1);
	}
	
	@Step
	public void increaseProductQuantity_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(PDP_IncreaseQuantity_Btn);
		//PDP_IncreaseQuantity_Btn.click();
		String CurrrentValue=PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue)==2);
	}
	
	@Step
	public void click_CloseSizeChart_SVG_Button() {
		Actions a = new Actions(getDriver());
	      a.moveToElement(PDP_SizeChart_CloseSVG_Btn).
	      click().build().perform();
	      PDP_SizeChart_Lnk.shouldBeCurrentlyVisible();
	}
	
	@Step
	public void clickkSizeChart_PDP() throws InterruptedException {
		PDP_SizeChart_Lnk.shouldBeVisible();
		PDP_SizeChart_Lnk.click();
		PDP_SizeChart_Table.shouldBeVisible();
	}

	@Step
	public void clickkAnySizeVariant_PDP(String Variant) throws InterruptedException {

		String DynamicElement="//p[contains(normalize-space(),'Size')]/../div/div/span/input[@value='"+Variant+"']";
		System.out.println("Dynamic xpath created: "+DynamicElement);
		WebElement ele=getDriver().findElement(By.xpath(DynamicElement));
		//getDriver().findElement(By.xpath(DynamicElement)).click();
		CommonPage.javaScriptExecutor_Click(ele);
		Thread.sleep(500);
		PDP_InStock_Lbl.shouldBeVisible();
	}

	
	@Step
	public boolean isSizeDisplayed() throws InterruptedException {
		boolean IsDisplayed=PDP_Size_Lbl.isDisplayed();
		return IsDisplayed;
	}


	@Step
	public void clickkAnyColorvariant_PDP(String ColorVariant) throws InterruptedException {

		String DynamicElement="//span[contains(@class,\"variant-color\")]/img[contains(@alt,'"+ColorVariant+"')]";
		System.out.println("Dynamic xpath created: "+DynamicElement);
		getDriver().findElement(By.xpath(DynamicElement)).click();
		Thread.sleep(1000);
	}
	
	@Step
	public boolean isColorDisplayed() throws InterruptedException {
		boolean IsDisplayed=PDP_Color_Lbl.isDisplayed();
		return IsDisplayed;
	}
	
	@Step
	public boolean isItemNumberDisplayed() throws InterruptedException {
		boolean IsDisplayed=PDP_Item_Lbl.isDisplayed();
		return IsDisplayed;
	}
	
	
	@Step
	public String getMSRP_PricefromPDP() throws InterruptedException {
		String MSRP_PDP_with$=PDP_MSRP_Lbl.getText();
		String MSRP_PDP_Without$=MSRP_PDP_with$.replace("$", "");
		//float MSRP_float=CommonPage.convertStrFloat(MSRP_PDP_Without$);
		return MSRP_PDP_Without$;
	}
	
	@Step
	public String getVIP_PricefromPDP() throws InterruptedException {
		String VIP_PDP_with$=PDP_VIPPrice_Lbl.getText();
		log.info("VIP Prince is: "+VIP_PDP_with$);
		String VIP_PDP_Without$=VIP_PDP_with$.replace("$", "");
		String VIP_PDP_Without$_OtherStr=VIP_PDP_Without$.replace("When you join our VIP Family", "");		
		log.info("VIP Price without $ and other string: "+VIP_PDP_Without$_OtherStr);
		//float VIP_float=CommonPage.convertStrFloat(VIP_PDP_Without$_OtherStr);
		return VIP_PDP_Without$_OtherStr;
	}
	
	@Step
	public float getVIP_Float_PDP(String VIP_Str) throws InterruptedException {
		float VIP_float=CommonPage.convertStrFloat(VIP_Str);
		return VIP_float;
	}
	
	@Step
	public String getVIP_Str_PDP() throws InterruptedException {
		String VIP_PDP_with$=PDP_VIPPrice_Lbl.getText();
		log.info("VIP Prince is: "+VIP_PDP_with$);
		String VIP_PDP_Without$=VIP_PDP_with$.replace("$", "");
		String VIP_PDP_Without$_OtherStr=VIP_PDP_Without$.replace("When you join our VIP Family", "");		
		log.info("VIP Price without $ and other string: "+VIP_PDP_Without$_OtherStr);
		return VIP_PDP_Without$_OtherStr;
	}
	
	@Step
	public float getMSRP_Float_PDP(String MSRP_Str) throws InterruptedException {
		float MSRP_float=CommonPage.convertStrFloat(MSRP_Str);
		//TestParams.setReference(TestReference.MSRP, MSRP_float);
		//System.out.println("MSRP from enum: "+TestParams.getReference(TestReference.MSRP));
		return MSRP_float;
	}
	
	@Step
	public String getMSRP_Str_PDP() throws InterruptedException {
		String MSRP_PDP_with$=PDP_MSRP_Lbl.getText();
		String MSRP_PDP_Without$=MSRP_PDP_with$.replace("$", "");
		return MSRP_PDP_Without$;
	}
	
	@Step
	public void assertPDPPage() throws InterruptedException {
		PDP_Add2Cart_Btn.shouldBeCurrentlyVisible();
		PDP_Item_Lbl.shouldBeCurrentlyVisible();
	}
	
	@Step
	public void waitForAdd2Cart() throws InterruptedException {
		PDP_Add2Cart_Btn.shouldBeVisible();
	}
	
}
