package com.RRS.Pages;

import java.awt.AWTException;
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

public class SDDLPPage extends PageObject {

	public static Logger log = LogManager.getLogger(SDDLPPage.class);
	CommonPage CommonPage = new CommonPage();
	PLPPage plpPage = new PLPPage();

	public String value = null;

	@FindBy(css = "div.searchbox-input-text--2X1lf>input")
	WebElementFacade searchBar;

	@FindBy(css = "div.searchbox-input-text--2X1lf+svg")
	WebElementFacade manifyigIcon;

	@FindBy(css = "p.searchbox-suggestions-results-title--NwoKr")
	WebElementFacade searchResult;

	@FindBy(css = "div.searchbox-suggestions-links--1jD3C>ul>li")
	List<WebElementFacade> suggestions;

	@FindBy(css = "ul+h5.tag_h5--15p8m")
	List<WebElementFacade> suggestionHeadings;

	@FindBy(css = "a.searchbox-input-clear--kESx7")
	WebElementFacade clearBtn;

	@FindBy(css = "div>img[loading='eager']")
	List<WebElementFacade> suggestedProducts;

	@FindBy(css = "div.breadcrumb--3oLIM")
	WebElementFacade breadCrumb;

	@FindBy(css = "div.breadcrumb--3oLIM>a")
	WebElementFacade breadCrumbContent;

	@FindBy(css = "h1.tag_h1--hWc2x")
	WebElementFacade productTitle;

	@FindBy(css = "div.banner-header-title--3xHgI>h1.tag_h1--hWc2x")
	WebElementFacade homePageHeader;

	@Step
	public void clickCheckBox(String options) throws InterruptedException {
		String dynamicElement = "input[value*='" + options + "']";
		getDriver().findElement(By.cssSelector(dynamicElement)).click();
		Thread.sleep(8000);
	}

	@Step
	public void verifySearchBar(List<List<String>> expectedData) {
		searchBar.shouldBeCurrentlyVisible().isEnabled();
		searchBar.isClickable();
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		manifyigIcon.shouldBeCurrentlyVisible().isClickable();
	}

	@Step
	public void verifySearchFunctionality(List<List<String>> expectedData) {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		searchBar.clear();
		searchBar.sendKeys(expectedData.get(0).get(2));
		text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(2));
		searchResult.isPresent();
		text = searchResult.getText();
		Assert.assertTrue(text.contains(expectedData.get(0).get(2)));
		Assert.assertTrue(suggestions.size() <= 13);
		for (int i = 0; i < suggestions.size(); i++) {
			suggestions.get(i).isDisplayed();
		}
		int j = 3;
		for (int i = 0; i < suggestionHeadings.size(); i++) {
			String heading = suggestionHeadings.get(i).getText();
			Assert.assertEquals(heading, expectedData.get(0).get(j));
			j++;
		}
	}

	@Step
	public void verifyClearFunctionality(List<List<String>> expectedData) {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		searchBar.clear();
		searchBar.sendKeys(expectedData.get(0).get(0));
		clearBtn.shouldBeCurrentlyVisible().isClickable();
		clearBtn.click();
		text = searchBar.getAttribute(expectedData.get(0).get(1));
		//Assert.assertTrue(text.isBlank());
	}

	@Step
	public void verifySuggestedKeywordResponse(List<List<String>> expectedData) throws InterruptedException {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		searchResult.isPresent();
		Assert.assertTrue(suggestedProducts.size() == 6);
		for (int i = 0; i < suggestedProducts.size(); i++) {
			suggestedProducts.get(i).isDisplayed();
			suggestedProducts.get(i).isClickable();
		}
		value = suggestedProducts.get(0).getAttribute("alt");
		Actions a = new Actions(getDriver());
		a.moveToElement(suggestedProducts.get(0)).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void verifySearchKeywordNavigation(List<List<String>> expectedData) {
		breadCrumb.isDisplayed();
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1));
		String title = productTitle.getText();
		Assert.assertTrue(title.toLowerCase().contains(value.toLowerCase()));
	}

	@Step
	public String getPageTitle() {
		productTitle.shouldBeCurrentlyVisible();
		String title = productTitle.getText();
		return title;
	}

	@Step
	public void verifyNoSearchResultsPage(List<List<String>> expectedData) throws InterruptedException {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		manifyigIcon.click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(2));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		Assert.assertTrue(getPageTitle().toLowerCase().contains(expectedData.get(0).get(0)));
	}

	@Step
	public void verifySearchResultsPage(List<List<String>> expectedData) throws InterruptedException {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		manifyigIcon.click();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(2));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		element(plpPage.emailCapturePopUp).waitUntilVisible();
		plpPage.popUpClose.click();
		Assert.assertTrue(getPageTitle().toLowerCase().contains(expectedData.get(0).get(0)));
		breadCrumb.isDisplayed();
	}

	@Step
	public void verifySearchResultsPageForBrand(List<List<String>> expectedData) throws InterruptedException {
		searchBar.sendKeys(expectedData.get(0).get(0));
		String text = searchBar.getAttribute(expectedData.get(0).get(1));
		Assert.assertEquals(text, expectedData.get(0).get(0));
		manifyigIcon.click();
		Thread.sleep(5000);
	}

	@Step
	public void verifyNavigationBackToHome(List<List<String>> expectedData) throws InterruptedException {
		breadCrumbContent.shouldBeCurrentlyVisible().isClickable();
		breadCrumbContent.click();
		Thread.sleep(5000);
		homePageHeader.isDisplayed();
		String title = homePageHeader.getText();
		Assert.assertEquals(title, expectedData.get(0).get(0));
	}

	@Step
	public void verifySearchResultsPageResults(List<List<String>> expectedData) throws InterruptedException {
		verifySearchResultsPage(expectedData);
		String title = getPageTitle();
		Assert.assertTrue(title.matches(".*[0-9].*"));
	}

	@Step
	public void verifyAppliedFilterResults(List<List<String>> expectedData) throws InterruptedException, AWTException {
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		CommonPage.pageZoomOut();
		Thread.sleep(5000);
		CommonPage.actions_DownArrow();
		clickCheckBox(expectedData.get(0).get(0));
		plpPage.clearFilterLink.isPresent();
		plpPage.hideFilterLink.isPresent();
		plpPage.filterCloseLink.isPresent();
		String title = plpPage.productListingTitle.getText();
		Assert.assertTrue(title.contains(expectedData.get(0).get(0)));
	}

	@Step
	public void verifyNavigationOfBrandPage(List<List<String>> expectedData) {
		String title = productTitle.getText();
		Assert.assertEquals(title, expectedData.get(0).get(0));
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0).toLowerCase());
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(1));
	}
}