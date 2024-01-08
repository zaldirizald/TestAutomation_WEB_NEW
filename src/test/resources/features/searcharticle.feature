Feature: Search Article
  As an User I have be able to Search Article
  so that i can see Article

  @TC01-PositiveLogin
  Scenario: As an User I want to Search Article with valid keyword
    Given User on landing page
    When User input valid Keyword
    And User want to click more
    Then User can see Article