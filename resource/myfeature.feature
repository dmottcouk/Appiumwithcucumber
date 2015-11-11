Feature: This is my Dmott website feature file

  #Scenario: This is my first dummy scenario
  #  Given This is my first dummy given step
  #  When This is my first dummy when step
  #   Then This is my first dummy then step
  
  
  Scenario Outline: As a User of the Dmott Website I can automatatically populate the textfields
    Given I navigate to the "Dmott.co.uk/html5test2.html" website
    When I click on the <ButtonName1>
    Then The text is shown in the <TextParaName>
    And I close the browser

    Examples: 
      | ButtonName1                  | TextParaName       |
      | "buttonToPopulatetextinput1" | "button1clickpara" |
      | "buttonToPopulatetextinput2" | "button2clickpara" |
