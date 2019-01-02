package apiTests;

import apiTests.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class WeatherRequester {
    private final String URL_PREFIX = "https://samples.openweathermap.org/data/2.5/weather?q=";
    private final String URL_POSTFIX = "&appid=b6907d289e10d714a6e88b30761fae22";

    public Response getWeather(String city) {
        String url = URL_PREFIX + city + URL_POSTFIX;

        HttpHeaders headers = new HttpHeaders();

        List<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);

        headers.setAccept(mediaTypes);
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.ex(url, Response.class).getBody();
    }
}
