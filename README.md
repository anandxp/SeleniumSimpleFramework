# SeleniumSimpleFramework
SeleniumSimpleFramework is a lightweight, modular test automation framework built using Selenium WebDriver and Java. It simplifies UI test automation with reusable components, efficient reporting, and easy integration with CI/CD pipelines. Designed for scalability, it ensures maintainable and reliable test execution.


# Automation Framework

This project is a Selenium-based automation framework for testing web applications. It uses TestNG for test management and Maven for build automation.

## Features

- Cross-browser testing (Chrome, Firefox, Edge)
- Page Object Model (POM) design pattern
- Configurable via `config.properties`

## Prerequisites

- Java 11+
- Maven 3.6+
- Browsers: Chrome, Firefox, Edge

## Setup

1. Clone the repository.
2. Update `src/main/resources/config.properties` with your settings.
3. Run tests using Maven:
   ```sh
   mvn test
