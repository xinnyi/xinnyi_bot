package ch.nyp.xinnyi;

import ch.nyp.xinnyi.dto.Credentials;
import ch.nyp.xinnyi.error.BadRequestException;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.HashMap;

@Service
public class APIServiceImpl implements APIService {

    private HashMap<String, String> headers = new HashMap<>();

    public APIServiceImpl() {
        login();
    }

    private void login() {
        HttpResponse response = HttpConnector.post(XinnyiApplication.API_URL + "/login", new Credentials(XinnyiApplication.API_USERNAME, XinnyiApplication.API_PASSWORD));
        if (response.statusCode() == 200) {
            System.out.println("login body: " + response.body());
            System.out.println("login headers: " + response.headers());
            headers.put("Authorization", response.headers().firstValue("authorization").get());
        } else {
            throw new BadRequestException("login error");
        }
    }

    public String getUsers() {
        HttpResponse response = HttpConnector.get(XinnyiApplication.API_URL + "/users", null, headers);
        if (response.statusCode() == 200) {
            return (String) response.body();
        } else {
            throw new BadRequestException("api error");
        }
    }
}
