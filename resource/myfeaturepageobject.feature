Feature: Page Model Concept test

  Scenario: As a User of the Website I can Set and Validate the Page2 text input field
    Given I am on the LandingPage
    When I click on the "Go to html5test2" link on the Landing Page
    And I click the "Populatetextfield1" button
    Then The "button1clickpara" textfield will be populated
