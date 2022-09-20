package com.RRS.Pages;

import java.awt.AWTException;
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

	CommonPage commonPage = new CommonPage();

	@FindBy(css = "div.product-card--1gUX4>div.product-card-swatch--3CwpX")
	List<WebElementFacade> productSKUSwatch;

	@FindBy(css = "div.slider-inner--2XlaD")
	List<WebElementFacade> sliderPanel;

	@FindBy(css = "div.product-card--1gUX4>div.product-card-swatch--3CwpX>span.swatch-selected--3k2Gz")
	WebElementFacade defaultProductColorSKU;

	public void scrollToOutFitRunSection() throws AWTException, InterruptedException {
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		Thread.sleep(5000);
	}

	public void verifyBlackColorOfSKUImage() {
		String text = "";
		for (int i = 0; i < productSKUSwatch.size(); i++) {
			List<WebElement> element = productSKUSwatch.get(i).findElements(By.tagName("span"));
			int count = element.size();
			System.out.println(count);
			if (element.size() == 1) {
				text = element.get(0).getAttribute("aria-label").toLowerCase();
				System.out.println("Swatch Element is one:" + text);
				Assert.assertTrue(text.contains("black") || text.contains("white") || text.contains("grey")
						|| text.contains("green") || text.contains("red") || text.contains("blue")
						|| text.contains("yellow") || text.contains("purple") || text.contains("orange")
						|| text.contains("ice") || text.contains("nature") || text.contains("pink"));
			} else {
				text = defaultProductColorSKU.getAttribute("aria-label");
				System.out.println("Swatch Element is Greater than one:" + text);
				Assert.assertTrue(!text.toLowerCase().contains("black"));
				log.info("Product SKU Color Variant doesn't have Black at First Position");
			}
		}
	}

	public void verifyBlackColorOfSKUImageInOutFitSection() throws AWTException, InterruptedException {
		commonPage.pageScrollDown();
		Thread.sleep(5000);
		String text = "";
		List<WebElement> element = sliderPanel.get(0).findElements(By.cssSelector("div.product-card-swatch--2U9C1"));
		for (int i = 0; i < element.size(); i++) {
			List<WebElement> skuColor = element.get(i).findElements(By.tagName("span"));
			int count = skuColor.size();
			System.out.println(count);
			if (skuColor.size() == 1) {
				text = skuColor.get(0).getAttribute("aria-label").toLowerCase();
				System.out.println("Swatch Element is one:" + text);
				Assert.assertTrue(text.contains("black") || text.contains("white") || text.contains("grey")
						|| text.contains("green") || text.contains("red") || text.contains("blue")
						|| text.contains("yellow") || text.contains("purple") || text.contains("orange")
						|| text.contains("ice") || text.contains("nature") || text.contains("pink"));
			} else {
				List<WebElement> firstPosition = sliderPanel.get(0)
						.findElements(By.cssSelector("div.product-card-swatch--2U9C1>span.swatch-selected--3k2Gz"));
				text = firstPosition.get(i).getAttribute("aria-label");
				System.out.println("Swatch Element is Greater than one:" + text);
				Assert.assertTrue(!text.toLowerCase().contains("black"));
				log.info("Product SKU Color Variant doesn't have Black at First Position");
			}
		}
	}

	public void verifyBlackColorOfSKUImageInYouMayAlsoLikeSection() throws AWTException, InterruptedException {
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		Thread.sleep(5000);
		String text = "";
		List<WebElement> element = sliderPanel.get(1).findElements(By.cssSelector("div.product-card-swatch--2U9C1"));
		for (int i = 1; i < element.size(); i++) {
			List<WebElement> skuColor = element.get(i).findElements(By.tagName("span"));
			int count = skuColor.size();
			System.out.println(count);
			if (skuColor.size() == 1) {
				text = skuColor.get(0).getAttribute("aria-label").toLowerCase();
				System.out.println("Swatch Element is one:" + text);
				Assert.assertTrue(text.contains("black") || text.contains("white") || text.contains("grey")
						|| text.contains("green") || text.contains("red") || text.contains("blue")
						|| text.contains("yellow") || text.contains("purple") || text.contains("orange")
						|| text.contains("ice") || text.contains("nature") || text.contains("pink"));
			} else {
				List<WebElement> firstPosition = sliderPanel.get(0)
						.findElements(By.cssSelector("div.product-card-swatch--2U9C1>span.swatch-selected--3k2Gz"));
				text = firstPosition.get(i).getAttribute("aria-label");
				System.out.println("Swatch Element is Greater than one:" + text);
				Assert.assertTrue(!text.toLowerCase().contains("black"));
				log.info("Product SKU Color Variant doesn't have Black at First Position");
			}
		}
	}

	public void verifyBlackColorOfSKUImageInTopPicksSection() throws AWTException, InterruptedException {
		commonPage.pageScrollDown();
		commonPage.pageScrollDown();
		Thread.sleep(5000);
		String text = "";
		List<WebElement> element = sliderPanel.get(0).findElements(By.cssSelector("div.product-card-swatch--2U9C1"));
		for (int i = 0; i < element.size(); i++) {
			List<WebElement> skuColor = element.get(i).findElements(By.tagName("span"));
			int count = skuColor.size();
			System.out.println(count);
			if (skuColor.size() == 1) {
				text = skuColor.get(0).getAttribute("aria-label").toLowerCase();
				System.out.println("Swatch Element is one:" + text);
				Assert.assertTrue(text.contains("black") || text.contains("white") || text.contains("grey")
						|| text.contains("green") || text.contains("red") || text.contains("blue")
						|| text.contains("yellow") || text.contains("purple") || text.contains("orange")
						|| text.contains("ice") || text.contains("nature") || text.contains("pink"));
			} else {
				List<WebElement> firstPosition = sliderPanel.get(0)
						.findElements(By.cssSelector("div.product-card-swatch--2U9C1>span.swatch-selected--3k2Gz"));
				text = firstPosition.get(i).getAttribute("aria-label");
				System.out.println("Swatch Element is Greater than one:" + text);
				Assert.assertTrue(!text.toLowerCase().contains("black"));
				log.info("Product SKU Color Variant doesn't have Black at First Position");
			}
		}
	}
}
