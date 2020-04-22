package ch.nyp.xinnyi;

import com.google.gson.Gson;

public interface Dto {

    default public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
