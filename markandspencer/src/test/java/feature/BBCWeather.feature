Feature: Verifying BBC Weather for 6 days
  Scenario Outline: verifying weather with valid and invalid data
    Given user is on https://www.bbc.co.uk/weather home page
    When user enter "<town>"or"<city>" or "<uk postcode>"
    Then user should be able to see weather report of 6 days
    When user enter invalid data
    Then user should able to see error message

    Examples:
    |Search 	     |ExpectedSearch|
    |Eastleigh	     |Eastleigh, Hampshire
    |Devon	         |Devonport, Plymouth
    |EX16	         |EX16, Postcode District
    |Southampton     |Southampton, Southampton
    |London	London,  | Greater London
    |inverness	     |Inverness, Highland
    |Isle of Sky	 |Isle of Skye, Highland
    |wales	         |Wales, Rotherham
   | isle of wight	 |Isle of Wight/Sandown Airport, Isle of Wight
   | ABCD	         |We couldn't find any results for "ABCD"
   | 1234567898	     |We couldn't find any results for "1234567898"
   |#$%#*^%($^%*(%*	 |We couldn't find any results for "#$%#*^%($^%*(%*"

