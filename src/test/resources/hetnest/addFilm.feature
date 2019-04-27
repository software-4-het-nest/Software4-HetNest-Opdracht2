Feature: Add Film

It should be possible to add a film to the list
Just after the adding of the film, the details of the film should be known
After the list is shown again, the films name should be visable

Scenario: Add one Film
Given I am on the page where I can add a new fim
When I enter "Ready Player One" in the naam field
And I enter "Warner Bros" in the filmproducent.naam field
And I enter "Boek verfilming" in the beschrijving field
And I enter "Tye Sheridan" in the acteurs field
And I press on the Submit button
Then I should see the following on the screen
| label          | data             |
| Naam:          | Ready Player One |
| Filmproducent: | Warner Bros      |
| Beschrijving:  | Boek verfilming  |
| Acteurs:       | Tye Sheridan     |
When I click the Lijst van alle films Link
Then I should see a list containing "Ready Player One"
And I close the browser