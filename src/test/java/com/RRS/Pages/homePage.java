package com.RRS.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

public class homePage extends PageObject {

	public static Logger log = LogManager.getLogger(homePage.class);
	CommonPage CommonPage = new CommonPage();

	@FindBy(xpath = "//input[@name='emailAddress']")
	WebElementFacade EmailCapturePopUp;

	@FindBy(xpath = "//body/div[@id='rrs-modal']/div//*[name()='svg']")
	WebElementFacade EmailCapturePopUp_Close;

	@FindBy(css = "div.rrs-modal-wrapper--1uNw5")
	WebElementFacade fTvPopUp;

	@FindBy(css = "h1.subscription-form-head--3B4u2")
	WebElementFacade subscriptionFormHead;

	@FindBy(xpath = "//a[@aria-label='Road Runner Sports Logo']//*[name()='svg']")
	WebElementFacade RRSHomeLogo_SVG;

	@FindBy(xpath = "//button[normalize-space()='Shop Outlet']")
	WebElementFacade ShopOutlet_Btn;

	@FindBy(xpath = "//button[normalize-space()='Start My Fitting Now']")
	WebElementFacade StartMyFitNow_Btn;

	@FindBy(xpath = "//a[@href='/category/womens/shoes/running']")
	WebElementFacade SubMenu_WomensRunning_Lnk;

	@FindBy(xpath = "//h1[text()='WELCOME TO YOUR PERFECT FIT']")
	WebElementFacade topBannerGuestuser;

	@FindBy(xpath = "//div[contains(@class,'banner-header-title')]/h1")
	WebElementFacade topBannerVIPuser;

	@FindBy(xpath = "//h1[text()='PERFECT FIT ']")
	WebElementFacade perfectFitLabel;

	@FindBy(xpath = "//button[text()='Shop All Brands']")
	WebElementFacade shopAllBrands_Btn;

	@FindBy(xpath = "//h1[text()='SHOP BY BRAND']")
	WebElementFacade shopByBrand_txt;

	@FindBy(xpath = "//a[text()='Learn More']")
	WebElementFacade learnMore_Lnk;

	@FindBy(xpath = "//div[@class='pff-vid-copy']//h1[contains(text(),'Find Your Perfect Fitting Shoes Fast!')]")
	WebElementFacade findYourPerfectFittingShoes_banner;

	@FindBy(xpath = "//h2[contains(text(),'Most-Asked-For Shoes')]/following::div[1][contains(@class,'align-items-center')]")
	WebElementFacade mostAskedForSection;

	@FindBy(xpath = "//h2[contains(text(),'Your Bestselling Performance Apparel')]/following::div[1][contains(@class,'align-items-center')]")
	WebElementFacade yourBestSellingApparelSection;

	@FindBy(xpath = "//h2[contains(text(),'Most-Asked-For Shoes')]/..//button[text()='Shop All']")
	WebElementFacade mostAskedForSectionShopAll;

	@FindBy(xpath = "//h2[contains(text(),'Your Bestselling Performance Apparel')]/..//button[text()='Shop All']")
	WebElementFacade yourBestSellingApparelSectionShopAll;

	@FindBy(xpath = "//a[text()='Start Your Online Fitting']")
	WebElementFacade startYourOnlineFitting_Lnk;

	@FindBy(xpath = "//div[contains(@class,'vip-promotion--')]")
	WebElementFacade vipPromotion_Banner;

	@FindBy(xpath = "//button[contains(text(),'BECOME A VIP')]")
	WebElementFacade becomeAVIP_Btn;

	@FindBy(xpath = "//h3[text()='GREAT CHOICE! YOUR ITEM IS NOW ADDED TO YOUR CART']")
	WebElementFacade vipAddCard_Lbl;

	@FindBy(xpath = "//h1[text()='VIP FAMILY REWARDS']")
	WebElementFacade vipFamilyRewards_txt;

	@FindBy(xpath = "//h2[contains(text(),'S HISTORY')]")
	WebElementFacade historySection_txt;

	@FindBy(xpath = "//h1[contains(@class,'product-wrapper-title')]")
	WebElementFacade productTitle_txt;

	@FindBy(xpath = "//div[contains(@class,'section-account-text')]//span")
	WebElementFacade accountNameSection_txt;

	@FindBy(xpath = "//div[contains(@class,'section-account-text')]//strong[contains(text(),Cash)]")
	WebElementFacade accountCashSection_txt;

	@FindBy(xpath = "(//div[contains(@class,'banner-box-text')]/h2)[1]")
	WebElementFacade vipRewardCashAmount_txt;

	@FindBy(xpath = "(//div[contains(@class,'banner-box-text')]/p)[1]")
	WebElementFacade vipRewardCashContent_txt;

