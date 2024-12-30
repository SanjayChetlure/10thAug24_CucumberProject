Feature: place order hook information

Scenario: fetch recently placed order
Given user should get logged in
And user should be at orders page
When user click on recent orders
Then user should see recently placed order

Scenario: fetch previously placed order
Given user should get logged in
And user should be at orders page
When user click on past orders
Then user should see previously placed order

Scenario: fetch canceled order info
Given user should get logged in
And user should be at orders page
When user click on cancel orders
Then user should see canceled order info