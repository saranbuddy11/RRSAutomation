package com.RRS.Pages;

import java.awt.AWTException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BLPPage extends PageObject {

	@Steps
	homePage homePage;

	@Steps
	CommonPage commonPage;

	@Steps
	SDDLPPage sddlpPage;

	@Steps
	PLPPage plpPage;

	@FindBy(css = "h1+h2.tag_h2--2y8Ae")
	WebElementFacade subTitle;

	@FindBy(css = "div.brands--3KFW_>h2")
	WebElementFacade brandsTitle;

	@FindBy(css = "h3.tag_h3--2baIm")
	List<WebElementFacade> brandsTab;

	@FindBy(css = "h3.brands-list-heading--16V8i")
	List<WebElementFacade> brandListHeading;

	@FindBy(css = "small.tag_small--3bmao>strong")
	WebElementFacade rewardsText;

	@FindBy(css = "div.brands-list-active--3jT6f>h3")
	List<WebElementFacade> brandListActive;

	@FindBy(css = "small.top-selling-shop-all-caption--1Sn1e")
	List<WebElementFacade> mainCategories;

	@FindBy(css = "div.cms-card-box--3hl1n")
	List<WebElementFacade> subCategories;

	@FindBy(css = "div.brand-feature-content-container--1b-29")
	List<WebElementFacade> features;

	@FindBy(css = "div.ratingcard-rating")
	List<WebElementFacade> rating;

	@FindBy(css = "div.row-gap-30--1Tgzs>h2.tag_h2--2y8Ae")
	WebElementFacade review;

	@FindBy(css = "div.react-player__preview")
	List<WebElementFacade> brand_video;

	@FindBy(css = "div.column-gutter-15--evqE1>div.col-lg-2--3FNzb")
	List<WebElementFacade> categories;

	@FindBy(css = "h1.tag_h1--hWc2x")
	List<WebElementFacade> productTitle;

	@FindBy(css = "div.product-card--1gUX4")
	List<WebElementFacade> productCards;

	@Step
	public void validateBrandsSubCategories(List<List<String>> subCat) throws InterruptedException, AWTException {
		int j = 0;
		commonPage.pageZoomOut();
		commonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).perform();
		Assert.assertTrue(homePage.menuSubCategories.get(4).isPresent());
		Thread.sleep(5000);
		for (int i = 10; i < 12; i++) {
			String s = homePage.menuSubCategoriesType.get(i).getText();
			Assert.assertTrue(s.equalsIgnoreCase(subCat.get(0).get(j)));
			j++;
		}
	}

	@Step
	public void validateBrandsNavigation(List<List<String>> expectedData) throws InterruptedException, AWTException {
		commonPage.pageZoomOut();
		commonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		Assert.assertTrue(subTitle.getText().toLowerCase().contains(expectedData.get(0).get(0)));
		commonPage.pageScrollDown();
		a.moveToElement(rewardsText).perform();
		Thread.sleep(5000);
		Assert.assertTrue(brandsTitle.getText().toLowerCase().contains(expectedData.get(0).get(0)));
		Assert.assertTrue(brandsTitle.getText().toLowerCase().contains(expectedData.get(0).get(1)));
		Assert.assertTrue(brandsTab.get(0).getText().toLowerCase().contains(expectedData.get(0).get(0)));
		int i = 1;
		for (char j = 'A'; j <= 'Z'; j++) {
			Assert.assertEquals(brandsTab.get(i).getText(), Character.toString(j));
			i++;
		}
		int j = 1;
		for (int l = 27; l <= 29; l++) {
			Assert.assertEquals(brandsTab.get(l).getText(), String.valueOf(j));
			j++;
		}
		int m = 0;
		for (char k = 'A'; k <= 'Z'; k++) {
			Assert.assertEquals(brandListHeading.get(m).getText(), Character.toString(k));
			m++;
		}
		int n = 1;
		for (int l = 26; l < 29; l++) {
			Assert.assertEquals(brandListHeading.get(l).getText(), String.valueOf(n));
			n++;
		}
	}

	@Step
	public void validateBrandsNavigationPage(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		commonPage.pageZoomOut();
		commonPage.pageZoomOut();
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).click().build().perform();
		Thread.sleep(5000);
		Ensure.thatTheCurrentPage().currentUrl().contains(expectedData.get(0).get(0));
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		Assert.assertTrue(subTitle.getText().toLowerCase().contains(expectedData.get(0).get(0)));
	}

	@Step
	public void verifyClickOnAlphabet(String alphabet) throws AWTException {
		brandsTab.get(3).click();
		Assert.assertTrue(brandListActive.size() == 1);
		Assert.assertEquals(brandListActive.get(0).getText(), alphabet);
		commonPage.pageScrollUp();
		commonPage.pageScrollUp();
	}

	@Step
	public void verifyNavigationOfParticularBrand(String expectedData) throws InterruptedException, AWTException {
		navigateToBrandPage(expectedData);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertEquals(title, expectedData.toLowerCase());
	}

	@Step
	public void navigateToBrandPage(String brand) throws InterruptedException {
		Thread.sleep(5000);
		Actions a = new Actions(getDriver());
		a.moveToElement(rewardsText).perform();
		String dynamicElement = "img[alt='" + brand + " Brand']";
		getDriver().findElement(By.cssSelector(dynamicElement)).click();
		Thread.sleep(10000);
		Ensure.thatTheCurrentPage().currentUrl().contains(brand.toLowerCase());
		waitFor(sddlpPage.productTitle);
	}

	@Step
	public void verifyNavigationOfLargeBrand(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		navigateToBrandPage(expectedData.get(0).get(0));
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertEquals(title, expectedData.get(0).get(0).toLowerCase());
		Assert.assertTrue(mainCategories.get(0).getText().contains(expectedData.get(0).get(1)));
		Assert.assertTrue(mainCategories.get(1).getText().contains(expectedData.get(0).get(2)));
		Assert.assertTrue(mainCategories.get(2).getText().contains(expectedData.get(0).get(3)));
		Assert.assertTrue(mainCategories.get(3).getText().contains(expectedData.get(0).get(3)));
		for (int i = 0; i < subCategories.size(); i++) {
			subCategories.get(i).isPresent();
		}
		for (int i = 0; i < features.size(); i++) {
			features.get(i).isPresent();
		}
		for (int i = 0; i < rating.size(); i++) {
			rating.get(i).isPresent();
		}
		review.isPresent();
		for (int i = 0; i < brand_video.size(); i++) {
			brand_video.get(i).isPresent();
		}
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void verifyNavigationOfMediumBrand(List<List<String>> expectedData) throws InterruptedException {
		navigateToBrandPage(expectedData.get(0).get(0));
		productTitle.get(0).shouldBeCurrentlyVisible();
		for (int i = 0; i < productTitle.size(); i++) {
			String title = productTitle.get(i).getText().toLowerCase();
			Assert.assertTrue(title.contains(expectedData.get(0).get(0).toLowerCase()));
		}
		for (int i = 0; i < brandsTab.size(); i++) {
			brandsTab.get(i).isPresent();
		}
		for (int i = 0; i < categories.size(); i++) {
			categories.get(i).isPresent();
		}
		Assert.assertTrue(productCards.size() == 48);
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void verifyNavigationOfSmallBrand(List<List<String>> expectedData)
			throws InterruptedException, AWTException {
		commonPage.pageScrollDown();
		Thread.sleep(5000);
		navigateToBrandPage(expectedData.get(0).get(0));
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertTrue(title.contains(expectedData.get(0).get(0).toLowerCase()));
		plpPage.productListFilter.isPresent();
		Assert.assertTrue(productCards.size() == 16);
		Actions a = new Actions(getDriver());
		a.moveToElement(homePage.navigationMenus.get(4)).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void verifyNavigationOfCategoryPage(List<List<String>> category) throws AWTException, InterruptedException {
		commonPage.pageScrollDown();
		subCategories.get(0).click();
		Thread.sleep(10000);
		sddlpPage.productTitle.shouldBeCurrentlyVisible();
		String title = sddlpPage.productTitle.getText().toLowerCase();
		Assert.assertTrue(title.contains(category.get(0).get(0).toLowerCase()));
		Assert.assertTrue(title.contains(category.get(0).get(1).toLowerCase()));
		Ensure.thatTheCurrentPage().currentUrl().contains(category.get(0).get(0).toLowerCase());
		Ensure.thatTheCurrentPage().currentUrl().contains(category.get(0).get(1).toLowerCase());
		plpPage.breadCrumb.isVisible();
		String subCat = plpPage.breadCrumb.getText().toLowerCase();
		Assert.assertTrue(subCat.contains(category.get(0).get(0).toLowerCase()));
		Assert.assertTrue(subCat.contains(category.get(0).get(1).toLowerCase()));
	}
}