	@FindBy(xpath = "(//div[contains(@class,'banner-box-text')]/h2)[2]")
	WebElementFacade vipSavingAmount_txt;

	@FindBy(xpath = "(//div[contains(@class,'banner-box-text')]/p)[2]")
	WebElementFacade vipSavingAmountContent_txt;

	@FindBy(xpath = "//h2[contains(text(),'Top Sellers in America')]/following::button[1][text()='Shop All']")
	WebElementFacade topSellersInAmericashopAll_btn;

	@FindBy(xpath = "//h2[contains(text(),'Love Brooks')]/following::button[1][text()='Shop All Brooks']")
	WebElementFacade loveBrokesSectionShopAll_Btn;

	@FindBy(xpath = "//a[contains(@aria-label,'The Hottest Brands of Running shoes')]")
	List<WebElementFacade> hottestBrands_Lnk;

	@FindBy(xpath = "//a[contains(@aria-label,'The Hottest Brands of Running shoes') and contains(text(),'Shop Women')]")
	WebElementFacade hottestBrandsWomen_Lnk;

	@FindBy(xpath = "//a[contains(@aria-label,'The Best Running Apparel')]")
	List<WebElementFacade> bestRunningApparel_Lnk;

	@FindBy(xpath = "//a[contains(@aria-label,'Brooks Glycerin 20')]")
	List<WebElementFacade> BrooksGlycerin_Lnk;

	@FindBy(xpath = "//div[@id='card-two-link-root']/div")
	List<WebElementFacade> featuredCategories_banner;

	@FindBy(xpath = "//div[contains(@class,'product-listing-title')]/h1")
	WebElementFacade productListingTitle;

	@FindBy(xpath = "//h1[contains(@class,'brand-content-title')]")
	WebElementFacade brandContentTitle;

	@FindBy(xpath = "//h2[text()='SHOP BY CATEGORY']/following::div[1]/div//a//h2")
	List<WebElementFacade> shopByCategory;

	@FindBy(xpath = "//h2[contains(text(),'Top Sellers in America')]/following::div[contains(@class,'slider-inner')][1]/div")
	List<WebElementFacade> topSellerInAmerica;

	@FindBy(xpath = "//h2[text()='SHOP BY BRAND']/following::div[1]/div//a//img")
	List<WebElementFacade> shopByBrand;

	@FindBy(xpath = "//h2[contains(text(),'S HISTORY')]/following::div[contains(@class,'slider-inner')][1]/div")
	List<WebElementFacade> historySectionProduct_lnk;

	@FindBy(xpath = "//h2[contains(text(),'HISTORY')]/following::button[contains(@class,'slider-arrow-right')][1]")
	WebElementFacade historySectionSlide_btn;

	@FindBy(xpath = "//div[contains(@class,'product-card-purchase')]/p[text()='Recommended for you']")
	WebElementFacade historySectionRecommandedlist;

	@FindBy(xpath = "//h2[contains(text(),'Love Brooks?')]/following::div[contains(@class,'slider-inner')][1]/div")
	List<WebElementFacade> loveBrokesSection;

	@FindBy(xpath = "//h2[contains(text(),'YOUR FAVORITE SHOPS')]/following::div[contains(@class,'promo-banner-card')]//h2")
	List<WebElementFacade> yourFavoriteShopsSection;

	@FindBy(xpath = "//h2[contains(text(),'VIP Family Bestselling Performance Apparel')]/following::div[contains(@class,'slider-inner')][1]/div//small")
	List<WebElementFacade> vipFamilyBestsellingApparelSection;

	@FindBy(css = "li.menu-item--3cZEn>a")
	List<WebElementFacade> navigationMenus;

	@FindBy(css = ".expandable-block--1BXyp")
	List<WebElementFacade> menuSubCategories;

	@FindBy(css = "div.category--3WjBw>h4>a")
	List<WebElementFacade> menuSubCategoriesType;

	@FindBy(css = "div.categoryKids--1jGpl>h4>a")
	List<WebElementFacade> kidsSubCategories;

	@FindBy(css = "li.items-category-link--12dlE>a[href*='womens/shoes']")
	List<WebElementFacade> womenShoeType;

	@FindBy(css = "li.items-category-link--12dlE>a[href*='gloves']")
	WebElementFacade gearSubCategoryGloves;

	@FindBy(css = "a[href*='womens/shoes']>h5.tag_h5--15p8m")
	List<WebElementFacade> womenShoeSpecialType;

	@FindBy(css = "a[href*='calendar']>h5")
	List<WebElementFacade> shoeCalendar;

	@FindBy(css = "div.product-listing-title--3NhpO>.tag_h1--hWc2x")
	WebElementFacade pLPTitle;

