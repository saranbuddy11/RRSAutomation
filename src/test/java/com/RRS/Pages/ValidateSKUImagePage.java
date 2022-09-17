package com.RRS.Pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class ValidateSKUImagePage extends PageObject {
	public static Logger log = LogManager.getLogger(ValidateSKUImagePage.class);

	@FindBy(css = "div.product-card--1gUX4>div.product-card-swatch--3CwpX")
	WebElementFacade productSKu;

	@FindBy(css = "div.product-card--1gUX4>div.product-card-swatch--3CwpX>span.swatch-selected--3k2Gz")
	WebElementFacade defaultProductColorSKu;

	public void verifyBlackColorOfSKUImage() {
		String text = "";
		List<WebElement> element = productSKu.findElements(By.tagName("span"));
		for (int i = 0; i < element.size(); i++) {
			if (element.size() == 1) {
				text = element.get(0).getAttribute("aria-label").toLowerCase();
				Assert.assertTrue(text.contains("black") || text.contains("white") || text.contains("gray")
						|| text.contains("green") || text.contains("red") || text.contains("blue")
						|| text.contains("yellow") || text.contains("purple") || text.contains("orange"));
			} else {
				text = defaultProductColorSKu.getAttribute("aria-label");
				Assert.assertTrue(!text.toLowerCase().contains("black"));
			}
		}
	}
}
