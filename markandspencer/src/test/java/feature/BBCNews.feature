Feature: user is able to see all the local news from 30 mile radius
Scenario Outline: verify user data with valid and invalid data

  Given user is on https://www.bbc.co.uk/news home page
  When user clicks on England
  Then user is navigated to bbc.co.uk/england page
  When user click on local news
  And enter "<town>" or "<city>" or "<uk postcode>"
  Then user should able to navigate to local news of searched location
  When user should click on +30 miles radius
  Then user should see all the news up to 30 miles radius
  When user click on yes to set on your  local news
  Then user should able to set as your local news
  When user enter invalid data and click on search
  Then user should able to see error message


Examples:
|Are               |	ExpectedArea|
|Reading	       | Reading        |
|Milton Keynes	   | Milton Keynes|
|Southampton	   | Southampton    |
|London	           |Greater London|
|Manchester	       |Manchester    |
|NewCastle	       |Newcastle upon Tyne|
|ABC               |We couldn't find any results for "abcd"|
|123455            |We couldn't find any results for "123455"|
|£$%^&*&^%$        |We couldn't find any results for ""£$%^&*&^%$"|
