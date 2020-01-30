Feature: I want to verify signin to http://automationpractice.com/index.php

Scenario: Login verify
Given user clicks signin
Then Send emailid
Then send password
And Click Sign in
