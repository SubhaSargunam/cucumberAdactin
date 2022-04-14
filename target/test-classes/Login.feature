
Feature: Validating the login page of Adactin 
Scenario: Validating login by entering valid username and password
Given User is on Adactin Login Page
When user enter the userName 'Sargunam' and password 'OE9LXG'
And user clicks on Login button
Then Validate the user enters into Search Hotel page.

  