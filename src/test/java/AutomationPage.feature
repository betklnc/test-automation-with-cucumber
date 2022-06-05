Feature:  Obss Automation Web Page Test

  Scenario: Verify Automation search results
    Given navigate to website
    And click on search icon
    When type Automation on search box
    Then verify the searching results
    When click on first result
    Then verify Testing and Automation page is opened
    When scroll to the end
    Then verify the page footer


 # Scenario: Verify Testing And Automation page
 #  And type Automation on search box
 #  When click on first result
 #  Then verify the Testing and Automation page is opened

  #Scenario: Verify the page footer
  #  And type Automation on search box
  #  And click on first result
  #  When scroll to the end
  #  Then verify the page footer

