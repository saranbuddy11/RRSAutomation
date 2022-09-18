package com.RRS.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;

public class CustomQueryPage extends PageObject {
	public static Logger log = LogManager.getLogger(CustomQueryPage.class);

	private EnvironmentVariables env;
	String url = "";

	@FindBy(css = "h1.tag_h1--hWc2x")
	WebElementFacade Header_Label;

	public void clickOnQuery(String query) throws InterruptedException {
		String environment = EnvironmentSpecificConfiguration.from(env).getProperty("execution.environment");
		if (environment == "uat") {
			url = "https://uat.roadrunnersports.com/" + query;
		} else {
			url = "https://www.roadrunnersports.com/" + query;
		}
		getDriver().get(url);
		Thread.sleep(8000);
		while (!Header_Label.isVisible()) {
			getDriver().navigate().refresh();
			Thread.sleep(8000);
		}
	}

	public void validateHeaderOfPage(String query) {
		String expectedHeader = query.substring(7);
		expectedHeader = expectedHeader.replace("&z=true", "");
		if (expectedHeader.contains("%")) {
			expectedHeader = expectedHeader.replace("%20", " ");
			if (expectedHeader.contains("2")) {
				expectedHeader = expectedHeader.replace("2", "");
				expectedHeader = expectedHeader.replace("0", "");
			}
		}
		String actualHeader = Header_Label.getText().toLowerCase();
		Assert.assertTrue(actualHeader.contains(expectedHeader.toLowerCase()));
	}

	public void validateQueryURL(String keyword) {
		Assert.assertTrue(getDriver().getCurrentUrl().contains(keyword));
	}
}
