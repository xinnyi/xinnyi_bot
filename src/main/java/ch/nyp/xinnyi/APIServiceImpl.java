package ch.nyp.xinnyi;

import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.HashMap;

@Service
public class APIServiceImpl implements  APIService{

    private static String jwtToken;

    public APIServiceImpl() {
        login();
        getUsers();
    }

    private void login() {
        HttpResponse response = HttpConnector.post(XinnyiApplication.API_URL + "/login", "{\"email\":\""+XinnyiApplication.API_USERNAME+"\",\"password\":\""+XinnyiApplication.API_PASSWORD+"\"}");
        System.out.println("login body: "+response.body());
        System.out.println("login headers: "+response.headers());
        setJwtToken(response.headers().firstValue("authorization").get());
    }

    private void getUsers(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization",jwtToken);
        HttpResponse response = HttpConnector.get(XinnyiApplication.API_URL+"/users", null,headers );
        System.out.println("users: "+response.body());
    }

    public static String getJwtToken() {
        return jwtToken;
    }

    public static void setJwtToken(String jwtToken) {
        APIServiceImpl.jwtToken = jwtToken;
    }
}
