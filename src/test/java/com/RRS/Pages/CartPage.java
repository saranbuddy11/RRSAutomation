package com.RRS.Pages;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.RRS.StepDefinitions.Cart_StepDefinitions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import com.RRS.Utilities.*;

public class CartPage extends PageObject{
	public static Logger log = LogManager.getLogger(CartPage.class);
	CommonPage CommonPage = new CommonPage();
	
	@FindBy(xpath="//h3[normalize-space()='ORDER SUMMARY']")
	WebElementFacade Order_Summary_lbl;
	
	@FindBy(xpath="//a[normalize-space()='Checkout']")
	WebElementFacade Cart_Checkout_Btn;
	
	@FindBy(xpath="//button[@aria-label='Decrease Quantity']")
	WebElementFacade Cart_DecreaseQuantity_Btn;
	
	@FindBy(xpath="//button[@aria-label='Increase Quantity']")
	WebElementFacade Cart_IncreaseQuantity_Btn;
	
	@FindBy(xpath="//span[contains(@class,'price-original--')]")
	WebElementFacade Cart_OriginalPrice_Lbl;
	
	@FindBy(xpath="//button[normalize-space()='Join for $1.99']")
	WebElementFacade Cart_JoinVIPProgram_Btn;
	
	@FindBy(xpath="//div[contains(@class,'paypal-button')][@aria-label='PayPal']")
	WebElementFacade Cart_PayPal_Btn;
	
