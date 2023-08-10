package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	// Locators for the webelements using Page Factory Model
	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(id = "errorMessage")
	private WebElement errorMessage;

	// Constructor for the LoginPage class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Fill the username
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	// Fill the password
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	// Click on the Login Button
	public void clickLoginButton() {
		loginButton.click();
	}

	// Validate the error message in case of unsuccessful login
	public boolean isErrorMessageDisplayed() {
		return errorMessage.isDisplayed();
	}

}
