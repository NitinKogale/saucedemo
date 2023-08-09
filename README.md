
Automation API = Selenium 4.10.0
Design pattern = Page Object Model
Programming Language = Java 11
BDD framework = Cucumber 7.12.1
Unit Testing Framework = TestNG
Additional Reporting = Extent Reports

Additional External jars = slf4j-api-2.0.7.jar, slf4j-nop-2.0.7.jar, extentreports-cucumber4-adapter-1.2.1.jar, gson-2.2.4.jar 

Project was converted to TestNG and 'testng.xml' is generated and configured to run the test cases. Right click --> Run as --> TestNG Suite
This should run all the test cases as configure in 'src/test/java/runners/TestRunner.java' @CucumberOptions.

In case above run doesen't happen test cases can be run by right click on feature body and Run as --> Cucumber Feature
There are total 3 feature files created. Two files for testing Website and one for API rest assured test.

There are 6 step definition java files created under 'src\test\java\Steps' to link our feature file to page classes. And one is hooks step def to manage before and after actions.

There are 6 page classes created for each page of application under test 'src\main\java\pages'. These contains locators and page specific methods.

There are 3 java files added in 'src\main\java\utils' to share webdriver instance and data across the steps.

Test cases are configured to run on 'chrome' and 'firefox' browser. Selection of browser can be done by updating value of key 'browser' to any of 'chrome' or 'firefox'
Property file location - 'MyOwn\Saucedemo\configs\Configuration.properties'

Test data is maitained and read from json file at 'MyOwn\Saucedemo\src\test\resources\testDataResources\Users.json'