	@FindBy(css = ".tag_h1--hWc2x")
	WebElementFacade pageTitle;

	@FindBy(css = "h1.steps-nav-title--3eb_y")
	WebElementFacade fitFinderPageTitle;

	@FindBy(css = ".brand-content-title--3-TvC")
	WebElementFacade brandPageTitle;

	@FindBy(css = "a[href*='catalog/kids']>img")
	WebElementFacade kidsCatalogImage;

	@FindBy(css = "h1.brand-content-title--3-TvC")
	WebElementFacade kidsBrandContentTitle;

	@FindBy(xpath = "(//a[contains(text(),'Nike')])[1]")
	WebElementFacade nikeBrandSubCat;

	@FindBy(css = "a[href*='shoefinder']>img[src*='main']")
	WebElementFacade fitFinderBanner;

	@FindBy(css = "button.back-to-top--2iv3K")
	WebElementFacade backToTopBtn;

	@FindBy(css = "div.text-align-left--1c_kk>a")
	WebElementFacade topNavLinks;

	@FindBy(css = "input[aria-label='Email Signup']")
	WebElementFacade emailSignUpInput;

	@FindBy(css = "div.justify-flex-end--1pK1_+button[type='submit']")
	WebElementFacade emailSignUpBtn;

	@FindBy(css = "div.logo-section-logo--37woN")
	WebElementFacade home_Page_Logo;

	@FindBy(css = "div.banner_hp_saucony_content")
	WebElementFacade saucoyBanner;

	@FindBy(css = "div.banner_hp_korsa_text")
	WebElementFacade korsaBanner;

	@FindBy(css = "div.banner_hp_saucony_logo")
	WebElementFacade saucoyLogo;

	@FindBy(css = "div.banner_hp_korsa_logo")
	WebElementFacade korsaLogo;

	@FindBy(css = "a[href*='korsa-spring']")
	WebElementFacade shopKorsaBtn;

	@FindBy(css = "a[href*='Saucony%20Price']")
	WebElementFacade shopNowBtn;

	@FindBy(css = "div.section-account--3E2hg")
	WebElementFacade Login_SVG;

	@FindBy(css = "div.modal-header--JbrIa>h2.tag_h2--2y8Ae")
	WebElementFacade myAccountLogin_Lbl;

	@FindBy(id = "login_emailAddress")
	WebElementFacade Enter_EmailAddress;

	@FindBy(id = "login_password")
	WebElementFacade Enter_Password;

	@FindBy(xpath = "//button[normalize-space()='Log In']")
	WebElementFacade Login_Btn;

	@FindBy(css = "div.promo-banner-card--3DqIA>a[href*='HOKA']")
	WebElementFacade Feature_Banner_Hoka;

	@FindBy(css = "a[href*='HOKA']")
	List<WebElementFacade> Feature_Hoka;

	@FindBy(css = "div.promo-banner-card--3DqIA>a[href*='Nike']")
	WebElementFacade Feature_Banner_Nike;

	@FindBy(css = "div.promo-banner-card--3DqIA>a[href*='adidas']")
	WebElementFacade Feature_Banner_Adidas;

	@FindBy(css = "h2.carousel-head-title--1u1O8")
	List<WebElementFacade> Shop_By_Cat_Title;

	@FindBy(css = ".promo-banner-title--2LyS2")
	WebElementFacade Promo_Banner_Title;

	@FindBy(css = "img[name*='Favorite Shops']")
	List<WebElementFacade> Shop_By_Brands;

	@FindBy(css = "h2.carousel-head-title--1u1O8+a[aria-label*='Apparel']")
	WebElementFacade Shop_By_Cat_Btn;

	@FindBy(css = "button[aria-label*='Top Sellers']")
	WebElementFacade Shop_All_Top_Seller_Btn;

	@Step
	public void ClickWomensRunningSubMenu() throws InterruptedException {
		MoveMouse.to(SubMenu_WomensRunning_Lnk);
		SubMenu_WomensRunning_Lnk.click();
	}

	@Step
	public void ClickAnySubMenu(String SubMenuName) throws InterruptedException {

		String DynamicXPATH = "//a[text()='" + SubMenuName + "'][1]";
		System.out.println("Dynamic xpath created: " + DynamicXPATH);
		getDriver().findElement(By.xpath(DynamicXPATH)).click();
		Thread.sleep(300);
	}

	@Step
	public void HoverOverAnyTopMenu(String MenuName) throws InterruptedException {

		String DynamicXPATH = "//a[normalize-space()='" + MenuName + "']";
		System.out.println("Dynamic xpath created: " + DynamicXPATH);
		WebElement ele = getDriver().findElement(By.xpath(DynamicXPATH));
		Actions action = new Actions(getDriver());
		action.moveToElement(ele).perform();
		Thread.sleep(300);
	}

