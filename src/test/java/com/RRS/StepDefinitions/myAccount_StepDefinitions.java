package com.RRS.StepDefinitions;

import java.awt.AWTException;

import com.RRS.Pages.loginPage;
import com.RRS.base.baseClass;
import com.RRS.Pages.myAccountPage;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Steps;

public class myAccount_StepDefinitions extends baseClass {

	@Steps
	myAccountPage myAccountPage;
	@Steps
	loginPage loginPage;

	@Then("User click on My account button in Home Page")
	public void user_click_on_my_account_button_in_home_page() {
		myAccountPage.click_Myaccount_link();

	}

	@Then("User validates list of dashboard pages")
	public void user_validates_list_of_dashboard_pages() {

		myAccountPage.validate_Myaccount_Dashboard();

	}

	@Then("User validates My Details in My account page")
	public void user_validates_my_details_in_my_account_page() throws AWTException {
		myAccountPage.validate_My_Details();
	}
	
	@Then("User validates My Details for Non-VIP user in My account page")
	public void user_validates_my_details_nonVIP_in_my_account_page() throws AWTException {
		myAccountPage.validate_My_Details_NonVIP();
	}
	
	@Then("User ensure appliction not displaying my account page")
	public void user_ensure_appliction_not_displaying_my_account_page() {
		myAccountPage.user_ensure_appliction_not_displaying_my_account_page();
	}

	@Then("User validates VIP Savings section details")
	public void user_validates_vip_savings_section_details() {
		myAccountPage.user_validates_vip_savings_section_details();
	}
	
	@Then("User validates VIP Rewards Cash Balance section details")
	public void user_validates_vip_rewards_cash_balance_section_details() {
		myAccountPage.user_validates_vip_rewards_cash_balance_section_details();
	}
	@Then("User validates Gurantee section details")
	public void user_validates_gurantee_section_details() {
		myAccountPage.user_validates_gurantee_section_details();
	}
	@Then("User validates Free Shopping section details")
	public void user_validates_free_shopping_section_details() {
		myAccountPage.user_validates_free_shopping_section_details();
	}
	@Then("User click on See All orders button")
	public void user_click_on_see_all_orders_button() {
		myAccountPage.user_click_on_see_all_orders_button();
	}
	
	@Then("User verify MY ORDERS page with previous order details")
	public void user_verify_my_orders_page_with_previous_order_details() {
		myAccountPage.user_verify_my_orders_page_with_previous_order_details();
	}

	

}
