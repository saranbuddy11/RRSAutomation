package com.RRS.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class CommonPage extends PageObject {
	@Step
	public Robot getRobot() {
		Robot robot = null;
		try {
			robot = new Robot();
			robot.setAutoDelay(250);
		} catch (AWTException e) {
			e.printStackTrace();
		}

		return robot;
	}

	@Step
	public void javaScriptExecutor_Click(WebElementFacade WebElement) throws InterruptedException {
		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].click();", WebElement);
		Thread.sleep(1000);
	}

	@Step
	public void javaScriptExecutor_Click(WebElement WebElement) throws InterruptedException {
		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].click();", WebElement);
		Thread.sleep(1000);
	}

	@Step
	public void javaScriptExecutor_Scroll(WebElementFacade WebElement) throws InterruptedException {
		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].scrollIntoView(true);", WebElement);
		Thread.sleep(1000);
	}

	public void javaScriptExecutor_Scroll(WebElement WebElement) throws InterruptedException {
		JavascriptExecutor jse2 = (JavascriptExecutor) getDriver();
		jse2.executeScript("arguments[0].scrollIntoView(true);", WebElement);
		Thread.sleep(1000);
	}

	public void actions_PageDown() {
		Actions a = new Actions(getDriver());
		a.sendKeys(Keys.PAGE_DOWN);
	}

	public void actions_Tab() {
		Robot robot = getRobot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void actions_DownArrow() {
		Robot robot = getRobot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public void actions_UpArrow() {
		Robot robot = getRobot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
	}

	public void actions_Enter() {
		Robot robot = getRobot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void actions_sendPhoneNumbersOnebyOne() throws InterruptedException {
		Robot robot = getRobot();
		robot.keyPress(KeyEvent.VK_8);
		robot.keyRelease(KeyEvent.VK_8);

		robot.keyPress(KeyEvent.VK_7);
		robot.keyRelease(KeyEvent.VK_7);

		robot.keyPress(KeyEvent.VK_6);
		robot.keyRelease(KeyEvent.VK_6);

		robot.keyPress(KeyEvent.VK_9);
		robot.keyRelease(KeyEvent.VK_9);
		robot.keyPress(KeyEvent.VK_9);
		robot.keyRelease(KeyEvent.VK_9);
		robot.keyPress(KeyEvent.VK_9);
		robot.keyRelease(KeyEvent.VK_9);

		robot.keyPress(KeyEvent.VK_8);
		robot.keyRelease(KeyEvent.VK_8);
		robot.keyPress(KeyEvent.VK_7);
		robot.keyRelease(KeyEvent.VK_7);
		robot.keyPress(KeyEvent.VK_6);
		robot.keyRelease(KeyEvent.VK_6);
		robot.keyPress(KeyEvent.VK_6);
		robot.keyRelease(KeyEvent.VK_6);
	}

	public float convertStrFloat(String Str) {
		return Float.parseFloat(Str);
	}

	@Step
	public void pageScrolltwice() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	@Step
	public void pageScrollDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	@Step
	public void pageScrollUp() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	@Step
	public void pageZoomOut() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}