	@FindBy(xpath="//h5[@id='sourceCode']")
	WebElementFacade Cart_SourceCode_Btn;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter Code')]")
	WebElementFacade Cart_EnterSourceCode_Txt;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElementFacade Cart_ApplySourceCode_Btn;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='path'][1]")
	WebElementFacade Cart_CartIcon_homePage_SVGBtn;
	
	@FindBy(xpath="//main[@id='rrs-main']//div[1]//div[1]//div[2]//div[1]//div[4]")
	WebElementFacade Cart_TotalVIPSavings_Lbl;
	
	@FindBy(xpath="//h3[normalize-space()='GREAT CHOICE! YOUR ITEM IS NOW ADDED TO YOUR CART']")
	WebElementFacade Cart_TotalVIPSavings_PopUp_Lbl;
	
	@FindBy(xpath="//a[normalize-space()='View cart']")
	WebElementFacade Cart_ViewCart_Btn;
	
	@FindBy(xpath="//p[normalize-space()='Welcome VIP!']")
	WebElementFacade Cart_WelcomeVIP_Lbl;
	
	@FindBy(xpath="//main[@id='rrs-main']//div[4]")
	WebElementFacade Cart_EstTotal_Lbl;
	
	@FindBy(xpath="//div[contains(@class,'text-align-right--')]/span[2]")
	WebElementFacade Cart_VIPPriceProduct_Lbl;
	
	@FindBy(xpath="//h1[text()='START CHECKOUT']")
	WebElementFacade Checkout_StartCheckout_Lbl;
	
	@FindBy(xpath="//button[text()='UPGRADE TO VIP REWARDS PLUS']")
	WebElementFacade Checkout_UpgradetoRewardPlus_Btn;	
	
	@Step
	public void clickCheckoutButtonAsVIPUser() throws InterruptedException {
		Cart_Checkout_Btn.click();
		Checkout_UpgradetoRewardPlus_Btn.shouldBeVisible();		
		}
	
	@Step
	public void clickCheckoutButton() throws InterruptedException {
		Cart_Checkout_Btn.click();
		Checkout_StartCheckout_Lbl.shouldBeVisible();
		
		}
	
	@Step
	public String getVIPPriceDisplayed_CartPage() throws InterruptedException {
		String VIPPRiceDisplayed=Cart_VIPPriceProduct_Lbl.getText();
		String VIPPRiceDisplayed_without$=VIPPRiceDisplayed.replace("$", "");
		log.info("VIP Price displayed in cart page is: "+VIPPRiceDisplayed_without$);
		return VIPPRiceDisplayed_without$;
		}
	
	@Step
	public String getEstTotalAmount_CartPage() throws InterruptedException {
		String EstAmount=Cart_EstTotal_Lbl.getText();
		String EstAmount_without$=EstAmount.replace("$", "");
		String EstAmount_withoutAnything=EstAmount_without$.replace("Est. Total", "");
		log.info("Total Estimated Amount without anything: "+EstAmount_withoutAnything);
		return EstAmount_withoutAnything;
		}
	
	@Step
	public void clickViewCart_CartPage() throws InterruptedException {
		Cart_ViewCart_Btn.click();
		Cart_WelcomeVIP_Lbl.shouldBeVisible();
		}
	
	@Step
	public void validatejoinVIPProgramPopupDispalyed_CartPage() throws InterruptedException {
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
		}
	
	@Step
	public void clickjoinVIPProgram_CartPage() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.click();
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
		}
	
	@Step
	public void joinVIPProgram_CartPage() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.click();
		Cart_TotalVIPSavings_PopUp_Lbl.shouldBeVisible();
		Cart_ViewCart_Btn.click();
		Cart_WelcomeVIP_Lbl.shouldBeVisible();
		}
	
	@Step
	public String getTotalVIPSavingsAmount_CartPage() throws InterruptedException {
		String TotalSavings=Cart_TotalVIPSavings_Lbl.getText();
		String TotalSavings_without$=TotalSavings.replace("$", "");
		String TotalSavings_withoutAnything=TotalSavings_without$.replace("Your VIP Total", "");
		log.info("Total VIP Savings Amount displayed before getting VIP membership: "+TotalSavings_withoutAnything);
		return TotalSavings_withoutAnything;
		}
	
	@Step
	public void clickSvgCartIcon() throws InterruptedException {
		Actions a = new Actions(getDriver());
	      a.moveToElement(Cart_CartIcon_homePage_SVGBtn).
	      click().build().perform();
	      
	      Cart_Checkout_Btn.shouldBeVisible();
		}
	
	@Step
	public void ApplyValidSourceCode(String Code) throws InterruptedException {
		Cart_SourceCode_Btn.click();
		Cart_EnterSourceCode_Txt.shouldBeVisible();
		typeInto(Cart_EnterSourceCode_Txt,Code);
		Cart_ApplySourceCode_Btn.click();
		}
	
	@Step
	public void assertPayPalButtonDisplayed() throws InterruptedException {
		//Cart_PayPal_Btn.shouldBeVisible();
		log.info("PayPal payment method button got displayed");
		}
	
	@Step
	public void assertJoinVIPProgramButtonDisplayed() throws InterruptedException {
		Cart_JoinVIPProgram_Btn.shouldBeVisible();
		}
	
	@Step
	public void assertCheckoutButtonDisplayed() throws InterruptedException {
		Cart_Checkout_Btn.shouldBeVisible();
		}
	
	@Step
	public void decreaseQuantityby1_validateChanges(String SingleProductOriginalPrice) throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Cart_DecreaseQuantity_Btn);
		Cart_OriginalPrice_Lbl.shouldBeVisible();
		String ReducedOriginalPrice=Cart_OriginalPrice_Lbl.getText();
		String ReducedOriginalPrice_NO$=ReducedOriginalPrice.replace("$", "");
		log.info("Reduced Original price in string: "+ReducedOriginalPrice_NO$);
		float ReducedOriginalPrice_float=CommonPage.convertStrFloat(ReducedOriginalPrice_NO$);
		log.info("Reduced Original price in float: "+ReducedOriginalPrice_float);
		
		float SingleProductOriginalPrice_float=CommonPage.convertStrFloat(SingleProductOriginalPrice);
		assertTrue(ReducedOriginalPrice_float==SingleProductOriginalPrice_float);
		}
	
	@Step
	public void increaseQuantityby1_validateChanges(String SingleProductOriginalPrice) throws InterruptedException {
		CommonPage.javaScriptExecutor_Click(Cart_IncreaseQuantity_Btn);
		Cart_OriginalPrice_Lbl.shouldBeVisible();
		String DoubledOriginalPrice=Cart_OriginalPrice_Lbl.getText();
		String DoubledOriginalPrice_NO$=DoubledOriginalPrice.replace("$", "");
		log.info("Doubled Original price in string: "+DoubledOriginalPrice_NO$);
		float DoubledOriginalPrice_float=CommonPage.convertStrFloat(DoubledOriginalPrice_NO$);
		log.info("Doubled Original price in float: "+DoubledOriginalPrice_float);
		
		float SingleProductOriginalPrice_float=CommonPage.convertStrFloat(SingleProductOriginalPrice);
		assertTrue(DoubledOriginalPrice_float==(SingleProductOriginalPrice_float*2));
		}
	
	@Step
	public void assertViewCartPageDsplayed() throws InterruptedException {
		Order_Summary_lbl.shouldBeVisible();
		Cart_Checkout_Btn.shouldBeVisible();
		}
	
}
