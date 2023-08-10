package com.automation.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.utils.DriverManager;
import com.automation.utils.ScreenshotUtils;

/* Implementation of the onTestFailure method from the ITestListener interface.
 * This method is called when a test method fails during execution. */
public class ScreenshotListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = DriverManager.getDriver();
		if (driver != null) {
			String methodName = result.getName();
			ScreenshotUtils.captureScreenshot(driver, methodName);
		}
	}

}
