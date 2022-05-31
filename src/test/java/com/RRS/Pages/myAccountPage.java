package com.RRS.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.thucydides.core.annotations.Step;

public class myAccountPage extends PageObject {

	@FindBy(xpath = "//div[contains(@aria-label,'Hi')]//*[name()='svg']")
	WebElementFacade Profile_SVG_Btn;

	@FindBy(xpath = "//div[contains(@class,'dropdown-item--3Kiul')]//a[contains(@class,'')][normalize-space()='My Account']")
	WebElementFacade myaccount_SVG_link;

	@FindBy(xpath = "//h1[normalize-space()='MY ACCOUNT']")
	WebElementFacade MyAccount_Header;

	@FindBy(xpath = "//small[normalize-space()='Orders']")
	WebElementFacade MyAccount_Orders;

	@FindBy(xpath = "//small[normalize-space()='Buy Again']")
	WebElementFacade MyAccount_Buy_Again;

	@FindBy(xpath = "//small[normalize-space()='Addresses']")
	WebElementFacade MyAccount_Addresses;

	@FindBy(xpath = "//small[normalize-space()='Wallet']")
	WebElementFacade MyAccount_Wallet;

	@FindBy(xpath = "//small[normalize-space()='Logout']")
	WebElementFacade MyAccount_Logout;

	@FindBy(xpath = "//h3[normalize-space()='PERSONAL INFO']")
	WebElementFacade MyDetails_PersonalInfo;

	@FindBy(xpath = "//h3[normalize-space()='VIP FAMILY']")
	WebElementFacade MyDetails_VIPFamily;

	@FindBy(xpath = "//h3[normalize-space()='PRIMARY ADDRESS']")
	WebElementFacade MyDetails_PrimaryAddress;

	@FindBy(xpath = "//h3[normalize-space()='PRIMARY PAYMENT METHOD']")
	WebElementFacade MyDetails_PrimaryPaymentMethod;
	
	@FindBy(xpath = "//h3[contains(text(),'VIP Savings Since')]")
	WebElementFacade vipSaving_Lbl;
	
