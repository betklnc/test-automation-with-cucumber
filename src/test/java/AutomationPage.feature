Feature:  Obss Automation Web Page Test

  Background:
    Given navigate to website
    And click on search icon

 Scenario: Verify Automation search results
   When type Automation on search box
   Then verify the searching results

  Scenario: Verify Testing And Automation page
   And type Automation on search box
   When click on first result
   Then verify the Testing and Automation page is opened

  #Scenario: Verify the page footer
  #  And type Automation on search box
  #  And click on first result
  #  When scroll to the end
  #  Then verify the page footer

