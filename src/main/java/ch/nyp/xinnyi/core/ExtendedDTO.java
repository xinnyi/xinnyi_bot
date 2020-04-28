package ch.nyp.xinnyi.core;

import com.google.gson.Gson;

public interface ExtendedDTO {

    default String toJson() {
        return new Gson().toJson(this);
    }
}
