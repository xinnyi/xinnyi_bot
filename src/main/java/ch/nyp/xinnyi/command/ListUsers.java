package ch.nyp.xinnyi.command;

import ch.nyp.xinnyi.APIService;
import ch.nyp.xinnyi.error.BadRequestException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ListUsers implements Command {

    private APIService apiService;

    public ListUsers(APIService apiService) {
        this.apiService = apiService;
    }

    @Override public String getResponseText() {
        try {
            return URLEncoder.encode(apiService.getUsers(), "UTF-8");
        } catch (BadRequestException | UnsupportedEncodingException e) {
            return "command error";
        }
    }
}
