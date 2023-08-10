package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.dataproviders.HomeData;
import com.automation.pages.HomePage;
import com.automation.utils.BaseClass;

public class HomePageTest extends BaseClass {

	private HomePage homePage;

	/*
	 * @DataProvider annotation to specify that @Test will receive data from the
	 * welcomeMessageData data provider method in the HomeData class. The
	 * expectedMessage parameter is populated with test data from the data provider.
	 */
	@Test(dataProvider = "welcomeMessageData", dataProviderClass = HomeData.class)
	public void testWelcomeMessage(String expectedMessage) {
		homePage = new HomePage(driver);
		String actualMessage = homePage.getWelcomeMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
