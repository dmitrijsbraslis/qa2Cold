package apiTests;

import apiTests.model.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WeatherStepDefs {
    private String city;
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @Given("city name is (.*)")
    public void set_city_name(String city) {
        this.city = city;
    }

    @When("we are getting weather data")
    public void request_weather() {
        response = weatherRequester.getWeather(city);
    }

    @Then("lon is: (.*)")
    public void check_lon(double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Lon is incorrect");
    }

    @Then("lat is: (.*)")
    public void check_lat(double lat) {
        Assertions.assertEquals(lat, response.getCoord().getLat(), "Lat is incorrect");
    }
}
