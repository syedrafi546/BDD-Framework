Feature: Testing Savaari.com

Scenario: Registation
Given Initialize browser with chrome
And Navigate to "https://www.savaari.com/" site
And click on sign link in home page to land on secure sign in page
And click on register
When User enters details and register
Then Close the driver

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate "https://www.savaari.com/" site
When User enters <username> and <password> and login
Then Close driver
Examples:
|username    |password	|
|syedrafi546@gmail.com	|uqumyq	|

Scenario: Car check for local
Given Initialize a browser with chrome
And Navigate to the "https://www.savaari.com/" site
When User clicks on local and select location and search
Then Driver close

Scenario: Manage Bookings
Given Initialize a browser wt chrome
And Navigate to thee "https://www.savaari.com/" site
When User enter the login details and login
Then Driver should close

Scenario: Account Update
Given Initialize browser wt chrome
And Navigate thee "https://www.savaari.com/" site
When User enter the login details and navigated to the account update page
Then Driver should be close

Scenario: Trip Advisor
Given Initialize browser chrome
And Navigate too "https://www.savaari.com/" site
When User check review on trip advisor
Then Driver sld be close

Scenario: App Download
Given Initialize with browser chrome
And Navigate to the url "https://www.savaari.com/" site
When User download the savaari app
Then closed the driver

Scenario: User Log Out
Given Initialize with the browser chrome
And Navigate to the savaari url "https://www.savaari.com/" site
When User click on account section and log out
Then close the chrome driver