package com.RRS.Pages;

import java.awt.AWTException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

public class PLPPage extends PageObject {

	CommonPage CommonPage = new CommonPage();
	homePage homePage = new homePage();

	private List<String> AllLinks;

	public static Logger log = LogManager.getLogger(PLPPage.class);

	@FindBy(css = "a[aria-label=\"Shop Women's The Hottest Brands of Running shoes\"]")
	WebElementFacade ShopNow_Women;

	@FindBy(css = "h1[class='tag_h1--hWc2x']")
	WebElementFacade Women_RunningShoe_H1_Lbl;

	@FindBy(xpath = "//div[contains(@class,'selectbox-header--')]")
	WebElementFacade Plp_SortBy_Drp;

	@FindBy(xpath = "//a[normalize-space()='Hide Filter']")
	WebElementFacade Plp_HideFilter_Lnk;

	@FindBy(xpath = "//a[contains(normalize-space()='Clear Filters')]")
	WebElementFacade Plp_ClearFilter_Lnk;

	@FindBy(xpath = "//span[normalize-space()='categories']")
	WebElementFacade Plp_Categories_Header_Lbl;

	@FindBy(css = "input[placeholder='What are you looking for?']")
	WebElementFacade Plp_SearchBar_Txt;

	@FindBy(css = "svg.icon--3lrU-.icon-link--XANc9")
	WebElementFacade Plp_SearchIcon_SVG;

	@FindBy(css = "span.breadcrumb-line---rKHZ")
	WebElementFacade Plp_SearchResults_BC;

	@FindBy(xpath = "//h1[contains(text(),'RESULTS FOR')]")
	WebElementFacade Plp_SearchResultsCount_Lbl;

	@FindBy(css = "ul[aria-label='Sort by']")
	WebElementFacade Plp_SortBy_Sel;

	@FindBy(xpath = "//a[contains(@href,'/product/')]")
	WebElementFacade Plp_Products_Lnk;

	@FindBy(xpath = "//div[contains(@aria-label,'Sort by listbox')]")
	WebElementFacade Plp_SortBY_ListBox;

	@FindBy(xpath = "//img[@name='Logo - Brooks']")
	WebElementFacade Plp_Brooks_Logo;

	@FindBy(xpath = "//div/a[@href='/category/shoes/running']")
	WebElementFacade Plp_AmericasTopRunnina_Lnk;

	@FindBy(xpath = "//button[normalize-space()='Shop All Brands']")
	WebElementFacade Plp_ShopAllBrands_Btn;

	@FindBy(xpath = "//button[contains(@name,'Button - Shop All')]")
	WebElementFacade Plp_ShopAll_Btn;

	@FindBy(xpath = "//div[contains(normalize-space(),'Reviews')]")
	WebElementFacade Plp_ReviewDisplayed;

	@FindBy(css = "span[aria-label='Color variant grey/purple']")
	WebElementFacade Plp_ColorVariantDisplayed;

	@FindBy(css = ".pagination-item-active--RnLLf")
	WebElementFacade Plp_MaxProductsDisplayed_Lbl;

	@FindBy(xpath = "//button[normalize-space()='Load More']")
	WebElementFacade Plp_LoadMore_Btn;

	@FindBy(xpath = "//button[@aria-label='Click to Top']")
	WebElementFacade Plp_GoToTop_Btn;

	@FindBy(css = ".product-listing-links-clear--ryzdI>a.clickable-text--2XYI6")
	WebElementFacade clearFilterLink;

	@FindBy(css = "div.direction-row--1VSm6>a.clickable-text--2XYI6")
	WebElementFacade hideFilterLink;

	@FindBy(css = "button[aria-label*='Close']>svg")
	WebElementFacade filterCloseLink;

	@FindBy(css = "div.product-listing-tiles--3UvUN")
	WebElementFacade productListingTitle;

	@FindBy(css = "div.product-listing-block--phojA>div.flex-row--D783L>div.col-breakpoints--3guui")
	List<WebElementFacade> productList;

