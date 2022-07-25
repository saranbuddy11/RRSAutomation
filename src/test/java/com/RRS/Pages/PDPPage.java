package com.RRS.Pages;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PDPPage extends PageObject {
	CommonPage CommonPage = new CommonPage();

	@Steps
	BLPPage blpPage;

	@Steps
	SDDLPPage sddlpPage;

	@Steps
	PLPPage plpPage;

	public String ProductDescription = null;

	public static Logger log = LogManager.getLogger(PDPPage.class);

	@FindBy(css = ".product-wrapper-info-add-to-cart-btn--3RcjN")
	WebElementFacade PDP_Add2Cart_Btn;

	@FindBy(xpath = "//h2[contains(normalize-space(),'Item #')]")
	WebElementFacade PDP_Item_Lbl;

	@FindBy(xpath = "//div[contains(@class,'product-wrapper-info-price')]/div[1]")
	WebElementFacade PDP_MSRP_Lbl;

	@FindBy(xpath = "//div[contains(@class,'price-vip--')]")
	WebElementFacade PDP_VIPPrice_Lbl;

	@FindBy(xpath = "//p[contains(normalize-space(),'Color')]")
	WebElementFacade PDP_Color_Lbl;

	@FindBy(xpath = "//p[contains(normalize-space(),'Size')]")
	WebElementFacade PDP_Size_Lbl;

	@FindBy(xpath = "//h2[normalize-space()='IN STOCK! Ready to ship to you.']")
	WebElementFacade PDP_InStock_Lbl;

	@FindBy(xpath = "//a[normalize-space()='Size Chart']")
	WebElementFacade PDP_SizeChart_Lnk;

	@FindBy(xpath = "//div[contains(@class,'cms-size-chart')]")
	WebElementFacade PDP_SizeChart_Table;

	@FindBy(xpath = "//body/div[@id='rrs-modal']/div//*[name()='svg']")
	WebElementFacade PDP_SizeChart_CloseSVG_Btn;

	@FindBy(xpath = "//button[@aria-label='Decrease Quantity']")
	WebElementFacade PDP_DecreaseQuantity_Btn;

	@FindBy(xpath = "//button[@aria-label='Increase Quantity']")
	WebElementFacade PDP_IncreaseQuantity_Btn;

	@FindBy(xpath = "//span[contains(@class,'quantity-val')]")
	WebElementFacade PDP_CurrentQuantity_Lbl;

	@FindBy(xpath = "//h1[contains(@class,'product-wrapper-title')]")
	WebElementFacade PDP_ProductDescription_Lbl;

	@FindBy(xpath = "//div[contains(@class,'product-wrapper-review-snippet-')]//div[contains(@class,'rating-star-')]")
	WebElementFacade PDP_ReviewStar_img;

	@FindBy(xpath = "//a[normalize-space()='Write a Review']")
	WebElementFacade PDP_WriteReview_Lnk;

	@FindBy(xpath = "//h3[normalize-space()='OUTFIT YOUR RUN']")
	WebElementFacade PDP_OutfitYourRunSection_Lnk;

	@FindBy(xpath = "//h3[normalize-space()='YOU MAY ALSO LIKE']")
	WebElementFacade PDP_YouMayAlsoLikeSection_Lnk;

	@FindBy(xpath = "//h3[normalize-space()='GREAT CHOICE! YOUR ITEM IS NOW ADDED TO YOUR CART']")
	WebElementFacade PDP_A2C_Title_Lbl;

	@FindBy(css = "div.logo-section-logo--37woN")
	WebElementFacade home_Page_Logo;

	@FindBy(css = ".mini-cart-body-summary-btn-continue--3fwgT")
	WebElementFacade continue_Shopping_Btn;

	@FindBy(css = "svg.icon-link--XANc9")
	WebElementFacade Plp_SearchIcon_SVG;

	@FindBy(id = "ftv_email_sign_form")
	WebElementFacade hokaEmailSignForm;

	@FindBy(css = "div.rrs-modal-wrapper--1uNw5")
	WebElementFacade fTvPopUp;

	@FindBy(css = "h1.subscription-form-head--3B4u2")
	WebElementFacade subscriptionFormHead;

	@FindBy(css = "h2.product-card-name--9ffy7")
	List<WebElementFacade> productName;

	@FindBy(css = "button.product-wrapper-info-add-to-cart-btn--3RcjN")
	WebElementFacade addToCartBtn;

	@FindBy(css = "div.breadcrumb-theme-dark--37Ydz>a[href='/']")
	WebElementFacade breadCrumb_Home;

	@FindBy(css = "span.variant-color--2KSXc>img")
	List<WebElementFacade> colorSKUs;

	@FindBy(css = "div.variant-button--1ydkx>label")
	List<WebElementFacade> sizeSKUs;

	@Step
	public void click_Add2Cart_PDP() throws InterruptedException, AWTException {
//		CommonPage.javaScriptExecutor_Scroll(PDP_Add2Cart_Btn);
//		CommonPage.javaScriptExecutor_Click(PDP_Add2Cart_Btn);
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		waitFor(PDP_Add2Cart_Btn);
		PDP_Add2Cart_Btn.click();
		waitFor(PDP_A2C_Title_Lbl);
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
		ProductDescription = PDP_ProductDescription_Lbl.getText();
//		TestParams.setReference(TestReference.ProductDescription, ProductDescription);
		log.info("Stored Product descriotion: " + ProductDescription);
	}

	@Step
	public void isProductDescriptionDisplayed_PDP() throws InterruptedException {
		if (PDP_ProductDescription_Lbl.isDisplayed()) {
			log.info("Product Description displayed correctly");
		} else {
			log.debug("Product Description NOT displayed correctly");
		}
	}

	@Step
	public void isAdd2CartClickable_PDP() throws InterruptedException {
		if (PDP_Add2Cart_Btn.isClickable()) {
			log.info("Add to cart button is enabled since all steps are completed");
		} else {
			log.debug("Add to cart button is NOT enabled since all steps are NOT completed");
		}
	}

	@Step
	public void decreaseProductQuantity_1_PDP() throws InterruptedException {
		for (int i = 1; i <= 9; i++) {
			CommonPage.javaScriptExecutor_Click(PDP_DecreaseQuantity_Btn);
		}
		String CurrrentValue = PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue) == 1);
	}

	@Step
	public void increaseProductQuantity_Max10_PDP() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			CommonPage.javaScriptExecutor_Click(PDP_IncreaseQuantity_Btn);
		}
		String CurrrentValue = PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue) == 10);
	}

	@Step
	public void decreaseProductQuantity_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(PDP_DecreaseQuantity_Btn);
		// PDP_DecreaseQuantity_Btn.click();
		String CurrrentValue = PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue) == 1);
	}

	@Step
	public void increaseProductQuantity_PDP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(PDP_IncreaseQuantity_Btn);
		// PDP_IncreaseQuantity_Btn.click();
		String CurrrentValue = PDP_CurrentQuantity_Lbl.getText();
		assertThat(Integer.valueOf(CurrrentValue) == 2);
	}

	@Step
	public void click_CloseSizeChart_SVG_Button() {
		Actions a = new Actions(getDriver());
		a.moveToElement(PDP_SizeChart_CloseSVG_Btn).click().build().perform();
		PDP_SizeChart_Lnk.shouldBeCurrentlyVisible();
	}

	@Step
	public void clickkSizeChart_PDP() throws InterruptedException {
		PDP_SizeChart_Lnk.shouldBeVisible();
		PDP_SizeChart_Lnk.click();
		PDP_SizeChart_Table.shouldBeVisible();
	}

	@Step
	public void clickAnySizeVariant_PDP(String Variant) throws InterruptedException {
		String DynamicElement = "//p[contains(normalize-space(),'Size')]/../div/div/label/span[text()='" + Variant
				+ "']";
		System.out.println("Dynamic xpath created: " + DynamicElement);
		getDriver().findElement(By.xpath(DynamicElement)).click();
		Thread.sleep(5000);
		PDP_InStock_Lbl.shouldBeVisible();
	}

	@Step
	public boolean isSizeDisplayed() throws InterruptedException {
		boolean IsDisplayed = PDP_Size_Lbl.isDisplayed();
		return IsDisplayed;
	}

	@Step
	public void clickkAnyColorvariant_PDP(String ColorVariant) throws InterruptedException, AWTException {
		String DynamicElement = "//span[contains(@class,'variant-color')]/img[contains(@alt,'" + ColorVariant + "')]";
		System.out.println("Dynamic xpath created: " + DynamicElement);
		getDriver().findElement(By.xpath(DynamicElement)).click();
		Thread.sleep(1000);
	}

	@Step
	public boolean isColorDisplayed() throws InterruptedException {
		boolean IsDisplayed = PDP_Color_Lbl.isDisplayed();
		return IsDisplayed;
	}

	@Step
	public boolean isItemNumberDisplayed() throws InterruptedException {
		boolean IsDisplayed = PDP_Item_Lbl.isDisplayed();
		return IsDisplayed;
	}

	@Step
	public String getMSRP_PricefromPDP() throws InterruptedException {
		String MSRP_PDP_with$ = PDP_MSRP_Lbl.getText();
		String MSRP_PDP_Without$ = MSRP_PDP_with$.replace("$", "");
		// float MSRP_float=CommonPage.convertStrFloat(MSRP_PDP_Without$);
		return MSRP_PDP_Without$;
	}

	@Step
	public String getVIP_PricefromPDP() throws InterruptedException {
		String VIP_PDP_with$ = PDP_VIPPrice_Lbl.getText();
		log.info("VIP Prince is: " + VIP_PDP_with$);
		String VIP_PDP_Without$ = VIP_PDP_with$.replace("$", "");
		String VIP_PDP_Without$_OtherStr = VIP_PDP_Without$.replace("When you join our VIP Family", "");
		log.info("VIP Price without $ and other string: " + VIP_PDP_Without$_OtherStr);
		// float VIP_float=CommonPage.convertStrFloat(VIP_PDP_Without$_OtherStr);
		return VIP_PDP_Without$_OtherStr;
	}

	@Step
	public float getVIP_Float_PDP(String VIP_Str) throws InterruptedException {
		float VIP_float = CommonPage.convertStrFloat(VIP_Str);
		return VIP_float;
	}

	@Step
	public String getVIP_Str_PDP() throws InterruptedException {
		String VIP_PDP_with$ = PDP_VIPPrice_Lbl.getText();
		log.info("VIP Prince is: " + VIP_PDP_with$);
		String VIP_PDP_Without$ = VIP_PDP_with$.replace("$", "");
		String VIP_PDP_Without$_OtherStr = VIP_PDP_Without$.replace("When you join our VIP Family", "");
		log.info("VIP Price without $ and other string: " + VIP_PDP_Without$_OtherStr);
		return VIP_PDP_Without$_OtherStr;
	}

	@Step
	public float getMSRP_Float_PDP(String MSRP_Str) throws InterruptedException {
		float MSRP_float = CommonPage.convertStrFloat(MSRP_Str);
		// TestParams.setReference(TestReference.MSRP, MSRP_float);
		// System.out.println("MSRP from enum:
		// "+TestParams.getReference(TestReference.MSRP));
		return MSRP_float;
	}

	@Step
	public String getMSRP_Str_PDP() throws InterruptedException {
		String MSRP_PDP_with$ = PDP_MSRP_Lbl.getText();
		String MSRP_PDP_Without$ = MSRP_PDP_with$.replace("$", "");
		return MSRP_PDP_Without$;
	}

	@Step
	public void assertPDPPage() throws InterruptedException {
		waitFor(PDP_Add2Cart_Btn);
		PDP_Add2Cart_Btn.shouldBeCurrentlyVisible();
		PDP_Item_Lbl.shouldBeCurrentlyVisible();
		Thread.sleep(5000);
	}

	@Step
	public void waitForAdd2Cart() throws InterruptedException {
		PDP_Add2Cart_Btn.shouldBeVisible();
	}

	@Step
	public void navigate_BackTo_HomePage() throws InterruptedException {
		waitFor(home_Page_Logo);
		home_Page_Logo.isCurrentlyVisible();
		home_Page_Logo.click();
		Thread.sleep(5000);
	}

	@Step
	public void clickOnContinueShopping() {
		continue_Shopping_Btn.shouldBeVisible();
		continue_Shopping_Btn.click();
	}

	@Step
	public void navigateToHokaPageAndVerifyPopUp(String expectedData) throws InterruptedException {
		element(hokaEmailSignForm).waitUntilVisible();
		fTvPopUp.isVisible();
		fTvPopUp.isPresent();
		String text = subscriptionFormHead.getText();
		System.out.println(text);
		Assert.assertTrue(text.contains(expectedData));
	}

	@Step
	public void verifyUserNavigationToPDP_Page() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		String name = productName.get(0).getText().toLowerCase();
		blpPage.productCards.get(0).click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(name);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertTrue(title.contains(name.toLowerCase()));
		plpPage.breadCrumb.shouldBeCurrentlyVisible();
		String bread_crumb = plpPage.breadCrumb.getText().toLowerCase();
		Assert.assertTrue(bread_crumb.contains(name));
		CommonPage.pageScrollDown();
		addToCartBtn.shouldBeCurrentlyVisible();
	}

	@Step
	public String verifyUserNavigation() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		String name = productName.get(0).getText().toLowerCase();
		blpPage.productCards.get(0).click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(name);
		return name;
	}

	@Step
	public void verifyBreadCrumbAndItsNavigation(String productName) throws InterruptedException {
		plpPage.breadCrumb.shouldBeCurrentlyVisible();
		String bread_crumb = plpPage.breadCrumb.getText().toLowerCase();
		Assert.assertTrue(bread_crumb.contains(productName));
		breadCrumb_Home.click();
		Thread.sleep(5000);
		sddlpPage.homePageHeader.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyProductName(String productName) {
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertTrue(title.contains(productName.toLowerCase()));
	}

	@Step
	public void verifyColorSkus(List<List<String>> expectedData) {
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		CommonPage.actions_PageDown();
		List<String> color = new ArrayList<String>();
		for (int i = 0; i < colorSKUs.size(); i++) {
			colorSKUs.get(i).isDisplayed();
			String value = colorSKUs.get(i).getAttribute(expectedData.get(0).get(0).toLowerCase());
			value = value.substring(30);
			color.add(value);
		}
		List<String> actualColor = new ArrayList<String>();
		actualColor.addAll(color);
		Collections.sort(actualColor);
		Assert.assertEquals(actualColor, color);
	}

	@Step
	public void verifySizeSkus(List<List<String>> expectedData) {
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		CommonPage.actions_PageDown();
		List<Integer> size = new ArrayList<Integer>();
		for (int i = 0; i < sizeSKUs.size()-2; i++) {
			sizeSKUs.get(i).isDisplayed();
			String value = sizeSKUs.get(i).getAttribute(expectedData.get(0).get(0).toLowerCase());
			size.add(Integer.parseInt(value));
		}
		List<Integer> actualSize = new ArrayList<Integer>();
		actualSize.addAll(size);
		Collections.sort(actualSize);
		System.out.println(size + "-" + actualSize);
		Assert.assertEquals(actualSize, size);
	}
}
