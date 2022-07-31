package com.RRS.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class search extends PageObject {

	@FindBy(css = "input[placeholder='What are you looking for?']")
	WebElement search_SVG;

	@FindBy(xpath = "//p[contains(@class,'searchbox-suggestions-results-title--NwoKr')]")
	WebElement brand_SVG;

	@FindBy(css = ".product-wrapper-title--1mSzK")
	WebElement product_SVG;

	@Step
	public void click_search_SVG() {
		Actions a = new Actions(getDriver());
		a.moveToElement(search_SVG).click().build().perform();

	}

	@Step
	public void user_Enter_BrandName(String Value) {
		typeInto(search_SVG, Value);

	}
	
	@Step
	public void user_Enter_SearchKeyword(String Value) {
		typeInto(search_SVG, Value);
	}

	@Step
	public void user_Click_Search_Button() {
		search_SVG.sendKeys(Keys.ENTER);
		element(brand_SVG).waitUntilVisible();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Step
	public void user_lands_BrandPage(String Value) {
		containsText(Value);
		System.out.println(Value);

	}

	@Step
	public void user_Enter_ProductName(String Value) {
		typeInto(search_SVG, Value);

	}

	@Step
	public void user_Click_Enter() {
		search_SVG.sendKeys(Keys.ENTER);
		element(product_SVG).waitUntilVisible();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//*[@id='rrs-main']/div/div[5]/div[1]/div/div/div[1]/div[2]/ul/li[1]/div/span/input")
	WebElementFacade womens_SVG;

	@FindBy(xpath = "//span[contains(normalize-space(),'Shoes']")
	WebElementFacade category_SVG;

	@FindBy(xpath = "a[class='clickable-text--2XYI6']")
	//a[normalize-space()='Hide Filter']
	WebElementFacade hide_filters;

	@FindBy(xpath = "//div[contains(@aria-label,'Sort by listbox')]")
	WebElementFacade sort_by;

	@FindBy(xpath = "//li[normalize-space()='Top Rated']")
	WebElementFacade top_rated;

	@Step
	public void click_womens_SVG() {

		womens_SVG.click();
		element(womens_SVG).waitUntilVisible();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Step
	public void click_category_SVG() {

		category_SVG.click();
		element(category_SVG).waitUntilVisible();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void click_hide_filters() {
		try {
			pageScrollUp();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		hide_filters.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void click_sort_by() {

		sort_by.click();

	}

	@Step
	public void click_top_rated() {

		top_rated.click();
		try {
			pageScrollUp();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void pageScrollUp() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void applyFilter(String filter) throws InterruptedException {
		String DynamicFilterElement = "//input[@value='r=webPgc%3A" + filter + "&p=48"+ "']";
		// input[@value='r=webPgc%3AShoes']
		System.out.println("Dynamic xpath created: " + DynamicFilterElement);
		getDriver().findElement(By.xpath(DynamicFilterElement)).click();
		Thread.sleep(2000);
		
	}
}
