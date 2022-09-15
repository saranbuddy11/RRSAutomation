package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustomQueryPage extends PageObject {
	public static Logger log = LogManager.getLogger(CustomQueryPage.class);

	@FindBy(css = "h1.tag_h1--hWc2x")
	WebElementFacade Header_Label;

	public void clickOnQuery(String query) throws InterruptedException {
		getDriver().get(query);
		Thread.sleep(8000);
		while (!Header_Label.isVisible()) {
			getDriver().navigate().refresh();
			Thread.sleep(8000);
		}
	}

	public void validateHeaderOfPage(String query) {
		String expectedHeader = query.substring(40);
		expectedHeader = expectedHeader.replace("&z=true", "");
		if (expectedHeader.contains("%")) {
			expectedHeader = expectedHeader.replace("%20", " ");
			if (expectedHeader.contains("2")) {
				expectedHeader = expectedHeader.replace("2", "");
				expectedHeader = expectedHeader.replace("0", "");
			}
		}
		System.out.println(expectedHeader.toLowerCase());
		String actualHeader = Header_Label.getText().toLowerCase();
		Assert.assertTrue(actualHeader.contains(expectedHeader.toLowerCase()));
	}

	public void validateQueryURL(String keyword) {
		Assert.assertTrue(getDriver().getCurrentUrl().contains(keyword));
	}
}
