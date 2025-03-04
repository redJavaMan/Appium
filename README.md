# Appium Mobile Automation Framework

## Project Overview
This is an automated mobile testing framework for an Android application (General Store) using Appium, Java, TestNG, and Selenium WebDriver.

## Tech Stack
- **Automation Tool**: Appium
- **Programming Language**: Java
- **Testing Framework**: TestNG
- **Build Tool**: Maven
- **Mobile Automation**: Appium Java Client
- **WebDriver**: Selenium Remote WebDriver

## Project Structure
```
Appium/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/
│   │   │   │   └── User.java
│   │   │   └── pages/
│   │   │       ├── HomePage.java
│   │   │       ├── ProductPage.java
│   │   │       └── CartPage.java
│   │   └── resources/
│   │       └── General-Store.apk
│   │
│   └── test/
│       └── java/
│           ├── Base/
│           │   └── BaseTest.java
│           └── AppTest/
│               └── LoginTest.java
│
├── pom.xml
└── README.md
```

## Key Features
- Page Object Model (POM) design pattern
- Configurable test setup for Android devices
- Appium driver configuration
- TestNG test scenarios
- User model for test data management

## Prerequisites
- Java JDK 8+
- Maven
- Appium
- Android SDK
- Android Emulator or Physical Device

## Setup Instructions
1. Clone the repository
2. Install dependencies:
   ```
   mvn clean install
   ```
3. Ensure Appium is installed globally
4. Update device and app paths in `BaseTest.java`
5. Run tests:
   ```
   mvn test
   ```

## Test Scenarios
- User login with country and name selection
- Adding product to cart
- Completing purchase flow

## Configuration Notes
- Device Name: Configured in `BaseTest.java`
- Appium Server: Runs on `127.0.0.1:4723`
- Implicit Wait: 10 seconds

## Dependencies
- Appium Java Client 8.5.1
- TestNG 7.8.0
- Selenium WebDriver 4.13.0

## Troubleshooting
- Ensure Appium server is running
- Check device connectivity
- Verify app path and device name

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
