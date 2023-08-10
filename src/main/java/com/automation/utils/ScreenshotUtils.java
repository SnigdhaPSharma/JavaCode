package com.automation.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils {

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = "screenshots/" + screenshotName + ".png";
		try {
			FileHandler.copy(src, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
