Feature: login feature

Scenario: login with valid crdentials
Given user is on login page
When user enter username "abc1"
And user enter password "xyz1"
And user enter pin 12345
And user click on login btn
Then user should be on home page
