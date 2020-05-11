package ch.nyp.xinnyi.bot.api;

import ch.nyp.xinnyi.bot.api.dtos.Credentials;
import ch.nyp.xinnyi.core.HttpConnector;
import ch.nyp.xinnyi.error.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.HashMap;

@Service
public class APIServiceImpl implements APIService {

    private HashMap<String, String> headers = new HashMap<>();

    private Logger logger = LoggerFactory.getLogger(APIServiceImpl.class);
    private Environment environment;

    @Autowired
    public APIServiceImpl(Environment environment) {
        this.environment = environment;
        login();
    }

    private void login() {
        HttpResponse response = HttpConnector.post(environment.getProperty("xinnyi.API_URL") + "/login", new Credentials(environment.getProperty("xinnyi.API_USERNAME"), environment.getProperty("xinnyi.API_PASSWORD")));
        if (response.statusCode() == 200) {
            headers.put("Authorization", response.headers().firstValue("authorization").get());
            logger.info("Connected to api");
        } else {
            throw new BadRequestException("api login error");
        }
    }

    public String getUsers(String userId) {
        headers.put("userid", userId);
        HttpResponse response = HttpConnector.get(environment.getProperty("xinnyi.API_URL") + "/users", null, headers);
        if (response.statusCode() == 200) {
            return (String) response.body();
        } else {
            throw new BadRequestException("api error");
        }
    }
}
