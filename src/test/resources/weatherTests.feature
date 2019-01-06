Feature:  Weather tests
  Scenario: Coordinates check
    Given city name: London,uk
    When we are requesting weather info
    Then lon is: -0.13
    And lat is: 51.51