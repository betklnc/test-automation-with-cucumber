Feature: Automation Web Page Test

  Scenario: Verify Automation search results
    Given navigate to website
    And click on search icon
    When type Automation on search box
    Then verify the searching results
    When click on first result
    Then verify Testing and Automation page is opened
    When scroll to the end
    Then verify the page footer




