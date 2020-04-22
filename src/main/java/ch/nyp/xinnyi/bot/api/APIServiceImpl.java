package ch.nyp.xinnyi.bot.api;

import ch.nyp.xinnyi.bot.api.dtos.Credentials;
import ch.nyp.xinnyi.core.HttpConnector;
import ch.nyp.xinnyi.error.BadRequestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.HashMap;

@Service
public class APIServiceImpl implements APIService {

    @Value("${xinnyi.API_URL}")
    private String API_URL;

    @Value("${xinnyi.API_USERNAME}")
    private String API_USERNAME;

    @Value("${xinnyi.API_PASSWORD}")
    private String API_PASSWORD;

    private HashMap<String, String> headers = new HashMap<>();

    public APIServiceImpl() {
        login();
    }

    private void login() {
        HttpResponse response = HttpConnector.post(API_URL + "/login", new Credentials(API_USERNAME, API_PASSWORD));
        if (response.statusCode() == 200) {
            System.out.println("login body: " + response.body());
            System.out.println("login headers: " + response.headers());
            headers.put("Authorization", response.headers().firstValue("authorization").get());
        } else {
            throw new BadRequestException("login error");
        }
    }

    public String getUsers() {
        HttpResponse response = HttpConnector.get(API_URL + "/users", null, headers);
        if (response.statusCode() == 200) {
            return (String) response.body();
        } else {
            throw new BadRequestException("api error");
        }
    }
}
