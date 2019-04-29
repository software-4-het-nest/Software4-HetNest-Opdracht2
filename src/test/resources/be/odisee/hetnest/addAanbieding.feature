Feature: Add Aanbieding

  It should be possible to add a aanbieding to the list
  just after adding the aanbieding, the details of the aanbieing should be known
  After the list is shown again, the aanbieding name should be visible

    Scenario: Add one aanbieding
    Given I am on the page where I can introduce a new aanbieding
    When I enter "Redouane" in the naam field
    And I enter "50" in the hoeveelheid field
    And I enter "80" in the prijs field
    And I enter "Appelen" in the type field
    And I press on the Save button
    Then I should see the following on the screen
    | Id: id         |
    | naam: Redouane |
    | hoeveelheid: 50|
    | prijs: 80      |
    | type: Appelen  |
    When I click the the Lijst van alle aanbiedingen link
    Then I should see a list containing "Redouane"
    And I close the browser

