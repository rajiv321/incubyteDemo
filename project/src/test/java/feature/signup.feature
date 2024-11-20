Feature: Validate the signup functionality

  Background: 
    Given I am on the Website 
    When I click on the signup button

  Scenario Outline: Create a signup account for the website
    Then The Signup Page appears
    And I add the "<name>", "<lastname>", "<email>", and "<password>"
    And I click on the submit button
    Then The dashboard should be visible, and I should be signed in
    Then I click on the logout button
    When I click on the signin button
    Then I should be able to redirect to the Signin page
    When I Input the "<email>", and "<password>"
    And I click the signin button
    Then I should be able to signin to the application
    Then I click on the logout button

    Examples: 
      | name | lastname | email             | password   |
      | John | Doe      | john.do012se@tst.com | pass12345@ |
