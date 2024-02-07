# Selenium-Youtube
This is a sample project to demonstrate what is page object model framework and how it can used in selenium to automate any application. TestNG is used as test framework.

Dependency Java Maven

## Requirements
- Java will be the language used for this exercise
- Should make use of the Page Object Model
- TestNG will be the test framework to be used
- Browser: Chrome

## Test Steps with Assertions
- 1: Go to https://www.youtube.com/
- 2: Search for Tiger Woods best golf shots
- 3: Select the second video on the list 
- 4: Click on subscribe button beside the PGA Tour Channel icon
- 5: Include assertions

## How to run this project
- 1: Clone the Repo, use this command: git clone https://github.com/EvanReen/Selenium-Youtube.git
- 2: Open your terminal or command prompt in the project directory.
- 3: Type the command: 'mvn clean package' and press Enter
- 4: Type the command: 'mvn test -Dtest=YoutubeTest' to run the test