	@FindBy(css = "div.product-listing-filters-open--CPXxi")
	WebElementFacade productListFilter;

	@FindBy(css = "button.pagination-prev--3gUXs")
	WebElementFacade previousPageBtn;

	@FindBy(css = "button.pagination-next--3sdUN")
	WebElementFacade nextPageBtn;

	@FindBy(css = "a[class*='pagination-item']")
	List<WebElementFacade> pageNumbers;

	@FindBy(id = "logo_svg__a")
	WebElementFacade logoBtn;

	@FindBy(css = "div.breadcrumb-theme-dark--37Ydz")
	WebElementFacade breadCrumb;

	@FindBy(css = "div.col--3RkFe>span")
	List<WebElementFacade> filterHeaders;

	@FindBy(css = "input[placeholder='Search']")
	WebElementFacade brandSearchBar;

	@FindBy(css = "div.textbox--1Ccx3+svg.icon-link--XANc9>g")
	List<WebElementFacade> brandSearchIcon;

	@FindBy(css = "div.brand-checkbox--30xb9>label>input.checkbox-input--3yXDV")
	List<WebElementFacade> brandsCheckBox;

	@FindBy(css = "a.brand-see-all-link--u6agD")
	WebElementFacade allBrandsLink;

	@FindBy(css = "button.back-to-top--2iv3K")
	WebElementFacade backToTopBtn;

	@FindBy(css = "input[name='emailAddress']")
	WebElementFacade emailCapturePopUp;

	@FindBy(css = "svg[aria-label='close']")
	WebElementFacade popUpClose;

	@FindBy(css = "h1.tag_h1--hWc2x")
	WebElementFacade pageTitle;

	@FindBy(css = "div.pr-rating-stars")
	List<WebElementFacade> ratingStars;

	@FindBy(css = "div.pr-category-snippet__total")
	List<WebElementFacade> reviews;

	@FindBy(css = "span.price-original--1VaFr")
	List<WebElementFacade> prices;

	@FindBy(css = "span.price-sales--qsiW6")
	List<WebElementFacade> salePrice;