	@FindBy(xpath = "//p[text()='10% Instant savings on every order']")
	WebElementFacade instantSaving_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'VIP Savings Since')]/preceding::h2[contains(@class,'reward-title')]")
	WebElementFacade vipSavingAmount_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'VIP Rewards Cash Balance')]")
	WebElementFacade vipRewardsCashBalance_Lbl;
	
	@FindBy(xpath = "//small[text()='5% earned every order']")
	WebElementFacade earnedEveryOrder_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'VIP Rewards Cash Balance')]/../h2[contains(@class,'reward-title')]")
	WebElementFacade vipRewardsCashAmount_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'Guarantee')]")
	WebElementFacade guarantee_Lbl;
	
	@FindBy(xpath = "//small[text()='Test run shoes, socks, insoles & KORSA apparel']")
	WebElementFacade gureanteeText_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'Guarantee')]/../h2[contains(@class,'reward-title')]")
	WebElementFacade guranteeDays_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'SHIPPING')]")
	WebElementFacade shipping_Lbl;
	
	@FindBy(xpath = "//small[text()='Out the door in 2 hours']")
	WebElementFacade outTheDoor_Lbl;
	
	@FindBy(xpath = "//h3[contains(text(),'SHIPPING')]/../h2[contains(@class,'reward-title')]")
	WebElementFacade shippingAmount_Lbl;
	
	@FindBy(xpath = "//a[contains(@class,'history-button')]")
	WebElementFacade historyButton;
	
	@FindBy(xpath = "//h2[text()='MY ORDERS']")
	WebElementFacade myOrders_Lbl;
	
	@FindBy(xpath = "//a[text()='View Order Details']")
	WebElementFacade viewOrderDetails_Btn;
	
	@FindBy(xpath = "//div[contains(@class,'order-item-body')]//div[contains(@class,'line-item-product-detail')]/h4")
	WebElementFacade orderProductDetails;
	
	
	
	
	@Step
	public void click_Myaccount_link() {

		Profile_SVG_Btn.click();
		myaccount_SVG_link.click();
		MyAccount_Header.shouldBeVisible();

	}

	public void pageScrolltwice() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	@Step
	public void validate_Myaccount_Dashboard() {

		MyAccount_Orders.shouldBeVisible();
		MyAccount_Buy_Again.shouldBeVisible();
		MyAccount_Addresses.shouldBeVisible();
		MyAccount_Wallet.shouldBeVisible();
		MyAccount_Logout.shouldBeVisible();

		System.out.println("MyAccount_Orders.shouldBeVisible()::" + MyAccount_Orders.shouldBeVisible());
		System.out.println("MyAccount_Buy_Again.shouldBeVisible()::" + MyAccount_Buy_Again.shouldBeVisible());
		System.out.println("MyAccount_Addresses.shouldBeVisible()::" + MyAccount_Addresses.shouldBeVisible());
		System.out.println("MyAccount_Wallet.shouldBeVisible()::" + MyAccount_Wallet.shouldBeVisible());
		System.out.println("MyAccount_Logout.shouldBeVisible()::" + MyAccount_Logout.shouldBeVisible());

	}
	
	@Step
	public void user_ensure_appliction_not_displaying_my_account_page() {

		MyAccount_Orders.shouldNotBeVisible();
		MyAccount_Buy_Again.shouldNotBeVisible();
		MyAccount_Addresses.shouldNotBeVisible();
		MyAccount_Wallet.shouldNotBeVisible();
		MyAccount_Logout.shouldNotBeVisible();

		System.out.println("MyAccount_Orders.shouldBeVisible()::" + MyAccount_Orders.shouldNotBeVisible());
		System.out.println("MyAccount_Buy_Again.shouldBeVisible()::" + MyAccount_Buy_Again.shouldNotBeVisible());
		System.out.println("MyAccount_Addresses.shouldBeVisible()::" + MyAccount_Addresses.shouldNotBeVisible());
		System.out.println("MyAccount_Wallet.shouldBeVisible()::" + MyAccount_Wallet.shouldNotBeVisible());
		System.out.println("MyAccount_Logout.shouldBeVisible()::" + MyAccount_Logout.shouldNotBeVisible());

	}
	
	

	@Step
	public void validate_My_Details() throws AWTException {
		pageScroll();
		MyDetails_PersonalInfo.shouldBeVisible();
		MyDetails_VIPFamily.shouldBeVisible();
		MyDetails_PrimaryAddress.shouldBeVisible();
		MyDetails_PrimaryPaymentMethod.shouldBeVisible();
	}
	
	@Step
	public void validate_My_Details_NonVIP() throws AWTException {
		pageScroll();
		MyDetails_PersonalInfo.shouldBeVisible();
		MyDetails_PrimaryAddress.shouldBeVisible();
		MyDetails_PrimaryPaymentMethod.shouldBeVisible();
	}
	
	

	public void pageScroll() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}
	
	@Step
	public void user_validates_vip_savings_section_details() {
		vipSavingAmount_Lbl.shouldBeVisible();
		instantSaving_Lbl.shouldBeVisible();
		vipSavingAmount_Lbl.shouldBeVisible();
	}
	
	@Step
	public void user_validates_vip_rewards_cash_balance_section_details() {
		vipRewardsCashBalance_Lbl.shouldBeVisible();
		earnedEveryOrder_Lbl.shouldBeVisible();
		vipRewardsCashAmount_Lbl.shouldBeVisible();
	}
	
	@Step
	public void user_validates_gurantee_section_details() {
		guarantee_Lbl.shouldBeVisible();
		gureanteeText_Lbl.shouldBeVisible();
		guranteeDays_Lbl.shouldBeVisible();
	}
	
	@Step
	public void user_validates_free_shopping_section_details() {
		shipping_Lbl.shouldBeVisible();
		outTheDoor_Lbl.shouldBeVisible();
		shippingAmount_Lbl.shouldBeVisible();
	}
	
	@Step
	public void user_click_on_see_all_orders_button() {
		historyButton.click();
		waitFor(myOrders_Lbl);
	}
	
	
	@Step
	public void user_verify_my_orders_page_with_previous_order_details() {
		myOrders_Lbl.shouldBeVisible();
		viewOrderDetails_Btn.shouldBeVisible();
		orderProductDetails.shouldBeVisible();
	}
	
	
	
	
}
