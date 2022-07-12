package com.RRS.Pages;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class PLPPage extends PageObject {

	CommonPage CommonPage = new CommonPage();

	private List<String> AllLinks;

	public static Logger log = LogManager.getLogger(PLPPage.class);

	@FindBy(xpath = "//a[@aria-label=\"Shop Women's The Hottest Brands of Running shoes\"]")
	WebElementFacade ShopNow_Women;

	@FindBy(xpath = "//h1[contains(text(),\"women's running shoes\")]")
	WebElementFacade Women_RunningShoe_H1_Lbl;

	@FindBy(xpath = "//div[contains(@class,'selectbox-header--')]")
	WebElementFacade Plp_SortBy_Drp;

	@FindBy(xpath = "//a[normalize-space()='Hide Filter']")
	WebElementFacade Plp_HideFilter_Lnk;

	@FindBy(xpath = "//a[contains(normalize-space(),'Clear Filters')]")
	WebElementFacade Plp_ClearFilter_Lnk;

	@FindBy(xpath = "//span[normalize-space()='categories']")
	WebElementFacade Plp_Categories_Header_Lbl;

	@FindBy(xpath = "//input[@placeholder='What are you looking for?']")
	WebElementFacade Plp_SearchBar_Txt;

	@FindBy(xpath = "//div[contains(@class,'searchbox-input--')]//div[contains(@class,'input-group--')]//*[name()='svg']")
	WebElementFacade Plp_SearchIcon_SVG;

	@FindBy(xpath = "//span[normalize-space()='Search Results']")
	WebElementFacade Plp_SearchResults_BC;

	@FindBy(xpath = "//h1[contains(text(),'RESULTS FOR')]")
	WebElementFacade Plp_SearchResultsCount_Lbl;

	@FindBy(xpath = "//ul[contains(@aria-label,'Sort by')]")
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

	@FindBy(xpath = "//span[contains(@aria-label,'Color variant Coral/Mist')]")
	WebElementFacade Plp_ColorVariantDisplayed;

	@FindBy(xpath = "//span[contains(@class,'product-listing-footer-info')]")
	WebElementFacade Plp_MaxProductsDisplayed_Lbl;

	@FindBy(xpath = "//button[normalize-space()='Load More']")
	WebElementFacade Plp_LoadMore_Btn;

	@FindBy(xpath = "//button[@aria-label='Click to Top']")
	WebElementFacade Plp_GoToTop_Btn;

	@Step
	public void clearAllFilters() throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Plp_ClearFilter_Lnk);
		// Plp_ClearFilter_Lnk.click();
		Thread.sleep(2000);
	}

	@Step
	public void applyAnyFilter(String Filter) throws InterruptedException {
		String DynamicFilterElement = "//label[contains(normalize-space(),'" + Filter + "')]";
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
		while (!MaxProductDispalyed.contains("viewed 96")) {
			CommonPage.javaScriptExecutor_Scroll(Plp_MaxProductsDisplayed_Lbl);
			// CommonPage.actions_PageDown();
			// CommonPage.actions_PageDown();
			Thread.sleep(2000);
			MaxProductDispalyed = Plp_MaxProductsDisplayed_Lbl.getText();
			System.out.println("Product displayed so far: " + MaxProductDispalyed);
			if (MaxProductDispalyed.contains("viewed 96")) {
				System.out.println("Application loaded 96 products");
				break;
			}
			if (counter == 20) {
				break;
			}
			counter++;
		}
		Plp_LoadMore_Btn.shouldBeVisible();
		CommonPage.javaScriptExecutor_Click(Plp_LoadMore_Btn);
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
		String DynamicFilterElement = "//input[@value='r=webPgc%3A" + Filter + "']";
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
	public void Click_SearchIcon() {
		Actions a = new Actions(getDriver());
		a.moveToElement(Plp_SearchIcon_SVG).click().build().perform();
		Plp_SearchResults_BC.waitUntilVisible();
	}

	@Step
	public void Click_SearchIcon_PDP() {
		waitFor(Plp_SearchIcon_SVG);
		Actions a = new Actions(getDriver());
		a.moveToElement(Plp_SearchIcon_SVG).click().build().perform();
		// Plp_SearchResults_BC.waitUntilVisible();
	}

	@Step
	public void Type_SearchKeyword(String Keyword) {
		waitFor(Plp_SearchBar_Txt);
		Plp_SearchBar_Txt.click();
		try {
			typeInto(Plp_SearchBar_Txt, Keyword);
		} catch (StaleElementReferenceException ex) {
			typeInto(Plp_SearchBar_Txt, Keyword);
			ex.printStackTrace();
		}
	}

	@Step
	public void Assert_PLPpage_SearchKeyword() {
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
}
