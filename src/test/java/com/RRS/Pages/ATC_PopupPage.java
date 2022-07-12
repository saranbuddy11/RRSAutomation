package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ATC_PopupPage extends PageObject {
	CommonPage CommonPage = new CommonPage();

	public static Logger log = LogManager.getLogger(ATC_PopupPage.class);

	@FindBy(xpath = "//a[normalize-space()='View cart']")
	WebElementFacade A2CPP_ViewCart_Btn;

	@FindBy(xpath = "//div[contains(@class,'mini-cart-body-item-price')]/span[contains(@class,'price-original')]")
	WebElementFacade A2CPP_OriginalPrice_lbl;

	@FindBy(xpath = "//div[contains(@class,'mini-cart-body-item-price')]/span[contains(@class,'price-vip')]")
	// @FindBy(xpath="/html[1]/body[1]/div[8]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
	WebElementFacade A2CPP_VIPPrice_lbl;

	@FindBy(xpath = "//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade Order_Summary_lbl;

	@Step
	public void clickViewCartBtn_A2CPopUp() throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.click();
		waitFor(Order_Summary_lbl);
		Thread.sleep(5000);
		Order_Summary_lbl.shouldBeVisible();
	}

	@Step
	public void assertSizeVariantDisplayedIsCorrect(String SizeVariant) throws InterruptedException {
		String DynamicElement = "//p[normalize-space()='Size " + SizeVariant + "']";
		System.out.println("Dynamic xpath created: " + DynamicElement);
		WebElement ele = getDriver().findElement(By.xpath(DynamicElement));
		if (ele.isDisplayed()) {
			log.info("Correct Size variant Displayed in the Pop Up");
		} else {
			log.info("Correct Size variant NOT Displayed in the Pop Up");
		}
	}

	@Step
	public void assertColorVariantDisplayedIsCorrect(String ColorVariant) throws InterruptedException {
		String DynamicElement = "//p[normalize-space()='" + ColorVariant + "']";
		System.out.println("Dynamic xpath created: " + DynamicElement);
		WebElement ele = getDriver().findElement(By.xpath(DynamicElement));
		if (ele.isDisplayed()) {
			log.info("Correct Color variant Displayed in the Pop Up");
		} else {
			log.info("Correct Color variant NOT Displayed in the Pop Up");
		}
	}

	@Step
	public String getVIPDisplayed_A2CPP() throws InterruptedException {
		String VIPDisplayed = A2CPP_VIPPrice_lbl.getText();
		log.info("VIP price Displayed: " + VIPDisplayed);
		String VIPDisplayed_No$ = VIPDisplayed.replace("$", "");
		log.info("VIP price without $: " + VIPDisplayed_No$);
		String VIPDisplayed_OnlyAmount = VIPDisplayed_No$.replace("VIP Price", "");
		log.info("VIP price Only Amount: " + VIPDisplayed_OnlyAmount);
		// float VIPDisplayed_float=CommonPage.convertStrFloat(VIPDisplayed_OnlyAmount);
		return VIPDisplayed_OnlyAmount;
	}

	@Step
	public String getMSRPDisplayed_A2CPP() throws InterruptedException {
		String MSRPDisplayed = A2CPP_OriginalPrice_lbl.getText();
		log.info("MSRP Displayed in Popup: " + MSRPDisplayed);
		String MSRPDisplayed_No$ = MSRPDisplayed.replace("$", "");
		log.info("MSRP without $: " + MSRPDisplayed_No$);
		// float MSRPDisplayed_float=CommonPage.convertStrFloat(MSRPDisplayed_No$);
		return MSRPDisplayed_No$;
	}

	@Step
	public void assertA2CPopUPDisplayed() throws InterruptedException {
		waitFor(A2CPP_ViewCart_Btn);
		A2CPP_ViewCart_Btn.shouldBeVisible();
	}
}
