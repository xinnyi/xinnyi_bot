package ch.nyp.xinnyi.core;

import com.google.gson.Gson;

public interface ExtendedDTO {

    default public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
