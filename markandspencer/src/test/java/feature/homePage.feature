Feature: Navigate to MarkandSpencer HomePage
  Background: Sucessfully Navigate to MarkandSpencer Homepage
    Given iam on google HomePage
    When i enter MarkandSpencer and click on googleSearch Button
    And i click on MarkandSpencer link from search result
    Then i should to navigated to MarkandSpencer HomePage

    Scenario: verifying Search Funtionality
      When i click on search text box and enter flowers
      And Click on Search icon
      Then i should be navigated to flower Page
      When i click on sort by drop down and click on NewArrivals option
      Then it should Display all the new arrivals flower
