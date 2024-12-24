Feature: login feature

Scenario: login with valid crdentials
Given user is on login page
When user enter username
When user enter password
When user click on login btn
Then user should be on home page
