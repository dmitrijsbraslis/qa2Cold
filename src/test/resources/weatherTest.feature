Feature: Weather test for London
  Scenario: Lon and Lat check
    Given city name is London,uk
    When we are getting weather data
    Then lon is: -0.13
    And lat is: 51.51