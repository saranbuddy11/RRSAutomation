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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PDPPage extends PageObject {
	CommonPage CommonPage = new CommonPage();
	homePage homePage = new homePage();

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

	@FindBy(xpath = "//h2[contains(@class,'exclusive-heading--1FXJK variant-inventory-message--24LSX variant-inventory-green--2_8vZ')]")
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

	@FindBy(css = "div.pr-category-snippet__total")
	List<WebElementFacade> review;

	@FindBy(css = "button.product-wrapper-info-add-to-cart-btn--3RcjN")
	WebElementFacade addToCartBtn;

	@FindBy(css = "div.breadcrumb-theme-dark--37Ydz>a[href='/']")
	WebElementFacade breadCrumb_Home;

	@FindBy(css = "span.variant-color--2KSXc>img")
	List<WebElementFacade> colorSKUs;

	@FindBy(css = "div.variant-button--1ydkx>label")
	List<WebElementFacade> sizeSKUs;

	@FindBy(css = "div.rating-star-img--1jnzS")
	WebElementFacade starRating;

	@FindBy(css = "div.rating-reviews-big--27Pa->span")
	List<WebElementFacade> reviews;

	@FindBy(css = "h1.pr-headline")
	WebElementFacade reviewHeadLine;

	@FindBy(css = "section[id*='pr-review-display-']")
	WebElementFacade reviewSection;

	@FindBy(css = "div.pr-review")
	List<WebElementFacade> expertReview;

	@FindBy(css = "img[alt*='View Gallery Image #']")
	List<WebElementFacade> reviewImage;

	@FindBy(css = "h1.pr-review-snapshot-snippets-headline")
	WebElementFacade reviewSnippets;

	@FindBy(css = "span.pr-snippet-review-count")
	WebElementFacade reviewCount;

	@FindBy(css = "div.pr-snippet-stars-container>div")
	WebElementFacade reviewStarRating;

	@FindBy(css = "span.pr-reco-value")
	WebElementFacade recoValue;

	@FindBy(css = "span.pr-reco-to-friend-message")
	WebElementFacade recoMessage;

	@FindBy(css = "ul.pr-ratings-histogram")
	WebElementFacade ratingHistogram;

	@FindBy(css = "a.pr-snippet-write-review-link")
	WebElementFacade reviewLink;

	@FindBy(css = "h3.pr-header-title")
	WebElementFacade headerTitle3;

	@FindBy(css = "svg.icon--3lrU->image")
	WebElementFacade logoIcon;

	@FindBy(css = "div.price-striked--3WXpF")
	WebElementFacade msrp;

	@FindBy(css = "div.pdp-sale--ImILa")
	WebElementFacade outletPrice;

	@FindBy(css = "div.price-vip--2xw2A")
	WebElementFacade vipPrice;

	@FindBy(css = "div.variant--11-cG>p")
	List<WebElementFacade> skuVariants;

	@FindBy(css = "span.image-gallery-thumbnail-inner>img")
	List<WebElementFacade> thumbnailImage;

	@FindBy(id = "pdp-widget-holder")
	WebElementFacade thumbnailVideo;

	@FindBy(css = "button.carousel-arrow-left--3V8wa>svg")
	WebElementFacade leftArrowClick;

	@FindBy(css = "button.carousel-arrow-left--3V8wa")
	WebElementFacade leftArrow;

	@FindBy(css = "button.carousel-arrow-right--xb4ZC")
	WebElementFacade rightArrow;

	@FindBy(css = "button.carousel-arrow-right--xb4ZC>svg")
	WebElementFacade rightArrowClick;

	@FindBy(css = "div>img.iiz__img")
	List<WebElementFacade> imageZoom;

	@FindBy(css = "div.variant-button--1ydkx>label")
	List<WebElementFacade> variantSize;

	@FindBy(css = "span.variant-color--2KSXc>img")
	List<WebElementFacade> variantColor;

	@FindBy(css = "p.variant-title--A62V5>strong")
	List<WebElementFacade> variantTitle;

	@FindBy(css = "button[aria-label='Increase Quantity']")
	WebElementFacade increaseQuantity;

	@FindBy(css = "button[aria-label='Decrease Quantity']")
	WebElementFacade decreaseQuantity;

	@FindBy(css = "span.quantity-val--WXPDK")
	WebElementFacade quantity;

	@FindBy(css = "h3.mini-cart-head-title--2g-X3")
	WebElementFacade cartTitle;

	@FindBy(css = "klarna-placement[data-key='credit-promotion-badge']")
	WebElementFacade klarna;

	@FindBy(css = "div.product-detail-shoe-cushion-text--3EFQ9")
	List<WebElementFacade> productDetail;

	@FindBy(css = "div.product-detail-specs-feature--1OO98")
	WebElementFacade productDetailSpec;

	@FindBy(css = "h3.recommendations-list-title--erltF")
	List<WebElementFacade> recommendationListTitle;

	@FindBy(css = "div.recommendations-list--3zybO")
	List<WebElementFacade> recommendationList;

	@FindBy(css = "button.slider-arrow-right--t4hN5")
	List<WebElementFacade> sliderRight;

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
		getDriver().findElement(By.xpath(DynamicElement)).click();
		Thread.sleep(5000);
		//PDP_InStock_Lbl.shouldBeVisible();
	}

	@Step
	public boolean isSizeDisplayed() throws InterruptedException {
		boolean IsDisplayed = PDP_Size_Lbl.isDisplayed();
		return IsDisplayed;
	}

	@Step
	public void clickkAnyColorvariant_PDP(String ColorVariant) throws InterruptedException, AWTException {
		String DynamicElement = "//span[contains(@class,'variant-color')]/img[contains(@alt,'" + ColorVariant + "')]";
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
		Assert.assertTrue(text.contains(expectedData));
	}

	@Step
	public void verifyUserNavigationToPDP_Page() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		if(productName!=null && productName.size()>0)
		{
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
	public String verifyUserNavigationOnParticularItem(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		String name = productName.get(1).getText().toLowerCase();
		blpPage.productCards.get(1).click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(name);
		Assert.assertEquals(name.toLowerCase(), expectedData.get(0).get(0).toLowerCase());
		return name;
	}

	@Step
	public List<String> verifyUserNavigationOnParticularItemWithReviewCount(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		List<String> actuals = new ArrayList<String>();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		String name = productName.get(1).getText().toLowerCase();
		actuals.add(name);
		name = review.get(1).getText();
		actuals.add(name);
		blpPage.productCards.get(1).click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(name);
		Assert.assertEquals(actuals.get(0).toLowerCase(), expectedData.get(0).get(0).toLowerCase());
		return actuals;
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
		List<Double> size = new ArrayList<Double>();
		for (int i = 0; i < sizeSKUs.size() - 2; i++) {
			sizeSKUs.get(i).isDisplayed();
			String value = sizeSKUs.get(i).getAttribute(expectedData.get(0).get(0).toLowerCase());
			size.add(Double.valueOf(value));
		}
		List<Double> actualSize = new ArrayList<Double>();
		actualSize.addAll(size);
		Collections.sort(actualSize);
		Assert.assertEquals(actualSize, size);
	}

	@Step
	public List<String> verifyReviewsAndStarRatings(List<List<String>> expectedData) {
		List<String> actuals = new ArrayList<String>();
		starRating.shouldBeCurrentlyVisible();
		String value = reviews.get(0).getText();
		actuals.add(value);
		Assert.assertTrue(Double.valueOf(value) <= 5);
		value = reviews.get(2).getText();
		Assert.assertTrue(value.contains(expectedData.get(0).get(0)));
		Assert.assertTrue(value.matches(".*[0-9].*"));
		actuals.add(value);
		reviews.get(2).isClickable();
		return actuals;
	}

	@Step
	public void verifyReviewsCount(List<List<String>> expectedData, List<String> actuals) {
		starRating.shouldBeCurrentlyVisible();
		String value = reviews.get(0).getText();
		Assert.assertTrue(Double.valueOf(value) <= 5);
		value = reviews.get(2).getText();
		Assert.assertTrue(value.contains(expectedData.get(0).get(0)));
		Assert.assertTrue(value.matches(".*[0-9].*"));
		Assert.assertEquals(value, actuals.get(1).toLowerCase());
	}

	@Step
	public void verifyNavigationOfReviews(List<List<String>> expectedData, List<String> values)
			throws InterruptedException {
		reviews.get(2).click();
		Thread.sleep(5000);
		String title = reviewHeadLine.getText();
		Assert.assertEquals(title, expectedData.get(0).get(0));
		title = reviewSnippets.getText();
		Assert.assertEquals(title, values.get(0));
		title = reviewCount.getText();
		Assert.assertEquals(title.toLowerCase(), values.get(1));
	}

	@Step
	public void verifyProductPrices(List<List<String>> expectedData) {
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertEquals(title, expectedData.get(0).get(0).toLowerCase());
		logoIcon.shouldBeCurrentlyVisible();
		msrp.shouldBeCurrentlyVisible();
		Assert.assertTrue(msrp.getText().contains(expectedData.get(0).get(2)));
		outletPrice.shouldBeCurrentlyVisible();
		Assert.assertTrue(outletPrice.getText().contains(expectedData.get(0).get(1)));
		Assert.assertTrue(outletPrice.getText().contains(expectedData.get(0).get(2)));
		vipPrice.shouldBeCurrentlyVisible();
		Assert.assertTrue(vipPrice.getText().contains(expectedData.get(0).get(2)));
		Assert.assertTrue(vipPrice.getText().contains(expectedData.get(0).get(3)));
	}

	@Step
	public void verifySkusOfProduct(List<List<String>> expectedData) {
		CommonPage.actions_DownArrow();
		List<String> variant = new ArrayList<String>();
		for (int i = 0; i < skuVariants.size(); i++) {
			skuVariants.get(i).shouldBeCurrentlyVisible();
			variant.add(skuVariants.get(i).getText());
		}
		String[] value = variant.get(0).split("\\s+");
		Assert.assertEquals(value[0], expectedData.get(0).get(0));
		Assert.assertEquals(variant.get(1), expectedData.get(0).get(1));
		Assert.assertEquals(variant.get(2), expectedData.get(0).get(2));
	}

	@Step
	public void verifyThumbnails(String title) throws InterruptedException {
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String actualTitle = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertEquals(actualTitle, title.toLowerCase());
		thumbnailVideo.shouldBeCurrentlyVisible();
		Actions a = new Actions(getDriver());
		for (int i = 0; i < thumbnailImage.size(); i++) {
			a.moveToElement(thumbnailImage.get(i)).perform();
			thumbnailImage.get(i).shouldBeCurrentlyVisible();
		}
	}

	@Step
	public void verifyProductImage(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		leftArrowClick.shouldBeCurrentlyVisible().isClickable();
		rightArrowClick.shouldBeCurrentlyVisible().isClickable();
		String actuals = leftArrow.getAttribute(expectedData.get(0).get(0));
		Assert.assertEquals(actuals, expectedData.get(0).get(1));
		actuals = rightArrow.getAttribute(expectedData.get(0).get(0));
		Assert.assertEquals(actuals, expectedData.get(0).get(2));
		rightArrowClick.click();
		Thread.sleep(3000);
		rightArrowClick.click();
		Thread.sleep(3000);
		leftArrowClick.click();
		Thread.sleep(3000);
		leftArrowClick.click();
		Thread.sleep(3000);
		imageZoom.get(0).shouldBeCurrentlyVisible();
		Actions a = new Actions(getDriver());
		a.moveToElement(imageZoom.get(0)).perform();
		Thread.sleep(3000);
		actuals = imageZoom.get(0).getAttribute(expectedData.get(0).get(3));
		Assert.assertTrue(actuals.contains(expectedData.get(0).get(4)));
		a.moveToElement(imageZoom.get(0)).click().build().perform();
		Thread.sleep(3000);
		actuals = imageZoom.get(0).getAttribute(expectedData.get(0).get(3));
		Assert.assertFalse(actuals.contains(expectedData.get(0).get(4)));
	}

	@Step
	public void verifyAddToCartButton(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Assert.assertTrue(variantSize.size() == Integer.parseInt(expectedData.get(0).get(1)));
		Actions a = new Actions(getDriver());
		a.moveToElement(variantColor.get(1)).perform();
		variantColor.get(1).click();
		String s = variantTitle.get(0).getText();
		Assert.assertEquals(s, expectedData.get(0).get(3));
		a.moveToElement(variantSize.get(2)).perform();
		variantSize.get(2).click();
		s = variantTitle.get(1).getText();
		Assert.assertEquals(s, expectedData.get(0).get(0));
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		a.moveToElement(increaseQuantity).perform();
		increaseQuantity.click();
		s = quantity.getText();
		Assert.assertEquals(s, expectedData.get(0).get(5));
		a.moveToElement(decreaseQuantity).perform();
		decreaseQuantity.click();
		s = quantity.getText();
		Assert.assertEquals(s, expectedData.get(0).get(4));
		addToCartBtn.shouldBeCurrentlyVisible();
		a.moveToElement(addToCartBtn).perform();
		addToCartBtn.click();
		element(cartTitle).waitUntilVisible();
		cartTitle.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyKlarnaText() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageScrollDown();
		klarna.shouldBeCurrentlyVisible().isClickable();
		klarna.isPresent();
		klarna.isEnabled();
	}

	@Step
	public void verifyProductDescriptionWithExpertReview(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		Thread.sleep(5000);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		List<String> details = new ArrayList<String>();
		for (int i = 0; i < productDetail.size(); i++) {
			details.add(productDetail.get(i).getText());
			String s = details.get(i).replace("\n", " ");
			Assert.assertEquals(s, expectedData.get(0).get(i));
		}
		CommonPage.pageScrollDown();
		productDetailSpec.shouldBeCurrentlyVisible();
		CommonPage.pageScrollDown();
		reviewHeadLine.shouldBeCurrentlyVisible();
		reviewSection.isPresent();
		for (int i = 0; i < expertReview.size(); i++) {
			expertReview.get(i).isPresent();
		}
	}

	@Step
	public void verifyReviewSection(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		Actions a = new Actions(getDriver());
		a.moveToElement(reviewSection).perform();
		reviewSection.shouldBeCurrentlyVisible();
		for (int i = 0; i < reviewImage.size(); i++) {
			reviewImage.get(i).shouldBeCurrentlyVisible();
		}
		reviewHeadLine.isDisplayed();
		String title = reviewCount.getText();
		Assert.assertEquals(title, expectedData.get(0).get(0));
		title = reviewStarRating.getAttribute(expectedData.get(0).get(2));
		Assert.assertTrue(title.contains(expectedData.get(0).get(1)));
		title = recoValue.getText();
		Assert.assertEquals(title, expectedData.get(0).get(3));
		recoMessage.shouldBeCurrentlyVisible();
		ratingHistogram.shouldBePresent();
	}

	@Step
	public void verifyWriteReview(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		Thread.sleep(5000);
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(5000);
		reviewLink.shouldBeCurrentlyVisible().isClickable();
		String text = reviewLink.getText();
		Assert.assertEquals(text, expectedData.get(0).get(0));
		Actions a = new Actions(getDriver());
		a.moveToElement(reviewLink).perform();
		reviewLink.click();
		Thread.sleep(8000);
		headerTitle3.shouldBeCurrentlyVisible();
		text = headerTitle3.getText();
		Assert.assertEquals(text, expectedData.get(0).get(0));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1) + expectedData.get(0).get(2));
	}

	@Step
	public void verifyOutFitRunSection(List<List<String>> expectedData, String count)
			throws InterruptedException, AWTException {
		Thread.sleep(5000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		Thread.sleep(3000);
		String actual = recommendationListTitle.get(0).getText();
		Assert.assertEquals(actual, expectedData.get(0).get(0));
		List<WebElement> element = recommendationList.get(0)
				.findElements(By.cssSelector("span.product-card-name--1B6G4"));
		int num = element.size();
		Assert.assertEquals(num, Integer.parseInt(count));
	}

	@Step
	public void verifyYouMayAlsoLikeSection(List<List<String>> expectedData) throws InterruptedException, AWTException {
		Thread.sleep(5000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String actual = sddlpPage.productTitle.getText();
		Assert.assertEquals(actual, expectedData.get(0).get(0));
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		actual = recommendationListTitle.get(1).getText();
		Assert.assertEquals(actual, expectedData.get(0).get(1));
		List<WebElement> element = recommendationList.get(1)
				.findElements(By.cssSelector("span.product-card-name--1B6G4"));
		int num = element.size();
		Assert.assertEquals(num, Integer.parseInt(expectedData.get(0).get(2)));
		for (int i = 1; i < num; i++) {
			actual = element.get(i).getText();
			Assert.assertTrue(actual.toLowerCase().contains(expectedData.get(0).get(3).toLowerCase()));
			if (i >= 4) {
				sliderRight.get(1).click();
				Thread.sleep(3000);
			}
		}
	}
}
