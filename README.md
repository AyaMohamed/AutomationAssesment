
# Automation Assessment task

This project aims to show my expertise in automation testing and functional testing on the business of the given application.
 


## Overview

This project aims to validate the below test scenarios on all the available countries on this website https://subscribe.stctv.com/sa-en
- TC1: Type : Plan type
- TC2: Price: Price of the plan
- TC3: Currency: Currency of the selected country

Additionally, this project/task is implemented using:
- TestNG testing framework
- Keyword driven framework
## Features

- Keyword-driven framework structure
- Page Object Model (POM) design pattern
- TestNG for test execution and reporting
- ExcelUtil for reading test data from Excel files
- WebDriverManager for managing WebDriver binaries
- Capturing screenshots for validation


## Setup

- Clone the repository: git clone https://github.com/AyaMohamed/AutomationAssesment
- Install dependencies: mvn clean install
- Update Keywords.CSV file with test keywords and data

    
## Project Structure

- Keywords package -> Keywords class: Contains keyword methods for performing actions and validations
- Objects Package -> SubscriptionPageObjects class: Contains locators for subscription page elements/objects
- tests -> BaseTests class: Base test class with setup and teardown methods
- tests -> SubscriptionPageValidationTests class: Test class with test methods for each country.
- resources/Keywords.csv: this is the Keywords file that contains the actions that should be performed on each testcase for each country.
resources -> screenshots: contrains the captured screenshots of any failed test case.


## Dependencies
- TestNG
- Selenium WebDriver
- WebDriverManager
- Apache POI



## Authors

- Aya Mohamed aymohamed@testcrew.com
