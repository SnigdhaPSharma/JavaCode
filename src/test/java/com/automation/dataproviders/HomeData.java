package com.automation.dataproviders;

import org.testng.annotations.DataProvider;

public class HomeData {

	@DataProvider(name = "welcomeMessageData")
	public Object[][] getWelcomeMessageData() { // creates and returns the 2D array containing test data.
		return new Object[][] { { "Welcome, User1!" }, { "Hello, Snigdha!" },

		};
	}

}
