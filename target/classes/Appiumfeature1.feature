Feature: This is my Control Page Tests


Scenario: As a User of the NewMetro app I can enter the beats per minute into the Edit field
    Given I am on the Control page
    When I enter "100" into the BPM field
    And I enter the Return key
    Then The Slider will be set to value "100"

    
  Scenario: As a User of the NewMetro app I can enter the beats per minute by using the slider
    Given I am on the Control page
    When I set the slider bpm value to "100"
    Then The BPM field will be set to value "100"  
    
