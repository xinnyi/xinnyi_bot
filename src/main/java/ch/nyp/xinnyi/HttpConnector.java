package ch.nyp.xinnyi;

import org.springframework.http.HttpStatus;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class HttpConnector {

    private static HttpClient httpClient = HttpClient.newBuilder().build();

    private static HttpResponse send(String httpMethod, String urlAsString, String payload, Map<String, String> headers) {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder().uri(URI.create(urlAsString));

        if (payload == null) {
            requestBuilder.method(httpMethod, HttpRequest.BodyPublishers.noBody());
        } else {
            requestBuilder.method(httpMethod, HttpRequest.BodyPublishers.ofString(payload))
                    .setHeader("Content-Type", "application/json");
        }

        if (headers != null) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                requestBuilder.setHeader(header.getKey(), header.getValue());
            }
        }

        HttpRequest httpRequest = requestBuilder.build();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            HttpStatus status = HttpStatus.valueOf(response.statusCode());
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HttpResponse get(String url) {
        return send("GET", url, null, null);
    }

    public static HttpResponse get(String url, String payload) {
        return send("GET", url, payload, null);
    }

    public static HttpResponse get(String url, String payload, Map<String, String> headers) {
        return send("GET", url, payload, headers);
    }

    public static HttpResponse post(String url) {
        return send("POST", url, null, null);
    }

    public static HttpResponse post(String url, String payload) {
        return send("POST", url, payload, null);
    }

    public static HttpResponse post(String url, String payload, Map<String, String> headers) {
        return send("POST", url, payload, headers);
    }

}
