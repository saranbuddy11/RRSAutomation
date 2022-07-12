package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class CheckoutS2Page extends PageObject {
	public static Logger log = LogManager.getLogger(CheckoutS2Page.class);
	CommonPage CommonPage = new CommonPage();

	@FindBy(xpath = "//button[normalize-space()='CONTINUE WITHOUT VIP']")
	WebElementFacade CheckoutS2_ContinueWithoutVIP_Btn;

	@FindBy(xpath = "//button[normalize-space()='ADD VIP FOR $1.99 & CONTINUE']")
	WebElementFacade CheckoutS2_ContinueWithVIP_Btn;

	@FindBy(xpath = "//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade CheckoutS3_OrderSummary_Lbl;

	@Step
	public void assertCheckOutS2PageDisplayed() throws InterruptedException {
		CheckoutS2_ContinueWithoutVIP_Btn.shouldBeVisible();
		CheckoutS2_ContinueWithVIP_Btn.shouldBeVisible();
	}

	@Step
	public void clickContinueWithoutVIPBtn() throws InterruptedException {
		CheckoutS2_ContinueWithoutVIP_Btn.click();
		waitFor(CheckoutS3_OrderSummary_Lbl);
		CheckoutS3_OrderSummary_Lbl.shouldBeVisible();
	}
}
