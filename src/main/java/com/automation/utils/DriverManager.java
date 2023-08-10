package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

	private static WebDriver driver;

	/* getDriver() method is a static method that provides a WebDriver instance. */
	public static WebDriver getDriver() {
		if (driver == null) { // If the driver variable is null, the method creates a new instance of
								// ChromeDriver.

			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless"); // Uncomment for headless mode
			driver = new ChromeDriver(options);
		}
		return driver;
	}

	/*
	 * Responsible for quitting the WebDriver instance if it's not null. This helps
	 * ensure that resources are properly released and the browser is closed at the
	 * end of test execution. The driver variable is set to null after quitting.
	 */
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
