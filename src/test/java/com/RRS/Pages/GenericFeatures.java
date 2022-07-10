package com.RRS.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class GenericFeatures extends PageObject {
	public static Logger log = LogManager.getLogger(GenericFeatures.class);
	CommonPage CommonPage = new CommonPage();

	@FindBy(xpath = "//a[normalize-space()='Expert Advice']")
	WebElement expert_advice;

	@FindBy(xpath = "//a[normalize-space()='Help']")
	WebElement help;

	@FindBy(xpath = "//h1[contains(text(),'but we could')]")
	WebElementFacade blog_page;

	@FindBy(xpath = "//h1[normalize-space()='Contact Us']")
	WebElementFacade contact_page;

	@FindBy(xpath = "//a[normalize-space()='VIP Program']")
	WebElementFacade vip_program;

	@FindBy(xpath = "//a[normalize-space()='VIP Family Rewards Membership']")
	WebElementFacade VIP_Family;

	@FindBy(xpath = "//a[normalize-space()='VIP Family Rewards Plus Membership']")
	WebElementFacade VIP_Family_plus;

	@FindBy(xpath = "//a[normalize-space()='My Rewards Cash Balance']")
	WebElementFacade Rewards;

	@FindBy(xpath = "//a[contains(@class,'top-nav-links-tag--1Um9_')][normalize-space()='VIP Blog']")
	WebElementFacade VIP_Blog;

	@FindBy(xpath = "//a[contains(text(),'VIP Exclusive Shoe Calendar')]")
	WebElementFacade VIP_calendar;

	@FindBy(xpath = "//div[contains(@aria-label,'0 items available in the cart')]")
	WebElementFacade cart_icon;

	@FindBy(xpath = "//div[contains(@aria-label,'0 items available in the cart')]")
	WebElementFacade blank_cart;

	@FindBy(xpath = "//a[normalize-space()='Brands']")
	WebElementFacade brand;

	@FindBy(xpath = "//h1[normalize-space()='SHOP BY BRAND']")
	WebElementFacade brand_page;

	@FindBy(xpath = "//a[normalize-space()='Fit Finder']")
	WebElementFacade fit_finder;

	@FindBy(xpath = "//h1[contains(@class,'steps-nav-title--3eb_y')]")
	WebElementFacade fit_finder_page;

	@FindBy(xpath = "//button[contains(@class,'back-to-top--2iv3K')]")
	WebElementFacade back_to_top;

	@Step
	public void click_expert_advice() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(expert_advice).click();
		Thread.sleep(5000);
	}

	@Step
	public void click_help() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(help).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void contact_page() throws InterruptedException {
		contact_page.shouldBeVisible();
		Thread.sleep(10000);
	}

	@Step
	public void hover_vip_program() throws InterruptedException {
		Actions a = new Actions(getDriver());
		mouseHover(vip_program);
	}

	@Step
	private void mouseHover(WebElementFacade vip_program2) throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(vip_program2).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void VIP_Dropdown_list() throws InterruptedException {
		waitFor(VIP_Family);
		VIP_Family.shouldBeVisible();
		VIP_Family_plus.shouldBeVisible();
		Rewards.shouldBeVisible();
		VIP_Blog.shouldBeVisible();
		VIP_calendar.shouldBeVisible();
		Thread.sleep(5000);
	}

	@Step
	public void blank_cart_icon() throws InterruptedException {
		blank_cart.shouldBeVisible();
		Thread.sleep(10000);
	}

	@Step
	public void click_cart_icon() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(cart_icon).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void click_brand() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(brand).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void brand_page() throws InterruptedException {
		brand_page.shouldBeVisible();
		Thread.sleep(10000);
	}

	@Step
	public void click_fit_finder() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(fit_finder).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void fit_finder_page() throws InterruptedException {
		fit_finder_page.shouldBeVisible();
		Thread.sleep(10000);
	}

	@Step
	public void pageScrollDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	@Step
	public void click_back_to_top() throws InterruptedException {
		Actions a = new Actions(getDriver());
		a.moveToElement(back_to_top).click().build().perform();
		Thread.sleep(5000);
	}

	@Step
	public void user_click_on_link_in_vip_drop_down(String option) throws InterruptedException {
		waitABit(5000);
		CommonPage.javaScriptExecutor_Click(getDriver()
				.findElement(By.xpath("//div[contains(@class,'dropdown-content')]//a[text()='" + option + "']")));
	}
}
