# SauceDemoAutomation

# Selenium Automation for SauceDemo

This project automates an end-to-end workflow on https://www.saucedemo.com using:

- Selenium WebDriver
- TestNG (for test execution)
- Page Object Model (POM)
- Log4j (for logging)
- Extent Reports (for HTML test reports)
- (Optional) RestAssured for API mocking or validations

## Project Structure

- `pages/`: Page Object Model classes
- `tests/`: Test execution logic
- `utils/`: Logging, reporting, and base configuration
- `resources/`: Log4j and TestNG config

## Prerequisites

- Java 11+
- Maven
- TestNG plugin (for IDE)
- ChromeDriver in system PATH

## How to Run

```bash
mvn clean test
