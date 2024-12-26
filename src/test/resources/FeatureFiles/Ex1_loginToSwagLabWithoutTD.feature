Feature: login feature

Scenario: login with valid crdentials
Given user is on login page
When user enter username
And user enter password
And user click on login btn
Then user should be on home page
