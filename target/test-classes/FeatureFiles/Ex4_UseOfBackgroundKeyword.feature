Feature: login feature

Background:
Given user is on login page
When user enter username "abc1"
And user enter password "xyz1"
And user enter pin 12345
And user click on login btn

Scenario: title validation
Then get Title & verify


Scenario: profile name validation
And user click on profile tab
Then get profile name & validate


Scenario: logout from app
And user click on profile tab
And user click on logout btn
Then logged out from app




