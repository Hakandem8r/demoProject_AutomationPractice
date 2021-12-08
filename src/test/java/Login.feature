Feature: Login Test

  Scenario: Go to Amazon and test login page

    Given go to Amazon website
    And click on login button
    And input a name
    And input a password
    When clicked on submit button
    Then verify the success message