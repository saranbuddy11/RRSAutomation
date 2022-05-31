package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class CheckoutS3Page extends PageObject{
	public static Logger log = LogManager.getLogger(CheckoutS3Page.class);
	CommonPage CommonPage = new CommonPage();
	
	@FindBy(xpath="//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade CheckoutS3_OrderSummary_Lbl;
	
	@FindBy(xpath="//h2[normalize-space()='SHIPPING']")
	WebElementFacade CheckoutS3_Shipping_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'order-summary--')]//div[1]/p[2]")
	WebElementFacade CheckoutS3_OrderSubTotal_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'order-summary--')]//div[2]/p[2]")
	WebElementFacade CheckoutS3_ShippingFee_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'order-summary--')]//div[3]/p[2]")
	WebElementFacade CheckoutS3_TaxFee_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'order-summary--')]//div[4]/h4[2]")
	WebElementFacade CheckoutS3_EstTotal_Lbl;
	
	@FindBy(xpath="//input[@id='Upgraded Delivery']")
	WebElementFacade CheckoutS3_UpgradedDelivery_ChkBox;
	
	@FindBy(xpath="//input[@id='Regular Delivery']")
	WebElementFacade CheckoutS3_RegularDelivery_ChkBox;
	
	@FindBy(xpath="//h5[@id='sourceCode']")
	WebElementFacade CheckoutS3_SourceCode_lnk;
	
	@FindBy(xpath="//h2[normalize-space()='PAYMENT']")
	WebElementFacade CheckoutS3_Payment_Lbl;
	
	@FindBy(xpath="//input[contains(@value,'giftCard')]")
	WebElementFacade CheckoutS3_GiftCard_ChkBox;
	
	@FindBy(xpath="//input[@id='name']")
	WebElementFacade CheckoutS3_CCName_Txt;
	
	@FindBy(xpath="//body/div[@id='__next']/main[@id='rrs-main']/div[@class='container--24-hd ']/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]")
	WebElementFacade CheckoutS3_Paypal_ChkBox;
	
	@FindBy(xpath="(//input[contains(@name,'firstName')])[1]")
	WebElementFacade CheckoutS3_Shipping_FirstName;
	
	@FindBy(xpath="(//input[contains(@name,'lastName')])[1]")
	WebElementFacade CheckoutS3_Shipping_LastName;
	
	@FindBy(xpath="(//input[contains(@name,'address1')])[1]")
	WebElementFacade CheckoutS3_Shipping_Address1;
	
	@FindBy(xpath="(//input[contains(@name,'city')])[1]")
	WebElementFacade CheckoutS3_Shipping_City;
	
	@FindBy(xpath="(//input[contains(@name,'postalCode')])[1]")
	WebElementFacade CheckoutS3_Shipping_ZipCode;
	
	@FindBy(xpath="//input[@name='email']")
	WebElementFacade CheckoutS3_Shipping_Email;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElementFacade CheckoutS3_Shipping_PhoneNumber;
	
	@FindBy(xpath="//input[@id='name']")
	WebElementFacade CheckoutS3_CC_Name;
	
	@FindBy(xpath="//input[@name='creditCardNumber']")
	WebElementFacade CheckoutS3_CC_CardNumber;
	
	@FindBy(xpath="//input[@name='expirationMonth']")
	WebElementFacade CheckoutS3_CC_ExpairyMonth;
	
	@FindBy(xpath="//input[@name='expirationYear']")
	WebElementFacade CheckoutS3_CC_ExpairyYear;
	
	@FindBy(xpath="//input[@name='CVN']")
	WebElementFacade CheckoutS3_CC_CVV;
	
	@FindBy(xpath="//input[@value='billingSameAsShipping']")
	WebElementFacade CheckoutS3_SameAsShipping_ChkBox;
	
	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Place Order'])[1]")
	WebElementFacade CheckoutS3_PlaceOrder_Btn;
	
	@FindBy(xpath="//h4[contains(normalize-space(),'Order #')]")
	WebElementFacade orderConfirm_OrderNum_Lbl;
	
	@Step
	public void Checkout_ClickPlaceOrderBtn() throws InterruptedException {
		//CheckoutS3_PlaceOrder_Btn.click();
		CommonPage.javaScriptExecutor_Click(CheckoutS3_PlaceOrder_Btn);
		Thread.sleep(3000);
		orderConfirm_OrderNum_Lbl.shouldBeVisible();
		}
	
	@Step
	public void payment_ccNewCard(String CCName,String CC_CardNumber, String CC_ExpairyMonth,String CC_ExpairyYear, String CC_CVV ) throws InterruptedException {
		typeInto(CheckoutS3_CC_Name,CCName);
		typeInto(CheckoutS3_CC_CardNumber,CC_CardNumber);
		typeInto(CheckoutS3_CC_ExpairyMonth,CC_ExpairyMonth);
		typeInto(CheckoutS3_CC_ExpairyYear,CC_ExpairyYear);
		typeInto(CheckoutS3_CC_CVV,CC_CVV);
		
		//CheckoutS3_SameAsShipping_ChkBox.click();
		CommonPage.javaScriptExecutor_Click(CheckoutS3_SameAsShipping_ChkBox);
		
		Thread.sleep(5000);
		}
	
	@Step
	public void shipping_enterPhoneNumber(String PhoneNumber) throws InterruptedException {
		CheckoutS3_Shipping_PhoneNumber.click();
		Thread.sleep(250);
		//typeInto(CheckoutS3_Shipping_PhoneNumber,PhoneNumber);
		CommonPage.actions_sendPhoneNumbersOnebyOne();
		}
	
	@Step
	public void shipping_enterEmail(String Email) throws InterruptedException {
		typeInto(CheckoutS3_Shipping_Email,Email);
		}
	
	@Step
	public void shipping_enterZip(String Zip) throws InterruptedException {
		typeInto(CheckoutS3_Shipping_ZipCode,Zip);
		}
	
	@Step
	public void shipping_enterCity(String City) throws InterruptedException {
		typeInto(CheckoutS3_Shipping_City,City);
		}
	
	@Step
	public void shipping_enterAddress1(String Address1) throws InterruptedException {
		typeInto(CheckoutS3_Shipping_Address1,Address1);
		Thread.sleep(2000);
		CommonPage.actions_DownArrow();
		CommonPage.actions_Enter();
		}
	
	@Step
	public void shipping_enterFirstLastName(String FristName,String LastName) throws InterruptedException {
		typeInto(CheckoutS3_Shipping_FirstName,FristName);
		typeInto(CheckoutS3_Shipping_LastName,LastName);
		}
	
	@Step
	public void PayPalPaymentIsDisplayed() throws InterruptedException {
		CheckoutS3_Paypal_ChkBox.shouldBeVisible();
		}
	
	@Step
	public void CCPaymentisDisplayed() throws InterruptedException {
		CheckoutS3_CCName_Txt.shouldBeVisible();
		}
	
	@Step
	public void giftCardPayment_ChkBox() throws InterruptedException {
		CheckoutS3_GiftCard_ChkBox.shouldBeVisible();
		}
	
	@Step
	public void scrollToPaymentsection() throws InterruptedException {
		CommonPage.javaScriptExecutor_Scroll(CheckoutS3_Payment_Lbl);
		}
	
	@Step
	public void clickSourceCode() throws InterruptedException {
		CheckoutS3_SourceCode_lnk.click();
		}
	
	@Step
	public void clickUpgradedDeliveryBox() throws InterruptedException {
		//CheckoutS3_UpgradedDelivery_ChkBox.click();
		CommonPage.javaScriptExecutor_Click(CheckoutS3_UpgradedDelivery_ChkBox);
		}
	
	@Step
	public void assertCheckOutS3PageDisplayed() throws InterruptedException {
		CheckoutS3_OrderSummary_Lbl.shouldBeVisible();
		CheckoutS3_Shipping_Lbl.shouldBeVisible();
		}
	
	@Step
	public void assertOrderSummaryLabel() throws InterruptedException {
		CheckoutS3_OrderSubTotal_Lbl.shouldBeVisible();
		CheckoutS3_ShippingFee_Lbl.shouldBeVisible();
		CheckoutS3_TaxFee_Lbl.shouldBeVisible();
		CheckoutS3_EstTotal_Lbl.shouldBeVisible();
		}
	
	@Step
	public String getOrderSubTotal() throws InterruptedException {
		String SubTotal=CheckoutS3_OrderSubTotal_Lbl.getText();
		String SubTotal_No$=SubTotal.replace("$", "");
		//String SubTotal_OnlyAmt=SubTotal_No$.replace("Order Subtotal", "");
		return SubTotal_No$;
		}
	
	@Step
	public String getShippingFee() throws InterruptedException {
		String ShippingFee=CheckoutS3_ShippingFee_Lbl.getText();
		String ShippingFee_No$;
		if(ShippingFee.equals("FREE")) {
			log.info("Shipping is FREE");
			ShippingFee_No$=ShippingFee;
		}else {
		ShippingFee_No$=ShippingFee.replace("$", "");
		}
		return ShippingFee_No$;
		}
	
	@Step
	public String getTaxFee() throws InterruptedException {
		String TaxFee=CheckoutS3_TaxFee_Lbl.getText();
		String TaxFee_No$=TaxFee.replace("$", "");
		return TaxFee_No$;
		}
	
	@Step
	public String getEstTotal() throws InterruptedException {
		String EstTotal=CheckoutS3_EstTotal_Lbl.getText();
		String EstTotal_No$=EstTotal.replace("$", "");
		return EstTotal_No$;
		}
	
}