	@Step
	public void ClickAnyTopMenu(String MenuName) throws InterruptedException {

		String DynamicXPATH = "//a[normalize-space()='" + MenuName + "']";
		System.out.println("Dynamic xpath created: " + DynamicXPATH);
		getDriver().findElement(By.xpath(DynamicXPATH)).click();
		Thread.sleep(5000);
	}

	@Step
	public void click_RRSHomeLogo_SVG_Button() {
		Actions a = new Actions(getDriver());
		a.moveToElement(RRSHomeLogo_SVG).click().build().perform();
		StartMyFitNow_Btn.shouldBeVisible();
	}

	@Step
	public void homePage_Open() throws InterruptedException {
		open();

		log.debug("Browser launched with the URL");
		Thread.sleep(5000);
		// element(EmailCapturePopUp).waitUntilVisible();
		/*
		 * while(EmailCapturePopUp.isDisplayed()==true) { Thread.sleep(1000);
		 * System.out.println("Waiting for popup");
		 * 
		 * }
		 */
	}

	@Step
	public void homepage_PopUpClose() {
		EmailCapturePopUp_Close.click();
	}

	@Step
	public void assert_top_banner_is_displayed_for_guest_user() throws AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(topBannerGuestuser);
		topBannerGuestuser.shouldBeVisible();
	}

	@Step
	public void assert_start_my_fitting_now_button_is_clickable() {
		waitFor(StartMyFitNow_Btn);
		clickOn(StartMyFitNow_Btn);
		perfectFitLabel.shouldBeVisible();
	}

	@Step
	public void assert_categories_banner_has_appropriate_categories_name() {
		Assert.assertTrue(hottestBrands_Lnk.get(0).containsText("Shop Women's"));
		Assert.assertTrue(hottestBrands_Lnk.get(1).containsText("Shop Men's"));
		Assert.assertTrue(bestRunningApparel_Lnk.get(0).containsText("Shop Women's"));
		Assert.assertTrue(bestRunningApparel_Lnk.get(1).containsText("Shop Men's"));
		Assert.assertTrue(BrooksGlycerin_Lnk.get(0).containsText("Shop Women's"));
		Assert.assertTrue(BrooksGlycerin_Lnk.get(1).containsText("Shop Men's"));
	}

	@Step
	public void assert_categories_are_displayed(int count) {
		Assert.assertTrue(featuredCategories_banner.size() == count);
	}

	@Step
	public void user_click_on_in_running_shoes_category(String text) throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(hottestBrandsWomen_Lnk);
		waitFor(productListingTitle);
	}

	@Step
	public void user_assert_page_is_displayed(String text) {
		Assert.assertTrue(productListingTitle.getText().toLowerCase().contains(text.toLowerCase()));
	}

	@Step
	public void user_assert_page_is_displayedforShopByBrand(String text) {
		Assert.assertTrue(brandContentTitle.getText().toLowerCase().contains(text.toLowerCase()));
	}

	@Step
	public void assert_sub_categories_are_displayed_under_shop_by_category(int count) {
		Assert.assertTrue(shopByCategory.size() == count);
	}

	@Step
	public void assert_sub_categories_are_displayed_under_shop_by_brand(int count) {
		Assert.assertTrue(shopByBrand.size() == count);
	}

	@Step
	public void assert_shop_all_brands_button_is_clickable() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(shopAllBrands_Btn);
		waitFor(shopByBrand_txt);
		shopByBrand_txt.shouldBeVisible();
		click_RRSHomeLogo_SVG_Button();
	}

	@Step
	public void user_click_on_in_shop_by_category(String text) throws InterruptedException {
		boolean flag = false;
		for (WebElementFacade ele : shopByCategory) {
			if (ele.getText().contains(text)) {
				CommonPage.javaScriptExecutor_Click(ele);
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void user_click_on_in_shop_by_brand(String text) throws InterruptedException {
		boolean flag = false;
		for (WebElementFacade ele : shopByBrand) {
			if (ele.getAttribute("alt").contains(text)) {
				CommonPage.javaScriptExecutor_Click(ele);
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void assert_find_your_perfect_fitting_shoes_fast_section_is_displayed() throws AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		waitFor(findYourPerfectFittingShoes_banner);
		findYourPerfectFittingShoes_banner.shouldBeVisible();
	}

	@Step
	public void assert_this_weeks_most_asked_for_shoes_section_is_displayed() {
		waitFor(mostAskedForSection);
		mostAskedForSection.shouldBeVisible();
	}

	@Step
	public void assert_your_bestselling_performance_apparel_section_is_displayed() {
		waitFor(yourBestSellingApparelSection);
		yourBestSellingApparelSection.shouldBeVisible();
	}

	@Step
	public void assert_shop_all_button_is_clickable_in_this_weeks_most_asked_for_shoe_section()
			throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(mostAskedForSectionShopAll);
		waitFor(productListingTitle);
		Assert.assertTrue(productListingTitle.getText().toUpperCase().contains("RESULTS FOR"));
		Assert.assertTrue(productListingTitle.getText().toLowerCase().contains("running shoe"));
	}

	@Step
	public void assert_shop_all_button_is_clickable_in_your_bestselling_performance_apparel_section()
			throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(yourBestSellingApparelSectionShopAll);
		Thread.sleep(5000);
		waitFor(productListingTitle);
		Assert.assertTrue(productListingTitle.getText().toUpperCase().contains("RESULTS FOR"));
		Assert.assertTrue(productListingTitle.getText().toLowerCase().contains("apparel"));
	}

	@Step
	public void assert_start_your_online_fitting_button_is_clickable() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(startYourOnlineFitting_Lnk);
		waitFor(perfectFitLabel);
		perfectFitLabel.shouldBeVisible();
	}

	@Step
	public void assert_vip_program_banner_is_displayed() throws InterruptedException {
		waitFor(vipPromotion_Banner);
		CommonPage.javaScriptExecutor_Scroll(vipPromotion_Banner);
		vipPromotion_Banner.shouldBeVisible();
	}

	@Step
	public void assert_become_a_vip_button_is_clickable() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(becomeAVIP_Btn);
		waitFor(vipAddCard_Lbl);
		vipAddCard_Lbl.shouldBeVisible();
	}

	@Step
	public void assert_learn_more_button_is_clickable() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(learnMore_Lnk);
		waitFor(vipFamilyRewards_txt);
		vipFamilyRewards_txt.shouldBeVisible();
		Assert.assertTrue(getDriver().getCurrentUrl().contains("/vip/rewards"));
	}

	@Step
	public void assert_user_details_display_at_account_icon_section(String user) {
		waitFor(accountNameSection_txt);
		waitABit(2000);
		if (user.contains("Non-VIP")) {
			Assert.assertTrue(accountNameSection_txt.getText().toLowerCase().contains("hi, sai"));
		} else {
			Assert.assertTrue(accountNameSection_txt.getText().toLowerCase().contains("hi, test"));
		}
		accountCashSection_txt.shouldBeVisible();
	}

	@Step
	public void assert_user_name_details_display_at_top_banner() {
		waitFor(topBannerVIPuser);
		Assert.assertTrue(topBannerVIPuser.getText().toUpperCase().contains("WE'RE HAPPY YOU'RE BACK, TEST!"));
	}

	@Step
	public void assert_vip_cash_rewards_details_is_displayed() {
		vipRewardCashAmount_txt.shouldBeVisible();
		Assert.assertTrue(vipRewardCashContent_txt.getText().contains("VIP Rewards Cash ready to spend today."));
		vipSavingAmount_txt.shouldBeVisible();
		Assert.assertTrue(vipSavingAmountContent_txt.getText().contains("VIP Savings since 2021"));
	}

	@Step
	public void assert_history_section_is_displayed(String user) {
		waitFor(topBannerVIPuser);
		if (user.contains("Non-VIP")) {
			Assert.assertTrue(historySection_txt.getText().contains("SAI'S HISTORY"));
		} else {
			Assert.assertTrue(historySection_txt.getText().contains("TEST'S HISTORY"));
		}
		historySectionProduct_lnk.get(0).shouldBePresent();
	}

	@Step
	public void assert_item_details_are_displayed_in_history_section() {
		Assert.assertTrue(historySectionProduct_lnk.size() == 8);
	}

	@Step
	public void assert_recently_ordered_product_details_are_displayed_in_history_section() {
		boolean flag = false;
		for (WebElementFacade ele : historySectionProduct_lnk) {
			if (ele.findBy("//div[contains(@class,'product-card-purchase')]/p").getText().contains("Ordered")) {
				Assert.assertTrue(
						ele.findBy("//div[contains(@class,'product-card-purchase')]/p").getText().contains("Ordered"));
				Assert.assertTrue(
						ele.findBy("//div[contains(@class,'product-card-purchase')]/p").getText().contains("ago"));
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void assert_recommended_for_you_product_details_are_displayed_in_history_section()
			throws InterruptedException {
		waitFor(historySectionSlide_btn);
		CommonPage.javaScriptExecutor_Click(historySectionSlide_btn);
		historySectionRecommandedlist.shouldBeVisible();
	}

	@Step
	public void assert_wearometer_is_displayed_on_product_details_in_history_section() {
		boolean flag = false;
		for (WebElementFacade ele : historySectionProduct_lnk) {
			if (ele.findBy("//div[contains(@class,'wearometer-product-card')]").isPresent()) {
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void assert_toda_ys_top_sellers_in_america_section_is_displayed() {
		Assert.assertTrue(topSellerInAmerica.size() == 8);
	}

	@Step
	public void assert_shop_all_button_is_clickable_in_todays_top_sellers_in_america_section()
			throws InterruptedException {
		topSellersInAmericashopAll_btn.shouldBePresent();
		CommonPage.javaScriptExecutor_Scroll(topSellersInAmericashopAll_btn);
		CommonPage.javaScriptExecutor_Click(topSellersInAmericashopAll_btn);
		waitFor(shopByBrand_txt);
		shopByBrand_txt.shouldBeVisible();
	}

	@Step
	public void assert_love_brooks_heres_their_newest_section_is_displayed() {
		Assert.assertTrue(loveBrokesSection.size() >= 6);
	}

	@Step
	public void assert_shop_all_button_is_clickable_in_love_brooks_heres_their_newest_section()
			throws InterruptedException {
		loveBrokesSectionShopAll_Btn.shouldBePresent();
		CommonPage.javaScriptExecutor_Scroll(loveBrokesSectionShopAll_Btn);
		CommonPage.javaScriptExecutor_Click(loveBrokesSectionShopAll_Btn);
		waitFor(brandContentTitle);
		Assert.assertTrue(brandContentTitle.containsText("BROOKS"));
	}

	@Step
	public void assert_your_favorite_shops_section_is_displayed() {
		Assert.assertTrue(loveBrokesSection.size() == 6);
	}

	@Step
	public void assert_vip_family_bestselling_performance_apparel_is_displayed() {
		Assert.assertTrue(vipFamilyBestsellingApparelSection.size() == 8);
	}

	@Step
	public void user_click_on_in_vip_family_bestselling_performance_apparel_category(String text)
			throws InterruptedException {
		boolean flag = false;
		for (WebElementFacade ele : vipFamilyBestsellingApparelSection) {
			if (ele.getText().contains(text)) {
				CommonPage.javaScriptExecutor_Click(ele);
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void user_click_on_in_your_favorite_shops_section(String text) throws InterruptedException {
		boolean flag = false;
		for (WebElementFacade ele : yourFavoriteShopsSection) {
			if (ele.getText().contains(text)) {
				CommonPage.javaScriptExecutor_Click(ele);
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag);
	}

	@Step
	public void user_assert_product_details_page_is_displayed(String string) {
		Assert.assertTrue(productTitle_txt.getText().contains(string));
	}

	@Step
	public void pageScrollDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	@Step
	public void verifyNavigationMenus(List<List<String>> menu) {
		int i = 0;
		for (WebElementFacade ele : navigationMenus) {
			ele.shouldBeVisible();
			String actualMenu = ele.getText();
			actualMenu.equalsIgnoreCase(menu.get(0).get(i));
			i++;
		}
	}

	@Step
	public void verifyNavigationMenuCategoriesByHoverOnTopOfMenus() throws InterruptedException {
		for (WebElementFacade menu : navigationMenus) {
			for (WebElementFacade categories : menuSubCategories) {
				Actions a = new Actions(getDriver());
				a.moveToElement(menu).perform();
				Assert.assertTrue(categories.isPresent());
			}
		}
	}

	@Step
	public void verifyHoverOnTopNavOfWomen() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(navigationMenus.get(0)).perform();
		Assert.assertTrue(menuSubCategories.get(0).isPresent());
		Thread.sleep(5000);
	}

	@Step
	public void verifyHoverOnTopNavOfkids() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(navigationMenus.get(2)).perform();
		Assert.assertTrue(menuSubCategories.get(2).isPresent());
		Thread.sleep(5000);
	}

	@Step
	public void verifyHoverOnTopNavOfGear() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(navigationMenus.get(3)).perform();
		Assert.assertTrue(menuSubCategories.get(3).isPresent());
		Thread.sleep(5000);
	}

	@Step
	public void verifyHoverOnTopNavOfBrands() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(navigationMenus.get(4)).perform();
		Assert.assertTrue(menuSubCategories.get(4).isPresent());
		Thread.sleep(5000);
	}

	@Step
	public void verifyHoverOnTopNavOfFitFinder() throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(navigationMenus.get(7)).perform();
		Assert.assertTrue(menuSubCategories.get(7).isPresent());
		Thread.sleep(5000);
	}

	@Step
	public void verifyNavigationToPLPPageFromCategory(String menu, String category)
			throws InterruptedException, AWTException {
		String dynamicElement = "li.menu-item--3cZEn>a[href*='" + menu + "']";
		Actions a = new Actions(getDriver());
		a.moveToElement(getDriver().findElement(By.cssSelector(dynamicElement))).perform();
		Thread.sleep(5000);
		String element = "//a[contains(@href,'" + menu + "') and contains(text(),'" + category + "')]";
		a.moveToElement(getDriver().findElement(By.xpath(element))).click().build().perform();
		Thread.sleep(5000);
		pageScrollDown();
		Ensure.thatTheCurrentPage().currentUrl().contains(menu);
		Ensure.thatTheCurrentPage().currentUrl().contains(category);
	}

	@Step
	public void validateWomenSubCategories(List<List<String>> subCat) {
		for (int i = 0; i < 3; i++) {
			String s = menuSubCategoriesType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(subCat.get(0).get(i)));
		}
	}

	@Step
	public void validatekidsSubCategoriesAndItsNavigation(List<List<String>> subCat) throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			String s = kidsSubCategories.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(subCat.get(0).get(i)));
		}
		kidsCatalogImage.isPresent();
		Actions a = new Actions(getDriver());
		a.moveToElement(kidsCatalogImage).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(subCat.get(0).get(2));
		Ensure.thatTheCurrentPage().currentUrl().contains(subCat.get(0).get(3));
		kidsBrandContentTitle.isPresent();
	}

	@Step
	public void validateGearSubCategoriesAndItsNavigation(List<List<String>> subCat) throws InterruptedException {
		int j = 0;
		for (int i = 6; i < 10; i++) {
			String s = menuSubCategoriesType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(subCat.get(0).get(j)));
			j++;
		}
		Actions a = new Actions(getDriver());
		a.moveToElement(gearSubCategoryGloves).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(subCat.get(0).get(4));
		pLPTitle.isPresent();
		String title = pLPTitle.getText();
		Assert.assertTrue(title.contains(subCat.get(0).get(5)));
	}

	@Step
	public void validateBrandsSubCategoriesAndItsNavigation(List<List<String>> subCat) throws InterruptedException {
		int j = 0;
		for (int i = 10; i < 12; i++) {
			String s = menuSubCategoriesType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(subCat.get(0).get(j)));
			j++;
		}
		Actions a = new Actions(getDriver());
		a.moveToElement(nikeBrandSubCat).click().build().perform();
		Thread.sleep(15000);
		Ensure.thatTheCurrentPage().currentUrl().contains(subCat.get(0).get(2));
		brandPageTitle.isPresent();
		String title = brandPageTitle.getText();
		Assert.assertTrue(title.contains(subCat.get(0).get(3)));
	}

	@Step
	public void verifyWomenShoeCategories(List<List<String>> type) {
		int j = 11;
		for (int i = 0; i < womenShoeType.size() - 1; i++) {
			String s = womenShoeType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(type.get(0).get(i)));
		}
		for (int i = 0; i < womenShoeSpecialType.size() - 1; i++) {
			String s = womenShoeSpecialType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(type.get(0).get(j)));
			j++;
		}
		for (int i = 0; i < shoeCalendar.size() - 1; i++) {
			String s = shoeCalendar.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(type.get(0).get(14)));
		}
	}

	@Step
	public void verifyFitFinderBannerAndNavigation(List<List<String>> expectedData) throws InterruptedException {
		fitFinderBanner.isVisible();
		Actions a = new Actions(getDriver());
		a.moveToElement(fitFinderBanner).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		fitFinderPageTitle.isPresent();
		String title = fitFinderPageTitle.getText();
		Assert.assertTrue(title.contains(expectedData.get(0).get(1)));
		Assert.assertTrue(title.contains(expectedData.get(0).get(2)));
	}

	@Step
	public void verifyBackToTopUpwardIcon() throws AWTException {
		CommonPage.pageScrolltwice();
		backToTopBtn.isVisible();
	}

	@Step
	public void verifyApplicationResponseOnBackToTopIcon() {
		backToTopBtn.click();
		topNavLinks.isDisplayed();
	}

	@Step
	public void verifyEmailSignUpButtonAndItsNavigation(List<List<String>> expectedData, String email)
			throws AWTException, InterruptedException {
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrollDown();
		Actions a = new Actions(getDriver());
		a.moveToElement(home_Page_Logo).perform();
		Thread.sleep(5000);
		emailSignUpInput.isDisplayed();
		String text = emailSignUpBtn.getText();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0)));
		typeInto(emailSignUpInput, email);
		emailSignUpBtn.click();
		Thread.sleep(10000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1));
		text = pageTitle.getText();
		Assert.assertTrue(text.contains(expectedData.get(0).get(2)));
	}

	public void verifyShopNowBannerAndNavigation(List<List<String>> expectedData)
			throws SerenityManagedException, InterruptedException {
//		saucoyBanner.isVisible();
//		saucoyLogo.isVisible();
//		shopNowBtn.isClickable();

		korsaBanner.isVisible();
		korsaLogo.isVisible();
		shopKorsaBtn.isClickable();
//		shopNowBtn.click();
//		Thread.sleep(5000);
//		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
//		String text = pageTitle.getText();
//		Assert.assertTrue(text.contains(expectedData.get(0).get(0)));
	}

	public void verifyFTvPopUp(List<List<String>> expectedData) {
		element(EmailCapturePopUp).waitUntilVisible();
		fTvPopUp.isVisible();
		fTvPopUp.isPresent();
		String text = subscriptionFormHead.getText();
		Assert.assertTrue(text.contains(expectedData.get(0).get(0)));
	}

	@Step
	public void loginUser(List<List<String>> expectedData) {
		try {
			homePage_Open();
			Thread.sleep(5000);
			// homepage_PopUpClose();
			Actions a = new Actions(getDriver());
			a.moveToElement(Login_SVG).click().build().perform();
			waitFor(myAccountLogin_Lbl);
			myAccountLogin_Lbl.shouldBeVisible();
			typeInto(Enter_EmailAddress, expectedData.get(0).get(0));
			typeInto(Enter_Password, expectedData.get(0).get(1));
			Login_Btn.click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void verifyFeaturedCategories() throws AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();

		Feature_Banner_Hoka.shouldBeCurrentlyVisible().isClickable();
		Feature_Banner_Nike.shouldBeCurrentlyVisible().isClickable();
		Feature_Banner_Adidas.shouldBeCurrentlyVisible().isClickable();
		CommonPage.actions_UpArrow();
		CommonPage.actions_UpArrow();
	}

	@Step
	public void verifyHokaFeatureNavigation(List<List<String>> expectedData) throws InterruptedException, AWTException {
		CommonPage.pageScrollUp();
		Feature_Hoka.get(1).click();
		Thread.sleep(5000);
		pageTitle.isDisplayed();
		String title = pageTitle.getText();
		System.out.println(title);
		Assert.assertTrue(title.contains(expectedData.get(0).get(0)));
	}

	@Step
	public void verifyShopByCateoriesSection(List<List<String>> expectedData)
			throws AWTException, InterruptedException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		Shop_By_Cat_Title.get(2).isDisplayed();
		Shop_By_Cat_Btn.shouldBeCurrentlyVisible().isClickable();
		for (int i = 0; i < expectedData.size(); i++) {
			verifyVisibilityofCategory(expectedData.get(0).get(i));
		}
	}

	@Step
	public void verifyShopByBrandSection() throws AWTException, InterruptedException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.actions_DownArrow();
		Promo_Banner_Title.isDisplayed();
		for (int i = 0; i < Shop_By_Brands.size(); i++) {
			Shop_By_Brands.get(i).shouldBeCurrentlyVisible().isClickable();
		}
	}

	@Step
	public void verifyTopSellerSection(List<List<String>> expectedData) throws AWTException, InterruptedException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageScrolltwice();
		CommonPage.actions_DownArrow();
		Shop_By_Cat_Title.get(0).isDisplayed();
		Shop_All_Top_Seller_Btn.shouldBeCurrentlyVisible().isClickable();
		for (int i = 0; i < expectedData.size(); i++) {
			verifyVisibilityofCategory(expectedData.get(0).get(i));
		}
	}

	@Step
	public void verifyVisibilityofCategory(String category) throws InterruptedException {
		String dynamicElement = "div>img[name*='" + category + "']";
		getDriver().findElement(By.cssSelector(dynamicElement)).isDisplayed();
		Thread.sleep(2000);
	}

	@Step
	public void verifyShopByCateoriesNavigation(String category) throws InterruptedException {
		String dynamicElement = "div>img[name*='" + category + "']";
		getDriver().findElement(By.cssSelector(dynamicElement)).click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(category);
	}

	@Step
	public void verifyShopByBrandNavigation(String category) throws InterruptedException {
		String dynamicElement = "img[name*='Favorite Shops - " + category + "']";
		getDriver().findElement(By.cssSelector(dynamicElement)).click();
		Thread.sleep(8000);
		Ensure.thatTheCurrentPage().currentUrl().isEqualToIgnoringCase(category);
	}

	@Step
	public void verifyTopSellerNavigation(String category) throws InterruptedException {
		String dynamicElement = "img[name*='" + category + "']";
		getDriver().findElement(By.cssSelector(dynamicElement)).click();
		Thread.sleep(8000);
		Ensure.thatTheCurrentPage().currentUrl().isEqualToIgnoringCase(category);
	}
}