	@Step
	public void clearAllFilters() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Plp_ClearFilter_Lnk);
		// Plp_ClearFilter_Lnk.click();
		Thread.sleep(2000);
	}

	@Step
	public void applyAnyFilter(String Filter) throws InterruptedException {
		String DynamicFilterElement = "//label[contains(normalize-space(),'" + Filter + "&p=48" + "')]";
		System.out.println("Dynamic xpath created: " + DynamicFilterElement);
		getDriver().findElement(By.xpath(DynamicFilterElement)).click();
		Thread.sleep(2000);
	}

	@Step
	public void GoToTop_PLP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Plp_GoToTop_Btn);
		// Plp_GoToTop_Btn.click();
		Thread.sleep(250);
		Plp_SortBY_ListBox.shouldBeVisible();
	}

	@Step
	public void isMaxProductsDisplayed_PLP() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(Plp_MaxProductsDisplayed_Lbl);
		String MaxProductDispalyed = Plp_MaxProductsDisplayed_Lbl.getText();
		System.out.println("Product displayed so far: " + MaxProductDispalyed);
		int counter = 1;
		while (!MaxProductDispalyed.contains("viewed 48")) {
			CommonPage.javaScriptExecutor_Scroll(Plp_MaxProductsDisplayed_Lbl);
			// CommonPage.actions_PageDown();
			// CommonPage.actions_PageDown();
			Thread.sleep(2000);
			MaxProductDispalyed = Plp_MaxProductsDisplayed_Lbl.getText();
			System.out.println("Product displayed so far: " + MaxProductDispalyed);
			if (MaxProductDispalyed.contains("viewed 48")) {
				System.out.println("Application loaded 48 products");
				break;
			}
			if (counter == 20) {
				break;
			}
			counter++;
		}
		// Plp_LoadMore_Btn.shouldBeVisible();
		// CommonPage.javaScriptExecutor_Click(Plp_LoadMore_Btn);
		Thread.sleep(2000);
		CommonPage.javaScriptExecutor_Scroll(Plp_MaxProductsDisplayed_Lbl);
	}

	@Step
	public void ColorVariantDisplayed_PLP() {
		boolean isDispalyed = Plp_ColorVariantDisplayed.isDisplayed();
		if (isDispalyed == true) {
			System.out.println("Color variants are displayed for the products as expected");
		} else {
			System.out.println("Color variants are NOT displayed for the products as expected");
			// Assert.fail();
		}
	}

	@Step
	public void ReviewDisplayed_PLP() {
		boolean isReviewDispalyed = Plp_ReviewDisplayed.isDisplayed();
		if (isReviewDispalyed == true) {
			System.out.println("Review bars are NOT displayed for the products as expected");
		} else {
			System.out.println("Review bars NOT are displayed for the products as expected");
			// Assert.fail();
		}
	}

	@Step
	public void applyFilter(String Filter) throws InterruptedException {
		String DynamicFilterElement = "//input[@value='r=webPgc%3A" + Filter + "&p=48" + "']";
		// input[@value='r=webPgc%3AShoes']
		System.out.println("Dynamic xpath created: " + DynamicFilterElement);
		getDriver().findElement(By.xpath(DynamicFilterElement)).click();
		Thread.sleep(2000);
	}

	@Step
	public List<String> getAllProductLinks() {
		AllLinks = findAll("//a[contains(@href,'/product/')]").stream().map(WebElementFacade::getText)
				.collect(Collectors.toList());
		for (String str : AllLinks) {
			System.out.println("Product link is: " + str);
		}
		return AllLinks;
	}

	@Step
	public String getFirstProductLink() {
		AllLinks = findAll("//a[contains(@href,'/product/')]").stream().map(WebElementFacade::getText)
				.collect(Collectors.toList());
		String First_Product_Link = AllLinks.get(2);
		String Modified_Product_Link = First_Product_Link.replaceAll("'S", "'s");
		System.out.println("Modified string is: " + Modified_Product_Link);
		return Modified_Product_Link;
	}

	@Step
	public void clickFirstProduct(String First_Product_Link) {
		// String FirstProduct="\"Women's ASICS GEL-Kayano 28\"";
		String FirstProduct = "//h2[contains(text(),\"" + First_Product_Link + "\")]";
		System.out.println("Dynamic xpath created: " + FirstProduct);
		WebElement ele = getDriver().findElement(By.xpath(FirstProduct));
		// getDriver().findElement(By.xpath(FirstProduct)).click();
		try {
			CommonPage.javaScriptExecutor_Click(ele);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void selectSortBy(String Value) {
		// Plp_SortBy_Sel.selectByVisibleText(Value);
		Plp_SortBY_ListBox.click();
		String MentionedList = "//li[contains(text(),'" + Value + "')]";
		System.out.println("Dynamic xpath created: " + MentionedList);
		getDriver().findElement(By.xpath(MentionedList)).click();
	}

	@Step
	public String getCountofSearchResults() {
		String Count = Plp_SearchResultsCount_Lbl.getText();
		System.out.println("Search results string is: " + Count);
		return Count;
	}

	@Step
	public void Click_SearchIcon() throws InterruptedException {
		Plp_SearchIcon_SVG.isClickable();
		Actions a = new Actions(getDriver());
		a.moveToElement(Plp_SearchIcon_SVG).click().build().perform();
		Thread.sleep(10000);
		// Plp_SearchResults_BC.waitUntilVisible();
	}

	@Step
	public void Click_SearchIcon_PDP() {
		waitFor(Plp_SearchIcon_SVG);
		// Plp_SearchIcon_SVG.click();
		Actions a = new Actions(getDriver());
		a.moveToElement(Plp_SearchIcon_SVG).click().build().perform();
		// Plp_SearchResults_BC.waitUntilVisible();
	}

	@Step
	public void Type_SearchKeyword(String Keyword) throws InterruptedException {
		waitFor(Plp_SearchBar_Txt);
		Plp_SearchBar_Txt.click();
		try {
			typeInto(Plp_SearchBar_Txt, Keyword);
			Thread.sleep(3000);
		} catch (StaleElementReferenceException ex) {
			typeInto(Plp_SearchBar_Txt, Keyword);
			ex.printStackTrace();
		}
	}

	@Step
	public void Assert_PLPpage_SearchKeyword() {
		Plp_SortBy_Drp.waitUntilVisible();
		Plp_SortBy_Drp.shouldBeVisible();
		Plp_HideFilter_Lnk.shouldBeVisible();
		Plp_SearchResults_BC.shouldBeVisible();
		// Plp_ClearFilter_Lnk.shouldBeVisible();
		// Plp_Categories_Header_Lbl.shouldBeVisible();
	}

	@Step
	public void Assert_PLPpage() {
		Plp_SortBy_Drp.shouldBeVisible();
		Plp_HideFilter_Lnk.shouldBeVisible();
		// Plp_ClearFilter_Lnk.shouldBeVisible();
		Plp_Categories_Header_Lbl.shouldBeVisible();
	}

	@Step
	public void Click_ShopNow_Women() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(ShopNow_Women);
		System.out.println("Web element is clicked");
		Thread.sleep(2000);
		Women_RunningShoe_H1_Lbl.shouldBeVisible();
	}

	@Step
	public void Click_ShopNow_HomePage() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(Plp_ShopAll_Btn);
		System.out.println("SCrolled to the mentioned web element");
		Thread.sleep(500);
		CommonPage.javaScriptExecutor_Click(Plp_ShopAll_Btn);
		System.out.println("Web element is clicked");
		/*
		 * Scroll.to(Plp_ShopAll_Btn); JavaScriptClick.on(Plp_ShopAll_Btn);
		 */
		Thread.sleep(5000);
		// Women_RunningShoe_H1_Lbl.shouldBeVisible();
	}

	@Step
	public void applyFilterOnCategories(List<List<String>> expectedData) throws InterruptedException {
		String DynamicCategoryFilterElement = "input[value*='" + expectedData.get(0).get(0) + "']";
		getDriver().findElement(By.cssSelector(DynamicCategoryFilterElement)).click();
		Thread.sleep(5000);
		String DynamicCategoriesFilterElement = "input[value*='" + expectedData.get(0).get(1) + "']";
		getDriver().findElement(By.cssSelector(DynamicCategoriesFilterElement)).click();
		Thread.sleep(5000);
		breadCrumb.isPresent();
	}

	@Step
	public void verifyResultPageAfterFilterApplied(List<List<String>> expectedData) {
		clearFilterLink.shouldBeCurrentlyVisible().isClickable();
		productListingTitle.isVisible();
		String categoryList = productListingTitle.getText();
		Assert.assertTrue(categoryList.contains(expectedData.get(0).get(0)));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1) + expectedData.get(0).get(0));
	}

	@Step
	public void verifyPaginationInPLPPage(int expectedCount) throws AWTException {
		int actualCount = productList.size();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		Actions a = new Actions(getDriver());
		a.moveToElement(logoBtn).perform();
		Assert.assertEquals(actualCount, expectedCount);
		previousPageBtn.isPresent();
		nextPageBtn.isPresent();
		for (int i = 0; i < pageNumbers.size(); i++) {
			String text = pageNumbers.get(i).getText();
			Assert.assertEquals(Integer.parseInt(text), i + 1);
		}
	}

	@Step
	public void clickHomePageCategory(List<List<String>> category) throws AWTException, InterruptedException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Thread.sleep(5000);
		homePage.verifyNavigationToPLPPageFromCategory(category.get(0).get(0), category.get(0).get(1));
		Actions a = new Actions(getDriver());
		a.moveToElement(logoBtn).perform();
		Thread.sleep(5000);
	}

	@Step
	public void verifyBreadCrumbInPLPPage(List<List<String>> breadCrumbs) {
		breadCrumb.isVisible();
		String subCat = breadCrumb.getText();
		for (int i = 0; i < breadCrumbs.size(); i++) {
			Assert.assertTrue(subCat.contains(breadCrumbs.get(0).get(i)));
		}
	}

	@Step
	public void verifyFiltersInPLPPage(List<List<String>> expectedData) throws InterruptedException {
		clearFilterLink.shouldBeCurrentlyVisible().isClickable();
		hideFilterLink.shouldBeCurrentlyVisible().isClickable();
		filterCloseLink.shouldBeCurrentlyVisible().isClickable();
		productListFilter.isDisplayed();
		hideFilterLink.click();
		Thread.sleep(4000);
		Assert.assertFalse(productListFilter.isPresent());
		hideFilterLink.click();
		clearFilterLink.click();
		Thread.sleep(5000);
		Assert.assertFalse(filterCloseLink.isPresent());
		Assert.assertFalse(clearFilterLink.isPresent());
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(2) + expectedData.get(0).get(3));
		Ensure.thatTheCurrentPage().currentUrl().not()
				.contains(expectedData.get(0).get(0) + expectedData.get(0).get(1));
	}

	@Step
	public void navigateToCategoryFromTopNavigationMenu(String menu) throws InterruptedException, AWTException {
		String dynamicElement = "li.menu-item--3cZEn>a[href*='" + menu + "']";
		Actions a = new Actions(getDriver());
		a.moveToElement(getDriver().findElement(By.cssSelector(dynamicElement))).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(menu);
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
	}

	@Step
	public void verifySearchBarOfBrands() throws AWTException {
		filterHeaders.get(3).isDisplayed();
		brandSearchBar.shouldBeCurrentlyVisible().isEnabled();
		brandSearchIcon.get(1).shouldBeCurrentlyVisible().isClickable();
	}

	@Step
	public void verifyDefaultsInBrandSection(int count) {
		Assert.assertEquals(brandsCheckBox.size(), count);
		for (int i = 0; i < brandsCheckBox.size(); i++) {
			brandsCheckBox.get(i).shouldBeVisible().isClickable();
		}
	}

	@Step
	public void verifyLinksInBrandSection(int expectedCount) throws InterruptedException, AWTException {
		allBrandsLink.shouldBeVisible().isClickable();
		element(emailCapturePopUp).waitUntilVisible();
		popUpClose.click();
		allBrandsLink.click();
		int actualCount = brandsCheckBox.size();
		Assert.assertNotEquals(actualCount, expectedCount);
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		CommonPage.pageScrolltwice();
		Actions a = new Actions(getDriver());
		a.moveToElement(pageTitle).perform();
		CommonPage.pageScrollDown();
		Thread.sleep(3000);
		allBrandsLink.click();
		Thread.sleep(5000);
		Assert.assertEquals(brandsCheckBox.size(), expectedCount);
	}

	@Step
	public void verifyReviewCountWithStarRating() throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(5000);
		Assert.assertTrue(ratingStars.size() == 48);
		Assert.assertTrue(reviews.size() == 48);
		Assert.assertTrue(reviews.get(1).getText().matches(".*[0-9].*"));
	}

	@Step
	public void verifyPriceFieldOfProducts(List<List<String>> expectedData) throws InterruptedException {
		CommonPage.actions_DownArrow();
		CommonPage.actions_DownArrow();
		Thread.sleep(5000);
		Assert.assertTrue(prices.size() <= 48);
		for (int i = 0; i < prices.size(); i++) {
			Assert.assertTrue(prices.get(i).getText().contains(expectedData.get(0).get(1)));
		}
		if (salePrice.size() > 0) {
			for (int i = 0; i < salePrice.size(); i++) {
				Assert.assertTrue(salePrice.get(i).getText().contains(expectedData.get(0).get(0)));
				Assert.assertTrue(salePrice.get(i).getText().contains(expectedData.get(0).get(1)));
			}
		}
	}
}
