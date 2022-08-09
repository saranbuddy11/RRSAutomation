package com.RRS.Pages;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class OrderConfirmationPage extends PageObject {
	public static Logger log = LogManager.getLogger(OrderConfirmationPage.class);
	CommonPage CommonPage = new CommonPage();
	CheckoutS1Page checkOutPage = new CheckoutS1Page();
	loginPage loginPage = new loginPage();

	@FindBy(xpath = "//h4[contains(normalize-space(),'Order #')]")
	WebElementFacade OC_OrderNum_Lbl;

	@FindBy(xpath = "//h1[contains(normalize-space(),'Thank YOU ')]")
	WebElementFacade OC_ThankYou_Lbl;

	@FindBy(css = ".vip-saving-title--2zmcw")
	WebElementFacade OC_JoinVIP_Lbl;

	@FindBy(xpath = "//h3[normalize-space()='Order Summary']")
	WebElementFacade OC_OrderSummary_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Order Subtotal']")
	WebElementFacade OC_OrderSubTotal_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Shipping']")
	WebElementFacade OC_OrderShipping_Lbl;

	@FindBy(xpath = "//p[normalize-space()='Tax']")
	WebElementFacade OC_OrderTax_Lbl;

	@FindBy(xpath = "(//div[contains(@class,'line-item--')])[4]")
	WebElementFacade OC_OrderTotal_Lbl;

	@FindBy(css = ".order-confirm-title--esJZL")
	WebElementFacade OC_Title_Lbl;

	@FindBy(xpath = "//input[@name='CVN']")
	WebElementFacade OC_CVN_input;

	@FindBy(xpath = "//h1[normalize-space()='WOW, VIP! YOU SAVED ALL THIS TODAY!']")
	WebElementFacade OC_WowSavings_banner;

	@FindBy(xpath = "//small[contains(text(),'Upgrade to VIP Rewards Plus for FREE and earn 10% ')]")
	WebElementFacade OC_VIPPlusUpgrade_lbl;

	@FindBy(css = "div.header-main--26ROe")
	WebElementFacade header;

	@FindBy(css = "div.footer--1LEZJ")
	WebElementFacade footer;

	@Step
	public void assertVIPUpgradeDetails() throws InterruptedException {
		OC_VIPPlusUpgrade_lbl.shouldBeVisible();
	}

	@Step
	public void assertWowbannerDetails() throws InterruptedException {
		OC_WowSavings_banner.shouldBeVisible();
	}

	@Step
	public void enterCVNExistingCard() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(OC_CVN_input);
		CommonPage.javaScriptExecutor_Click(OC_CVN_input);
		typeInto(OC_CVN_input, "123");
	}

	@Step
	public void assertCheckoutS3displayed() throws InterruptedException {
		Thread.sleep(5000);
		OC_OrderSummary_Lbl.shouldBeVisible();
	}

	@Step
	public void assertOrderConfirmTitle() throws InterruptedException {
		OC_Title_Lbl.shouldBeVisible();
	}

	@Step
	public void assertOrderSummaryDetails() throws InterruptedException {
		OC_OrderSummary_Lbl.shouldBeVisible();
		OC_OrderSubTotal_Lbl.shouldBeVisible();
		OC_OrderShipping_Lbl.shouldBeVisible();
		OC_OrderTax_Lbl.shouldBeVisible();
		OC_OrderTotal_Lbl.shouldBeVisible();
	}

	@Step
	public void JoinVIPbannerDisplayed() throws InterruptedException {
		OC_JoinVIP_Lbl.shouldBeVisible();
	}

	@Step
	public String getThankYouMsg() throws InterruptedException {
		String ThankYouMsg = OC_ThankYou_Lbl.getText();
		return ThankYouMsg;
	}

	@Step
	public String getOrderNumber() throws InterruptedException {
		String OrderNum = OC_OrderNum_Lbl.getText();
		return OrderNum;
	}

	@Step
	public void verifyHeaderAndFooter() throws AWTException, InterruptedException {
		header.shouldBeCurrentlyVisible();
		CommonPage.pageScrollDown();
		CommonPage.pageScrollDown();
		Thread.sleep(5000);
		footer.shouldBeCurrentlyVisible();
	}

	@Step
	public void verifyRRSLogoFunctionality() throws AWTException, InterruptedException {
		CommonPage.pageScrollUp();
		CommonPage.pageScrollUp();
		Thread.sleep(5000);
		checkOutPage.rrsLogo.shouldBeCurrentlyVisible().isClickable();
		checkOutPage.rrsLogo.click();
		Thread.sleep(5000);
		checkOutPage.navigationHeader.shouldBeCurrentlyVisible();
		loginPage.Login_SVG.isDisplayed();
	}
}
