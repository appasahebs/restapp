Feature: Sample scenarios
   Scenario Outline: Adding numbers
      Given my current state is cleared,
      When I enter the "<first number>",
      And I press "+",
      And I enter the "<second number>",
      And I press "=",
      Then the result must be "<sum>".
      Examples:
        | first number | second number | sum |
        | 10           | 20            | 30  |
        | 20           | 5             | 25  |
        | 30           | 1             | 31  |

  Scenario: Ashu returns a shoes
    Given Ashu has bought a shoes for $100
    And he has its bill
    When he returns the shoes
    Then Ashu should be refunded $100

  Scenario Outline: Search QATOOL internal wiki.
    Given I open the "<browser>" browser
    And I navigating to QATOOL
    Then I click the search box
    And I enter "<toolname>" in search box
    And I click Search button
    Then I should be taken to search result page
    And I verify <toolresult> on search page

  Examples:
    | browser | toolname    | toolresult|
    | chrome  | json parser | pyjos     |
    | firefox | json to csv | json2csv  |
