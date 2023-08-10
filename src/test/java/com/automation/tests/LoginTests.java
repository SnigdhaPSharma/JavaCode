package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.dataproviders.LoginData;
import com.automation.pages.LoginPage;
import com.automation.utils.BaseClass;

public class LoginTests extends BaseClass {

	private LoginPage loginPage; // Instance of LoginPage used to interact with loginpage elements


	/*
	 * @DataProvider annotation specifies that the test method will receive data
	 * from the loginData data provider method in the LoginData class. The username
	 * and password parameters are populated with test data from the data provider.
	 */
	@Test(dataProvider = "validLoginData", dataProviderClass = LoginData.class)
	public void testValidLogin(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();

	}

	@Test(dataProvider = "invalidLoginData", dataProviderClass = LoginData.class)
	public void testInvalidLogin(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();

		Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message should be displayed for invalid login");
	}

}
