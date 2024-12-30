@Positive
Feature: login feature with Tags

@Sanity 
Scenario: login with valid credentials
Given user is on login page
When user enter username
And user enter password
And user click on login btn
Then user should be on home page

@Smoke
Scenario: verify title of the app
Given user is on login page
Then title of the app should be visible

@Regression 
Scenario: verify title of the forgotten pwd page
Given user is on login page
When user click on forgotten pwd link
Then title of the forgotten pwd page should be visible
