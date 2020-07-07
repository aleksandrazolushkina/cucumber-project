Feature: Beer cans

  Scenario: Counting beer cans
    Given I have <opening balance> beer cans
    """
    Lorem ipsum dolor sit amet
    """
    And I have drunk <processed> beer cans
    When I go to my fridge
    Then I should have <in stock> beer cans
