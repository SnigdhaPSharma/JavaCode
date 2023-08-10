package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	// Locators for webElements using PageFactory model
	@FindBy(id = "welcomeMessage")
	private WebElement welcomeMessage;

	@FindBy(id = "logoutButton")
	private WebElement logoutButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Get the text of welcome message on home page
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}

	// Click on logout message
	public void clickLogoutButton() {
		logoutButton.click();
	}

}
