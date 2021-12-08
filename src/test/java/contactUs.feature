Feature: Contact us Test

  Scenario: Go to website and test Contact us page

    Given navigate to website
    And click on contact us button
    And select Subject Heading
    And type the email
    And type Order reference
    And type a message
    When click on send button
    Then verify success message