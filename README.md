# Data-Driven Selenium Java Framework

This project demonstrates a data-driven approach to automated testing using Selenium WebDriver, Java, TestNG, and Apache POI for reading test data from Excel files.

## Project Structure

The project is structured as follows:
ProjectRoot/  
├── src/  
│ ├── main/   
│ │ ├── java/    
│ │ │ ├── com.automation.pages/   
│ │ │ │ ├── LoginPage.java   
│ │ │ │ ├── HomePage.java   
│ │ │ ├── com.automation.utils   
│ │ │ │ ├── DriverManager.java   
│ │ │ │ ├── ScreenshotUtils.java   
│ │ │ ├── com.automation.listeners   
│ │ │ │ ├── ScreenshotListener.java   
│ │ ├── resources/   
│ │ │ ├── drivers    
│ │ │ │ ├── chromedriver.exe   
│ │ │ ├── testdata   
│ │ │ │ ├── LoginTestData.xlsx   
│ ├── test/    
│ │ ├── java/    
│ │ │ ├── com.automation.tests/    
│ │ │ │ ├── LoginTests.java   
│ │ │ │ ├── HomePageTest.java   
│ │ │ ├── com.automation.dataproviders/    
│ │ │ │ ├── LoginData.java    
│ │ │ │ ├── HomeData.java    
│ │ ├── resources/    
├── testng.xml   
├── pom.xml   


## Features

- Page Object Model (POM) design pattern
- TestNG for test management and execution
- Apache POI for reading test data from Excel files
- Data-driven tests for login and home page scenarios

## Getting Started

1. Clone this repository to your local machine.
2. Install Java and set up your preferred Java IDE.
3. Open the project in your IDE.
4. Configure the project dependencies by updating the `pom.xml` file.
5. Update the browser driver path in the `DriverManager` class if needed.
6. Update the test data Excel file(s) with appropriate sheets and columns for the application under test.
7. Update the locators in the `LoginPage` and `HomePage` classes to match the application under test.
8. Run the tests using TestNG from the `testng.xml` file.

## Test Execution

1. Run the tests using your preferred IDE or by executing the following command in the terminal:   
mvn clean test -DsuiteXmlFile=testng.xml

## Contributors

- Snigdha Sharma
